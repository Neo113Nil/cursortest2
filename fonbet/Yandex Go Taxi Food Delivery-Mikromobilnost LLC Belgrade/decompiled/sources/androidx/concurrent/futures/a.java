package androidx.concurrent.futures;

import defpackage.ga;

/* loaded from: classes.dex */
public final class a {
    public final Throwable a;

    static {
        new a(new Throwable() { // from class: androidx.concurrent.futures.AbstractResolvableFuture$Failure$1
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
    }

    public a(Throwable th) {
        boolean z = ga.w;
        th.getClass();
        this.a = th;
    }
}
