package com.yandex.go.taxi.tariffs.internal.routestats.interactor;

import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.d0l0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w3l0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class w implements vpr {
    public final /* synthetic */ vpr a;

    public w(vpr vprVar, a0 a0Var) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RouteStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$2$1 routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$2$1;
        int i;
        Zone zone;
        if (continuation instanceof RouteStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$2$1) {
            routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$2$1 = (RouteStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$2$1) continuation;
            int i2 = routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    d0l0 d0l0Var = (d0l0) obj;
                    ZoneAddress zoneAddress = d0l0Var.a;
                    w3l0 w3l0Var = (zoneAddress == null || (zone = zoneAddress.b) == null) ? null : new w3l0(zone, d0l0Var.a());
                    if (w3l0Var != null) {
                        routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$2$1.L$0 = null;
                        routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$2$1.L$1 = null;
                        routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$2$1.L$2 = null;
                        routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$2$1.L$3 = null;
                        routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$2$1.L$4 = null;
                        routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$2$1.label = 1;
                        if (this.a.emit(w3l0Var, routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$2$1 = new RouteStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$2$1(this, continuation);
        Object obj22 = routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
