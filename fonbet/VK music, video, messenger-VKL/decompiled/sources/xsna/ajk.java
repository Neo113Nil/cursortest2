package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: CropperState.kt */
/* loaded from: classes5.dex */
public final class ajk {
    public final long a;
    public final zhf0 b;
    public final float c;
    public final float d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;

    public ajk(long j, zhf0 zhf0Var, float f, float f2) {
        this.a = j;
        this.b = zhf0Var;
        this.c = f;
        this.d = f2;
        this.e = androidx.compose.runtime.k.b(Float.valueOf(f));
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f = androidx.compose.runtime.k.b(valueOf);
        this.g = androidx.compose.runtime.k.b(valueOf);
        if (f > f2) {
            throw new IllegalArgumentException("minScale must be <= maxScale");
        }
    }

    public final void a(long j) {
        float intBitsToFloat = (Float.intBitsToFloat((int) (j & 4294967295L)) / d()) + c();
        long j2 = this.a;
        float f = -Float.intBitsToFloat((int) (egi.j(j2) & 4294967295L));
        zhf0 zhf0Var = this.b;
        float f2 = zhf0Var.a;
        float f3 = zhf0Var.c;
        float f4 = zhf0Var.d;
        float f5 = zhf0Var.b;
        float f6 = 2;
        float d = (((f4 - f5) / f6) / d()) + f;
        float f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (d > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            d = 0.0f;
        }
        float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & egi.j(j2))) - (((f4 - f5) / f6) / d());
        if (intBitsToFloat2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            intBitsToFloat2 = 0.0f;
        }
        ((zak0) this.f).setValue(Float.valueOf(swe0.f(intBitsToFloat, d, intBitsToFloat2)));
        float intBitsToFloat3 = (Float.intBitsToFloat((int) (j >> 32)) / d()) + b();
        float d2 = (((f3 - f2) / f6) / d()) + (-Float.intBitsToFloat((int) (egi.j(j2) >> 32)));
        if (d2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            d2 = 0.0f;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (egi.j(j2) >> 32)) - (((f3 - f2) / f6) / d());
        if (intBitsToFloat4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f7 = intBitsToFloat4;
        }
        ((zak0) this.g).setValue(Float.valueOf(swe0.f(intBitsToFloat3, d2, f7)));
    }

    public final float b() {
        return ((Number) ((zak0) this.g).getValue()).floatValue();
    }

    public final float c() {
        return ((Number) ((zak0) this.f).getValue()).floatValue();
    }

    public final float d() {
        return ((Number) ((zak0) this.e).getValue()).floatValue();
    }

    public final String toString() {
        return "CropperState(minScale=" + this.c + ", maxScale=" + this.d + ", offsetX=" + b() + "offsetY=" + c() + "scale=" + d() + ')';
    }
}
