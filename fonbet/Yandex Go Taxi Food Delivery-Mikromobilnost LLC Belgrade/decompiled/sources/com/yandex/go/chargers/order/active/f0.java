package com.yandex.go.chargers.order.active;

import android.view.View;
import defpackage.bl9;
import defpackage.dzg0;
import defpackage.gba;
import defpackage.gei0;
import defpackage.gg4;
import defpackage.lys;
import defpackage.nna;
import defpackage.nzs;
import defpackage.pav;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes12.dex */
public final class f0 extends lys {
    public static final /* synthetic */ int V = 0;
    public final pav S;
    public final nna T;
    public final gei0 U;

    public f0(ListItemComponent listItemComponent, pav pavVar, nna nnaVar, gei0 gei0Var) {
        super(listItemComponent);
        this.S = pavVar;
        this.T = nnaVar;
        this.U = gei0Var;
        nzs.s((ListItemComponent) ((View) this.R), -1, -2);
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        bl9 bl9Var = (bl9) obj;
        View view = (View) this.R;
        ((ListItemComponent) view).setTitle(bl9Var.a);
        ((ListItemComponent) view).setSubtitle(bl9Var.b);
        c0(bl9Var);
        Z(new ItemViewHolder$bindLeadIcon$1(this, bl9Var, null), "LEAD_ICON_LOAD_KEY", true);
        e.a(this, bl9Var.e, this.T, this.U);
    }

    public final void c0(bl9 bl9Var) {
        boolean z = bl9Var.c instanceof gba;
        View view = (View) this.R;
        if (z) {
            ListItemComponent listItemComponent = (ListItemComponent) view;
            listItemComponent.updateBackground(gg4.a);
            listItemComponent.setTrailMode(0);
        } else {
            ListItemComponent listItemComponent2 = (ListItemComponent) view;
            listItemComponent2.setBackgroundResource(dzg0.bg_transparent_ripple);
            listItemComponent2.setTrailMode(2);
        }
    }
}
