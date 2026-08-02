package com.yandex.go.scooters.discovery;

import com.yandex.go.shortcuts.impl.interactors.w;
import defpackage.ad5;
import defpackage.dzm0;
import defpackage.k7x0;
import defpackage.m6p0;
import defpackage.min0;
import defpackage.pav;
import defpackage.po21;
import defpackage.pwy0;
import defpackage.rqo;
import defpackage.ukn0;
import defpackage.z0o0;

/* loaded from: classes13.dex */
public final class j extends ad5 {
    public final ru.yandex.taxi.location.user.c A;
    public final po21 B;
    public final w C;
    public final rqo D;
    public final ukn0 E;
    public final dzm0 F;
    public final m6p0 G;
    public final ru.yandex.taxi.scooters.data.g H;
    public final com.yandex.go.scooters.driver_license_notification.domain.c I;
    public final z0o0 J;
    public final com.yandex.go.coroutines.h K;
    public final pav x;
    public final k7x0 y;
    public final pwy0 z;

    public j(pav pavVar, k7x0 k7x0Var, pwy0 pwy0Var, ru.yandex.taxi.location.user.c cVar, po21 po21Var, w wVar, rqo rqoVar, ukn0 ukn0Var, dzm0 dzm0Var, m6p0 m6p0Var, ru.yandex.taxi.scooters.data.g gVar, com.yandex.go.scooters.driver_license_notification.domain.c cVar2, z0o0 z0o0Var) {
        super(min0.class);
        this.x = pavVar;
        this.y = k7x0Var;
        this.z = pwy0Var;
        this.A = cVar;
        this.B = po21Var;
        this.C = wVar;
        this.D = rqoVar;
        this.E = ukn0Var;
        this.F = dzm0Var;
        this.G = m6p0Var;
        this.H = gVar;
        this.I = cVar2;
        this.J = z0o0Var;
        this.K = new com.yandex.go.coroutines.h(new ScootersDiscoveryPresenter$isOrderSelectorEnabled$1(this, null));
    }
}
