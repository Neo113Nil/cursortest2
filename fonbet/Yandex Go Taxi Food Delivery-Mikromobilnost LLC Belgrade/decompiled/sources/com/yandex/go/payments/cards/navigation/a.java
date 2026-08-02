package com.yandex.go.payments.cards.navigation;

import defpackage.gj8;
import defpackage.lj8;
import defpackage.qu;
import defpackage.sy60;
import defpackage.tje;
import defpackage.v920;

/* loaded from: classes13.dex */
public final class a implements sy60 {
    public final /* synthetic */ lj8 a;
    public final /* synthetic */ gj8 b;

    public a(lj8 lj8Var, gj8 gj8Var) {
        this.a = lj8Var;
        this.b = gj8Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.r(new qu(9));
    }

    public final void n1(v920 v920Var) {
        lj8 lj8Var = this.a;
        tje.N(lj8Var.o(), null, null, new CardNavigationRouterImpl$openCard3ds$1(lj8Var, v920Var, this.b, null), 3);
    }
}
