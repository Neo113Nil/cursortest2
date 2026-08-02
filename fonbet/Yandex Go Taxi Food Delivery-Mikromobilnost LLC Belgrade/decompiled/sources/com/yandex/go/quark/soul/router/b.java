package com.yandex.go.quark.soul.router;

import defpackage.ehg0;
import defpackage.n9t0;
import defpackage.qu;
import defpackage.tje;
import defpackage.wgg0;

/* loaded from: classes13.dex */
public final class b implements ehg0 {
    public final /* synthetic */ c a;
    public final /* synthetic */ n9t0 b;

    public b(c cVar, n9t0 n9t0Var) {
        this.a = cVar;
        this.b = n9t0Var;
    }

    @Override // defpackage.ehg0
    public final void G(wgg0 wgg0Var) {
        c cVar = this.a;
        tje.N(cVar.o(), null, null, new SoulAiAssistantWarmUpRouterImpl$onLaunch$1$1$closeWithResult$1(wgg0Var, cVar, this.b, null), 3);
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.r(new qu(9));
    }
}
