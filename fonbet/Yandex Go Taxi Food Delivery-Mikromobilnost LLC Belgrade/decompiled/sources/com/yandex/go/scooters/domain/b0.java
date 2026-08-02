package com.yandex.go.scooters.domain;

import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.ion0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class b0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ zzs b;
    public final /* synthetic */ zzs c;
    public final /* synthetic */ f0 w;

    public b0(vpr vprVar, zzs zzsVar, zzs zzsVar2, f0 f0Var) {
        this.a = vprVar;
        this.b = zzsVar;
        this.c = zzsVar2;
        this.w = f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ee, code lost:
    
        if (r10.emit(r2, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        if (r11 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1 scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1;
        int i;
        zzs zzsVar;
        vpr vprVar;
        zzs zzsVar2;
        vpr vprVar2;
        Route route;
        zzs zzsVar3;
        Route route2;
        Route route3;
        if (continuation instanceof ScootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1) {
            scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1 = (ScootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1) continuation;
            int i2 = scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.label;
                f0 f0Var = this.w;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    zzsVar = (zzs) obj;
                    vprVar = this.a;
                    zzs zzsVar4 = this.b;
                    if (zzsVar4 != null) {
                        scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$0 = null;
                        scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$1 = null;
                        scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$2 = null;
                        scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$3 = null;
                        scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$4 = vprVar;
                        scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$5 = null;
                        scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$6 = zzsVar;
                        scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$7 = null;
                        scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.label = 1;
                        obj2 = f0.a(f0Var, zzsVar4, zzsVar, scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1);
                    } else {
                        zzsVar2 = zzsVar;
                        vprVar2 = vprVar;
                        route = null;
                        zzsVar3 = this.c;
                        if (zzsVar3 != null) {
                            scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$0 = null;
                            scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$1 = null;
                            scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$2 = null;
                            scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$3 = null;
                            scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$4 = vprVar2;
                            scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$5 = null;
                            scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$6 = null;
                            scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$7 = null;
                            scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$8 = route;
                            scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.label = 2;
                            Object b = f0.b(f0Var, zzsVar2, zzsVar3, scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1);
                            if (b != coroutineSingletons) {
                                Route route4 = route;
                                obj2 = b;
                                route2 = route4;
                                route3 = (Route) obj2;
                                ion0 ion0Var = new ion0(route2, route3);
                                scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$0 = null;
                                scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$1 = null;
                                scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$2 = null;
                                scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$3 = null;
                                scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$4 = null;
                                scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$5 = null;
                                scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$6 = null;
                                scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$7 = null;
                                scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$8 = null;
                                scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.label = 3;
                            }
                            return coroutineSingletons;
                        }
                        route2 = route;
                        route3 = null;
                        ion0 ion0Var2 = new ion0(route2, route3);
                        scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$0 = null;
                        scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$1 = null;
                        scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$2 = null;
                        scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$3 = null;
                        scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$4 = null;
                        scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$5 = null;
                        scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$6 = null;
                        scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$7 = null;
                        scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$8 = null;
                        scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.label = 3;
                    }
                } else if (i == 1) {
                    zzsVar = (zzs) scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$6;
                    vprVar = (vpr) scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    route2 = (Route) scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$8;
                    vprVar2 = (vpr) scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                    route3 = (Route) obj2;
                    ion0 ion0Var22 = new ion0(route2, route3);
                    scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$0 = null;
                    scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$1 = null;
                    scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$2 = null;
                    scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$3 = null;
                    scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$4 = null;
                    scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$5 = null;
                    scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$6 = null;
                    scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$7 = null;
                    scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.L$8 = null;
                    scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.label = 3;
                }
                route = (Route) obj2;
                vpr vprVar3 = vprVar;
                zzsVar2 = zzsVar;
                vprVar2 = vprVar3;
                zzsVar3 = this.c;
                if (zzsVar3 != null) {
                }
            }
        }
        scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1 = new ScootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1(this, continuation);
        Object obj22 = scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$2$1.label;
        f0 f0Var2 = this.w;
        if (i != 0) {
        }
        route = (Route) obj22;
        vpr vprVar32 = vprVar;
        zzsVar2 = zzsVar;
        vprVar2 = vprVar32;
        zzsVar3 = this.c;
        if (zzsVar3 != null) {
        }
    }
}
