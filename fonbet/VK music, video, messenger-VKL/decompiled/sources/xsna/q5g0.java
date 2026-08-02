package xsna;

import android.os.SystemClock;
import com.google.android.datatransport.Priority;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ReportQueue.java */
/* loaded from: classes.dex */
public final class q5g0 {
    public final double a;
    public final double b;
    public final long c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f;
    public final ThreadPoolExecutor g;
    public final pop0<j5k> h;
    public final y380 i;
    public int j;
    public long k;

    /* compiled from: ReportQueue.java */
    /* loaded from: classes13.dex */
    public final class a implements Runnable {
        public final u5k b;
        public final TaskCompletionSource<u5k> c;

        public a(u5k u5kVar, TaskCompletionSource taskCompletionSource) {
            this.b = u5kVar;
            this.c = taskCompletionSource;
        }

        @Override // java.lang.Runnable
        public final void run() {
            u5k u5kVar = this.b;
            TaskCompletionSource<u5k> taskCompletionSource = this.c;
            q5g0 q5g0Var = q5g0.this;
            q5g0Var.b(u5kVar, taskCompletionSource);
            ((AtomicInteger) q5g0Var.i.b).set(0);
            double min = Math.min(3600000.0d, Math.pow(q5g0Var.b, q5g0Var.a()) * (60000.0d / q5g0Var.a));
            String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d));
            try {
                Thread.sleep((long) min);
            } catch (InterruptedException unused) {
            }
        }
    }

    public q5g0(pop0<j5k> pop0Var, d0j0 d0j0Var, y380 y380Var) {
        double d = d0j0Var.d;
        double d2 = d0j0Var.e;
        this.a = d;
        this.b = d2;
        this.c = d0j0Var.f * 1000;
        this.h = pop0Var;
        this.i = y380Var;
        this.d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.k = 0L;
    }

    public final int a() {
        if (this.k == 0) {
            this.k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.k) / this.c);
        int min = this.f.size() == this.e ? Math.min(100, this.j + currentTimeMillis) : Math.max(0, this.j - currentTimeMillis);
        if (this.j != min) {
            this.j = min;
            this.k = System.currentTimeMillis();
        }
        return min;
    }

    public final void b(final u5k u5kVar, final TaskCompletionSource<u5k> taskCompletionSource) {
        u5kVar.getClass();
        final boolean z = SystemClock.elapsedRealtime() - this.d < 2000;
        this.h.a(new xl5(null, u5kVar.b(), Priority.HIGHEST, null), new bpp0() { // from class: xsna.p5g0
            @Override // xsna.bpp0
            public final void b(Exception exc) {
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (exc != null) {
                    taskCompletionSource2.trySetException(exc);
                    return;
                }
                if (z) {
                    boolean z2 = true;
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new qo2(8, q5g0.this, countDownLatch)).start();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ExecutorService executorService = g3r0.a;
                    boolean z3 = false;
                    try {
                        long nanos = timeUnit.toNanos(2L);
                        long nanoTime = System.nanoTime() + nanos;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (InterruptedException unused) {
                                    nanos = nanoTime - System.nanoTime();
                                    z3 = true;
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (z2) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z3) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z3;
                    }
                }
                taskCompletionSource2.trySetResult(u5kVar);
            }
        });
    }
}
