package defpackage;

import android.opengl.GLES20;
import android.util.Log;
import androidx.media3.common.util.GlUtil$GlException;

/* loaded from: classes10.dex */
public final class clf0 {
    public static final float[] i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public int a;
    public blf0 b;
    public jht c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public static boolean b(zkf0 zkf0Var) {
        xkf0 xkf0Var = zkf0Var.a;
        xkf0 xkf0Var2 = zkf0Var.b;
        ykf0[] ykf0VarArr = xkf0Var.a;
        if (ykf0VarArr.length == 1 && ykf0VarArr[0].a == 0) {
            ykf0[] ykf0VarArr2 = xkf0Var2.a;
            if (ykf0VarArr2.length == 1 && ykf0VarArr2[0].a == 0) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        try {
            jht jhtVar = new jht("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.c = jhtVar;
            this.d = GLES20.glGetUniformLocation(jhtVar.a, "uMvpMatrix");
            this.e = GLES20.glGetUniformLocation(this.c.a, "uTexMatrix");
            this.f = this.c.b("aPosition");
            this.g = this.c.b("aTexCoords");
            this.h = GLES20.glGetUniformLocation(this.c.a, "uTexture");
        } catch (GlUtil$GlException e) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e);
        }
    }
}
