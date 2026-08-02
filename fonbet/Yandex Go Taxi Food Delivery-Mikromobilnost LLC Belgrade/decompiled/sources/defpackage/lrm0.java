package defpackage;

import android.content.Context;
import com.yandex.go.scooters.passes.active.v3.freeze.c;
import defpackage.agd;
import defpackage.avm0;
import defpackage.csm0;
import defpackage.g92;
import defpackage.hum0;
import defpackage.ism0;
import defpackage.ium0;
import defpackage.jrm0;
import defpackage.krm0;
import defpackage.lrm0;
import defpackage.lum0;
import defpackage.mbd;
import defpackage.mth;
import defpackage.obd;
import defpackage.oum0;
import defpackage.prm0;
import defpackage.qum0;
import defpackage.srm0;
import defpackage.tbd;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.uyj;
import defpackage.vrm0;
import defpackage.xrm0;
import defpackage.yfd;
import defpackage.yrm0;
import defpackage.zy11;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class lrm0 extends pgd {
    public final /* synthetic */ int F = 1;
    public final Context G;
    public final w030 H;
    public final yvf0 I;
    public final mu5 J;

    public lrm0(yp1 yp1Var, pzo0 pzo0Var, Context context, w030 w030Var, yvf0 yvf0Var) {
        super(0);
        this.G = context;
        this.H = w030Var;
        this.I = yvf0Var;
        this.J = new mu5(new lxo0(1, this, yp1Var, pzo0Var));
    }

    @Override // defpackage.pgd
    public final wfd P() {
        switch (this.F) {
        }
        return this.J;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        switch (this.F) {
        }
        return this.G;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        switch (this.F) {
        }
        return this.H;
    }

    public lrm0(m2p0 m2p0Var, k2p0 k2p0Var, Context context, w030 w030Var, gzn0 gzn0Var) {
        super(0);
        this.G = context;
        this.H = w030Var;
        this.I = gzn0Var;
        this.J = new mu5(new lxo0(2, this, m2p0Var, k2p0Var));
    }

    public lrm0(final vrm0 vrm0Var, final c cVar, Context context, w030 w030Var, yvf0 yvf0Var) {
        super(0);
        this.G = context;
        this.H = w030Var;
        this.I = yvf0Var;
        this.J = new mu5(new tls() { // from class: com.yandex.go.scooters.passes.active.v3.freeze.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                final yfd yfdVar = (yfd) obj;
                final lrm0 lrm0Var = lrm0.this;
                final krm0 krm0Var = new krm0(lrm0Var);
                final prm0 prm0Var = new prm0();
                avm0 avm0Var = ((jrm0) ((agd) yfdVar).a).a;
                vrm0 vrm0Var2 = vrm0Var;
                tpr t = e.t(e.m(vrm0Var2.b.a(), new mth(new g92(2, avm0Var.i), 6), prm0Var.a, prm0Var.b, new ScootersActivePassesV3FreezeUiStateInteractor$uiStateFlow$1(vrm0Var2, null)));
                vrm0Var2.a.getClass();
                agd agdVar = (agd) yfdVar;
                agdVar.c = e.F(t, uyj.a);
                final c cVar2 = cVar;
                agdVar.e = new tls() { // from class: com.yandex.go.scooters.passes.active.v3.freeze.b
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        tje.N(lrm0.this.o(), null, null, new ScootersActivePassesV3FreezeRouter$content$1$1$1(cVar2, (srm0) obj2, yfdVar, krm0Var, prm0Var, null), 3);
                        return zy11.a;
                    }
                };
                mbd.a.getClass();
                agdVar.g = mbd.b;
                return zy11.a;
            }
        });
    }

    public lrm0(final ism0 ism0Var, final com.yandex.go.scooters.passes.active.v3.renew.disabling.c cVar, Context context, w030 w030Var, yvf0 yvf0Var) {
        super(0);
        this.G = context;
        this.H = w030Var;
        this.I = yvf0Var;
        this.J = new mu5(new tls() { // from class: com.yandex.go.scooters.passes.active.v3.renew.disabling.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                final yfd yfdVar = (yfd) obj;
                final lrm0 lrm0Var = lrm0.this;
                final yrm0 yrm0Var = new yrm0(lrm0Var);
                avm0 avm0Var = ((xrm0) ((agd) yfdVar).a).a;
                ism0 ism0Var2 = ism0Var;
                tpr t = e.t(new m0(ism0Var2.b.a(), new g92(2, avm0Var), new ScootersActivePassesV3RenewDisablingUiStateInteractor$uiStateFlow$1(ism0Var2, null)));
                ism0Var2.a.getClass();
                agd agdVar = (agd) yfdVar;
                agdVar.c = e.F(t, uyj.a);
                final c cVar2 = cVar;
                agdVar.e = new tls() { // from class: com.yandex.go.scooters.passes.active.v3.renew.disabling.b
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        tje.N(lrm0.this.o(), null, null, new ScootersActivePassesV3RenewDisablingRouter$content$1$1$1(cVar2, (csm0) obj2, yfdVar, yrm0Var, null), 3);
                        return zy11.a;
                    }
                };
                obd.a.getClass();
                agdVar.g = obd.b;
                return zy11.a;
            }
        });
    }

    public lrm0(final qum0 qum0Var, final com.yandex.go.scooters.passes.active.v3.winback.c cVar, Context context, w030 w030Var, yvf0 yvf0Var) {
        super(0);
        this.G = context;
        this.H = w030Var;
        this.I = yvf0Var;
        this.J = new mu5(new tls() { // from class: com.yandex.go.scooters.passes.active.v3.winback.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                final yfd yfdVar = (yfd) obj;
                final lrm0 lrm0Var = lrm0.this;
                final ium0 ium0Var = new ium0(lrm0Var);
                final lum0 lum0Var = new lum0();
                avm0 avm0Var = ((hum0) ((agd) yfdVar).a).a;
                qum0 qum0Var2 = qum0Var;
                tpr t = e.t(e.n(qum0Var2.b.a(), new mth(new g92(2, avm0Var.j), 6), e.d((r0) lum0Var.b), new ScootersActivePassesV3WinbackUiStateInteractor$uiStateFlow$1(qum0Var2, null)));
                qum0Var2.a.getClass();
                agd agdVar = (agd) yfdVar;
                agdVar.c = e.F(t, uyj.a);
                final c cVar2 = cVar;
                agdVar.e = new tls() { // from class: com.yandex.go.scooters.passes.active.v3.winback.b
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        tje.N(lrm0.this.o(), null, null, new ScootersActivePassesV3WinbackRouter$content$1$1$1(cVar2, yfdVar, (oum0) obj2, ium0Var, lum0Var, null), 3);
                        return zy11.a;
                    }
                };
                tbd.a.getClass();
                agdVar.g = tbd.b;
                return zy11.a;
            }
        });
    }
}
