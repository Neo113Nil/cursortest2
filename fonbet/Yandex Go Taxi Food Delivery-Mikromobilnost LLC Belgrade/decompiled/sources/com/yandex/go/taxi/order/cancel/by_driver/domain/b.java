package com.yandex.go.taxi.order.cancel.by_driver.domain;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.s180;
import defpackage.t180;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ t180 b;
    public final /* synthetic */ o2y0 c;

    public b(vpr vprVar, t180 t180Var, o2y0 o2y0Var) {
        this.a = vprVar;
        this.b = t180Var;
        this.c = o2y0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r8.l.w() != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        r7 = r7.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (defpackage.k880.b(r8) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
    
        if (defpackage.k880.b(r8) == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$2$1 orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$2$1;
        int i;
        o2y0 o2y0Var;
        if (continuation instanceof OrderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$2$1) {
            orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$2$1 = (OrderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$2$1) continuation;
            int i2 = orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    TaxiOrder taxiOrder = (TaxiOrder) obj;
                    t180 t180Var = this.b;
                    t180Var.getClass();
                    int i3 = s180.a[taxiOrder.h.b.ordinal()];
                    if (i3 == 1) {
                        if (!taxiOrder.E() && taxiOrder.V().F != OrderStatusInfo.CancelledBy.TIMEOUT) {
                            t180Var.a.getClass();
                        }
                        o2y0Var = null;
                    } else if (i3 != 2) {
                        if (i3 == 3) {
                        }
                        o2y0Var = null;
                    } else {
                        t180Var.a.getClass();
                    }
                    orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$2$1.L$0 = null;
                    orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$2$1.L$1 = null;
                    orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$2$1.L$2 = null;
                    orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$2$1.L$3 = null;
                    orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$2$1.label = 1;
                    if (vprVar.emit(o2y0Var, orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$2$1 = new OrderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
