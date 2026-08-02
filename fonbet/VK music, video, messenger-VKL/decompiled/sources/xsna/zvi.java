package xsna;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: CompoundOrdering.java */
/* loaded from: classes13.dex */
public final class zvi<T> extends yx80<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<? super T>[] comparators;

    public zvi(lt8 lt8Var, lt8 lt8Var2) {
        this.comparators = new Comparator[]{lt8Var, lt8Var2};
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int i = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = this.comparators;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i].compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zvi) {
            return Arrays.equals(this.comparators, ((zvi) obj).comparators);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.comparators);
    }

    public final String toString() {
        return i5s.a(new StringBuilder("Ordering.compound("), Arrays.toString(this.comparators), ")");
    }
}
