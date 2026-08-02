package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.caj0;
import defpackage.lci;
import defpackage.maj0;
import defpackage.tpr;
import defpackage.vfx0;
import defpackage.viv0;
import defpackage.wiq0;

/* loaded from: classes14.dex */
public final class b0 {
    public final vfx0 a;
    public final caj0 b;
    public final maj0 c;
    public final lci d;
    public final com.yandex.go.summary.mapper.a e;
    public final viv0 f;
    public final wiq0 g;

    public b0(vfx0 vfx0Var, caj0 caj0Var, maj0 maj0Var, lci lciVar, com.yandex.go.summary.mapper.a aVar, viv0 viv0Var, wiq0 wiq0Var) {
        this.a = vfx0Var;
        this.b = caj0Var;
        this.c = maj0Var;
        this.d = lciVar;
        this.e = aVar;
        this.f = viv0Var;
        this.g = wiq0Var;
    }

    public final tpr a() {
        return kotlinx.coroutines.flow.e.t(new kotlinx.coroutines.flow.m0(this.f.j(), kotlinx.coroutines.flow.e.X(((com.yandex.go.taxi.tariffs.internal.repository.k) this.g).j.b(), new RequiredAltChoiceUiStateInteractor$altChoiceDataFlow$$inlined$flatMapLatest$1(this, null)), new RequiredAltChoiceUiStateInteractor$uiStateFlow$1(this, null)));
    }
}
