package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
final class zzbn extends zzay {
    public final transient zzax c;
    public final transient Object[] w;
    public final transient int x = 1;

    public zzbn(zzax zzaxVar, Object[] objArr) {
        this.c = zzaxVar;
        this.w = objArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzaq
    public final int a(Object[] objArr) {
        zzav zzavVar = this.b;
        if (zzavVar == null) {
            zzavVar = new zzbm(this);
            this.b = zzavVar;
        }
        return zzavVar.a(objArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzaq, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzav zzavVar = this.b;
        if (zzavVar == null) {
            zzavVar = new zzbm(this);
            this.b = zzavVar;
        }
        return zzavVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.x;
    }
}
