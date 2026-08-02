package yads;

import xsna.izs;

/* loaded from: classes10.dex */
public final class gk0 extends qp2 {
    public static final Object v = new Object();
    public final fk0 s;
    public final izs t;
    public final w41 u;

    public gk0(String str, fk0 fk0Var, dk0 dk0Var, uq2 uq2Var) {
        super(0, str, uq2Var);
        this.s = fk0Var;
        this.t = dk0Var;
        this.u = new w41();
        a(new qe0(2.0f, 1000, 2));
        k();
    }

    @Override // yads.qp2
    public final void a(Object obj) {
        this.t.invoke((hk0) obj);
    }

    @Override // yads.qp2
    public final wq2 a(g92 g92Var) {
        wq2 wq2Var;
        synchronized (v) {
            try {
                w41 w41Var = this.u;
                byte[] bArr = g92Var.b;
                w41Var.getClass();
                wq2Var = new wq2(new hk0(this.s.a(g92Var.b), w41.a(bArr)), x11.a(g92Var));
            } catch (Exception e) {
                wq2Var = new wq2(new nc2(e));
            } catch (OutOfMemoryError e2) {
                int length = g92Var.b.length;
                boolean z = pn3.a;
                wq2Var = new wq2(new nc2(e2));
            }
        }
        return wq2Var;
    }
}
