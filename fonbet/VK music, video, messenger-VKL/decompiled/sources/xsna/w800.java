package xsna;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* compiled from: LottieTask.java */
/* loaded from: classes12.dex */
public final class w800<T> {
    public static final Executor e;
    public final LinkedHashSet a;
    public final LinkedHashSet b;
    public final Handler c;

    @Nullable
    public volatile u800<T> d;

    /* compiled from: LottieTask.java */
    public static class a<T> extends FutureTask<u800<T>> {
        public w800<T> b;

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.b.d(get());
                } catch (InterruptedException | ExecutionException e) {
                    this.b.d(new u800<>(e));
                }
            } finally {
                this.b = null;
            }
        }
    }

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            e = new ddk();
        } else {
            e = Executors.newCachedThreadPool(new y800());
        }
    }

    public w800() {
        throw null;
    }

    public w800(i700 i700Var) {
        this.a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.c = new Handler(Looper.getMainLooper());
        this.d = null;
        d(new u800<>(i700Var));
    }

    public final synchronized void a(r800 r800Var) {
        Throwable th;
        try {
            u800<T> u800Var = this.d;
            if (u800Var != null && (th = u800Var.b) != null) {
                r800Var.onResult(th);
            }
            this.b.add(r800Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(r800 r800Var) {
        i700 i700Var;
        try {
            u800<T> u800Var = this.d;
            if (u800Var != null && (i700Var = u800Var.a) != null) {
                r800Var.onResult(i700Var);
            }
            this.a.add(r800Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        u800<T> u800Var = this.d;
        if (u800Var == null) {
            return;
        }
        i700 i700Var = u800Var.a;
        if (i700Var != null) {
            synchronized (this) {
                Iterator it = new ArrayList(this.a).iterator();
                while (it.hasNext()) {
                    ((r800) it.next()).onResult(i700Var);
                }
            }
            return;
        }
        Throwable th = u800Var.b;
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.b);
            if (arrayList.isEmpty()) {
                n100.c("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((r800) it2.next()).onResult(th);
            }
        }
    }

    public final void d(@Nullable u800<T> u800Var) {
        if (this.d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.d = u800Var;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c();
        } else {
            this.c.post(new kv2(this, 4));
        }
    }

    public w800(Callable<u800<T>> callable, boolean z) {
        this.a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.c = new Handler(Looper.getMainLooper());
        this.d = null;
        if (z) {
            try {
                d(callable.call());
                return;
            } catch (Throwable th) {
                d(new u800<>(th));
                return;
            }
        }
        Executor executor = e;
        a aVar = new a(callable);
        aVar.b = this;
        executor.execute(aVar);
    }
}
