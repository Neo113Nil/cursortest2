package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.places.experiments.map.j;
import com.yandex.go.places.impl.domain.interactors.common.a;
import com.yandex.go.places.impl.domain.interactors.map.e;
import com.yandex.go.places.impl.navigation.common.navigator.internal.b;
import com.yandex.go.places.impl.ui.main.map.filters.PlacesCategoryFiltersModalView;
import com.yandex.go.places.impl.ui.main.map.filters.f;

/* loaded from: classes13.dex */
public final class k6c0 extends m230 {
    public final w030 E;
    public final Lifecycle F;
    public final yzh G;
    public final f6c0 H;
    public final j6c0 I;
    public final d6c0 J;

    public k6c0(w030 w030Var, Lifecycle lifecycle, yzh yzhVar, f6c0 f6c0Var, j6c0 j6c0Var, d6c0 d6c0Var) {
        super(null);
        this.E = w030Var;
        this.F = lifecycle;
        this.G = yzhVar;
        this.H = f6c0Var;
        this.I = j6c0Var;
        this.J = d6c0Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.J.c.Cg();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.J.c.Bg(new dew());
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return false;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        ik0 ik0Var = this.I.a;
        f fVar = new f(this.F, this.G, (k0b0) ((xvf0) ik0Var.a).get(), (b) ((xvf0) ik0Var.b).get(), (a) ((xvf0) ik0Var.c).get(), (vac0) ((xvf0) ik0Var.d).get(), (j) ((xvf0) ik0Var.e).get(), (go80) ((xvf0) ik0Var.f).get(), (com.yandex.go.places.impl.data.repositories.bookings.a) ((xvf0) ik0Var.g).get(), (com.yandex.go.places.experiments.map.map_as_main_places.b) ((xvf0) ik0Var.h).get(), (p5c0) ((xvf0) ik0Var.i).get(), (e) ((ge50) ik0Var.j).get(), (v5c0) ((vqa0) ik0Var.k).get(), (ah00) ((xvf0) ik0Var.l).get(), (e2t) ((xvf0) ik0Var.m).get(), (nfc0) ((vm80) ik0Var.n).get(), (pwy0) ((z4g) ik0Var.o).get(), (kn80) ((g970) ik0Var.p).get());
        xv10 xv10Var = this.H.a;
        return new PlacesCategoryFiltersModalView((Context) ((x4g) xv10Var.a).get(), fVar, (pav) ((xvf0) xv10Var.b).get(), (a3v) ((x4g) xv10Var.c).get(), (ah00) ((x4g) xv10Var.w).get(), (tt2) ((xvf0) xv10Var.x).get());
    }
}
