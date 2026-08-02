package xsna;

import com.facebook.soloader.MinElf;
import xsna.q630;
import xsna.v4s;

/* compiled from: HeightInLinesModifier.kt */
/* loaded from: classes11.dex */
public final class w1v extends q630.c implements nvi, noy, hr70 {
    public nmo0 p;
    public int q;
    public int r;
    public boolean s;
    public int t;
    public int u;
    public nmo0 v;
    public mtk0<? extends Object> w;

    @Override // xsna.hr70
    public final void D1() {
        if (this.w != null) {
            ir70.a(this, new odm(this, 13));
        }
        this.s = true;
        itl.f(this).Q();
    }

    @Override // xsna.q630.c
    public final boolean X1() {
        return false;
    }

    @Override // xsna.q630.c
    public final void a2() {
        v4s.a aVar = (v4s.a) ovi.a(this, uvi.k);
        this.v = tmo0.a(this.p, itl.f(this).A);
        v4s v4sVar = i2().a.f;
        b6s b6sVar = i2().a.c;
        if (b6sVar == null) {
            b6sVar = b6s.h;
        }
        u5s u5sVar = i2().a.d;
        int i = u5sVar != null ? u5sVar.a : 0;
        v5s v5sVar = i2().a.e;
        this.w = aVar.a(v4sVar, b6sVar, i, v5sVar != null ? v5sVar.a : MinElf.PN_XNUM);
        ir70.a(this, new k6k(this, 18));
        this.s = true;
    }

    @Override // xsna.q630.c
    public final void b2() {
        this.v = null;
        this.w = null;
        this.s = false;
    }

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        if (this.s) {
            nmo0 i2 = i2();
            v4s.a aVar = (v4s.a) ovi.a(this, uvi.k);
            String str = sfo0.a;
            int a = (int) (sfo0.a(i2, ep10Var, aVar, str, 1) & 4294967295L);
            int a2 = ((int) (sfo0.a(i2, ep10Var, aVar, v1v.a('\n', str, str), 2) & 4294967295L)) - a;
            int i = this.q;
            this.t = i == 1 ? -1 : ir.b(i, 1, a2, a);
            int i3 = this.r;
            this.u = i3 == Integer.MAX_VALUE ? -1 : ir.b(i3, 1, a2, a);
            this.s = false;
        }
        int i4 = this.t;
        int g = i4 != -1 ? swe0.g(i4, o6j.j(j), o6j.h(j)) : o6j.j(j);
        int i5 = this.u;
        tra0 N = zo10Var.N(o6j.b(0, j, 0, g, i5 != -1 ? swe0.g(i5, o6j.j(j), o6j.h(j)) : o6j.h(j), 3));
        return ep10Var.Q(N.b, N.c, jgp.b, new n1d(N, 22));
    }

    public final nmo0 i2() {
        nmo0 nmo0Var = this.v;
        if (nmo0Var != null) {
            return nmo0Var;
        }
        throw jq.f("Resolved style is not set.");
    }

    @Override // xsna.htl, xsna.cmb0
    public final void q() {
        this.s = true;
        itl.f(this).Q();
    }

    @Override // xsna.htl
    public final void y1() {
        this.v = tmo0.a(this.p, itl.f(this).A);
        this.s = true;
        itl.f(this).Q();
    }
}
