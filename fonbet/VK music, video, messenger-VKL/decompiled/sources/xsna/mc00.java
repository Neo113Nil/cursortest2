package xsna;

import android.view.View;

/* compiled from: Magnifier.android.kt */
/* loaded from: classes11.dex */
public final class mc00 extends d730<nc00> {
    public final izs<azl, ov70> a;
    public final izs<uco, s3q0> b;
    public final float c;
    public final boolean d;
    public final long e;
    public final float f;
    public final float g;
    public final boolean h;
    public final uta0 i;

    public mc00() {
        throw null;
    }

    public mc00(izs izsVar, izs izsVar2, uta0 uta0Var) {
        this.a = izsVar;
        this.b = izsVar2;
        this.c = Float.NaN;
        this.d = true;
        this.e = 9205357640488583168L;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = true;
        this.i = uta0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc00)) {
            return false;
        }
        mc00 mc00Var = (mc00) obj;
        return this.a == mc00Var.a && this.c == mc00Var.c && this.d == mc00Var.d && uco.a(this.e, mc00Var.e) && pco.b(this.f, mc00Var.f) && pco.b(this.g, mc00Var.g) && this.h == mc00Var.h && this.b == mc00Var.b && epx.f(this.i, mc00Var.i);
    }

    public final int hashCode() {
        int b = qoy.b(io.reactivex.rxjava3.subjects.b.a(this.g, io.reactivex.rxjava3.subjects.b.a(this.f, bh10.a(qoy.b(io.reactivex.rxjava3.subjects.b.a(this.c, this.a.hashCode() * 961, 31), 31, this.d), 31, this.e), 31), 31), 31, this.h);
        izs<uco, s3q0> izsVar = this.b;
        return this.i.hashCode() + ((b + (izsVar != null ? izsVar.hashCode() : 0)) * 31);
    }

    @Override // xsna.d730
    public final nc00 r() {
        return new nc00(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    @Override // xsna.d730
    public final void s(nc00 nc00Var) {
        nc00 nc00Var2 = nc00Var;
        float f = nc00Var2.r;
        long j = nc00Var2.t;
        float f2 = nc00Var2.u;
        boolean z = nc00Var2.s;
        float f3 = nc00Var2.v;
        boolean z2 = nc00Var2.w;
        uta0 uta0Var = nc00Var2.x;
        View view = nc00Var2.y;
        azl azlVar = nc00Var2.z;
        nc00Var2.p = this.a;
        float f4 = this.c;
        nc00Var2.r = f4;
        boolean z3 = this.d;
        nc00Var2.s = z3;
        long j2 = this.e;
        nc00Var2.t = j2;
        float f5 = this.f;
        nc00Var2.u = f5;
        float f6 = this.g;
        nc00Var2.v = f6;
        boolean z4 = this.h;
        nc00Var2.w = z4;
        nc00Var2.q = this.b;
        uta0 uta0Var2 = this.i;
        nc00Var2.x = uta0Var2;
        View a = jtl.a(nc00Var2);
        azl azlVar2 = itl.f(nc00Var2).z;
        if (nc00Var2.A != null) {
            sgi0<gzs<ov70>> sgi0Var = oc00.a;
            if (((!Float.isNaN(f4) || !Float.isNaN(f)) && f4 != f && !uta0Var2.a()) || !uco.a(j2, j) || !pco.b(f5, f2) || !pco.b(f6, f3) || z3 != z || z4 != z2 || !epx.f(uta0Var2, uta0Var) || !a.equals(view) || !epx.f(azlVar2, azlVar)) {
                nc00Var2.j2();
            }
        }
        nc00Var2.k2();
    }
}
