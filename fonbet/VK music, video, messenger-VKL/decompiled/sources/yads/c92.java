package yads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes10.dex */
public final class c92 extends Thread {
    public final BlockingQueue b;
    public final xo c;
    public final mr d;
    public final cr2 e;
    public volatile boolean f = false;

    public c92(PriorityBlockingQueue priorityBlockingQueue, xo xoVar, mr mrVar, cr2 cr2Var) {
        this.b = priorityBlockingQueue;
        this.c = xoVar;
        this.d = mrVar;
        this.e = cr2Var;
    }

    private void a() throws InterruptedException {
        qp2 qp2Var = (qp2) this.b.take();
        SystemClock.elapsedRealtime();
        qp2Var.a(3);
        try {
            try {
                qp2Var.a("network-queue-take");
                if (qp2Var.i()) {
                    qp2Var.c("network-discard-cancelled");
                    qp2Var.j();
                } else {
                    TrafficStats.setThreadStatsTag(qp2Var.e);
                    g92 a = this.c.a(qp2Var);
                    qp2Var.a("network-http-complete");
                    if (a.e && qp2Var.h()) {
                        qp2Var.c("not-modified");
                        qp2Var.j();
                    } else {
                        wq2 a2 = qp2Var.a(a);
                        qp2Var.a("network-parse-complete");
                        if (qp2Var.j && a2.b != null) {
                            this.d.a(qp2Var.c(), a2.b);
                            qp2Var.a("network-cache-written");
                        }
                        synchronized (qp2Var.f) {
                            qp2Var.l = true;
                        }
                        ((hn0) this.e).a(qp2Var, a2, null);
                        qp2Var.a(a2);
                    }
                }
            } catch (mn3 e) {
                SystemClock.elapsedRealtime();
                mn3 a3 = qp2Var.a(e);
                hn0 hn0Var = (hn0) this.e;
                hn0Var.getClass();
                qp2Var.a("post-error");
                wq2 wq2Var = new wq2(a3);
                fn0 fn0Var = hn0Var.a;
                fn0Var.a.post(new gn0(qp2Var, wq2Var, null));
                qp2Var.j();
            } catch (Exception e2) {
                boolean z = pn3.a;
                mn3 mn3Var = new mn3(e2);
                SystemClock.elapsedRealtime();
                hn0 hn0Var2 = (hn0) this.e;
                hn0Var2.getClass();
                qp2Var.a("post-error");
                wq2 wq2Var2 = new wq2(mn3Var);
                fn0 fn0Var2 = hn0Var2.a;
                fn0Var2.a.post(new gn0(qp2Var, wq2Var2, null));
                qp2Var.j();
            }
            qp2Var.a(4);
        } catch (Throwable th) {
            qp2Var.a(4);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                boolean z = pn3.a;
            } catch (Throwable unused2) {
                boolean z2 = pn3.a;
                return;
            }
        }
    }
}
