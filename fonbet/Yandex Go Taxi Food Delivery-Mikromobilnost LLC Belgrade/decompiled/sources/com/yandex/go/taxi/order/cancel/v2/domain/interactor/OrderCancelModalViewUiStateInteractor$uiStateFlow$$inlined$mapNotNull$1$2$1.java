package com.yandex.go.taxi.order.cancel.v2.domain.interactor;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.cancel.v2.domain.interactor.OrderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2", f = "OrderCancelModalViewUiStateInteractor.kt", l = {222}, m = "emit", v = 2)
/* loaded from: classes14.dex */
public final class OrderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1(c cVar, Continuation continuation) {
        super(continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
