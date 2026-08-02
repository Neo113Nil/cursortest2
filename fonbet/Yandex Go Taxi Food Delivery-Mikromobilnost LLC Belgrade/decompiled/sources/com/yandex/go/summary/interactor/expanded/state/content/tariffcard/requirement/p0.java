package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.kdd0;
import defpackage.tpr;
import defpackage.viv0;

/* loaded from: classes14.dex */
public final class p0 {
    public final kdd0 a;
    public final com.yandex.go.summary.mapper.a b;
    public final tpr c;

    public p0(ru.yandex.taxi.summary.requirements.list.interactors.l0 l0Var, kdd0 kdd0Var, com.yandex.go.summary.mapper.a aVar, viv0 viv0Var) {
        this.a = kdd0Var;
        this.b = aVar;
        this.c = kotlinx.coroutines.flow.e.t(new kotlinx.coroutines.flow.m0(viv0Var.j(), new o0(l0Var.a(), this), new TariffRulesUiStateInteractor$uiStateFlow$1(this, null)));
    }
}
