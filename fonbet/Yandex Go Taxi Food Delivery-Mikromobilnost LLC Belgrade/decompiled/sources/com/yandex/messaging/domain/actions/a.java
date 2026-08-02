package com.yandex.messaging.domain.actions;

import defpackage.bvf0;
import defpackage.fyc;
import defpackage.gwk0;
import defpackage.tje;
import defpackage.wx4;
import defpackage.xdf0;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class a {
    public final xdf0 a;
    public final LinkedHashMap b = new LinkedHashMap();

    public a(xdf0 xdf0Var) {
        this.a = xdf0Var;
    }

    public final Object a(wx4 wx4Var, Continuation continuation) {
        fyc b = gwk0.b();
        xdf0 xdf0Var = this.a;
        if (bvf0.D(xdf0Var)) {
            tje.N(xdf0Var, null, null, new ActionsExecutor$execute$2(this, wx4Var, b, null), 3);
            Object s = b.s(continuation);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return s;
        }
        b.j0(new CancellationException());
        Object s2 = b.s(continuation);
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s2;
    }
}
