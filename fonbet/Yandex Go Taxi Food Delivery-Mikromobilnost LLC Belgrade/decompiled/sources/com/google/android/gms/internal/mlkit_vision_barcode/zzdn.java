package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Iterator;

/* loaded from: classes11.dex */
final class zzdn extends zzcv {
    public final transient zzcu c;
    public final transient zzcs w;

    public zzdn(zzcu zzcuVar, zzcs zzcsVar) {
        this.c = zzcuVar;
        this.w = zzcsVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    public final int a(int i, Object[] objArr) {
        return this.w.a(i, objArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.w.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }
}
