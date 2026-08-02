package com.yandex.go.payments.paymentlist.navigation;

import defpackage.lea0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zba0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.navigation.PaymentMethodsListRouter$updatePaymentMethodsAfterOptionDeleting$2", f = "PaymentMethodsListRouter.kt", l = {783}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodsListRouter$updatePaymentMethodsAfterOptionDeleting$2 extends SuspendLambda implements wls {
    final /* synthetic */ lea0 $paymentModel;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsListRouter$updatePaymentMethodsAfterOptionDeleting$2(f fVar, lea0 lea0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$paymentModel = lea0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMethodsListRouter$updatePaymentMethodsAfterOptionDeleting$2(this.this$0, this.$paymentModel, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodsListRouter$updatePaymentMethodsAfterOptionDeleting$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            zba0 zba0Var = this.this$0.k0;
            lea0 lea0Var = this.$paymentModel;
            this.label = 1;
            if (zba0Var.a(lea0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
