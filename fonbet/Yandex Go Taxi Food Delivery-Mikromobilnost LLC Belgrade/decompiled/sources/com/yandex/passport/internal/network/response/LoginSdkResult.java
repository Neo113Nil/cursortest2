package com.yandex.passport.internal.network.response;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes15.dex */
public class LoginSdkResult implements Parcelable {
    public static final Parcelable.Creator<LoginSdkResult> CREATOR = new Parcelable.Creator<LoginSdkResult>() { // from class: com.yandex.passport.internal.network.response.LoginSdkResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LoginSdkResult createFromParcel(Parcel parcel) {
            return new LoginSdkResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LoginSdkResult[] newArray(int i) {
            return new LoginSdkResult[i];
        }
    };
    private final String accessToken;
    private final String code;
    private final long expiresIn;
    private final String tokenType;

    private LoginSdkResult(Parcel parcel) {
        this.accessToken = parcel.readString();
        this.tokenType = parcel.readString();
        this.expiresIn = parcel.readLong();
        this.code = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getCode() {
        return this.code;
    }

    public long getExpiresIn() {
        return this.expiresIn;
    }

    public String getTokenType() {
        return this.tokenType;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.accessToken);
        parcel.writeString(this.tokenType);
        parcel.writeLong(this.expiresIn);
        parcel.writeString(this.code);
    }

    public LoginSdkResult(String str, String str2, long j) {
        this.accessToken = str;
        this.tokenType = str2;
        this.expiresIn = j;
        this.code = null;
    }

    public LoginSdkResult(String str) {
        this.code = str;
        this.accessToken = null;
        this.tokenType = null;
        this.expiresIn = 0L;
    }
}
