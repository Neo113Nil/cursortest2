package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    public final zzr[] zza;
    public final zzf zzb;
    public final zzf zzc;
    public final zzf zzd;
    public final String zze;
    public final float zzf;
    public final String zzg;
    public final int zzh;
    public final boolean zzi;
    public final int zzj;
    public final int zzk;

    public zzl(zzr[] zzrVarArr, zzf zzfVar, zzf zzfVar2, zzf zzfVar3, String str, float f, String str2, int i, boolean z, int i2, int i3) {
        this.zza = zzrVarArr;
        this.zzb = zzfVar;
        this.zzc = zzfVar2;
        this.zzd = zzfVar3;
        this.zze = str;
        this.zzf = f;
        this.zzg = str2;
        this.zzh = i;
        this.zzi = z;
        this.zzj = i2;
        this.zzk = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzr[] zzrVarArr = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.j0(parcel, 2, zzrVarArr, i);
        bb1.f0(parcel, 3, this.zzb, i, false);
        bb1.f0(parcel, 4, this.zzc, i, false);
        bb1.f0(parcel, 5, this.zzd, i, false);
        bb1.g0(parcel, 6, this.zze, false);
        float f = this.zzf;
        bb1.m0(7, parcel, 4);
        parcel.writeFloat(f);
        bb1.g0(parcel, 8, this.zzg, false);
        int i2 = this.zzh;
        bb1.m0(9, parcel, 4);
        parcel.writeInt(i2);
        boolean z = this.zzi;
        bb1.m0(10, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        int i3 = this.zzj;
        bb1.m0(11, parcel, 4);
        parcel.writeInt(i3);
        int i4 = this.zzk;
        bb1.m0(12, parcel, 4);
        parcel.writeInt(i4);
        bb1.o0(parcel, n0);
    }
}
