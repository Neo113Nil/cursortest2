package ru.ok.call_effects.internal.gl;

import android.opengl.GLES20;
import com.unity3d.services.UnityAdsConstants;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import ru.ok.gl.objects.GLProgram;
import xsna.h5s;

/* loaded from: classes9.dex */
public class EglTexture {
    private static final String FRAGMENT_SHADER_2D = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    private static final String FRAGMENT_SHADER_2D_YUV = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D y_texture;\nuniform sampler2D uv_texture;\nvoid main() {\n\tfloat r, g, b, y, u, v;\n\ty = texture2D(y_texture, vTextureCoord).r;\n\tu = texture2D(uv_texture, vTextureCoord).a - 0.5;\n\tv = texture2D(uv_texture, vTextureCoord).r - 0.5;\n\tr = y + 1.403 * v;\n\tg = y - 0.344 * u - 0.714 * v;\n\tb = y + 1.773 * u;\n\tgl_FragColor = vec4(r, g, b, 1.0);\n}\n";
    private static final String FRAGMENT_SHADER_EXT = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    private static final String FRAGMENT_SHADER_EXT_BW = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    vec4 tc = texture2D(sTexture, vTextureCoord);\n    float color = tc.r * 0.3 + tc.g * 0.59 + tc.b * 0.11;\n    gl_FragColor = vec4(color, color, color, 1.0);\n}\n";
    private static final String FRAGMENT_SHADER_EXT_FILT = "#extension GL_OES_EGL_image_external : require\n#define KERNEL_SIZE 9\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uKernel[KERNEL_SIZE];\nuniform vec2 uTexOffset[KERNEL_SIZE];\nuniform float uColorAdjust;\nvoid main() {\n    int i = 0;\n    vec4 sum = vec4(0.0);\n    if (vTextureCoord.x < vTextureCoord.y - 0.005) {\n        for (i = 0; i < KERNEL_SIZE; i++) {\n            vec4 texc = texture2D(sTexture, vTextureCoord + uTexOffset[i]);\n            sum += texc * uKernel[i];\n        }\n    sum += uColorAdjust;\n    } else if (vTextureCoord.x > vTextureCoord.y + 0.005) {\n        sum = texture2D(sTexture, vTextureCoord);\n    } else {\n        sum.r = 1.0;\n    }\n    gl_FragColor = sum;\n}\n";
    public static final int KERNEL_SIZE = 9;
    private static final String TAG = EglUtils.TAG;
    private static final String VERTEX_SHADER = "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
    private float mColorAdjust;
    private float[] mKernel = new float[9];
    protected int maPositionLoc;
    protected int maTextureCoordLoc;
    private int msTextureHandle;
    private int muColorAdjustLoc;
    private int muKernelLoc;
    protected int muMVPMatrixLoc;
    protected int muTexMatrixLoc;
    private int muTexOffsetLoc;
    private int programHandle;
    private ProgramType programType;
    private float[] texOffset;
    private int textureTarget;

    /* renamed from: ru.ok.call_effects.internal.gl.EglTexture$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ru$ok$call_effects$internal$gl$EglTexture$ProgramType;

        static {
            int[] iArr = new int[ProgramType.values().length];
            $SwitchMap$ru$ok$call_effects$internal$gl$EglTexture$ProgramType = iArr;
            try {
                iArr[ProgramType.TEXTURE_2D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ru$ok$call_effects$internal$gl$EglTexture$ProgramType[ProgramType.TEXTURE_EXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ru$ok$call_effects$internal$gl$EglTexture$ProgramType[ProgramType.TEXTURE_EXT_BW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ru$ok$call_effects$internal$gl$EglTexture$ProgramType[ProgramType.TEXTURE_EXT_FILT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ru$ok$call_effects$internal$gl$EglTexture$ProgramType[ProgramType.TEXTURE_2D_YUV.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum ProgramType {
        TEXTURE_2D,
        TEXTURE_2D_YUV,
        TEXTURE_EXT,
        TEXTURE_EXT_BW,
        TEXTURE_EXT_FILT
    }

    public EglTexture(ProgramType programType) {
        initialize(programType);
    }

    public int createTextureObject() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        EglUtils.checkGlError("glGenTextures");
        int i = iArr[0];
        GLES20.glBindTexture(this.textureTarget, i);
        EglUtils.checkGlError("glBindTexture " + i);
        int i2 = this.textureTarget;
        GLES20.glTexParameteri(i2, 10241, i2 == 36197 ? 9728 : 9729);
        GLES20.glTexParameteri(this.textureTarget, 10240, 9729);
        GLES20.glTexParameteri(this.textureTarget, 10242, 33071);
        GLES20.glTexParameteri(this.textureTarget, 10243, 33071);
        this.msTextureHandle = GLES20.glGetUniformLocation(this.programHandle, GLProgram.FRAGMENT_SHADER_UNI_TEXTURE_SAMPLER);
        EglUtils.checkGlError("glTexParameter");
        return i;
    }

    public void draw(float[] fArr, FloatBuffer floatBuffer, int i, int i2, int i3, int i4, float[] fArr2, FloatBuffer floatBuffer2, int i5, int i6) {
        EglUtils.checkGlError("draw start");
        GLES20.glUseProgram(this.programHandle);
        EglUtils.checkGlError("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(this.textureTarget, i5);
        GLES20.glUniformMatrix4fv(this.muMVPMatrixLoc, 1, false, fArr, 0);
        EglUtils.checkGlError("glUniformMatrix4fv");
        GLES20.glUniformMatrix4fv(this.muTexMatrixLoc, 1, false, fArr2, 0);
        EglUtils.checkGlError("glUniformMatrix4fv");
        GLES20.glEnableVertexAttribArray(this.maPositionLoc);
        EglUtils.checkGlError("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.maPositionLoc, i3, 5126, false, i4, (Buffer) floatBuffer);
        EglUtils.checkGlError("glVertexAttribPointer");
        GLES20.glEnableVertexAttribArray(this.maTextureCoordLoc);
        EglUtils.checkGlError("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.maTextureCoordLoc, 2, 5126, false, i6, (Buffer) floatBuffer2);
        EglUtils.checkGlError("glVertexAttribPointer");
        int i7 = this.muKernelLoc;
        if (i7 >= 0) {
            GLES20.glUniform1fv(i7, 9, this.mKernel, 0);
            GLES20.glUniform2fv(this.muTexOffsetLoc, 9, this.texOffset, 0);
            GLES20.glUniform1f(this.muColorAdjustLoc, this.mColorAdjust);
        }
        GLES20.glDrawArrays(5, i, i2);
        EglUtils.checkGlError("glDrawArrays");
        GLES20.glDisableVertexAttribArray(this.maPositionLoc);
        GLES20.glDisableVertexAttribArray(this.maTextureCoordLoc);
        GLES20.glBindTexture(this.textureTarget, 0);
        GLES20.glUseProgram(0);
    }

    public void drawPixels(float[] fArr, FloatBuffer floatBuffer, int i, int i2, int i3, int i4, float[] fArr2, FloatBuffer floatBuffer2, int i5, int i6, int i7, int i8, Buffer buffer) {
        EglUtils.checkGlError("draw start");
        GLES20.glUseProgram(this.programHandle);
        EglUtils.checkGlError("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(this.textureTarget, i5);
        GLES20.glUniformMatrix4fv(this.muMVPMatrixLoc, 1, false, fArr, 0);
        EglUtils.checkGlError("glUniformMatrix4fv");
        GLES20.glUniformMatrix4fv(this.muTexMatrixLoc, 1, false, fArr2, 0);
        EglUtils.checkGlError("glUniformMatrix4fv");
        GLES20.glEnableVertexAttribArray(this.maPositionLoc);
        EglUtils.checkGlError("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.maPositionLoc, i3, 5126, false, i4, (Buffer) floatBuffer);
        EglUtils.checkGlError("glVertexAttribPointer");
        GLES20.glEnableVertexAttribArray(this.maTextureCoordLoc);
        EglUtils.checkGlError("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.maTextureCoordLoc, 2, 5126, false, i6, (Buffer) floatBuffer2);
        EglUtils.checkGlError("glVertexAttribPointer");
        int i9 = this.muKernelLoc;
        if (i9 >= 0) {
            GLES20.glUniform1fv(i9, 9, this.mKernel, 0);
            GLES20.glUniform2fv(this.muTexOffsetLoc, 9, this.texOffset, 0);
            GLES20.glUniform1f(this.muColorAdjustLoc, this.mColorAdjust);
        }
        if (this.textureTarget == 3553) {
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(this.textureTarget, i5);
            GLES20.glTexImage2D(this.textureTarget, 0, 6408, i7, i8, 0, 6408, 5121, buffer);
            GLES20.glUniform1i(this.msTextureHandle, 1);
            EglUtils.checkGlError("glTexImage2D");
        }
        GLES20.glDrawArrays(5, i, i2);
        EglUtils.checkGlError("glDrawArrays");
        GLES20.glDisableVertexAttribArray(this.maPositionLoc);
        GLES20.glDisableVertexAttribArray(this.maTextureCoordLoc);
        GLES20.glBindTexture(this.textureTarget, 0);
        GLES20.glUseProgram(0);
    }

    public ProgramType getProgramType() {
        return this.programType;
    }

    public void initialize(ProgramType programType) {
        this.programType = programType;
        int i = AnonymousClass1.$SwitchMap$ru$ok$call_effects$internal$gl$EglTexture$ProgramType[programType.ordinal()];
        if (i == 1) {
            this.textureTarget = 3553;
            this.programHandle = EglUtils.createProgram(VERTEX_SHADER, FRAGMENT_SHADER_2D);
        } else if (i == 2) {
            this.textureTarget = 36197;
            this.programHandle = EglUtils.createProgram(VERTEX_SHADER, FRAGMENT_SHADER_EXT);
        } else if (i == 3) {
            this.textureTarget = 36197;
            this.programHandle = EglUtils.createProgram(VERTEX_SHADER, FRAGMENT_SHADER_EXT_BW);
        } else if (i == 4) {
            this.textureTarget = 36197;
            this.programHandle = EglUtils.createProgram(VERTEX_SHADER, FRAGMENT_SHADER_EXT_FILT);
        } else {
            if (i != 5) {
                throw new RuntimeException("Unhandled type " + programType);
            }
            this.textureTarget = 3553;
            this.programHandle = EglUtils.createProgram(VERTEX_SHADER, FRAGMENT_SHADER_2D_YUV);
        }
        if (this.programHandle == 0) {
            throw new RuntimeException("Unable to create program");
        }
        programType.toString();
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.programHandle, "aPosition");
        this.maPositionLoc = glGetAttribLocation;
        EglUtils.checkLocation(glGetAttribLocation, "aPosition");
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.programHandle, GLProgram.VERTEX_SHADER_ATTR_TEXTURE_COORDINATES);
        this.maTextureCoordLoc = glGetAttribLocation2;
        EglUtils.checkLocation(glGetAttribLocation2, GLProgram.VERTEX_SHADER_ATTR_TEXTURE_COORDINATES);
        this.muMVPMatrixLoc = GLES20.glGetUniformLocation(this.programHandle, "uMVPMatrix");
        this.muTexMatrixLoc = GLES20.glGetUniformLocation(this.programHandle, "uTexMatrix");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.programHandle, "uKernel");
        this.muKernelLoc = glGetUniformLocation;
        if (glGetUniformLocation < 0) {
            this.muKernelLoc = -1;
            this.muTexOffsetLoc = -1;
            this.muColorAdjustLoc = -1;
            return;
        }
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.programHandle, "uTexOffset");
        this.muTexOffsetLoc = glGetUniformLocation2;
        EglUtils.checkLocation(glGetUniformLocation2, "uTexOffset");
        int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.programHandle, "uColorAdjust");
        this.muColorAdjustLoc = glGetUniformLocation3;
        EglUtils.checkLocation(glGetUniformLocation3, "uColorAdjust");
        setKernel(new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        setTexSize(256, 256);
    }

    public int program() {
        return this.programHandle;
    }

    public void release() {
        GLES20.glDeleteProgram(this.programHandle);
        this.programHandle = -1;
    }

    public void setKernel(float[] fArr, float f) {
        if (fArr.length != 9) {
            throw new IllegalArgumentException(h5s.c(fArr.length, " vs. 9", new StringBuilder("Kernel size is ")));
        }
        System.arraycopy(fArr, 0, this.mKernel, 0, 9);
        this.mColorAdjust = f;
    }

    public void setTexSize(int i, int i2) {
        float f = 1.0f / i;
        float f2 = 1.0f / i2;
        float f3 = -f;
        float f4 = -f2;
        this.texOffset = new float[]{f3, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, f, f4, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f, f2};
    }
}
