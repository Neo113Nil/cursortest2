package com.yandex.go.taxi.order.details.v2.state.elements.cost_center;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CostCenter;
import defpackage.cda0;
import defpackage.g92;
import defpackage.ijk0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tpr;
import defpackage.yjk0;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;

/* loaded from: classes14.dex */
public final class c {
    public final o2y0 a;
    public final cda0 b;
    public final com.yandex.go.taxi.order.details.v2.state.elements.generic.a c;

    public c(o2y0 o2y0Var, cda0 cda0Var, com.yandex.go.taxi.order.details.v2.state.elements.generic.a aVar) {
        this.a = o2y0Var;
        this.b = cda0Var;
        this.c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(RideCardItemDto$CostCenter rideCardItemDto$CostCenter, ContinuationImpl continuationImpl) {
        RideCardCostCenterDataSource$stateFlow$1 rideCardCostCenterDataSource$stateFlow$1;
        int i;
        tpr tprVar;
        RideCardItemDto$CostCenter rideCardItemDto$CostCenter2;
        tpr tprVar2;
        if (continuationImpl instanceof RideCardCostCenterDataSource$stateFlow$1) {
            rideCardCostCenterDataSource$stateFlow$1 = (RideCardCostCenterDataSource$stateFlow$1) continuationImpl;
            int i2 = rideCardCostCenterDataSource$stateFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardCostCenterDataSource$stateFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardCostCenterDataSource$stateFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardCostCenterDataSource$stateFlow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!ijk0.b(rideCardItemDto$CostCenter)) {
                        return new g92(2, new yjk0(rideCardItemDto$CostCenter.a));
                    }
                    g a = this.a.a();
                    b bVar = new b(((com.yandex.go.payments.paymentlist.data.c) this.b).u);
                    rideCardCostCenterDataSource$stateFlow$1.L$0 = rideCardItemDto$CostCenter;
                    rideCardCostCenterDataSource$stateFlow$1.L$1 = a;
                    rideCardCostCenterDataSource$stateFlow$1.L$2 = bVar;
                    rideCardCostCenterDataSource$stateFlow$1.label = 1;
                    Object a2 = this.c.a(rideCardItemDto$CostCenter, EmptyList.a, null, rideCardCostCenterDataSource$stateFlow$1);
                    if (a2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    tprVar = a;
                    obj = a2;
                    rideCardItemDto$CostCenter2 = rideCardItemDto$CostCenter;
                    tprVar2 = bVar;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tprVar2 = (tpr) rideCardCostCenterDataSource$stateFlow$1.L$2;
                    tprVar = (tpr) rideCardCostCenterDataSource$stateFlow$1.L$1;
                    rideCardItemDto$CostCenter2 = (RideCardItemDto$CostCenter) rideCardCostCenterDataSource$stateFlow$1.L$0;
                    kotlin.b.b(obj);
                }
                return e.n(tprVar, tprVar2, (tpr) obj, new RideCardCostCenterDataSource$stateFlow$3(this, rideCardItemDto$CostCenter2, null));
            }
        }
        rideCardCostCenterDataSource$stateFlow$1 = new RideCardCostCenterDataSource$stateFlow$1(this, continuationImpl);
        Object obj2 = rideCardCostCenterDataSource$stateFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardCostCenterDataSource$stateFlow$1.label;
        if (i != 0) {
        }
        return e.n(tprVar, tprVar2, (tpr) obj2, new RideCardCostCenterDataSource$stateFlow$3(this, rideCardItemDto$CostCenter2, null));
    }
}
