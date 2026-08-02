package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    public final zzn[] zza;
    public final zzf zzb;
    public final zzf zzc;
    public final String zzd;
    public final float zze;
    public final String zzf;
    public final boolean zzg;

    public zzr(zzn[] zznVarArr, zzf zzfVar, zzf zzfVar2, String str, float f, String str2, boolean z) {
        this.zza = zznVarArr;
        this.zzb = zzfVar;
        this.zzc = zzfVar2;
        this.zzd = str;
        this.zze = f;
        this.zzf = str2;
        this.zzg = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzn[] zznVarArr = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.j0(parcel, 2, zznVarArr, i);
        bb1.f0(parcel, 3, this.zzb, i, false);
        bb1.f0(parcel, 4, this.zzc, i, false);
        bb1.g0(parcel, 5, this.zzd, false);
        float f = this.zze;
        bb1.m0(6, parcel, 4);
        parcel.writeFloat(f);
        bb1.g0(parcel, 7, this.zzf, false);
        boolean z = this.zzg;
        bb1.m0(8, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        bb1.o0(parcel, n0);
    }
}
