package com.ybsdk.rconfig;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import defpackage.avi0;
import defpackage.nbp0;
import defpackage.sui0;
import defpackage.tje;
import defpackage.vui0;
import defpackage.w42;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public final class d {
    public final b a;
    public final AppAnalyticsReporter b;
    public final nbp0 c;
    public final vui0 d;
    public final w42 e;

    public d(b bVar, AppAnalyticsReporter appAnalyticsReporter, nbp0 nbp0Var, vui0 vui0Var, w42 w42Var) {
        this.a = bVar;
        this.b = appAnalyticsReporter;
        this.c = nbp0Var;
        this.d = vui0Var;
        this.e = w42Var;
    }

    public final void a() {
        sui0 sui0Var = new sui0(this, 0);
        b bVar = this.a;
        bVar.n = sui0Var;
        bVar.m = new sui0(this, 1);
        com.ybsdk.core.analytics.a aVar = this.b.b;
        if (aVar.b == null) {
            aVar.b = this.e;
            aVar.b();
        }
        c cVar = new c(this);
        CopyOnWriteArrayList copyOnWriteArrayList = ((avi0) bVar.a).b;
        if (!copyOnWriteArrayList.contains(cVar)) {
            copyOnWriteArrayList.add(cVar);
        }
        tje.N(this.c.b, null, null, new RemoteConfigCoordinator$init$4(this, null), 3);
    }

    public final void b() {
        this.a.o();
        tje.N(this.c.b, null, null, new RemoteConfigCoordinator$onUiOpened$1(this, null), 3);
    }
}
