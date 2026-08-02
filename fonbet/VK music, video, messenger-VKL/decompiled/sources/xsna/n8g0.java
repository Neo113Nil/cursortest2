package xsna;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: RequestTracker.java */
/* loaded from: classes12.dex */
public final class n8g0 {
    public final Set<f7g0> a = Collections.newSetFromMap(new WeakHashMap());
    public final HashSet b = new HashSet();
    public boolean c;

    public final boolean a(@Nullable f7g0 f7g0Var) {
        boolean z = true;
        if (f7g0Var == null) {
            return true;
        }
        boolean remove = this.a.remove(f7g0Var);
        if (!this.b.remove(f7g0Var) && !remove) {
            z = false;
        }
        if (z) {
            f7g0Var.clear();
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{numRequests=");
        sb.append(this.a.size());
        sb.append(", isPaused=");
        return n23.b(sb, this.c, "}");
    }
}
