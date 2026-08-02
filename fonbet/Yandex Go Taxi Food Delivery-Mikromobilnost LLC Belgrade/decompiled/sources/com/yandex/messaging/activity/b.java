package com.yandex.messaging.activity;

import com.yandex.messaging.profile.d;
import defpackage.ike;
import defpackage.mth;
import defpackage.q98;
import defpackage.tje;
import defpackage.tls;
import defpackage.vse;
import defpackage.wsr0;
import defpackage.xsr0;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class b {
    public final ike a;
    public final mth b;

    public b(d dVar, vse vseVar) {
        ike c = vseVar.c(true);
        this.a = c;
        q98 q98Var = new q98(dVar.b(), 11);
        xsr0.a.getClass();
        this.b = new mth(e.R(q98Var, c, wsr0.c, null), 6);
    }

    public final void a(tls tlsVar) {
        tje.N(this.a, null, null, new UiProfileHolder$getProfile$2(tlsVar, this, null), 3);
    }
}
