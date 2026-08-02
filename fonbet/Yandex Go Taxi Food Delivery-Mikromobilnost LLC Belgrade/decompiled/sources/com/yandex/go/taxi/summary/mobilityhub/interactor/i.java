package com.yandex.go.taxi.summary.mobilityhub.interactor;

import defpackage.lhq0;
import defpackage.pwy0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;

/* loaded from: classes14.dex */
public final class i {
    public final lhq0 a;
    public final pwy0 b;
    public final com.yandex.go.taxi.summary.mobilityhub.mapper.b c;
    public final tpr d;

    public i(lhq0 lhq0Var, pwy0 pwy0Var, com.yandex.go.taxi.summary.mobilityhub.mapper.b bVar, tt2 tt2Var, com.yandex.go.route.interactor.b bVar2) {
        this.a = lhq0Var;
        this.b = pwy0Var;
        this.c = bVar;
        this.d = kotlinx.coroutines.flow.e.t(bVar2.k());
    }

    public final tpr a() {
        return kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.n(this.a.c, this.b.a(), this.d, new HubRoutePinsFlowInteractor$hubRoutePinsFlow$1(4, null)), new HubRoutePinsFlowInteractor$hubRoutePinsFlow$2(this, null)), uyj.a);
    }
}
