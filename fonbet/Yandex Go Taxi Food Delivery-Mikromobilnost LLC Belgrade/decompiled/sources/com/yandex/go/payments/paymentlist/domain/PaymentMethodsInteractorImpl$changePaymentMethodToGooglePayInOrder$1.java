package com.yandex.go.payments.paymentlist.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.paymentlist.domain.PaymentMethodsInteractorImpl", f = "PaymentMethodsInteractorImpl.kt", l = {203}, m = "changePaymentMethodToGooglePayInOrder", v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodsInteractorImpl$changePaymentMethodToGooglePayInOrder$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsInteractorImpl$changePaymentMethodToGooglePayInOrder$1(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return i.a(this.this$0, null, null, this);
    }
}
