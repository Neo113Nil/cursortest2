package com.google.android.gms.internal.mlkit_vision_face;

import defpackage.n691;
import java.io.Serializable;

/* loaded from: classes11.dex */
final class zzbj extends n691 implements Serializable {
    final Object zza;
    final Object zzb;

    public zzbj(Object obj, f fVar) {
        super(false, 1);
        this.zza = obj;
        this.zzb = fVar;
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
