package com.yandex.passport.internal.usecase;

import com.yandex.passport.data.network.d8;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class q0 extends com.yandex.passport.common.domain.a {
    public final d8 b;
    public final com.yandex.passport.internal.core.accounts.d c;
    public final com.yandex.passport.internal.network.mappers.b d;
    public final com.yandex.passport.internal.report.reporters.u0 e;

    public q0(com.yandex.passport.common.coroutine.a aVar, d8 d8Var, com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.report.reporters.u0 u0Var) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        this.b = d8Var;
        this.c = dVar;
        this.d = bVar;
        this.e = u0Var;
    }

    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        return new Result(com.yandex.passport.common.util.a.h(new GetOtpByTrackUseCase$run$2$1(this, (p0) obj, null)));
    }
}
