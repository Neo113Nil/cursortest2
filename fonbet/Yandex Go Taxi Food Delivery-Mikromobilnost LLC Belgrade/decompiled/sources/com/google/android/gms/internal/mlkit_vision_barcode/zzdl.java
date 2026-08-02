package com.google.android.gms.internal.mlkit_vision_barcode;

import defpackage.qke;
import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes11.dex */
final class zzdl extends zzcs {
    final /* synthetic */ zzdm zza;

    public zzdl(zzdm zzdmVar) {
        this.zza = zzdmVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        qke.F(i, this.zza.x);
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
