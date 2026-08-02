package defpackage;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.places.impl.ui.common.map.location.PlacesUserLocationPresenter$onResume$$inlined$safeCollectIn$1;
import com.yandex.go.places.impl.ui.common.map.location.PlacesUserLocationPresenter$onResume$$inlined$safeCollectIn$2;
import com.yandex.go.places.impl.ui.common.map.location.d;

/* loaded from: classes13.dex */
public final class lgc0 extends qc5 {
    public final po21 A;
    public final qwc B;
    public boolean C;

    public lgc0(Lifecycle lifecycle, po21 po21Var, qwc qwcVar) {
        super(igc0.class, new ney(lifecycle));
        this.A = po21Var;
        this.B = qwcVar;
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Fg() {
        super.Fg();
        ((igc0) Dg()).pause();
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Gg() {
        super.Gg();
        if (this.C) {
            ((igc0) Dg()).t0();
        } else {
            ((igc0) Dg()).n0();
        }
        tje.N(Kg(), null, null, new PlacesUserLocationPresenter$onResume$$inlined$safeCollectIn$1(d.a(this.A), null, this), 3);
        tje.N(Kg(), null, null, new PlacesUserLocationPresenter$onResume$$inlined$safeCollectIn$2(this.B.a(), null, this), 3);
        ((igc0) Dg()).resume();
    }
}
