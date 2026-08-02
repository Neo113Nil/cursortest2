package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import java.util.Iterator;

/* loaded from: classes11.dex */
final class zzbo extends zzay {
    public final transient zzax c;
    public final transient zzav w;

    public zzbo(zzax zzaxVar, zzav zzavVar) {
        this.c = zzaxVar;
        this.w = zzavVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzaq
    public final int a(Object[] objArr) {
        return this.w.a(objArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzaq, java.util.AbstractCollection, java.util.Collection
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
