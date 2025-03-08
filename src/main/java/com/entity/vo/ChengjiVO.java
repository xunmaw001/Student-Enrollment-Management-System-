package com.entity.vo;

import com.entity.ChengjiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 成绩信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("chengji")
public class ChengjiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 成绩标题
     */

    @TableField(value = "chengji_name")
    private String chengjiName;


    /**
     * 学科类型
     */

    @TableField(value = "chengji_types")
    private Integer chengjiTypes;


    /**
     * 学生
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 成绩
     */

    @TableField(value = "chengji")
    private Integer chengji;


    /**
     * 成绩下载
     */

    @TableField(value = "chengji_file")
    private String chengjiFile;


    /**
     * 成绩详情
     */

    @TableField(value = "chengji_content")
    private String chengjiContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：成绩标题
	 */
    public String getChengjiName() {
        return chengjiName;
    }


    /**
	 * 获取：成绩标题
	 */

    public void setChengjiName(String chengjiName) {
        this.chengjiName = chengjiName;
    }
    /**
	 * 设置：学科类型
	 */
    public Integer getChengjiTypes() {
        return chengjiTypes;
    }


    /**
	 * 获取：学科类型
	 */

    public void setChengjiTypes(Integer chengjiTypes) {
        this.chengjiTypes = chengjiTypes;
    }
    /**
	 * 设置：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：成绩
	 */
    public Integer getChengji() {
        return chengji;
    }


    /**
	 * 获取：成绩
	 */

    public void setChengji(Integer chengji) {
        this.chengji = chengji;
    }
    /**
	 * 设置：成绩下载
	 */
    public String getChengjiFile() {
        return chengjiFile;
    }


    /**
	 * 获取：成绩下载
	 */

    public void setChengjiFile(String chengjiFile) {
        this.chengjiFile = chengjiFile;
    }
    /**
	 * 设置：成绩详情
	 */
    public String getChengjiContent() {
        return chengjiContent;
    }


    /**
	 * 获取：成绩详情
	 */

    public void setChengjiContent(String chengjiContent) {
        this.chengjiContent = chengjiContent;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
