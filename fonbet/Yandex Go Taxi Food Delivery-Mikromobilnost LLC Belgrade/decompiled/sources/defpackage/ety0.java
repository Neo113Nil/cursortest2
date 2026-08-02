package defpackage;

/* loaded from: classes.dex */
public final class ety0 {
    public static final ety0 d = new ety0(0, 0, null, null, null, null, 0, 0, 0, null, null, 16777215);
    public final bmt0 a;
    public final gc90 b;
    public final iwc0 c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ety0(long j, long j2, lzr lzrVar, hzr hzrVar, eyr eyrVar, String str, long j3, int i, long j4, iwc0 iwc0Var, ehy ehyVar, int i2) {
        this(new bmt0(r4, r6, r8, r9, (izr) null, r11, r12, r13, (td5) null, (soy0) null, (k5z) null, r18, (rly0) null, (bgr0) null, r3 != null ? r3.a : null), new gc90(r1, 0, r23, null, r15 != null ? r15.b : null, r0, 0, 0, null), r15);
        long j5 = (i2 & 1) != 0 ? ldc.m : j;
        long j6 = (i2 & 2) != 0 ? sty0.c : j2;
        lzr lzrVar2 = (i2 & 4) != 0 ? null : lzrVar;
        hzr hzrVar2 = (i2 & 8) != 0 ? null : hzrVar;
        eyr eyrVar2 = (i2 & 32) != 0 ? null : eyrVar;
        String str2 = (i2 & 64) != 0 ? null : str;
        long j7 = (i2 & 128) != 0 ? sty0.c : j3;
        long j8 = ldc.m;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j9 = (131072 & i2) != 0 ? sty0.c : j4;
        iwc0 iwc0Var2 = (524288 & i2) != 0 ? null : iwc0Var;
        ehy ehyVar2 = (i2 & 1048576) != 0 ? null : ehyVar;
        iwc0 iwc0Var3 = iwc0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v14, types: [ram] */
    public static ety0 a(ety0 ety0Var, long j, long j2, lzr lzrVar, hzr hzrVar, eyr eyrVar, long j3, td5 td5Var, bgr0 bgr0Var, jvu0 jvu0Var, int i, long j4, iwc0 iwc0Var, ehy ehyVar, int i2) {
        long j5;
        long j6;
        try0 try0Var;
        moy0 moy0Var;
        int i3;
        dwc0 dwc0Var;
        long b = (i2 & 1) != 0 ? ety0Var.a.a.b() : j;
        long j7 = (i2 & 2) != 0 ? ety0Var.a.b : j2;
        lzr lzrVar2 = (i2 & 4) != 0 ? ety0Var.a.c : lzrVar;
        hzr hzrVar2 = (i2 & 8) != 0 ? ety0Var.a.d : hzrVar;
        bmt0 bmt0Var = ety0Var.a;
        izr izrVar = bmt0Var.e;
        eyr eyrVar2 = (i2 & 32) != 0 ? bmt0Var.f : eyrVar;
        String str = bmt0Var.g;
        long j8 = (i2 & 128) != 0 ? bmt0Var.h : j3;
        td5 td5Var2 = (i2 & 256) != 0 ? bmt0Var.i : td5Var;
        soy0 soy0Var = bmt0Var.j;
        k5z k5zVar = bmt0Var.k;
        long j9 = bmt0Var.l;
        rly0 rly0Var = (i2 & 4096) != 0 ? bmt0Var.m : rly0.c;
        bgr0 bgr0Var2 = (i2 & 8192) != 0 ? bmt0Var.n : bgr0Var;
        jvu0 jvu0Var2 = (i2 & 16384) != 0 ? bmt0Var.p : jvu0Var;
        int i4 = (32768 & i2) != 0 ? ety0Var.b.a : i;
        gc90 gc90Var = ety0Var.b;
        int i5 = gc90Var.b;
        if ((i2 & 131072) != 0) {
            j5 = j9;
            j6 = gc90Var.c;
        } else {
            j5 = j9;
            j6 = j4;
        }
        apy0 apy0Var = gc90Var.d;
        iwc0 iwc0Var2 = (i2 & 524288) != 0 ? ety0Var.c : iwc0Var;
        ehy ehyVar2 = (i2 & 1048576) != 0 ? gc90Var.f : ehyVar;
        int i6 = gc90Var.g;
        int i7 = gc90Var.h;
        try0 try0Var2 = gc90Var.i;
        moy0 ghcVar = ldc.c(b, bmt0Var.a.b()) ? bmt0Var.a : b != 16 ? new ghc(b) : loy0.a;
        if (iwc0Var2 != null) {
            moy0Var = ghcVar;
            i3 = i6;
            dwc0Var = iwc0Var2.a;
            try0Var = try0Var2;
        } else {
            try0Var = try0Var2;
            moy0Var = ghcVar;
            i3 = i6;
            dwc0Var = null;
        }
        return new ety0(new bmt0(moy0Var, j7, lzrVar2, hzrVar2, izrVar, eyrVar2, str, j8, td5Var2, soy0Var, k5zVar, j5, rly0Var, bgr0Var2, dwc0Var, jvu0Var2), new gc90(i4, i5, j6, apy0Var, iwc0Var2 != null ? iwc0Var2.b : null, ehyVar2, i3, i7, try0Var), iwc0Var2);
    }

    public static ety0 e(ety0 ety0Var, long j, long j2, lzr lzrVar, hzr hzrVar, eyr eyrVar, long j3, rly0 rly0Var, int i, long j4, int i2) {
        long j5 = (i2 & 1) != 0 ? ldc.m : j;
        long j6 = (i2 & 2) != 0 ? sty0.c : j2;
        lzr lzrVar2 = (i2 & 4) != 0 ? null : lzrVar;
        hzr hzrVar2 = (i2 & 8) != 0 ? null : hzrVar;
        eyr eyrVar2 = (i2 & 32) != 0 ? null : eyrVar;
        long j7 = (i2 & 128) != 0 ? sty0.c : j3;
        long j8 = ldc.m;
        rly0 rly0Var2 = (i2 & 4096) != 0 ? null : rly0Var;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j9 = (i2 & 131072) != 0 ? sty0.c : j4;
        bmt0 a = cmt0.a(ety0Var.a, j5, null, Float.NaN, j6, lzrVar2, hzrVar2, null, eyrVar2, null, j7, null, null, null, j8, rly0Var2, null, null, null);
        gc90 a2 = hc90.a(ety0Var.b, i3, 0, j9, null, null, null, 0, 0, null);
        return (ety0Var.a == a && ety0Var.b == a2) ? ety0Var : new ety0(a, a2);
    }

    public final long b() {
        return this.a.a.b();
    }

    public final boolean c(ety0 ety0Var) {
        if (this != ety0Var) {
            return jl40.l(this.b, ety0Var.b) && this.a.b(ety0Var.a);
        }
        return true;
    }

    public final ety0 d(ety0 ety0Var) {
        return (ety0Var == null || ety0Var.equals(d)) ? this : new ety0(this.a.d(ety0Var.a), this.b.a(ety0Var.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ety0)) {
            return false;
        }
        ety0 ety0Var = (ety0) obj;
        return jl40.l(this.a, ety0Var.a) && jl40.l(this.b, ety0Var.b) && jl40.l(this.c, ety0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        iwc0 iwc0Var = this.c;
        return hashCode + (iwc0Var != null ? iwc0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) ldc.i(b()));
        sb.append(", brush=");
        bmt0 bmt0Var = this.a;
        sb.append(bmt0Var.a.c());
        sb.append(", alpha=");
        sb.append(bmt0Var.a.a());
        sb.append(", fontSize=");
        sb.append((Object) sty0.e(bmt0Var.b));
        sb.append(", fontWeight=");
        sb.append(bmt0Var.c);
        sb.append(", fontStyle=");
        sb.append(bmt0Var.d);
        sb.append(", fontSynthesis=");
        sb.append(bmt0Var.e);
        sb.append(", fontFamily=");
        sb.append(bmt0Var.f);
        sb.append(", fontFeatureSettings=");
        sb.append(bmt0Var.g);
        sb.append(", letterSpacing=");
        sb.append((Object) sty0.e(bmt0Var.h));
        sb.append(", baselineShift=");
        sb.append(bmt0Var.i);
        sb.append(", textGeometricTransform=");
        sb.append(bmt0Var.j);
        sb.append(", localeList=");
        sb.append(bmt0Var.k);
        sb.append(", background=");
        xvz.w(bmt0Var.l, ", textDecoration=", sb);
        sb.append(bmt0Var.m);
        sb.append(", shadow=");
        sb.append(bmt0Var.n);
        sb.append(", drawStyle=");
        sb.append(bmt0Var.p);
        sb.append(", textAlign=");
        gc90 gc90Var = this.b;
        sb.append((Object) sjy0.a(gc90Var.a));
        sb.append(", textDirection=");
        sb.append((Object) vly0.a(gc90Var.b));
        sb.append(", lineHeight=");
        sb.append((Object) sty0.e(gc90Var.c));
        sb.append(", textIndent=");
        sb.append(gc90Var.d);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(gc90Var.f);
        sb.append(", lineBreak=");
        sb.append((Object) kgy.a(gc90Var.g));
        sb.append(", hyphens=");
        sb.append((Object) n2v.a(gc90Var.h));
        sb.append(", textMotion=");
        sb.append(gc90Var.i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ety0(bmt0 bmt0Var, gc90 gc90Var) {
        this(bmt0Var, gc90Var, (r0 == null && r1 == null) ? null : new iwc0(r0, r1));
        dwc0 dwc0Var = bmt0Var.o;
        tvc0 tvc0Var = gc90Var.e;
    }

    public ety0(bmt0 bmt0Var, gc90 gc90Var, iwc0 iwc0Var) {
        this.a = bmt0Var;
        this.b = gc90Var;
        this.c = iwc0Var;
    }
}
