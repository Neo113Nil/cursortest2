package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class CreditCardExpirationDate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreditCardExpirationDate> CREATOR = new zzj();
    int zza;
    int zzb;

    public CreditCardExpirationDate(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    public int getMonth() {
        return this.zza;
    }

    public int getYear() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int i2 = this.zza;
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        int i3 = this.zzb;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(i3);
        bb1.o0(parcel, n0);
    }

    public CreditCardExpirationDate() {
    }
}
