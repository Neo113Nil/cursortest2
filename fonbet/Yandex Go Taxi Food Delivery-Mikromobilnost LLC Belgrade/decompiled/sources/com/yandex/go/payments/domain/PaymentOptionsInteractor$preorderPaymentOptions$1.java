package com.yandex.go.payments.domain;

import defpackage.bms;
import defpackage.jfa0;
import defpackage.jw90;
import defpackage.lv90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oea0;
import defpackage.rhq0;
import defpackage.uea0;
import defpackage.vez0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Loea0;", "paymentModels", "Llv90;", "payment", "compositePayment", "Ljfa0;", "<anonymous>", "(Loea0;Llv90;Llv90;)Ljfa0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.domain.PaymentOptionsInteractor$preorderPaymentOptions$1", f = "PaymentOptionsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentOptionsInteractor$preorderPaymentOptions$1 extends SuspendLambda implements bms {
    final /* synthetic */ jw90 $availabilityChecker;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ k0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsInteractor$preorderPaymentOptions$1(k0 k0Var, jw90 jw90Var, Continuation continuation) {
        super(4, continuation);
        this.this$0 = k0Var;
        this.$availabilityChecker = jw90Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        PaymentOptionsInteractor$preorderPaymentOptions$1 paymentOptionsInteractor$preorderPaymentOptions$1 = new PaymentOptionsInteractor$preorderPaymentOptions$1(this.this$0, this.$availabilityChecker, (Continuation) obj4);
        paymentOptionsInteractor$preorderPaymentOptions$1.L$0 = (oea0) obj;
        paymentOptionsInteractor$preorderPaymentOptions$1.L$1 = (lv90) obj2;
        paymentOptionsInteractor$preorderPaymentOptions$1.L$2 = (lv90) obj3;
        return paymentOptionsInteractor$preorderPaymentOptions$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        oea0 oea0Var = (oea0) this.L$0;
        lv90 lv90Var = (lv90) this.L$1;
        lv90 lv90Var2 = (lv90) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        k0 k0Var = this.this$0;
        jfa0 a = ((uea0) k0Var.f).a(oea0Var, this.$availabilityChecker, vez0.c0(lv90Var, lv90Var2));
        if (lv90Var2 != null) {
            rhq0 rhq0Var = a.b;
            if ((rhq0Var != null ? rhq0Var.b : null) == null) {
                k0Var.c.h();
            }
        }
        return a;
    }
}
