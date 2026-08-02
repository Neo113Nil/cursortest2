package com.yandex.go.payments.addmethod.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vda0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvda0;", "it", "Lcom/yandex/go/payments/data/model/response/PaymentMethods;", "<anonymous>", "(Lvda0;)Lcom/yandex/go/payments/data/model/response/PaymentMethods;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.addmethod.domain.AddPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$3", f = "AddPaymentMethodsButtonStateInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class AddPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AddPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$3 addPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$3 = new AddPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$3(2, continuation);
        addPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$3.L$0 = obj;
        return addPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$3) create((vda0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vda0 vda0Var = (vda0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return vda0Var.a;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
