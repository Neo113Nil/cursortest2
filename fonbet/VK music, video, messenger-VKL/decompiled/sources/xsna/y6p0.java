package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: AppBar.kt */
/* loaded from: classes11.dex */
public final class y6p0 {
    public static final fh9 d = q6x.C(new gky(28), new e69(0, 6));
    public float a;
    public final kg50 b;
    public final kg50 c;

    public y6p0(float f, float f2, float f3) {
        this.a = f;
        this.b = androidx.compose.runtime.d.a(f3);
        this.c = androidx.compose.runtime.d.a(f2);
    }

    public final float a() {
        return this.a == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : b() / this.a;
    }

    public final float b() {
        return ((vak0) this.c).getFloatValue();
    }

    public final void c(float f) {
        ((vak0) this.c).g(swe0.f(f, this.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    }
}
