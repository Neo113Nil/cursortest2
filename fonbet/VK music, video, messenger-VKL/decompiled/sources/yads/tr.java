package yads;

import android.os.Process;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes10.dex */
public final class tr extends Thread {
    public static final boolean h = pn3.a;
    public final BlockingQueue b;
    public final BlockingQueue c;
    public final mr d;
    public final cr2 e;
    public volatile boolean f = false;
    public final io3 g;

    public tr(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, mr mrVar, cr2 cr2Var) {
        this.b = priorityBlockingQueue;
        this.c = priorityBlockingQueue2;
        this.d = mrVar;
        this.e = cr2Var;
        this.g = new io3(this, priorityBlockingQueue2, cr2Var);
    }

    private void a() throws InterruptedException {
        qp2 qp2Var = (qp2) this.b.take();
        qp2Var.a("cache-queue-take");
        qp2Var.a(1);
        try {
            if (qp2Var.i()) {
                qp2Var.c("cache-discard-canceled");
            } else {
                lr lrVar = this.d.get(qp2Var.c());
                if (lrVar == null) {
                    qp2Var.a("cache-miss");
                    if (!this.g.a(qp2Var)) {
                        this.c.put(qp2Var);
                    }
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (lrVar.e < currentTimeMillis) {
                        qp2Var.a("cache-hit-expired");
                        qp2Var.p = lrVar;
                        if (!this.g.a(qp2Var)) {
                            this.c.put(qp2Var);
                        }
                    } else {
                        qp2Var.a("cache-hit");
                        byte[] bArr = lrVar.a;
                        Map map = lrVar.g;
                        wq2 a = qp2Var.a(new g92(200, bArr, map, g92.a(map), false));
                        qp2Var.a("cache-hit-parsed");
                        if (a.c != null) {
                            qp2Var.a("cache-parsing-failed");
                            this.d.a(qp2Var.c());
                            qp2Var.p = null;
                            if (!this.g.a(qp2Var)) {
                                this.c.put(qp2Var);
                            }
                        } else if (lrVar.f < currentTimeMillis) {
                            qp2Var.a("cache-hit-refresh-needed");
                            qp2Var.p = lrVar;
                            a.d = true;
                            if (this.g.a(qp2Var)) {
                                ((hn0) this.e).a(qp2Var, a, null);
                            } else {
                                ((hn0) this.e).a(qp2Var, a, new sr(this, qp2Var));
                            }
                        } else {
                            ((hn0) this.e).a(qp2Var, a, null);
                        }
                    }
                }
            }
            qp2Var.a(2);
        } catch (Throwable th) {
            qp2Var.a(2);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        this.d.a();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f) {
                    Thread.currentThread().interrupt();
                    return;
                }
            } catch (Throwable unused2) {
                return;
            }
        }
    }
}
