package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.tpr;
import defpackage.viv0;

/* loaded from: classes14.dex */
public final class v {
    public final ru.yandex.taxi.requirements.glued.interactor.c a;
    public final com.yandex.go.summary.mapper.a b;
    public final viv0 c;

    public v(ru.yandex.taxi.requirements.glued.interactor.c cVar, com.yandex.go.summary.mapper.a aVar, viv0 viv0Var) {
        this.a = cVar;
        this.b = aVar;
        this.c = viv0Var;
    }

    public final tpr a() {
        return kotlinx.coroutines.flow.e.t(new kotlinx.coroutines.flow.m0(this.c.j(), this.a.a(), new GluedRequirementsUiStateInteractor$uiStateFlow$1(this, null)));
    }
}
