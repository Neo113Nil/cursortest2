package com.yandex.go.chargers.order.completion.pre_finish.domain;

import defpackage.em9;
import defpackage.ena;
import defpackage.jqr;
import defpackage.pwy0;
import defpackage.q1a;
import defpackage.rol0;
import defpackage.saa;
import defpackage.tpr;
import defpackage.tsa;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v1a;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o;

/* loaded from: classes12.dex */
public final class b {
    public final tt2 a;
    public final em9 b;
    public final pwy0 c;
    public final com.yandex.go.chargers.error.data.a d;
    public final ena e;
    public final com.yandex.go.chargers.order.completion.pre_finish.data.a f;
    public final v1a g;
    public final saa h;

    public b(tt2 tt2Var, em9 em9Var, pwy0 pwy0Var, com.yandex.go.chargers.error.data.a aVar, ena enaVar, com.yandex.go.chargers.order.completion.pre_finish.data.a aVar2, v1a v1aVar, saa saaVar) {
        this.a = tt2Var;
        this.b = em9Var;
        this.c = pwy0Var;
        this.d = aVar;
        this.e = enaVar;
        this.f = aVar2;
        this.g = v1aVar;
        this.h = saaVar;
    }

    public final tpr a(tsa tsaVar, String str) {
        pwy0 pwy0Var = this.c;
        tpr d = com.yandex.go.coroutines.b.d(new o(new m0(pwy0Var.a(), new jqr(new rol0(new ChargersFinishUiStateInteractor$listenPreFinishState$1(this, str, tsaVar, null)), new ChargersFinishUiStateInteractor$listenPreFinishState$2(this, null), 3), new ChargersFinishUiStateInteractor$listenPreFinishState$3(this, null)), new ChargersFinishUiStateInteractor$listenPreFinishState$4(this, null)), new ChargersFinishUiStateInteractor$listenPreFinishState$$inlined$start$1(q1a.a, null));
        this.a.getClass();
        return e.t(e.i(new ChargersFinishUiStateInteractor$takeUntilNext$1(new m0(pwy0Var.a(), new jqr(this.g.a, new ChargersFinishUiStateInteractor$listenFinishState$1(this, null), 3), new ChargersFinishUiStateInteractor$listenFinishState$2(3, null)), e.F(d, uyj.a), null)));
    }
}
