package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import defpackage.ny61;
import defpackage.oyr;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public abstract class zzax implements Map, Serializable {
    public transient zzay a;
    public transient zzay b;
    public transient zzaq c;

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        zzaq zzaqVar = this.c;
        if (zzaqVar == null) {
            zzbp zzbpVar = new zzbp(1, ((zzbq) this).w);
            this.c = zzbpVar;
            zzaqVar = zzbpVar;
        }
        return zzaqVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        zzay zzayVar = this.a;
        if (zzayVar != null) {
            return zzayVar;
        }
        zzbq zzbqVar = (zzbq) this;
        zzbn zzbnVar = new zzbn(zzbqVar, zzbqVar.w);
        this.a = zzbnVar;
        return zzbnVar;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        zzay zzayVar = this.a;
        if (zzayVar == null) {
            zzbq zzbqVar = (zzbq) this;
            zzbn zzbnVar = new zzbn(zzbqVar, zzbqVar.w);
            this.a = zzbnVar;
            zzayVar = zzbnVar;
        }
        Iterator it = zzayVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        zzay zzayVar = this.b;
        if (zzayVar != null) {
            return zzayVar;
        }
        zzbq zzbqVar = (zzbq) this;
        zzbo zzboVar = new zzbo(zzbqVar, new zzbp(0, zzbqVar.w));
        this.b = zzboVar;
        return zzboVar;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            ny61.g(oyr.i(size, "size cannot be negative but was: "));
            return null;
        }
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(Extension.FIX_SPACE);
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        zzaq zzaqVar = this.c;
        if (zzaqVar != null) {
            return zzaqVar;
        }
        zzbp zzbpVar = new zzbp(1, ((zzbq) this).w);
        this.c = zzbpVar;
        return zzbpVar;
    }
}
