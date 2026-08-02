package com.yandex.go.superapp_favorites.di;

import defpackage.eqh;
import defpackage.fgl0;
import defpackage.hgl0;
import defpackage.kr;
import defpackage.ljr;
import defpackage.n3w;
import defpackage.nag;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.v7p;
import defpackage.wgr;
import defpackage.xvf0;
import defpackage.yvf0;
import defpackage.zy11;

/* loaded from: classes14.dex */
public final class b implements v7p {
    public final nag a;
    public final n3w b;
    public final xvf0 c;
    public final xvf0 d;
    public final n3w e;
    public final eqh f;
    public final xvf0 g;

    public b(nag nagVar, n3w n3wVar, xvf0 xvf0Var, xvf0 xvf0Var2, n3w n3wVar2, eqh eqhVar, xvf0 xvf0Var3) {
        this.a = nagVar;
        this.b = n3wVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = n3wVar2;
        this.f = eqhVar;
        this.g = xvf0Var3;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        fgl0 fgl0Var = (fgl0) this.a.get();
        final tse tseVar = (tse) this.b.a;
        final wgr wgrVar = (wgr) this.c.get();
        return fgl0Var.a(new tls() { // from class: com.yandex.go.superapp_favorites.di.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                tje.N(tse.this, null, null, new SuperappFavoritesScreenModule$Companion$provideRouteHandlerFactory$actionDispatcher$1$1(wgrVar, (kr) obj, null), 3);
                return zy11.a;
            }
        }, (String) this.d.get(), (hgl0) this.e.a, (ljr) this.g.get(), new SuperappFavoritesScreenModule$Companion$provideRouteHandlerFactory$1(0, this.f, yvf0.class, "get", "get()Ljava/lang/Object;", 0));
    }
}
