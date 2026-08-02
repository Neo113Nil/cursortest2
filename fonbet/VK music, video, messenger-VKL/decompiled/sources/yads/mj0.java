package yads;

import java.io.IOException;

/* loaded from: classes10.dex */
public final class mj0 extends Thread implements rj0 {
    public final qj0 b;
    public final sj0 c;
    public final oj0 d;
    public final boolean e;
    public final int f;
    public volatile kj0 g;
    public volatile boolean h;
    public Exception i;
    public long j = -1;

    public mj0(qj0 qj0Var, sj0 sj0Var, oj0 oj0Var, boolean z, int i, kj0 kj0Var) {
        this.b = qj0Var;
        this.c = sj0Var;
        this.d = oj0Var;
        this.e = z;
        this.f = i;
        this.g = kj0Var;
    }

    public final void a(boolean z) {
        if (z) {
            this.g = null;
        }
        if (this.h) {
            return;
        }
        this.h = true;
        this.c.cancel();
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.e) {
                this.c.remove();
            } else {
                long j = -1;
                int i = 0;
                while (!this.h) {
                    try {
                        this.c.a(this);
                        break;
                    } catch (IOException e) {
                        if (!this.h) {
                            long j2 = this.d.a;
                            if (j2 != j) {
                                i = 0;
                                j = j2;
                            }
                            int i2 = i + 1;
                            if (i2 > this.f) {
                                throw e;
                            }
                            Thread.sleep(Math.min(i * 1000, 5000));
                            i = i2;
                        }
                    }
                }
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e2) {
            this.i = e2;
        }
        kj0 kj0Var = this.g;
        if (kj0Var != null) {
            kj0Var.obtainMessage(9, this).sendToTarget();
        }
    }

    public final void a(long j, long j2, float f) {
        this.d.a = j2;
        this.d.b = f;
        if (j != this.j) {
            this.j = j;
            kj0 kj0Var = this.g;
            if (kj0Var != null) {
                kj0Var.obtainMessage(10, (int) (j >> 32), (int) j, this).sendToTarget();
            }
        }
    }
}
