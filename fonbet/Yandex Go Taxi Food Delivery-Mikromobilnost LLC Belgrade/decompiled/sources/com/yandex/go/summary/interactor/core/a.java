package com.yandex.go.summary.interactor.core;

import defpackage.a201;
import defpackage.bvf0;
import defpackage.cjw0;
import defpackage.fwu0;
import defpackage.ggv0;
import defpackage.jdv0;
import defpackage.jfv0;
import defpackage.pev0;
import defpackage.tt2;
import defpackage.uhv0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a {
    public final ru.yandex.taxi.summary.requirements.list.recycler.i a;
    public final jdv0 b;
    public final jfv0 c;
    public final ggv0 d;
    public final uhv0 e;
    public final a201 f;
    public final tt2 g;
    public final com.yandex.go.analytics.b h;
    public final cjw0 i;
    public final pev0 j;
    public final fwu0 k;

    public a(ru.yandex.taxi.summary.requirements.list.recycler.i iVar, jdv0 jdv0Var, jfv0 jfv0Var, ggv0 ggv0Var, uhv0 uhv0Var, a201 a201Var, tt2 tt2Var, com.yandex.go.analytics.b bVar, cjw0 cjw0Var, pev0 pev0Var, fwu0 fwu0Var) {
        this.a = iVar;
        this.b = jdv0Var;
        this.c = jfv0Var;
        this.d = ggv0Var;
        this.e = uhv0Var;
        this.f = a201Var;
        this.g = tt2Var;
        this.h = bVar;
        this.i = cjw0Var;
        this.j = pev0Var;
        this.k = fwu0Var;
    }

    public final Object a(Continuation continuation) {
        Object n = bvf0.n(new ComposeSummaryLifecycleActionsInteractor$launchOnAttachActions$2(this, null), continuation);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11.a;
    }
}
