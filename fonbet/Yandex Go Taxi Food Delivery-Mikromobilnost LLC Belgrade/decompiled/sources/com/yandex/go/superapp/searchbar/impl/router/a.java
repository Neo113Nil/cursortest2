package com.yandex.go.superapp.searchbar.impl.router;

import com.yandex.go.dto.response.q1;
import defpackage.tje;
import defpackage.wdw0;
import defpackage.xdw0;

/* loaded from: classes14.dex */
public final class a {
    public final wdw0 a;
    public final /* synthetic */ xdw0 b;

    public a(xdw0 xdw0Var, wdw0 wdw0Var) {
        this.b = xdw0Var;
        this.a = wdw0Var;
    }

    public final void a(q1 q1Var) {
        tje.N(this.b.o(), null, null, new SuperappSearchbarRouterImpl$InnerNavigator$handleAction$1(this, q1Var, null), 3);
    }

    public final void b() {
        tje.N(this.b.o(), null, null, new SuperappSearchbarRouterImpl$InnerNavigator$scrollUp$1(this, null), 3);
    }
}
