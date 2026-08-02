package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
final class zzdm extends zzcv {
    public final transient zzcr c;
    public final transient Object[] w;
    public final transient int x;

    public zzdm(zzcr zzcrVar, Object[] objArr, int i) {
        this.c = zzcrVar;
        this.w = objArr;
        this.x = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final int a(Object[] objArr) {
        return g().a(objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection
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
    public final /* synthetic */ Iterator iterator() {
        return g().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv
    public final zzco k() {
        return new zzdl(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.x;
    }
}
