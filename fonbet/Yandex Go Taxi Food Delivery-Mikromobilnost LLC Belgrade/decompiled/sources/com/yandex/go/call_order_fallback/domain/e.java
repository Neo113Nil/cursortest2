package com.yandex.go.call_order_fallback.domain;

import defpackage.hay0;
import defpackage.rk6;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class e {
    public final hay0 a;
    public final tt2 b;

    public e(hay0 hay0Var, tt2 tt2Var) {
        this.a = hay0Var;
        this.b = tt2Var;
    }

    public final Object a(rk6 rk6Var, Continuation continuation) {
        this.b.getClass();
        Object k0 = tje.k0(uyj.a, new CallOrderFallbackRouterDismissInteractor$awaitAndDismiss$2(this, rk6Var, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
