package xsna;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class jb01 extends Thread {
    public final Object b;
    public final BlockingQueue c;
    public boolean d = false;
    public final /* synthetic */ kb01 e;

    public jb01(kb01 kb01Var, String str, BlockingQueue blockingQueue) {
        this.e = kb01Var;
        exc0.i(blockingQueue);
        this.b = new Object();
        this.c = blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.e.l) {
            try {
                if (!this.d) {
                    this.e.m.release();
                    this.e.l.notifyAll();
                    kb01 kb01Var = this.e;
                    if (this == kb01Var.f) {
                        kb01Var.f = null;
                    } else if (this == kb01Var.g) {
                        kb01Var.g = null;
                    } else {
                        k901 k901Var = ((mb01) kb01Var.b).j;
                        mb01.k(k901Var);
                        k901Var.i.a("Current scheduler thread is neither worker nor network");
                    }
                    this.d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.e.m.acquire();
                z = true;
            } catch (InterruptedException e) {
                k901 k901Var = ((mb01) this.e.b).j;
                mb01.k(k901Var);
                k901Var.l.b(e, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                ib01 ib01Var = (ib01) this.c.poll();
                if (ib01Var != null) {
                    Process.setThreadPriority(true != ib01Var.c ? 10 : threadPriority);
                    ib01Var.run();
                } else {
                    synchronized (this.b) {
                        if (this.c.peek() == null) {
                            try {
                                this.b.wait(ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS);
                            } catch (InterruptedException e2) {
                                k901 k901Var2 = ((mb01) this.e.b).j;
                                mb01.k(k901Var2);
                                k901Var2.l.b(e2, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.e.l) {
                        if (this.c.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            a();
            throw th;
        }
    }
}
