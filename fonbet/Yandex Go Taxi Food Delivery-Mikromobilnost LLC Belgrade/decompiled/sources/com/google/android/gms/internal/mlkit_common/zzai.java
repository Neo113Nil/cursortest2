package com.google.android.gms.internal.mlkit_common;

import defpackage.ny61;
import defpackage.oyr;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public abstract class zzai implements Map, Serializable {
    public transient zzaj a;
    public transient zzaj b;
    public transient zzab c;

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
        zzab zzabVar = this.c;
        if (zzabVar == null) {
            zzaq zzaqVar = (zzaq) this;
            zzap zzapVar = new zzap(1, zzaqVar.y, zzaqVar.x);
            this.c = zzapVar;
            zzabVar = zzapVar;
        }
        return zzabVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        zzaj zzajVar = this.a;
        if (zzajVar != null) {
            return zzajVar;
        }
        zzaq zzaqVar = (zzaq) this;
        zzan zzanVar = new zzan(zzaqVar, zzaqVar.x, zzaqVar.y);
        this.a = zzanVar;
        return zzanVar;
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
        zzaj zzajVar = this.a;
        if (zzajVar == null) {
            zzaq zzaqVar = (zzaq) this;
            zzan zzanVar = new zzan(zzaqVar, zzaqVar.x, zzaqVar.y);
            this.a = zzanVar;
            zzajVar = zzanVar;
        }
        Iterator it = zzajVar.iterator();
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
        zzaj zzajVar = this.b;
        if (zzajVar != null) {
            return zzajVar;
        }
        zzaq zzaqVar = (zzaq) this;
        zzao zzaoVar = new zzao(zzaqVar, new zzap(0, zzaqVar.y, zzaqVar.x));
        this.b = zzaoVar;
        return zzaoVar;
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
        zzab zzabVar = this.c;
        if (zzabVar != null) {
            return zzabVar;
        }
        zzaq zzaqVar = (zzaq) this;
        zzap zzapVar = new zzap(1, zzaqVar.y, zzaqVar.x);
        this.c = zzapVar;
        return zzapVar;
    }
}
