package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import com.yandex.go.tariffcard.ui.UnsupportedRequirementsInteractor$uiStateFlow$$inlined$flatMapLatest$1;
import defpackage.tpr;
import defpackage.viv0;
import defpackage.x421;

/* loaded from: classes14.dex */
public final class q0 {
    public final x421 a;
    public final com.yandex.go.summary.mapper.a b;
    public final viv0 c;

    public q0(x421 x421Var, com.yandex.go.summary.mapper.a aVar, viv0 viv0Var) {
        this.a = x421Var;
        this.b = aVar;
        this.c = viv0Var;
    }

    public final tpr a() {
        tpr j = this.c.j();
        x421 x421Var = this.a;
        return kotlinx.coroutines.flow.e.t(new kotlinx.coroutines.flow.m0(j, kotlinx.coroutines.flow.e.X(((com.yandex.go.taxi.tariffs.internal.repository.k) x421Var.c).j.b(), new UnsupportedRequirementsInteractor$uiStateFlow$$inlined$flatMapLatest$1(null, x421Var)), new UnsupportedRequirementsUiStateInteractor$uiStateFlow$1(this, null)));
    }
}
