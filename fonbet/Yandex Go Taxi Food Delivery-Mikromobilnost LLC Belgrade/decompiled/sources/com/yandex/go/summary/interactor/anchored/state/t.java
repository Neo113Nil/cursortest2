package com.yandex.go.summary.interactor.anchored.state;

import com.yandex.go.payments.domain.m0;
import defpackage.akv0;
import defpackage.mrj;
import defpackage.mth;
import defpackage.tpr;
import defpackage.txk;
import defpackage.wiq0;
import defpackage.xqf0;
import defpackage.yt11;
import defpackage.z0a0;
import defpackage.zuj0;

/* loaded from: classes14.dex */
public final class t implements yt11 {
    public final wiq0 a;
    public final m0 b;
    public final ru.yandex.taxi.summary.solid.interactor.p c;
    public final z0a0 d;
    public final akv0 e;
    public final zuj0 f;
    public final xqf0 g;
    public final ru.yandex.taxi.summary.solid.interactor.s h;
    public final kotlinx.coroutines.flow.m0 i;

    public t(wiq0 wiq0Var, m0 m0Var, ru.yandex.taxi.orderbutton.summary.base.interactors.i iVar, ru.yandex.taxi.summary.solid.interactor.p pVar, mrj mrjVar, z0a0 z0a0Var, akv0 akv0Var, zuj0 zuj0Var, xqf0 xqf0Var, ru.yandex.taxi.summary.solid.interactor.s sVar) {
        this.a = wiq0Var;
        this.b = m0Var;
        this.c = pVar;
        this.d = z0a0Var;
        this.e = akv0Var;
        this.f = zuj0Var;
        this.g = xqf0Var;
        this.h = sVar;
        com.yandex.go.taxi.tariffs.internal.repository.k kVar = (com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var;
        o oVar = new o(kotlinx.coroutines.flow.e.s(kVar.j.b(), new txk(26)));
        tpr t = kotlinx.coroutines.flow.e.t(com.yandex.go.coroutines.b.d(new q(kotlinx.coroutines.flow.e.X(mrjVar.r(new mth(oVar, 6), new FooterUiStateInteractor$promoUiStateFlow$bottomNotificationFlow$1(1, this, t.class, "currentTariffDescriptionFlow", "currentTariffDescriptionFlow(Lru/yandex/taxi/tariffs/model/BaseTariffInfo;)Lkotlinx/coroutines/flow/Flow;", 0), kotlinx.coroutines.flow.e.X(oVar, new FooterUiStateInteractor$promoUiStateFlow$$inlined$flatMapLatest$1(null, this))), new FooterUiStateInteractor$promoUiStateFlow$$inlined$flatMapLatest$2(3, null)), this), new FooterUiStateInteractor$promoUiStateFlow$$inlined$start$1(2, null)));
        g gVar = new g(kVar.j.b());
        tpr t2 = kotlinx.coroutines.flow.e.t(new i(gVar));
        this.i = new kotlinx.coroutines.flow.m0(t, kotlinx.coroutines.flow.e.n(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(t2, new FooterUiStateInteractor$paymentInfoButtonUiStateFlow$$inlined$flatMapLatest$1(null, this))), kotlinx.coroutines.flow.e.t(new k(iVar.b(gVar, null, true), this)), kotlinx.coroutines.flow.e.X(t2, new FooterUiStateInteractor$tariffOptionsButtonUiStateFlow$$inlined$flatMapLatest$1(null, this)), new FooterUiStateInteractor$footerButtonsUiStateFlow$1(4, null)), new FooterUiStateInteractor$uiStateFlow$1(3, null));
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.i;
    }
}
