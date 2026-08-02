package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubFooterDtoV2;
import defpackage.fyu;
import defpackage.g92;
import defpackage.kgx;
import defpackage.kz6;
import defpackage.me31;
import defpackage.tpr;

/* loaded from: classes14.dex */
public final class h {
    public final fyu a;
    public final me31 b;
    public final com.yandex.go.taxi.summary.mobilityhub.mapper.e c;

    static {
        kgx[] kgxVarArr = fyu.g;
    }

    public h(fyu fyuVar, me31 me31Var, com.yandex.go.taxi.summary.mobilityhub.mapper.e eVar) {
        this.a = fyuVar;
        this.b = me31Var;
        this.c = eVar;
    }

    public final tpr a(HubFooterDtoV2 hubFooterDtoV2, kz6 kz6Var) {
        if (hubFooterDtoV2 == null) {
            return new g92(2, null);
        }
        fyu fyuVar = this.a;
        return kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.n(fyuVar.d, fyuVar.f, new kotlinx.coroutines.flow.n(this.b.g, new HubFooterV2UiStateInteractor$stateFlow$1(2, null)), new HubFooterV2UiStateInteractor$stateFlow$2(4, null)), new HubFooterV2UiStateInteractor$stateFlow$3(this, hubFooterDtoV2, kz6Var, null)));
    }
}
