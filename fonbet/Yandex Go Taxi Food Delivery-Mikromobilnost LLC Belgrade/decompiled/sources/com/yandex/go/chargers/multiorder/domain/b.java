package com.yandex.go.chargers.multiorder.domain;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.wl40;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$1$2$1 chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ChargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$1$2$1) {
            chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$1$2$1 = (ChargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$1$2$1) continuation;
            int i2 = chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = ((wl40) obj).g;
                    chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$1$2$1.L$0 = null;
                    chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$1$2$1.L$1 = null;
                    chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$1$2$1.L$2 = null;
                    chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$1$2$1.L$3 = null;
                    chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(list, chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$1$2$1) == coroutineSingletons) {
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
        chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$1$2$1 = new ChargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$1$2$1(this, continuation);
        Object obj22 = chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
