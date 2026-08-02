package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.hwa1;
import defpackage.it3;

/* loaded from: classes11.dex */
public final class PaymentData extends AbstractSafeParcelable implements it3 {
    public static final Parcelable.Creator<PaymentData> CREATOR = new zzac();
    String zza;
    CardInfo zzb;
    UserAddress zzc;
    PaymentMethodToken zzd;
    String zze;
    Bundle zzf;
    String zzg;
    Bundle zzh;

    public PaymentData(String str, CardInfo cardInfo, UserAddress userAddress, PaymentMethodToken paymentMethodToken, String str2, Bundle bundle, String str3, Bundle bundle2) {
        this.zza = str;
        this.zzb = cardInfo;
        this.zzc = userAddress;
        this.zzd = paymentMethodToken;
        this.zze = str2;
        this.zzf = bundle;
        this.zzg = str3;
        this.zzh = bundle2;
    }

    public static PaymentData fromJson(String str) {
        PaymentData paymentData = new PaymentData();
        cvw.m(str, "paymentDataJson cannot be null!");
        paymentData.zzg = str;
        return paymentData;
    }

    public static PaymentData getFromIntent(Intent intent) {
        return (PaymentData) hwa1.b(intent, "com.google.android.gms.wallet.PaymentData", CREATOR);
    }

    @Deprecated
    public CardInfo getCardInfo() {
        return this.zzb;
    }

    @Deprecated
    public String getEmail() {
        return this.zza;
    }

    @Deprecated
    public Bundle getExtraData() {
        return this.zzf;
    }

    @Deprecated
    public String getGoogleTransactionId() {
        return this.zze;
    }

    public Bundle getLastSavedState() {
        return this.zzh;
    }

    @Deprecated
    public PaymentMethodToken getPaymentMethodToken() {
        return this.zzd;
    }

    @Deprecated
    public UserAddress getShippingAddress() {
        return this.zzc;
    }

    @Override // defpackage.it3
    public void putIntoIntent(Intent intent) {
        intent.putExtra("com.google.android.gms.wallet.PaymentData", hwa1.f(this));
    }

    public String toJson() {
        return this.zzg;
    }

    public PaymentData withLastSavedState(Bundle bundle) {
        this.zzh = bundle;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 1, this.zza, false);
        bb1.f0(parcel, 2, this.zzb, i, false);
        bb1.f0(parcel, 3, this.zzc, i, false);
        bb1.f0(parcel, 4, this.zzd, i, false);
        bb1.g0(parcel, 5, this.zze, false);
        bb1.U(parcel, 6, this.zzf, false);
        bb1.g0(parcel, 7, this.zzg, false);
        bb1.U(parcel, 8, this.zzh, false);
        bb1.o0(parcel, n0);
    }

    private PaymentData() {
    }
}
