package com.vungle.ads.internal.executor;

import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes7.dex */
public final class b implements Future {
    public static final String b = "b";
    public final Future a;

    public b(Future future) {
        this.a = future;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Future future = this.a;
        if (future != null) {
            return future.cancel(z);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            Future future = this.a;
            if (future != null) {
                return future.get();
            }
            return null;
        } catch (InterruptedException unused) {
            boolean z = u.a;
            t.c(b, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e) {
            boolean z2 = u.a;
            t.a(b, "error on execution", e);
            return null;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        Future future = this.a;
        if (future != null) {
            return future.isCancelled();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Future future = this.a;
        if (future != null) {
            return future.isDone();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        try {
            Future future = this.a;
            if (future != null) {
                return future.get(j, timeUnit);
            }
            return null;
        } catch (InterruptedException unused) {
            boolean z = u.a;
            t.c(b, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e) {
            boolean z2 = u.a;
            t.a(b, "error on execution", e);
            return null;
        } catch (TimeoutException e2) {
            boolean z3 = u.a;
            String str = b;
            t.a(str, "error on timeout", e2);
            t.c(str, "future.get() Timeout on Thread " + Thread.currentThread().getName());
            return null;
        }
    }
}
