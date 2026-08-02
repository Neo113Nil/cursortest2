package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.hwa1;

/* loaded from: classes11.dex */
public final class PaymentCardRecognitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentCardRecognitionResult> CREATOR = new zzz();
    String zza;
    CreditCardExpirationDate zzb;

    public PaymentCardRecognitionResult(String str, CreditCardExpirationDate creditCardExpirationDate) {
        this.zza = str;
        this.zzb = creditCardExpirationDate;
    }

    public static PaymentCardRecognitionResult getFromIntent(Intent intent) {
        return (PaymentCardRecognitionResult) hwa1.b(intent, "com.google.android.gms.wallet.PaymentCardRecognitionResult", CREATOR);
    }

    public CreditCardExpirationDate getCreditCardExpirationDate() {
        return this.zzb;
    }

    public String getPan() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 1, this.zza, false);
        bb1.f0(parcel, 2, this.zzb, i, false);
        bb1.o0(parcel, n0);
    }

    public PaymentCardRecognitionResult() {
    }
}
