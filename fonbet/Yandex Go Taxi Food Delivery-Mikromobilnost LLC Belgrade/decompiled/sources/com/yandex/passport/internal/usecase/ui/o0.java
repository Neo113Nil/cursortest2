package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.common.domain.RetryStrategy;

/* loaded from: classes2.dex */
public final class o0 extends com.yandex.passport.common.domain.b {
    public final long e;
    public final RetryStrategy f;
    public final int g;

    public o0(com.yandex.passport.common.coroutine.a aVar, p0 p0Var) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d, p0Var);
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
}
