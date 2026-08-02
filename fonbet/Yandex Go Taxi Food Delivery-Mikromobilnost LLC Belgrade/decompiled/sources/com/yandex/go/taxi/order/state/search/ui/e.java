package com.yandex.go.taxi.order.state.search.ui;

import com.yandex.go.taxi.order.domain.repositories.n;
import com.yandex.go.taxi.order.experiments.h;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.state.o;
import defpackage.a3y0;
import defpackage.axp0;
import defpackage.bu1;
import defpackage.bup0;
import defpackage.d980;
import defpackage.fxx0;
import defpackage.h3y;
import defpackage.iup0;
import defpackage.mdh;
import defpackage.ney;
import defpackage.o2y0;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.t580;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zfm;

/* loaded from: classes14.dex */
public final class e extends o {
    public final bu1 R;
    public final h3y S;
    public final t580 T;
    public final com.yandex.go.taxi.order.repositories.c U;
    public final h V;
    public final h3y W;
    public final tt2 Z;
    public final h3y a0;
    public final bup0 b0;
    public final zfm c0;
    public final a3y0 d0;
    public pzt0 e0;

    public e(fxx0 fxx0Var, ney neyVar, bu1 bu1Var, h3y h3yVar, t580 t580Var, com.yandex.go.taxi.order.repositories.c cVar, h hVar, h3y h3yVar2, tt2 tt2Var, h3y h3yVar3, bup0 bup0Var, zfm zfmVar) {
        super(fxx0Var, axp0.class, neyVar);
        this.R = bu1Var;
        this.S = h3yVar;
        this.T = t580Var;
        this.U = cVar;
        this.V = hVar;
        this.W = h3yVar2;
        this.Z = tt2Var;
        this.a0 = h3yVar3;
        this.b0 = bup0Var;
        this.c0 = zfmVar;
        this.d0 = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "SearchStateViewPresenter");
    }

    @Override // com.yandex.go.taxi.order.state.o, defpackage.l780, defpackage.qc5, defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        ((d980) this.S.get()).e();
    }

    @Override // defpackage.qc5
    public final void Lg() {
        pzt0 pzt0Var = this.e0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }

    @Override // defpackage.qc5
    public final void onStart() {
        n nVar = (n) ((iup0) this.a0.get());
        o2y0 o2y0Var = this.A;
        kotlinx.coroutines.flow.n nVar2 = new kotlinx.coroutines.flow.n(nVar.h(o2y0Var), new SearchStateViewPresenter$observeHeaderUiState$1(2, null));
        kotlinx.coroutines.flow.n a = this.V.a(o2y0Var);
        d dVar = new d(new com.yandex.go.taxi.order.repositories.b(this.U.b(o2y0Var)));
        this.c0.getClass();
        tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.m(nVar2, a, dVar, zfm.a(o2y0Var), new SearchStateViewPresenter$observeHeaderUiState$3(this, null)));
        this.Z.getClass();
        sjh sjhVar = uyj.a;
        this.e0 = tje.N(Jg(), null, null, new SearchStateViewPresenter$observeHeaderUiState$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(t, mdh.b), null, this), 3);
    }
}
