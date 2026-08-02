package com.google.common.collect;

import java.io.Serializable;

/* loaded from: classes11.dex */
final class ReverseOrdering<T> extends z implements Serializable {
    private static final long serialVersionUID = 0;
    final z forwardOrder;

    public ReverseOrdering(z zVar) {
        this.forwardOrder = zVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.forwardOrder.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReverseOrdering) {
            return this.forwardOrder.equals(((ReverseOrdering) obj).forwardOrder);
        }
        return false;
    }

    @Override // com.google.common.collect.z
    public final z g() {
        return this.forwardOrder;
    }

    public final int hashCode() {
        return -this.forwardOrder.hashCode();
    }

    public final String toString() {
        return this.forwardOrder + ".reverse()";
    }
}
