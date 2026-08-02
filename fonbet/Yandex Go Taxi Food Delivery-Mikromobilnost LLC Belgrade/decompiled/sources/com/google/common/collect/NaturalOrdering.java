package com.google.common.collect;

import java.io.Serializable;

/* loaded from: classes11.dex */
final class NaturalOrdering extends z implements Serializable {
    public static final NaturalOrdering a = new NaturalOrdering();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    @Override // com.google.common.collect.z
    public final z g() {
        return ReverseNaturalOrdering.a;
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
