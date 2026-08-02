package com.yandex.go.summary.interactor.common.state;

import defpackage.ldv0;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.yt11;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class h implements yt11 {
    public final m0 a;

    public h(com.yandex.go.summary.interactor.anchored.state.a aVar, com.yandex.go.summary.interactor.expanded.state.a aVar2, ldv0 ldv0Var, com.yandex.go.taxi.summary.shared.lifecycle.a aVar3) {
        this.a = new m0(aVar.a, com.yandex.go.coroutines.b.d(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.T(kotlinx.coroutines.flow.e.K(new rol0(new SummaryModalBottomSheetUiStateInteractor$lcpTriggerFlow$1(aVar3, null)), new g(new e(ldv0Var.b))), 1), new SummaryModalBottomSheetUiStateInteractor$special$$inlined$flatMapLatest$1(null, aVar2)), new SummaryModalBottomSheetUiStateInteractor$special$$inlined$start$1(2, null)), new SummaryModalBottomSheetUiStateInteractor$uiStateFlow$1(3, null));
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.a;
    }
}
