package com.google.android.gms.internal.play_billing;

import defpackage.ny61;
import java.io.Serializable;

/* loaded from: classes11.dex */
public final class zzdh extends zzdi implements Serializable {
    public static final zzdh a = new zzdh(zzcd.a, zzcb.a);
    final zzce zza;
    final zzce zzb;

    public zzdh(zzce zzceVar, zzce zzceVar2) {
        this.zza = zzceVar;
        this.zzb = zzceVar2;
        if (zzceVar.a(zzceVar2) > 0 || zzceVar == zzcb.a || zzceVar2 == zzcd.a) {
            StringBuilder sb = new StringBuilder(16);
            zzceVar.b(sb);
            sb.append("..");
            zzceVar2.c(sb);
            ny61.g("Invalid range: ".concat(sb.toString()));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdh)) {
            return false;
        }
        zzdh zzdhVar = (zzdh) obj;
        return this.zza.equals(zzdhVar.zza) && this.zzb.equals(zzdhVar.zzb);
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        zzce zzceVar = this.zza;
        zzce zzceVar2 = this.zzb;
        StringBuilder sb = new StringBuilder(16);
        zzceVar.b(sb);
        sb.append("..");
        zzceVar2.c(sb);
        return sb.toString();
    }
}
