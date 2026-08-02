package com.yandex.passport.internal.push;

import com.yandex.passport.common.core.Uid;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class u extends x {
    public final Uid a;

    static {
        int i = Uid.$stable;
    }

    public u(Uid uid) {
        this.a = uid;
    }

    @Override // com.yandex.passport.internal.push.x
    public final Object a(c cVar, Continuation continuation) {
        Object h = cVar.h(null, this.a, (ContinuationImpl) continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        zy11 zy11Var = zy11.a;
        if (h != coroutineSingletons) {
            h = zy11Var;
        }
        return h == coroutineSingletons ? h : zy11Var;
    }
}
