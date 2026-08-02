package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: ShimmerArea.kt */
/* loaded from: classes17.dex */
public final class kdj0 {
    public final float a;
    public final float b;
    public zhf0 c;
    public long d;
    public float e;
    public long f;
    public zhf0 g;
    public zhf0 h;

    public kdj0(float f, float f2) {
        this.a = f;
        if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException("The shimmer's rotation must be a positive number");
        }
        float f3 = 180;
        float f4 = 90;
        this.b = (((-Math.abs((f2 % f3) - f4)) + f4) / f3) * 3.1415927f;
        this.d = 0L;
        this.f = 9205357640488583168L;
        zhf0 zhf0Var = zhf0.e;
        this.g = zhf0Var;
        this.h = zhf0Var;
    }

    public final void a() {
        if (this.h.g()) {
            return;
        }
        zhf0 zhf0Var = this.c;
        if (zhf0Var == null) {
            zhf0Var = this.h;
        }
        this.g = zhf0Var;
        this.f = ov70.f(this.h.e() ^ (-9223372034707292160L), this.g.c());
        long d = this.g.d();
        if (mxj0.b(this.d, d)) {
            return;
        }
        this.d = d;
        float f = 2;
        float intBitsToFloat = Float.intBitsToFloat((int) (d >> 32)) / f;
        double d2 = 2;
        this.e = (((float) Math.cos(((float) Math.acos(intBitsToFloat / r1)) - this.b)) * ((float) Math.sqrt(((float) Math.pow(intBitsToFloat, d2)) + ((float) Math.pow(Float.intBitsToFloat((int) (this.d & 4294967295L)) / f, d2)))) * f) + this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kdj0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kdj0 kdj0Var = (kdj0) obj;
        return this.a == kdj0Var.a && this.b == kdj0Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
