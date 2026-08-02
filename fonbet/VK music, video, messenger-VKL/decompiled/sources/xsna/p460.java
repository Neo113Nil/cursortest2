package xsna;

import androidx.work.NetworkType;

/* compiled from: ContraintControllers.kt */
/* loaded from: classes.dex */
public final class p460 extends zb6<l560> {
    static {
        m100.d("NetworkNotRoamingCtrlr");
    }

    @Override // xsna.v5j
    public final boolean a(fxx0 fxx0Var) {
        return fxx0Var.j.a == NetworkType.NOT_ROAMING;
    }

    @Override // xsna.zb6
    public final int d() {
        return 7;
    }

    @Override // xsna.zb6
    public final boolean e(l560 l560Var) {
        l560 l560Var2 = l560Var;
        return (l560Var2.a && l560Var2.d) ? false : true;
    }
}
