package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import yads.i;
import yads.o31;
import yads.uw1;
import yads.y;

/* loaded from: classes7.dex */
public class kr71 extends tm71 {
    public final transient Map c;
    public final /* synthetic */ y w;

    public kr71(y yVar, Map map) {
        this.w = yVar;
        this.c = map;
    }

    public final o31 a(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        i iVar = (i) this.w;
        iVar.getClass();
        List list = (List) collection;
        return new o31(key, list instanceof RandomAccess ? new ab81(iVar, key, list, null) : new er81(iVar, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        y yVar = this.w;
        Map map = yVar.w;
        Map map2 = this.c;
        if (map2 == map) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((Collection) it.next()).clear();
            }
            yVar.w.clear();
            yVar.x = 0;
            return;
        }
        Iterator it2 = map2.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Collection collection = (Collection) entry.getValue();
            a(entry);
            if (!(collection != null)) {
                ny61.r("no calls to next() since the last call to remove()");
                return;
            } else {
                it2.remove();
                yVar.x -= collection.size();
                collection.clear();
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        i iVar = (i) this.w;
        iVar.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new ab81(iVar, obj, list, null) : new er81(iVar, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        y yVar = this.w;
        y081 y081Var = yVar.a;
        if (y081Var != null) {
            return y081Var;
        }
        uw1 uw1Var = (uw1) yVar;
        Map map = uw1Var.w;
        y081 g881Var = map instanceof NavigableMap ? new g881(uw1Var, (NavigableMap) uw1Var.w) : map instanceof SortedMap ? new gh81(uw1Var, (SortedMap) uw1Var.w) : new y081(uw1Var, uw1Var.w);
        yVar.a = g881Var;
        return g881Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.c.remove(obj);
        if (collection == null) {
            return null;
        }
        y yVar = this.w;
        List list = (List) ((uw1) yVar).y.get();
        list.addAll(collection);
        yVar.x -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.c.toString();
    }
}
