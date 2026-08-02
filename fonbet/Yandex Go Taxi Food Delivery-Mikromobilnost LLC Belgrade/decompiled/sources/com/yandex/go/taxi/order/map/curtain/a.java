package com.yandex.go.taxi.order.map.curtain;

import com.yandex.go.coroutines.b;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.taxi.order.domain.repositories.n;
import defpackage.ad5;
import defpackage.fup0;
import defpackage.jqr;
import defpackage.k7x0;
import defpackage.lz70;
import defpackage.oz70;
import defpackage.pav;
import defpackage.pz70;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.sz70;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.tz70;
import defpackage.uyj;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class a extends ad5 {
    public final pav A;
    public final k7x0 B;
    public pzt0 C;
    public final n D;
    public final oz70 x;
    public final c y;
    public final tt2 z;

    public a(fup0 fup0Var, oz70 oz70Var, c cVar, tt2 tt2Var, pav pavVar, k7x0 k7x0Var) {
        super(sz70.class);
        this.x = oz70Var;
        this.y = cVar;
        this.z = tt2Var;
        this.A = pavVar;
        this.B = k7x0Var;
        this.D = fup0Var.a(kotlin.collections.a.N0(DriveState.c()));
    }

    @Override // defpackage.zc5
    public final void Fg() {
        pzt0 pzt0Var = this.C;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }

    @Override // defpackage.zc5
    public final void Gg() {
        this.C = b.h(Jg(), new jqr(((pz70) this.x).c, new OrderMapCurtainPresenter$observeMapCurtainUserEvents$1(this, null), 3));
    }

    public final void Kg(tz70 tz70Var) {
        Bg(tz70Var);
        tz70Var.h().setContentHeightChangedListener(new lz70(1, new lz70(0, this)));
        tse Jg = Jg();
        this.z.getClass();
        sjh sjhVar = uyj.a;
        tje.N(Jg, sjhVar, null, new OrderMapCurtainPresenter$attachView$2(this, null), 2);
        tz70Var.h().setImageLoader(this.A);
        tz70Var.h().setTagUrlFormatter(this.B);
        n nVar = this.D;
        b.h(Jg(), new jqr(e.F(e.t(nVar.e()), sjhVar), new OrderMapCurtainPresenter$observeMapCurtainMode$1(this, null), 3));
        b.h(Jg(), new jqr(e.F(e.t(new m0(nVar.e(), this.y.c(), new OrderMapCurtainPresenter$observeMapCurtainShowParams$1(3, null))), sjhVar), new OrderMapCurtainPresenter$observeMapCurtainShowParams$2(this, null), 3));
    }
}
