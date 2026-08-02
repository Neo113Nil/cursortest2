package defpackage;

import android.net.Uri;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment;
import com.yandex.go.payments.shared.business.accountcreation.corp.personalaccount.a;
import com.yandex.go.payments.shared.y;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;

/* loaded from: classes13.dex */
public final class cve {
    public final yvf0 a;
    public final hue b;
    public final a c;
    public final yvf0 d;
    public final zue e;
    public final yvf0 f;
    public final oep0 g;

    public cve(yvf0 yvf0Var, hue hueVar, a aVar, yvf0 yvf0Var2, zue zueVar, yvf0 yvf0Var3, oep0 oep0Var) {
        this.a = yvf0Var;
        this.b = hueVar;
        this.c = aVar;
        this.d = yvf0Var2;
        this.e = zueVar;
        this.f = yvf0Var3;
        this.g = oep0Var;
    }

    public final void a() {
        ((y) this.f.get()).c();
    }

    public final void b(SharedPaymentsOpenReason sharedPaymentsOpenReason, Runnable runnable, aue aueVar, tmr0 tmr0Var, Uri uri) {
        ue5 ue5Var = new ue5(this, uri, sharedPaymentsOpenReason, runnable, aueVar, tmr0Var, 1);
        boolean l = jl40.l(((iue) this.b).a(), gue.g);
        int i = 0;
        oep0 oep0Var = this.g;
        if (!l) {
            a();
            ((pep0) oep0Var).f(new y4c0((pue) this.a.get(), new ave(ue5Var, 1), new bve(runnable, this, 0), new bve(runnable, this, 1), 4), new mue(sharedPaymentsOpenReason), hxx.a);
            return;
        }
        if (aueVar.a.i != null) {
            CorpAccountFlowExperiment corpAccountFlowExperiment = aueVar.a;
            CorpAccountFlowExperiment.CorpCreationNavigatorModalDto corpCreationNavigatorModalDto = corpAccountFlowExperiment.i;
            ate ateVar = corpCreationNavigatorModalDto == null ? null : new ate(corpCreationNavigatorModalDto, corpAccountFlowExperiment.c);
            if (ateVar != null) {
                ((pep0) oep0Var).f(new pw1(2, (com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator.a) this.d.get(), new ave(ue5Var, i)), ateVar, hxx.a);
                return;
            }
        }
        ue5Var.run();
    }
}
