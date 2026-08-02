package com.yandex.passport.legacy.lx;

import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public final class l extends m {
    public final /* synthetic */ Callable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Callable callable) {
        super(null);
        this.c = callable;
    }

    @Override // com.yandex.passport.legacy.lx.m
    public final Object c() {
        return this.c.call();
    }
}
