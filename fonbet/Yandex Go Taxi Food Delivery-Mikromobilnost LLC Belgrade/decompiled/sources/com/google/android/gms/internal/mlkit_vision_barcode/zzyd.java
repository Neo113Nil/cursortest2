package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class zzyd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyd> CREATOR = new zzye();
    private final int zza;
    private final boolean zzb;

    public zzyd(int i, boolean z) {
        this.zza = i;
        this.zzb = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        boolean z = this.zzb;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        bb1.o0(parcel, n0);
    }
}
