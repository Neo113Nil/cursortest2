package yads;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes10.dex */
public final class qh2 implements ph2, Serializable {
    private static final long serialVersionUID = 0;
    public final List b;

    public qh2(List list) {
        this.b = list;
    }

    @Override // yads.ph2
    public final boolean apply(Object obj) {
        for (int i = 0; i < this.b.size(); i++) {
            if (!((ph2) this.b.get(i)).apply(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qh2) {
            return this.b.equals(((qh2) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.b;
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : list) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
