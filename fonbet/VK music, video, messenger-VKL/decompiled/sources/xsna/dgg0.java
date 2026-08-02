package xsna;

import java.io.Serializable;

/* compiled from: ReverseOrdering.java */
/* loaded from: classes13.dex */
public final class dgg0<T> extends yx80<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final yx80<? super T> forwardOrder;

    public dgg0(yx80<? super T> yx80Var) {
        this.forwardOrder = yx80Var;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return this.forwardOrder.compare(t2, t);
    }

    @Override // xsna.yx80
    public final <S extends T> yx80<S> d() {
        return this.forwardOrder;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dgg0) {
            return this.forwardOrder.equals(((dgg0) obj).forwardOrder);
        }
        return false;
    }

    public final int hashCode() {
        return -this.forwardOrder.hashCode();
    }

    public final String toString() {
        return this.forwardOrder + ".reverse()";
    }
}
