package com.yandex.go.payments.domain;

import defpackage.lv90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llv90;", "selected", "override", "<anonymous>", "(Llv90;Llv90;)Llv90;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.domain.PreorderSelectedPaymentInteractor$selectedPaymentFlow$1", f = "PreorderSelectedPaymentInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PreorderSelectedPaymentInteractor$selectedPaymentFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public PreorderSelectedPaymentInteractor$selectedPaymentFlow$1() {
        super(3, null);
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PreorderSelectedPaymentInteractor$selectedPaymentFlow$1 preorderSelectedPaymentInteractor$selectedPaymentFlow$1 = new PreorderSelectedPaymentInteractor$selectedPaymentFlow$1(3, (Continuation) obj3);
        preorderSelectedPaymentInteractor$selectedPaymentFlow$1.L$0 = (lv90) obj;
        preorderSelectedPaymentInteractor$selectedPaymentFlow$1.L$1 = (lv90) obj2;
        return preorderSelectedPaymentInteractor$selectedPaymentFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        lv90 lv90Var = (lv90) this.L$0;
        lv90 lv90Var2 = (lv90) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return lv90Var2 == null ? lv90Var : lv90Var2;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
