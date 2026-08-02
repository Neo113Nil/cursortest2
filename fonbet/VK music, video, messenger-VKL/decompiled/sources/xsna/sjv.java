package xsna;

/* compiled from: HttpMetricIntervals.kt */
/* loaded from: classes2.dex */
public final class sjv {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public sjv(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final long a() {
        return this.d;
    }

    public final long b() {
        return this.a;
    }

    public final long c() {
        return this.e;
    }

    public final long d() {
        return this.b;
    }

    public final long e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sjv)) {
            return false;
        }
        sjv sjvVar = (sjv) obj;
        return this.a == sjvVar.a && this.b == sjvVar.b && this.c == sjvVar.c && this.d == sjvVar.d && this.e == sjvVar.e && this.f == sjvVar.f;
    }

    public final long f() {
        return this.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + bh10.a(bh10.a(bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder b = fp.b(this.a, "HttpMetricIntervals(domainLookup=", ", rtt=");
        b.append(this.b);
        tj0.d(b, ", tls=", this.c, ", connection=");
        b.append(this.d);
        tj0.d(b, ", response=", this.e, ", ttfb=");
        return efz.b(this.f, ")", b);
    }
}
