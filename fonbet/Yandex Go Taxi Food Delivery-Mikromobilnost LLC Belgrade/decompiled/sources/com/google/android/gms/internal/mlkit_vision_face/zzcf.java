package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Iterator;

/* loaded from: classes11.dex */
final class zzcf extends zzbq {
    public final transient zzbp c;
    public final transient zzbn w;

    public zzcf(zzbp zzbpVar, zzbn zzbnVar) {
        this.c = zzbpVar;
        this.w = zzbnVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int a(Object[] objArr) {
        return this.w.a(objArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.w.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c.size();
    }
}
