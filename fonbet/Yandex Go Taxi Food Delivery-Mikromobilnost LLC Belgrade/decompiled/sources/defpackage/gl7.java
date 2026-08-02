package defpackage;

import androidx.concurrent.futures.b;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class gl7 implements euy {
    public final WeakReference a;
    public final fl7 b = new fl7(this);

    public gl7(b bVar) {
        this.a = new WeakReference(bVar);
    }

    public final boolean a(Throwable th) {
        return this.b.l(th);
    }

    @Override // defpackage.euy
    public final void c(Runnable runnable, Executor executor) {
        this.b.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        b bVar = (b) this.a.get();
        boolean cancel = this.b.cancel(z);
        if (cancel && bVar != null) {
            bVar.a = null;
            bVar.b = null;
            bVar.c.k(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.a instanceof v9;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
