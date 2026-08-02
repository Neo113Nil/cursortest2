package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class n001 {
    public final xzz0 a;
    public final ImmutableList b;

    static {
        tw21.Q(0);
        tw21.Q(1);
    }

    public n001(xzz0 xzz0Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= xzz0Var.a)) {
            ny61.s();
            throw null;
        }
        this.a = xzz0Var;
        this.b = ImmutableList.l(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n001.class == obj.getClass()) {
            n001 n001Var = (n001) obj;
            if (this.a.equals(n001Var.a) && this.b.equals(n001Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
