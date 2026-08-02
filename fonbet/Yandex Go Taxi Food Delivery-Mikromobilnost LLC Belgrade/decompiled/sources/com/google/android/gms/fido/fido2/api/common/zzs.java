package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes11.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    private final List zza;

    public zzs(List list) {
        cvw.l(list);
        this.zza = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzsVar = (zzs) obj;
        return this.zza.containsAll(zzsVar.zza) && zzsVar.zza.containsAll(this.zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.zza)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.k0(parcel, 1, list, false);
        bb1.o0(parcel, n0);
    }
}
