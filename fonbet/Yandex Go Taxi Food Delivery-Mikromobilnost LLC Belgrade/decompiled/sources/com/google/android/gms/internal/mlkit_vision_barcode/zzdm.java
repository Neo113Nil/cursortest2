package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
final class zzdm extends zzcv {
    public final transient zzcu c;
    public final transient Object[] w;
    public final transient int x = 1;

    public zzdm(zzcu zzcuVar, Object[] objArr) {
        this.c = zzcuVar;
        this.w = objArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    public final int a(int i, Object[] objArr) {
        zzcs zzcsVar = this.b;
        if (zzcsVar == null) {
            zzcsVar = new zzdl(this);
            this.b = zzcsVar;
        }
        return zzcsVar.a(i, objArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn, java.util.AbstractCollection, java.util.Collection
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
        zzcs zzcsVar = this.b;
        if (zzcsVar == null) {
            zzcsVar = new zzdl(this);
            this.b = zzcsVar;
        }
        return zzcsVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.x;
    }
}
