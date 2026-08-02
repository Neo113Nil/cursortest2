package com.yandex.go.taxi.order.domain.interactors;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.status.OrderStatusWindowNotification;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.eg3;
import defpackage.ike;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.o8s0;
import defpackage.qhw0;
import defpackage.sjh;
import defpackage.t9s0;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.xh60;
import defpackage.ysg;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class i {
    public final ru.yandex.taxi.communications.data.a a;
    public final ysg b;
    public final ike c;

    public i(ru.yandex.taxi.communications.data.a aVar, tt2 tt2Var, ysg ysgVar) {
        this.a = aVar;
        this.b = ysgVar;
        qhw0 a = jl40.a();
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.c = bvf0.a(cvw.U(a, mdh.b));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(i iVar, TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        OrderStatusWindowInteractor$tryToGetOrderStatusWindowNotification$1 orderStatusWindowInteractor$tryToGetOrderStatusWindowNotification$1;
        int i;
        boolean z;
        xh60 b;
        o8s0 o8s0Var;
        xh60 xh60Var;
        iVar.getClass();
        if (continuationImpl instanceof OrderStatusWindowInteractor$tryToGetOrderStatusWindowNotification$1) {
            orderStatusWindowInteractor$tryToGetOrderStatusWindowNotification$1 = (OrderStatusWindowInteractor$tryToGetOrderStatusWindowNotification$1) continuationImpl;
            int i2 = orderStatusWindowInteractor$tryToGetOrderStatusWindowNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderStatusWindowInteractor$tryToGetOrderStatusWindowNotification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderStatusWindowInteractor$tryToGetOrderStatusWindowNotification$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderStatusWindowInteractor$tryToGetOrderStatusWindowNotification$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b = taxiOrder.V().P.b("order_status_window");
                    if (b != null && eg3.f((OrderStatusWindowNotification) b.b, taxiOrder.h.b)) {
                        o8s0 o8s0Var2 = ((OrderStatusWindowNotification) b.b).j;
                        if (o8s0Var2 != null) {
                            ru.yandex.taxi.communications.data.a aVar = iVar.a;
                            String str = b.a;
                            orderStatusWindowInteractor$tryToGetOrderStatusWindowNotification$1.L$0 = null;
                            orderStatusWindowInteractor$tryToGetOrderStatusWindowNotification$1.L$1 = b;
                            orderStatusWindowInteractor$tryToGetOrderStatusWindowNotification$1.L$2 = o8s0Var2;
                            orderStatusWindowInteractor$tryToGetOrderStatusWindowNotification$1.label = 1;
                            Object b2 = aVar.b(str, orderStatusWindowInteractor$tryToGetOrderStatusWindowNotification$1);
                            if (b2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            obj = b2;
                            o8s0Var = o8s0Var2;
                            xh60Var = b;
                        }
                        if (z) {
                            return b;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o8s0Var = (o8s0) orderStatusWindowInteractor$tryToGetOrderStatusWindowNotification$1.L$2;
                xh60Var = (xh60) orderStatusWindowInteractor$tryToGetOrderStatusWindowNotification$1.L$1;
                kotlin.b.b(obj);
                t9s0 t9s0Var = (t9s0) obj;
                z = !(t9s0Var.b >= o8s0Var.a) && (t9s0Var.c >= o8s0Var.c) && t9s0Var.d < o8s0Var.b;
                b = xh60Var;
                if (z) {
                    return null;
                }
            }
        }
        orderStatusWindowInteractor$tryToGetOrderStatusWindowNotification$1 = new OrderStatusWindowInteractor$tryToGetOrderStatusWindowNotification$1(iVar, continuationImpl);
        Object obj2 = orderStatusWindowInteractor$tryToGetOrderStatusWindowNotification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderStatusWindowInteractor$tryToGetOrderStatusWindowNotification$1.label;
        if (i != 0) {
        }
        t9s0 t9s0Var2 = (t9s0) obj2;
        if (t9s0Var2.b >= o8s0Var.a) {
        }
        b = xh60Var;
        if (z) {
        }
    }

    public final void b(TaxiOrder taxiOrder) {
        com.yandex.go.coroutines.b.g(this.c, null, null, new OrderStatusWindowInteractor$update$1(this, taxiOrder, null), 3);
    }
}
