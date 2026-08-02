package xsna;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: ProxyFuture.kt */
/* loaded from: classes17.dex */
public final class y9e0<V> implements Future<V> {
    public final Object b = new Object();
    public final CountDownLatch c = new CountDownLatch(1);
    public Future<V> d;
    public boolean e;

    public final void a() {
        synchronized (this.b) {
            if (this.e) {
                throw new CancellationException();
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final Future<V> b() {
        Future<V> future;
        synchronized (this.b) {
            future = this.d;
            if (future == null) {
                throw new ExecutionException(new IllegalStateException("realFuture is null"));
            }
        }
        return future;
    }

    public final boolean c() {
        boolean z;
        synchronized (this.b) {
            z = this.d != null;
        }
        return z;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this.b) {
            Future<V> future = this.d;
            if (future != null) {
                return future.cancel(z);
            }
            this.e = true;
            this.c.countDown();
            return true;
        }
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        this.c.await();
        a();
        return b().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        boolean isCancelled;
        synchronized (this.b) {
            try {
                Future<V> future = this.d;
                isCancelled = future == null ? this.e : future.isCancelled();
            } catch (Throwable th) {
                throw th;
            }
        }
        return isCancelled;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean isDone;
        synchronized (this.b) {
            try {
                Future<V> future = this.d;
                isDone = future == null ? this.e : future.isDone();
            } catch (Throwable th) {
                throw th;
            }
        }
        return isDone;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        if (j >= 0) {
            long millis = timeUnit.toMillis(j) + SystemClock.elapsedRealtime();
            if (this.c.await(j, timeUnit)) {
                a();
                return b().get(Math.max(1L, millis - SystemClock.elapsedRealtime()), TimeUnit.MILLISECONDS);
            }
            throw new TimeoutException("Timeout achieved during await of get");
        }
        throw new IllegalArgumentException(qlb0.a(j, "Illegal timeout value: ", ". Expect timeout to be >= 0"));
    }
}
