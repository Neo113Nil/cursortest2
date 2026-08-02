package com.yandex.go.navigator.floating_control_buttons.route_controls_conteiner;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr a;

    public d(tpr tprVar) {
        this.a = tprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RouteControlsUiStateInteractor$special$$inlined$map$2$1 routeControlsUiStateInteractor$special$$inlined$map$2$1;
        int i;
        if (continuation instanceof RouteControlsUiStateInteractor$special$$inlined$map$2$1) {
            routeControlsUiStateInteractor$special$$inlined$map$2$1 = (RouteControlsUiStateInteractor$special$$inlined$map$2$1) continuation;
            int i2 = routeControlsUiStateInteractor$special$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeControlsUiStateInteractor$special$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeControlsUiStateInteractor$special$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeControlsUiStateInteractor$special$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar);
                    routeControlsUiStateInteractor$special$$inlined$map$2$1.L$0 = null;
                    routeControlsUiStateInteractor$special$$inlined$map$2$1.L$1 = null;
                    routeControlsUiStateInteractor$special$$inlined$map$2$1.L$2 = null;
                    routeControlsUiStateInteractor$special$$inlined$map$2$1.label = 1;
                    if (this.a.collect(cVar, routeControlsUiStateInteractor$special$$inlined$map$2$1) == coroutineSingletons) {
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
        routeControlsUiStateInteractor$special$$inlined$map$2$1 = new RouteControlsUiStateInteractor$special$$inlined$map$2$1(this, continuation);
        Object obj2 = routeControlsUiStateInteractor$special$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeControlsUiStateInteractor$special$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
