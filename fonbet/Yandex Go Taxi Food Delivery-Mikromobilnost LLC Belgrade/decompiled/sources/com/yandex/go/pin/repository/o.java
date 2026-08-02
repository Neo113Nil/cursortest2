package com.yandex.go.pin.repository;

import defpackage.fji;
import defpackage.i1c0;
import defpackage.nj6;
import defpackage.pwy0;
import defpackage.r0c0;
import defpackage.s0c0;
import defpackage.ta4;
import defpackage.tpr;
import defpackage.wiq0;
import defpackage.z0c0;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes13.dex */
public final class o {
    public final com.yandex.go.navigation.screen.c a;
    public final ta4 b;
    public final s0c0 c;
    public final r0c0 d;
    public final com.yandex.go.pin.interactor.a e;
    public final wiq0 f;
    public final ru.yandex.taxi.delivery.pin.k g;
    public final ru.yandex.taxi.widget.utils.e h;
    public final nj6 i;
    public final pwy0 j;
    public final z0c0 k;
    public final i1c0 l;

    public o(com.yandex.go.navigation.screen.c cVar, ta4 ta4Var, s0c0 s0c0Var, r0c0 r0c0Var, com.yandex.go.pin.interactor.a aVar, wiq0 wiq0Var, ru.yandex.taxi.delivery.pin.k kVar, ru.yandex.taxi.widget.utils.e eVar, nj6 nj6Var, pwy0 pwy0Var) {
        this.a = cVar;
        this.b = ta4Var;
        this.c = s0c0Var;
        this.d = r0c0Var;
        this.e = aVar;
        this.f = wiq0Var;
        this.g = kVar;
        this.h = eVar;
        this.i = nj6Var;
        this.j = pwy0Var;
        this.k = r0c0Var.g();
        this.l = r0c0Var.i();
    }

    public static final i1c0 a(o oVar, fji fjiVar, i1c0 i1c0Var) {
        oVar.getClass();
        Integer num = fjiVar != null ? fjiVar.g : null;
        Integer num2 = fjiVar != null ? fjiVar.f : null;
        return (num == null || num2 == null) ? i1c0Var : new i1c0(num2.intValue(), num.intValue());
    }

    public final tpr b() {
        ru.yandex.taxi.delivery.pin.k kVar = this.g;
        return kotlinx.coroutines.flow.e.t(new m0(kotlinx.coroutines.flow.e.t(new ru.yandex.taxi.delivery.pin.b(kVar.e(true), kVar)), this.j.a(), new MainPinStyleRepositoryImpl$destinationV2StyleFlow$1(this, null)));
    }

    public final tpr c() {
        return kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new m0(new l(this.a.c()), new n(this.b.a), new MainPinStyleRepositoryImpl$tariffSelectionFlow$3(3, null))), new MainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$flatMapLatest$1(this, null)));
    }
}
