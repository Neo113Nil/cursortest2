package com.yandex.go.taxi.order.listener;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.taxi.order.y;
import defpackage.cey;
import defpackage.h3y;
import defpackage.l3w0;
import defpackage.ra00;
import defpackage.tje;
import defpackage.tse;
import defpackage.vw60;
import defpackage.ymp0;
import defpackage.yvf0;

/* loaded from: classes8.dex */
public final class b implements vw60 {
    public final Lifecycle a;
    public final tse b;
    public final y c;
    public final h3y d;
    public final yvf0 e;
    public final ra00 f;
    public final com.yandex.go.taxi.order.interactors.a g;
    public final l3w0 h;

    public b(Lifecycle lifecycle, tse tseVar, y yVar, h3y h3yVar, yvf0 yvf0Var, ra00 ra00Var, com.yandex.go.taxi.order.interactors.a aVar, l3w0 l3w0Var) {
        this.a = lifecycle;
        this.b = tseVar;
        this.c = yVar;
        this.d = h3yVar;
        this.e = yvf0Var;
        this.f = ra00Var;
        this.g = aVar;
        this.h = l3w0Var;
    }

    @Override // defpackage.vw60
    public final void c() {
        tje.N(this.b, null, null, new TaxiOrderFeedbackActivityListener$onActivityCreate$1(this, null), 3);
        cey.a(this.a, Lifecycle.Event.ON_STOP, new ymp0(11, this));
    }

    @Override // defpackage.s150
    public final String getName() {
        return "TaxiOrderFeedbackActivityListener";
    }
}
