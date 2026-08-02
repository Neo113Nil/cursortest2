package ru.ok.gl.objects;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* loaded from: classes9.dex */
public abstract class GLProgram {
    public static final String FRAGMENT_SHADER_UNI_COLOR_MATRIX = "colorMatrix";
    public static final String FRAGMENT_SHADER_UNI_TEXTURE_ALPHA = "texAlpha";
    public static final String FRAGMENT_SHADER_UNI_TEXTURE_SAMPLER = "sTexture";
    private static final String LOG_TAG = "GLProgram";
    public static final String SHADER_VAR_TEXTURE_COORDINATES = "vTextureCoord";
    public static final String VERTEX_SHADER_ATTR_TEXTURE_COORDINATES = "aTextureCoord";
    public static final String VERTEX_SHADER_ATTR_VERTEXT_COORDINATES = "aVertexCoord";
    public static final String VERTEX_SHADER_UNI_MVP_MATRIX = "mvpMatrix";
    public static final String VERTEX_SHADER_UNI_TEXTURE_MATRIX = "texMatrix";
    private final int aTextureCoordLoc;
    private final int aVertexCoordLoc;
    private float alpha;
    private final int alphaLocation;
    private HashMap<Integer, Object> customParams;
    private int firstFreeTexture;
    private GLFrame frame;
    private float[] mvpMat;
    private final int mvpMatrixLoc;
    protected final int programId;
    private float[] texMat;
    private final int texMatrixLoc;
    private int textureId;
    private final int textureLocation;

    public GLProgram(@NonNull String str, @NonNull String str2) {
        this(str, str2, true);
    }

    public abstract int getTarget();

    public int getTextureCoordLoc() {
        return this.aTextureCoordLoc;
    }

    public int getVertexCoordLoc() {
        return this.aVertexCoordLoc;
    }

    public int registerTexture(int i, int i2, String str) {
        GLES20.glActiveTexture(this.firstFreeTexture + 33984);
        GlUtil.checkGlError("glActiveTexture " + str);
        GLES20.glBindTexture(i, i2);
        GlUtil.checkGlError("glBindTexture " + str);
        int i3 = this.firstFreeTexture;
        this.firstFreeTexture = i3 + 1;
        return i3;
    }

    public void release() {
        this.frame.release();
        GLES20.glDeleteProgram(this.programId);
    }

    public void render() {
        use();
        this.frame.draw();
        unUse();
    }

    public void setCustomParameter(String str, float f) {
        this.customParams.put(Integer.valueOf(GLES20.glGetUniformLocation(this.programId, str)), Float.valueOf(f));
    }

    public void setMVPMat(float[] fArr) {
        this.mvpMat = fArr;
    }

    public void setTexMat(float[] fArr) {
        this.texMat = fArr;
    }

    public void setTextureAlpha(float f) {
        this.alpha = f;
    }

    public void setTextureId(int i) {
        this.textureId = i;
    }

    public void unUse() {
        GLES20.glUseProgram(0);
        GlUtil.checkGlError("glUseProgram");
    }

    public void use() {
        this.firstFreeTexture = 0;
        if (this.mvpMat == null) {
            float[] fArr = new float[16];
            this.mvpMat = fArr;
            Matrix.setIdentityM(fArr, 0);
        }
        if (this.texMat == null) {
            float[] fArr2 = new float[16];
            this.texMat = fArr2;
            Matrix.setIdentityM(fArr2, 0);
        }
        GLES20.glUseProgram(this.programId);
        GlUtil.checkGlError("glUseProgram");
        GLES20.glUniformMatrix4fv(this.mvpMatrixLoc, 1, false, this.mvpMat, 0);
        GlUtil.checkGlError("glUniformMatrix4fv");
        GLES20.glUniformMatrix4fv(this.texMatrixLoc, 1, false, this.texMat, 0);
        GlUtil.checkGlError("glUniformMatrix4fv");
        GLES20.glUniform1i(this.textureLocation, registerTexture(getTarget(), this.textureId, "textureId"));
        GlUtil.checkGlError("glUniform1i");
        GLES20.glUniform1f(this.alphaLocation, this.alpha);
        GlUtil.checkGlError("glUniform1f");
        for (Integer num : this.customParams.keySet()) {
            int intValue = num.intValue();
            Object orDefault = this.customParams.getOrDefault(num, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            if (orDefault instanceof Float) {
                GLES20.glUniform1f(intValue, ((Float) orDefault).floatValue());
            } else if (orDefault instanceof Integer) {
                GLES20.glUniform1i(intValue, ((Integer) orDefault).intValue());
            }
        }
        GlUtil.checkGlError("set custom");
    }

    public GLProgram(@NonNull String str, @NonNull String str2, boolean z) {
        this.alpha = 1.0f;
        this.customParams = new HashMap<>();
        int loadShader = GlUtil.loadShader(35633, str);
        if (loadShader == 0) {
            throw new RuntimeException("Failed to load vertex shader");
        }
        int loadShader2 = GlUtil.loadShader(35632, str2);
        if (loadShader2 == 0) {
            throw new RuntimeException("Failed to load fragment shader");
        }
        int glCreateProgram = GLES20.glCreateProgram();
        this.programId = glCreateProgram;
        GlUtil.checkGlError("glCreateProgram");
        GLES20.glAttachShader(glCreateProgram, loadShader);
        GlUtil.checkGlError("glAttachShader");
        GLES20.glDeleteShader(loadShader);
        GlUtil.checkGlError("glDeleteShader");
        GLES20.glAttachShader(glCreateProgram, loadShader2);
        GlUtil.checkGlError("glAttachShader");
        GLES20.glDeleteShader(loadShader2);
        GlUtil.checkGlError("glDeleteShader");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            Log.e(LOG_TAG, "Could not link program: ");
            Log.e(LOG_TAG, GLES20.glGetProgramInfoLog(glCreateProgram));
            GLES20.glDeleteProgram(glCreateProgram);
            throw new RuntimeException("create program failed");
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(glCreateProgram, VERTEX_SHADER_ATTR_VERTEXT_COORDINATES);
        this.aVertexCoordLoc = glGetAttribLocation;
        GlUtil.checkLocationInProgram(glGetAttribLocation, VERTEX_SHADER_ATTR_VERTEXT_COORDINATES);
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(glCreateProgram, VERTEX_SHADER_ATTR_TEXTURE_COORDINATES);
        this.aTextureCoordLoc = glGetAttribLocation2;
        GlUtil.checkLocationInProgram(glGetAttribLocation2, VERTEX_SHADER_ATTR_TEXTURE_COORDINATES);
        int glGetUniformLocation = GLES20.glGetUniformLocation(glCreateProgram, VERTEX_SHADER_UNI_MVP_MATRIX);
        this.mvpMatrixLoc = glGetUniformLocation;
        GlUtil.checkLocationInProgram(glGetUniformLocation, VERTEX_SHADER_UNI_MVP_MATRIX);
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(glCreateProgram, VERTEX_SHADER_UNI_TEXTURE_MATRIX);
        this.texMatrixLoc = glGetUniformLocation2;
        GlUtil.checkLocationInProgram(glGetUniformLocation2, VERTEX_SHADER_UNI_TEXTURE_MATRIX);
        int glGetUniformLocation3 = GLES20.glGetUniformLocation(glCreateProgram, FRAGMENT_SHADER_UNI_TEXTURE_SAMPLER);
        this.textureLocation = glGetUniformLocation3;
        this.alphaLocation = GLES20.glGetUniformLocation(glCreateProgram, FRAGMENT_SHADER_UNI_TEXTURE_ALPHA);
        if (z) {
            GlUtil.checkLocationInProgram(glGetUniformLocation3, FRAGMENT_SHADER_UNI_TEXTURE_SAMPLER);
        }
        this.frame = new GLFrame(glGetAttribLocation, glGetAttribLocation2);
    }

    public void setCustomParameter(String str, int i) {
        this.customParams.put(Integer.valueOf(GLES20.glGetUniformLocation(this.programId, str)), Integer.valueOf(i));
    }
}
