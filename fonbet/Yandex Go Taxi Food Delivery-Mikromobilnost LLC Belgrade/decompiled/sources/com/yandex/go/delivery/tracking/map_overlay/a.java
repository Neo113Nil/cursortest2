package com.yandex.go.delivery.tracking.map_overlay;

import defpackage.ah00;
import defpackage.bvf0;
import defpackage.g6u;
import defpackage.jqr;
import defpackage.n4u0;
import defpackage.o400;
import defpackage.odi;
import defpackage.pey;
import defpackage.r8;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.uyj;
import defpackage.vth;
import java.util.LinkedHashSet;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes12.dex */
public final class a extends r8 implements vth {
    public final l c;
    public final LinkedHashSet w;

    public a(ah00 ah00Var, l lVar) {
        super(5, ah00Var);
        this.c = lVar;
        this.w = new LinkedHashSet();
    }

    public final void Hg(pey peyVar) {
        LinkedHashSet linkedHashSet = this.w;
        if (linkedHashSet.add(peyVar) && linkedHashSet.size() == 1) {
            l lVar = this.c;
            lVar.Bg(this);
            odi odiVar = lVar.B;
            odiVar.b.getClass();
            sjh sjhVar = uyj.a;
            g6u g6uVar = o400.a;
            odiVar.c = bvf0.a(g6uVar);
            kotlinx.coroutines.flow.e.H(odiVar.c, new jqr(odiVar.e, new DeliveryMapBoundariesMediator$start$1(odiVar, null), 3));
            tpr t = kotlinx.coroutines.flow.e.t(new m0(new g((n4u0) lVar.x.k.getValue()), new i(lVar.D), new DeliveriesMapPresenter$getDeliveriesFlow$3(3, null)));
            lVar.z.getClass();
            kotlinx.coroutines.flow.e.H(lVar.Jg(), new jqr(kotlinx.coroutines.flow.e.F(t, g6uVar), new DeliveriesMapPresenter$attachView$1(lVar, null), 3));
        }
    }
}
