package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class rx2 {
    public final oc3 a;
    public final qc3 b;

    public /* synthetic */ rx2(Context context) {
        this(new oc3(context), new qc3(context));
    }

    public final void a() {
        boolean z;
        qc3 qc3Var = this.b;
        ve3 ve3Var = qc3Var.a;
        Context context = qc3Var.c;
        ve3Var.getClass();
        if (ub.a(context)) {
            pc3 pc3Var = qc3Var.b;
            qu2 a = pc3Var.a.a(qc3Var.c);
            if (a != null && a.r) {
                qc3Var.d.getClass();
                rc3.b();
            }
        }
        oc3 oc3Var = this.a;
        ve3 ve3Var2 = oc3Var.c;
        Context context2 = oc3Var.e;
        ve3Var2.getClass();
        if (ub.a(context2)) {
            hx2 hx2Var = oc3Var.b;
            hx2Var.getClass();
            synchronized (hx2.j) {
                z = hx2Var.f;
            }
            if (z) {
                nc3 nc3Var = oc3Var.d;
                qu2 a2 = nc3Var.a.a(oc3Var.e);
                if (a2 == null || !a2.q) {
                    return;
                }
                oc3Var.a.a();
            }
        }
    }

    public rx2(oc3 oc3Var, qc3 qc3Var) {
        this.a = oc3Var;
        this.b = qc3Var;
    }
}
