package com.yandex.go.taxi.order.map_objects;

import com.yandex.mapkit.map.IconStyle;
import defpackage.ah00;
import defpackage.b01;
import defpackage.d080;
import defpackage.f080;
import defpackage.r58;
import defpackage.r8;
import defpackage.tje;
import defpackage.xm00;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class f extends r8 {
    public final b01 A;
    public final r58 B;
    public final xm00 c;
    public final f080 w;
    public final IconStyle x;
    public final d080 y;
    public final HashMap z;

    public f(ah00 ah00Var, xm00 xm00Var, f080 f080Var) {
        super(5, ah00Var);
        this.c = xm00Var;
        this.w = f080Var;
        this.x = new IconStyle();
        this.y = new d080(this);
        this.z = new HashMap();
        this.A = new b01(23, this);
        this.B = new r58(4, this);
    }

    public final void attach() {
        f080 f080Var = this.w;
        d080 d080Var = this.y;
        f080Var.Bg(d080Var);
        tje.N(f080Var.Jg(), null, null, new OrderMapObjectsOverlayPresenter$attachView$1(f080Var, d080Var, null), 3);
    }
}
