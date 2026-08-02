package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: TopAppBarScrollBehavior.kt */
/* loaded from: classes17.dex */
public final class x6p0 {
    public static final fh9 d = q6x.C(new t9o0(2), new xpd(0, 9));
    public final wh50 a;
    public final wh50<Float> b;
    public final wh50<Float> c;

    public x6p0(float f, float f2, float f3) {
        this.a = androidx.compose.runtime.k.b(Float.valueOf(f3));
        this.b = androidx.compose.runtime.k.b(Float.valueOf(f2));
        this.c = androidx.compose.runtime.k.b(Float.valueOf(f));
    }

    public final float a() {
        return c() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : b() / c();
    }

    public final float b() {
        return ((Number) ((zak0) this.b).getValue()).floatValue();
    }

    public final float c() {
        return ((Number) ((zak0) this.c).getValue()).floatValue();
    }

    public final void d(float f) {
        ((zak0) this.a).setValue(Float.valueOf(f));
    }

    public final void e(float f) {
        ((zak0) this.b).setValue(Float.valueOf(swe0.f(f, c(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
    }

    public final void f(float f) {
        ((zak0) this.c).setValue(Float.valueOf(f));
        e(b());
    }
}
