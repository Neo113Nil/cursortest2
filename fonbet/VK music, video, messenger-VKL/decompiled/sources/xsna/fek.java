package xsna;

/* compiled from: CronetCoreConfig.kt */
/* loaded from: classes.dex */
public final class fek {
    public final yek a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final long e;
    public final long f;
    public final int g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final long m;
    public final long n;

    public fek(yek yekVar, boolean z, boolean z2, long j, long j2, long j3, int i, int i2, boolean z3, boolean z4, boolean z5, boolean z6, long j4, long j5) {
        this.a = yekVar;
        this.b = z;
        this.c = z2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = i;
        this.h = i2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = j4;
        this.n = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fek)) {
            return false;
        }
        fek fekVar = (fek) obj;
        return epx.f(this.a, fekVar.a) && this.b == fekVar.b && this.c == fekVar.c && this.d == fekVar.d && this.e == fekVar.e && this.f == fekVar.f && this.g == fekVar.g && this.h == fekVar.h && this.i == fekVar.i && this.j == fekVar.j && this.k == fekVar.k && this.l == fekVar.l && this.m == fekVar.m && this.n == fekVar.n;
    }

    public final int hashCode() {
        yek yekVar = this.a;
        return Long.hashCode(this.n) + bh10.a(qoy.b(qoy.b(qoy.b(qoy.b(shy.a(this.h, shy.a(this.g, bh10.a(bh10.a(bh10.a(qoy.b(qoy.b((yekVar == null ? 0 : yekVar.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CronetCoreConfig(quicConfig=");
        sb.append(this.a);
        sb.append(", isEnableHttp2=");
        sb.append(this.b);
        sb.append(", isUseBrotli=");
        sb.append(this.c);
        sb.append(", connectTimeoutMs=");
        sb.append(this.d);
        tj0.d(sb, ", readTimeoutMs=", this.e, ", writeTimeoutMs=");
        sb.append(this.f);
        sb.append(", maxConcurrentRequests=");
        sb.append(this.g);
        sb.append(", maxConcurrentRequestsPerHost=");
        sb.append(this.h);
        sb.append(", followRedirects=");
        sb.append(this.i);
        sb.append(", followSslRedirects=");
        sb.append(this.j);
        sb.append(", isClearHosts=");
        sb.append(this.k);
        sb.append(", prohibitNetworkOnMainThread=");
        sb.append(this.l);
        sb.append(", executorRecyclerAliveTimeMs=");
        sb.append(this.m);
        return e630.c(sb, ", executorAliveTimeMs=", this.n, ")");
    }
}
