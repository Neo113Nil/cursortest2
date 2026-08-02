package xsna;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.pipeline.custom.utils.GLException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import ru.ok.gl.objects.GLProgram;

/* compiled from: GLProgram.kt */
/* loaded from: classes3.dex */
public class w1t {
    public final f100 a;
    public final String b;
    public int c;
    public float[] d;
    public float[] e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final FloatBuffer m;
    public final FloatBuffer n;

    public w1t(f100 f100Var, String str, String str2, String str3, boolean z) {
        qxm0 qxm0Var = qxm0.e;
        this.a = f100Var;
        this.b = str3;
        this.f = z ? 36197 : 3553;
        str2 = str2 == null ? "\nprecision mediump float;\nuniform mat4 mvpMatrix;\nuniform mat4 texMatrix;\nattribute vec4 aVertexCoord;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = mvpMatrix * aVertexCoord;\n    vTextureCoord = (texMatrix * aTextureCoord).xy;\n}\n" : str2;
        str = str == null ? z ? String.format("%s\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform %s sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n", Arrays.copyOf(new Object[]{"#extension GL_OES_EGL_image_external : require", "samplerExternalOES"}, 2)) : String.format("%s\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform %s sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n", Arrays.copyOf(new Object[]{"", "sampler2D"}, 2)) : str;
        int q = qxm0Var.q(35633, str2);
        try {
            int q2 = qxm0Var.q(35632, str);
            int glCreateProgram = GLES20.glCreateProgram();
            GLException m = qxm0.m();
            if (m != null) {
                GLES20.glDeleteShader(q2);
                GLES20.glDeleteShader(q);
                s3q0 s3q0Var = s3q0.a;
                throw m;
            }
            GLES20.glAttachShader(glCreateProgram, q);
            GLException m2 = qxm0.m();
            if (m2 != null) {
                GLES20.glDeleteShader(q2);
                GLES20.glDeleteShader(q);
                GLES20.glDeleteProgram(glCreateProgram);
                s3q0 s3q0Var2 = s3q0.a;
                throw m2;
            }
            GLES20.glDeleteShader(q);
            GLES20.glAttachShader(glCreateProgram, q2);
            GLException m3 = qxm0.m();
            if (m3 != null) {
                GLES20.glDeleteShader(q2);
                GLES20.glDeleteProgram(glCreateProgram);
                s3q0 s3q0Var3 = s3q0.a;
                throw m3;
            }
            GLES20.glDeleteShader(q2);
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
                GLES20.glDeleteProgram(glCreateProgram);
                throw new GLException(go9.b("Program linking failed, ", glGetProgramInfoLog));
            }
            this.g = glCreateProgram;
            try {
                this.h = b(GLProgram.FRAGMENT_SHADER_UNI_TEXTURE_SAMPLER);
                this.i = b(GLProgram.VERTEX_SHADER_UNI_MVP_MATRIX);
                this.j = b(GLProgram.VERTEX_SHADER_UNI_TEXTURE_MATRIX);
                this.k = a(GLProgram.VERTEX_SHADER_ATTR_VERTEXT_COORDINATES);
                this.l = a(GLProgram.VERTEX_SHADER_ATTR_TEXTURE_COORDINATES);
                FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                asFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
                asFloatBuffer.flip();
                this.m = asFloatBuffer;
                float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, 1.0f};
                FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                asFloatBuffer2.put(fArr);
                asFloatBuffer2.flip();
                this.n = asFloatBuffer2;
            } catch (GLException e) {
                int i = this.g;
                f100 f100Var2 = this.a;
                GLES20.glDeleteProgram(i);
                qxm0.e(qxm0Var, f100Var2, 2);
                throw e;
            }
        } catch (GLException e2) {
            GLES20.glDeleteShader(q);
            throw e2;
        }
    }

    public final int a(String str) {
        qxm0 qxm0Var = qxm0.e;
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.g, str);
        Integer valueOf = Integer.valueOf(glGetAttribLocation);
        if (glGetAttribLocation < 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            throw new GLException("glGetAttribLocation failed, name=".concat(str));
        }
        int intValue = valueOf.intValue();
        qxm0.e(qxm0Var, null, 3);
        return intValue;
    }

    public final int b(String str) {
        qxm0 qxm0Var = qxm0.e;
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.g, str);
        Integer valueOf = Integer.valueOf(glGetUniformLocation);
        if (glGetUniformLocation < 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            throw new GLException("glGetUniformLocation failed, name=".concat(str));
        }
        int intValue = valueOf.intValue();
        qxm0.e(qxm0Var, null, 3);
        return intValue;
    }

    public final void c() {
        f100 f100Var = this.a;
        if (f100Var != null) {
            f100Var.v(this.b, "release gl program");
        }
        qxm0 qxm0Var = qxm0.e;
        GLES20.glDeleteProgram(this.g);
        qxm0.e(qxm0Var, f100Var, 2);
    }

    public final void d() {
        e();
        qxm0 qxm0Var = qxm0.e;
        int i = this.k;
        GLES20.glEnableVertexAttribArray(i);
        qxm0.e(qxm0Var, null, 3);
        int i2 = this.l;
        GLES20.glEnableVertexAttribArray(i2);
        qxm0.e(qxm0Var, null, 3);
        GLES20.glVertexAttribPointer(i, 2, 5126, false, 8, (Buffer) this.m);
        qxm0.e(qxm0Var, null, 3);
        GLES20.glVertexAttribPointer(i2, 2, 5126, false, 8, (Buffer) this.n);
        qxm0.e(qxm0Var, null, 3);
        GLES20.glDrawArrays(5, 0, 4);
        qxm0.e(qxm0Var, null, 3);
        GLES20.glDisableVertexAttribArray(i2);
        qxm0.e(qxm0Var, null, 3);
        GLES20.glDisableVertexAttribArray(i);
        qxm0.e(qxm0Var, null, 3);
        GLES20.glUseProgram(0);
        qxm0.e(qxm0Var, null, 3);
    }

    public void e() {
        float[] fArr = this.d;
        if (fArr == null) {
            fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            this.d = fArr;
        }
        float[] fArr2 = this.e;
        if (fArr2 == null) {
            fArr2 = new float[16];
            Matrix.setIdentityM(fArr2, 0);
            this.e = fArr2;
        }
        qxm0 qxm0Var = qxm0.e;
        GLES20.glUseProgram(this.g);
        qxm0.e(qxm0Var, null, 3);
        GLES20.glUniformMatrix4fv(this.i, 1, false, fArr, 0);
        qxm0.e(qxm0Var, null, 3);
        GLES20.glUniformMatrix4fv(this.j, 1, false, fArr2, 0);
        qxm0.e(qxm0Var, null, 3);
        GLES20.glUniform1i(this.h, 0);
        qxm0.e(qxm0Var, null, 3);
        GLES20.glActiveTexture(33984);
        qxm0.e(qxm0Var, null, 3);
        int i = this.c;
        int i2 = this.f;
        GLES20.glBindTexture(i2, i);
        qxm0.e(qxm0Var, null, 3);
        GLES20.glTexParameteri(i2, 10241, 9729);
        qxm0.e(qxm0Var, null, 3);
        GLES20.glTexParameteri(i2, 10240, 9729);
        qxm0.e(qxm0Var, null, 3);
        GLES20.glTexParameteri(i2, 10242, 33071);
        qxm0.e(qxm0Var, null, 3);
        GLES20.glTexParameteri(i2, 10243, 33071);
        qxm0.e(qxm0Var, null, 3);
    }

    public /* synthetic */ w1t(f100 f100Var, boolean z, int i) {
        this(f100Var, null, null, "GlProgram", (i & 16) != 0 ? false : z);
    }
}
