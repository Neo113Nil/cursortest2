package xsna;

import java.io.Serializable;

/* compiled from: NaturalOrdering.java */
/* loaded from: classes13.dex */
public final class hw50 extends yx80<Comparable<?>> implements Serializable {
    public static final hw50 b = new hw50();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    @Override // xsna.yx80
    public final <S extends Comparable<?>> yx80<S> d() {
        return bgg0.b;
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
