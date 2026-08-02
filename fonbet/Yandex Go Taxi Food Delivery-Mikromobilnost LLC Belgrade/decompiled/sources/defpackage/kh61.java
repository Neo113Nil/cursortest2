package defpackage;

import android.content.Context;
import yads.xz;

/* loaded from: classes7.dex */
public final class kh61 extends zn71 {
    public final fp71 W;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kh61(Context context, v981 v981Var, hv71 hv71Var, cf71 cf71Var, nl61 nl61Var) {
        super(context, r2, v981Var, r0, r4, r6, r7);
        e971 e971Var = new e971();
        fe81 fe81Var = new fe81(xz.e);
        cr71 cr71Var = new cr71(fe81Var);
        v671 v671Var = new v671(context, v981Var, 2);
        fp71 fp71Var = new fp71(context, fe81Var, v981Var, e971Var, new rr41(context, cf71Var));
        this.W = fp71Var;
        fe81Var.e = nl61Var;
        a441 a441Var = new a441(fe81Var);
        xrr xrrVar = (xrr) fp71Var.c;
        xrrVar.z = a441Var;
        xrrVar.A = cr71Var;
    }

    @Override // defpackage.zn71
    public final mb71 p(qe71 qe71Var) {
        return qe71Var.k(this, this.O);
    }
}
