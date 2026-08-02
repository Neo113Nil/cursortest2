package com.yandex.go.payments.domain;

import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lnw51;", "<unused var>", "", "Llea0;", "Lzy11;", "Lm1a0;", "<anonymous>", "(Lcom/yandex/go/yb/api/domain/model/YbSdkState;Ljava/util/List;V)Lcom/yandex/go/payments/payment/PaymentInfo;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.domain.PreorderPaymentInfoInteractorImpl$basePaymentFlow$1", f = "PreorderPaymentInfoInteractorImpl.kt", l = {42}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PreorderPaymentInfoInteractorImpl$basePaymentFlow$1 extends SuspendLambda implements bms {
    int label;
    final /* synthetic */ m0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreorderPaymentInfoInteractorImpl$basePaymentFlow$1(m0 m0Var, Continuation continuation) {
        super(4, continuation);
        this.this$0 = m0Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return new PreorderPaymentInfoInteractorImpl$basePaymentFlow$1(this.this$0, (Continuation) obj4).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        m0 m0Var = this.this$0;
        this.label = 1;
        Object a = m0Var.a(this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
