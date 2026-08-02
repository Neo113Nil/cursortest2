package xsna;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import android.view.Surface;
import one.video.gl.GLESUtils;
import ru.ok.gl.objects.GLProgram;

/* compiled from: OutputSurface.java */
/* loaded from: classes8.dex */
public final class q190 implements SurfaceTexture.OnFrameAvailableListener {
    public SurfaceTexture b;
    public Surface c;
    public final Object d = new Object();
    public boolean e;
    public joo0 f;

    /* JADX WARN: Removed duplicated region for block: B:25:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q190() {
        int b;
        int glCreateProgram;
        joo0 joo0Var = new joo0();
        this.f = joo0Var;
        int b2 = joo0.b(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
        if (b2 != 0 && (b = joo0.b(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n")) != 0) {
            glCreateProgram = GLES20.glCreateProgram();
            joo0.a("glCreateProgram");
            if (glCreateProgram == 0) {
                Log.e("TextureRender", "Could not create program");
            }
            GLES20.glAttachShader(glCreateProgram, b2);
            joo0.a("glAttachShader");
            GLES20.glAttachShader(glCreateProgram, b);
            joo0.a("glAttachShader");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                Log.e("TextureRender", "Could not link program: ");
                Log.e("TextureRender", GLES20.glGetProgramInfoLog(glCreateProgram));
                GLES20.glDeleteProgram(glCreateProgram);
            }
            joo0Var.d = glCreateProgram;
            if (glCreateProgram != 0) {
                throw new RuntimeException("failed creating program");
            }
            joo0Var.h = GLES20.glGetAttribLocation(glCreateProgram, "aPosition");
            joo0.a("glGetAttribLocation aPosition");
            if (joo0Var.h == -1) {
                throw new RuntimeException("Could not get attrib location for aPosition");
            }
            joo0Var.i = GLES20.glGetAttribLocation(joo0Var.d, GLProgram.VERTEX_SHADER_ATTR_TEXTURE_COORDINATES);
            joo0.a("glGetAttribLocation aTextureCoord");
            if (joo0Var.i == -1) {
                throw new RuntimeException("Could not get attrib location for aTextureCoord");
            }
            joo0Var.f = GLES20.glGetUniformLocation(joo0Var.d, "uMVPMatrix");
            joo0.a("glGetUniformLocation uMVPMatrix");
            if (joo0Var.f == -1) {
                throw new RuntimeException("Could not get attrib location for uMVPMatrix");
            }
            joo0Var.g = GLES20.glGetUniformLocation(joo0Var.d, "uSTMatrix");
            joo0.a("glGetUniformLocation uSTMatrix");
            if (joo0Var.g == -1) {
                throw new RuntimeException("Could not get attrib location for uSTMatrix");
            }
            int[] iArr2 = new int[1];
            GLES20.glGenTextures(1, iArr2, 0);
            GLESUtils.c("glGenTextures", new int[0]);
            int i = iArr2[0];
            GLESUtils.b(36197, i);
            GLESUtils.e(36197);
            GLESUtils.b(36197, 0);
            joo0Var.e = i;
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f.e);
            this.b = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this);
            this.c = new Surface(this.b);
            return;
        }
        glCreateProgram = 0;
        joo0Var.d = glCreateProgram;
        if (glCreateProgram != 0) {
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.d) {
            try {
                if (this.e) {
                    throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
                }
                this.e = true;
                this.d.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
