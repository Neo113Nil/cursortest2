package com.yandex.go.taxi.order.change.source.interactor;

import defpackage.hxx0;
import defpackage.iqb0;
import defpackage.l380;
import defpackage.n380;
import defpackage.ny61;
import defpackage.s380;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class l implements vpr {
    public final /* synthetic */ vpr a;

    public l(vpr vprVar, x xVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderSourcePinStateInteractor$pickupPointPinState$$inlined$map$1$2$1 orderSourcePinStateInteractor$pickupPointPinState$$inlined$map$1$2$1;
        int i;
        n380 n380Var;
        s380 s380Var;
        if (continuation instanceof OrderSourcePinStateInteractor$pickupPointPinState$$inlined$map$1$2$1) {
            orderSourcePinStateInteractor$pickupPointPinState$$inlined$map$1$2$1 = (OrderSourcePinStateInteractor$pickupPointPinState$$inlined$map$1$2$1) continuation;
            int i2 = orderSourcePinStateInteractor$pickupPointPinState$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderSourcePinStateInteractor$pickupPointPinState$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderSourcePinStateInteractor$pickupPointPinState$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderSourcePinStateInteractor$pickupPointPinState$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    hxx0 hxx0Var = (hxx0) obj;
                    iqb0 iqb0Var = hxx0Var != null ? hxx0Var.e : null;
                    if (iqb0Var == null) {
                        s380Var = s380.c;
                    } else {
                        String str = iqb0Var.c;
                        String str2 = iqb0Var.a;
                        if (iqb0Var.b) {
                            if (str == null) {
                                str = "";
                            }
                            n380Var = new n380(true, true, str2, str);
                        } else if (iqb0Var.d) {
                            if (str == null) {
                                str = "";
                            }
                            n380Var = new n380(false, true, str, str2);
                        } else {
                            if (str == null) {
                                str = "";
                            }
                            n380Var = new n380(true, false, str2, str);
                        }
                        s380Var = new s380(n380Var, new l380(iqb0Var.f));
                    }
                    orderSourcePinStateInteractor$pickupPointPinState$$inlined$map$1$2$1.L$0 = null;
                    orderSourcePinStateInteractor$pickupPointPinState$$inlined$map$1$2$1.L$1 = null;
                    orderSourcePinStateInteractor$pickupPointPinState$$inlined$map$1$2$1.L$2 = null;
                    orderSourcePinStateInteractor$pickupPointPinState$$inlined$map$1$2$1.L$3 = null;
                    orderSourcePinStateInteractor$pickupPointPinState$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(s380Var, orderSourcePinStateInteractor$pickupPointPinState$$inlined$map$1$2$1) == coroutineSingletons) {
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
        orderSourcePinStateInteractor$pickupPointPinState$$inlined$map$1$2$1 = new OrderSourcePinStateInteractor$pickupPointPinState$$inlined$map$1$2$1(this, continuation);
        Object obj22 = orderSourcePinStateInteractor$pickupPointPinState$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderSourcePinStateInteractor$pickupPointPinState$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
