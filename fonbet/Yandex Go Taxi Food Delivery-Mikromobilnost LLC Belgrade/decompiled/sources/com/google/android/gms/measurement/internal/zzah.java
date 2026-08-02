package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;

/* loaded from: classes11.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new zzai();
    public String zza;
    public String zzb;
    public zzpl zzc;
    public long zzd;
    public boolean zze;
    public String zzf;
    public final zzbg zzg;
    public long zzh;
    public zzbg zzi;
    public final long zzj;
    public final zzbg zzk;

    public zzah(zzah zzahVar) {
        cvw.l(zzahVar);
        this.zza = zzahVar.zza;
        this.zzb = zzahVar.zzb;
        this.zzc = zzahVar.zzc;
        this.zzd = zzahVar.zzd;
        this.zze = zzahVar.zze;
        this.zzf = zzahVar.zzf;
        this.zzg = zzahVar.zzg;
        this.zzh = zzahVar.zzh;
        this.zzi = zzahVar.zzi;
        this.zzj = zzahVar.zzj;
        this.zzk = zzahVar.zzk;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 2, this.zza, false);
        bb1.g0(parcel, 3, this.zzb, false);
        bb1.f0(parcel, 4, this.zzc, i, false);
        long j = this.zzd;
        bb1.m0(5, parcel, 8);
        parcel.writeLong(j);
        boolean z = this.zze;
        bb1.m0(6, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        bb1.g0(parcel, 7, this.zzf, false);
        bb1.f0(parcel, 8, this.zzg, i, false);
        long j2 = this.zzh;
        bb1.m0(9, parcel, 8);
        parcel.writeLong(j2);
        bb1.f0(parcel, 10, this.zzi, i, false);
        long j3 = this.zzj;
        bb1.m0(11, parcel, 8);
        parcel.writeLong(j3);
        bb1.f0(parcel, 12, this.zzk, i, false);
        bb1.o0(parcel, n0);
    }

    public zzah(String str, String str2, zzpl zzplVar, long j, boolean z, String str3, zzbg zzbgVar, long j2, zzbg zzbgVar2, long j3, zzbg zzbgVar3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzplVar;
        this.zzd = j;
        this.zze = z;
        this.zzf = str3;
        this.zzg = zzbgVar;
        this.zzh = j2;
        this.zzi = zzbgVar2;
        this.zzj = j3;
        this.zzk = zzbgVar3;
    }
}
