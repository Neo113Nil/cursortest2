package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import defpackage.cw00;
import defpackage.ujb1;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes11.dex */
public final class g extends AbstractMap {
    public transient e a;
    public transient cw00 b;
    public final transient Map c;
    public final /* synthetic */ zzw w;

    public g(zzw zzwVar, Map map) {
        this.w = zzwVar;
        this.c = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.w.c;
        if (this.c != map) {
            f fVar = new f(this);
            while (fVar.hasNext()) {
                fVar.next();
                fVar.remove();
            }
            return;
        }
        zzal zzalVar = (zzal) map;
        Iterator it = zzalVar.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        zzalVar.clear();
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
        e eVar = this.a;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.a = eVar2;
        return eVar2;
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
        zzl zzlVar = (zzl) this.w;
        zzlVar.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new ujb1(zzlVar, obj, list, null) : new l(zzlVar, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        zzw zzwVar = this.w;
        h hVar = zzwVar.a;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(zzwVar, zzwVar.c);
        zzwVar.a = hVar2;
        return hVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.c.remove(obj);
        if (collection == null) {
            return null;
        }
        ((zzz) this.w).getClass();
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
        cw00 cw00Var2 = new cw00(this, 4);
        this.b = cw00Var2;
        return cw00Var2;
    }
}
