package com.yandex.go.payments.paymentlist.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.paymentlist.domain.PaymentMethodsInteractorImpl", f = "PaymentMethodsInteractorImpl.kt", l = {245}, m = "unbindSbpToken-gIAlu-s", v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodsInteractorImpl$unbindSbpToken$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsInteractorImpl$unbindSbpToken$1(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object q = this.this$0.q(null, this);
        return q == CoroutineSingletons.COROUTINE_SUSPENDED ? q : new Result(q);
    }
}
