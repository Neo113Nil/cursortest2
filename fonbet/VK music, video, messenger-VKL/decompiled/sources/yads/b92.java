package yads;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes10.dex */
public final class b92 {
    public final d4 a;
    public final v9 b;
    public final List c;
    public final e51 d;

    public /* synthetic */ b92(d4 d4Var, v9 v9Var, List list) {
        this(d4Var, v9Var, list, new e51());
    }

    public final boolean a() {
        if (!this.a.m) {
            return false;
        }
        if (!this.b.B) {
            return true;
        }
        Set a = this.d.a(this.c);
        if (a.isEmpty()) {
            return false;
        }
        Iterator it = a.iterator();
        while (it.hasNext()) {
            if (!((x41) it.next()).f) {
                return true;
            }
        }
        return false;
    }

    public b92(d4 d4Var, v9 v9Var, List list, e51 e51Var) {
        this.a = d4Var;
        this.b = v9Var;
        this.c = list;
        this.d = e51Var;
    }
}
