package com.google.android.gms.internal.mlkit_vision_face;

import defpackage.ny61;
import defpackage.oyr;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public abstract class zzbp implements Map, Serializable {
    public transient zzbq a;
    public transient zzbq b;
    public transient zzbi c;

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
        zzbi zzbiVar = this.c;
        if (zzbiVar == null) {
            zzcg zzcgVar = new zzcg(1, ((zzch) this).w);
            this.c = zzcgVar;
            zzbiVar = zzcgVar;
        }
        return zzbiVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        zzbq zzbqVar = this.a;
        if (zzbqVar != null) {
            return zzbqVar;
        }
        zzch zzchVar = (zzch) this;
        zzce zzceVar = new zzce(zzchVar, zzchVar.w);
        this.a = zzceVar;
        return zzceVar;
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
        zzbq zzbqVar = this.a;
        if (zzbqVar == null) {
            zzch zzchVar = (zzch) this;
            zzce zzceVar = new zzce(zzchVar, zzchVar.w);
            this.a = zzceVar;
            zzbqVar = zzceVar;
        }
        Iterator it = zzbqVar.iterator();
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
        zzbq zzbqVar = this.b;
        if (zzbqVar != null) {
            return zzbqVar;
        }
        zzch zzchVar = (zzch) this;
        zzcf zzcfVar = new zzcf(zzchVar, new zzcg(0, zzchVar.w));
        this.b = zzcfVar;
        return zzcfVar;
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
        zzbi zzbiVar = this.c;
        if (zzbiVar != null) {
            return zzbiVar;
        }
        zzcg zzcgVar = new zzcg(1, ((zzch) this).w);
        this.c = zzcgVar;
        return zzcgVar;
    }
}
