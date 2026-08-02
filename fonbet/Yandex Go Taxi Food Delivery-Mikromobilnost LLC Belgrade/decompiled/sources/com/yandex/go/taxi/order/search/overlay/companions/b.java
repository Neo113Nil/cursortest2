package com.yandex.go.taxi.order.search.overlay.companions;

import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import defpackage.ad5;
import defpackage.ah00;
import defpackage.avc;
import defpackage.gh00;
import defpackage.o2y0;
import defpackage.pzt0;
import defpackage.srb1;
import defpackage.tje;
import defpackage.zzs;

/* loaded from: classes14.dex */
public final class b extends ad5 {
    public final ah00 x;
    public final o2y0 y;
    public final a z;

    public b(ah00 ah00Var, o2y0 o2y0Var, a aVar) {
        super(avc.class);
        this.x = ah00Var;
        this.y = o2y0Var;
        this.z = aVar;
    }

    @Override // defpackage.zc5
    public final void Fg() {
        a aVar = this.z;
        pzt0 pzt0Var = aVar.c;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        aVar.c = null;
    }

    @Override // defpackage.zc5
    public final void Gg() {
        a aVar = this.z;
        aVar.c = tje.N(aVar.b, null, null, new CompanionsSearchInteractor$registerUpdates$1(aVar, null), 3);
        tje.N(Jg(), null, null, new CompanionsSearchPresenter$onResume$1(this, null), 3);
    }

    public final void Kg(double d) {
        zzs v = this.y.b().v();
        if (v == null) {
            return;
        }
        zzs e = srb1.e(v, d);
        zzs f = srb1.f(v, d);
        ((gh00) this.x).F(new BoundingBox(new Point(f.a, f.b), new Point(e.a, e.b)));
    }
}
