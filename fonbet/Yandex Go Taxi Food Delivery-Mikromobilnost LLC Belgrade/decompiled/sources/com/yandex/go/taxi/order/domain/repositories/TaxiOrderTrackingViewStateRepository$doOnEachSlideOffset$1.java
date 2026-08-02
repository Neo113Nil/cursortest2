package com.yandex.go.taxi.order.domain.repositories;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.domain.repositories.TaxiOrderTrackingViewStateRepository", f = "TaxiOrderTrackingViewStateRepository.kt", l = {102}, m = "doOnEachSlideOffset", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderTrackingViewStateRepository$doOnEachSlideOffset$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderTrackingViewStateRepository$doOnEachSlideOffset$1(f0 f0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = f0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
