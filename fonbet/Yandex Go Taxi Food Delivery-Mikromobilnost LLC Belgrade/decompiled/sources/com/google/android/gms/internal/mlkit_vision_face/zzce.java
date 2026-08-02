package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
final class zzce extends zzbq {
    public final transient zzbp c;
    public final transient Object[] w;
    public final transient int x = 1;

    public zzce(zzbp zzbpVar, Object[] objArr) {
        this.c = zzbpVar;
        this.w = objArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int a(Object[] objArr) {
        zzbn zzbnVar = this.b;
        if (zzbnVar == null) {
            zzbnVar = new zzcd(this);
            this.b = zzbnVar;
        }
        return zzbnVar.a(objArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi, java.util.AbstractCollection, java.util.Collection
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
        zzbn zzbnVar = this.b;
        if (zzbnVar == null) {
            zzbnVar = new zzcd(this);
            this.b = zzbnVar;
        }
        return zzbnVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.x;
    }
}
