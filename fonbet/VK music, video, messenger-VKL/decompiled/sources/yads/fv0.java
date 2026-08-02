package yads;

import android.net.Uri;
import java.util.List;

/* loaded from: classes10.dex */
public final class fv0 implements qc2 {
    public final qc2 a;
    public final List b;

    public fv0(e30 e30Var, List list) {
        this.a = e30Var;
        this.b = list;
    }

    @Override // yads.qc2
    public final Object a(Uri uri, r30 r30Var) {
        ev0 ev0Var = (ev0) this.a.a(uri, r30Var);
        List list = this.b;
        if (list == null || list.isEmpty()) {
            return ev0Var;
        }
        return ((c30) ev0Var).a(this.b);
    }
}
