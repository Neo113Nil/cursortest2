package com.yandex.go.feed.global.div.custom.payment_icon;

import defpackage.a2a0;
import defpackage.lv90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llv90;", "basePayment", "composite", "Lm1a0;", "<anonymous>", "(Llv90;Llv90;)Lm1a0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.feed.global.div.custom.payment_icon.PaymentIconViewHolder$startPaymentUpdates$2", f = "PaymentIconViewHolder.kt", l = {54}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class PaymentIconViewHolder$startPaymentUpdates$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ PaymentIconViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentIconViewHolder$startPaymentUpdates$2(PaymentIconViewHolder paymentIconViewHolder, Continuation continuation) {
        super(3, continuation);
        this.this$0 = paymentIconViewHolder;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PaymentIconViewHolder$startPaymentUpdates$2 paymentIconViewHolder$startPaymentUpdates$2 = new PaymentIconViewHolder$startPaymentUpdates$2(this.this$0, (Continuation) obj3);
        paymentIconViewHolder$startPaymentUpdates$2.L$0 = (lv90) obj;
        paymentIconViewHolder$startPaymentUpdates$2.L$1 = (lv90) obj2;
        return paymentIconViewHolder$startPaymentUpdates$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a2a0 a2a0Var;
        lv90 lv90Var = (lv90) this.L$0;
        lv90 lv90Var2 = (lv90) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a2a0Var = this.this$0.paymentInfoMapper;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        Object a = a2a0.a(a2a0Var, lv90Var, lv90Var2, null, this, 12);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
