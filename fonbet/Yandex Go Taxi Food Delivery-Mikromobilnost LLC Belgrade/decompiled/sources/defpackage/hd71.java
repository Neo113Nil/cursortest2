package defpackage;

import android.content.Context;
import yads.xz;

/* loaded from: classes7.dex */
public final class hd71 extends zn71 {
    public final cr71 W;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hd71(Context context, v981 v981Var, hf81 hf81Var, cf71 cf71Var, nl61 nl61Var) {
        super(context, r2, v981Var, r0, r4, r6, r7);
        e971 e971Var = new e971();
        fe81 fe81Var = new fe81(xz.i);
        cr71 cr71Var = new cr71(fe81Var);
        v671 v671Var = new v671(context, v981Var, 0);
        cr71 cr71Var2 = new cr71(context, fe81Var, v981Var, e971Var, cf71Var);
        this.W = cr71Var2;
        fe81Var.e = nl61Var;
        xrr xrrVar = (xrr) cr71Var2.c;
        xrrVar.A = cr71Var;
        xrrVar.z = new a441(fe81Var);
    }

    @Override // defpackage.zn71
    public final mb71 p(qe71 qe71Var) {
        return qe71Var.t(this, this.O);
    }
}
