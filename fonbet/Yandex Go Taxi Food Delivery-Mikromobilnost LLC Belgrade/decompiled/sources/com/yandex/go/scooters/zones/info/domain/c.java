package com.yandex.go.scooters.zones.info.domain;

import defpackage.rbh;
import defpackage.rol0;
import defpackage.y9p0;

/* loaded from: classes13.dex */
public final class c {
    public final y9p0 a;
    public final com.yandex.go.scooters.zones.data.a b;

    public c(y9p0 y9p0Var, com.yandex.go.scooters.zones.data.a aVar) {
        this.a = y9p0Var;
        this.b = aVar;
    }

    public final b a(rbh rbhVar) {
        return new b(new rol0(new ScootersZonesInfoScreenInteractor$listenPolygonInfo$1(this, rbhVar.b, null)), this);
    }
}
