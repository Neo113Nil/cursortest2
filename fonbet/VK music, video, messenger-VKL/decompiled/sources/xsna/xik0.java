package xsna;

import android.util.SparseArray;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: SparseArrayExt.kt */
/* loaded from: classes17.dex */
public final class xik0 extends qd<Object> {
    public final /* synthetic */ SparseArray<Object> b;

    public xik0(SparseArray<Object> sparseArray) {
        this.b = sparseArray;
    }

    @Override // xsna.qd, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return j5g.P(new yik0(this.b), obj);
    }

    @Override // xsna.qd, java.util.Collection, java.util.List
    public final boolean containsAll(Collection<?> collection) {
        Collection<?> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // xsna.qd
    public final int getSize() {
        return this.b.size();
    }

    @Override // xsna.qd, java.util.Collection
    public final boolean isEmpty() {
        return this.b.size() == 0;
    }

    @Override // xsna.qd, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<Object> iterator() {
        return new yik0(this.b).iterator();
    }
}
