package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new zzac();
    private final long zza;

    public zzab(long j) {
        this.zza = Long.valueOf(j).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzab) && this.zza == ((zzab) obj).zza;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.m0(1, parcel, 8);
        parcel.writeLong(j);
        bb1.o0(parcel, n0);
    }
}
