package com.samsung.android.sdk.samsungpay.v2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public class PartnerInfo implements Parcelable {
    public static final Parcelable.Creator<PartnerInfo> CREATOR = new Parcelable.Creator<PartnerInfo>() { // from class: com.samsung.android.sdk.samsungpay.v2.PartnerInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PartnerInfo createFromParcel(Parcel parcel) {
            return new PartnerInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PartnerInfo[] newArray(int i) {
            return new PartnerInfo[i];
        }
    };
    private Bundle data;
    private String serviceId;

    public PartnerInfo(String str, Bundle bundle) {
        this.serviceId = str;
        this.data = bundle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle getData() {
        return this.data;
    }

    @Deprecated
    public String getProductId() {
        return this.serviceId;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public void readFromParcel(Parcel parcel) {
        this.serviceId = parcel.readString();
        this.data = parcel.readBundle();
    }

    public void setData(Bundle bundle) {
        this.data = bundle;
    }

    public String toString() {
        return "PartnerInfo{serviceId='" + this.serviceId + "', data=" + this.data + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.serviceId);
        parcel.writeBundle(this.data);
    }

    public PartnerInfo(String str) {
        this.serviceId = str;
    }

    public PartnerInfo(Parcel parcel) {
        readFromParcel(parcel);
    }
}
