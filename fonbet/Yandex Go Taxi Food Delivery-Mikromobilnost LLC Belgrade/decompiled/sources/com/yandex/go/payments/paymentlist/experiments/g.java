package com.yandex.go.payments.paymentlist.experiments;

import defpackage.dne0;
import defpackage.fga0;
import defpackage.i3y;
import defpackage.kug;
import defpackage.lz60;
import defpackage.ppr;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.ycq0;

/* loaded from: classes8.dex */
public final class g implements lz60 {
    public final tse a;
    public final tt2 b;
    public final com.yandex.go.navigation.screen.c c;
    public final kug d;
    public final com.yandex.go.superapp.order.multi.old.provider.g e;
    public final fga0 f;
    public final ycq0 g;
    public final dne0 h;
    public final i3y i = kotlin.a.a(new ppr(2, this));

    public g(tse tseVar, tt2 tt2Var, com.yandex.go.navigation.screen.c cVar, kug kugVar, com.yandex.go.superapp.order.multi.old.provider.g gVar, fga0 fga0Var, ycq0 ycq0Var, dne0 dne0Var) {
        this.a = tseVar;
        this.b = tt2Var;
        this.c = cVar;
        this.d = kugVar;
        this.e = gVar;
        this.f = fga0Var;
        this.g = ycq0Var;
        this.h = dne0Var;
    }

    @Override // defpackage.lz60
    public final void g() {
        this.b.getClass();
        tje.N(this.a, uyj.a, null, new ForcedPaymentMethodChangeInteractor$onLargestContentfulPaint$1(this, null), 2);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "ForcedPaymentMethodChangeInteractor";
    }
}
