package xsna;

/* compiled from: AccentColorScheme.kt */
/* loaded from: classes17.dex */
public final class wi {
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
    public final long k;
    public final long l;
    public final long m;
    public final long n;
    public final long o;

    public wi(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15) {
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
        this.k = j11;
        this.l = j12;
        this.m = j13;
        this.n = j14;
        this.o = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi)) {
            return false;
        }
        wi wiVar = (wi) obj;
        return l5g.d(this.a, wiVar.a) && l5g.d(this.b, wiVar.b) && l5g.d(this.c, wiVar.c) && l5g.d(this.d, wiVar.d) && l5g.d(this.e, wiVar.e) && l5g.d(this.f, wiVar.f) && l5g.d(this.g, wiVar.g) && l5g.d(this.h, wiVar.h) && l5g.d(this.i, wiVar.i) && l5g.d(this.j, wiVar.j) && l5g.d(this.k, wiVar.k) && l5g.d(this.l, wiVar.l) && l5g.d(this.m, wiVar.m) && l5g.d(this.n, wiVar.n) && l5g.d(this.o, wiVar.o);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.o) + bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccentColorScheme(accentAzure=");
        dn.h(this.a, ", accentBlue=", sb);
        dn.h(this.b, ", accentCyan=", sb);
        dn.h(this.c, ", accentGray=", sb);
        dn.h(this.d, ", accentGreen=", sb);
        dn.h(this.e, ", accentLime=", sb);
        dn.h(this.f, ", accentOrange=", sb);
        dn.h(this.g, ", accentOrangeFire=", sb);
        dn.h(this.h, ", accentOrangePeach=", sb);
        dn.h(this.i, ", accentPink=", sb);
        dn.h(this.j, ", accentPurple=", sb);
        dn.h(this.k, ", accentRaspberryPink=", sb);
        dn.h(this.l, ", accentRed=", sb);
        dn.h(this.m, ", accentSecondary=", sb);
        dn.h(this.n, ", accentViolet=", sb);
        return pm0.d(')', this.o, sb);
    }
}
