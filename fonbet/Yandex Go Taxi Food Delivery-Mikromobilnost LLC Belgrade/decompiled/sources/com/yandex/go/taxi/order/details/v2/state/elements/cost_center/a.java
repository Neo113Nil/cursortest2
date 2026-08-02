package com.yandex.go.taxi.order.details.v2.state.elements.cost_center;

import defpackage.jve;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RideCardCostCenterDataSource$stateFlow$$inlined$map$1$2$1 rideCardCostCenterDataSource$stateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof RideCardCostCenterDataSource$stateFlow$$inlined$map$1$2$1) {
            rideCardCostCenterDataSource$stateFlow$$inlined$map$1$2$1 = (RideCardCostCenterDataSource$stateFlow$$inlined$map$1$2$1) continuation;
            int i2 = rideCardCostCenterDataSource$stateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardCostCenterDataSource$stateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = rideCardCostCenterDataSource$stateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardCostCenterDataSource$stateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (List) obj) {
                        if (obj3 instanceof jve) {
                            arrayList.add(obj3);
                        }
                    }
                    rideCardCostCenterDataSource$stateFlow$$inlined$map$1$2$1.L$0 = null;
                    rideCardCostCenterDataSource$stateFlow$$inlined$map$1$2$1.L$1 = null;
                    rideCardCostCenterDataSource$stateFlow$$inlined$map$1$2$1.L$2 = null;
                    rideCardCostCenterDataSource$stateFlow$$inlined$map$1$2$1.L$3 = null;
                    rideCardCostCenterDataSource$stateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList, rideCardCostCenterDataSource$stateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        rideCardCostCenterDataSource$stateFlow$$inlined$map$1$2$1 = new RideCardCostCenterDataSource$stateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = rideCardCostCenterDataSource$stateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardCostCenterDataSource$stateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
