package com.yandex.go.payments.paymentlist.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.paymentlist.domain.PaymentMethodsInteractorImpl", f = "PaymentMethodsInteractorImpl.kt", l = {253}, m = "unbindYapeToken-gIAlu-s", v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodsInteractorImpl$unbindYapeToken$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsInteractorImpl$unbindYapeToken$1(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object r = this.this$0.r(null, this);
        return r == CoroutineSingletons.COROUTINE_SUSPENDED ? r : new Result(r);
    }
}
