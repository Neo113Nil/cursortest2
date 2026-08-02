package com.yandex.go.superapp.impl.router;

import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.pzt0;
import defpackage.r870;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes8.dex */
public final class a implements r870 {
    public final tse a;
    public final com.yandex.go.taxi.order.multi.a b;
    public pzt0 c;

    public a(tse tseVar, com.yandex.go.taxi.order.multi.a aVar) {
        this.a = tseVar;
        this.b = aVar;
    }

    public final void b(TaxiOrder taxiOrder, boolean z, DetailsOpenReason detailsOpenReason, TaxiCardNavigationAction taxiCardNavigationAction, sls slsVar) {
        pzt0 pzt0Var = this.c;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.c = tje.N(this.a, null, null, new OpenTaxiOrderRouterImpl$openTaxiOrder$1(this, taxiOrder, z, detailsOpenReason, taxiCardNavigationAction, slsVar, null), 3);
    }
}
