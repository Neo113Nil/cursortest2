package xsna;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class mj01 implements Runnable {
    public final /* synthetic */ qj01 b;

    public mj01(qj01 qj01Var, rj01 rj01Var) {
        this.b = qj01Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qj01 qj01Var = this.b;
        qj01Var.d().k();
        qj01Var.l = new z901(qj01Var);
        ayz0 ayz0Var = new ayz0(qj01Var);
        ayz0Var.m();
        qj01Var.d = ayz0Var;
        kwz0 K = qj01Var.K();
        fb01 fb01Var = qj01Var.b;
        exc0.i(fb01Var);
        K.f = fb01Var;
        ai01 ai01Var = new ai01(qj01Var);
        ai01Var.m();
        qj01Var.j = ai01Var;
        fuz0 fuz0Var = new fuz0(qj01Var);
        fuz0Var.m();
        qj01Var.g = fuz0Var;
        cg01 cg01Var = new cg01(qj01Var);
        cg01Var.m();
        qj01Var.i = cg01Var;
        ij01 ij01Var = new ij01(qj01Var);
        ij01Var.m();
        qj01Var.f = ij01Var;
        qj01Var.e = new r901(qj01Var);
        if (qj01Var.r != qj01Var.s) {
            qj01Var.e().i.c("Not all upload components initialized", Integer.valueOf(qj01Var.r), Integer.valueOf(qj01Var.s));
        }
        qj01Var.n = true;
        qj01Var.d().k();
        ayz0 ayz0Var2 = qj01Var.d;
        qj01.I(ayz0Var2);
        ayz0Var2.R();
        if (qj01Var.j.j.a() == 0) {
            u901 u901Var = qj01Var.j.j;
            ((jcl) qj01Var.f()).getClass();
            u901Var.b(System.currentTimeMillis());
        }
        qj01Var.D();
    }
}
