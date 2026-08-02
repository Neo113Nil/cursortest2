package com.google.android.gms.internal.mlkit_vision_text_common;

import defpackage.cw00;
import defpackage.j591;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes11.dex */
public final class c extends AbstractMap {
    public transient a a;
    public transient cw00 b;
    public final transient Map c;
    public final /* synthetic */ zzal w;

    public c(zzal zzalVar, Map map) {
        this.w = zzalVar;
        this.c = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.w.c;
        if (this.c != map) {
            b bVar = new b(this);
            while (bVar.hasNext()) {
                bVar.next();
                bVar.remove();
            }
            return;
        }
        zzba zzbaVar = (zzba) map;
        Iterator it = zzbaVar.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        zzbaVar.clear();
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
        a aVar = this.a;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.a = aVar2;
        return aVar2;
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
        zzaa zzaaVar = (zzaa) this.w;
        zzaaVar.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new j591(zzaaVar, obj, list, null) : new e(zzaaVar, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        zzal zzalVar = this.w;
        d dVar = zzalVar.a;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(zzalVar, zzalVar.c);
        zzalVar.a = dVar2;
        return dVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.c.remove(obj);
        if (collection == null) {
            return null;
        }
        ((zzao) this.w).getClass();
        ArrayList arrayList = new ArrayList(3);
        arrayList.addAll(collection);
        collection.size();
        collection.clear();
        return arrayList;
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
        cw00 cw00Var2 = new cw00(this, 6);
        this.b = cw00Var2;
        return cw00Var2;
    }
}
