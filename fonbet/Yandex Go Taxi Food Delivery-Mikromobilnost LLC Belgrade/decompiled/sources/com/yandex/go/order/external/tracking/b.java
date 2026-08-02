package com.yandex.go.order.external.tracking;

import defpackage.n4u0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;

    public b(n4u0 n4u0Var) {
        this.a = n4u0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        EatsKitOrderTrackerImpl$updateActiveOrders$$inlined$map$1$1 eatsKitOrderTrackerImpl$updateActiveOrders$$inlined$map$1$1;
        int i;
        if (continuation instanceof EatsKitOrderTrackerImpl$updateActiveOrders$$inlined$map$1$1) {
            eatsKitOrderTrackerImpl$updateActiveOrders$$inlined$map$1$1 = (EatsKitOrderTrackerImpl$updateActiveOrders$$inlined$map$1$1) continuation;
            int i2 = eatsKitOrderTrackerImpl$updateActiveOrders$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eatsKitOrderTrackerImpl$updateActiveOrders$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = eatsKitOrderTrackerImpl$updateActiveOrders$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eatsKitOrderTrackerImpl$updateActiveOrders$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar);
                    eatsKitOrderTrackerImpl$updateActiveOrders$$inlined$map$1$1.L$0 = null;
                    eatsKitOrderTrackerImpl$updateActiveOrders$$inlined$map$1$1.L$1 = null;
                    eatsKitOrderTrackerImpl$updateActiveOrders$$inlined$map$1$1.L$2 = null;
                    eatsKitOrderTrackerImpl$updateActiveOrders$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, eatsKitOrderTrackerImpl$updateActiveOrders$$inlined$map$1$1) == coroutineSingletons) {
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
        eatsKitOrderTrackerImpl$updateActiveOrders$$inlined$map$1$1 = new EatsKitOrderTrackerImpl$updateActiveOrders$$inlined$map$1$1(this, continuation);
        Object obj2 = eatsKitOrderTrackerImpl$updateActiveOrders$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eatsKitOrderTrackerImpl$updateActiveOrders$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
