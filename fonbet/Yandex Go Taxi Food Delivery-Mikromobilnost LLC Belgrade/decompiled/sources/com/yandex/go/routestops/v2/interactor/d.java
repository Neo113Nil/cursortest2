package com.yandex.go.routestops.v2.interactor;

import com.yandex.mapkit.map.CameraUpdateReason;
import defpackage.jf61;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zs7;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;

    public d(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ZoomRouteButtonStateInteractor$uiStateFlow$$inlined$map$1$2$1 zoomRouteButtonStateInteractor$uiStateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ZoomRouteButtonStateInteractor$uiStateFlow$$inlined$map$1$2$1) {
            zoomRouteButtonStateInteractor$uiStateFlow$$inlined$map$1$2$1 = (ZoomRouteButtonStateInteractor$uiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = zoomRouteButtonStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zoomRouteButtonStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = zoomRouteButtonStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zoomRouteButtonStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    zs7 zs7Var = (zs7) obj;
                    jf61 jf61Var = new jf61(zs7Var.c && zs7Var.b == CameraUpdateReason.GESTURES);
                    zoomRouteButtonStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    zoomRouteButtonStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    zoomRouteButtonStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    zoomRouteButtonStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    zoomRouteButtonStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(jf61Var, zoomRouteButtonStateInteractor$uiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        zoomRouteButtonStateInteractor$uiStateFlow$$inlined$map$1$2$1 = new ZoomRouteButtonStateInteractor$uiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = zoomRouteButtonStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zoomRouteButtonStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
