package com.yandex.passport.internal.push;

import com.yandex.passport.common.core.Uid;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class w extends x {
    public final Uid a;

    static {
        int i = Uid.$stable;
    }

    public w(Uid uid) {
        this.a = uid;
    }

    @Override // com.yandex.passport.internal.push.x
    public final Object a(c cVar, Continuation continuation) {
        Object g = cVar.g(this.a, (ContinuationImpl) continuation);
        return g == CoroutineSingletons.COROUTINE_SUSPENDED ? g : zy11.a;
    }
}
