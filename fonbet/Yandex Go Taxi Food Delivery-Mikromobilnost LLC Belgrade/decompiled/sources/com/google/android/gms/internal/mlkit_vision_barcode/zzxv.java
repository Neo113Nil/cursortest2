package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class zzxv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxv> CREATOR = new zzyk();
    private final double zza;
    private final double zzb;

    public zzxv(double d, double d2) {
        this.zza = d;
        this.zzb = d2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        double d = this.zza;
        bb1.m0(1, parcel, 8);
        parcel.writeDouble(d);
        double d2 = this.zzb;
        bb1.m0(2, parcel, 8);
        parcel.writeDouble(d2);
        bb1.o0(parcel, n0);
    }

    public final double zza() {
        return this.zza;
    }

    public final double zzb() {
        return this.zzb;
    }
}
