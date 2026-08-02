package com.google.android.gms.internal.mlkit_vision_barcode;

import defpackage.ny61;
import defpackage.oyr;
import defpackage.sta1;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public abstract class zzcu implements Map, Serializable {
    public transient zzcv a;
    public transient zzcv b;
    public transient zzcn c;

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
        zzcn zzcnVar = this.c;
        if (zzcnVar == null) {
            zzdo zzdoVar = new zzdo(1, ((zzdp) this).w);
            this.c = zzdoVar;
            zzcnVar = zzdoVar;
        }
        return zzcnVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        zzcv zzcvVar = this.a;
        if (zzcvVar != null) {
            return zzcvVar;
        }
        zzdp zzdpVar = (zzdp) this;
        zzdm zzdmVar = new zzdm(zzdpVar, zzdpVar.w);
        this.a = zzdmVar;
        return zzdmVar;
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
        zzcv zzcvVar = this.a;
        if (zzcvVar == null) {
            zzdp zzdpVar = (zzdp) this;
            zzdm zzdmVar = new zzdm(zzdpVar, zzdpVar.w);
            this.a = zzdmVar;
            zzcvVar = zzdmVar;
        }
        return sta1.c(zzcvVar);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        zzcv zzcvVar = this.b;
        if (zzcvVar != null) {
            return zzcvVar;
        }
        zzdp zzdpVar = (zzdp) this;
        zzdn zzdnVar = new zzdn(zzdpVar, new zzdo(0, zzdpVar.w));
        this.b = zzdnVar;
        return zzdnVar;
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
        zzcn zzcnVar = this.c;
        if (zzcnVar != null) {
            return zzcnVar;
        }
        zzdo zzdoVar = new zzdo(1, ((zzdp) this).w);
        this.c = zzdoVar;
        return zzdoVar;
    }
}
