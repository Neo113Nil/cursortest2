package com.yandex.go.places.map.ui.overlay;

import defpackage.ah00;
import defpackage.czo0;
import defpackage.h3y;
import defpackage.hbp0;
import defpackage.r8;

/* loaded from: classes13.dex */
public abstract class b extends r8 {
    public final h3y c;
    public final a w;
    public final hbp0 x;

    public b(ah00 ah00Var, h3y h3yVar, a aVar) {
        super(5, ah00Var);
        this.c = h3yVar;
        this.w = aVar;
        this.x = new hbp0(new czo0(14), "", null);
    }

    public boolean Hg() {
        return false;
    }

    public abstract void Ig();

    public final void attach() {
        hbp0 hbp0Var = this.x;
        hbp0Var.a();
        hbp0.e(hbp0Var, null, null, new PlacesScreenMapOverlay$attach$1(this, null), 3);
    }
}
