package com.yandex.go.pickuppoints.impl;

import defpackage.jbh;
import defpackage.mdh;
import defpackage.pft0;
import defpackage.pse;
import defpackage.qqo;
import defpackage.rqo;
import defpackage.sjh;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wiq0;

/* loaded from: classes13.dex */
public final class o implements pft0 {
    public final tt2 a;
    public final wiq0 b;
    public final l c;
    public final qqo d;

    public o(tt2 tt2Var, wiq0 wiq0Var, l lVar, rqo rqoVar) {
        this.a = tt2Var;
        this.b = wiq0Var;
        this.c = lVar;
        ClarifyPointsScreenStrategyConfigurationExperiment.Companion.getClass();
        this.d = ((jbh) rqoVar).c(ClarifyPointsScreenStrategyConfigurationExperiment.d);
    }

    @Override // defpackage.pft0
    public final void a(tse tseVar) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        com.yandex.go.coroutines.b.g(tseVar, mdh.b.plus(new pse("PickupPointsZoomLevelUpdate")), null, new PickupPointsZoomLevelUpdateInteractor$onAttach$1(this, null), 2);
    }
}
