package com.ybsdk.navigation;

import defpackage.eja1;
import defpackage.jqr;
import defpackage.mu31;
import defpackage.n3w;
import defpackage.np51;
import defpackage.rpp0;
import defpackage.v7p;
import defpackage.xvf0;
import kotlinx.coroutines.flow.e;

/* loaded from: classes3.dex */
public final class d implements v7p {
    public final xvf0 a;
    public final xvf0 b;
    public final xvf0 c;

    public d(n3w n3wVar, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.a = xvf0Var;
        this.b = n3wVar;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        rpp0 rpp0Var = (rpp0) this.a.get();
        mu31 mu31Var = (mu31) this.b.get();
        com.ybsdk.core.common.data.cache.b bVar = (com.ybsdk.core.common.data.cache.b) this.c.get();
        np51 np51Var = new np51();
        e.H(eja1.s(mu31Var.a), new jqr(rpp0Var.h, new YbAuthViewStateHolder$1(np51Var, bVar, null), 3));
        return np51Var;
    }
}
