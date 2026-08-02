package com.yandex.go.taxi.order.promotions.router;

import com.yandex.go.taxi.order.promotions.interactor.h;
import defpackage.d480;
import defpackage.g6u;
import defpackage.j4y0;
import defpackage.m580;
import defpackage.o400;
import defpackage.oep0;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.y10;

/* loaded from: classes14.dex */
public final class a {
    public final h a;
    public final y10 b;
    public final d480 c;
    public final j4y0 d;
    public final m580 e;
    public final tse f;
    public final tt2 g;
    public final oep0 h;
    public c i;
    public pzt0 j;

    public a(h hVar, y10 y10Var, d480 d480Var, j4y0 j4y0Var, m580 m580Var, tse tseVar, tt2 tt2Var, oep0 oep0Var) {
        this.a = hVar;
        this.b = y10Var;
        this.c = d480Var;
        this.d = j4y0Var;
        this.e = m580Var;
        this.f = tseVar;
        this.g = tt2Var;
        this.h = oep0Var;
    }

    public final void a() {
        this.a.b();
        pzt0 pzt0Var = this.j;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.g.getClass();
        sjh sjhVar = uyj.a;
        g6u g6uVar = o400.a;
        OrderPromotionPopupRouter$attach$1 orderPromotionPopupRouter$attach$1 = new OrderPromotionPopupRouter$attach$1(this, null);
        tse tseVar = this.f;
        this.j = tje.N(tseVar, g6uVar, null, orderPromotionPopupRouter$attach$1, 2);
        tje.N(tseVar, null, null, new OrderPromotionPopupRouter$attach$2(this, null), 3);
    }
}
