package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.gse;
import defpackage.ha2;
import defpackage.o3i;
import defpackage.vfx0;
import defpackage.viv0;
import defpackage.wiq0;

/* loaded from: classes14.dex */
public final class m {
    public final vfx0 a;
    public final com.yandex.go.summary.mapper.a b;
    public final ha2 c;

    public m(wiq0 wiq0Var, o3i o3iVar, viv0 viv0Var, vfx0 vfx0Var, com.yandex.go.summary.mapper.a aVar) {
        this.a = vfx0Var;
        this.b = aVar;
        this.c = kotlinx.coroutines.flow.e.n(viv0Var.j(), kotlinx.coroutines.flow.e.s(((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).j.b(), new gse(20)), o3iVar.b, new DeliveryDoorToDoorRequirementUiStateInteractor$uiStateFlow$2(this, null));
    }
}
