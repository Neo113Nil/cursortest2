package com.yandex.go.scooters.ignition.panel;

import android.content.Context;
import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import defpackage.agd;
import defpackage.brn0;
import defpackage.hrn0;
import defpackage.m580;
import defpackage.mrn0;
import defpackage.mu5;
import defpackage.pgd;
import defpackage.rrn0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.trn0;
import defpackage.uyj;
import defpackage.w030;
import defpackage.wfd;
import defpackage.ybd;
import defpackage.yfd;
import defpackage.yrn0;
import defpackage.yvf0;
import defpackage.zy11;

/* loaded from: classes13.dex */
public final class c extends pgd {
    public final Context F;
    public final w030 G;
    public final brn0 H;
    public final yvf0 I;
    public final m580 J;
    public final mu5 K;

    public c(final yrn0 yrn0Var, final trn0 trn0Var, Context context, w030 w030Var, brn0 brn0Var, yvf0 yvf0Var, m580 m580Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = brn0Var;
        this.I = yvf0Var;
        this.J = m580Var;
        this.K = new mu5(new tls() { // from class: com.yandex.go.scooters.ignition.panel.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                yfd yfdVar = (yfd) obj;
                final c cVar = c.this;
                final hrn0 hrn0Var = new hrn0(cVar);
                final mrn0 mrn0Var = new mrn0();
                yrn0 yrn0Var2 = yrn0Var;
                yrn0Var2.getClass();
                zy11 zy11Var = zy11.a;
                tpr d = com.yandex.go.coroutines.b.d(mrn0Var.a, new ScootersIgnitionPanelUiStateInteractor$uiStateFlow$$inlined$start$1(zy11Var, null));
                brn0 brn0Var2 = yrn0Var2.e;
                ScootersIgnitionExperiment.Companion.getClass();
                tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(d, com.yandex.go.scooters.utils.a.a(brn0Var2, ScootersIgnitionExperiment.t), yrn0Var2.f.a(), new ScootersIgnitionPanelUiStateInteractor$uiStateFlow$1(yrn0Var2, null)));
                yrn0Var2.a.getClass();
                ((agd) yfdVar).c = kotlinx.coroutines.flow.e.F(t, uyj.a);
                final trn0 trn0Var2 = trn0Var;
                agd agdVar = (agd) yfdVar;
                agdVar.e = new tls() { // from class: com.yandex.go.scooters.ignition.panel.b
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        tje.N(c.this.o(), null, null, new ScootersIgnitionPanelRouter$content$1$1$1(trn0Var2, (rrn0) obj2, hrn0Var, mrn0Var, null), 3);
                        return zy11.a;
                    }
                };
                ybd.a.getClass();
                agdVar.g = ybd.b;
                return zy11Var;
            }
        });
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        tje.N(o(), null, null, new ScootersIgnitionPanelRouter$onAttach$1(this, (zy11) obj, null), 3);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.K;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
