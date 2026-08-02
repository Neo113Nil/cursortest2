package com.yandex.passport.internal.usecase;

import kotlin.Result;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class b extends com.yandex.passport.common.domain.a {
    public final p b;
    public final com.yandex.passport.internal.core.accounts.e c;

    public b(com.yandex.passport.common.coroutine.a aVar, p pVar, com.yandex.passport.internal.core.accounts.e eVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = pVar;
        this.c = eVar;
    }

    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        Object h = com.yandex.passport.common.util.a.h(new AuthorizeByMasterTokenUseCase$run$2((a) obj, this, null));
        Throwable a = Result.a(h);
        if (a == null) {
            return new Result(h);
        }
        throw a;
    }
}
