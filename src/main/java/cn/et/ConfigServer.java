package cn.et;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 客户端，微服务
 */
@SpringBootApplication
@RestController
public class ConfigServer {
	
	@Value("${url}")
	private String url;
	
	@RequestMapping("/tttt")
	public String hello() {
		return url;
	}

	
	/**
	 * 先启动配置中心那个项目再启动这个客户端微服务
	 * 
	 * 一个微服务可以启动多个
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConfigServer.class,args);
	}
}
