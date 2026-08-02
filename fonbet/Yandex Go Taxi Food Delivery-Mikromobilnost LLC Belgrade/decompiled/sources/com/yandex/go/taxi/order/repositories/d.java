package com.yandex.go.taxi.order.repositories;

import defpackage.e3n;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.o430;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.time.DurationUnit;

/* loaded from: classes14.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ n b;
    public final /* synthetic */ long c;

    public d(long j, vpr vprVar, n nVar) {
        this.a = vprVar;
        this.b = nVar;
        this.c = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PaidWaitingTimerInCardRepository$fromTimerFlow$$inlined$map$1$2$1 paidWaitingTimerInCardRepository$fromTimerFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof PaidWaitingTimerInCardRepository$fromTimerFlow$$inlined$map$1$2$1) {
            paidWaitingTimerInCardRepository$fromTimerFlow$$inlined$map$1$2$1 = (PaidWaitingTimerInCardRepository$fromTimerFlow$$inlined$map$1$2$1) continuation;
            int i2 = paidWaitingTimerInCardRepository$fromTimerFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paidWaitingTimerInCardRepository$fromTimerFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = paidWaitingTimerInCardRepository$fromTimerFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paidWaitingTimerInCardRepository$fromTimerFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    o430 o430Var = e3n.b;
                    long d = this.b.c.d();
                    DurationUnit durationUnit = DurationUnit.MILLISECONDS;
                    long V = kp50.V(d, durationUnit);
                    DurationUnit durationUnit2 = DurationUnit.SECONDS;
                    Long l = new Long(e3n.o(V, durationUnit2) - e3n.o(kp50.V(this.c, durationUnit), durationUnit2));
                    paidWaitingTimerInCardRepository$fromTimerFlow$$inlined$map$1$2$1.L$0 = null;
                    paidWaitingTimerInCardRepository$fromTimerFlow$$inlined$map$1$2$1.L$1 = null;
                    paidWaitingTimerInCardRepository$fromTimerFlow$$inlined$map$1$2$1.L$2 = null;
                    paidWaitingTimerInCardRepository$fromTimerFlow$$inlined$map$1$2$1.L$3 = null;
                    paidWaitingTimerInCardRepository$fromTimerFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(l, paidWaitingTimerInCardRepository$fromTimerFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        paidWaitingTimerInCardRepository$fromTimerFlow$$inlined$map$1$2$1 = new PaidWaitingTimerInCardRepository$fromTimerFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = paidWaitingTimerInCardRepository$fromTimerFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paidWaitingTimerInCardRepository$fromTimerFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
