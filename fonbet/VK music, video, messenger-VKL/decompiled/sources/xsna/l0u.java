package xsna;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.pipeline.gl.GlException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import ru.ok.gl.objects.GLProgram;

/* compiled from: GlProgram.kt */
/* loaded from: classes3.dex */
public class l0u {
    public static final float[] o;
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

    static {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        o = fArr;
    }

    public l0u(f100 f100Var, String str, String str2, String str3, boolean z) {
        wwf0 wwf0Var = wwf0.c;
        this.a = f100Var;
        this.b = str3;
        this.f = z ? 36197 : 3553;
        str2 = str2 == null ? "\nprecision mediump float;\nuniform mat4 mvpMatrix;\nuniform mat4 texMatrix;\nattribute vec4 aVertexCoord;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = mvpMatrix * aVertexCoord;\n    vTextureCoord = (texMatrix * aTextureCoord).xy;\n}\n" : str2;
        str = str == null ? z ? String.format("%s\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform %s sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n", Arrays.copyOf(new Object[]{"#extension GL_OES_EGL_image_external : require", "samplerExternalOES"}, 2)) : String.format("%s\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform %s sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n", Arrays.copyOf(new Object[]{"", "sampler2D"}, 2)) : str;
        int v = wwf0Var.v(35633, str2);
        try {
            int v2 = wwf0Var.v(35632, str);
            int glCreateProgram = GLES20.glCreateProgram();
            GlException r = wwf0.r();
            if (r != null) {
                GLES20.glDeleteShader(v2);
                GLES20.glDeleteShader(v);
                throw r;
            }
            GLES20.glAttachShader(glCreateProgram, v);
            GlException r2 = wwf0.r();
            if (r2 != null) {
                GLES20.glDeleteShader(v2);
                GLES20.glDeleteShader(v);
                GLES20.glDeleteProgram(glCreateProgram);
                throw r2;
            }
            GLES20.glDeleteShader(v);
            GLES20.glAttachShader(glCreateProgram, v2);
            GlException r3 = wwf0.r();
            if (r3 != null) {
                GLES20.glDeleteShader(v2);
                GLES20.glDeleteProgram(glCreateProgram);
                throw r3;
            }
            GLES20.glDeleteShader(v2);
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
                GLES20.glDeleteProgram(glCreateProgram);
                throw new GlException(go9.b("Program linking failed, ", glGetProgramInfoLog));
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
            } catch (GlException e) {
                int i = this.g;
                f100 f100Var2 = this.a;
                GLES20.glDeleteProgram(i);
                wwf0.o(wwf0Var, f100Var2, 2);
                throw e;
            }
        } catch (GlException e2) {
            GLES20.glDeleteShader(v);
            throw e2;
        }
    }

    public final int a(String str) {
        wwf0 wwf0Var = wwf0.c;
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.g, str);
        Integer valueOf = Integer.valueOf(glGetAttribLocation);
        if (glGetAttribLocation < 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            throw new GlException("glGetAttribLocation failed, name=".concat(str));
        }
        int intValue = valueOf.intValue();
        wwf0.o(wwf0Var, null, 3);
        return intValue;
    }

    public final int b(String str) {
        wwf0 wwf0Var = wwf0.c;
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.g, str);
        Integer valueOf = Integer.valueOf(glGetUniformLocation);
        if (glGetUniformLocation < 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            throw new GlException("glGetUniformLocation failed, name=".concat(str));
        }
        int intValue = valueOf.intValue();
        wwf0.o(wwf0Var, null, 3);
        return intValue;
    }

    public final void c() {
        f100 f100Var = this.a;
        if (f100Var != null) {
            f100Var.v(this.b, "release gl program");
        }
        wwf0 wwf0Var = wwf0.c;
        GLES20.glDeleteProgram(this.g);
        wwf0.o(wwf0Var, f100Var, 2);
    }

    public final void d() {
        e();
        wwf0 wwf0Var = wwf0.c;
        int i = this.k;
        GLES20.glEnableVertexAttribArray(i);
        wwf0.o(wwf0Var, null, 3);
        int i2 = this.l;
        GLES20.glEnableVertexAttribArray(i2);
        wwf0.o(wwf0Var, null, 3);
        GLES20.glVertexAttribPointer(i, 2, 5126, false, 8, (Buffer) this.m);
        wwf0.o(wwf0Var, null, 3);
        GLES20.glVertexAttribPointer(i2, 2, 5126, false, 8, (Buffer) this.n);
        wwf0.o(wwf0Var, null, 3);
        GLES20.glDrawArrays(5, 0, 4);
        wwf0.o(wwf0Var, null, 3);
        GLES20.glDisableVertexAttribArray(i2);
        wwf0.o(wwf0Var, null, 3);
        GLES20.glDisableVertexAttribArray(i);
        wwf0.o(wwf0Var, null, 3);
        GLES20.glUseProgram(0);
        wwf0.o(wwf0Var, null, 3);
    }

    public void e() {
        float[] fArr = this.d;
        float[] fArr2 = o;
        if (fArr == null) {
            fArr = fArr2;
        }
        float[] fArr3 = this.e;
        if (fArr3 != null) {
            fArr2 = fArr3;
        }
        wwf0 wwf0Var = wwf0.c;
        GLES20.glUseProgram(this.g);
        wwf0.o(wwf0Var, null, 3);
        GLES20.glUniformMatrix4fv(this.i, 1, false, fArr, 0);
        wwf0.o(wwf0Var, null, 3);
        GLES20.glUniformMatrix4fv(this.j, 1, false, fArr2, 0);
        wwf0.o(wwf0Var, null, 3);
        GLES20.glUniform1i(this.h, 0);
        wwf0.o(wwf0Var, null, 3);
        GLES20.glActiveTexture(33984);
        wwf0.o(wwf0Var, null, 3);
        wwf0Var.n(this.f, this.c);
    }

    public /* synthetic */ l0u(f100 f100Var) {
        this(f100Var, null, null, "GlProgram", false);
    }
}
