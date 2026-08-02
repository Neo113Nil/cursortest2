package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.x2;
import defpackage.tje;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes8.dex */
public final class i0 implements w0 {
    public final com.yandex.passport.internal.usecase.q0 a;

    public i0(com.yandex.passport.internal.usecase.q0 q0Var) {
        this.a = q0Var;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        return ((Result) tje.Y(EmptyCoroutineContext.a, new GetPushCodePerformer$performMethod$1((com.yandex.passport.internal.methods.l1) x2Var, this, null))).getValue();
    }
}
