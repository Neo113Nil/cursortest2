package com.yandex.go.rida.bids.interactor;

import defpackage.a3v;
import defpackage.gci0;
import defpackage.ha2;
import defpackage.ir5;
import defpackage.jqr;
import defpackage.pp5;
import defpackage.rol0;
import defpackage.sup0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.xr5;
import defpackage.ymu;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes13.dex */
public final class m {
    public final xr5 a;
    public final i b;
    public final e c;
    public final ir5 d;
    public final ymu e;
    public final sup0 f;

    public m(tt2 tt2Var, xr5 xr5Var, i iVar, e eVar, ir5 ir5Var, ymu ymuVar, sup0 sup0Var) {
        this.a = xr5Var;
        this.b = iVar;
        this.c = eVar;
        this.d = ir5Var;
        this.e = ymuVar;
        this.f = sup0Var;
    }

    public final tpr a() {
        e eVar = this.c;
        ha2 n = kotlinx.coroutines.flow.e.n(eVar.b.a(), eVar.c.c, kotlinx.coroutines.flow.e.t(com.yandex.go.coroutines.b.d(new d(eVar.d.a()), new BidsDriveCardUiStateInteractor$headerSubtitleFlow$$inlined$start$1(null, null))), new BidsDriveCardUiStateInteractor$uiStateFlow$1(eVar, null));
        i iVar = this.b;
        pp5 pp5Var = iVar.a;
        m0 m0Var = new m0(new h(new com.yandex.go.rida.bids.controller.b(pp5Var.b), iVar), kotlinx.coroutines.flow.e.d(pp5Var.d), new BidsListUiStateInteractor$uiStateFlow$1(3, null));
        ymu ymuVar = this.e;
        m0 m0Var2 = new m0(((com.yandex.go.rida.bids.data.a) ymuVar.c).e, kotlinx.coroutines.flow.e.d(((pp5) ymuVar.b).c), new BidsBoostButtonUiStateInteractor$uiStateFlow$1(3, null));
        gci0 gci0Var = this.d.b;
        rol0 rol0Var = new rol0(new SearchMapDecorationStateInteractorRepository$decorationIsVisibleFlow$1(2, null));
        sup0 sup0Var = this.f;
        tpr d = com.yandex.go.coroutines.b.d(new m0(new b0(new z(sup0Var.c.a())), kotlinx.coroutines.flow.e.t(new d0(((com.yandex.go.taxi.tariffs.internal.repository.k) sup0Var.b).j.b())), new SearchMapDecorationStateInteractorRepository$pulsarTypeFlow$1(sup0Var, null)), new SearchMapDecorationStateInteractorRepository$pulsarTypeFlow$$inlined$start$1(2, null));
        a3v a3vVar = sup0Var.a;
        ha2 l = kotlinx.coroutines.flow.e.l(n, m0Var, m0Var2, gci0Var, kotlinx.coroutines.flow.e.n(rol0Var, d, com.yandex.go.coroutines.b.d(new f0(a3vVar.Pd()), new SearchMapDecorationStateInteractorRepository$uiStateFlow$$inlined$start$1(a3vVar.Gf(), null)), new SearchMapDecorationStateInteractorRepository$uiStateFlow$2(sup0Var, null)), new BidsUiStateInteractor$uiStateFlow$1(null));
        return kotlinx.coroutines.flow.e.F(new m0(l, new jqr(kotlinx.coroutines.flow.e.t(new l(l)), new BidsUiStateInteractor$settleModalWhenExtendedUiChanges$settleModalFlow$2(this, null), 3), new BidsUiStateInteractor$settleModalWhenExtendedUiChanges$1(3, null)), uyj.a);
    }
}
