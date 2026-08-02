package com.google.android.gms.internal.mlkit_vision_barcode;

import defpackage.n691;
import java.io.Serializable;

/* loaded from: classes11.dex */
final class zzco extends n691 implements Serializable {
    final Object zza;
    final Object zzb;

    public zzco(Object obj, Object obj2) {
        super(false, 2);
        this.zza = obj;
        this.zzb = obj2;
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
