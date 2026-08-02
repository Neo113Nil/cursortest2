package com.yandex.go.navigator.domain;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.navigation.automotive.Navigation;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class r implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ t b;

    public r(vpr vprVar, t tVar) {
        this.a = vprVar;
        this.b = tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        NavigationManagerImpl$special$$inlined$map$1$2$1 navigationManagerImpl$special$$inlined$map$1$2$1;
        int i;
        DrivingRoute drivingRoute;
        Object obj2;
        if (continuation instanceof NavigationManagerImpl$special$$inlined$map$1$2$1) {
            navigationManagerImpl$special$$inlined$map$1$2$1 = (NavigationManagerImpl$special$$inlined$map$1$2$1) continuation;
            int i2 = navigationManagerImpl$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigationManagerImpl$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = navigationManagerImpl$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigationManagerImpl$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    List<String> list = (List) obj;
                    Navigation navigation = this.b.w;
                    List<DrivingRoute> routes = navigation != null ? navigation.getRoutes() : null;
                    ArrayList arrayList = new ArrayList();
                    for (String str : list) {
                        if (routes != null) {
                            Iterator<T> it = routes.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it.next();
                                if (jl40.l(((DrivingRoute) obj2).getRouteId(), str)) {
                                    break;
                                }
                            }
                            drivingRoute = (DrivingRoute) obj2;
                        } else {
                            drivingRoute = null;
                        }
                        if (drivingRoute != null) {
                            arrayList.add(drivingRoute);
                        }
                    }
                    navigationManagerImpl$special$$inlined$map$1$2$1.L$0 = null;
                    navigationManagerImpl$special$$inlined$map$1$2$1.L$1 = null;
                    navigationManagerImpl$special$$inlined$map$1$2$1.L$2 = null;
                    navigationManagerImpl$special$$inlined$map$1$2$1.L$3 = null;
                    navigationManagerImpl$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList, navigationManagerImpl$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        navigationManagerImpl$special$$inlined$map$1$2$1 = new NavigationManagerImpl$special$$inlined$map$1$2$1(this, continuation);
        Object obj32 = navigationManagerImpl$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigationManagerImpl$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
