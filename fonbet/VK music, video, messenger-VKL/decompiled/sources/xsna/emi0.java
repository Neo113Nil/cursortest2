package xsna;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: SerialExecutorImpl.java */
/* loaded from: classes.dex */
public final class emi0 implements dmi0 {
    public final Executor c;
    public Runnable d;
    public final ArrayDeque<a> b = new ArrayDeque<>();
    public final Object e = new Object();

    /* compiled from: SerialExecutorImpl.java */
    public static class a implements Runnable {
        public final emi0 b;
        public final Runnable c;

        public a(@NonNull emi0 emi0Var, @NonNull Runnable runnable) {
            this.b = emi0Var;
            this.c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.c.run();
                synchronized (this.b.e) {
                    this.b.a();
                }
            } catch (Throwable th) {
                synchronized (this.b.e) {
                    this.b.a();
                    throw th;
                }
            }
        }
    }

    public emi0(@NonNull Executor executor) {
        this.c = executor;
    }

    public final void a() {
        a poll = this.b.poll();
        this.d = poll;
        if (poll != null) {
            this.c.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        synchronized (this.e) {
            try {
                this.b.add(new a(this, runnable));
                if (this.d == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
