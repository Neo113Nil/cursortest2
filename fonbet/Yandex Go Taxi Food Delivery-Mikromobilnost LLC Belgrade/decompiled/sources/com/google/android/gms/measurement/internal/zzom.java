package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class zzom extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzom> CREATOR = new zzon();
    public final long zza;
    public byte[] zzb;
    public final String zzc;
    public final Bundle zzd;
    public final int zze;
    public final long zzf;
    public String zzg;

    public zzom(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.zza = j;
        this.zzb = bArr;
        this.zzc = str;
        this.zzd = bundle;
        this.zze = i;
        this.zzf = j2;
        this.zzg = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.m0(1, parcel, 8);
        parcel.writeLong(j);
        bb1.V(parcel, 2, this.zzb, false);
        bb1.g0(parcel, 3, this.zzc, false);
        bb1.U(parcel, 4, this.zzd, false);
        int i2 = this.zze;
        bb1.m0(5, parcel, 4);
        parcel.writeInt(i2);
        long j2 = this.zzf;
        bb1.m0(6, parcel, 8);
        parcel.writeLong(j2);
        bb1.g0(parcel, 7, this.zzg, false);
        bb1.o0(parcel, n0);
    }
}
