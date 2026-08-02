package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class zzuj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzuj> CREATOR = new zzuk();
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;

    public zzuj(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = z3;
        this.zzd = z4;
        this.zze = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.m0(1, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzb;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.zzc;
        bb1.m0(3, parcel, 4);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = this.zzd;
        bb1.m0(4, parcel, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = this.zze;
        bb1.m0(5, parcel, 4);
        parcel.writeInt(z5 ? 1 : 0);
        bb1.o0(parcel, n0);
    }
}
