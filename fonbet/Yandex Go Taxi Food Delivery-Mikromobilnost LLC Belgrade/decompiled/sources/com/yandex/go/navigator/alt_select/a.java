package com.yandex.go.navigator.alt_select;

import com.yandex.go.navigator.domain.t;
import defpackage.hbp0;
import defpackage.oar;
import defpackage.par;
import defpackage.re50;

/* loaded from: classes12.dex */
public final class a {
    public final t a;
    public final par b;
    public final hbp0 c;
    public final com.yandex.go.navigator.notifications.cartech.b d;
    public final re50 e;

    public a(t tVar, par parVar, hbp0 hbp0Var, com.yandex.go.navigator.notifications.cartech.b bVar, re50 re50Var) {
        this.a = tVar;
        this.b = parVar;
        this.c = hbp0Var;
        this.d = bVar;
        this.e = re50Var;
    }

    public final void a() {
        par parVar = this.b;
        oar oarVar = parVar.c;
        oarVar.a = 0;
        oarVar.b = 0.0d;
        parVar.d.clear();
        parVar.f = 0L;
        parVar.b.q(0L, "NAVIGATOR_ROUTE_STATS_START_TIME");
        parVar.e = "";
        hbp0.e(this.c, null, null, new AltRouteInteractor$clearDestinationNotificationIfNeeded$1(this, null), 3);
        this.a.e(true);
    }
}
