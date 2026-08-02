package com.google.android.gms.internal.mlkit_common;

import java.util.Iterator;

/* loaded from: classes11.dex */
final class zzao extends zzaj {
    public final transient zzai c;
    public final transient zzaf w;

    public zzao(zzai zzaiVar, zzaf zzafVar) {
        this.c = zzaiVar;
        this.w = zzafVar;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final int a(Object[] objArr) {
        return this.w.a(objArr);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection
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
