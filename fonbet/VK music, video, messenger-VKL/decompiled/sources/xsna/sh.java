package xsna;

import java.util.Iterator;
import java.util.Set;

/* compiled from: AbstractSet.kt */
/* loaded from: classes8.dex */
public abstract class sh<E> extends qd<E> implements Set<E> {
    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        return containsAll(set);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            E next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }
}
