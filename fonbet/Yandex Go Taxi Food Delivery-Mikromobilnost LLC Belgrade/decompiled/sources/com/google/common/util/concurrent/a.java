package com.google.common.util.concurrent;

/* loaded from: classes11.dex */
public final class a {
    public final Throwable a;

    static {
        new a(new AbstractFuture$Failure$1("Failure occurred while trying to finish a future."));
    }

    public a(Throwable th) {
        th.getClass();
        this.a = th;
    }
}
