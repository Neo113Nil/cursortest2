package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.kdd0;
import defpackage.tpr;
import defpackage.viv0;
import defpackage.zkz0;

/* loaded from: classes14.dex */
public final class a0 {
    public final kdd0 a;
    public final com.yandex.go.summary.mapper.a b;
    public final tpr c;

    public a0(kdd0 kdd0Var, zkz0 zkz0Var, ru.yandex.taxi.summary.requirements.list.interactors.k0 k0Var, com.yandex.go.summary.mapper.a aVar, viv0 viv0Var) {
        this.a = kdd0Var;
        this.b = aVar;
        this.c = kotlinx.coroutines.flow.e.t(new kotlinx.coroutines.flow.m0(viv0Var.j(), new kotlinx.coroutines.flow.m0(new z(k0Var.b(), kdd0Var), zkz0Var.b, new GroupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$1(this, null)), new GroupWithTopRequirementsUiStateInteractor$uiStateFlow$1(this, null)));
    }
}
