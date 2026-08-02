package defpackage;

import android.content.Context;
import yads.po2;
import yads.xz;

/* loaded from: classes7.dex */
public final class bt81 extends zn71 {
    public final cr71 W;
    public final n981 Z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bt81(Context context, v981 v981Var, p981 p981Var, cf71 cf71Var, nl61 nl61Var) {
        super(context, r2, v981Var, r0, r4, r6, r7);
        fe81 fe81Var = new fe81(xz.f);
        e971 e971Var = new e971();
        cr71 cr71Var = new cr71(fe81Var);
        v671 v671Var = new v671(context, v981Var, 1);
        cr71 cr71Var2 = new cr71(context, fe81Var, v981Var, e971Var, new a441(context, cf71Var));
        n981 n981Var = new n981();
        this.W = cr71Var2;
        this.Z = n981Var;
        fe81Var.e = nl61Var;
        new s400(p981Var, this);
        a441 a441Var = new a441(fe81Var);
        xrr xrrVar = (xrr) cr71Var2.w;
        xrrVar.z = a441Var;
        xrrVar.A = cr71Var;
    }

    @Override // defpackage.zn71
    public final mb71 p(qe71 qe71Var) {
        return qe71Var.u(this, this.O);
    }

    @Override // defpackage.zn71, defpackage.fj81
    /* renamed from: q */
    public final void a(d881 d881Var) {
        po2 po2Var = d881Var.p;
        this.Z.getClass();
        if (!po2Var.b ? po2Var.c != null : po2Var.d != null) {
            h(so61.c);
        } else {
            super.a(d881Var);
        }
    }
}
