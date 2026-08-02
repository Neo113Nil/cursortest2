package xsna;

import xsna.fzu0;

/* compiled from: JsSuperAppBrowserProvider.kt */
/* loaded from: classes6.dex */
public final class i6y implements i1v0 {
    public final fvv0 a;

    public i6y(wwv0 wwv0Var) {
        this.a = wwv0Var;
    }

    @Override // xsna.i1v0
    public final zxx get() {
        fvv0 fvv0Var = this.a;
        return (fvv0Var.h() && (fvv0Var instanceof fzu0.a)) ? new zxx(new h7y((fzu0.a) fvv0Var)) : new zxx(new e7y(fvv0Var, new vd1(22), new dam(13), new kdw(1)));
    }
}
