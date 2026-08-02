package xsna;

/* compiled from: TextFieldDefaults.kt */
/* loaded from: classes11.dex */
public final class wol implements nfo0 {
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
    public final long u;

    public wol(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
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
        this.u = j21;
    }

    @Override // xsna.nfo0
    public final mtk0 a(int i, androidx.compose.runtime.a aVar) {
        aVar.K(9804418);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(9804418, i, -1, "androidx.compose.material.DefaultTextFieldColors.textColor (TextFieldDefaults.kt:881)");
        }
        wh50 f = bo.f(0, this.a, aVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wol.class != obj.getClass()) {
            return false;
        }
        wol wolVar = (wol) obj;
        return l5g.d(this.a, wolVar.a) && l5g.d(this.b, wolVar.b) && l5g.d(this.c, wolVar.c) && l5g.d(this.d, wolVar.d) && l5g.d(this.e, wolVar.e) && l5g.d(this.f, wolVar.f) && l5g.d(this.g, wolVar.g) && l5g.d(this.h, wolVar.h) && l5g.d(this.i, wolVar.i) && l5g.d(this.j, wolVar.j) && l5g.d(this.k, wolVar.k) && l5g.d(this.l, wolVar.l) && l5g.d(this.m, wolVar.m) && l5g.d(this.n, wolVar.n) && l5g.d(this.o, wolVar.o) && l5g.d(this.p, wolVar.p) && l5g.d(this.q, wolVar.q) && l5g.d(this.r, wolVar.r) && l5g.d(this.s, wolVar.s) && l5g.d(this.t, wolVar.t) && l5g.d(this.u, wolVar.u);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.u) + bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t);
    }
}
