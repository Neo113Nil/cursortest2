package xsna;

import android.opengl.GLES20;
import androidx.annotation.Nullable;
import androidx.media3.common.util.GlUtil;
import com.unity3d.services.UnityAdsConstants;
import java.nio.FloatBuffer;
import xsna.f4e0;

/* compiled from: ProjectionRenderer.java */
/* loaded from: classes12.dex */
public final class h4e0 {
    public static final float[] i = {1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f};
    public static final float[] j = {1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1.0f};
    public static final float[] k = {0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f};
    public int a;

    @Nullable
    public a b;
    public androidx.media3.common.util.b c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    /* compiled from: ProjectionRenderer.java */
    public static class a {
        public final int a;
        public final FloatBuffer b;
        public final FloatBuffer c;
        public final int d;

        public a(f4e0.b bVar) {
            float[] fArr = bVar.c;
            this.a = fArr.length / 3;
            this.b = GlUtil.h(fArr);
            this.c = GlUtil.h(bVar.d);
            int i = bVar.b;
            if (i == 1) {
                this.d = 5;
            } else if (i != 2) {
                this.d = 4;
            } else {
                this.d = 6;
            }
        }
    }

    public static boolean b(f4e0 f4e0Var) {
        f4e0.a aVar = f4e0Var.a;
        f4e0.a aVar2 = f4e0Var.b;
        f4e0.b[] bVarArr = aVar.a;
        if (bVarArr.length == 1 && bVarArr[0].a == 0) {
            f4e0.b[] bVarArr2 = aVar2.a;
            if (bVarArr2.length == 1 && bVarArr2[0].a == 0) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        try {
            androidx.media3.common.util.b bVar = new androidx.media3.common.util.b("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.c = bVar;
            this.d = GLES20.glGetUniformLocation(bVar.a, "uMvpMatrix");
            this.e = GLES20.glGetUniformLocation(this.c.a, "uTexMatrix");
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.c.a, "aPosition");
            GLES20.glEnableVertexAttribArray(glGetAttribLocation);
            GlUtil.d();
            this.f = glGetAttribLocation;
            int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.c.a, "aTexCoords");
            GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
            GlUtil.d();
            this.g = glGetAttribLocation2;
            this.h = GLES20.glGetUniformLocation(this.c.a, "uTexture");
        } catch (GlUtil.GlException e) {
            ahn.o("ProjectionRenderer", "Failed to initialize the program", e);
        }
    }
}
