package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.gmi;
import defpackage.gse;
import defpackage.ha2;
import defpackage.vfx0;
import defpackage.viv0;
import defpackage.wiq0;
import defpackage.yli;

/* loaded from: classes14.dex */
public final class n {
    public final yli a;
    public final vfx0 b;
    public final com.yandex.go.summary.mapper.a c;
    public final gmi d;
    public final ha2 e;

    public n(wiq0 wiq0Var, yli yliVar, com.yandex.go.delivery.rental_duration_selector.requirement.c cVar, viv0 viv0Var, vfx0 vfx0Var, com.yandex.go.summary.mapper.a aVar, gmi gmiVar) {
        this.a = yliVar;
        this.b = vfx0Var;
        this.c = aVar;
        this.d = gmiVar;
        this.e = kotlinx.coroutines.flow.e.n(viv0Var.j(), kotlinx.coroutines.flow.e.s(((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).j.b(), new gse(21)), cVar.a(), new DeliveryRentalRequirementUiStateInteractor$uiStateFlow$2(this, null));
    }
}
