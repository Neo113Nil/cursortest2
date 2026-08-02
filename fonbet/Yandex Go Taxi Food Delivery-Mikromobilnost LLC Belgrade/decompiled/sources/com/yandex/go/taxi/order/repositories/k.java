package com.yandex.go.taxi.order.repositories;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.experiments.PaidWaitingTimerInCardExperiment;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class k implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ n b;
    public final /* synthetic */ TaxiOrder c;
    public final /* synthetic */ PaidWaitingTimerInCardExperiment.FreeWaiting w;

    public k(tpr tprVar, n nVar, TaxiOrder taxiOrder, PaidWaitingTimerInCardExperiment.FreeWaiting freeWaiting) {
        this.a = tprVar;
        this.b = nVar;
        this.c = taxiOrder;
        this.w = freeWaiting;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PaidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$1 paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$1;
        int i;
        if (continuation instanceof PaidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$1) {
            paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$1 = (PaidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$1) continuation;
            int i2 = paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = new j(vprVar, this.b, this.c, this.w);
                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$1.L$0 = null;
                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$1.L$1 = null;
                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$1.L$2 = null;
                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$1.label = 1;
                    if (this.a.collect(jVar, paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$1 = new PaidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$1(this, continuation);
        Object obj2 = paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
