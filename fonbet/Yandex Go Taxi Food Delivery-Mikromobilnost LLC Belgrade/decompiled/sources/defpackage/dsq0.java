package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class dsq0 implements Executor {
    public final /* synthetic */ int a;
    public final Executor b;
    public final ArrayDeque c;
    public Runnable w;
    public final Object x;

    public dsq0(Executor executor, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = executor;
                this.c = new ArrayDeque();
                this.x = new Object();
                break;
            default:
                this.b = executor;
                this.c = new ArrayDeque();
                this.x = new Object();
                break;
        }
    }

    public final void a() {
        switch (this.a) {
            case 0:
                Runnable runnable = (Runnable) this.c.poll();
                this.w = runnable;
                if (runnable != null) {
                    this.b.execute(runnable);
                    return;
                }
                return;
            default:
                synchronized (this.x) {
                    Object poll = this.c.poll();
                    Runnable runnable2 = (Runnable) poll;
                    this.w = runnable2;
                    if (poll != null) {
                        this.b.execute(runnable2);
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                synchronized (this.x) {
                    try {
                        this.c.add(new na3(this, runnable, false, 5));
                        if (this.w == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                synchronized (this.x) {
                    this.c.offer(new t601(1, runnable, this));
                    if (this.w == null) {
                        a();
                    }
                }
                return;
        }
    }
}
