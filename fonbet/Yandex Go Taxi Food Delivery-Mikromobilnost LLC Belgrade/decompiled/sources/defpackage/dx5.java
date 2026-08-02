package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class dx5 implements Executor {
    public final cx5 a;
    public final /* synthetic */ c7r b;

    public dx5(cx5 cx5Var) {
        this.a = cx5Var;
        this.b = new c7r(new ThreadPoolExecutor(1, 1, 1000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), cx5Var));
    }

    public final Thread a() {
        Thread thread = this.a.a;
        if (thread == null || !thread.isAlive()) {
            thread = null;
        }
        if (thread != null) {
            return thread;
        }
        execute(new zi(21));
        Thread thread2 = this.a.a;
        if (thread2 == null || !thread2.isAlive()) {
            thread2 = null;
        }
        if (thread2 != null) {
            return thread2;
        }
        ny61.r("Binding thread is not created");
        return null;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.execute(runnable);
    }
}
