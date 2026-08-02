package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new zze();
    public final PointF[] zza;
    public final int zzb;

    public zzd(PointF[] pointFArr, int i) {
        this.zza = pointFArr;
        this.zzb = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.j0(parcel, 2, this.zza, i);
        int i2 = this.zzb;
        bb1.m0(3, parcel, 4);
        parcel.writeInt(i2);
        bb1.o0(parcel, n0);
    }
}
