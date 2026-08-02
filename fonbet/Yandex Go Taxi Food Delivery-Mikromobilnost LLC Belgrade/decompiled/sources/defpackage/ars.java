package defpackage;

import android.opengl.GLES20;
import androidx.camera.core.processing.util.GLUtils$InputFormat;
import java.nio.Buffer;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class ars extends zqs {
    public final int e;
    public final int f;
    public final int g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ars(q8n q8nVar, xqs xqsVar) {
        super(r3, r4);
        String str;
        String str2 = q8nVar.a() ? brs.d : brs.c;
        try {
            switch (xqsVar.a) {
                case 0:
                    Locale locale = Locale.US;
                    str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(sTexture, vTextureCoord);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n";
                    break;
                case 1:
                    Locale locale2 = Locale.US;
                    str = "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(sTexture, vTextureCoord);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}";
                    break;
                default:
                    Locale locale3 = Locale.US;
                    str = "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}";
                    break;
            }
            if (!str.contains("vTextureCoord") || !str.contains("sTexture")) {
                throw new IllegalArgumentException("Invalid fragment shader");
            }
            this.e = -1;
            this.f = -1;
            this.g = -1;
            a();
            int i = this.a;
            int glGetUniformLocation = GLES20.glGetUniformLocation(i, "sTexture");
            this.e = glGetUniformLocation;
            brs.e(glGetUniformLocation, "sTexture");
            int glGetAttribLocation = GLES20.glGetAttribLocation(i, "aTextureCoord");
            this.g = glGetAttribLocation;
            brs.e(glGetAttribLocation, "aTextureCoord");
            int glGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uTexMatrix");
            this.f = glGetUniformLocation2;
            brs.e(glGetUniformLocation2, "uTexMatrix");
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            yci0.p("Unable retrieve fragment shader source", th);
            throw null;
        }
    }

    @Override // defpackage.zqs
    public final void b() {
        super.b();
        GLES20.glUniform1i(this.e, 0);
        GLES20.glEnableVertexAttribArray(this.g);
        brs.b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.g, 2, 5126, false, 0, (Buffer) brs.i);
        brs.b("glVertexAttribPointer");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ars(q8n q8nVar, GLUtils$InputFormat gLUtils$InputFormat) {
        this(q8nVar, r5);
        xqs xqsVar;
        if (q8nVar.a()) {
            d6z.m("No default sampler shader available for" + gLUtils$InputFormat, gLUtils$InputFormat != GLUtils$InputFormat.UNKNOWN);
            if (gLUtils$InputFormat == GLUtils$InputFormat.YUV) {
                xqsVar = brs.g;
            } else {
                xqsVar = brs.f;
            }
        } else {
            xqsVar = brs.e;
        }
    }
}
