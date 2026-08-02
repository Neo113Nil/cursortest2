package com.yandex.go.taxi.order.details.v2.state.elements.payment;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.payment.RideCardPaymentItemDataSource", f = "RideCardPaymentItemDataSource.kt", l = {MSException.ERROR_INVALID_PARAMETER, 100, 101, 104}, m = "paymentItemStateFlow", v = 2)
/* loaded from: classes14.dex */
final class RideCardPaymentItemDataSource$paymentItemStateFlow$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardPaymentItemDataSource$paymentItemStateFlow$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.a(this.this$0, null, null, null, null, this);
    }
}
