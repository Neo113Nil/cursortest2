package com.yandex.go.taxi.order.map;

import defpackage.ad5;
import defpackage.bvf0;
import defpackage.kf00;
import defpackage.ltk0;
import defpackage.pzt0;
import defpackage.tje;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class r extends ad5 {
    public final r0 A;
    public pzt0 B;
    public final n x;
    public final kf00 y;
    public boolean z;

    public r(n nVar, kf00 kf00Var) {
        super(ltk0.class);
        this.x = nVar;
        this.y = kf00Var;
        this.A = bvf0.c(Float.valueOf(0.0f));
    }

    public final void Kg(ltk0 ltk0Var) {
        Bg(ltk0Var);
        this.x.a();
        pzt0 pzt0Var = this.B;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.B = tje.N(Jg(), null, null, new RoadObjectsOverlayPresenter$attachView$1(this, ltk0Var, null), 3);
    }
}
