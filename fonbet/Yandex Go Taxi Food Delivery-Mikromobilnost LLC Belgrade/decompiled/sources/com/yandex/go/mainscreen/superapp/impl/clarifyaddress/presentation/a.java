package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.presentation;

import com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.f;
import com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.x;
import defpackage.e4w0;
import defpackage.exr;
import defpackage.j73;
import defpackage.jqr;
import defpackage.k1w0;
import defpackage.mdh;
import defpackage.mwz0;
import defpackage.ney;
import defpackage.nwz0;
import defpackage.pwz0;
import defpackage.qc5;
import defpackage.sjh;
import defpackage.tig0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.flow.e;

/* loaded from: classes12.dex */
public final class a extends qc5 {
    public final tt2 A;
    public final k1w0 B;
    public final com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.a C;
    public final tig0 D;

    public a(tt2 tt2Var, k1w0 k1w0Var, com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.a aVar, tig0 tig0Var, ney neyVar) {
        super(e4w0.class, neyVar);
        this.A = tt2Var;
        this.B = k1w0Var;
        this.C = aVar;
        this.D = tig0Var;
    }

    public final void Mg(e4w0 e4w0Var) {
        Bg(e4w0Var);
        exr exrVar = new exr(3, j73.f0(new pwz0[]{nwz0.a, mwz0.a}));
        tig0 tig0Var = this.D;
        jqr jqrVar = new jqr(e.t(new x(((f) tig0Var.a).a(), exrVar, tig0Var)), new SuperAppMainScreenCompactTopPlaquePresenter$attachView$2(2, this, a.class, "logNewState", "logNewState(Lcom/yandex/go/mainscreen/superapp/impl/clarifyaddress/presentation/SuperAppMainScreenTopPlaqueUIState;)V", 4), 3);
        this.A.getClass();
        sjh sjhVar = uyj.a;
        tje.N(Jg(), null, null, new SuperAppMainScreenCompactTopPlaquePresenter$attachView$$inlined$safeCollectIn$1(e.F(jqrVar, mdh.b), null, e4w0Var), 3);
    }
}
