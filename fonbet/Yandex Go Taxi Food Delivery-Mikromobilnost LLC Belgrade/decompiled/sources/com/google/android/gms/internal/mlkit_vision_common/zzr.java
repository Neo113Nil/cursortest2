package com.google.android.gms.internal.mlkit_vision_common;

import defpackage.ny61;
import defpackage.oyr;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public abstract class zzr implements Map, Serializable {
    public transient zzs a;
    public transient zzs b;
    public transient zzl c;

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
        zzl zzlVar = this.c;
        if (zzlVar == null) {
            zzy zzyVar = new zzy(1, ((zzz) this).w);
            this.c = zzyVar;
            zzlVar = zzyVar;
        }
        return zzlVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        zzs zzsVar = this.a;
        if (zzsVar != null) {
            return zzsVar;
        }
        zzz zzzVar = (zzz) this;
        zzw zzwVar = new zzw(zzzVar, zzzVar.w);
        this.a = zzwVar;
        return zzwVar;
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
        zzs zzsVar = this.a;
        if (zzsVar == null) {
            zzz zzzVar = (zzz) this;
            zzw zzwVar = new zzw(zzzVar, zzzVar.w);
            this.a = zzwVar;
            zzsVar = zzwVar;
        }
        Iterator it = zzsVar.iterator();
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
        zzs zzsVar = this.b;
        if (zzsVar != null) {
            return zzsVar;
        }
        zzz zzzVar = (zzz) this;
        zzx zzxVar = new zzx(zzzVar, new zzy(0, zzzVar.w));
        this.b = zzxVar;
        return zzxVar;
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
        zzl zzlVar = this.c;
        if (zzlVar != null) {
            return zzlVar;
        }
        zzy zzyVar = new zzy(1, ((zzz) this).w);
        this.c = zzyVar;
        return zzyVar;
    }
}
