package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes.dex */
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new zzde();
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final Bundle zzd;
    public final String zze;

    public zzdd(long j, long j2, boolean z, Bundle bundle, String str) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = z;
        this.zzd = bundle;
        this.zze = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.m0(1, parcel, 8);
        parcel.writeLong(j);
        long j2 = this.zzb;
        bb1.m0(2, parcel, 8);
        parcel.writeLong(j2);
        boolean z = this.zzc;
        bb1.m0(3, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        bb1.U(parcel, 7, this.zzd, false);
        bb1.g0(parcel, 8, this.zze, false);
        bb1.o0(parcel, n0);
    }
}
