package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
final class zzcg extends zzbn {
    public final transient zzbm c;
    public final transient Object[] w;
    public final transient int x = 1;

    public zzcg(zzbm zzbmVar, Object[] objArr) {
        this.c = zzbmVar;
        this.w = objArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    public final int a(Object[] objArr) {
        zzbk zzbkVar = this.b;
        if (zzbkVar == null) {
            zzbkVar = new zzcf(this);
            this.b = zzbkVar;
        }
        return zzbkVar.a(objArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf, java.util.AbstractCollection, java.util.Collection
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
        zzbk zzbkVar = this.b;
        if (zzbkVar == null) {
            zzbkVar = new zzcf(this);
            this.b = zzbkVar;
        }
        return zzbkVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.x;
    }
}
