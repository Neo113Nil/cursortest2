package com.samsung.android.sdk.samsungpay.v2.payment;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public class PaymentResultInfo implements Parcelable {
    public static final Parcelable.Creator<PaymentResultInfo> CREATOR = new Parcelable.Creator<PaymentResultInfo>() { // from class: com.samsung.android.sdk.samsungpay.v2.payment.PaymentResultInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PaymentResultInfo createFromParcel(Parcel parcel) {
            return new PaymentResultInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PaymentResultInfo[] newArray(int i) {
            return new PaymentResultInfo[i];
        }
    };
    private static final String PAYMENT_RESULT_ORDER_NUMBER = "paymentResultOrderNumber";
    private static final String PAYMENT_RESULT_STATUS = "paymentResultStatus";
    private Bundle paymentResultData;

    public enum ResultStatus {
        UNKNOWN,
        CHARGED,
        REJECTED
    }

    public static class a {
        private Bundle a;
    }

    public PaymentResultInfo(a aVar) {
        this.paymentResultData = aVar.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getPaymentResultOrderNumber() {
        return this.paymentResultData.getString(PAYMENT_RESULT_ORDER_NUMBER, "");
    }

    public String getPaymentResultStatus() {
        return this.paymentResultData.getString(PAYMENT_RESULT_STATUS, ResultStatus.UNKNOWN.name());
    }

    public void readFromParcel(Parcel parcel) {
        this.paymentResultData = parcel.readBundle();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.paymentResultData);
    }

    public PaymentResultInfo(Parcel parcel) {
        readFromParcel(parcel);
    }
}
