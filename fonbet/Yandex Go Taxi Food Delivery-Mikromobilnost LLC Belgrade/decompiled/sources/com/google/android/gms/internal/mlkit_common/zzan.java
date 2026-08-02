package com.google.android.gms.internal.mlkit_common;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
final class zzan extends zzaj {
    public final transient zzai c;
    public final transient Object[] w;
    public final transient int x;

    public zzan(zzai zzaiVar, Object[] objArr, int i) {
        this.c = zzaiVar;
        this.w = objArr;
        this.x = i;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final int a(Object[] objArr) {
        zzaf zzafVar = this.b;
        if (zzafVar == null) {
            zzafVar = new zzam(this);
            this.b = zzafVar;
        }
        return zzafVar.a(objArr);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection
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
        zzaf zzafVar = this.b;
        if (zzafVar == null) {
            zzafVar = new zzam(this);
            this.b = zzafVar;
        }
        return zzafVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.x;
    }
}
