package xsna;

/* compiled from: IconColorScheme.kt */
/* loaded from: classes17.dex */
public final class vpv {
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

    public vpv(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
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
    }

    public final long a() {
        return this.j;
    }

    public final long b() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpv)) {
            return false;
        }
        vpv vpvVar = (vpv) obj;
        return l5g.d(this.a, vpvVar.a) && l5g.d(this.b, vpvVar.b) && l5g.d(this.c, vpvVar.c) && l5g.d(this.d, vpvVar.d) && l5g.d(this.e, vpvVar.e) && l5g.d(this.f, vpvVar.f) && l5g.d(this.g, vpvVar.g) && l5g.d(this.h, vpvVar.h) && l5g.d(this.i, vpvVar.i) && l5g.d(this.j, vpvVar.j) && l5g.d(this.k, vpvVar.k) && l5g.d(this.l, vpvVar.l) && l5g.d(this.m, vpvVar.m) && l5g.d(this.n, vpvVar.n) && l5g.d(this.o, vpvVar.o) && l5g.d(this.p, vpvVar.p);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.p) + bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IconColorScheme(iconAccent=");
        dn.h(this.a, ", iconAccentThemed=", sb);
        dn.h(this.b, ", iconContrast=", sb);
        dn.h(this.c, ", iconContrastSecondary=", sb);
        dn.h(this.d, ", iconContrastThemed=", sb);
        dn.h(this.e, ", iconMedium=", sb);
        dn.h(this.f, ", iconMediumAlpha=", sb);
        dn.h(this.g, ", iconNegative=", sb);
        dn.h(this.h, ", iconPositive=", sb);
        dn.h(this.i, ", iconPrimary=", sb);
        dn.h(this.j, ", iconPrimaryInvariably=", sb);
        dn.h(this.k, ", iconSecondary=", sb);
        dn.h(this.l, ", iconSecondaryAlpha=", sb);
        dn.h(this.m, ", iconTertiary=", sb);
        dn.h(this.n, ", iconTertiaryAlpha=", sb);
        dn.h(this.o, ", iconWarning=", sb);
        return pm0.d(')', this.p, sb);
    }
}
