package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public class b9j0 {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public final HashSet b = new HashSet();
    public boolean c;

    public final boolean a(e5j0 e5j0Var) {
        boolean z = true;
        if (e5j0Var == null) {
            return true;
        }
        boolean remove = this.a.remove(e5j0Var);
        if (!this.b.remove(e5j0Var) && !remove) {
            z = false;
        }
        if (z) {
            e5j0Var.clear();
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{numRequests=");
        sb.append(this.a.size());
        sb.append(", isPaused=");
        return x4e.i(sb, this.c, "}");
    }
}
