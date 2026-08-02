package xsna;

/* compiled from: ReefState.kt */
/* loaded from: classes5.dex */
public final class r600 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    public r600(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r600)) {
            return false;
        }
        r600 r600Var = (r600) obj;
        return this.a == r600Var.a && this.b == r600Var.b && this.c == r600Var.c && this.d == r600Var.d && this.e == r600Var.e && this.f == r600Var.f && this.g == r600Var.g && this.h == r600Var.h && this.i == r600Var.i && this.j == r600Var.j;
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder b = fp.b(this.a, "LostEventCounters(byAppRestart=", ", byQueueLimit=");
        b.append(this.b);
        tj0.d(b, ", byNetworkErrorTotal=", this.c, ", byNetworkErrorOffline=");
        b.append(this.d);
        tj0.d(b, ", byNetworkErrorWifi=", this.e, ", byNetworkError2g=");
        b.append(this.f);
        tj0.d(b, ", byNetworkError3g=", this.g, ", byNetworkError4g=");
        b.append(this.h);
        tj0.d(b, ", byNetworkErrorCellularUnknown=", this.i, ", byNetworkErrorOther=");
        return efz.b(this.j, ")", b);
    }
}
