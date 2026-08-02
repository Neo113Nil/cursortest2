package com.yandex.go.chargers.multiorder.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zda;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class e implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ zda b;

    public e(tpr tprVar, zda zdaVar) {
        this.a = tprVar;
        this.b = zdaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ChargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$1 chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$1;
        int i;
        if (continuation instanceof ChargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$1) {
            chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$1 = (ChargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$1) continuation;
            int i2 = chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b);
                    chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$1.L$0 = null;
                    chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$1.L$1 = null;
                    chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$1.L$2 = null;
                    chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$1.label = 1;
                    if (this.a.collect(dVar, chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$1) == coroutineSingletons) {
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
        chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$1 = new ChargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$1(this, continuation);
        Object obj2 = chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
