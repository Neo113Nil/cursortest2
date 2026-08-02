package com.yandex.go.profile.domain.divkit.variables;

import defpackage.a2a0;
import defpackage.bms;
import defpackage.lv90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzy11;", "<unused var>", "Llv90;", "selected", "composite", "Lkotlin/Pair;", "Lm1a0;", "<anonymous>", "(VLru/yandex/taxi/gopayments/dto/Payment;Lru/yandex/taxi/gopayments/dto/Payment;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.profile.domain.divkit.variables.PaymentMethodVariableHandler$subscribeToPaymentUpdates$2", f = "PaymentMethodVariableHandler.kt", l = {70}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class PaymentMethodVariableHandler$subscribeToPaymentUpdates$2 extends SuspendLambda implements bms {
    final /* synthetic */ String $lpmService;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodVariableHandler$subscribeToPaymentUpdates$2(c cVar, String str, Continuation continuation) {
        super(4, continuation);
        this.this$0 = cVar;
        this.$lpmService = str;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        PaymentMethodVariableHandler$subscribeToPaymentUpdates$2 paymentMethodVariableHandler$subscribeToPaymentUpdates$2 = new PaymentMethodVariableHandler$subscribeToPaymentUpdates$2(this.this$0, this.$lpmService, (Continuation) obj4);
        paymentMethodVariableHandler$subscribeToPaymentUpdates$2.L$0 = (lv90) obj2;
        paymentMethodVariableHandler$subscribeToPaymentUpdates$2.L$1 = (lv90) obj3;
        return paymentMethodVariableHandler$subscribeToPaymentUpdates$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        lv90 lv90Var = (lv90) this.L$0;
        lv90 lv90Var2 = (lv90) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a2a0 a2a0Var = (a2a0) this.this$0.e.get();
            String str = this.$lpmService;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = lv90Var;
            this.label = 1;
            obj = a2a0.a(a2a0Var, lv90Var, lv90Var2, str, this, 4);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lv90Var = (lv90) this.L$2;
            kotlin.b.b(obj);
        }
        return new Pair(lv90Var, obj);
    }
}
