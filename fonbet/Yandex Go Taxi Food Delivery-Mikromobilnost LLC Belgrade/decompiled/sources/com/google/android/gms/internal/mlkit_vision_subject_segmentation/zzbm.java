package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import defpackage.bvf0;
import java.util.AbstractMap;

/* loaded from: classes11.dex */
final class zzbm extends zzav {
    final /* synthetic */ zzbn zza;

    public zzbm(zzbn zzbnVar) {
        this.zza = zzbnVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        bvf0.d0(i, this.zza.x);
        zzbn zzbnVar = this.zza;
        int i2 = i + i;
        Object obj = zzbnVar.w[i2];
        obj.getClass();
        Object obj2 = zzbnVar.w[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.x;
    }
}
