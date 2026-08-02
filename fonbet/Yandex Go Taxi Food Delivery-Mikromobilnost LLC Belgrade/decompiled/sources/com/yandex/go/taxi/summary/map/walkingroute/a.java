package com.yandex.go.taxi.summary.map.walkingroute;

import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.summary.experiments.UserLocationToSourcePointWalkRouteExperiment;
import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.g8e;
import defpackage.jst;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.nzs;
import defpackage.oyr;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ Address b;
    public final /* synthetic */ UserLocationToSourcePointWalkRouteExperiment c;
    public final /* synthetic */ e w;

    public a(vpr vprVar, Address address, UserLocationToSourcePointWalkRouteExperiment userLocationToSourcePointWalkRouteExperiment, e eVar) {
        this.a = vprVar;
        this.b = address;
        this.c = userLocationToSourcePointWalkRouteExperiment;
        this.w = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0131, code lost:
    
        if (r14.emit(r4, r2) == r3) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UserLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1 userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        Route route;
        int i2;
        vpr vprVar2;
        Iterator it;
        Object next;
        if (continuation instanceof UserLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1) {
            userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1 = (UserLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1) continuation;
            int i3 = userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    mo21 mo21Var = (mo21) obj;
                    zzs a = mo21Var.a();
                    Address address = this.b;
                    float j = ru.yandex.taxi.map.utils.a.j(a, address.B());
                    float f = mo21Var.c;
                    UserLocationToSourcePointWalkRouteExperiment userLocationToSourcePointWalkRouteExperiment = this.c;
                    int i4 = userLocationToSourcePointWalkRouteExperiment.g;
                    if (i4 < 0) {
                        g8e.B(jst.e, "USER_LOCATION_TO_SOURCE_WALK:INVALID_EXPERIMENT_ARGUMENT", null, oyr.i(i4, "invalid maxLocationAccuracyMeters: "), 2);
                        i4 = 0;
                    }
                    float f2 = i4;
                    vprVar = this.a;
                    if (f <= f2) {
                        int i5 = userLocationToSourcePointWalkRouteExperiment.f;
                        if (i5 < 0) {
                            g8e.B(jst.e, "USER_LOCATION_TO_SOURCE_WALK:INVALID_EXPERIMENT_ARGUMENT", null, oyr.i(i5, "invalid minDistanceOffsetMeters: "), 2);
                            i5 = Integer.MAX_VALUE;
                        }
                        if (j > i5) {
                            int i6 = userLocationToSourcePointWalkRouteExperiment.d;
                            if (i6 < 0) {
                                g8e.B(jst.e, "USER_LOCATION_TO_SOURCE_WALK:INVALID_EXPERIMENT_ARGUMENT", null, oyr.i(i6, "invalid maxDistanceMeters: "), 2);
                                i2 = 0;
                            } else {
                                i2 = i6;
                            }
                            if (j < i2) {
                                ru.yandex.taxi.walkroute.a aVar = this.w.a;
                                zzs a2 = mo21Var.a();
                                zzs B = address.B();
                                userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$0 = null;
                                userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$1 = null;
                                userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$2 = null;
                                userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$3 = null;
                                userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$4 = vprVar;
                                userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$5 = null;
                                userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$6 = null;
                                userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.F$0 = j;
                                userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.F$1 = f;
                                userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.label = 1;
                                obj2 = aVar.b(a2, B, userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1);
                                if (obj2 != coroutineSingletons) {
                                    vprVar2 = vprVar;
                                }
                                return coroutineSingletons;
                            }
                        }
                    }
                    route = null;
                    userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$4 = null;
                    userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$5 = null;
                    userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$6 = null;
                    userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.label = 2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar2 = (vpr) userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                it = ((Iterable) obj2).iterator();
                if (it.hasNext()) {
                    next = null;
                } else {
                    next = it.next();
                    if (it.hasNext()) {
                        double a3 = nzs.a((Route) next);
                        do {
                            Object next2 = it.next();
                            double a4 = nzs.a((Route) next2);
                            if (Double.compare(a3, a4) > 0) {
                                next = next2;
                                a3 = a4;
                            }
                        } while (it.hasNext());
                    }
                }
                route = (Route) next;
                vprVar = vprVar2;
                userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$0 = null;
                userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$1 = null;
                userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$2 = null;
                userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$3 = null;
                userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$4 = null;
                userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$5 = null;
                userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$6 = null;
                userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.label = 2;
            }
        }
        userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1 = new UserLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        it = ((Iterable) obj22).iterator();
        if (it.hasNext()) {
        }
        route = (Route) next;
        vprVar = vprVar2;
        userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$0 = null;
        userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$1 = null;
        userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$2 = null;
        userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$3 = null;
        userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$4 = null;
        userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$5 = null;
        userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.L$6 = null;
        userLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$map$1$2$1.label = 2;
    }
}
