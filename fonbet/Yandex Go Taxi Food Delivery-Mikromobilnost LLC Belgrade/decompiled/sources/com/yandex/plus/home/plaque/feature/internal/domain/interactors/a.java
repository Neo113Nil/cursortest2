package com.yandex.plus.home.plaque.feature.internal.domain.interactors;

import defpackage.jse;
import defpackage.lqc0;
import defpackage.tje;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a {
    public final lqc0 a;
    public final jse b;

    public a(lqc0 lqc0Var, jse jseVar) {
        this.a = lqc0Var;
        this.b = jseVar;
    }

    public final Object a(String str, String str2, Continuation continuation) {
        Object k0 = tje.k0(this.b, new PlaqueCallbackInteractorImpl$reportPlaqueClicked$2(this, str, str2, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final Object b(String str, String str2, Continuation continuation) {
        Object k0 = tje.k0(this.b, new PlaqueCallbackInteractorImpl$reportPlaqueSeen$2(this, str, str2, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
