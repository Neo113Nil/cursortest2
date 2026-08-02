package com.yandex.go.taxi.order.provider;

import defpackage.ffx;
import defpackage.lz40;
import defpackage.n8l0;
import defpackage.o2y0;
import defpackage.ycs0;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes14.dex */
public final class w {
    public final ycs0 a = new ycs0(0);
    public com.yandex.go.taxi.order.repositories.c b;

    public w(n8l0 n8l0Var) {
        n8l0Var.getClass();
        this.b = (com.yandex.go.taxi.order.repositories.c) n8l0Var.a.get();
    }

    public final synchronized lz40 a(o2y0 o2y0Var) {
        Object obj;
        try {
            if (!this.a.containsKey(o2y0Var)) {
                this.a.put(o2y0Var, ffx.b(0, 1, BufferOverflow.DROP_OLDEST));
            }
            obj = this.a.get(o2y0Var);
            if (obj == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        } catch (Throwable th) {
            throw th;
        }
        return (lz40) obj;
    }

    public final v b(o2y0 o2y0Var) {
        com.yandex.go.taxi.order.repositories.c cVar = this.b;
        if (cVar == null) {
            cVar = null;
        }
        return new v(kotlinx.coroutines.flow.e.s(new t(cVar.b(o2y0Var)), new RouteProvider$getRouteFlowWithoutForceUpdates$2(2, this, w.class, "compareChanges", "compareChanges(Lcom/yandex/go/taxi/order/provider/RouteProvider$OrderRouteData;Lcom/yandex/go/taxi/order/provider/RouteProvider$OrderRouteData;)Z", 0)));
    }

    public final void c(com.yandex.go.taxi.order.repositories.c cVar) {
        this.b = cVar;
    }
}
