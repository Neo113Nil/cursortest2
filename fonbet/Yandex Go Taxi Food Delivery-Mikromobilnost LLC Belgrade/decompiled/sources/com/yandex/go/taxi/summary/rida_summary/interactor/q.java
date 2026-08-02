package com.yandex.go.taxi.summary.rida_summary.interactor;

import com.yandex.go.payments.domain.m0;
import defpackage.f5k0;
import defpackage.fgv0;
import defpackage.ha2;
import defpackage.kdd0;
import defpackage.o8g0;
import defpackage.p6k0;
import defpackage.s6k0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.uze0;
import defpackage.wiq0;
import defpackage.yt11;
import defpackage.yxf0;

/* loaded from: classes14.dex */
public final class q implements yt11 {
    public final o8g0 a;
    public final s6k0 b;
    public final o8g0 c;
    public final yxf0 d;
    public final p6k0 e;
    public final kdd0 f;

    public q(tt2 tt2Var, o8g0 o8g0Var, s6k0 s6k0Var, o8g0 o8g0Var2, yxf0 yxf0Var, p6k0 p6k0Var, kdd0 kdd0Var) {
        this.a = o8g0Var;
        this.b = s6k0Var;
        this.c = o8g0Var2;
        this.d = yxf0Var;
        this.e = p6k0Var;
        this.f = kdd0Var;
    }

    @Override // defpackage.yt11
    public final tpr a() {
        o8g0 o8g0Var = this.a;
        com.yandex.go.taxi.summary.interactor.p pVar = (com.yandex.go.taxi.summary.interactor.p) o8g0Var.b;
        d dVar = new d(pVar.b(), o8g0Var);
        tpr t = kotlinx.coroutines.flow.e.t(new b(pVar.b(), o8g0Var));
        s6k0 s6k0Var = this.b;
        tpr t2 = kotlinx.coroutines.flow.e.t(new n(((com.yandex.go.taxi.tariffs.internal.repository.k) ((wiq0) s6k0Var.b)).j.b()));
        com.yandex.go.taxi.summary.rida_summary.repository.i iVar = (com.yandex.go.taxi.summary.rida_summary.repository.i) s6k0Var.a;
        ha2 l = kotlinx.coroutines.flow.e.l(t2, iVar.c, iVar.e, iVar.a(), ((com.yandex.go.taxi.tariffs.internal.repository.k) ((uze0) s6k0Var.c)).j.a(), new RidaPriceSelectorUiStateInteractor$uiStateFlow$1(null));
        yxf0 yxf0Var = this.d;
        f fVar = new f(((f5k0) yxf0Var.b).c, yxf0Var);
        o8g0 o8g0Var2 = this.c;
        l lVar = new l(((m0) o8g0Var2.b).b(), o8g0Var2);
        p6k0 p6k0Var = this.e;
        ha2 n = kotlinx.coroutines.flow.e.n(((com.yandex.go.taxi.tariffs.internal.repository.k) p6k0Var.b).j.b(), ((com.yandex.go.taxi.tariffs.internal.repository.k) p6k0Var.c).j.a(), kotlinx.coroutines.flow.e.t(new j(p6k0Var.d.f())), new RidaOrderButtonUiStateInteractor$uiStateFlow$1(p6k0Var, null));
        kdd0 kdd0Var = this.f;
        return kotlinx.coroutines.flow.e.F(new p(new tpr[]{dVar, t, l, fVar, lVar, n, kotlinx.coroutines.flow.e.t(new h(((fgv0) kdd0Var.b).e, kdd0Var))}), uyj.a);
    }
}
