package defpackage;

import android.content.Context;
import com.yandex.go.safety.center.analytics.a;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.j;
import com.yandex.go.safety.center.share.SafetyCenterPromoShareView;

/* loaded from: classes13.dex */
public final class aul0 extends n95 {
    public final ztl0 F;
    public final ltl0 G;
    public final w030 H;
    public final boolean I = true;

    public aul0(ztl0 ztl0Var, ltl0 ltl0Var, w030 w030Var) {
        this.F = ztl0Var;
        this.G = ltl0Var;
        this.H = w030Var;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.H;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.I;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        hrl0 hrl0Var = new hrl0();
        pgk0 pgk0Var = new pgk0(7, this);
        gus gusVar = this.G.a;
        ktl0 ktl0Var = new ktl0((j) gusVar.a.get(), (a) gusVar.b.get(), hrl0Var, pgk0Var);
        zz7 zz7Var = this.F.a;
        return new SafetyCenterPromoShareView((Context) zz7Var.a.get(), ktl0Var, (SafetyCenterExperiment) zz7Var.b.get());
    }
}
