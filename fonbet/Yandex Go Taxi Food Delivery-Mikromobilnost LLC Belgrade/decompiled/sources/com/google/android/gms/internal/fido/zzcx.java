package com.google.android.gms.internal.fido;

import java.io.Serializable;

/* loaded from: classes11.dex */
final class zzcx extends d implements Serializable {
    final d zza;

    public zzcx(d dVar) {
        this.zza = dVar;
    }

    @Override // com.google.android.gms.internal.fido.d
    public final d a() {
        return this.zza;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcx) {
            return this.zza.equals(((zzcx) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }
}
