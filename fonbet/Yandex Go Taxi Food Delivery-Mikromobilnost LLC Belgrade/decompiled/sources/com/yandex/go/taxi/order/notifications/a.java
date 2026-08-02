package com.yandex.go.taxi.order.notifications;

import defpackage.bvf0;
import defpackage.p2y0;
import defpackage.wrr;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class a {
    public final p2y0 a;
    public final wrr b;
    public final com.yandex.go.taxi.order.notifications.multiclass.a c;

    public a(p2y0 p2y0Var, wrr wrrVar, com.yandex.go.taxi.order.notifications.multiclass.a aVar) {
        this.a = p2y0Var;
        this.b = wrrVar;
        this.c = aVar;
    }

    public final Object a(Continuation continuation) {
        return bvf0.n(new OrderTrackingNotificationsRouter$attach$2(this, null), continuation);
    }
}
