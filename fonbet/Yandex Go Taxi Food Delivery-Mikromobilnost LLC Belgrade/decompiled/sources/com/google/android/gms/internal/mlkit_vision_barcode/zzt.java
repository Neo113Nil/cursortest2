package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new zzag();
    public String zza;
    public String zzb;
    public int zzc;

    public zzt(String str, String str2, int i) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 2, this.zza, false);
        bb1.g0(parcel, 3, this.zzb, false);
        int i2 = this.zzc;
        bb1.m0(4, parcel, 4);
        parcel.writeInt(i2);
        bb1.o0(parcel, n0);
    }

    public zzt() {
    }
}
