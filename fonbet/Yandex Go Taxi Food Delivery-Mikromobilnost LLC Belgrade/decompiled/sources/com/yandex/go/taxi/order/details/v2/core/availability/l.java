package com.yandex.go.taxi.order.details.v2.core.availability;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class l implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ List b;

    public l(r0 r0Var, List list) {
        this.a = r0Var;
        this.b = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RideCardAvailabilityRepository$observeOrders$1$invokeSuspend$lambda$0$$inlined$map$1$1 rideCardAvailabilityRepository$observeOrders$1$invokeSuspend$lambda$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof RideCardAvailabilityRepository$observeOrders$1$invokeSuspend$lambda$0$$inlined$map$1$1) {
            rideCardAvailabilityRepository$observeOrders$1$invokeSuspend$lambda$0$$inlined$map$1$1 = (RideCardAvailabilityRepository$observeOrders$1$invokeSuspend$lambda$0$$inlined$map$1$1) continuation;
            int i2 = rideCardAvailabilityRepository$observeOrders$1$invokeSuspend$lambda$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardAvailabilityRepository$observeOrders$1$invokeSuspend$lambda$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardAvailabilityRepository$observeOrders$1$invokeSuspend$lambda$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardAvailabilityRepository$observeOrders$1$invokeSuspend$lambda$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    k kVar = new k(vprVar, this.b);
                    rideCardAvailabilityRepository$observeOrders$1$invokeSuspend$lambda$0$$inlined$map$1$1.L$0 = null;
                    rideCardAvailabilityRepository$observeOrders$1$invokeSuspend$lambda$0$$inlined$map$1$1.L$1 = null;
                    rideCardAvailabilityRepository$observeOrders$1$invokeSuspend$lambda$0$$inlined$map$1$1.L$2 = null;
                    rideCardAvailabilityRepository$observeOrders$1$invokeSuspend$lambda$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(kVar, rideCardAvailabilityRepository$observeOrders$1$invokeSuspend$lambda$0$$inlined$map$1$1) == coroutineSingletons) {
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
        rideCardAvailabilityRepository$observeOrders$1$invokeSuspend$lambda$0$$inlined$map$1$1 = new RideCardAvailabilityRepository$observeOrders$1$invokeSuspend$lambda$0$$inlined$map$1$1(this, continuation);
        Object obj2 = rideCardAvailabilityRepository$observeOrders$1$invokeSuspend$lambda$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardAvailabilityRepository$observeOrders$1$invokeSuspend$lambda$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
