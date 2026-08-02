package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ir2 implements Executor {
    public final Object a = new Object();
    public final ArrayDeque b = new ArrayDeque();
    public final ykj c;
    public Runnable w;

    public ir2(ykj ykjVar) {
        this.c = ykjVar;
    }

    public final void a() {
        synchronized (this.a) {
            try {
                Runnable runnable = (Runnable) this.b.poll();
                this.w = runnable;
                if (runnable != null) {
                    this.c.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.a) {
            try {
                this.b.add(new hc(23, this, runnable));
                if (this.w == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
