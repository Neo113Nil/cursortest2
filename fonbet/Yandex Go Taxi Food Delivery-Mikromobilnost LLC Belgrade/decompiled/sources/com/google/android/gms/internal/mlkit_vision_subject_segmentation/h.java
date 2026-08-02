package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import defpackage.po71;
import defpackage.s4r0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class h extends s4r0 {
    public final Map b;
    public final /* synthetic */ zzw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(zzw zzwVar, Map map) {
        super(1);
        this.c = zzwVar;
        map.getClass();
        this.b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            po71 po71Var = (po71) it;
            if (!po71Var.hasNext()) {
                return;
            }
            po71Var.next();
            po71Var.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.b.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.b.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.b.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new po71(this, this.b.entrySet().iterator(), 7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.b.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.c.getClass();
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.size();
    }
}
