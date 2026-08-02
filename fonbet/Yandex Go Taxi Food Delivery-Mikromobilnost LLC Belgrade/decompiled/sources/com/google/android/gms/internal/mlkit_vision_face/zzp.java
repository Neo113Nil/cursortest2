package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new zzq();
    public int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    public int zze;

    public zzp(int i, int i2, int i3, long j, int i4) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = j;
        this.zze = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int i2 = this.zza;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(i2);
        int i3 = this.zzb;
        bb1.m0(3, parcel, 4);
        parcel.writeInt(i3);
        int i4 = this.zzc;
        bb1.m0(4, parcel, 4);
        parcel.writeInt(i4);
        long j = this.zzd;
        bb1.m0(5, parcel, 8);
        parcel.writeLong(j);
        int i5 = this.zze;
        bb1.m0(6, parcel, 4);
        parcel.writeInt(i5);
        bb1.o0(parcel, n0);
    }

    public zzp() {
    }
}
