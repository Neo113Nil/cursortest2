package com.yandex.go.chargers.discounts.discount_stations.ui;

import defpackage.em9;
import defpackage.ht9;
import defpackage.ir9;
import defpackage.pwy0;
import defpackage.rol0;
import defpackage.tpr;
import kotlinx.coroutines.flow.e;

/* loaded from: classes12.dex */
public final class d {
    public final pwy0 a;
    public final em9 b;
    public final ru.yandex.taxi.widget.c c;
    public final com.yandex.go.chargers.discounts.discount_stations.data.b d;
    public final com.yandex.go.chargers.discounts.discount_stations.data.a e;

    public d(pwy0 pwy0Var, em9 em9Var, ru.yandex.taxi.widget.c cVar, com.yandex.go.chargers.discounts.discount_stations.data.b bVar, com.yandex.go.chargers.discounts.discount_stations.data.a aVar) {
        this.a = pwy0Var;
        this.b = em9Var;
        this.c = cVar;
        this.d = bVar;
        this.e = aVar;
    }

    public final tpr a(ir9 ir9Var) {
        return com.yandex.go.coroutines.b.d(e.n(this.a.a(), e.d(this.e.b), new rol0(new ChargersDiscountStationsUiStateInteractor$getUiStateFlow$1(this, ir9Var, null)), new ChargersDiscountStationsUiStateInteractor$getUiStateFlow$2(4, null)), new ChargersDiscountStationsUiStateInteractor$getUiStateFlow$$inlined$start$1(ht9.a, null));
    }
}
