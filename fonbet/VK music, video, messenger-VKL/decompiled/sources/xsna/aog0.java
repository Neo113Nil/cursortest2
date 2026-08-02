package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: RoundRect.kt */
/* loaded from: classes11.dex */
public final class aog0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        ne7.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L);
    }

    public aog0(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aog0)) {
            return false;
        }
        aog0 aog0Var = (aog0) obj;
        return Float.compare(this.a, aog0Var.a) == 0 && Float.compare(this.b, aog0Var.b) == 0 && Float.compare(this.c, aog0Var.c) == 0 && Float.compare(this.d, aog0Var.d) == 0 && f370.o(this.e, aog0Var.e) && f370.o(this.f, aog0Var.f) && f370.o(this.g, aog0Var.g) && f370.o(this.h, aog0Var.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + bh10.a(bh10.a(bh10.a(io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String str = bu00.u(this.a) + ", " + bu00.u(this.b) + ", " + bu00.u(this.c) + ", " + bu00.u(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean o = f370.o(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!o || !f370.o(j2, j3) || !f370.o(j3, j4)) {
            StringBuilder a = t33.a("RoundRect(rect=", str, ", topLeft=");
            a.append((Object) f370.N(j));
            a.append(", topRight=");
            a.append((Object) f370.N(j2));
            a.append(", bottomRight=");
            a.append((Object) f370.N(j3));
            a.append(", bottomLeft=");
            a.append((Object) f370.N(j4));
            a.append(')');
            return a.toString();
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            StringBuilder a2 = t33.a("RoundRect(rect=", str, ", radius=");
            a2.append(bu00.u(Float.intBitsToFloat(i)));
            a2.append(')');
            return a2.toString();
        }
        StringBuilder a3 = t33.a("RoundRect(rect=", str, ", x=");
        a3.append(bu00.u(Float.intBitsToFloat(i)));
        a3.append(", y=");
        a3.append(bu00.u(Float.intBitsToFloat(i2)));
        a3.append(')');
        return a3.toString();
    }

    public /* synthetic */ aog0(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, int i) {
        this(f, f2, f3, f4, (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? 0L : j2, (i & 64) != 0 ? 0L : j3, (i & 128) != 0 ? 0L : j4);
    }
}
