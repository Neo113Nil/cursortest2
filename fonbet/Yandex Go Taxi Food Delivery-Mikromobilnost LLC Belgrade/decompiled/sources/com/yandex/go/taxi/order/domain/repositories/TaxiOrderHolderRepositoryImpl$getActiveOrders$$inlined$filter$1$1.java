package com.yandex.go.taxi.order.domain.repositories;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.domain.repositories.TaxiOrderHolderRepositoryImpl$getActiveOrders$$inlined$filter$1", f = "TaxiOrderHolderRepositoryImpl.kt", l = {112}, m = "collect", v = 2)
/* loaded from: classes14.dex */
public final class TaxiOrderHolderRepositoryImpl$getActiveOrders$$inlined$filter$1$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderHolderRepositoryImpl$getActiveOrders$$inlined$filter$1$1(p pVar, Continuation continuation) {
        super(continuation);
        this.this$0 = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
