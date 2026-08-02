package defpackage;

import androidx.concurrent.futures.b;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes10.dex */
public final class o89 extends jqs implements Runnable {
    public aa3 c;
    public final LinkedBlockingQueue w = new LinkedBlockingQueue(1);
    public final CountDownLatch x = new CountDownLatch(1);
    public euy y;
    public volatile euy z;

    public o89(aa3 aa3Var, euy euyVar) {
        this.c = aa3Var;
        euyVar.getClass();
        this.y = euyVar;
    }

    public static Object b(LinkedBlockingQueue linkedBlockingQueue) {
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

    @Override // defpackage.jqs, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2 = false;
        if (!this.a.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.w.put(Boolean.valueOf(z));
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
        euy euyVar = this.y;
        if (euyVar != null) {
            euyVar.cancel(z);
        }
        euy euyVar2 = this.z;
        if (euyVar2 != null) {
            euyVar2.cancel(z);
        }
        return true;
    }

    @Override // defpackage.jqs, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        if (!this.a.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            euy euyVar = this.y;
            if (euyVar != null) {
                long nanoTime = System.nanoTime();
                euyVar.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (!this.x.await(j, timeUnit)) {
                throw new TimeoutException();
            }
            j -= Math.max(0L, System.nanoTime() - nanoTime2);
            euy euyVar2 = this.z;
            if (euyVar2 != null) {
                euyVar2.get(j, timeUnit);
            }
        }
        return this.a.get(j, timeUnit);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, jqs, o89] */
    /* JADX WARN: Type inference failed for: r5v1, types: [o89] */
    /* JADX WARN: Type inference failed for: r5v3, types: [jqs] */
    /* JADX WARN: Type inference failed for: r5v6, types: [jqs] */
    /* JADX WARN: Type inference failed for: r5v7, types: [jqs] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.concurrent.CountDownLatch] */
    @Override // java.lang.Runnable
    public final void run() {
        o89 o89Var;
        boolean z = false;
        try {
            try {
                try {
                    try {
                        try {
                            euy apply = this.c.apply(ni91.e(this.y));
                            this.z = apply;
                            if (this.a.isCancelled()) {
                                apply.cancel(((Boolean) b(this.w)).booleanValue());
                                this.z = null;
                            } else {
                                apply.c(new do91((Object) this, apply, z, 2), geb1.b());
                            }
                        } catch (Error e) {
                            b bVar = this.b;
                            o89Var = this;
                            if (bVar != null) {
                                bVar.d(e);
                                o89Var = this;
                            }
                        }
                    } catch (UndeclaredThrowableException e2) {
                        Throwable cause = e2.getCause();
                        b bVar2 = this.b;
                        o89Var = this;
                        if (bVar2 != null) {
                            bVar2.d(cause);
                            o89Var = this;
                        }
                    }
                } finally {
                    this.c = null;
                    this.y = null;
                    this.x.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e3) {
                Throwable cause2 = e3.getCause();
                b bVar3 = this.b;
                if (bVar3 != null) {
                    bVar3.d(cause2);
                }
            }
        } catch (Exception e4) {
            b bVar4 = this.b;
            o89Var = this;
            if (bVar4 != null) {
                bVar4.d(e4);
                o89Var = this;
            }
        }
    }

    @Override // defpackage.jqs, java.util.concurrent.Future
    public final Object get() {
        if (!this.a.isDone()) {
            euy euyVar = this.y;
            if (euyVar != null) {
                euyVar.get();
            }
            this.x.await();
            euy euyVar2 = this.z;
            if (euyVar2 != null) {
                euyVar2.get();
            }
        }
        return this.a.get();
    }
}
