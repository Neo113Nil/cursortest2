package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import xsna.ub9;

/* compiled from: ChainingListenableFuture.java */
/* loaded from: classes11.dex */
public final class ora<I, O> extends p0t<O> implements Runnable {

    @Nullable
    public iy3<? super I, ? extends O> d;
    public final LinkedBlockingQueue e = new LinkedBlockingQueue(1);
    public final CountDownLatch f = new CountDownLatch(1);

    @Nullable
    public ugz<? extends I> g;

    @Nullable
    public volatile ugz<? extends O> h;

    /* compiled from: ChainingListenableFuture.java */
    public class a implements Runnable {
        public final /* synthetic */ ugz b;

        public a(ugz ugzVar) {
            this.b = ugzVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                try {
                    ora oraVar = ora.this;
                    Object c = r0t.c(this.b);
                    ub9.a<V> aVar = oraVar.c;
                    if (aVar != 0) {
                        aVar.b(c);
                    }
                } catch (CancellationException unused) {
                    ora.this.cancel(false);
                } catch (ExecutionException e) {
                    ora oraVar2 = ora.this;
                    Throwable cause = e.getCause();
                    ub9.a<V> aVar2 = oraVar2.c;
                    if (aVar2 != 0) {
                        aVar2.d(cause);
                    }
                }
            } finally {
                ora.this.h = null;
            }
        }
    }

    public ora(@NonNull iy3<? super I, ? extends O> iy3Var, @NonNull ugz<? extends I> ugzVar) {
        this.d = iy3Var;
        ugzVar.getClass();
        this.g = ugzVar;
    }

    public static Object b(@NonNull LinkedBlockingQueue linkedBlockingQueue) {
        Object take;
        boolean z = false;
        while (true) {
            try {
                take = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    @Override // xsna.p0t, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2 = false;
        if (!this.b.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.e.put(Boolean.valueOf(z));
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        ugz<? extends I> ugzVar = this.g;
        if (ugzVar != null) {
            ugzVar.cancel(z);
        }
        ugz<? extends O> ugzVar2 = this.h;
        if (ugzVar2 != null) {
            ugzVar2.cancel(z);
        }
        return true;
    }

    @Override // xsna.p0t, java.util.concurrent.Future
    @Nullable
    public final O get() throws InterruptedException, ExecutionException {
        if (!this.b.isDone()) {
            ugz<? extends I> ugzVar = this.g;
            if (ugzVar != null) {
                ugzVar.get();
            }
            this.f.await();
            ugz<? extends O> ugzVar2 = this.h;
            if (ugzVar2 != null) {
                ugzVar2.get();
            }
        }
        return (O) this.b.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xsna.iy3<? super I, ? extends O>, xsna.ugz<? extends I>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [xsna.iy3<? super I, ? extends O>, xsna.ugz<? extends I>] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.CountDownLatch] */
    @Override // java.lang.Runnable
    public final void run() {
        iy3<? super I, ? extends O> iy3Var;
        ?? r0 = (iy3<? super I, ? extends O>) null;
        try {
            try {
                try {
                    try {
                        try {
                            ugz<? extends O> mo416apply = this.d.mo416apply(r0t.c(this.g));
                            this.h = mo416apply;
                            if (this.b.isCancelled()) {
                                mo416apply.cancel(((Boolean) b(this.e)).booleanValue());
                                this.h = null;
                            } else {
                                mo416apply.addListener(new a(mo416apply), xo9.g());
                            }
                        } catch (Exception e) {
                            ub9.a<V> aVar = this.c;
                            iy3Var = r0;
                            if (aVar != 0) {
                                aVar.d(e);
                                iy3Var = r0;
                            }
                        }
                    } catch (Error e2) {
                        ub9.a<V> aVar2 = this.c;
                        iy3Var = r0;
                        if (aVar2 != 0) {
                            aVar2.d(e2);
                            iy3Var = r0;
                        }
                    }
                } finally {
                    this.d = (iy3<? super I, ? extends O>) r0;
                    this.g = (ugz<? extends I>) r0;
                    this.f.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e3) {
                Throwable cause = e3.getCause();
                ub9.a<V> aVar3 = this.c;
                if (aVar3 != 0) {
                    aVar3.d(cause);
                }
            }
        } catch (UndeclaredThrowableException e4) {
            Throwable cause2 = e4.getCause();
            ub9.a<V> aVar4 = this.c;
            iy3Var = r0;
            if (aVar4 != 0) {
                aVar4.d(cause2);
                iy3Var = r0;
            }
        }
    }

    @Override // xsna.p0t, java.util.concurrent.Future
    @Nullable
    public final O get(long j, @NonNull TimeUnit timeUnit) throws TimeoutException, ExecutionException, InterruptedException {
        if (!this.b.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            ugz<? extends I> ugzVar = this.g;
            if (ugzVar != null) {
                long nanoTime = System.nanoTime();
                ugzVar.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.f.await(j, timeUnit)) {
                j -= Math.max(0L, System.nanoTime() - nanoTime2);
                ugz<? extends O> ugzVar2 = this.h;
                if (ugzVar2 != null) {
                    ugzVar2.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return (O) this.b.get(j, timeUnit);
    }
}
