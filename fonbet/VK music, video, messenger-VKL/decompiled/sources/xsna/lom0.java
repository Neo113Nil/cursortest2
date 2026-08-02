package xsna;

import xsna.vx70;

/* compiled from: StrategyCalls.kt */
/* loaded from: classes.dex */
public final class lom0 {
    public static final <T> T a(k7r0<T> k7r0Var, gzs<vx70.a> gzsVar, gzs<vx70.b> gzsVar2, String str, int[] iArr) {
        per0 e;
        qrj0 qrj0Var = new qrj0(new wg9(gzsVar2, 4), new iej(5), new jom0(str, true, iArr));
        qrj0 qrj0Var2 = new qrj0(new yg9(gzsVar, 8), new kom0(str, true, iArr), new prj0());
        if (k7r0Var == null || (e = k7r0Var.e(qrj0Var, qrj0Var2)) == null) {
            return null;
        }
        return (T) e.a();
    }
}
