package yads;

import android.os.Handler;

/* loaded from: classes10.dex */
public final class hn0 implements cr2 {
    public final fn0 a;

    public hn0(Handler handler) {
        this.a = new fn0(handler);
    }

    public final void a(qp2 qp2Var, wq2 wq2Var, sr srVar) {
        synchronized (qp2Var.f) {
            qp2Var.l = true;
        }
        qp2Var.a("post-response");
        fn0 fn0Var = this.a;
        fn0Var.a.post(new gn0(qp2Var, wq2Var, srVar));
    }
}
