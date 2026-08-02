package defpackage;

import android.content.Context;
import defpackage.agd;
import defpackage.k5d;
import defpackage.lua;
import defpackage.mua;
import defpackage.pua;
import defpackage.qua;
import defpackage.tje;
import defpackage.tls;
import defpackage.xua;
import defpackage.yfd;
import defpackage.zy11;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes12.dex */
public final class mua extends pgd {
    public final Context F;
    public final w030 G;
    public final yvf0 H;
    public final xua I;
    public final mu5 J;

    public mua(final qua quaVar, Context context, w030 w030Var, yvf0 yvf0Var, xua xuaVar) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = yvf0Var;
        this.I = xuaVar;
        this.J = new mu5(new tls() { // from class: com.yandex.go.chargers.subscription.presentation.polling.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                yfd yfdVar = (yfd) obj;
                final mua muaVar = mua.this;
                final lua luaVar = new lua(muaVar);
                tje.N(muaVar.o(), null, null, new ChargersSubscriptionPollingRouter$content$1$1(muaVar, yfdVar, null), 3);
                xua xuaVar2 = muaVar.I;
                ((agd) yfdVar).c = new m0(xuaVar2.d.c.a, xuaVar2.a.a(), new ChargersSubscriptionPollingUiStateInteractor$uiStateFlow$1(xuaVar2, null));
                final qua quaVar2 = quaVar;
                agd agdVar = (agd) yfdVar;
                agdVar.e = new tls() { // from class: com.yandex.go.chargers.subscription.presentation.polling.b
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        tje.N(mua.this.o(), null, null, new ChargersSubscriptionPollingRouter$content$1$2$1(quaVar2, (pua) obj2, luaVar, null), 3);
                        return zy11.a;
                    }
                };
                k5d.a.getClass();
                agdVar.g = k5d.b;
                return zy11.a;
            }
        });
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        x4e.z(1, this.I.d.b.a, null);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.J;
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
