package com.yandex.go.taxi.order.map.overlay;

import defpackage.h8l0;
import defpackage.ny61;
import defpackage.ool0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a0 implements vpr {
    public final /* synthetic */ vpr a;

    public a0(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$2$2$1 orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof OrderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$2$2$1) {
            orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$2$2$1 = (OrderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$2$2$1) continuation;
            int i2 = orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ool0 ool0Var = ((h8l0) obj).a;
                    orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$2$2$1.L$0 = null;
                    orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$2$2$1.L$1 = null;
                    orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$2$2$1.L$2 = null;
                    orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$2$2$1.L$3 = null;
                    orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(ool0Var, orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$2$2$1) == coroutineSingletons) {
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
        orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$2$2$1 = new OrderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$2$2$1(this, continuation);
        Object obj22 = orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
