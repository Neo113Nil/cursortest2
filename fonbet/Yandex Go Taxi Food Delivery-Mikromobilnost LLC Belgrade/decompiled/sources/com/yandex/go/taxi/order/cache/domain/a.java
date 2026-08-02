package com.yandex.go.taxi.order.cache.domain;

import com.yandex.go.taxi.order.cache.data.b;
import defpackage.duu;
import defpackage.mdh;
import defpackage.nsq0;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vd7;

/* loaded from: classes8.dex */
public final class a implements vd7 {
    public final b a;
    public final tse b;
    public final tt2 c;
    public volatile pzt0 d;

    public a(b bVar, tse tseVar, tt2 tt2Var) {
        this.a = bVar;
        this.b = tseVar;
        this.c = tt2Var;
    }

    public final void a(nsq0 nsq0Var, duu duuVar) {
        pzt0 pzt0Var = this.d;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        tse tseVar = this.b;
        this.c.getClass();
        sjh sjhVar = uyj.a;
        this.d = tje.N(tseVar, mdh.b, null, new CachedOrdersOnStartInteractorImpl$cacheOrders$1(duuVar, this, nsq0Var, null), 2);
    }
}
