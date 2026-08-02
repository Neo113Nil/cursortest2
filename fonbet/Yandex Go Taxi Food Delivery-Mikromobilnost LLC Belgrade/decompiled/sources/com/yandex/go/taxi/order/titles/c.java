package com.yandex.go.taxi.order.titles;

import defpackage.czo0;
import defpackage.d980;
import defpackage.hbp0;
import defpackage.jey;
import defpackage.jqr;
import defpackage.o2y0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.u48;
import defpackage.uyj;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.n;

/* loaded from: classes14.dex */
public final class c extends jey {
    public final hbp0 a = new hbp0(new czo0(14), "", null);
    public final /* synthetic */ boolean b;
    public final /* synthetic */ d980 c;
    public final /* synthetic */ boolean d;

    public c(boolean z, d980 d980Var, boolean z2) {
        this.b = z;
        this.c = d980Var;
        this.d = z2;
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onStart() {
        d980 d980Var = this.c;
        com.yandex.go.taxi.order.repositories.c cVar = d980Var.d;
        tt2 tt2Var = d980Var.n;
        o2y0 o2y0Var = d980Var.a;
        hbp0 hbp0Var = this.a;
        hbp0Var.a();
        if (this.b) {
            u48 u48Var = d980Var.b;
            tpr t = kotlinx.coroutines.flow.e.t(new com.yandex.go.taxi.order.domain.interactors.b(u48Var.a.b(o2y0Var), u48Var, this.d));
            tt2Var.getClass();
            tje.N(hbp0Var, null, null, new OrderTitlesController$attachLifecycleObserver$1$onStart$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(t, uyj.a), null, d980Var), 3);
        }
        n j = d980Var.j.j(o2y0Var);
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        tje.N(hbp0Var, null, null, new OrderTitlesController$attachLifecycleObserver$1$onStart$$inlined$safeCollectIn$2(new k(kotlinx.coroutines.flow.e.F(j, sjhVar), new OrderTitlesController$attachLifecycleObserver$1$onStart$3(d980Var, null)), null, d980Var), 3);
        jqr b = cVar.b(o2y0Var);
        tt2Var.getClass();
        tje.N(hbp0Var, null, null, new OrderTitlesController$attachLifecycleObserver$1$onStart$$inlined$safeCollectIn$3(kotlinx.coroutines.flow.e.F(b, sjhVar), null, d980Var), 3);
        g I = kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.t(new b(cVar.b(o2y0Var), d980Var)), new OrderTitlesController$attachLifecycleObserver$1$onStart$8(d980Var, null));
        tt2Var.getClass();
        tje.N(hbp0Var, null, null, new OrderTitlesController$attachLifecycleObserver$1$onStart$$inlined$safeCollectIn$4(kotlinx.coroutines.flow.e.F(I, sjhVar), null, d980Var), 3);
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onStop() {
        this.c.z.cancel();
        this.a.b();
    }
}
