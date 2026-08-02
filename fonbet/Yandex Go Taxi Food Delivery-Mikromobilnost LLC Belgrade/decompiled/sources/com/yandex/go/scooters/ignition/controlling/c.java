package com.yandex.go.scooters.ignition.controlling;

import android.content.Context;
import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import defpackage.agd;
import defpackage.brn0;
import defpackage.eqn0;
import defpackage.h3y;
import defpackage.jpj0;
import defpackage.mpn0;
import defpackage.mu5;
import defpackage.pgd;
import defpackage.sqn0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.uyj;
import defpackage.vpn0;
import defpackage.w030;
import defpackage.wbd;
import defpackage.wfd;
import defpackage.yfd;
import defpackage.yvf0;
import defpackage.z8n0;
import defpackage.zy11;
import kotlinx.coroutines.flow.internal.g;

/* loaded from: classes13.dex */
public final class c extends pgd {
    public final Context F;
    public final w030 G;
    public final yvf0 H;
    public final h3y I;
    public final yvf0 J;
    public final jpj0 K;
    public final z8n0 L;
    public final mu5 M;

    public c(final sqn0 sqn0Var, final f fVar, Context context, w030 w030Var, yvf0 yvf0Var, h3y h3yVar, yvf0 yvf0Var2, jpj0 jpj0Var, z8n0 z8n0Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = yvf0Var;
        this.I = h3yVar;
        this.J = yvf0Var2;
        this.K = jpj0Var;
        this.L = z8n0Var;
        this.M = new mu5(new tls() { // from class: com.yandex.go.scooters.ignition.controlling.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                yfd yfdVar = (yfd) obj;
                final c cVar = c.this;
                final mpn0 mpn0Var = new mpn0(cVar);
                final vpn0 vpn0Var = new vpn0();
                sqn0 sqn0Var2 = sqn0Var;
                tpr a = sqn0Var2.d.a();
                zy11 zy11Var = zy11.a;
                g X = kotlinx.coroutines.flow.e.X(com.yandex.go.coroutines.b.d(vpn0Var.a, new ScootersIgnitionControllingUiStateInteractor$optionsStateHolderFlow$$inlined$start$1(zy11Var, null)), new ScootersIgnitionControllingUiStateInteractor$optionsStateHolderFlow$$inlined$flatMapLatest$1(sqn0Var2, null));
                brn0 brn0Var = sqn0Var2.c;
                ScootersIgnitionExperiment.Companion.getClass();
                tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(a, X, com.yandex.go.scooters.utils.a.a(brn0Var, ScootersIgnitionExperiment.t), new ScootersIgnitionControllingUiStateInteractor$uiStateFlow$1(sqn0Var2, null)));
                sqn0Var2.a.getClass();
                ((agd) yfdVar).c = kotlinx.coroutines.flow.e.F(t, uyj.a);
                final f fVar2 = fVar;
                agd agdVar = (agd) yfdVar;
                agdVar.e = new tls() { // from class: com.yandex.go.scooters.ignition.controlling.b
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        tje.N(c.this.o(), null, null, new ScootersIgnitionControllingRouter$content$1$1$1(fVar2, (eqn0) obj2, mpn0Var, vpn0Var, null), 3);
                        return zy11.a;
                    }
                };
                wbd.a.getClass();
                agdVar.g = wbd.b;
                return zy11Var;
            }
        });
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new ScootersIgnitionControllingRouter$onLaunch$1(this, null), 3);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.M;
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
