package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Iterator;

/* loaded from: classes11.dex */
final class zzch extends zzbn {
    public final transient zzbm c;
    public final transient zzbk w;

    public zzch(zzbm zzbmVar, zzbk zzbkVar) {
        this.c = zzbmVar;
        this.w = zzbkVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    public final int a(Object[] objArr) {
        return this.w.a(objArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf, java.util.AbstractCollection, java.util.Collection
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
