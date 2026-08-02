package com.google.gson.internal;

import defpackage.aqy;
import defpackage.zpy;
import java.util.AbstractSet;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class b extends AbstractSet {
    public final /* synthetic */ LinkedTreeMap a;

    public b(LinkedTreeMap linkedTreeMap) {
        this.a = linkedTreeMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zpy(this.a, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        LinkedTreeMap linkedTreeMap = this.a;
        aqy aqyVar = null;
        if (obj != null) {
            try {
                aqyVar = linkedTreeMap.a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (aqyVar != null) {
            linkedTreeMap.c(aqyVar, true);
        }
        return aqyVar != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size;
    }
}
