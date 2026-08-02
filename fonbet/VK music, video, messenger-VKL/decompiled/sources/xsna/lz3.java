package xsna;

import android.os.AsyncTask;
import android.os.Looper;
import android.os.SystemClock;
import androidx.core.os.OperationCanceledException;
import androidx.loader.content.ModernAsyncTask;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import xsna.csz;

/* compiled from: AsyncTaskLoader.java */
/* loaded from: classes12.dex */
public abstract class lz3<D> extends erz<D> {
    public Executor f;
    public volatile lz3<D>.a g;
    public volatile lz3<D>.a h;

    /* compiled from: AsyncTaskLoader.java */
    public final class a extends ModernAsyncTask<D> implements Runnable {
        public a() {
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public final void a() {
            try {
                lz3 lz3Var = lz3.this;
                lz3Var.getClass();
                rqz0 rqz0Var = (rqz0) lz3Var;
                Iterator it = rqz0Var.j.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (((com.google.android.gms.common.api.c) it.next()).f(rqz0Var)) {
                        i++;
                    }
                }
                try {
                    rqz0Var.i.tryAcquire(i, 5L, TimeUnit.SECONDS);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            } catch (OperationCanceledException e) {
                if (!this.d.get()) {
                    throw e;
                }
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public final void b(D d) {
            lz3 lz3Var = lz3.this;
            if (lz3Var.h == this) {
                SystemClock.uptimeMillis();
                lz3Var.h = null;
                lz3Var.b();
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public final void c(D d) {
            lz3 lz3Var = lz3.this;
            if (lz3Var.g != this) {
                if (lz3Var.h == this) {
                    SystemClock.uptimeMillis();
                    lz3Var.h = null;
                    lz3Var.b();
                    return;
                }
                return;
            }
            if (lz3Var.c) {
                return;
            }
            SystemClock.uptimeMillis();
            lz3Var.g = null;
            csz.a aVar = lz3Var.a;
            if (aVar != null) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    aVar.k(d);
                } else {
                    aVar.i(d);
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            lz3.this.b();
        }
    }

    public final void b() {
        if (this.h != null || this.g == null) {
            return;
        }
        this.g.getClass();
        if (this.f == null) {
            this.f = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        lz3<D>.a aVar = this.g;
        Executor executor = this.f;
        if (aVar.c == ModernAsyncTask.Status.PENDING) {
            aVar.c = ModernAsyncTask.Status.RUNNING;
            executor.execute(aVar.b);
            return;
        }
        int i = ModernAsyncTask.d.a[aVar.c.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }
}
