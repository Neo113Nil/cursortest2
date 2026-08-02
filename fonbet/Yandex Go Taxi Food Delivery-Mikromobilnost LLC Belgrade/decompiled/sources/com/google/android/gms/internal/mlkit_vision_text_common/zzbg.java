package com.google.android.gms.internal.mlkit_vision_text_common;

import defpackage.n691;
import java.io.Serializable;

/* loaded from: classes11.dex */
final class zzbg extends n691 implements Serializable {
    final Object zza;
    final Object zzb;

    public zzbg(Object obj, e eVar) {
        super(false, 0);
        this.zza = obj;
        this.zzb = eVar;
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
