package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import defpackage.oxs0;
import defpackage.tpr;
import defpackage.viv0;
import defpackage.yt11;
import defpackage.zuj0;

/* loaded from: classes14.dex */
public final class o0 implements yt11 {
    public final zuj0 a;
    public final tpr b;

    public o0(zuj0 zuj0Var, viv0 viv0Var, oxs0 oxs0Var) {
        this.a = zuj0Var;
        viv0Var.getClass();
        tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.t(new com.yandex.go.tariffcard.experiment.w(ru.yandex.taxi.experiments.d.a(viv0Var))));
        oxs0Var.getClass();
        this.b = kotlinx.coroutines.flow.e.t(new kotlinx.coroutines.flow.m0(t, kotlinx.coroutines.flow.e.t(new com.yandex.go.taxi.summary.shared.models.c(ru.yandex.taxi.experiments.d.a(oxs0Var), oxs0Var)), new TariffHeaderConfigsUiStateInteractor$tariffHeaderConfigsUiStateFlow$1(this, null)));
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.b;
    }
}
