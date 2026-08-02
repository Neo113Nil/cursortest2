package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes10.dex */
public class n extends sj1 {
    public final transient Map d;
    public final /* synthetic */ a0 e;

    public n(a0 a0Var, Map map) {
        this.e = a0Var;
        this.d = map;
    }

    public final n51 a(Map.Entry entry) {
        Object key = entry.getKey();
        a0 a0Var = this.e;
        Collection collection = (Collection) entry.getValue();
        i iVar = (i) a0Var;
        iVar.getClass();
        List list = (List) collection;
        return new n51(key, list instanceof RandomAccess ? new t(iVar, key, list, null) : new z(iVar, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.d;
        a0 a0Var = this.e;
        Map map2 = a0Var.f;
        if (map != map2) {
            m mVar = new m(this);
            while (mVar.hasNext()) {
                mVar.next();
                mVar.remove();
            }
            return;
        }
        Iterator it = map2.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        a0Var.f.clear();
        a0Var.g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.d;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.d.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.d;
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
        i iVar = (i) this.e;
        iVar.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new t(iVar, obj, list, null) : new z(iVar, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        a0 a0Var = this.e;
        q qVar = a0Var.c;
        if (qVar != null) {
            return qVar;
        }
        q c = ((ty1) a0Var).c();
        a0Var.c = c;
        return c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.d.remove(obj);
        if (collection == null) {
            return null;
        }
        List list = (List) ((ty1) this.e).h.get();
        list.addAll(collection);
        this.e.g -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.d.toString();
    }
}
