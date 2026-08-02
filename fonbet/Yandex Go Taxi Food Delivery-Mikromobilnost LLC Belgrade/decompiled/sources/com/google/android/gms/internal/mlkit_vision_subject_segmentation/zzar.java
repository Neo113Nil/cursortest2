package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import defpackage.n691;
import java.io.Serializable;

/* loaded from: classes11.dex */
final class zzar extends n691 implements Serializable {
    final Object zza;
    final Object zzb;

    public zzar(Object obj, l lVar) {
        super(false, 3);
        this.zza = obj;
        this.zzb = lVar;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zza;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zzb;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
