package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.core.Uid;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class k0 extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.core.accounts.d b;

    public k0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.d dVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = dVar;
    }

    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        return new Result(com.yandex.passport.common.util.a.h(new GetLocationIdUseCase$run$2(this, (Uid) obj, null)));
    }
}
