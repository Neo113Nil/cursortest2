package xsna;

import java.util.List;

/* compiled from: InternalPointerEvent.android.kt */
/* loaded from: classes11.dex */
public final class rkx {
    public final x500<xlb0> a;
    public final q5o b;
    public boolean c;

    public rkx(x500<xlb0> x500Var, q5o q5oVar) {
        this.a = x500Var;
        this.b = q5oVar;
    }

    public final boolean a(long j) {
        Object obj;
        List list = (List) this.b.b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (wlb0.g(((zlb0) obj).a, j)) {
                break;
            }
            i++;
        }
        zlb0 zlb0Var = (zlb0) obj;
        if (zlb0Var != null) {
            return zlb0Var.h;
        }
        return false;
    }
}
