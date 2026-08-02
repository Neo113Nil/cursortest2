package defpackage;

import kotlin.a;

/* loaded from: classes9.dex */
public final class d650 implements fw {
    public final r3l0 a;
    public final i3y b = a.a(new b650(this, 7));
    public final i3y c = a.a(new b650(this, 8));
    public final i3y d = a.a(new b650(this, 9));
    public final i3y e = a.a(new b650(this, 10));
    public final i3y f = a.a(new b650(this, 11));
    public final i3y g = a.a(new b650(this, 12));
    public final i3y h = a.a(new b650(this, 13));
    public final i3y i = a.a(new b650(this, 14));
    public txl j;

    public d650(r3l0 r3l0Var) {
        this.a = r3l0Var;
    }

    public final r3l0 a() {
        return (r3l0) this.b.getValue();
    }

    public final dw b(g0c g0cVar) {
        if (g0cVar.equals(qoi0.a(hj4.class))) {
            return (ij4) this.c.getValue();
        }
        if (g0cVar.equals(qoi0.a(iyj.class))) {
            return (jyj) this.d.getValue();
        }
        if (g0cVar.equals(qoi0.a(t9s.class))) {
            return (u9s) this.e.getValue();
        }
        if (g0cVar.equals(qoi0.a(eiu.class))) {
            return (fiu) this.f.getValue();
        }
        if (g0cVar.equals(qoi0.a(w090.class))) {
            return (x090) this.g.getValue();
        }
        if (g0cVar.equals(qoi0.a(y7s0.class))) {
            return (z7s0) this.h.getValue();
        }
        if (g0cVar.equals(qoi0.a(w8s0.class))) {
            return (x8s0) this.i.getValue();
        }
        return null;
    }

    @Override // defpackage.fw
    public final dw handler(kr krVar, klc klcVar) {
        if (!jl40.l(this.j, klcVar)) {
            this.j = (txl) klcVar;
        }
        return handler(krVar);
    }

    @Override // defpackage.fw
    public final dw handler(kr krVar) {
        return b(qoi0.a(krVar.getClass()));
    }
}
