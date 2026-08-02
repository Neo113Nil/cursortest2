package com.yandex.go.taxi.order.tariff_upgrade.domain;

import defpackage.mdh;
import defpackage.n20;
import defpackage.npx0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.flow.o;

/* loaded from: classes14.dex */
public final class c {
    public final l a;
    public final n20 b;
    public final npx0 c;
    public final tt2 d;

    public c(l lVar, n20 n20Var, npx0 npx0Var, tt2 tt2Var) {
        this.a = lVar;
        this.b = n20Var;
        this.c = npx0Var;
        this.d = tt2Var;
    }

    public final tpr a() {
        o oVar = new o(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.X(((com.yandex.go.taxi.order.provider.a) this.b).a(), new ActiveOrdersTariffUpgradeInteractor$activeOrdersTariffUpgradeFlow$$inlined$flatMapLatest$1(3, null)), new ActiveOrdersTariffUpgradeInteractor$activeOrdersTariffUpgradeFlow$$inlined$flatMapLatest$2(this, null)), new ActiveOrdersTariffUpgradeInteractor$activeOrdersTariffUpgradeFlow$3(this, null));
        this.d.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(oVar, mdh.b);
    }
}
