package xsna;

import androidx.work.NetworkType;

/* compiled from: ContraintControllers.kt */
/* loaded from: classes.dex */
public final class u260 extends zb6<l560> {
    @Override // xsna.v5j
    public final boolean a(fxx0 fxx0Var) {
        return fxx0Var.j.a == NetworkType.CONNECTED;
    }

    @Override // xsna.zb6
    public final int d() {
        return 7;
    }

    @Override // xsna.zb6
    public final boolean e(l560 l560Var) {
        l560 l560Var2 = l560Var;
        return (l560Var2.a && l560Var2.b) ? false : true;
    }
}
