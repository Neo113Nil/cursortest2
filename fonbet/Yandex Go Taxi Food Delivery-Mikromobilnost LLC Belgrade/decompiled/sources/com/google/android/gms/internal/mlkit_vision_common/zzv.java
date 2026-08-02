package com.google.android.gms.internal.mlkit_vision_common;

import defpackage.q5z;
import java.util.AbstractMap;

/* loaded from: classes11.dex */
final class zzv extends zzp {
    final /* synthetic */ zzw zza;

    public zzv(zzw zzwVar) {
        this.zza = zzwVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        q5z.p0(i, this.zza.x);
        zzw zzwVar = this.zza;
        int i2 = i + i;
        Object obj = zzwVar.w[i2];
        obj.getClass();
        Object obj2 = zzwVar.w[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.x;
    }
}
