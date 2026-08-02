package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class PaymentMethodTokenizationParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentMethodTokenizationParameters> CREATOR = new zzah();
    int zza;
    final Bundle zzb;

    public PaymentMethodTokenizationParameters(int i, Bundle bundle) {
        new Bundle();
        this.zza = i;
        this.zzb = bundle;
    }

    public static d newBuilder() {
        return new d(new PaymentMethodTokenizationParameters());
    }

    public Bundle getParameters() {
        return new Bundle(this.zzb);
    }

    public int getPaymentMethodTokenizationType() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int i2 = this.zza;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(i2);
        bb1.U(parcel, 3, this.zzb, false);
        bb1.o0(parcel, n0);
    }

    private PaymentMethodTokenizationParameters() {
        this.zzb = new Bundle();
    }
}
