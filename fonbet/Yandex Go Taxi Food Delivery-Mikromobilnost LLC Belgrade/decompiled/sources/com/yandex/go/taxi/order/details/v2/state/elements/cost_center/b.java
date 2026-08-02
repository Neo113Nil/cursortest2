package com.yandex.go.taxi.order.details.v2.state.elements.cost_center;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;

    public b(tpr tprVar) {
        this.a = tprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RideCardCostCenterDataSource$stateFlow$$inlined$map$1$1 rideCardCostCenterDataSource$stateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof RideCardCostCenterDataSource$stateFlow$$inlined$map$1$1) {
            rideCardCostCenterDataSource$stateFlow$$inlined$map$1$1 = (RideCardCostCenterDataSource$stateFlow$$inlined$map$1$1) continuation;
            int i2 = rideCardCostCenterDataSource$stateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardCostCenterDataSource$stateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardCostCenterDataSource$stateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardCostCenterDataSource$stateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar);
                    rideCardCostCenterDataSource$stateFlow$$inlined$map$1$1.L$0 = null;
                    rideCardCostCenterDataSource$stateFlow$$inlined$map$1$1.L$1 = null;
                    rideCardCostCenterDataSource$stateFlow$$inlined$map$1$1.L$2 = null;
                    rideCardCostCenterDataSource$stateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, rideCardCostCenterDataSource$stateFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        rideCardCostCenterDataSource$stateFlow$$inlined$map$1$1 = new RideCardCostCenterDataSource$stateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = rideCardCostCenterDataSource$stateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardCostCenterDataSource$stateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
