package com.yandex.go.taxi.order.map.overlay;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.map.overlay.OrderMapOverlayPresenter", f = "OrderMapOverlayPresenter.kt", l = {855}, m = "processMapObjects", v = 2)
/* loaded from: classes14.dex */
final class OrderMapOverlayPresenter$processMapObjects$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderMapOverlayPresenter$processMapObjects$1(c0 c0Var, Continuation continuation) {
        super(continuation);
        this.this$0 = c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c0.Pg(this.this$0, null, this);
    }
}
