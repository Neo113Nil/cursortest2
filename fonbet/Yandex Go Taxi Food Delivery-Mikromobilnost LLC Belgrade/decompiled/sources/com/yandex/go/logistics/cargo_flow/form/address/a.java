package com.yandex.go.logistics.cargo_flow.form.address;

import defpackage.cni;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.x5i;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
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
        DeliveryRouteInteractorImpl$routeFlow$lambda$0$$inlined$map$1$2$1 deliveryRouteInteractorImpl$routeFlow$lambda$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof DeliveryRouteInteractorImpl$routeFlow$lambda$0$$inlined$map$1$2$1) {
            deliveryRouteInteractorImpl$routeFlow$lambda$0$$inlined$map$1$2$1 = (DeliveryRouteInteractorImpl$routeFlow$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = deliveryRouteInteractorImpl$routeFlow$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryRouteInteractorImpl$routeFlow$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliveryRouteInteractorImpl$routeFlow$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryRouteInteractorImpl$routeFlow$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    cni cniVar = ((x5i) obj).a;
                    deliveryRouteInteractorImpl$routeFlow$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    deliveryRouteInteractorImpl$routeFlow$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    deliveryRouteInteractorImpl$routeFlow$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    deliveryRouteInteractorImpl$routeFlow$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    deliveryRouteInteractorImpl$routeFlow$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(cniVar, deliveryRouteInteractorImpl$routeFlow$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        deliveryRouteInteractorImpl$routeFlow$lambda$0$$inlined$map$1$2$1 = new DeliveryRouteInteractorImpl$routeFlow$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = deliveryRouteInteractorImpl$routeFlow$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryRouteInteractorImpl$routeFlow$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
