package com.yandex.go.taxi.order.overlay;

import defpackage.m20;
import defpackage.o2y0;
import defpackage.tje;

/* loaded from: classes14.dex */
public final class f implements m20 {
    public final /* synthetic */ g a;

    public f(g gVar) {
        this.a = gVar;
    }

    @Override // defpackage.m20
    public final void a(o2y0 o2y0Var) {
        g gVar = this.a;
        tje.N(gVar.Kg(), null, null, new OrderBubblesPresenter$onResume$2$onActiveOrderChanged$1(gVar, o2y0Var, null), 3);
    }
}
