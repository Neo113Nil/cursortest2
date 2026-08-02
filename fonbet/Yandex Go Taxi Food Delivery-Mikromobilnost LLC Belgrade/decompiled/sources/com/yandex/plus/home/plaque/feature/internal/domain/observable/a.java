package com.yandex.plus.home.plaque.feature.internal.domain.observable;

import defpackage.jse;
import defpackage.lqc0;
import defpackage.oo2;
import defpackage.tje;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class a {
    public final lqc0 a;
    public final oo2 b;
    public final jse c;

    public a(lqc0 lqc0Var, oo2 oo2Var, jse jseVar) {
        this.a = lqc0Var;
        this.b = oo2Var;
        this.c = jseVar;
    }

    public final Object a(Continuation continuation) {
        oo2 oo2Var = this.b;
        r0 r0Var = (r0) oo2Var.c;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
        oo2Var.j();
        Object k0 = tje.k0(this.c, new PlaqueConfigurationObservableImpl$updatePlaqueConfiguration$2(this, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
