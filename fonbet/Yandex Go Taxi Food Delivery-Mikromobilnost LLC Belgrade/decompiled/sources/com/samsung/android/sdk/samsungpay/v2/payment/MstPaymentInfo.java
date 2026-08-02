package com.samsung.android.sdk.samsungpay.v2.payment;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public class MstPaymentInfo implements Parcelable {
    public static final Parcelable.Creator<MstPaymentInfo> CREATOR = new Parcelable.Creator<MstPaymentInfo>() { // from class: com.samsung.android.sdk.samsungpay.v2.payment.MstPaymentInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MstPaymentInfo createFromParcel(Parcel parcel) {
            return new MstPaymentInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MstPaymentInfo[] newArray(int i) {
            return new MstPaymentInfo[i];
        }
    };
    private int durationTime;
    private String encryptedToken;
    private String endEntityCA;
    private Bundle extraData;
    private String intermediateCA;
    private boolean isEncrypted;
    private boolean isRetry;
    private String signedToken;
    private String transactionReference;
    private String transactionSignature;
    private Long transactionTimestamp;

    public static class a {
        private String a = "";
        private Long b = 0L;
        private String c = "";
        private String d = "";
        private String e = "";
        private String f = "";
        private String g = "";
        private int h = 0;
        private boolean i = false;
        private boolean j = false;
        private Bundle k = new Bundle();
    }

    public MstPaymentInfo(a aVar) {
        this.transactionReference = "";
        this.transactionTimestamp = 0L;
        this.transactionSignature = "";
        this.encryptedToken = "";
        this.signedToken = "";
        this.intermediateCA = "";
        this.endEntityCA = "";
        this.durationTime = 0;
        this.isRetry = false;
        this.isEncrypted = false;
        this.extraData = new Bundle();
        this.transactionReference = aVar.a;
        this.transactionTimestamp = aVar.b;
        this.transactionSignature = aVar.c;
        this.encryptedToken = aVar.d;
        this.signedToken = aVar.e;
        this.intermediateCA = aVar.f;
        this.endEntityCA = aVar.g;
        this.durationTime = aVar.h;
        this.isRetry = aVar.i;
        this.isEncrypted = aVar.j;
        this.extraData = aVar.k;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDurationTime() {
        return this.durationTime;
    }

    public String getEncryptedToken() {
        return this.encryptedToken;
    }

    public String getEndEntityCA() {
        return this.endEntityCA;
    }

    public Bundle getExtraMstPaymentData() {
        if (this.extraData == null) {
            this.extraData = new Bundle();
        }
        return this.extraData;
    }

    public String getIntermediateCA() {
        return this.intermediateCA;
    }

    public boolean getIsEncrypted() {
        return this.isEncrypted;
    }

    public boolean getIsRetry() {
        return this.isRetry;
    }

    public String getSignedToken() {
        return this.signedToken;
    }

    public String getTransactionReference() {
        return this.transactionReference;
    }

    public String getTransactionSignature() {
        return this.transactionSignature;
    }

    public Long getTransactionTimeStamp() {
        return this.transactionTimestamp;
    }

    public void readFromParcel(Parcel parcel) {
        this.transactionReference = parcel.readString();
        this.transactionTimestamp = Long.valueOf(parcel.readLong());
        this.transactionSignature = parcel.readString();
        this.encryptedToken = parcel.readString();
        this.signedToken = parcel.readString();
        this.intermediateCA = parcel.readString();
        this.endEntityCA = parcel.readString();
        this.durationTime = parcel.readInt();
        this.isRetry = ((Boolean) parcel.readValue(Boolean.class.getClassLoader())).booleanValue();
        this.isEncrypted = ((Boolean) parcel.readValue(Boolean.class.getClassLoader())).booleanValue();
        this.extraData = parcel.readBundle();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.transactionReference);
        parcel.writeLong(this.transactionTimestamp.longValue());
        parcel.writeString(this.transactionSignature);
        parcel.writeString(this.encryptedToken);
        parcel.writeString(this.signedToken);
        parcel.writeString(this.intermediateCA);
        parcel.writeString(this.endEntityCA);
        parcel.writeInt(this.durationTime);
        parcel.writeValue(Boolean.valueOf(this.isRetry));
        parcel.writeValue(Boolean.valueOf(this.isEncrypted));
        parcel.writeBundle(this.extraData);
    }

    public MstPaymentInfo(Parcel parcel) {
        this.transactionReference = "";
        this.transactionTimestamp = 0L;
        this.transactionSignature = "";
        this.encryptedToken = "";
        this.signedToken = "";
        this.intermediateCA = "";
        this.endEntityCA = "";
        this.durationTime = 0;
        this.isRetry = false;
        this.isEncrypted = false;
        this.extraData = new Bundle();
        readFromParcel(parcel);
    }
}
