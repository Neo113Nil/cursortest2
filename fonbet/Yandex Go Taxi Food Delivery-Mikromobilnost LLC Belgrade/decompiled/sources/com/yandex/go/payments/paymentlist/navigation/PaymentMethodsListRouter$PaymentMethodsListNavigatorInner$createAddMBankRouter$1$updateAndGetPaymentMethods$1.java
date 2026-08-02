package com.yandex.go.payments.paymentlist.navigation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.paymentlist.navigation.PaymentMethodsListRouter$PaymentMethodsListNavigatorInner$createAddMBankRouter$1", f = "PaymentMethodsListRouter.kt", l = {NetworkRequestException.TOO_MANY_REQUESTS, 430}, m = "updateAndGetPaymentMethods", v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodsListRouter$PaymentMethodsListNavigatorInner$createAddMBankRouter$1$updateAndGetPaymentMethods$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsListRouter$PaymentMethodsListNavigatorInner$createAddMBankRouter$1$updateAndGetPaymentMethods$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
