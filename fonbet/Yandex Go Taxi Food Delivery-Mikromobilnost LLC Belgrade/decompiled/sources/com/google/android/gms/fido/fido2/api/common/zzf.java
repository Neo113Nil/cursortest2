package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fido.zzgx;
import defpackage.bb1;
import defpackage.ooc;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new zzg();
    private final zzgx zza;
    private final zzgx zzb;

    public zzf(zzgx zzgxVar, zzgx zzgxVar2) {
        this.zza = zzgxVar;
        this.zzb = zzgxVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzfVar = (zzf) obj;
        return ooc.m(this.zza, zzfVar.zza) && ooc.m(this.zzb, zzfVar.zzb);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzgx zzgxVar = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.V(parcel, 1, zzgxVar == null ? null : zzgxVar.n(), false);
        zzgx zzgxVar2 = this.zzb;
        bb1.V(parcel, 2, zzgxVar2 != null ? zzgxVar2.n() : null, false);
        bb1.o0(parcel, n0);
    }
}
