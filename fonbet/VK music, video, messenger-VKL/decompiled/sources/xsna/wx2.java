package xsna;

import java.util.Iterator;
import java.util.List;
import xsna.hhx0;

/* compiled from: ApiConfig.kt */
/* loaded from: classes.dex */
public final class wx2 implements hhx0.a {
    public final /* synthetic */ dc3 a;

    public wx2(dc3 dc3Var) {
        this.a = dc3Var;
    }

    @Override // xsna.hhx0.a
    public final boolean b() {
        dc3 dc3Var = this.a;
        if (dc3Var.v().length() > 0) {
            return true;
        }
        List<h7r0> w = dc3Var.w();
        if (w.isEmpty()) {
            return false;
        }
        Iterator<T> it = w.iterator();
        while (it.hasNext()) {
            if (((h7r0) it.next()).a.length() > 0) {
                return true;
            }
        }
        return false;
    }
}
