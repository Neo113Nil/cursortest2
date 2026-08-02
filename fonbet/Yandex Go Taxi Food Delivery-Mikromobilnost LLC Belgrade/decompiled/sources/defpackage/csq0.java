package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public final class csq0 implements Executor {
    public final Executor a;
    public final ArrayDeque b = new ArrayDeque();
    public Runnable c;

    public csq0(Executor executor) {
        this.a = executor;
    }

    public final void a() {
        synchronized (this.b) {
            Object poll = this.b.poll();
            Runnable runnable = (Runnable) poll;
            this.c = runnable;
            if (poll != null) {
                this.a.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.b) {
            this.b.offer(new bsq0(0, runnable, this));
            if (this.c == null) {
                a();
            }
        }
    }
}
