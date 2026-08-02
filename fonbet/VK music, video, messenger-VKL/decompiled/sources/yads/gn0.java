package yads;

/* loaded from: classes10.dex */
public final class gn0 implements Runnable {
    public final qp2 b;
    public final wq2 c;
    public final Runnable d;

    public gn0(qp2 qp2Var, wq2 wq2Var, sr srVar) {
        this.b = qp2Var;
        this.c = wq2Var;
        this.d = srVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uq2 uq2Var;
        if (this.b.i()) {
            this.b.c("canceled-at-delivery");
            return;
        }
        wq2 wq2Var = this.c;
        mn3 mn3Var = wq2Var.c;
        if (mn3Var == null) {
            this.b.a(wq2Var.a);
        } else {
            qp2 qp2Var = this.b;
            synchronized (qp2Var.f) {
                uq2Var = qp2Var.g;
            }
            if (uq2Var != null) {
                uq2Var.a(mn3Var);
            }
        }
        if (this.c.d) {
            this.b.a("intermediate-response");
        } else {
            this.b.c("done");
        }
        Runnable runnable = this.d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
