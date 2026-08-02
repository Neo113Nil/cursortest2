package xsna;

import xsna.dc80;

/* compiled from: StorySendMessageDialog.kt */
/* loaded from: classes6.dex */
public final class scm0 implements dc80.b {
    public final /* synthetic */ tcm0 a;

    public scm0(tcm0 tcm0Var) {
        this.a = tcm0Var;
    }

    @Override // xsna.dc80.b
    public final boolean a() {
        ycm0 ycm0Var = this.a.m;
        if (ycm0Var == null || ycm0Var.k) {
            return true;
        }
        mcm0 mcm0Var = ycm0Var.h;
        if (mcm0Var == null) {
            mcm0Var = null;
        }
        ((tcm0) mcm0Var).dismiss();
        return true;
    }

    @Override // xsna.dc80.b
    public final boolean b() {
        return false;
    }
}
