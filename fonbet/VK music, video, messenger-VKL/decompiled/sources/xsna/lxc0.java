package xsna;

import java.io.Serializable;
import java.util.List;

/* compiled from: Predicates.java */
/* loaded from: classes13.dex */
public final class lxc0<T> implements jxc0<T>, Serializable {
    private static final long serialVersionUID = 0;
    private final List<? extends jxc0<? super T>> components;

    public lxc0() {
        throw null;
    }

    public lxc0(List list) {
        this.components = list;
    }

    @Override // xsna.jxc0
    public final boolean apply(T t) {
        for (int i = 0; i < this.components.size(); i++) {
            if (!this.components.get(i).apply(t)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lxc0) {
            return this.components.equals(((lxc0) obj).components);
        }
        return false;
    }

    public final int hashCode() {
        return this.components.hashCode() + 306654252;
    }

    public final String toString() {
        List<? extends jxc0<? super T>> list = this.components;
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (T t : list) {
            if (!z) {
                sb.append(',');
            }
            sb.append(t);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
