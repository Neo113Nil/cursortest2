package com.yandex.go.taxi.order.performer;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.oim;
import defpackage.tse;
import defpackage.yu0;
import defpackage.zvi;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.n;

/* loaded from: classes8.dex */
public final class b {
    public final tse a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public b(tse tseVar) {
        this.a = tseVar;
    }

    public final k a(TaxiOrder taxiOrder) {
        oim b = b(taxiOrder);
        return new k(new n(b.a(), new DriverInfoRepository$driverInfoUpdates$1(b, null)), new DriverInfoRepository$driverInfoUpdates$2(b, null));
    }

    public final synchronized oim b(TaxiOrder taxiOrder) {
        return (oim) this.b.computeIfAbsent(taxiOrder, new yu0(7, new zvi(26, this)));
    }
}
