package com.google.android.gms.internal.mlkit_vision_face;

import defpackage.c691;
import defpackage.cw00;
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
    public final /* synthetic */ zzap w;

    public c(zzap zzapVar, Map map) {
        this.w = zzapVar;
        this.c = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzap zzapVar = this.w;
        Map map = zzapVar.c;
        if (this.c != map) {
            b bVar = new b(this);
            while (bVar.hasNext()) {
                bVar.next();
                bVar.remove();
            }
            return;
        }
        zzbd zzbdVar = (zzbd) map;
        Iterator it = zzbdVar.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        zzbdVar.clear();
        zzapVar.w = 0;
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
        zzae zzaeVar = (zzae) this.w;
        zzaeVar.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new c691(zzaeVar, obj, list, null) : new f(zzaeVar, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        zzap zzapVar = this.w;
        d dVar = zzapVar.a;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(zzapVar, zzapVar.c);
        zzapVar.a = dVar2;
        return dVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.c.remove(obj);
        if (collection == null) {
            return null;
        }
        zzap zzapVar = this.w;
        ((zzas) zzapVar).getClass();
        ArrayList arrayList = new ArrayList(3);
        arrayList.addAll(collection);
        zzapVar.w -= collection.size();
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
        cw00 cw00Var2 = new cw00(this, 5);
        this.b = cw00Var2;
        return cw00Var2;
    }
}
