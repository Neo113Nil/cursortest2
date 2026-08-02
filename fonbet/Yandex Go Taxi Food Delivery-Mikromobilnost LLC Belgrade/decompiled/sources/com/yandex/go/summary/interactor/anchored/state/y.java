package com.yandex.go.summary.interactor.anchored.state;

import defpackage.fgv0;
import defpackage.tpr;
import defpackage.yt11;
import defpackage.zuj0;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class y implements yt11 {
    public final zuj0 a;
    public final m0 b;

    public y(fgv0 fgv0Var, ru.yandex.taxi.multiorder.e eVar, zuj0 zuj0Var) {
        this.a = zuj0Var;
        this.b = new m0(kotlinx.coroutines.flow.e.t(new x(eVar.a(), this)), kotlinx.coroutines.flow.e.t(new v(fgv0Var.e, this)), new ToolbarUiStateInteractor$uiStateFlow$1(3, null));
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.b;
    }
}
