package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: Rect.kt */
/* loaded from: classes11.dex */
public final class zhf0 {
    public static final zhf0 e = new zhf0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public zhf0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static zhf0 b(zhf0 zhf0Var, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = zhf0Var.a;
        }
        if ((i & 2) != 0) {
            f2 = zhf0Var.b;
        }
        if ((i & 4) != 0) {
            f3 = zhf0Var.c;
        }
        if ((i & 8) != 0) {
            f4 = zhf0Var.d;
        }
        zhf0Var.getClass();
        return new zhf0(f, f2, f3, f4);
    }

    public final boolean a(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (intBitsToFloat >= this.a) & (intBitsToFloat < this.c) & (intBitsToFloat2 >= this.b) & (intBitsToFloat2 < this.d);
    }

    public final long c() {
        float f = this.c;
        float f2 = this.a;
        float a = wq.a(f, f2, 2.0f, f2);
        float f3 = this.b;
        float a2 = wq.a(this.d, f3, 2.0f, f3);
        return (Float.floatToRawIntBits(a2) & 4294967295L) | (Float.floatToRawIntBits(a) << 32);
    }

    public final long d() {
        float f = this.c - this.a;
        float f2 = this.d - this.b;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final long e() {
        return (Float.floatToRawIntBits(this.a) << 32) | (Float.floatToRawIntBits(this.b) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhf0)) {
            return false;
        }
        zhf0 zhf0Var = (zhf0) obj;
        return Float.compare(this.a, zhf0Var.a) == 0 && Float.compare(this.b, zhf0Var.b) == 0 && Float.compare(this.c, zhf0Var.c) == 0 && Float.compare(this.d, zhf0Var.d) == 0;
    }

    public final zhf0 f(zhf0 zhf0Var) {
        return new zhf0(Math.max(this.a, zhf0Var.a), Math.max(this.b, zhf0Var.b), Math.min(this.c, zhf0Var.c), Math.min(this.d, zhf0Var.d));
    }

    public final boolean g() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final boolean h(zhf0 zhf0Var) {
        return (this.a < zhf0Var.c) & (zhf0Var.a < this.c) & (this.b < zhf0Var.d) & (zhf0Var.b < this.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final zhf0 i(float f, float f2) {
        return new zhf0(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final zhf0 j(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new zhf0(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + bu00.u(this.a) + ", " + bu00.u(this.b) + ", " + bu00.u(this.c) + ", " + bu00.u(this.d) + ')';
    }
}
