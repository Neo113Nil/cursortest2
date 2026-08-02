package com.yandex.go.taxi.order.repositories;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;

    public h(vpr vprVar, n nVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PaidWaitingTimerInCardRepository$getTimerFlowForTitle$$inlined$filter$2$2$1 paidWaitingTimerInCardRepository$getTimerFlowForTitle$$inlined$filter$2$2$1;
        int i;
        if (continuation instanceof PaidWaitingTimerInCardRepository$getTimerFlowForTitle$$inlined$filter$2$2$1) {
            paidWaitingTimerInCardRepository$getTimerFlowForTitle$$inlined$filter$2$2$1 = (PaidWaitingTimerInCardRepository$getTimerFlowForTitle$$inlined$filter$2$2$1) continuation;
            int i2 = paidWaitingTimerInCardRepository$getTimerFlowForTitle$$inlined$filter$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paidWaitingTimerInCardRepository$getTimerFlowForTitle$$inlined$filter$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = paidWaitingTimerInCardRepository$getTimerFlowForTitle$$inlined$filter$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paidWaitingTimerInCardRepository$getTimerFlowForTitle$$inlined$filter$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String e = n.e(((TaxiOrder) obj).V());
                    if (e != null && e.length() != 0) {
                        paidWaitingTimerInCardRepository$getTimerFlowForTitle$$inlined$filter$2$2$1.L$0 = null;
                        paidWaitingTimerInCardRepository$getTimerFlowForTitle$$inlined$filter$2$2$1.L$1 = null;
                        paidWaitingTimerInCardRepository$getTimerFlowForTitle$$inlined$filter$2$2$1.L$2 = null;
                        paidWaitingTimerInCardRepository$getTimerFlowForTitle$$inlined$filter$2$2$1.L$3 = null;
                        paidWaitingTimerInCardRepository$getTimerFlowForTitle$$inlined$filter$2$2$1.label = 1;
                        if (this.a.emit(obj, paidWaitingTimerInCardRepository$getTimerFlowForTitle$$inlined$filter$2$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        paidWaitingTimerInCardRepository$getTimerFlowForTitle$$inlined$filter$2$2$1 = new PaidWaitingTimerInCardRepository$getTimerFlowForTitle$$inlined$filter$2$2$1(this, continuation);
        Object obj22 = paidWaitingTimerInCardRepository$getTimerFlowForTitle$$inlined$filter$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paidWaitingTimerInCardRepository$getTimerFlowForTitle$$inlined$filter$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
