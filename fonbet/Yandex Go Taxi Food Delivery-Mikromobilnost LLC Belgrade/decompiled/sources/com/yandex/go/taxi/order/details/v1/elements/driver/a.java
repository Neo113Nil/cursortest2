package com.yandex.go.taxi.order.details.v1.elements.driver;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.f6j;
import defpackage.rol0;
import defpackage.tpr;

/* loaded from: classes14.dex */
public final class a {
    public final d a;
    public final b b;

    public a(d dVar, b bVar) {
        this.a = dVar;
        this.b = bVar;
    }

    public final tpr a(TaxiOrder taxiOrder, f6j f6jVar) {
        return this.a.a(taxiOrder, false, f6jVar, new rol0(new CommonDetailsCardDriverSectionStateMapper$mapCarIcon$1(this, taxiOrder, null)), null);
    }
}
