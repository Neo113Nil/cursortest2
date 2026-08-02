package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.x2;
import defpackage.tje;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes8.dex */
public final class g0 implements w0 {
    public final com.yandex.passport.internal.usecase.q0 a;
    public final com.yandex.passport.internal.methods.performer.error.a b;

    public g0(com.yandex.passport.internal.usecase.q0 q0Var, com.yandex.passport.internal.methods.performer.error.a aVar) {
        this.a = q0Var;
        this.b = aVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        return ((Result) tje.Y(EmptyCoroutineContext.a, new GetOtpByTrackPerformer$performMethod$1(this, (com.yandex.passport.internal.methods.j1) x2Var, null))).getValue();
    }
}
