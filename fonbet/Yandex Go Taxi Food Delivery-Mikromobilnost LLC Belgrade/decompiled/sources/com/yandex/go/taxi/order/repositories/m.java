package com.yandex.go.taxi.order.repositories;

import defpackage.ny61;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class m implements tpr {
    public final /* synthetic */ rol0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ n c;

    public m(long j, rol0 rol0Var, n nVar) {
        this.a = rol0Var;
        this.b = j;
        this.c = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PaidWaitingTimerInCardRepository$untilTimerFlow$$inlined$map$1$1 paidWaitingTimerInCardRepository$untilTimerFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof PaidWaitingTimerInCardRepository$untilTimerFlow$$inlined$map$1$1) {
            paidWaitingTimerInCardRepository$untilTimerFlow$$inlined$map$1$1 = (PaidWaitingTimerInCardRepository$untilTimerFlow$$inlined$map$1$1) continuation;
            int i2 = paidWaitingTimerInCardRepository$untilTimerFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paidWaitingTimerInCardRepository$untilTimerFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paidWaitingTimerInCardRepository$untilTimerFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paidWaitingTimerInCardRepository$untilTimerFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l lVar = new l(this.b, vprVar, this.c);
                    paidWaitingTimerInCardRepository$untilTimerFlow$$inlined$map$1$1.L$0 = null;
                    paidWaitingTimerInCardRepository$untilTimerFlow$$inlined$map$1$1.L$1 = null;
                    paidWaitingTimerInCardRepository$untilTimerFlow$$inlined$map$1$1.L$2 = null;
                    paidWaitingTimerInCardRepository$untilTimerFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(lVar, paidWaitingTimerInCardRepository$untilTimerFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        paidWaitingTimerInCardRepository$untilTimerFlow$$inlined$map$1$1 = new PaidWaitingTimerInCardRepository$untilTimerFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = paidWaitingTimerInCardRepository$untilTimerFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paidWaitingTimerInCardRepository$untilTimerFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
