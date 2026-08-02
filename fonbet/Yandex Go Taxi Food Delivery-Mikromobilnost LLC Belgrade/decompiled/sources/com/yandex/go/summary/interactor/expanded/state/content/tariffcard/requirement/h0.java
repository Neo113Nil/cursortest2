package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.joj0;
import defpackage.kdd0;
import defpackage.mth;
import defpackage.npj0;
import defpackage.tpr;
import defpackage.uyj;
import defpackage.viv0;
import ru.yandex.taxi.summary.requirements.list.interactors.RequirementsExtraPhoneStateInteractor$extraPhoneStateFlow$$inlined$flatMapLatest$1;
import ru.yandex.taxi.summary.requirements.list.interactors.u0;

/* loaded from: classes14.dex */
public final class h0 {
    public final kdd0 a;
    public final com.yandex.go.summary.mapper.a b;
    public final tpr c;

    public h0(kdd0 kdd0Var, ru.yandex.taxi.summary.requirements.list.interactors.a aVar, ru.yandex.taxi.summary.requirements.list.interactors.y yVar, ru.yandex.taxi.summary.requirements.list.interactors.o oVar, ru.yandex.taxi.summary.requirements.list.interactors.i iVar, u0 u0Var, joj0 joj0Var, npj0 npj0Var, com.yandex.go.summary.mapper.a aVar2, viv0 viv0Var) {
        this.a = kdd0Var;
        this.b = aVar2;
        tpr j = viv0Var.j();
        tpr a = aVar.a();
        tpr a2 = iVar.a();
        tpr a3 = yVar.a();
        kotlinx.coroutines.flow.m0 a4 = oVar.a();
        tpr a5 = npj0Var.a();
        tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(joj0Var.b.e(), new RequirementsExtraPhoneStateInteractor$extraPhoneStateFlow$$inlined$flatMapLatest$1(null, joj0Var)));
        joj0Var.d.getClass();
        this.c = kotlinx.coroutines.flow.e.t(new kotlinx.coroutines.flow.m0(j, new mth(new g0(new e0(new c0(new tpr[]{a, a2, a3, a4, a5, kotlinx.coroutines.flow.e.F(t, uyj.a), u0Var.f()}, this))), 6), new SoloRequirementsUiStateInteractor$uiStateFlow$1(this, null)));
    }
}
