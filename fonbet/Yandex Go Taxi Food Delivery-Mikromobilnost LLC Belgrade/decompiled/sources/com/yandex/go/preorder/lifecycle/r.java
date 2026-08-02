package com.yandex.go.preorder.lifecycle;

import defpackage.pft0;
import defpackage.tse;

/* loaded from: classes13.dex */
public final class r implements pft0 {
    public final ru.yandex.taxi.preorder.interactor.g a;

    public r(ru.yandex.taxi.preorder.interactor.g gVar) {
        this.a = gVar;
    }

    @Override // defpackage.pft0
    public final void d(tse tseVar) {
        com.yandex.go.coroutines.b.g(tseVar, null, null, new UpdateLocationWhenCloseSummaryLifecycleListener$onResume$1(this, null), 3);
    }
}
