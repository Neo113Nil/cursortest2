package com.yandex.go.taxi.order.repositories;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "seconds", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.repositories.PaidWaitingTimerInCardRepository$fromTimerFlow$2", f = "PaidWaitingTimerInCardRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class PaidWaitingTimerInCardRepository$fromTimerFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ long J$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PaidWaitingTimerInCardRepository$fromTimerFlow$2 paidWaitingTimerInCardRepository$fromTimerFlow$2 = new PaidWaitingTimerInCardRepository$fromTimerFlow$2(2, continuation);
        paidWaitingTimerInCardRepository$fromTimerFlow$2.J$0 = ((Number) obj).longValue();
        return paidWaitingTimerInCardRepository$fromTimerFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaidWaitingTimerInCardRepository$fromTimerFlow$2) create(Long.valueOf(((Number) obj).longValue()), (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j = this.J$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(j <= 0);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
