package xsna;

import java.io.Serializable;

/* compiled from: ReverseNaturalOrdering.java */
/* loaded from: classes13.dex */
public final class bgg0 extends yx80<Comparable<?>> implements Serializable {
    public static final bgg0 b = new bgg0();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return b;
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

    @Override // xsna.yx80
    public final <S extends Comparable<?>> yx80<S> d() {
        return hw50.b;
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
