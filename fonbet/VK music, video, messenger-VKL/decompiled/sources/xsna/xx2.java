package xsna;

import java.util.Iterator;
import java.util.List;
import xsna.y0a0;

/* compiled from: ApiConfig.kt */
/* loaded from: classes.dex */
public final class xx2 implements y0a0.a {
    public final /* synthetic */ dc3 b;

    public xx2(dc3 dc3Var) {
        this.b = dc3Var;
    }

    @Override // xsna.y0a0.a
    public final boolean b() {
        dc3 dc3Var = this.b;
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
