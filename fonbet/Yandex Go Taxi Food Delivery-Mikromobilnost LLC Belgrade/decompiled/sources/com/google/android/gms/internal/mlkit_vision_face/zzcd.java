package com.google.android.gms.internal.mlkit_vision_face;

import defpackage.y5e;
import java.util.AbstractMap;

/* loaded from: classes11.dex */
final class zzcd extends zzbn {
    final /* synthetic */ zzce zza;

    public zzcd(zzce zzceVar) {
        this.zza = zzceVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        y5e.R(i, this.zza.x);
        zzce zzceVar = this.zza;
        int i2 = i + i;
        Object obj = zzceVar.w[i2];
        obj.getClass();
        Object obj2 = zzceVar.w[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.x;
    }
}
