package xsna;

/* compiled from: TextColorScheme.kt */
/* loaded from: classes17.dex */
public final class lco0 {
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
    public final long p;
    public final long q;
    public final long r;
    public final long s;
    public final long t;

    public lco0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20) {
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
        this.p = j16;
        this.q = j17;
        this.r = j18;
        this.s = j19;
        this.t = j20;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lco0)) {
            return false;
        }
        lco0 lco0Var = (lco0) obj;
        return l5g.d(this.a, lco0Var.a) && l5g.d(this.b, lco0Var.b) && l5g.d(this.c, lco0Var.c) && l5g.d(this.d, lco0Var.d) && l5g.d(this.e, lco0Var.e) && l5g.d(this.f, lco0Var.f) && l5g.d(this.g, lco0Var.g) && l5g.d(this.h, lco0Var.h) && l5g.d(this.i, lco0Var.i) && l5g.d(this.j, lco0Var.j) && l5g.d(this.k, lco0Var.k) && l5g.d(this.l, lco0Var.l) && l5g.d(this.m, lco0Var.m) && l5g.d(this.n, lco0Var.n) && l5g.d(this.o, lco0Var.o) && l5g.d(this.p, lco0Var.p) && l5g.d(this.q, lco0Var.q) && l5g.d(this.r, lco0Var.r) && l5g.d(this.s, lco0Var.s) && l5g.d(this.t, lco0Var.t);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.t) + bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextColorScheme(textAccent=");
        dn.h(this.a, ", textAccentActive=", sb);
        dn.h(this.b, ", textAccentThemed=", sb);
        dn.h(this.c, ", textContrast=", sb);
        dn.h(this.d, ", textContrastThemed=", sb);
        dn.h(this.e, ", textLink=", sb);
        dn.h(this.f, ", textLinkThemed=", sb);
        dn.h(this.g, ", textLinkTint=", sb);
        dn.h(this.h, ", textLinkVisited=", sb);
        dn.h(this.i, ", textMuted=", sb);
        dn.h(this.j, ", textNegative=", sb);
        dn.h(this.k, ", textPositive=", sb);
        dn.h(this.l, ", textPrimary=", sb);
        dn.h(this.m, ", textPrimaryAlpha=", sb);
        dn.h(this.n, ", textPrimaryInvariably=", sb);
        dn.h(this.o, ", textSecondary=", sb);
        dn.h(this.p, ", textSecondaryAlpha=", sb);
        dn.h(this.q, ", textSubhead=", sb);
        dn.h(this.r, ", textTertiary=", sb);
        dn.h(this.s, ", textTertiaryAlpha=", sb);
        return pm0.d(')', this.t, sb);
    }
}
