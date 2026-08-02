package com.yandex.go.taxi.order.search.ui.overlay.proxy;

import com.yandex.go.taxi.order.models.api.response.SearchOverlayType;
import com.yandex.go.taxi.order.queue.interactor.d;
import defpackage.ad5;
import defpackage.bvf0;
import defpackage.ga30;
import defpackage.iup0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.wxf0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class c extends ad5 {
    public final r0 A;
    public pzt0 B;
    public final iup0 x;
    public final ga30 y;
    public final d z;

    public c(iup0 iup0Var, ga30 ga30Var, d dVar) {
        super(wxf0.class);
        this.x = iup0Var;
        this.y = ga30Var;
        this.z = dVar;
        this.A = bvf0.c(SearchOverlayType.NONE);
    }

    @Override // defpackage.zc5
    public final void Fg() {
        pzt0 pzt0Var = this.B;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.B = null;
    }

    @Override // defpackage.zc5
    public final void Gg() {
        pzt0 pzt0Var = this.B;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.B = tje.N(Jg(), null, null, new ProxySearchOverlayPresenter$collectOverlay$1(this, null), 3);
        tje.N(Jg(), null, null, new ProxySearchOverlayPresenter$collectSearchOverlayType$1(this, null), 3);
    }
}
