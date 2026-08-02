package defpackage;

import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class gb70 extends gc70 {
    public static final gb70 c = new gb70(0, 1, 1);

    @Override // defpackage.gc70
    public final void a(vc70 vc70Var, o13 o13Var, ows0 ows0Var, zti0 zti0Var, jc70 jc70Var) {
        wz40 wz40Var;
        aii0 aii0Var = (aii0) vc70Var.b(0);
        hz40 hz40Var = zti0Var.i;
        if (hz40Var == null || ((hs90) hz40Var.d(aii0Var)) == null) {
            return;
        }
        ArrayList arrayList = zti0Var.j;
        if (arrayList != null && (wz40Var = (wz40) arrayList.remove(arrayList.size() - 1)) != null) {
            zti0Var.e = wz40Var;
        }
        hz40Var.m(aii0Var);
    }
}
