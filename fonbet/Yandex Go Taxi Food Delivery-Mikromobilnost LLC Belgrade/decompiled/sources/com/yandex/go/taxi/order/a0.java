package com.yandex.go.taxi.order;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.a3y0;
import defpackage.a880;
import defpackage.h3y;
import defpackage.hst;
import defpackage.jst;
import defpackage.lh7;
import defpackage.mgz0;
import defpackage.ny61;
import defpackage.p2y0;
import defpackage.pzt0;
import defpackage.rf5;
import defpackage.y180;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.ui.MainUiAvailabilityMonitor;

/* loaded from: classes14.dex */
public final class a0 {
    public final y180 a;
    public final com.yandex.go.taxi.order.analytics.a b;
    public final ru.yandex.taxi.order.l c;
    public final ru.yandex.taxi.order.k d;
    public final rf5 e;
    public final MainUiAvailabilityMonitor f;
    public final com.yandex.go.taxi.order.provider.a g;
    public final y h;
    public final h3y i;
    public final h3y j;
    public final mgz0 k;
    public final a880 l;
    public final ru.yandex.taxi.orders.g m;
    public final p2y0 n;
    public final a3y0 o = new a3y0(TaxiOrderLogGroup.CORE.getTag(), "OrderStatusResponseHandler");

    public a0(y180 y180Var, com.yandex.go.taxi.order.analytics.a aVar, ru.yandex.taxi.order.l lVar, ru.yandex.taxi.order.k kVar, rf5 rf5Var, MainUiAvailabilityMonitor mainUiAvailabilityMonitor, com.yandex.go.taxi.order.provider.a aVar2, y yVar, h3y h3yVar, h3y h3yVar2, mgz0 mgz0Var, a880 a880Var, ru.yandex.taxi.orders.g gVar, p2y0 p2y0Var) {
        this.a = y180Var;
        this.b = aVar;
        this.c = lVar;
        this.d = kVar;
        this.e = rf5Var;
        this.f = mainUiAvailabilityMonitor;
        this.g = aVar2;
        this.h = yVar;
        this.i = h3yVar;
        this.j = h3yVar2;
        this.k = mgz0Var;
        this.l = a880Var;
        this.m = gVar;
        this.n = p2y0Var;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v21 n280, still in use, count: 3, list:
          (r8v21 n280) from 0x047c: MOVE (r17v4 n280) = (r8v21 n280)
          (r8v21 n280) from 0x0459: MOVE (r17v7 n280) = (r8v21 n280)
          (r8v21 n280) from 0x0450: MOVE (r17v8 n280) = (r8v21 n280)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public final void a(com.yandex.go.taxi.order.models.api.TaxiOrder r34, boolean r35, com.yandex.go.taxi.order.b0 r36, long r37) {
        /*
            Method dump skipped, instructions count: 1796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.go.taxi.order.a0.a(com.yandex.go.taxi.order.models.api.TaxiOrder, boolean, com.yandex.go.taxi.order.b0, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(OrderStatusProvider$OrderNotFoundException orderStatusProvider$OrderNotFoundException, ContinuationImpl continuationImpl) {
        OrderStatusResponseHandler$handleOrderNotFound$1 orderStatusResponseHandler$handleOrderNotFound$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        OrderStatusProvider$OrderNotFoundException orderStatusProvider$OrderNotFoundException2;
        String str;
        TaxiOrder i2;
        OrderStatusProvider$OrderNotFoundException orderStatusProvider$OrderNotFoundException3;
        if (continuationImpl instanceof OrderStatusResponseHandler$handleOrderNotFound$1) {
            orderStatusResponseHandler$handleOrderNotFound$1 = (OrderStatusResponseHandler$handleOrderNotFound$1) continuationImpl;
            int i3 = orderStatusResponseHandler$handleOrderNotFound$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                orderStatusResponseHandler$handleOrderNotFound$1.label = i3 - Integer.MIN_VALUE;
                Object obj = orderStatusResponseHandler$handleOrderNotFound$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderStatusResponseHandler$handleOrderNotFound$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String orderId = orderStatusProvider$OrderNotFoundException.getOrderId();
                    pzt0 i4 = this.m.i();
                    orderStatusResponseHandler$handleOrderNotFound$1.L$0 = orderStatusProvider$OrderNotFoundException;
                    orderStatusResponseHandler$handleOrderNotFound$1.L$1 = orderId;
                    orderStatusResponseHandler$handleOrderNotFound$1.label = 1;
                    if (i4.u0(orderStatusResponseHandler$handleOrderNotFound$1) != coroutineSingletons) {
                        orderStatusProvider$OrderNotFoundException2 = orderStatusProvider$OrderNotFoundException;
                        str = orderId;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) orderStatusResponseHandler$handleOrderNotFound$1.L$1;
                    orderStatusProvider$OrderNotFoundException3 = (OrderStatusProvider$OrderNotFoundException) orderStatusResponseHandler$handleOrderNotFound$1.L$0;
                    kotlin.b.b(obj);
                    this.h.n(0L, str, "OrderNotFoundException");
                    throw orderStatusProvider$OrderNotFoundException3;
                }
                str = (String) orderStatusResponseHandler$handleOrderNotFound$1.L$1;
                orderStatusProvider$OrderNotFoundException2 = (OrderStatusProvider$OrderNotFoundException) orderStatusResponseHandler$handleOrderNotFound$1.L$0;
                kotlin.b.b(obj);
                i2 = ((com.yandex.go.taxi.order.domain.repositories.e0) this.n).i(str);
                if (i2 == null && (i2.J() || i2.I())) {
                    return zy11.a;
                }
                orderStatusResponseHandler$handleOrderNotFound$1.L$0 = orderStatusProvider$OrderNotFoundException2;
                orderStatusResponseHandler$handleOrderNotFound$1.L$1 = str;
                orderStatusResponseHandler$handleOrderNotFound$1.L$2 = null;
                orderStatusResponseHandler$handleOrderNotFound$1.label = 2;
                if (this.g.h(str, false, true, orderStatusResponseHandler$handleOrderNotFound$1) != coroutineSingletons) {
                    orderStatusProvider$OrderNotFoundException3 = orderStatusProvider$OrderNotFoundException2;
                    this.h.n(0L, str, "OrderNotFoundException");
                    throw orderStatusProvider$OrderNotFoundException3;
                }
                return coroutineSingletons;
            }
        }
        orderStatusResponseHandler$handleOrderNotFound$1 = new OrderStatusResponseHandler$handleOrderNotFound$1(this, continuationImpl);
        Object obj2 = orderStatusResponseHandler$handleOrderNotFound$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderStatusResponseHandler$handleOrderNotFound$1.label;
        if (i != 0) {
        }
        i2 = ((com.yandex.go.taxi.order.domain.repositories.e0) this.n).i(str);
        if (i2 == null) {
        }
        orderStatusResponseHandler$handleOrderNotFound$1.L$0 = orderStatusProvider$OrderNotFoundException2;
        orderStatusResponseHandler$handleOrderNotFound$1.L$1 = str;
        orderStatusResponseHandler$handleOrderNotFound$1.L$2 = null;
        orderStatusResponseHandler$handleOrderNotFound$1.label = 2;
        if (this.g.h(str, false, true, orderStatusResponseHandler$handleOrderNotFound$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final void c(TaxiOrder taxiOrder, long j) {
        boolean b = this.c.b(true);
        a3y0 a3y0Var = this.o;
        if (!b || this.f.a()) {
            a3y0Var.f(new lh7(taxiOrder, 2), "updateOrderNotificationIfBackground");
            this.d.b.k(taxiOrder, true, j);
        } else {
            a3y0Var.getClass();
            a3y0.h(new String[]{"updateOrderNotificationIfBackground"});
            hst hstVar = jst.e;
        }
    }
}
