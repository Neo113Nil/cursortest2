package defpackage;

import android.content.Context;
import android.os.Handler;
import kotlin.collections.a;
import yads.f5;
import yads.j5;
import yads.qp1;

/* loaded from: classes7.dex */
public final class du71 extends dj81 {
    public final g271 P;
    public final s421 Q;
    public final mj31 R;
    public final cr71 S;
    public final m481 T;
    public final w381 U;
    public final nr41 V;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public du71(Context context, v981 v981Var, g271 g271Var, fe81 fe81Var, s421 s421Var, e971 e971Var) {
        super(context, e971Var, fe81Var, v981Var, r5, new z4m0(context, fe81Var, v981Var, g271Var, e971Var));
        Context context2 = ((n291) v981Var).a;
        qx71 qx71Var = new qx71(0, wha1.c(context2, context2));
        qhw0 a = jl40.a();
        sjh sjhVar = uyj.a;
        ike a2 = bvf0.a(cvw.U(a, mdh.b).plus(qx71Var));
        mj31 mj31Var = new mj31(context, fe81Var, v981Var);
        cr71 cr71Var = new cr71(fe81Var);
        if (m481.b == null) {
            synchronized (m481.c) {
                if (m481.b == null) {
                    m481.b = new m481();
                }
            }
        }
        m481 m481Var = m481.b;
        if (m481Var == null) {
            ny61.r("Required value was null.");
            throw null;
        }
        w381 w381Var = new w381(context, a2, fe81Var, e971Var, v981Var);
        this.P = g271Var;
        this.Q = s421Var;
        this.R = mj31Var;
        this.S = cr71Var;
        this.T = m481Var;
        this.U = w381Var;
        this.V = new nr41(19, this);
        ((xrr) s421Var.w).A = cr71Var;
    }

    @Override // defpackage.fj81
    public final void a(Object obj) {
        vk61 a441Var;
        d881 d881Var = (d881) obj;
        synchronized (this) {
            this.b.a(f5.t);
            this.N = d881Var;
        }
        this.S.x = d881Var;
        if (this.J == j5.b) {
            return;
        }
        mj31 mj31Var = this.R;
        mj31Var.getClass();
        qp1 qp1Var = d881Var.o;
        if (qp1Var != null) {
            a441Var = new vi71((Context) mj31Var.b, d881Var, qp1Var);
        } else {
            a441Var = new a441(mj31Var.w, mj31Var.c, false, 19);
        }
        kg61 c = a441Var.c(this, this.O);
        Context a = tb71.a();
        if (a == null) {
            a = this.a;
        }
        c.a(a, d881Var);
    }

    @Override // defpackage.dj81
    public final void b(dl61 dl61Var) {
        s421 s421Var = this.Q;
        ((xrr) s421Var.w).c(dl61Var.b, dl61Var.c);
        ((Handler) s421Var.c).post(new bo31(18, s421Var, dl61Var));
    }

    @Override // defpackage.dj81
    public final boolean f(nl61 nl61Var) {
        return true;
    }

    @Override // defpackage.dj81
    public final synchronized void i(nl61 nl61Var) {
        throw null;
    }

    @Override // defpackage.dj81
    public final dl61 o() {
        return (dl61) a.R(this.A.e());
    }
}
