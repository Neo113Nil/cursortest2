package xsna;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.unity3d.services.UnityAdsConstants;
import one.video.gl.GLESUtils;

/* compiled from: PlainGLScene.kt */
/* loaded from: classes8.dex */
public class zsa0 extends a2t {
    public final float[] e = new float[16];
    public final float[] f;
    public final q1t g;
    public mqj0 h;

    public zsa0() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        this.f = fArr;
        this.g = new q1t();
    }

    @Override // xsna.a2t
    public final void a(d2t d2tVar) {
        GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        GLESUtils.c("glClearColor", new int[0]);
        GLES20.glClear(16384);
        GLESUtils.c("glClear", 1285);
        mqj0 mqj0Var = this.h;
        if (mqj0Var == null) {
            return;
        }
        mqj0Var.i = d2tVar.a;
        SurfaceTexture surfaceTexture = d2tVar.b;
        float[] fArr = this.e;
        if (surfaceTexture != null) {
            surfaceTexture.getTransformMatrix(fArr);
        }
        mqj0Var.g = fArr;
        mqj0Var.f = this.f;
        this.g.j(mqj0Var);
    }

    @Override // xsna.a2t
    public final void b() {
        this.h = new mqj0("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
    }

    @Override // xsna.a2t
    public void d() {
        mqj0 mqj0Var = this.h;
        if (mqj0Var != null) {
            GLES20.glDeleteProgram(mqj0Var.a);
            GLESUtils.c("glDeleteProgram", new int[0]);
        }
        this.h = null;
    }
}
