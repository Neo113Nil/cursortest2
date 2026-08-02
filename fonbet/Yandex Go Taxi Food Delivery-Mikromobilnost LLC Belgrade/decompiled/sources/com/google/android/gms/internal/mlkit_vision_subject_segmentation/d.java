package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class d extends AbstractCollection {
    public final /* synthetic */ zzal a;

    public d(zzal zzalVar) {
        this.a = zzalVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzal zzalVar = this.a;
        Map a = zzalVar.a();
        return a != null ? a.values().iterator() : new a(zzalVar, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
