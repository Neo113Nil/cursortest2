package defpackage;

import android.content.Context;
import com.yandex.go.chargers.debt.screen.ChargersDebtModalView;
import com.yandex.go.chargers.debt.screen.a;
import com.yandex.go.chargers.debt.screen.domain.b;

/* loaded from: classes12.dex */
public final class lj9 extends m230 {
    public final w030 E;
    public final yvf0 F;
    public final yvf0 G;
    public final mp9 H;
    public final aq9 I;
    public final yvf0 J;

    public lj9(w030 w030Var, yvf0 yvf0Var, yvf0 yvf0Var2, mp9 mp9Var, aq9 aq9Var, yvf0 yvf0Var3) {
        super(null);
        this.E = w030Var;
        this.F = yvf0Var;
        this.G = yvf0Var2;
        this.H = mp9Var;
        this.I = aq9Var;
        this.J = yvf0Var3;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        kj9 kj9Var = new kj9(this);
        an8 an8Var = this.I.a;
        return new ChargersDebtModalView((Context) this.H.a.a.get(), new a((em9) ((xvf0) an8Var.c).get(), (com.yandex.go.chargers.error.data.a) ((xvf0) an8Var.w).get(), (com.yandex.go.chargers.debt.screen.domain.a) ((dx7) an8Var.x).get(), (b) ((yc) an8Var.b).get(), kj9Var));
    }
}
