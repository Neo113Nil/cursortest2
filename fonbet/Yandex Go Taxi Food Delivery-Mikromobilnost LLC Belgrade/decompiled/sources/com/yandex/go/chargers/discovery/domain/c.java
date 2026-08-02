package com.yandex.go.chargers.discovery.domain;

import com.yandex.go.shortcuts.impl.interactors.w;
import defpackage.jqr;
import defpackage.rpa;

/* loaded from: classes12.dex */
public final class c {
    public final w a;
    public final rpa b;

    public c(w wVar, rpa rpaVar) {
        this.a = wVar;
        this.b = rpaVar;
    }

    public final jqr a() {
        return new jqr(new b(this.a.d()), new ChargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$2(this, null), 3);
    }
}
