package com.google.android.gms.internal.mlkit_vision_text_common;

import defpackage.ny61;
import defpackage.oyr;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public abstract class zzbm implements Map, Serializable {
    public transient zzbn a;
    public transient zzbn b;
    public transient zzbf c;

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
        zzbf zzbfVar = this.c;
        if (zzbfVar == null) {
            zzci zzciVar = new zzci(1, ((zzcj) this).w);
            this.c = zzciVar;
            zzbfVar = zzciVar;
        }
        return zzbfVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        zzbn zzbnVar = this.a;
        if (zzbnVar != null) {
            return zzbnVar;
        }
        zzcj zzcjVar = (zzcj) this;
        zzcg zzcgVar = new zzcg(zzcjVar, zzcjVar.w);
        this.a = zzcgVar;
        return zzcgVar;
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
        zzbn zzbnVar = this.a;
        if (zzbnVar == null) {
            zzcj zzcjVar = (zzcj) this;
            zzcg zzcgVar = new zzcg(zzcjVar, zzcjVar.w);
            this.a = zzcgVar;
            zzbnVar = zzcgVar;
        }
        Iterator it = zzbnVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        zzbn zzbnVar = this.b;
        if (zzbnVar != null) {
            return zzbnVar;
        }
        zzcj zzcjVar = (zzcj) this;
        zzch zzchVar = new zzch(zzcjVar, new zzci(0, zzcjVar.w));
        this.b = zzchVar;
        return zzchVar;
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
        zzbf zzbfVar = this.c;
        if (zzbfVar != null) {
            return zzbfVar;
        }
        zzci zzciVar = new zzci(1, ((zzcj) this).w);
        this.c = zzciVar;
        return zzciVar;
    }
}
