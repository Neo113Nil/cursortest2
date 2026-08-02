package com.yandex.go.chargers.misc.authorization;

import defpackage.ky9;
import defpackage.qu;
import defpackage.tje;

/* loaded from: classes12.dex */
public final class b implements ky9 {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.r(new qu(9));
    }

    @Override // defpackage.ky9
    public final void c() {
        c cVar = this.a;
        tje.N(cVar.o(), null, null, new ChargersAuthorizationRouterImpl$launchLogin$1(cVar, null), 3);
    }
}
