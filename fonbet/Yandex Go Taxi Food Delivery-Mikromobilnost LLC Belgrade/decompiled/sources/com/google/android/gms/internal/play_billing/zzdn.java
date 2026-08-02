package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* loaded from: classes11.dex */
final class zzdn extends zzcv {
    public final transient zzcr c;
    public final transient zzco w;

    public zzdn(zzcr zzcrVar, zzco zzcoVar) {
        this.c = zzcrVar;
        this.w = zzcoVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final int a(Object[] objArr) {
        return this.w.a(objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj
    public final zzco g() {
        return this.w;
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
