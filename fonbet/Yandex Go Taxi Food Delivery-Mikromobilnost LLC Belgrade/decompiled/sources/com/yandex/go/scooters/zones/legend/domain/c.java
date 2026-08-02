package com.yandex.go.scooters.zones.legend.domain;

import defpackage.rol0;
import defpackage.uap0;

/* loaded from: classes13.dex */
public final class c {
    public final com.yandex.go.scooters.zones.data.a a;
    public final uap0 b;

    public c(com.yandex.go.scooters.zones.data.a aVar, uap0 uap0Var) {
        this.a = aVar;
        this.b = uap0Var;
    }

    public final b a(String str) {
        return new b(new rol0(new ScootersZonesLegendScreenInteractor$legendScreenFlow$1(this, str, null)), this);
    }
}
