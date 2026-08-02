package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class PaymentMethodToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentMethodToken> CREATOR = new zzag();
    int zza;
    String zzb;

    public PaymentMethodToken(int i, String str) {
        this.zza = i;
        this.zzb = str;
    }

    public int getPaymentMethodTokenizationType() {
        return this.zza;
    }

    public String getToken() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int i2 = this.zza;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(i2);
        bb1.g0(parcel, 3, this.zzb, false);
        bb1.o0(parcel, n0);
    }

    private PaymentMethodToken() {
    }
}
