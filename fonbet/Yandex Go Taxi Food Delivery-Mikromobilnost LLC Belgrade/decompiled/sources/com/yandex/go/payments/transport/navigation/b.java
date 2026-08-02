package com.yandex.go.payments.transport.navigation;

import defpackage.gtq0;
import defpackage.h55;
import defpackage.iz30;
import defpackage.of30;
import defpackage.tje;
import defpackage.ur30;
import defpackage.yvf0;

/* loaded from: classes13.dex */
public final class b extends h55 {
    public final yvf0 D;
    public final iz30 E;
    public final ru.yandex.taxi.deeplinks.b F;

    public b(yvf0 yvf0Var, iz30 iz30Var, ru.yandex.taxi.deeplinks.b bVar) {
        super(null);
        this.D = yvf0Var;
        this.E = iz30Var;
        this.F = bVar;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        ur30 ur30Var = (ur30) obj;
        tje.N(o(), null, null, new MtPaymentSelectionStackNavigationRouterImpl$onLaunch$1(this, null), 3);
        a aVar = (a) this.D.get();
        if (gtq0.u(aVar)) {
            aVar.i();
        }
        A(aVar, ur30Var, new of30(this, 1));
    }
}
