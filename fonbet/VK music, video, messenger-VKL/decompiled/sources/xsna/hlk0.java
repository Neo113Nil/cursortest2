package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.upr;

/* compiled from: SplineBasedFloatDecayAnimationSpec.kt */
/* loaded from: classes11.dex */
public final class hlk0 implements eqr {
    public final upr a;

    public hlk0(azl azlVar) {
        this.a = new upr(ilk0.a, azlVar);
    }

    @Override // xsna.eqr
    public final long a(float f) {
        return ((long) (Math.exp(this.a.b(f) / (vpr.a - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // xsna.eqr
    public final float b(float f, float f2) {
        double b = this.a.b(f2);
        double d = vpr.a;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * b) * r0.a * r0.c))) + f;
    }

    @Override // xsna.eqr
    public final float c(float f, long j) {
        long j2 = j / 1000000;
        upr.a a = this.a.a(f);
        long j3 = a.c;
        return (((Math.signum(a.a) * s82.a(j3 > 0 ? j2 / j3 : 1.0f).b) * a.b) / j3) * 1000.0f;
    }

    @Override // xsna.eqr
    public final float d(long j, float f, float f2) {
        long j2 = j / 1000000;
        upr.a a = this.a.a(f2);
        long j3 = a.c;
        return (Math.signum(a.a) * a.b * s82.a(j3 > 0 ? j2 / j3 : 1.0f).a) + f;
    }

    @Override // xsna.eqr
    public final float e() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
