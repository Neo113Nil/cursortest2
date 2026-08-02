package defpackage;

import androidx.lifecycle.Lifecycle;
import ru.yandex.taxi.linked_order.a;

/* loaded from: classes9.dex */
public final class n10 implements vw60 {
    public final Lifecycle a;
    public final yvf0 b;
    public final a c;
    public final oep0 d;
    public g18 e = g18.u1;

    public n10(Lifecycle lifecycle, yvf0 yvf0Var, a aVar, oep0 oep0Var) {
        this.a = lifecycle;
        this.b = yvf0Var;
        this.c = aVar;
        this.d = oep0Var;
    }

    @Override // defpackage.vw60
    public final void c() {
        this.e = this.c.m.h(new p10() { // from class: m10
            @Override // defpackage.p10
            public final void x9(sny snyVar) {
                n10 n10Var = n10.this;
                ((pep0) n10Var.d).f((m950) n10Var.b.get(), new hre0(qtb1.M, new ase0(snyVar), "make another order from linked", false, new im0(false)), hxx.a);
            }
        });
        cey.b(this.a, Lifecycle.Event.ON_DESTROY, new b7(1, this));
    }

    @Override // defpackage.s150
    public final String getName() {
        return "ActiveLinkedOrderActivityListener";
    }
}
