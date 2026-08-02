package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: ImmediateFuture.java */
/* loaded from: classes11.dex */
public abstract class snw<V> implements ugz<V> {

    /* compiled from: ImmediateFuture.java */
    public static class a<V> extends snw<V> {

        @NonNull
        public final Exception b;

        public a(@NonNull Exception exc) {
            this.b = exc;
        }

        @Override // java.util.concurrent.Future
        @Nullable
        public final V get() throws ExecutionException {
            throw new ExecutionException(this.b);
        }

        @NonNull
        public final String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.b + "]]";
        }
    }

    /* compiled from: ImmediateFuture.java */
    public static final class b<V> extends a<V> implements ScheduledFuture<V> {
        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(@NonNull Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(@NonNull TimeUnit timeUnit) {
            return 0L;
        }
    }

    /* compiled from: ImmediateFuture.java */
    public static final class c<V> extends snw<V> {
        public static final c c = new c(null);

        @Nullable
        public final V b;

        public c(@Nullable V v) {
            this.b = v;
        }

        @Override // java.util.concurrent.Future
        @Nullable
        public final V get() {
            return this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("[status=SUCCESS, result=[");
            return tk5.c(sb, this.b, "]]");
        }
    }

    @Override // xsna.ugz
    public final void addListener(@NonNull Runnable runnable, @NonNull Executor executor) {
        runnable.getClass();
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            s100.a("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public final V get(long j, @NonNull TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }
}
