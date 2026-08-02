package com.yandex.go.superapp.order.multi.old.view;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.superapp.order.multi.old.view.OrderStackViewRouter", f = "OrderStackViewRouter.kt", l = {181}, m = "showTaxiOrderTrackingInternal", v = 2)
/* loaded from: classes14.dex */
final class OrderStackViewRouter$showTaxiOrderTrackingInternal$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderStackViewRouter$showTaxiOrderTrackingInternal$1(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return g.b(this.this$0, null, null, this);
    }
}
