package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.common.domain.RetryStrategy;
import com.yandex.passport.common.exception.InvalidTokenException;

/* loaded from: classes2.dex */
public final class i extends com.yandex.passport.common.domain.b {
    public final long e;
    public final RetryStrategy f;
    public final int g;

    public i(com.yandex.passport.common.coroutine.a aVar, j jVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d, jVar);
        this.e = com.yandex.passport.common.time.a.c(0, 1, 0, 11);
        this.f = RetryStrategy.CONSTANT;
        this.g = 30;
    }

    @Override // com.yandex.passport.common.domain.b
    public final long e() {
        return this.e;
    }

    @Override // com.yandex.passport.common.domain.b
    public final int f() {
        return this.g;
    }

    @Override // com.yandex.passport.common.domain.b
    public final RetryStrategy g() {
        return this.f;
    }

    @Override // com.yandex.passport.common.domain.b
    public final boolean i(Throwable th) {
        return !(th instanceof InvalidTokenException);
    }
}
