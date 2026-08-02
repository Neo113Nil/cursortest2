package com.yandex.go.taxi.summary.intercity;

import com.yandex.go.taxi.summary.models.ForceTariffSwitchForIntercityOrdersExperiment;
import defpackage.i2s;
import defpackage.jbh;
import defpackage.mdh;
import defpackage.pft0;
import defpackage.pse;
import defpackage.rqo;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;

/* loaded from: classes14.dex */
public final class e implements pft0 {
    public final i2s a;
    public final com.yandex.go.navigation.screen.c b;
    public final tt2 c;
    public final tpr d;

    public e(i2s i2sVar, com.yandex.go.navigation.screen.c cVar, tt2 tt2Var, rqo rqoVar) {
        this.a = i2sVar;
        this.b = cVar;
        this.c = tt2Var;
        this.d = ((jbh) rqoVar).c(ForceTariffSwitchForIntercityOrdersExperiment.k).a();
    }

    @Override // defpackage.pft0
    public final void a(tse tseVar) {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        com.yandex.go.coroutines.b.g(tseVar, mdh.b.plus(new pse("MultipleTariffSwitching")), null, new MultipleTariffSwitchingInteractor$onAttach$1(this, null), 2);
    }
}
