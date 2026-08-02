package com.yandex.go.navigator.repository;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class k implements vpr {
    public final /* synthetic */ vpr a;

    public k(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        NavigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$2$1 navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof NavigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$2$1) {
            navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$2$1 = (NavigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$2$1) continuation;
            int i2 = navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    DrivingRoute drivingRoute = (DrivingRoute) obj;
                    String routeId = drivingRoute != null ? drivingRoute.getRouteId() : null;
                    if (routeId == null) {
                        routeId = "";
                    }
                    navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$2$1.L$0 = null;
                    navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$2$1.L$1 = null;
                    navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$2$1.L$2 = null;
                    navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$2$1.L$3 = null;
                    navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(routeId, navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$2$1) == coroutineSingletons) {
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
        navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$2$1 = new NavigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$2$1(this, continuation);
        Object obj22 = navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
