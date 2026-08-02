package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

@Deprecated
/* loaded from: classes11.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();
    String zza;
    String zzb;
    String zzc;
    String zzd;
    String zze;
    String zzf;
    String zzg;
    String zzh;
    String zzi;
    boolean zzj;
    String zzk;

    public zza(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = str9;
        this.zzj = z;
        this.zzk = str10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 2, this.zza, false);
        bb1.g0(parcel, 3, this.zzb, false);
        bb1.g0(parcel, 4, this.zzc, false);
        bb1.g0(parcel, 5, this.zzd, false);
        bb1.g0(parcel, 6, this.zze, false);
        bb1.g0(parcel, 7, this.zzf, false);
        bb1.g0(parcel, 8, this.zzg, false);
        bb1.g0(parcel, 9, this.zzh, false);
        bb1.g0(parcel, 10, this.zzi, false);
        boolean z = this.zzj;
        bb1.m0(11, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        bb1.g0(parcel, 12, this.zzk, false);
        bb1.o0(parcel, n0);
    }

    public zza() {
    }
}
