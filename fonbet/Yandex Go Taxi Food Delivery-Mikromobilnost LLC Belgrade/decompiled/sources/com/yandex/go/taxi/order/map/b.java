package com.yandex.go.taxi.order.map;

import defpackage.b2k;
import defpackage.c06;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements tpr {
    public final /* synthetic */ b2k a;
    public final /* synthetic */ c06 b;

    public b(b2k b2kVar, c06 c06Var) {
        this.a = b2kVar;
        this.b = c06Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        CarTrackingAvailabilityInteractor$isCarTrackingAvailableAsFlow$$inlined$map$1$1 carTrackingAvailabilityInteractor$isCarTrackingAvailableAsFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof CarTrackingAvailabilityInteractor$isCarTrackingAvailableAsFlow$$inlined$map$1$1) {
            carTrackingAvailabilityInteractor$isCarTrackingAvailableAsFlow$$inlined$map$1$1 = (CarTrackingAvailabilityInteractor$isCarTrackingAvailableAsFlow$$inlined$map$1$1) continuation;
            int i2 = carTrackingAvailabilityInteractor$isCarTrackingAvailableAsFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                carTrackingAvailabilityInteractor$isCarTrackingAvailableAsFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = carTrackingAvailabilityInteractor$isCarTrackingAvailableAsFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = carTrackingAvailabilityInteractor$isCarTrackingAvailableAsFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    carTrackingAvailabilityInteractor$isCarTrackingAvailableAsFlow$$inlined$map$1$1.L$0 = null;
                    carTrackingAvailabilityInteractor$isCarTrackingAvailableAsFlow$$inlined$map$1$1.L$1 = null;
                    carTrackingAvailabilityInteractor$isCarTrackingAvailableAsFlow$$inlined$map$1$1.L$2 = null;
                    carTrackingAvailabilityInteractor$isCarTrackingAvailableAsFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, carTrackingAvailabilityInteractor$isCarTrackingAvailableAsFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        carTrackingAvailabilityInteractor$isCarTrackingAvailableAsFlow$$inlined$map$1$1 = new CarTrackingAvailabilityInteractor$isCarTrackingAvailableAsFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = carTrackingAvailabilityInteractor$isCarTrackingAvailableAsFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = carTrackingAvailabilityInteractor$isCarTrackingAvailableAsFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
