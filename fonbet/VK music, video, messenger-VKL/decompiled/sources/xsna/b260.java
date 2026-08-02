package xsna;

/* compiled from: NetConfig.kt */
/* loaded from: classes11.dex */
public final class b260 {
    public static final a o = new a();
    public static final b260 p = new b260(60000, 900000, 100, 60000, 3000, 25, 25, 20, 25, false, false, false, "", false);
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final boolean n;

    /* compiled from: NetConfig.kt */
    public static final class a {
    }

    public b260(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, boolean z, boolean z2, boolean z3, String str, boolean z4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = str;
        this.n = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b260)) {
            return false;
        }
        b260 b260Var = (b260) obj;
        return this.a == b260Var.a && this.b == b260Var.b && this.c == b260Var.c && this.d == b260Var.d && this.e == b260Var.e && this.f == b260Var.f && this.g == b260Var.g && this.h == b260Var.h && this.i == b260Var.i && this.j == b260Var.j && this.k == b260Var.k && this.l == b260Var.l && epx.f(this.m, b260Var.m) && this.n == b260Var.n;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.n) + urd0.a(qoy.b(qoy.b(qoy.b(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetConfig(backoffMinRateApiTime=");
        sb.append(this.a);
        sb.append(", backoffMaxRateApiTime=");
        sb.append(this.b);
        sb.append(", backoffTime=");
        sb.append(this.c);
        sb.append(", backoffMaxTime=");
        sb.append(this.d);
        sb.append(", backoffLeftBoundLimitTime=");
        sb.append(this.e);
        sb.append(", connectTimeout=");
        sb.append(this.f);
        sb.append(", ioTimeout=");
        sb.append(this.g);
        sb.append(", voipLpTimeout=");
        sb.append(this.h);
        sb.append(", msgLpTimeout=");
        sb.append(this.i);
        sb.append(", isImageExecutor=");
        sb.append(this.j);
        sb.append(", isSocketChannel=");
        sb.append(this.k);
        sb.append(", firebaseErrorLogging=");
        sb.append(this.l);
        sb.append(", cronetConfig=");
        sb.append(this.m);
        sb.append(", isNetSmallStat=");
        return defpackage.q0.a(sb, this.n, ')');
    }
}
