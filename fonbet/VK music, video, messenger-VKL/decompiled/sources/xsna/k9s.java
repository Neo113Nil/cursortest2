package xsna;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import xsna.m9s;

/* compiled from: ForwardingFuture.java */
/* loaded from: classes13.dex */
public abstract class k9s<V> extends x9s implements Future<V> {
    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return ((m9s.a) this).c.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        return ((m9s.a) this).c.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return ((m9s.a) this).c.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return ((m9s.a) this).c.isDone();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return ((m9s.a) this).c.get(j, timeUnit);
    }
}
