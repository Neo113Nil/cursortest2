package com.yandex.go.payments.paymentlist.domain;

import defpackage.lv90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vk2;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llv90;", "compositePayment", "payment", "Lvk2;", "<anonymous>", "(Llv90;Llv90;)Lvk2;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.domain.AnnounceCompositePaymentStateInteractor$getFlow$1", f = "AnnounceCompositePaymentStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class AnnounceCompositePaymentStateInteractor$getFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AnnounceCompositePaymentStateInteractor$getFlow$1 announceCompositePaymentStateInteractor$getFlow$1 = new AnnounceCompositePaymentStateInteractor$getFlow$1(3, (Continuation) obj3);
        announceCompositePaymentStateInteractor$getFlow$1.L$0 = (lv90) obj;
        announceCompositePaymentStateInteractor$getFlow$1.L$1 = (lv90) obj2;
        return announceCompositePaymentStateInteractor$getFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        lv90 lv90Var = (lv90) this.L$0;
        lv90 lv90Var2 = (lv90) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new vk2(lv90Var, lv90Var2);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
