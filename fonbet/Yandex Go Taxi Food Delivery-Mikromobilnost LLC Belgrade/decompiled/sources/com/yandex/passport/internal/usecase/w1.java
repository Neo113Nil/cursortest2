package com.yandex.passport.internal.usecase;

import java.io.Closeable;

/* loaded from: classes2.dex */
public final class w1 implements Closeable {
    public final /* synthetic */ x1 a;

    public w1(x1 x1Var) {
        this.a = x1Var;
        kotlinx.coroutines.flow.r0 r0Var = x1Var.c;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        kotlinx.coroutines.flow.r0 r0Var = this.a.c;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool);
    }
}
