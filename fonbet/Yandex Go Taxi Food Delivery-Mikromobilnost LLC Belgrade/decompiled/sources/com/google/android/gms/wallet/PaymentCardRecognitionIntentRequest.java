package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.ux90;

/* loaded from: classes11.dex */
public class PaymentCardRecognitionIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentCardRecognitionIntentRequest> CREATOR = new zzaa();
    int zza;

    public PaymentCardRecognitionIntentRequest(int i) {
        this.zza = i;
    }

    public static ux90 builder() {
        new PaymentCardRecognitionIntentRequest();
        return new ux90();
    }

    public static PaymentCardRecognitionIntentRequest getDefaultInstance() {
        PaymentCardRecognitionIntentRequest paymentCardRecognitionIntentRequest = new PaymentCardRecognitionIntentRequest();
        paymentCardRecognitionIntentRequest.zza = 1;
        return paymentCardRecognitionIntentRequest;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int i2 = this.zza;
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        bb1.o0(parcel, n0);
    }

    public PaymentCardRecognitionIntentRequest() {
    }
}
