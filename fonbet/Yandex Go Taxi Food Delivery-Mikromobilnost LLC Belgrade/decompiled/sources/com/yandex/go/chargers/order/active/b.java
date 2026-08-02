package com.yandex.go.chargers.order.active;

import defpackage.al9;
import defpackage.gba;
import defpackage.gei0;
import defpackage.lba;
import defpackage.lys;
import defpackage.nna;
import defpackage.pav;
import defpackage.r1h0;
import defpackage.zo31;

/* loaded from: classes12.dex */
public final class b extends lys {
    public static final /* synthetic */ int V = 0;
    public final pav S;
    public final nna T;
    public final gei0 U;

    public b(lba lbaVar, pav pavVar, nna nnaVar, gei0 gei0Var) {
        super(lbaVar);
        this.S = pavVar;
        this.T = nnaVar;
        this.U = gei0Var;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        al9 al9Var = (al9) obj;
        d0(al9Var);
        c0(al9Var);
        ((lba) ((zo31) this.R)).d.setBackgroundResource(al9Var.c instanceof gba ? r1h0.bg_chargers_order_banner_content : r1h0.bg_chargers_order_banner_content_ripple);
        Z(new BannerViewHolder$bindImage$1(al9Var, this, null), "IMAGE_LOAD_KEY", true);
        e.a(this, al9Var.e, this.T, this.U);
    }

    public final void c0(al9 al9Var) {
        lba lbaVar = (lba) ((zo31) this.R);
        lbaVar.e.setVisibility(al9Var.b.length() > 0 ? 0 : 8);
        lbaVar.e.setText(al9Var.b);
    }

    public final void d0(al9 al9Var) {
        lba lbaVar = (lba) ((zo31) this.R);
        lbaVar.f.setVisibility(al9Var.a.length() > 0 ? 0 : 8);
        lbaVar.f.setText(al9Var.a);
    }
}
