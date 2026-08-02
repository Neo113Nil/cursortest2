package com.yandex.go.taxi.order.queue.mapper;

import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$QueueSearch;
import com.yandex.go.taxi.order.queue.interactor.QueueInteractor$queueModelFlow$$inlined$map$2$2$1;
import com.yandex.go.taxi.order.queue.presentation.QueueInitialState;
import com.yandex.go.zone.dto.objects.QueueScreen;
import defpackage.bvf0;
import defpackage.k7x0;
import defpackage.o2y0;
import defpackage.pdc;
import defpackage.qjg0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.c;

/* loaded from: classes14.dex */
public final class a {
    public final c a;
    public final k7x0 b;
    public final pdc c;

    public a(pdc pdcVar, k7x0 k7x0Var, c cVar) {
        this.a = cVar;
        this.b = k7x0Var;
        this.c = pdcVar;
    }

    public static final Object a(a aVar, QueueScreen queueScreen, qjg0 qjg0Var, SuspendLambda suspendLambda) {
        aVar.getClass();
        return bvf0.n(new QueueInfoToModelMapper$mapScreen$2(queueScreen, qjg0Var, aVar, null), suspendLambda);
    }

    public final Object b(o2y0 o2y0Var, SearchInfoResponse$QueueSearch.QueueInfo queueInfo, QueueInitialState queueInitialState, QueueInteractor$queueModelFlow$$inlined$map$2$2$1 queueInteractor$queueModelFlow$$inlined$map$2$2$1) {
        return bvf0.n(new QueueInfoToModelMapper$map$2(o2y0Var, queueInitialState, queueInfo, this, null), queueInteractor$queueModelFlow$$inlined$map$2$2$1);
    }
}
