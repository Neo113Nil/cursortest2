package com.yandex.go.scooters.multiorder.proxy;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class b implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.internal.g a;

    public b(kotlinx.coroutines.flow.internal.g gVar) {
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersOrderTrackingInteractor$listenOrders$$inlined$map$1$1 scootersOrderTrackingInteractor$listenOrders$$inlined$map$1$1;
        int i;
        if (continuation instanceof ScootersOrderTrackingInteractor$listenOrders$$inlined$map$1$1) {
            scootersOrderTrackingInteractor$listenOrders$$inlined$map$1$1 = (ScootersOrderTrackingInteractor$listenOrders$$inlined$map$1$1) continuation;
            int i2 = scootersOrderTrackingInteractor$listenOrders$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersOrderTrackingInteractor$listenOrders$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersOrderTrackingInteractor$listenOrders$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersOrderTrackingInteractor$listenOrders$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar);
                    scootersOrderTrackingInteractor$listenOrders$$inlined$map$1$1.L$0 = null;
                    scootersOrderTrackingInteractor$listenOrders$$inlined$map$1$1.L$1 = null;
                    scootersOrderTrackingInteractor$listenOrders$$inlined$map$1$1.L$2 = null;
                    scootersOrderTrackingInteractor$listenOrders$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, scootersOrderTrackingInteractor$listenOrders$$inlined$map$1$1) == coroutineSingletons) {
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
        scootersOrderTrackingInteractor$listenOrders$$inlined$map$1$1 = new ScootersOrderTrackingInteractor$listenOrders$$inlined$map$1$1(this, continuation);
        Object obj2 = scootersOrderTrackingInteractor$listenOrders$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOrderTrackingInteractor$listenOrders$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
