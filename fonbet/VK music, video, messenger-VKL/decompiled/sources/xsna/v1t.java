package xsna;

import android.opengl.GLES20;
import android.util.Log;
import one.video.gl.GLESUtils;
import ru.ok.gl.objects.GLProgram;

/* compiled from: GLProgram.kt */
/* loaded from: classes8.dex */
public abstract class v1t {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public float[] f;
    public float[] g;
    public final int h;
    public int i;

    public v1t(String str) {
        int d = GLESUtils.d(35633, "precision mediump float;\nuniform mat4 mvpMatrix;\nuniform mat4 texMatrix;\nattribute vec4 aVertexCoord;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = mvpMatrix * aVertexCoord;\n    vTextureCoord = (texMatrix * aTextureCoord).xy;\n}\n");
        int d2 = GLESUtils.d(35632, str);
        int glCreateProgram = GLES20.glCreateProgram();
        GLESUtils.c("glCreateProgram", new int[0]);
        this.a = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, d);
        GLESUtils.c("glAttachShader", new int[0]);
        GLES20.glDeleteShader(d);
        GLESUtils.c("glDeleteShader", new int[0]);
        GLES20.glAttachShader(glCreateProgram, d2);
        GLESUtils.c("glAttachShader", new int[0]);
        GLES20.glDeleteShader(d2);
        GLESUtils.c("glDeleteShader", new int[0]);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            String str2 = "Could not link program: " + GLES20.glGetProgramInfoLog(glCreateProgram);
            Log.e("GLESUtils", str2);
            throw new RuntimeException(str2);
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(glCreateProgram, GLProgram.VERTEX_SHADER_ATTR_VERTEXT_COORDINATES);
        if (glGetAttribLocation < 0) {
            Log.e("GLESUtils", "Unable to locate 'aVertexCoord' in program");
            throw new RuntimeException("Unable to locate 'aVertexCoord' in program");
        }
        this.b = glGetAttribLocation;
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(glCreateProgram, GLProgram.VERTEX_SHADER_ATTR_TEXTURE_COORDINATES);
        if (glGetAttribLocation2 < 0) {
            Log.e("GLESUtils", "Unable to locate 'aTextureCoord' in program");
            throw new RuntimeException("Unable to locate 'aTextureCoord' in program");
        }
        this.c = glGetAttribLocation2;
        this.d = b(GLProgram.VERTEX_SHADER_UNI_MVP_MATRIX);
        this.e = b(GLProgram.VERTEX_SHADER_UNI_TEXTURE_MATRIX);
        this.h = b(GLProgram.FRAGMENT_SHADER_UNI_TEXTURE_SAMPLER);
    }

    public abstract int a();

    public final int b(String str) {
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.a, str);
        if (glGetUniformLocation >= 0) {
            return glGetUniformLocation;
        }
        String str2 = "Unable to locate '" + str + "' in program";
        Log.e("GLESUtils", str2);
        throw new RuntimeException(str2);
    }
}
