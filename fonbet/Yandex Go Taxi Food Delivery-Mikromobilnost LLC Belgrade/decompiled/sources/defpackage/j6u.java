package defpackage;

import android.os.Handler;
import androidx.concurrent.futures.b;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class j6u implements RunnableScheduledFuture {
    public final AtomicReference a = new AtomicReference(null);
    public final long b;
    public final Callable c;
    public final gl7 w;

    public j6u(Handler handler, long j, Callable callable) {
        this.b = j;
        this.c = callable;
        this.w = jx81.r(new r1s(this, handler, callable, false, 6));
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.w.cancel(z);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.w.b.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.w.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.w.b.isDone();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return false;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        b bVar = (b) this.a.getAndSet(null);
        if (bVar != null) {
            try {
                bVar.b(this.c.call());
            } catch (Exception e) {
                bVar.d(e);
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.w.b.get(j, timeUnit);
    }
}
