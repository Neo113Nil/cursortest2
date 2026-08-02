package com.yandex.go.taxi.summary.ui;

import com.yandex.go.taxi.summary.interactor.g;
import defpackage.czo0;
import defpackage.e7t0;
import defpackage.g18;
import defpackage.hbp0;
import defpackage.ip11;
import defpackage.pav;
import defpackage.tje;
import defpackage.wiq0;
import defpackage.zxs0;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes14.dex */
public final class d {
    public final g a;
    public final wiq0 b;
    public final ip11 c;
    public final pav d;
    public final ListItemComponent e;
    public final hbp0 f = new hbp0(new czo0(14), "", null);
    public g18 g;
    public final zxs0 h;

    public d(g gVar, wiq0 wiq0Var, ip11 ip11Var, pav pavVar, ListItemComponent listItemComponent, e7t0 e7t0Var) {
        this.a = gVar;
        this.b = wiq0Var;
        this.c = ip11Var;
        this.d = pavVar;
        this.e = listItemComponent;
        this.h = new zxs0(listItemComponent, e7t0Var);
        listItemComponent.setLeadImageSize(-2, -2);
        listItemComponent.setVerticalPadding(tje.u(2, listItemComponent.getContext()));
        androidx.core.view.b.q(listItemComponent, true);
    }

    public final void a() {
        hbp0 hbp0Var = this.f;
        hbp0Var.a();
        hbp0.e(hbp0Var, null, null, new SummaryHeaderHolder$attach$1(this, null, null), 3);
    }
}
