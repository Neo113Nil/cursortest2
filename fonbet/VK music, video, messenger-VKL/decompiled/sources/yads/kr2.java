package yads;

import java.io.Serializable;

/* loaded from: classes10.dex */
public final class kr2 extends tb2 implements Serializable {
    public static final kr2 b = new kr2();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return b;
    }

    @Override // yads.tb2
    public final tb2 a() {
        return a92.b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
