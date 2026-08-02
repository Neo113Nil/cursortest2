package xsna;

/* compiled from: VideoLiveTimeUtils.kt */
/* loaded from: classes3.dex */
public final class dyo0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public dyo0(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        long j7 = 60;
        this.g = Math.abs(j % j7);
        this.h = Math.abs(j2 % j7);
        Math.abs(j3 % 24);
        Math.abs(j4 % 30);
        Math.abs(j5 % 12);
        Math.abs(j6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyo0)) {
            return false;
        }
        dyo0 dyo0Var = (dyo0) obj;
        return this.a == dyo0Var.a && this.b == dyo0Var.b && this.c == dyo0Var.c && this.d == dyo0Var.d && this.e == dyo0Var.e && this.f == dyo0Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + bh10.a(bh10.a(bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimestampUnit(seconds=");
        sb.append(this.a);
        sb.append(", minutes=");
        sb.append(this.b);
        sb.append(", hours=");
        sb.append(this.c);
        sb.append(", days=");
        sb.append(this.d);
        sb.append(", months=");
        sb.append(this.e);
        sb.append(", years=");
        return vu5.a(')', this.f, sb);
    }
}
