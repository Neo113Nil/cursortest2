package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class m750 {
    public final List a;
    public final int b;

    public m750(List list, int i) {
        this.a = list;
        this.b = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        List list2 = list;
        if (!list2.isEmpty()) {
            int size = list2.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        vg10.m(b64.t(i, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '"), scc.e(list2), "'.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m750.class != obj.getClass()) {
            return false;
        }
        m750 m750Var = (m750) obj;
        return this.b == m750Var.b && jl40.l(this.a, m750Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationEventHistory(currentIndex=");
        sb.append(this.b);
        sb.append(", mergedHistory=");
        return unr0.t(sb, this.a, ')');
    }

    public m750() {
        this(EmptyList.a, -1);
    }
}
