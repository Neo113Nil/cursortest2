package com.yandex.delivery.live.location.impl.domain;

import defpackage.awy;
import defpackage.bvf0;
import defpackage.ike;
import defpackage.jwh;
import defpackage.pzt0;
import defpackage.st2;
import defpackage.tje;
import ru.yandex.taxi.logistics.address.g;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;

/* loaded from: classes.dex */
public final class a {
    public final g a;
    public final awy b;
    public final AppVisibilitySubscriptionImpl c;
    public final jwh d;
    public final ike e;
    public pzt0 f;

    public a(g gVar, awy awyVar, AppVisibilitySubscriptionImpl appVisibilitySubscriptionImpl, jwh jwhVar, st2 st2Var) {
        this.a = gVar;
        this.b = awyVar;
        this.c = appVisibilitySubscriptionImpl;
        this.d = jwhVar;
        this.e = bvf0.a(st2Var.b);
    }

    public final void a() {
        pzt0 pzt0Var = this.f;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            this.f = tje.N(this.e, null, null, new LiveLocationInteractor$startSendingLocation$1(this, null), 3);
        }
    }
}
