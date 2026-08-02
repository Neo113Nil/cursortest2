package com.yandex.go.chargers.payments.domain;

import defpackage.h8b0;
import defpackage.hfa0;
import defpackage.m6a0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vit;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.payments.domain.ChargersCompositePaymentInteractorImpl$toggleCompositePayment$1", f = "ChargersCompositePaymentInteractorImpl.kt", l = {44}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersCompositePaymentInteractorImpl$toggleCompositePayment$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersCompositePaymentInteractorImpl$toggleCompositePayment$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersCompositePaymentInteractorImpl$toggleCompositePayment$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersCompositePaymentInteractorImpl$toggleCompositePayment$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        m6a0 m6a0Var = null;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            vit vitVar = this.this$0.d;
            this.label = 1;
            com.yandex.go.chargers.payments.data.a aVar = (com.yandex.go.chargers.payments.data.a) vitVar.b;
            hfa0 c = aVar.c();
            h8b0 a = c.a();
            if (a != null) {
                m6a0 d = c.d();
                if (d != null && a.f() && !d.a() && a.g(d.a)) {
                    m6a0Var = new m6a0(PaymentMethod$Type.PERSONAL_WALLET, a.a, null);
                }
                aVar.e.l(m6a0Var);
            }
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.this$0.e.g(zy11Var);
        return zy11Var;
    }
}
