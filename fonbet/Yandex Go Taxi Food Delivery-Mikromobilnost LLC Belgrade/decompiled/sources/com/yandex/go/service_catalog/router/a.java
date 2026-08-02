package com.yandex.go.service_catalog.router;

import defpackage.eci0;
import defpackage.ffx;
import defpackage.puq0;
import defpackage.tje;
import java.util.HashMap;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes13.dex */
public final class a {
    public final n0 a;
    public final eci0 b;
    public final /* synthetic */ b c;

    public a(b bVar) {
        this.c = bVar;
        n0 c = ffx.c(0, 1, BufferOverflow.DROP_OLDEST, 1);
        this.a = c;
        this.b = e.c(c);
    }

    public final void a() {
        b bVar = this.c;
        puq0 puq0Var = bVar.K;
        puq0Var.getClass();
        puq0Var.a.a("ServiceCatalog.ReloadButton.Tapped", new HashMap(), 1, new HashMap());
        tje.N(bVar.o(), null, null, new ServiceCatalogRootRouterImpl$InnerErrorNavigator$onReloadClicked$1(this, bVar, null), 3);
    }
}
