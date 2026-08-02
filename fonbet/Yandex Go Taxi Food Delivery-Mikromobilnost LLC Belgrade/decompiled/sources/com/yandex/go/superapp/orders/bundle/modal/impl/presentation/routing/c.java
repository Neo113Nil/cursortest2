package com.yandex.go.superapp.orders.bundle.modal.impl.presentation.routing;

import com.yandex.go.dto.response.BundledOrdersPayload;
import defpackage.hxx;
import defpackage.ku6;
import defpackage.m5w0;
import defpackage.o5w0;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.u5w0;
import defpackage.uwn0;
import defpackage.vn70;
import defpackage.xx70;
import defpackage.yaf0;

/* loaded from: classes14.dex */
public final class c {
    public final uwn0 a;
    public final u5w0 b;
    public final oep0 c;

    public c(uwn0 uwn0Var, u5w0 u5w0Var, oep0 oep0Var) {
        this.a = uwn0Var;
        this.b = u5w0Var;
        this.c = oep0Var;
    }

    public final void a(BundledOrdersPayload bundledOrdersPayload) {
        ((pep0) this.c).f(new xx70(12, (o5w0) this.a.get(), new SuperAppShortcutBundledOrderRouterImpl$showBundledOrders$2(1, this.b, u5w0.class, "openOrder", "openOrder(Lcom/yandex/go/superapp/tracking/api/domain/models/Tracking;)V", 0)), new m5w0(new ku6(bundledOrdersPayload), yaf0.b, new vn70(false, false)), hxx.a);
    }
}
