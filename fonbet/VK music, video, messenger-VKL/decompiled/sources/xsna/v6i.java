package xsna;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: ComparatorOrdering.java */
/* loaded from: classes13.dex */
public final class v6i<T> extends yx80<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<T> comparator;

    public v6i(Comparator<T> comparator) {
        comparator.getClass();
        this.comparator = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return this.comparator.compare(t, t2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v6i) {
            return this.comparator.equals(((v6i) obj).comparator);
        }
        return false;
    }

    public final int hashCode() {
        return this.comparator.hashCode();
    }

    public final String toString() {
        return this.comparator.toString();
    }
}
