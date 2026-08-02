package yads;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes10.dex */
public final class ey extends tb2 implements Serializable {
    private static final long serialVersionUID = 0;
    public final Comparator b;

    public ey(Comparator comparator) {
        this.b = (Comparator) oh2.a(comparator);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.b.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ey) {
            return this.b.equals(((ey) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }
}
