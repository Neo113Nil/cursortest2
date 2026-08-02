package com.ybsdk.feature.paymentsdk.internal.screens;

import defpackage.bja0;
import defpackage.k1x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.paymentsdk.internal.screens.PaymentSdkFragment$render$1", f = "PaymentSdkFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class PaymentSdkFragment$render$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ PaymentSdkFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSdkFragment$render$1(PaymentSdkFragment paymentSdkFragment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = paymentSdkFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentSdkFragment$render$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PaymentSdkFragment$render$1 paymentSdkFragment$render$1 = (PaymentSdkFragment$render$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        paymentSdkFragment$render$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        k1x0 k1x0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        k1x0Var = this.this$0.paymentSdkKit;
        ((bja0) k1x0Var.get()).refresh();
        return zy11.a;
    }
}
