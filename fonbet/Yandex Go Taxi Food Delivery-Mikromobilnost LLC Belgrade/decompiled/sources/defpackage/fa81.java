package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* loaded from: classes7.dex */
public final class fa81 extends q681 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.a.iterator();
        it.getClass();
        ag71 ag71Var = this.b;
        ag71Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (ag71Var.apply(next)) {
                return next;
            }
        }
        ny61.p();
        return null;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new fa81(((SortedSet) this.a).headSet(obj), this.b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.a;
        while (true) {
            Object last = sortedSet.last();
            if (this.b.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new fa81(((SortedSet) this.a).subSet(obj, obj2), this.b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new fa81(((SortedSet) this.a).tailSet(obj), this.b);
    }
}
