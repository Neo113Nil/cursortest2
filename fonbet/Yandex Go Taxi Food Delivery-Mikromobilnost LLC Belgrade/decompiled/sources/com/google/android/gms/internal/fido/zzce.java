package com.google.android.gms.internal.fido;

import defpackage.mta1;
import java.util.Map;

/* loaded from: classes11.dex */
abstract class zzce extends zzcf {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = ((zzci) this).zza.get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.fido.zzcf, java.util.Collection, java.util.Set
    public final int hashCode() {
        return mta1.g(((zzci) this).zza.entrySet());
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    public final boolean j() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((zzci) this).zza.size();
    }
}
