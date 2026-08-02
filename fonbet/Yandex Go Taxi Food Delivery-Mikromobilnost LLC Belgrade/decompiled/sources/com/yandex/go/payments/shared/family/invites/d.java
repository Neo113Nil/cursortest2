package com.yandex.go.payments.shared.family.invites;

import defpackage.czo0;
import defpackage.gbp;
import defpackage.hbp0;
import defpackage.i130;
import defpackage.i6r;
import defpackage.tje;
import defpackage.xbp;

/* loaded from: classes13.dex */
public final class d implements gbp {
    public final com.yandex.go.payments.shared.family.invites.data.a a;
    public final i6r b;
    public final xbp c;
    public final i130 d;
    public final hbp0 e = new hbp0(new czo0(14), "", null);

    public d(com.yandex.go.payments.shared.family.invites.data.a aVar, i6r i6rVar, xbp xbpVar, i130 i130Var) {
        this.a = aVar;
        this.b = i6rVar;
        this.c = xbpVar;
        this.d = i130Var;
    }

    public final void a() {
        hbp0 hbp0Var = this.e;
        hbp0Var.a();
        tje.N(hbp0Var.c(), null, null, new FamilyInvitesController$start$1(this, null), 3);
    }
}
