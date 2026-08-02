package xsna;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: MergeList.kt */
/* loaded from: classes15.dex */
public final class x820<T> extends AbstractList<T> {
    public final LinkedList<List<T>> b = new LinkedList<>();

    public final void a(List<T> list) {
        this.b.add(list);
    }

    public final void b(T t) {
        a(Collections.singletonList(t));
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        Iterator<List<T>> it = this.b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            List<T> next = it.next();
            int i3 = i - i2;
            if (i3 < next.size()) {
                return next.get(i3);
            }
            i2 += next.size();
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        Iterator<T> it = this.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((List) it.next()).size();
        }
        return i;
    }
}
