package com.google.android.gms.internal.mlkit_vision_common;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
final class zzw extends zzs {
    public final transient zzr c;
    public final transient Object[] w;
    public final transient int x = 1;

    public zzw(zzr zzrVar, Object[] objArr) {
        this.c = zzrVar;
        this.w = objArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final int a(Object[] objArr) {
        zzp zzpVar = this.b;
        if (zzpVar == null) {
            zzpVar = new zzv(this);
            this.b = zzpVar;
        }
        return zzpVar.a(objArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection
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
        zzp zzpVar = this.b;
        if (zzpVar == null) {
            zzpVar = new zzv(this);
            this.b = zzpVar;
        }
        return zzpVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.x;
    }
}
