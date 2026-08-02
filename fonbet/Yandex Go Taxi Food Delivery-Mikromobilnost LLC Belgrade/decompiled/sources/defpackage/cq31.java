package defpackage;

import java.util.PriorityQueue;

/* loaded from: classes11.dex */
public final class cq31 extends Thread {
    public final cf5 a;
    public volatile String b;

    public cq31() {
        super("ViewPoolThread");
        this.a = new cf5(new PriorityQueue(32));
        setPriority(5);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                aq31 aq31Var = (aq31) this.a.poll();
                if (aq31Var == null) {
                    try {
                        setPriority(3);
                        aq31Var = (aq31) this.a.take();
                        setPriority(5);
                    } finally {
                    }
                }
                this.b = aq31Var.b;
                aq31Var.run();
                this.b = null;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
