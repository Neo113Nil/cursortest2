package com.google.android.gms.internal.play_billing;

import defpackage.ny61;
import defpackage.oyr;
import defpackage.s8o;
import defpackage.xta1;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public abstract class zzcr implements Map, Serializable {
    public transient zzcv a;
    public transient zzcv b;
    public transient zzcj c;

    public static void a(zzkn zzknVar, zzkn zzknVar2, zzkn zzknVar3) {
        s8o.X(zzknVar, "com.android.vending.billing.PURCHASES_UPDATED");
        s8o.X(zzknVar2, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        s8o.X(zzknVar3, "com.android.vending.billing.ALTERNATIVE_BILLING");
        zzdp.b(3, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", zzknVar, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", zzknVar2, "com.android.vending.billing.ALTERNATIVE_BILLING", zzknVar3}, null);
    }

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
        zzcj zzcjVar = this.c;
        if (zzcjVar == null) {
            zzdp zzdpVar = (zzdp) this;
            zzdo zzdoVar = new zzdo(1, zzdpVar.y, zzdpVar.x);
            this.c = zzdoVar;
            zzcjVar = zzdoVar;
        }
        return zzcjVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        zzcv zzcvVar = this.a;
        if (zzcvVar != null) {
            return zzcvVar;
        }
        zzdp zzdpVar = (zzdp) this;
        zzdm zzdmVar = new zzdm(zzdpVar, zzdpVar.x, zzdpVar.y);
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
            zzdm zzdmVar = new zzdm(zzdpVar, zzdpVar.x, zzdpVar.y);
            this.a = zzdmVar;
            zzcvVar = zzdmVar;
        }
        return xta1.c(zzcvVar);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        zzcv zzcvVar = this.b;
        if (zzcvVar != null) {
            return zzcvVar;
        }
        zzdp zzdpVar = (zzdp) this;
        zzdn zzdnVar = new zzdn(zzdpVar, new zzdo(0, zzdpVar.y, zzdpVar.x));
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
        zzcj zzcjVar = this.c;
        if (zzcjVar != null) {
            return zzcjVar;
        }
        zzdp zzdpVar = (zzdp) this;
        zzdo zzdoVar = new zzdo(1, zzdpVar.y, zzdpVar.x);
        this.c = zzdoVar;
        return zzdoVar;
    }
}
