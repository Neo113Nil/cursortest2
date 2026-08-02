package com.google.common.collect;

import defpackage.y60;
import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes11.dex */
final class ComparatorOrdering<T> extends z implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<T> comparator;

    public ComparatorOrdering(y60 y60Var) {
        this.comparator = y60Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.comparator.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ComparatorOrdering) {
            return this.comparator.equals(((ComparatorOrdering) obj).comparator);
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
