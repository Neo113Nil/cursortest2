package com.yandex.go.places.base.ui.common.map;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.map.CameraPosition;
import defpackage.ah00;
import defpackage.dib1;
import defpackage.gh00;
import defpackage.j65;
import defpackage.k0b0;
import defpackage.pzt0;
import defpackage.q3v;
import defpackage.tje;
import defpackage.xg00;
import kotlinx.coroutines.flow.e;

/* loaded from: classes13.dex */
public abstract class c extends j65 {
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
            this.B = tje.N(Jg(), null, null, new PlacesMapAwarePresenter$onResume$$inlined$safeCollectIn$1(e.t(com.yandex.go.coroutines.b.d(new b(dib1.c(ah00Var)), new PlacesMapAwarePresenter$onResume$$inlined$start$1(this, null))), null, this), 3);
        } else {
            ((xg00) Dg()).b(0.0f, false);
        }
        ((xg00) Dg()).c(this.y.b());
    }

    public final void Kg() {
        CameraPosition cameraPosition = ((gh00) this.z).e.c;
        ah00.b(this.z, new CameraPosition(cameraPosition.getTarget(), cameraPosition.getZoom(), 0.0f, cameraPosition.getTilt()), Animation.Type.SMOOTH);
    }

    public final void Lg() {
        tje.N(Jg(), null, null, new PlacesMapAwarePresenter$onLocationFocusingButtonClicked$1(this, null), 3);
    }
}
