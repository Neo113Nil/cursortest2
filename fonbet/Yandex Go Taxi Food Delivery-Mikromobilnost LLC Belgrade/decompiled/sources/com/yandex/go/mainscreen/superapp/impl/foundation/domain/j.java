package com.yandex.go.mainscreen.superapp.impl.foundation.domain;

import com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.v;
import defpackage.ajr;
import defpackage.bvf0;
import defpackage.ike;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zzv0;

/* loaded from: classes.dex */
public final class j {
    public final ajr a;
    public final com.yandex.go.mainscreen.superapp.impl.foundation.data.repository.b b;
    public final zzv0 c;
    public final v d;
    public final ike e;
    public pzt0 f;

    public j(ajr ajrVar, com.yandex.go.mainscreen.superapp.impl.foundation.data.repository.b bVar, zzv0 zzv0Var, v vVar, tt2 tt2Var) {
        this.a = ajrVar;
        this.b = bVar;
        this.c = zzv0Var;
        this.d = vVar;
        tt2Var.getClass();
        this.e = bvf0.a(uyj.a);
    }

    public final void a() {
        this.b.a(this.d.b.c().h() == null && this.c.a.c);
        pzt0 pzt0Var = this.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.f = null;
        this.f = tje.N(this.e, null, null, new SuperappContentPointInteractor$subscribeToChanges$1(this, null), 3);
    }
}
