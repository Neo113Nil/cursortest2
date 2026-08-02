package com.yandex.go.payments.plus.domain;

import defpackage.ajd0;
import defpackage.kw90;
import defpackage.m6a0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oea0;
import defpackage.uea0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Loea0;", "paymentModels", "Lm6a0;", "selectedPaymentReference", "Ljfa0;", "<anonymous>", "(Loea0;Lm6a0;)Ljfa0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.plus.domain.PlusPurchasePaymentsInteractor$optionsFlow$1$2", f = "PlusPurchasePaymentsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlusPurchasePaymentsInteractor$optionsFlow$1$2 extends SuspendLambda implements zls {
    final /* synthetic */ kw90 $availabilityChecker;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ajd0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusPurchasePaymentsInteractor$optionsFlow$1$2(ajd0 ajd0Var, kw90 kw90Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = ajd0Var;
        this.$availabilityChecker = kw90Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlusPurchasePaymentsInteractor$optionsFlow$1$2 plusPurchasePaymentsInteractor$optionsFlow$1$2 = new PlusPurchasePaymentsInteractor$optionsFlow$1$2(this.this$0, this.$availabilityChecker, (Continuation) obj3);
        plusPurchasePaymentsInteractor$optionsFlow$1$2.L$0 = (oea0) obj;
        plusPurchasePaymentsInteractor$optionsFlow$1$2.L$1 = (m6a0) obj2;
        return plusPurchasePaymentsInteractor$optionsFlow$1$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        oea0 oea0Var = (oea0) this.L$0;
        m6a0 m6a0Var = (m6a0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        return ((uea0) this.this$0.d).a(oea0Var, this.$availabilityChecker, m6a0Var);
    }
}
