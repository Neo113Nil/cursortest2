package com.samsung.android.sdk.samsungpay.v2.payment;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public class TransactionResultInfo implements Parcelable {
    public static final Parcelable.Creator<TransactionResultInfo> CREATOR = new Parcelable.Creator<TransactionResultInfo>() { // from class: com.samsung.android.sdk.samsungpay.v2.payment.TransactionResultInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TransactionResultInfo createFromParcel(Parcel parcel) {
            return new TransactionResultInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TransactionResultInfo[] newArray(int i) {
            return new TransactionResultInfo[i];
        }
    };
    private Double amount;
    private String approvalType;
    private String currency;
    private String dateTime;
    private Bundle extraData;
    private String issuer;
    private String merchantName;
    private String userId;

    public static class a {
        private Double a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private Bundle h;
    }

    public TransactionResultInfo(a aVar) {
        this.amount = aVar.a;
        this.currency = aVar.b;
        this.dateTime = aVar.c;
        this.issuer = aVar.d;
        this.approvalType = aVar.e;
        this.merchantName = aVar.f;
        this.userId = aVar.g;
        this.extraData = aVar.h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle getExtraData() {
        if (this.extraData == null) {
            this.extraData = new Bundle();
        }
        return this.extraData;
    }

    public Double getTransactionAmount() {
        return this.amount;
    }

    public String getTransactionApprovalType() {
        return this.approvalType;
    }

    public String getTransactionCurrency() {
        return this.currency;
    }

    public String getTransactionDateTime() {
        return this.dateTime;
    }

    public String getTransactionIssuer() {
        return this.issuer;
    }

    public String getTransactionMerchantName() {
        return this.merchantName;
    }

    public String getUserProfileId() {
        return this.userId;
    }

    public void readFromParcel(Parcel parcel) {
        this.amount = Double.valueOf(parcel.readDouble());
        this.currency = parcel.readString();
        this.dateTime = parcel.readString();
        this.issuer = parcel.readString();
        this.approvalType = parcel.readString();
        this.merchantName = parcel.readString();
        this.userId = parcel.readString();
        this.extraData = parcel.readBundle();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.amount.doubleValue());
        parcel.writeString(this.currency);
        parcel.writeString(this.dateTime);
        parcel.writeString(this.issuer);
        parcel.writeString(this.approvalType);
        parcel.writeString(this.merchantName);
        parcel.writeString(this.userId);
        parcel.writeBundle(this.extraData);
    }

    public TransactionResultInfo(Parcel parcel) {
        readFromParcel(parcel);
    }
}
