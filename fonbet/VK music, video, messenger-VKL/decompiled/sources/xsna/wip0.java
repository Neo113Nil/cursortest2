package xsna;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: TransactionExecutor.android.kt */
/* loaded from: classes.dex */
public final class wip0 implements Executor {
    public final Executor b;
    public Runnable d;
    public final ArrayDeque<Runnable> c = new ArrayDeque<>();
    public final Object e = new Object();

    public wip0(Executor executor) {
        this.b = executor;
    }

    public final void a() {
        synchronized (this.e) {
            try {
                Runnable poll = this.c.poll();
                Runnable runnable = poll;
                this.d = runnable;
                if (poll != null) {
                    this.b.execute(runnable);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        synchronized (this.e) {
            try {
                this.c.offer(new Runnable() { // from class: xsna.vip0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Runnable runnable2 = runnable;
                        wip0 wip0Var = this;
                        try {
                            runnable2.run();
                        } finally {
                            wip0Var.a();
                        }
                    }
                });
                if (this.d == null) {
                    a();
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
