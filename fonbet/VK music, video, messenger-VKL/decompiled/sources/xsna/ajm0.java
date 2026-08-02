package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.ejm0;
import xsna.hjm0;
import xsna.njm0;
import xsna.vim0;

/* compiled from: StoryTemplateFeature.kt */
/* loaded from: classes6.dex */
public final class ajm0 extends wk50<sjm0, ojm0, vim0, hjm0> {
    public final rjm0 f;
    public final d6m0 g;
    public final f4z h;
    public final f4z i;

    public ajm0(ljm0 ljm0Var, rjm0 rjm0Var, d6m0 d6m0Var) {
        super(vim0.b.b, ljm0Var);
        this.f = rjm0Var;
        this.g = d6m0Var;
        this.h = new f4z();
        this.i = new f4z();
    }

    @Override // xsna.wk50
    public final void N(ojm0 ojm0Var, vim0 vim0Var) {
        vim0 vim0Var2 = vim0Var;
        boolean z = vim0Var2 instanceof vim0.b;
        rjm0 rjm0Var = this.f;
        if (z) {
            T(hjm0.d.b);
            a7f0.a.f(this, rjm0Var.a.a().l(new u1j0(new e750(16), 5)).l(new mlh0(new zyl0(rjm0Var, 4), 1)), new mcj0(this, 8), null, 5);
            io.reactivex.rxjava3.internal.operators.single.y l = rjm0Var.a.b().l(new mrc0(new qjm0(rjm0Var, 0), 7));
            asu0 asu0Var = asu0.a;
            a7f0.a.f(this, l.q(asu0Var.c()).m(asu0Var.d()), new hfm0(this, 1), new wug0(this, 11), 1);
            return;
        }
        if (vim0Var2 instanceof vim0.c) {
            ejm0.a aVar = ((vim0.c) vim0Var2).b;
            rjm0Var.getClass();
            io.reactivex.rxjava3.internal.operators.observable.f0 K = new io.reactivex.rxjava3.internal.operators.mixed.q(new io.reactivex.rxjava3.internal.operators.single.v(new k3c0(aVar, 3)), new si60(new ev60(13), 10)).K();
            asu0 asu0Var2 = asu0.a;
            a7f0.a.f(this, K.q(asu0Var2.c()).m(asu0Var2.d()), new ufg0(6, this, aVar), new b8e0(this, 11), 1);
            return;
        }
        if (vim0Var2 instanceof vim0.a) {
            rjm0Var.a();
            T(hjm0.e.b);
        } else {
            if (!(vim0Var2 instanceof vim0.d)) {
                throw new NoWhenBranchMatchedException();
            }
            rjm0Var.a();
            T(hjm0.e.b);
            this.i.b(njm0.a.a);
        }
    }

    public final wj50<fjm0> U() {
        return this.h;
    }

    public final wj50<njm0> V() {
        return this.i;
    }
}
