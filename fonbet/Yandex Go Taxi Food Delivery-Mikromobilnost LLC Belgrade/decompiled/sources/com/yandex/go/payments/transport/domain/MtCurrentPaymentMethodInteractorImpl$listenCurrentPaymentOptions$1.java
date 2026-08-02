package com.yandex.go.payments.transport.domain;

import defpackage.d111;
import defpackage.m6a0;
import defpackage.mvg;
import defpackage.n6a0;
import defpackage.ny61;
import defpackage.oea0;
import defpackage.tf91;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Loea0;", "paymentModels", "Lm6a0;", "selectedPaymentReference", "Lhfa0;", "<anonymous>", "(Loea0;Lm6a0;)Lhfa0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.transport.domain.MtCurrentPaymentMethodInteractorImpl$listenCurrentPaymentOptions$1", f = "MtCurrentPaymentMethodInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MtCurrentPaymentMethodInteractorImpl$listenCurrentPaymentOptions$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtCurrentPaymentMethodInteractorImpl$listenCurrentPaymentOptions$1(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MtCurrentPaymentMethodInteractorImpl$listenCurrentPaymentOptions$1 mtCurrentPaymentMethodInteractorImpl$listenCurrentPaymentOptions$1 = new MtCurrentPaymentMethodInteractorImpl$listenCurrentPaymentOptions$1(this.this$0, (Continuation) obj3);
        mtCurrentPaymentMethodInteractorImpl$listenCurrentPaymentOptions$1.L$0 = (oea0) obj;
        mtCurrentPaymentMethodInteractorImpl$listenCurrentPaymentOptions$1.L$1 = (m6a0) obj2;
        return mtCurrentPaymentMethodInteractorImpl$listenCurrentPaymentOptions$1.invokeSuspend(zy11.a);
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
        a aVar = this.this$0;
        aVar.getClass();
        if ((m6a0Var != null ? m6a0Var.a : null) != PaymentMethod$Type.TRANSPORT_CARD) {
            List list = oea0Var.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof d111) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                m6a0Var = n6a0.b(aVar.d, (d111) kotlin.collections.a.P(arrayList));
                aVar.c.b(m6a0Var);
            }
        }
        return tf91.c(oea0Var, m6a0Var);
    }
}
