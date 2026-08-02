package xsna;

import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Result;

/* compiled from: Task.kt */
/* loaded from: classes9.dex */
public final class d5o0<T> {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public volatile Result<? extends T> c;

    /* compiled from: Task.kt */
    public final class a {
        public a() {
        }

        public final void a(Throwable th) {
            d5o0<T> d5o0Var = d5o0.this;
            synchronized (d5o0Var) {
                if (d5o0Var.c != null) {
                    return;
                }
                d5o0Var.c = new Result<>(new Result.Failure(th));
                r490.b(d5o0Var.a, new z4o0(d5o0Var, th));
                r490.b(d5o0Var.b, new v4o0(d5o0Var, th));
                s3q0 s3q0Var = s3q0.a;
            }
        }

        public final void b(T t) {
            d5o0<T> d5o0Var = d5o0.this;
            synchronized (d5o0Var) {
                if (d5o0Var.c != null) {
                    return;
                }
                d5o0Var.c = new Result<>(t);
                r490.b(d5o0Var.a, new x4o0(d5o0Var, t));
                r490.b(d5o0Var.b, new v4o0(d5o0Var, null));
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }

    public static void d(Executor executor, gzs gzsVar) {
        if (executor != null) {
            executor.execute(new oh(gzsVar));
        } else {
            ((Handler) f7o0.b.getValue()).post(new sb(gzsVar));
        }
    }

    public final void a(e380 e380Var, Executor executor) {
        synchronized (this) {
            try {
                Result<? extends T> result = this.c;
                if (result == null) {
                    this.b.add(new f8i(e380Var, executor));
                } else {
                    d(executor, new r4o0(e380Var, Result.a(result.d())));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(bc80 bc80Var, b680 b680Var) {
        synchronized (this) {
            try {
                Result<? extends T> result = this.c;
                if (result == null) {
                    this.a.add(new dhz(bc80Var, b680Var));
                } else {
                    Object d = result.d();
                    if (d instanceof Result.Failure) {
                        d = null;
                    }
                    Throwable a2 = Result.a(result.d());
                    if (d != null && bc80Var != null) {
                        d(null, new s4o0(bc80Var, d));
                    }
                    if (a2 != null && b680Var != null) {
                        d(null, new t4o0(b680Var, a2));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final T c() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (this.c != null) {
            countDownLatch.countDown();
        } else {
            a(new did0(countDownLatch, 8), (ExecutorService) f7o0.a.getValue());
        }
        countDownLatch.await();
        Result<? extends T> result = this.c;
        if (result == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        T t = (T) result.d();
        kotlin.a.a(t);
        return t;
    }
}
