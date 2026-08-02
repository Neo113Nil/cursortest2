package com.yandex.go.taxi.order.change.common.domain;

import defpackage.hbp0;

/* loaded from: classes14.dex */
public final class d {
    public final com.yandex.go.taxi.order.change.common.data.d a;
    public final g b;

    public d(com.yandex.go.taxi.order.change.common.data.d dVar, g gVar) {
        this.a = dVar;
        this.b = gVar;
    }

    public final void a() {
        this.a.c();
        g gVar = this.b;
        gVar.d.a();
        hbp0.e(gVar.d, null, null, new OrderChangesPollWatcher$attach$1(gVar, null), 3);
    }
}
