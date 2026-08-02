package com.google.common.collect;

import defpackage.cw00;
import defpackage.o8;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes11.dex */
public class d extends AbstractMap {
    public transient b a;
    public transient cw00 b;
    public final transient Map c;
    public final /* synthetic */ AbstractMapBasedMultimap w;

    public d(AbstractMapBasedMultimap abstractMapBasedMultimap, Map map) {
        this.w = abstractMapBasedMultimap;
        this.c = map;
    }

    public final AbstractMap.SimpleImmutableEntry a(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        AbstractListMultimap abstractListMultimap = (AbstractListMultimap) this.w;
        List list = (List) collection;
        return new AbstractMap.SimpleImmutableEntry(key, list instanceof RandomAccess ? new o8(abstractListMultimap, key, list, null) : new l(abstractListMultimap, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.w;
        if (this.c == abstractMapBasedMultimap.w) {
            abstractMapBasedMultimap.clear();
            return;
        }
        c cVar = new c(this);
        while (cVar.hasNext()) {
            cVar.next();
            cVar.remove();
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
    public final Set entrySet() {
        b bVar = this.a;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.a = bVar2;
        return bVar2;
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
        AbstractListMultimap abstractListMultimap = (AbstractListMultimap) this.w;
        List list = (List) collection;
        return list instanceof RandomAccess ? new o8(abstractListMultimap, obj, list, null) : new l(abstractListMultimap, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.w;
        Set set = abstractMapBasedMultimap.a;
        if (set != null) {
            return set;
        }
        Set g = abstractMapBasedMultimap.g();
        abstractMapBasedMultimap.a = g;
        return g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.c.remove(obj);
        if (collection == null) {
            return null;
        }
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.w;
        Collection f = abstractMapBasedMultimap.f();
        f.addAll(collection);
        abstractMapBasedMultimap.x -= collection.size();
        collection.clear();
        return f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.c.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        cw00 cw00Var = this.b;
        if (cw00Var != null) {
            return cw00Var;
        }
        cw00 cw00Var2 = new cw00(this, 0);
        this.b = cw00Var2;
        return cw00Var2;
    }
}
