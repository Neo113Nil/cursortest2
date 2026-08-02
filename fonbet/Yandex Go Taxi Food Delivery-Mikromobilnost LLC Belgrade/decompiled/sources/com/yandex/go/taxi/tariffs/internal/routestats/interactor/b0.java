package com.yandex.go.taxi.tariffs.internal.routestats.interactor;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.taxi.tariffs.internal.routestats.models.RouteStatsMode;
import defpackage.hbl0;
import defpackage.ny61;
import defpackage.o370;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class b0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ o370 b;

    public b0(vpr vprVar, o370 o370Var) {
        this.a = vprVar;
        this.b = o370Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RouteStatsModeInteractor$rsModeFlow$$inlined$map$1$2$1 routeStatsModeInteractor$rsModeFlow$$inlined$map$1$2$1;
        int i;
        RouteStatsMode routeStatsMode;
        if (continuation instanceof RouteStatsModeInteractor$rsModeFlow$$inlined$map$1$2$1) {
            routeStatsModeInteractor$rsModeFlow$$inlined$map$1$2$1 = (RouteStatsModeInteractor$rsModeFlow$$inlined$map$1$2$1) continuation;
            int i2 = routeStatsModeInteractor$rsModeFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeStatsModeInteractor$rsModeFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = routeStatsModeInteractor$rsModeFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeStatsModeInteractor$rsModeFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Screen screen = (Screen) obj;
                    if (!((com.yandex.go.navigation.screen.c) this.b.a).e() && screen != Screen.TAXI_MAIN) {
                        switch (hbl0.a[screen.ordinal()]) {
                            default:
                                if (screen != Screen.SUMMARY_TRANSPORT && screen != Screen.MOBILITY_HUB && screen != Screen.SUMMARY_DRIVE) {
                                    routeStatsMode = null;
                                    break;
                                }
                                break;
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                routeStatsMode = RouteStatsMode.FULL;
                                break;
                        }
                    } else {
                        routeStatsMode = RouteStatsMode.LIGHT;
                    }
                    routeStatsModeInteractor$rsModeFlow$$inlined$map$1$2$1.L$0 = null;
                    routeStatsModeInteractor$rsModeFlow$$inlined$map$1$2$1.L$1 = null;
                    routeStatsModeInteractor$rsModeFlow$$inlined$map$1$2$1.L$2 = null;
                    routeStatsModeInteractor$rsModeFlow$$inlined$map$1$2$1.L$3 = null;
                    routeStatsModeInteractor$rsModeFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(routeStatsMode, routeStatsModeInteractor$rsModeFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        routeStatsModeInteractor$rsModeFlow$$inlined$map$1$2$1 = new RouteStatsModeInteractor$rsModeFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = routeStatsModeInteractor$rsModeFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeStatsModeInteractor$rsModeFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
