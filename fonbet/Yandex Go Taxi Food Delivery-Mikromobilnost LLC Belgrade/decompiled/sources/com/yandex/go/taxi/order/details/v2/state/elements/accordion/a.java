package com.yandex.go.taxi.order.details.v2.state.elements.accordion;

import defpackage.ab00;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.j;

/* loaded from: classes14.dex */
public final class a implements tpr {
    public final /* synthetic */ tpr[] a;

    public a(tpr[] tprVarArr) {
        this.a = tprVarArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RideCardAccordionDataSource$stateFlow$2$invokeSuspend$$inlined$combine$1$1 rideCardAccordionDataSource$stateFlow$2$invokeSuspend$$inlined$combine$1$1;
        int i;
        if (continuation instanceof RideCardAccordionDataSource$stateFlow$2$invokeSuspend$$inlined$combine$1$1) {
            rideCardAccordionDataSource$stateFlow$2$invokeSuspend$$inlined$combine$1$1 = (RideCardAccordionDataSource$stateFlow$2$invokeSuspend$$inlined$combine$1$1) continuation;
            int i2 = rideCardAccordionDataSource$stateFlow$2$invokeSuspend$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardAccordionDataSource$stateFlow$2$invokeSuspend$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardAccordionDataSource$stateFlow$2$invokeSuspend$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardAccordionDataSource$stateFlow$2$invokeSuspend$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    ab00 ab00Var = new ab00(tprVarArr, 12);
                    RideCardAccordionDataSource$stateFlow$2$invokeSuspend$$inlined$combine$1$3 rideCardAccordionDataSource$stateFlow$2$invokeSuspend$$inlined$combine$1$3 = new RideCardAccordionDataSource$stateFlow$2$invokeSuspend$$inlined$combine$1$3(3, null);
                    rideCardAccordionDataSource$stateFlow$2$invokeSuspend$$inlined$combine$1$1.L$0 = null;
                    rideCardAccordionDataSource$stateFlow$2$invokeSuspend$$inlined$combine$1$1.L$1 = null;
                    rideCardAccordionDataSource$stateFlow$2$invokeSuspend$$inlined$combine$1$1.L$2 = null;
                    rideCardAccordionDataSource$stateFlow$2$invokeSuspend$$inlined$combine$1$1.label = 1;
                    if (j.a(vprVar, ab00Var, rideCardAccordionDataSource$stateFlow$2$invokeSuspend$$inlined$combine$1$3, rideCardAccordionDataSource$stateFlow$2$invokeSuspend$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        rideCardAccordionDataSource$stateFlow$2$invokeSuspend$$inlined$combine$1$1 = new RideCardAccordionDataSource$stateFlow$2$invokeSuspend$$inlined$combine$1$1(this, continuation);
        Object obj2 = rideCardAccordionDataSource$stateFlow$2$invokeSuspend$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardAccordionDataSource$stateFlow$2$invokeSuspend$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
