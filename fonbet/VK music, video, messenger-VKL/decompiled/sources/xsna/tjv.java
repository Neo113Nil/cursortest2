package xsna;

/* compiled from: RequestPoints.kt */
/* loaded from: classes2.dex */
public final class tjv {
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
    public final bpn0 k = new bpn0(new jpf(this, 27));

    public tjv(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
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

    public final long a() {
        return this.c;
    }

    public final long b() {
        return this.a;
    }

    public final sjv c() {
        return (sjv) this.k.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjv)) {
            return false;
        }
        tjv tjvVar = (tjv) obj;
        return this.a == tjvVar.a && this.b == tjvVar.b && this.c == tjvVar.c && this.d == tjvVar.d && this.e == tjvVar.e && this.f == tjvVar.f && this.g == tjvVar.g && this.h == tjvVar.h && this.i == tjvVar.i && this.j == tjvVar.j;
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder b = fp.b(this.a, "HttpMetricPoints(dnsStart=", ", dnsEnd=");
        b.append(this.b);
        tj0.d(b, ", connectStart=", this.c, ", connectEnd=");
        b.append(this.d);
        tj0.d(b, ", secureStart=", this.e, ", secureEnd=");
        b.append(this.f);
        tj0.d(b, ", requestStart=", this.g, ", requestEnd=");
        b.append(this.h);
        tj0.d(b, ", responseStart=", this.i, ", responseEnd=");
        return efz.b(this.j, ")", b);
    }
}
