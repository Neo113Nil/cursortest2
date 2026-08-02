package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.tpr;
import defpackage.viv0;

/* loaded from: classes14.dex */
public final class u {
    public final ru.yandex.taxi.summary.requirements.list.interactors.y a;
    public final com.yandex.go.summary.mapper.a b;
    public final viv0 c;

    public u(ru.yandex.taxi.summary.requirements.list.interactors.y yVar, com.yandex.go.summary.mapper.a aVar, viv0 viv0Var) {
        this.a = yVar;
        this.b = aVar;
        this.c = viv0Var;
    }

    public final tpr a() {
        return kotlinx.coroutines.flow.e.t(new kotlinx.coroutines.flow.m0(this.c.j(), this.a.a(), new GluedDueRequirementUiStateInteractor$uiStateFlow$1(this, null)));
    }
}
