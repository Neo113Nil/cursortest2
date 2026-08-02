package com.yandex.go.places.base.ui.modals.map;

import defpackage.ah00;
import defpackage.dib1;
import defpackage.e75;
import defpackage.gh00;
import defpackage.h75;
import defpackage.k0b0;
import defpackage.pzt0;
import defpackage.q3v;
import defpackage.tje;
import kotlinx.coroutines.flow.e;

/* loaded from: classes13.dex */
public abstract class c extends h75 {
    public final boolean A;
    public pzt0 B;
    public boolean C;
    public final q3v x;
    public final k0b0 y;
    public final ah00 z;

    public c(Class cls, q3v q3vVar, k0b0 k0b0Var, ah00 ah00Var, boolean z) {
        super(cls);
        this.x = q3vVar;
        this.y = k0b0Var;
        this.z = ah00Var;
        this.A = z;
    }

    @Override // defpackage.zc5
    public final void Fg() {
        pzt0 pzt0Var = this.B;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.B = null;
        if (this.A) {
            ((gh00) this.z).I(this.C);
        }
    }

    @Override // defpackage.zc5
    public final void Gg() {
        if (this.A) {
            ah00 ah00Var = this.z;
            gh00 gh00Var = (gh00) ah00Var;
            this.C = gh00Var.o();
            gh00Var.I(true);
            this.B = tje.N(Jg(), null, null, new BasePlacesMapAwarePresenter$onResume$$inlined$safeCollectIn$1(e.t(com.yandex.go.coroutines.b.d(new b(dib1.c(ah00Var)), new BasePlacesMapAwarePresenter$onResume$$inlined$start$1(this, null))), null, this), 3);
        } else {
            ((e75) Dg()).b(0.0f, false);
        }
        ((e75) Dg()).c(this.y.b());
    }

    public final void Kg() {
        tje.N(Jg(), null, null, new BasePlacesMapAwarePresenter$onLocationFocusingButtonClicked$1(this, null), 3);
    }
}
