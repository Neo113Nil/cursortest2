package com.yandex.go.places.impl.ui.main.map.filters;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.places.experiments.map.j;
import com.yandex.go.places.impl.domain.entities.FavoritesState;
import defpackage.ah00;
import defpackage.e2t;
import defpackage.g6c0;
import defpackage.gh00;
import defpackage.go80;
import defpackage.k0b0;
import defpackage.kn80;
import defpackage.mth;
import defpackage.ney;
import defpackage.nfc0;
import defpackage.p5c0;
import defpackage.pwy0;
import defpackage.pzt0;
import defpackage.qc5;
import defpackage.tje;
import defpackage.v5c0;
import defpackage.vac0;
import defpackage.yzh;

/* loaded from: classes13.dex */
public final class f extends qc5 {
    public final yzh A;
    public final k0b0 B;
    public final com.yandex.go.places.impl.navigation.common.navigator.internal.b C;
    public final com.yandex.go.places.impl.domain.interactors.common.a D;
    public final vac0 E;
    public final j F;
    public final go80 G;
    public final com.yandex.go.places.impl.data.repositories.bookings.a H;
    public final com.yandex.go.places.experiments.map.map_as_main_places.b I;
    public final p5c0 J;
    public final com.yandex.go.places.impl.domain.interactors.map.e K;
    public final v5c0 L;
    public final ah00 M;
    public final e2t N;
    public final nfc0 O;
    public final pwy0 P;
    public final kn80 Q;
    public pzt0 R;
    public pzt0 S;
    public pzt0 T;
    public boolean U;
    public boolean V;
    public FavoritesState W;

    public f(Lifecycle lifecycle, yzh yzhVar, k0b0 k0b0Var, com.yandex.go.places.impl.navigation.common.navigator.internal.b bVar, com.yandex.go.places.impl.domain.interactors.common.a aVar, vac0 vac0Var, j jVar, go80 go80Var, com.yandex.go.places.impl.data.repositories.bookings.a aVar2, com.yandex.go.places.experiments.map.map_as_main_places.b bVar2, p5c0 p5c0Var, com.yandex.go.places.impl.domain.interactors.map.e eVar, v5c0 v5c0Var, ah00 ah00Var, e2t e2tVar, nfc0 nfc0Var, pwy0 pwy0Var, kn80 kn80Var) {
        super(g6c0.class, new ney(lifecycle));
        this.A = yzhVar;
        this.B = k0b0Var;
        this.C = bVar;
        this.D = aVar;
        this.E = vac0Var;
        this.F = jVar;
        this.G = go80Var;
        this.H = aVar2;
        this.I = bVar2;
        this.J = p5c0Var;
        this.K = eVar;
        this.L = v5c0Var;
        this.M = ah00Var;
        this.N = e2tVar;
        this.O = nfc0Var;
        this.P = pwy0Var;
        this.Q = kn80Var;
        this.U = true;
        this.W = FavoritesState.NOT_SELECTED;
    }

    @Override // defpackage.qc5, defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        pzt0 pzt0Var = this.S;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.S = null;
        pzt0 pzt0Var2 = this.R;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.R = null;
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Gg() {
        super.Gg();
        float azimuth = ((gh00) this.M).e.c.getAzimuth();
        ((g6c0) Dg()).b(azimuth, !(azimuth == 0.0f));
        ((g6c0) Dg()).c(this.B.b());
    }

    @Override // defpackage.qc5
    public final void Lg() {
        pzt0 pzt0Var = this.T;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.T = null;
        pzt0 pzt0Var2 = this.S;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.S = null;
        pzt0 pzt0Var3 = this.R;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
        this.R = null;
        tje.N(Jg(), null, null, new PlacesCategoryFiltersPresenter$onStop$1(this, null), 3);
    }

    @Override // defpackage.qc5
    public final void onStart() {
        long j = this.U ? 0L : 500L;
        pzt0 pzt0Var = this.S;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.S = tje.N(Jg(), null, null, new PlacesCategoryFiltersPresenter$subscribeToBboxUpdates$$inlined$collectLatestIn$1(this.G.b(), null, this), 3);
        pzt0 pzt0Var2 = this.R;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.R = tje.N(Jg(), null, null, new PlacesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1(new mth(kotlinx.coroutines.flow.e.t(new com.yandex.go.places.impl.domain.interactors.map.d(this.E.a.c)), 4), null, this), 3);
        this.T = tje.N(Jg(), null, null, new PlacesCategoryFiltersPresenter$onStart$1(j, this, null), 3);
    }
}
