package com.yandex.go.taxi.order.provider;

import defpackage.b2k;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class v implements tpr {
    public final /* synthetic */ b2k a;

    public v(b2k b2kVar) {
        this.a = b2kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RouteProvider$getRouteFlowWithoutForceUpdates$$inlined$map$2$1 routeProvider$getRouteFlowWithoutForceUpdates$$inlined$map$2$1;
        int i;
        if (continuation instanceof RouteProvider$getRouteFlowWithoutForceUpdates$$inlined$map$2$1) {
            routeProvider$getRouteFlowWithoutForceUpdates$$inlined$map$2$1 = (RouteProvider$getRouteFlowWithoutForceUpdates$$inlined$map$2$1) continuation;
            int i2 = routeProvider$getRouteFlowWithoutForceUpdates$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeProvider$getRouteFlowWithoutForceUpdates$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeProvider$getRouteFlowWithoutForceUpdates$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeProvider$getRouteFlowWithoutForceUpdates$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    u uVar = new u(vprVar);
                    routeProvider$getRouteFlowWithoutForceUpdates$$inlined$map$2$1.L$0 = null;
                    routeProvider$getRouteFlowWithoutForceUpdates$$inlined$map$2$1.L$1 = null;
                    routeProvider$getRouteFlowWithoutForceUpdates$$inlined$map$2$1.L$2 = null;
                    routeProvider$getRouteFlowWithoutForceUpdates$$inlined$map$2$1.label = 1;
                    if (this.a.collect(uVar, routeProvider$getRouteFlowWithoutForceUpdates$$inlined$map$2$1) == coroutineSingletons) {
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
        routeProvider$getRouteFlowWithoutForceUpdates$$inlined$map$2$1 = new RouteProvider$getRouteFlowWithoutForceUpdates$$inlined$map$2$1(this, continuation);
        Object obj2 = routeProvider$getRouteFlowWithoutForceUpdates$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeProvider$getRouteFlowWithoutForceUpdates$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
