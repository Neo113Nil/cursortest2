package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import xsna.ub9;

/* compiled from: FutureChain.java */
/* loaded from: classes11.dex */
public class p0t<V> implements ugz<V> {

    @NonNull
    public final ugz<V> b;

    @Nullable
    public ub9.a<V> c;

    /* compiled from: FutureChain.java */
    public class a implements ub9.c<V> {
        public a() {
        }

        @Override // xsna.ub9.c
        public final Object attachCompleter(@NonNull ub9.a<V> aVar) {
            p0t p0tVar = p0t.this;
            obr.f("The result can only set once!", p0tVar.c == null);
            p0tVar.c = aVar;
            return "FutureChain[" + p0tVar + X3.j.e;
        }
    }

    public p0t(@NonNull ugz<V> ugzVar) {
        ugzVar.getClass();
        this.b = ugzVar;
    }

    @NonNull
    public static <V> p0t<V> a(@NonNull ugz<V> ugzVar) {
        return ugzVar instanceof p0t ? (p0t) ugzVar : new p0t<>(ugzVar);
    }

    @Override // xsna.ugz
    public final void addListener(@NonNull Runnable runnable, @NonNull Executor executor) {
        this.b.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.b.cancel(z);
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public V get() throws InterruptedException, ExecutionException {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public V get(long j, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.b.get(j, timeUnit);
    }

    public p0t() {
        this.b = ub9.a(new a());
    }
}
