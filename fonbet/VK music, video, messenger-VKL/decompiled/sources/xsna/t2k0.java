package xsna;

import android.opengl.GLES20;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import xsna.s2k0;

/* compiled from: SlotSharpnessShader.kt */
/* loaded from: classes4.dex */
public final class t2k0 extends ksj0 {
    public static final /* synthetic */ int t = 0;
    public final s2k0.b m;
    public float n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;

    /* compiled from: SlotSharpnessShader.kt */
    public static final class a {
        public static final float a(float f, float f2) {
            int i = t2k0.t;
            return f2 - ((f2 - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * (1.0f - f));
        }
    }

    public t2k0(int i, int i2, s2k0.b bVar) {
        super(i, i2);
        this.m = bVar;
        this.o = GLES20.glGetUniformLocation(this.b, "u_FrameX1");
        this.p = GLES20.glGetUniformLocation(this.b, "u_FrameY1");
        this.q = GLES20.glGetUniformLocation(this.b, "u_FrameX2");
        this.r = GLES20.glGetUniformLocation(this.b, "u_FrameY2");
        this.s = GLES20.glGetUniformLocation(this.b, "u_sharpnessIntensity");
    }

    @Override // xsna.ksj0
    public final void a(Size size) {
        s2k0.b bVar = this.m;
        float a2 = a.a(bVar.a, size.getWidth());
        float a3 = a.a(bVar.b, size.getHeight());
        float a4 = a.a(bVar.c, size.getWidth());
        float a5 = a.a(bVar.d, size.getHeight());
        GLES20.glUniform1f(this.o, a2 - 0.25f);
        GLES20.glUniform1f(this.p, a3 - 0.25f);
        GLES20.glUniform1f(this.q, a4 + 0.25f);
        GLES20.glUniform1f(this.r, a5 + 0.25f);
        GLES20.glUniform1f(this.s, this.n);
    }
}
