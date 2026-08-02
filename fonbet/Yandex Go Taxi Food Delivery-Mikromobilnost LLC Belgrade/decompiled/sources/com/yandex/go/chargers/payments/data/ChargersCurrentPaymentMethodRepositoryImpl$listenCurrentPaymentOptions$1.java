package com.yandex.go.chargers.payments.data;

import defpackage.bms;
import defpackage.lv90;
import defpackage.m6a0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oea0;
import defpackage.tf91;
import defpackage.vez0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Loea0;", "paymentModels", "Llv90;", "selectedPayment", "Lm6a0;", "composite", "Lhfa0;", "<anonymous>", "(Loea0;Llv90;Lm6a0;)Lhfa0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.payments.data.ChargersCurrentPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$1", f = "ChargersCurrentPaymentMethodRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ChargersCurrentPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersCurrentPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$1(a aVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ChargersCurrentPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$1 chargersCurrentPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$1 = new ChargersCurrentPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$1(this.this$0, (Continuation) obj4);
        chargersCurrentPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$1.L$0 = (oea0) obj;
        chargersCurrentPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$1.L$1 = (lv90) obj2;
        chargersCurrentPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$1.L$2 = (m6a0) obj3;
        return chargersCurrentPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        m6a0 c0;
        oea0 oea0Var = (oea0) this.L$0;
        lv90 lv90Var = (lv90) this.L$1;
        m6a0 m6a0Var = (m6a0) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        m6a0 m6a0Var2 = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.this$0.getClass();
        if (lv90Var != null && (c0 = vez0.c0(lv90Var, null)) != null) {
            m6a0Var2 = new m6a0(c0.a, c0.b, m6a0Var);
        }
        return tf91.c(oea0Var, m6a0Var2);
    }
}
