package com.samsung.android.sdk.samsungpay.v2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public class Status implements Parcelable {
    public static final Parcelable.Creator<Status> CREATOR = new Parcelable.Creator<Status>() { // from class: com.samsung.android.sdk.samsungpay.v2.Status.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Status createFromParcel(Parcel parcel) {
            return new Status(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Status[] newArray(int i) {
            return new Status[i];
        }
    };
    private Bundle mData;
    private int mStatus;

    public Status(int i, Bundle bundle) {
        this.mStatus = i;
        this.mData = bundle;
    }

    private void readFromParacel(Parcel parcel) {
        this.mStatus = parcel.readInt();
        this.mData = parcel.readBundle();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle getData() {
        return this.mData;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public void setData(Bundle bundle) {
        this.mData = bundle;
    }

    public void setStatus(int i) {
        this.mStatus = i;
    }

    public String toString() {
        return "Status{mStatus=" + this.mStatus + ", mData=" + this.mData + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mStatus);
        parcel.writeBundle(this.mData);
    }

    public Status(int i) {
        this.mStatus = i;
    }

    public Status(Parcel parcel) {
        readFromParacel(parcel);
    }
}
