package com.yandex.go.taxi.order.domain.interactors;

import defpackage.iup0;
import defpackage.o2y0;
import defpackage.tpr;

/* loaded from: classes14.dex */
public final class p {
    public final com.yandex.go.taxi.order.experiments.h a;
    public final com.yandex.go.taxi.order.repositories.c b;
    public final iup0 c;

    public p(com.yandex.go.taxi.order.experiments.h hVar, com.yandex.go.taxi.order.repositories.c cVar, iup0 iup0Var) {
        this.a = hVar;
        this.b = cVar;
        this.c = iup0Var;
    }

    public final tpr a(o2y0 o2y0Var) {
        return kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(new m(this.a.a(o2y0Var)), new k(this.b.a(o2y0Var)), new kotlinx.coroutines.flow.n(new o(((com.yandex.go.taxi.order.domain.repositories.n) this.c).h(o2y0Var)), new SearchProgressInteractor$isProgressVisible$shouldDisableProgressFlow$2(2, null)), new SearchProgressInteractor$isProgressVisible$1(4, null)));
    }
}
