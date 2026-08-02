package com.google.android.gms.internal.mlkit_vision_common;

import java.util.Iterator;

/* loaded from: classes11.dex */
final class zzx extends zzs {
    public final transient zzr c;
    public final transient zzp w;

    public zzx(zzr zzrVar, zzp zzpVar) {
        this.c = zzrVar;
        this.w = zzpVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final int a(Object[] objArr) {
        return this.w.a(objArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection
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
