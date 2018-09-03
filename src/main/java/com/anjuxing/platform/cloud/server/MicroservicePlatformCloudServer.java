package com.anjuxing.platform.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author xiongt
 * @Description
 */
@SpringBootApplication
@EnableEurekaServer
public class MicroservicePlatformCloudServer {

    public static void main(String [] args){
        SpringApplication.run(MicroservicePlatformCloudServer.class,args);
    }
}
