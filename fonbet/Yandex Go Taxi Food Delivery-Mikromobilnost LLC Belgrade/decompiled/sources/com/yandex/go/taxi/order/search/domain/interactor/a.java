package com.yandex.go.taxi.order.search.domain.interactor;

import com.yandex.go.taxi.order.domain.repositories.n;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import defpackage.a3y0;
import defpackage.bvf0;
import defpackage.ike;
import defpackage.iup0;
import defpackage.l8x;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes14.dex */
public final class a {
    public final iup0 a;
    public final a3y0 b = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "SearchInfoOrderMonitoringInteractor");
    public final ike c;
    public pzt0 d;

    public a(iup0 iup0Var, tt2 tt2Var) {
        this.a = iup0Var;
        tt2Var.getClass();
        this.c = bvf0.a(uyj.a);
    }

    public final void a() {
        b();
        this.d = tje.N(this.c, null, null, new SearchInfoOrderMonitoringInteractor$startSearchInfoMonitoring$1(this, null), 3);
        a3y0.a(this.b, new String[]{"startSearchInfoMonitoring"}, null, 6);
    }

    public final void b() {
        pzt0 pzt0Var = this.d;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.d = null;
        n nVar = (n) this.a;
        ConcurrentHashMap concurrentHashMap = nVar.q;
        Iterator it = concurrentHashMap.values().iterator();
        while (it.hasNext()) {
            ((l8x) it.next()).a(null);
        }
        concurrentHashMap.clear();
        nVar.p.clear();
        a3y0.a(this.b, new String[]{"terminateSearchInfoMonitoring"}, null, 6);
    }
}
