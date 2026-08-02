package defpackage;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
import yads.y;

/* loaded from: classes7.dex */
public final class g881 extends gh81 implements NavigableSet {
    public final /* synthetic */ y w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g881(y yVar, NavigableMap navigableMap) {
        super(yVar, navigableMap);
        this.w = yVar;
    }

    @Override // defpackage.gh81
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final NavigableMap a() {
        return (NavigableMap) ((SortedMap) this.a);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return a().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((y081) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new g881(this.w, a().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return a().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new g881(this.w, a().headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return a().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return a().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        po71 po71Var = (po71) iterator();
        if (!po71Var.b.hasNext()) {
            return null;
        }
        Object next = po71Var.next();
        po71Var.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        po71 po71Var = (po71) ((y081) descendingSet()).iterator();
        if (!po71Var.b.hasNext()) {
            return null;
        }
        Object next = po71Var.next();
        po71Var.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new g881(this.w, a().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new g881(this.w, a().tailMap(obj, z));
    }

    @Override // defpackage.gh81, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // defpackage.gh81, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // defpackage.gh81, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
