package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class zzvh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvh> CREATOR = new zzvi();
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final boolean zzd;
    private final int zze;
    private final String zzf;
    private final boolean zzg;

    public zzvh(String str, String str2, String str3, boolean z, int i, String str4, boolean z2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzf = str4;
        this.zze = i;
        this.zzd = z;
        this.zzg = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 1, str, false);
        bb1.g0(parcel, 2, this.zzb, false);
        bb1.g0(parcel, 3, this.zzc, false);
        boolean z = this.zzd;
        bb1.m0(4, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        int i2 = this.zze;
        bb1.m0(5, parcel, 4);
        parcel.writeInt(i2);
        bb1.g0(parcel, 6, this.zzf, false);
        boolean z2 = this.zzg;
        bb1.m0(7, parcel, 4);
        parcel.writeInt(z2 ? 1 : 0);
        bb1.o0(parcel, n0);
    }
}
