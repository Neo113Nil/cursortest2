package yads;

import java.io.Serializable;

/* loaded from: classes10.dex */
public final class a92 extends tb2 implements Serializable {
    public static final a92 b = new a92();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return b;
    }

    @Override // yads.tb2
    public final tb2 a() {
        return kr2.b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
