package com.yandex.go.shortcuts.impl.interactors;

import defpackage.c0z0;
import defpackage.czo0;
import defpackage.d0l0;
import defpackage.eaf0;
import defpackage.ffx;
import defpackage.hbp0;
import defpackage.jqr;
import defpackage.jst;
import defpackage.mdh;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v5c0;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes13.dex */
public final class n {
    public final com.yandex.go.route.interactor.b a;
    public final c0z0 b;
    public final com.yandex.go.shortcuts.impl.factory.e c;
    public final v5c0 d;
    public final tt2 e;
    public final hbp0 f = new hbp0(new czo0(14), "ProductsParamChanges", null);
    public final n0 g;
    public final jqr h;

    public n(com.yandex.go.route.interactor.b bVar, c0z0 c0z0Var, com.yandex.go.shortcuts.impl.factory.e eVar, v5c0 v5c0Var, tt2 tt2Var) {
        this.a = bVar;
        this.b = c0z0Var;
        this.c = eVar;
        this.d = v5c0Var;
        this.e = tt2Var;
        n0 c = ffx.c(1, 0, null, 6);
        this.g = c;
        this.h = new jqr(c, new ProductsParamsPointRepository$productsParamChangesFlow$1(this, null), 3);
    }

    public final void a() {
        d0l0 c = this.a.c();
        if (c.h() != null) {
            eaf0 B = this.d.B(c, true);
            if (B != null) {
                this.g.g(B);
            } else {
                jst.e.s(new NullPointerException("productsParam is null while srcAddress isn't null"));
            }
        }
    }

    public final void b() {
        hbp0 hbp0Var = this.f;
        hbp0Var.f();
        rol0 a = this.c.a();
        this.e.getClass();
        sjh sjhVar = uyj.a;
        hbp0.e(hbp0Var, mdh.b, null, new ProductsParamsPointRepository$subscribeProductsParamChanges$1(a, this, null), 2);
    }
}
