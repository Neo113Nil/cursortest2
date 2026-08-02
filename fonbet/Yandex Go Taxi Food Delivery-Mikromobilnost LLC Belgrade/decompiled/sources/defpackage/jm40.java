package defpackage;

/* loaded from: classes10.dex */
public final class jm40 implements fwi {
    public dry0 a;
    public final /* synthetic */ km40 b;

    public jm40(km40 km40Var) {
        this.b = km40Var;
    }

    public final dry0 a(long j, long j2) {
        km40 km40Var = this.b;
        ety0 ety0Var = km40Var.l;
        long a = sty0.d(j2) ? lm40.a(km40Var.l.a.b, j2) : j2;
        if (!sty0.a(a, km40Var.l.a.b)) {
            km40Var.f(ety0.a(km40Var.l, 0L, a, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213));
        }
        long h = km40Var.f > 1 ? km40Var.h(j, km40Var.n) : j;
        dry0 g = km40Var.g(km40Var.n, h, km40Var.b(h, km40Var.n));
        this.a = g;
        km40Var.f(ety0Var);
        return g;
    }

    @Override // defpackage.fwi
    public final float getDensity() {
        return this.b.k.getDensity();
    }

    @Override // defpackage.fwi
    public final float i0(long j) {
        if (!sty0.d(j)) {
            return getDensity() * i(j);
        }
        km40 km40Var = this.b;
        if (sty0.d(km40Var.l.a.b)) {
            ny61.r("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable's style.fontSize with Sp units instead.");
            return 0.0f;
        }
        if (sty0.a(km40Var.l.a.b, sty0.c)) {
            ny61.r("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size.");
            return 0.0f;
        }
        return sty0.c(j) * i0(km40Var.l.a.b);
    }

    @Override // defpackage.fwi
    public final float u0() {
        return this.b.k.u0();
    }
}
