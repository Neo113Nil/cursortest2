package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.bgb1;

/* loaded from: classes11.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    boolean zza;
    String zzb;

    public zzr(boolean z, String str) {
        this.zza = z;
        this.zzb = str;
    }

    public static bgb1 zza() {
        new zzr();
        return new bgb1();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        boolean z = this.zza;
        bb1.m0(1, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        bb1.g0(parcel, 2, this.zzb, false);
        bb1.o0(parcel, n0);
    }

    public zzr() {
    }
}
