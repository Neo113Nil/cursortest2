package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import yads.i;
import yads.o31;
import yads.uw1;
import yads.y;

/* loaded from: classes7.dex */
public final class n481 extends de81 implements NavigableMap {
    public final /* synthetic */ y z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n481(y yVar, NavigableMap navigableMap) {
        super(yVar, navigableMap);
        this.z = yVar;
    }

    @Override // defpackage.de81
    public final SortedSet b() {
        return new g881(this.z, c());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = c().ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return a(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return c().ceilingKey(obj);
    }

    @Override // defpackage.de81
    /* renamed from: d */
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new n481(this.z, c().descendingMap());
    }

    @Override // defpackage.de81
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final NavigableMap c() {
        return (NavigableMap) ((SortedMap) this.c);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = c().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return a(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = c().floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return a(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return c().floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new n481(this.z, c().headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = c().higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return a(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return c().higherKey(obj);
    }

    @Override // defpackage.de81, defpackage.kr71, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = c().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return a(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = c().lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return a(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return c().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        kr71 kr71Var = ((sl71) entrySet()).a;
        Iterator it = kr71Var.c.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection collection = (Collection) entry.getValue();
        o31 a = kr71Var.a(entry);
        y yVar = this.z;
        List list = (List) ((uw1) yVar).y.get();
        list.addAll((Collection) a.c);
        if (!(collection != null)) {
            ny61.r("no calls to next() since the last call to remove()");
            return null;
        }
        it.remove();
        kr71Var.w.x -= collection.size();
        collection.clear();
        Object obj = a.b;
        ((i) yVar).getClass();
        return new o31(obj, Collections.unmodifiableList(list));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        kr71 kr71Var = ((sl71) ((tm71) descendingMap()).entrySet()).a;
        Iterator it = kr71Var.c.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection collection = (Collection) entry.getValue();
        o31 a = kr71Var.a(entry);
        y yVar = this.z;
        List list = (List) ((uw1) yVar).y.get();
        list.addAll((Collection) a.c);
        if (!(collection != null)) {
            ny61.r("no calls to next() since the last call to remove()");
            return null;
        }
        it.remove();
        kr71Var.w.x -= collection.size();
        collection.clear();
        Object obj = a.b;
        ((i) yVar).getClass();
        return new o31(obj, Collections.unmodifiableList(list));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new n481(this.z, c().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new n481(this.z, c().tailMap(obj, z));
    }

    @Override // defpackage.de81, java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // defpackage.de81, java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // defpackage.de81, java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
