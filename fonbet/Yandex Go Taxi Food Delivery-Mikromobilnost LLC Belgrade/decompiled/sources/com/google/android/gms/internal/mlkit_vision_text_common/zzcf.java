package com.google.android.gms.internal.mlkit_vision_text_common;

import defpackage.vez0;
import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes11.dex */
final class zzcf extends zzbk {
    final /* synthetic */ zzcg zza;

    public zzcf(zzcg zzcgVar) {
        this.zza = zzcgVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        vez0.k0(i, this.zza.x);
        int i2 = i + i;
        Object obj = this.zza.w[i2];
        Objects.requireNonNull(obj);
        Object obj2 = this.zza.w[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.x;
    }
}
