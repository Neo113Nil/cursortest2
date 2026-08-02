package xsna;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import xsna.je;

/* compiled from: ImmediateFuture.java */
/* loaded from: classes13.dex */
public final class tnw<V> implements ugz<V> {
    public static final cwy c = new cwy(tnw.class);
    public final V b;

    /* compiled from: ImmediateFuture.java */
    public static final class a<V> extends je.i<V> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tnw(Integer num) {
        this.b = num;
    }

    @Override // xsna.ugz
    public final void addListener(Runnable runnable, Executor executor) {
        fxc0.t(runnable, "Runnable was null.");
        fxc0.t(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        return this.b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=SUCCESS, result=[");
        return tk5.c(sb, this.b, "]]");
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.b;
    }
}
