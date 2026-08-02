package com.yandex.go.payments.paymentlist.domain;

import defpackage.jfa0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljfa0;", "options", "Lcom/yandex/go/payments/paymentlist/data/EditModeState;", "<unused var>", "<anonymous>", "(Ljfa0;Lcom/yandex/go/payments/paymentlist/data/EditModeState;)Ljfa0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.domain.PaymentMethodsListPresenter$paymentOptionsFlow$1", f = "PaymentMethodsListPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class PaymentMethodsListPresenter$paymentOptionsFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PaymentMethodsListPresenter$paymentOptionsFlow$1 paymentMethodsListPresenter$paymentOptionsFlow$1 = new PaymentMethodsListPresenter$paymentOptionsFlow$1(3, (Continuation) obj3);
        paymentMethodsListPresenter$paymentOptionsFlow$1.L$0 = (jfa0) obj;
        return paymentMethodsListPresenter$paymentOptionsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        jfa0 jfa0Var = (jfa0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return jfa0Var;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
