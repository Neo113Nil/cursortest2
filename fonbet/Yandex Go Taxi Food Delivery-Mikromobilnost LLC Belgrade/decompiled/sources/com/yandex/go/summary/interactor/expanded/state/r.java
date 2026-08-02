package com.yandex.go.summary.interactor.expanded.state;

import com.yandex.go.payments.domain.m0;
import defpackage.akv0;
import defpackage.b2k;
import defpackage.dcx0;
import defpackage.ha2;
import defpackage.jcx0;
import defpackage.tpr;
import defpackage.txk;
import defpackage.wiq0;
import defpackage.xqf0;
import defpackage.z0a0;
import defpackage.zuj0;

/* loaded from: classes14.dex */
public final class r {
    public final wiq0 a;
    public final m0 b;
    public final z0a0 c;
    public final akv0 d;
    public final zuj0 e;
    public final ru.yandex.taxi.summary.solid.interactor.p f;
    public final xqf0 g;
    public final ha2 h;

    public r(dcx0 dcx0Var, wiq0 wiq0Var, m0 m0Var, ru.yandex.taxi.orderbutton.summary.base.interactors.i iVar, jcx0 jcx0Var, z0a0 z0a0Var, akv0 akv0Var, zuj0 zuj0Var, ru.yandex.taxi.summary.solid.interactor.p pVar, xqf0 xqf0Var) {
        this.a = wiq0Var;
        this.b = m0Var;
        this.c = z0a0Var;
        this.d = akv0Var;
        this.e = zuj0Var;
        this.f = pVar;
        this.g = xqf0Var;
        com.yandex.go.taxi.tariffs.internal.repository.k kVar = (com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var;
        b2k s = kotlinx.coroutines.flow.e.s(kVar.j.b(), new txk(25));
        tpr t = kotlinx.coroutines.flow.e.t(com.yandex.go.coroutines.b.d(new q(kotlinx.coroutines.flow.e.X(pVar.c(kotlinx.coroutines.flow.e.X(s, new FooterUiStateInteractor$promoUiStateFlow$$inlined$flatMapLatest$1(null, this, s)), new FooterUiStateInteractor$promoUiStateFlow$1(1, this, r.class, "currentTariffDescriptionFlow", "currentTariffDescriptionFlow(Lru/yandex/taxi/tariffs/model/BaseTariffInfo;)Lkotlinx/coroutines/flow/Flow;", 0)), new FooterUiStateInteractor$promoUiStateFlow$$inlined$flatMapLatest$2(3, null)), this), new FooterUiStateInteractor$promoUiStateFlow$$inlined$start$1(2, null)));
        g gVar = new g(kVar.j.b());
        tpr t2 = kotlinx.coroutines.flow.e.t(new i(gVar));
        this.h = kotlinx.coroutines.flow.e.n(t, kotlinx.coroutines.flow.e.n(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(t2, new FooterUiStateInteractor$paymentInfoButtonUiStateFlow$$inlined$flatMapLatest$1(null, this))), kotlinx.coroutines.flow.e.t(new m(iVar.b(gVar, new k(jcx0Var.b), false), this)), kotlinx.coroutines.flow.e.X(t2, new FooterUiStateInteractor$tariffOptionsButtonUiStateFlow$$inlined$flatMapLatest$1(null, this)), new FooterUiStateInteractor$footerButtonsUiStateFlow$1(4, null)), dcx0Var.b, new FooterUiStateInteractor$uiStateFlow$1(4, null));
    }
}
