package com.yandex.go.chargers.station.domain;

import defpackage.jsa;
import defpackage.tsa;
import defpackage.ura;
import defpackage.yfa;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;

/* loaded from: classes12.dex */
public final class c {
    public final com.yandex.go.chargers.station.data.c a;
    public final ura b;
    public final com.yandex.go.chargers.error.data.a c;
    public final yfa d;
    public boolean e = true;

    public c(com.yandex.go.chargers.station.data.c cVar, ura uraVar, com.yandex.go.chargers.error.data.a aVar, yfa yfaVar) {
        this.a = cVar;
        this.b = uraVar;
        this.c = aVar;
        this.d = yfaVar;
    }

    public final b a(tsa tsaVar, String str) {
        return new b(new o(com.yandex.go.coroutines.b.d(e.I(this.a.b(tsaVar, str), new ChargersStationDetailsInteractor$loadChargersStationDetails$1(this, null)), new ChargersStationDetailsInteractor$loadChargersStationDetails$$inlined$start$1(jsa.a, null)), new ChargersStationDetailsInteractor$loadChargersStationDetails$2(this, null)), this);
    }
}
