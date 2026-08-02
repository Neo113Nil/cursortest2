package com.yandex.go.taxi.order.details.v2.state.elements.buttons;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$ActionButtons;
import defpackage.ab00;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.j;

/* loaded from: classes14.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ RideCardItemDto$ActionButtons b;

    public c(tpr[] tprVarArr, RideCardItemDto$ActionButtons rideCardItemDto$ActionButtons) {
        this.a = tprVarArr;
        this.b = rideCardItemDto$ActionButtons;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$1 rideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$1;
        int i;
        if (continuation instanceof RideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$1) {
            rideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$1 = (RideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$1) continuation;
            int i2 = rideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    ab00 ab00Var = new ab00(tprVarArr, 13);
                    RideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$3 rideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$3 = new RideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$3(null, this.b);
                    rideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$1.L$0 = null;
                    rideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$1.L$1 = null;
                    rideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$1.L$2 = null;
                    rideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$1.label = 1;
                    if (j.a(vprVar, ab00Var, rideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$3, rideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        rideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$1 = new RideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$1(this, continuation);
        Object obj2 = rideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
