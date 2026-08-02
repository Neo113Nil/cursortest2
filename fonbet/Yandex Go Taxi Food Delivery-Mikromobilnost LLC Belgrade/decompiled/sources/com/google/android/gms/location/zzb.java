package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;

/* loaded from: classes11.dex */
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new zzc();
    private final long zza;
    private final boolean zzb;
    private final WorkSource zzc;
    private final String zzd;
    private final int[] zze;
    private final boolean zzf;
    private final String zzg;
    private final long zzh;
    private String zzi;

    public zzb(long j, boolean z, WorkSource workSource, String str, int[] iArr, boolean z2, String str2, long j2, String str3) {
        this.zza = j;
        this.zzb = z;
        this.zzc = workSource;
        this.zzd = str;
        this.zze = iArr;
        this.zzf = z2;
        this.zzg = str2;
        this.zzh = j2;
        this.zzi = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cvw.l(parcel);
        int n0 = bb1.n0(parcel, 20293);
        long j = this.zza;
        bb1.m0(1, parcel, 8);
        parcel.writeLong(j);
        boolean z = this.zzb;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        bb1.f0(parcel, 3, this.zzc, i, false);
        bb1.g0(parcel, 4, this.zzd, false);
        bb1.b0(parcel, 5, this.zze, false);
        boolean z2 = this.zzf;
        bb1.m0(6, parcel, 4);
        parcel.writeInt(z2 ? 1 : 0);
        bb1.g0(parcel, 7, this.zzg, false);
        long j2 = this.zzh;
        bb1.m0(8, parcel, 8);
        parcel.writeLong(j2);
        bb1.g0(parcel, 9, this.zzi, false);
        bb1.o0(parcel, n0);
    }

    public final zzb zza(String str) {
        this.zzi = str;
        return this;
    }
}
