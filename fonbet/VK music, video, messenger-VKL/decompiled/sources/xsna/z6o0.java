package xsna;

import java.util.logging.Level;
import okhttp3.internal.concurrent.TaskRunner;

/* compiled from: TaskRunner.kt */
/* loaded from: classes11.dex */
public final class z6o0 implements Runnable {
    public final /* synthetic */ TaskRunner b;

    public z6o0(TaskRunner taskRunner) {
        this.b = taskRunner;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c5o0 c;
        long j;
        while (true) {
            TaskRunner taskRunner = this.b;
            synchronized (taskRunner) {
                c = taskRunner.c();
            }
            if (c == null) {
                return;
            }
            x6o0 x6o0Var = c.c;
            TaskRunner taskRunner2 = this.b;
            boolean isLoggable = TaskRunner.j.isLoggable(Level.FINE);
            if (isLoggable) {
                TaskRunner taskRunner3 = x6o0Var.a;
                j = System.nanoTime();
                okhttp3.internal.concurrent.a.a(c, x6o0Var, "starting");
            } else {
                j = -1;
            }
            try {
                try {
                    TaskRunner.a(taskRunner2, c);
                    s3q0 s3q0Var = s3q0.a;
                    if (isLoggable) {
                        TaskRunner taskRunner4 = x6o0Var.a;
                        okhttp3.internal.concurrent.a.a(c, x6o0Var, "finished run in ".concat(okhttp3.internal.concurrent.a.b(System.nanoTime() - j)));
                    }
                } finally {
                }
            } catch (Throwable th) {
                if (isLoggable) {
                    TaskRunner taskRunner5 = x6o0Var.a;
                    okhttp3.internal.concurrent.a.a(c, x6o0Var, "failed a run in ".concat(okhttp3.internal.concurrent.a.b(System.nanoTime() - j)));
                }
                throw th;
            }
        }
    }
}
