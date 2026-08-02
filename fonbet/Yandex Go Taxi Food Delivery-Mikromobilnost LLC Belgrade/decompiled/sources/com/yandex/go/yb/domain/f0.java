package com.yandex.go.yb.domain;

import defpackage.cda0;
import defpackage.mdh;
import defpackage.nw51;
import defpackage.py51;
import defpackage.pzt0;
import defpackage.qy51;
import defpackage.qyz;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;

/* loaded from: classes15.dex */
public final class f0 {
    public final com.yandex.go.yb.data.e a;
    public final tse b;
    public final ru.yandex.taxi.am.g c;
    public final tt2 d;
    public final cda0 e;
    public final qyz f;
    public final qy51 g;
    public final py51 h;
    public pzt0 i;

    public f0(com.yandex.go.yb.data.e eVar, tse tseVar, ru.yandex.taxi.am.g gVar, tt2 tt2Var, cda0 cda0Var, qyz qyzVar, qy51 qy51Var, py51 py51Var) {
        this.a = eVar;
        this.b = tseVar;
        this.c = gVar;
        this.d = tt2Var;
        this.e = cda0Var;
        this.f = qyzVar;
        this.g = qy51Var;
        this.h = py51Var;
    }

    public final void a() {
        String a = py51.a((nw51) this.h.a.t.getValue());
        if (a == null || a.length() == 0) {
            pzt0 pzt0Var = this.i;
            if (pzt0Var == null || !pzt0Var.isActive()) {
                this.d.getClass();
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                YbWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1 ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1 = new YbWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1(this, null);
                tse tseVar = this.b;
                this.i = tje.N(tseVar, mdhVar, null, ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1, 2);
                tje.N(tseVar, mdhVar, null, new YbWalletOpenedUpdateStateInteractor$observeAuthStatus$1(this, null), 2);
            }
        }
    }
}
