package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class zzya extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzya> CREATOR = new zzyt();
    private final String zza;
    private final String zzb;
    private final int zzc;

    public zzya(String str, String str2, int i) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 1, str, false);
        bb1.g0(parcel, 2, this.zzb, false);
        int i2 = this.zzc;
        bb1.m0(3, parcel, 4);
        parcel.writeInt(i2);
        bb1.o0(parcel, n0);
    }

    public final int zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }
}
