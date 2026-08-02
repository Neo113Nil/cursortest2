package defpackage;

/* loaded from: classes.dex */
public final class bmt0 implements fk2 {
    public final moy0 a;
    public final long b;
    public final lzr c;
    public final hzr d;
    public final izr e;
    public final eyr f;
    public final String g;
    public final long h;
    public final td5 i;
    public final soy0 j;
    public final k5z k;
    public final long l;
    public final rly0 m;
    public final bgr0 n;
    public final dwc0 o;
    public final ram p;

    public bmt0(long j, long j2, lzr lzrVar, hzr hzrVar, izr izrVar, eyr eyrVar, String str, long j3, td5 td5Var, soy0 soy0Var, k5z k5zVar, long j4, rly0 rly0Var, bgr0 bgr0Var, int i) {
        this((i & 1) != 0 ? ldc.m : j, (i & 2) != 0 ? sty0.c : j2, (i & 4) != 0 ? null : lzrVar, (i & 8) != 0 ? null : hzrVar, (i & 16) != 0 ? null : izrVar, (i & 32) != 0 ? null : eyrVar, (i & 64) != 0 ? null : str, (i & 128) != 0 ? sty0.c : j3, (i & 256) != 0 ? null : td5Var, (i & 512) != 0 ? null : soy0Var, (i & 1024) != 0 ? null : k5zVar, (i & 2048) != 0 ? ldc.m : j4, (i & 4096) != 0 ? null : rly0Var, (i & 8192) != 0 ? null : bgr0Var, (dwc0) null);
    }

    public static bmt0 a(bmt0 bmt0Var, long j, lzr lzrVar, int i) {
        long b = (i & 1) != 0 ? bmt0Var.a.b() : j;
        long j2 = bmt0Var.b;
        lzr lzrVar2 = (i & 4) != 0 ? bmt0Var.c : lzrVar;
        hzr hzrVar = bmt0Var.d;
        izr izrVar = bmt0Var.e;
        eyr eyrVar = (i & 32) != 0 ? bmt0Var.f : null;
        String str = bmt0Var.g;
        long j3 = bmt0Var.h;
        td5 td5Var = bmt0Var.i;
        soy0 soy0Var = bmt0Var.j;
        k5z k5zVar = bmt0Var.k;
        long j4 = bmt0Var.l;
        rly0 rly0Var = bmt0Var.m;
        bgr0 bgr0Var = bmt0Var.n;
        dwc0 dwc0Var = bmt0Var.o;
        ram ramVar = bmt0Var.p;
        moy0 moy0Var = bmt0Var.a;
        if (!ldc.c(b, moy0Var.b())) {
            moy0Var = b != 16 ? new ghc(b) : loy0.a;
        }
        return new bmt0(moy0Var, j2, lzrVar2, hzrVar, izrVar, eyrVar, str, j3, td5Var, soy0Var, k5zVar, j4, rly0Var, bgr0Var, dwc0Var, ramVar);
    }

    public final boolean b(bmt0 bmt0Var) {
        if (this == bmt0Var) {
            return true;
        }
        return sty0.a(this.b, bmt0Var.b) && jl40.l(this.c, bmt0Var.c) && jl40.l(this.d, bmt0Var.d) && jl40.l(this.e, bmt0Var.e) && jl40.l(this.f, bmt0Var.f) && jl40.l(this.g, bmt0Var.g) && sty0.a(this.h, bmt0Var.h) && jl40.l(this.i, bmt0Var.i) && jl40.l(this.j, bmt0Var.j) && jl40.l(this.k, bmt0Var.k) && ldc.c(this.l, bmt0Var.l) && jl40.l(this.o, bmt0Var.o);
    }

    public final boolean c(bmt0 bmt0Var) {
        return jl40.l(this.a, bmt0Var.a) && jl40.l(this.m, bmt0Var.m) && jl40.l(this.n, bmt0Var.n) && jl40.l(this.p, bmt0Var.p);
    }

    public final bmt0 d(bmt0 bmt0Var) {
        if (bmt0Var == null) {
            return this;
        }
        moy0 moy0Var = bmt0Var.a;
        return cmt0.a(this, moy0Var.b(), moy0Var.c(), moy0Var.a(), bmt0Var.b, bmt0Var.c, bmt0Var.d, bmt0Var.e, bmt0Var.f, bmt0Var.g, bmt0Var.h, bmt0Var.i, bmt0Var.j, bmt0Var.k, bmt0Var.l, bmt0Var.m, bmt0Var.n, bmt0Var.o, bmt0Var.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmt0)) {
            return false;
        }
        bmt0 bmt0Var = (bmt0) obj;
        return b(bmt0Var) && c(bmt0Var);
    }

    public final int hashCode() {
        moy0 moy0Var = this.a;
        long b = moy0Var.b();
        int i = ldc.n;
        int hashCode = Long.hashCode(b) * 31;
        ml6 c = moy0Var.c();
        int hashCode2 = (Float.hashCode(moy0Var.a()) + ((hashCode + (c != null ? c.hashCode() : 0)) * 31)) * 31;
        tty0[] tty0VarArr = sty0.b;
        int c2 = qv10.c(hashCode2, 31, this.b);
        lzr lzrVar = this.c;
        int i2 = (c2 + (lzrVar != null ? lzrVar.a : 0)) * 31;
        hzr hzrVar = this.d;
        int hashCode3 = (i2 + (hzrVar != null ? Integer.hashCode(hzrVar.a) : 0)) * 31;
        izr izrVar = this.e;
        int hashCode4 = (hashCode3 + (izrVar != null ? Integer.hashCode(izrVar.a) : 0)) * 31;
        eyr eyrVar = this.f;
        int hashCode5 = (hashCode4 + (eyrVar != null ? eyrVar.hashCode() : 0)) * 31;
        String str = this.g;
        int c3 = qv10.c((hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.h);
        td5 td5Var = this.i;
        int hashCode6 = (c3 + (td5Var != null ? Float.hashCode(td5Var.a) : 0)) * 31;
        soy0 soy0Var = this.j;
        int hashCode7 = (hashCode6 + (soy0Var != null ? soy0Var.hashCode() : 0)) * 31;
        k5z k5zVar = this.k;
        int c4 = qv10.c((hashCode7 + (k5zVar != null ? k5zVar.a.hashCode() : 0)) * 31, 31, this.l);
        rly0 rly0Var = this.m;
        int i3 = (c4 + (rly0Var != null ? rly0Var.a : 0)) * 31;
        bgr0 bgr0Var = this.n;
        int hashCode8 = (i3 + (bgr0Var != null ? bgr0Var.hashCode() : 0)) * 31;
        dwc0 dwc0Var = this.o;
        int hashCode9 = (hashCode8 + (dwc0Var != null ? dwc0Var.hashCode() : 0)) * 31;
        ram ramVar = this.p;
        return hashCode9 + (ramVar != null ? ramVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        moy0 moy0Var = this.a;
        sb.append((Object) ldc.i(moy0Var.b()));
        sb.append(", brush=");
        sb.append(moy0Var.c());
        sb.append(", alpha=");
        sb.append(moy0Var.a());
        sb.append(", fontSize=");
        sb.append((Object) sty0.e(this.b));
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.g);
        sb.append(", letterSpacing=");
        sb.append((Object) sty0.e(this.h));
        sb.append(", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        xvz.w(this.l, ", textDecoration=", sb);
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.o);
        sb.append(", drawStyle=");
        sb.append(this.p);
        sb.append(')');
        return sb.toString();
    }

    public bmt0(moy0 moy0Var, long j, lzr lzrVar, hzr hzrVar, izr izrVar, eyr eyrVar, String str, long j2, td5 td5Var, soy0 soy0Var, k5z k5zVar, long j3, rly0 rly0Var, bgr0 bgr0Var, dwc0 dwc0Var, ram ramVar) {
        this.a = moy0Var;
        this.b = j;
        this.c = lzrVar;
        this.d = hzrVar;
        this.e = izrVar;
        this.f = eyrVar;
        this.g = str;
        this.h = j2;
        this.i = td5Var;
        this.j = soy0Var;
        this.k = k5zVar;
        this.l = j3;
        this.m = rly0Var;
        this.n = bgr0Var;
        this.o = dwc0Var;
        this.p = ramVar;
    }

    public bmt0(long j, long j2, lzr lzrVar, hzr hzrVar, izr izrVar, eyr eyrVar, String str, long j3, td5 td5Var, soy0 soy0Var, k5z k5zVar, long j4, rly0 rly0Var, bgr0 bgr0Var, dwc0 dwc0Var) {
        this(j != 16 ? new ghc(j) : loy0.a, j2, lzrVar, hzrVar, izrVar, eyrVar, str, j3, td5Var, soy0Var, k5zVar, j4, rly0Var, bgr0Var, dwc0Var, null);
    }
}
