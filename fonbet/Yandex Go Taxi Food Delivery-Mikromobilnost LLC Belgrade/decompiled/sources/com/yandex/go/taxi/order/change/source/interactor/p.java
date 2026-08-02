package com.yandex.go.taxi.order.change.source.interactor;

import defpackage.cg9;
import defpackage.dg9;
import defpackage.eg9;
import defpackage.fg9;
import defpackage.n380;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xf9;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class p implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ x b;

    public p(vpr vprVar, x xVar) {
        this.a = vprVar;
        this.b = xVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderSourcePinStateInteractor$sourceDrivingPinState$$inlined$mapNotNull$1$2$1 orderSourcePinStateInteractor$sourceDrivingPinState$$inlined$mapNotNull$1$2$1;
        int i;
        n380 n380Var;
        if (continuation instanceof OrderSourcePinStateInteractor$sourceDrivingPinState$$inlined$mapNotNull$1$2$1) {
            orderSourcePinStateInteractor$sourceDrivingPinState$$inlined$mapNotNull$1$2$1 = (OrderSourcePinStateInteractor$sourceDrivingPinState$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = orderSourcePinStateInteractor$sourceDrivingPinState$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderSourcePinStateInteractor$sourceDrivingPinState$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderSourcePinStateInteractor$sourceDrivingPinState$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderSourcePinStateInteractor$sourceDrivingPinState$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    fg9 fg9Var = (fg9) obj;
                    this.b.getClass();
                    if (fg9Var instanceof eg9) {
                        xf9 xf9Var = ((eg9) fg9Var).a;
                        n380Var = new n380(true, true, xf9Var.a, xf9Var.b);
                    } else if (fg9Var instanceof dg9) {
                        n380Var = n380.e;
                    } else {
                        if (!(fg9Var instanceof cg9)) {
                            w511.b();
                            return null;
                        }
                        n380Var = null;
                    }
                    if (n380Var != null) {
                        orderSourcePinStateInteractor$sourceDrivingPinState$$inlined$mapNotNull$1$2$1.L$0 = null;
                        orderSourcePinStateInteractor$sourceDrivingPinState$$inlined$mapNotNull$1$2$1.L$1 = null;
                        orderSourcePinStateInteractor$sourceDrivingPinState$$inlined$mapNotNull$1$2$1.L$2 = null;
                        orderSourcePinStateInteractor$sourceDrivingPinState$$inlined$mapNotNull$1$2$1.L$3 = null;
                        orderSourcePinStateInteractor$sourceDrivingPinState$$inlined$mapNotNull$1$2$1.L$4 = null;
                        orderSourcePinStateInteractor$sourceDrivingPinState$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(n380Var, orderSourcePinStateInteractor$sourceDrivingPinState$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        orderSourcePinStateInteractor$sourceDrivingPinState$$inlined$mapNotNull$1$2$1 = new OrderSourcePinStateInteractor$sourceDrivingPinState$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = orderSourcePinStateInteractor$sourceDrivingPinState$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderSourcePinStateInteractor$sourceDrivingPinState$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
