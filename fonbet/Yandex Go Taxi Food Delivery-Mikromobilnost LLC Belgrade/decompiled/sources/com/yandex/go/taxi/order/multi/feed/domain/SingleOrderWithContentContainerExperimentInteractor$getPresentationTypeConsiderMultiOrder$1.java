package com.yandex.go.taxi.order.multi.feed.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.multi.feed.domain.SingleOrderWithContentContainerExperimentInteractor", f = "SingleOrderWithContentContainerExperimentInteractor.kt", l = {81}, m = "getPresentationTypeConsiderMultiOrder", v = 2)
/* loaded from: classes14.dex */
final class SingleOrderWithContentContainerExperimentInteractor$getPresentationTypeConsiderMultiOrder$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleOrderWithContentContainerExperimentInteractor$getPresentationTypeConsiderMultiOrder$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
