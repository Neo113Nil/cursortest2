package com.yandex.go.taxi.order;

import defpackage.m20;
import defpackage.tje;
import defpackage.u480;

/* loaded from: classes14.dex */
public final class v implements m20 {
    public final /* synthetic */ u480 a;

    public v(u480 u480Var) {
        this.a = u480Var;
    }

    @Override // defpackage.m20
    public final void b() {
        u480 u480Var = this.a;
        tje.N(u480Var.b, null, null, new OrderPushNotificationController$init$1$onActiveOrderListChanged$1(u480Var, null), 3);
    }
}
