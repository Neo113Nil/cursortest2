package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.fox0;

/* compiled from: WidgetSettingsTabFeature.kt */
/* loaded from: classes6.dex */
public final class gox0 extends wk50<mox0, lox0, fox0, jox0> {
    public final ynx0 f;

    public gox0(kox0 kox0Var, ynx0 ynx0Var) {
        super(fox0.b.b, kox0Var);
        this.f = ynx0Var;
    }

    @Override // xsna.wk50
    public final void N(lox0 lox0Var, fox0 fox0Var) {
        fox0 fox0Var2 = fox0Var;
        boolean equals = fox0Var2.equals(fox0.b.b);
        ynx0 ynx0Var = this.f;
        if (equals) {
            this.e.b(hg1.h(new io.reactivex.rxjava3.internal.operators.observable.c0(ynx0Var.d(), new whm0(new n9m0(this, 28), 14), io.reactivex.rxjava3.internal.functions.a.c), new vgs0(this, 17)));
        } else {
            if (!(fox0Var2 instanceof fox0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            fox0.a aVar = (fox0.a) fox0Var2;
            tnx0 tnx0Var = aVar.b;
            ynx0Var.c(tnx0Var.c().b, aVar.c);
        }
    }
}
