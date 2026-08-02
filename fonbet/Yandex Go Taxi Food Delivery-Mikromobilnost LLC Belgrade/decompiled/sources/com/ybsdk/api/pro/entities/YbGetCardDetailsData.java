package com.ybsdk.api.pro.entities;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/api/pro/entities/YbGetCardDetailsData;", "Landroid/os/Parcelable;", "YbProCardData", "SecondFactorRequestData", "Lcom/ybsdk/api/pro/entities/YbGetCardDetailsData$SecondFactorRequestData;", "Lcom/ybsdk/api/pro/entities/YbGetCardDetailsData$YbProCardData;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface YbGetCardDetailsData extends Parcelable {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/api/pro/entities/YbGetCardDetailsData$SecondFactorRequestData;", "Lcom/ybsdk/api/pro/entities/YbGetCardDetailsData;", "", "trackId", "operationId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/api/pro/entities/YbGetCardDetailsData$SecondFactorRequestData;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTrackId", "getOperationId", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SecondFactorRequestData implements YbGetCardDetailsData {
        public static final Parcelable.Creator<SecondFactorRequestData> CREATOR = new Creator();
        private final String operationId;
        private final String trackId;

        public SecondFactorRequestData(String str, String str2) {
            this.trackId = str;
            this.operationId = str2;
        }

        public static /* synthetic */ SecondFactorRequestData copy$default(SecondFactorRequestData secondFactorRequestData, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = secondFactorRequestData.trackId;
            }
            if ((i & 2) != 0) {
                str2 = secondFactorRequestData.operationId;
            }
            return secondFactorRequestData.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTrackId() {
            return this.trackId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getOperationId() {
            return this.operationId;
        }

        public final SecondFactorRequestData copy(String trackId, String operationId) {
            return new SecondFactorRequestData(trackId, operationId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SecondFactorRequestData)) {
                return false;
            }
            SecondFactorRequestData secondFactorRequestData = (SecondFactorRequestData) other;
            return jl40.l(this.trackId, secondFactorRequestData.trackId) && jl40.l(this.operationId, secondFactorRequestData.operationId);
        }

        public final String getOperationId() {
            return this.operationId;
        }

        public final String getTrackId() {
            return this.trackId;
        }

        public int hashCode() {
            return this.operationId.hashCode() + (this.trackId.hashCode() * 31);
        }

        public String toString() {
            return unr0.p("SecondFactorRequestData(trackId=", this.trackId, ", operationId=", this.operationId, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.trackId);
            dest.writeString(this.operationId);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SecondFactorRequestData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SecondFactorRequestData createFromParcel(Parcel parcel) {
                return new SecondFactorRequestData(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SecondFactorRequestData[] newArray(int i) {
                return new SecondFactorRequestData[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0012¨\u0006\""}, d2 = {"Lcom/ybsdk/api/pro/entities/YbGetCardDetailsData$YbProCardData;", "Lcom/ybsdk/api/pro/entities/YbGetCardDetailsData;", "", "cardNumber", "validUntil", "cvv", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/api/pro/entities/YbGetCardDetailsData$YbProCardData;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCardNumber", "getValidUntil", "getCvv", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class YbProCardData implements YbGetCardDetailsData {
        public static final Parcelable.Creator<YbProCardData> CREATOR = new Creator();
        private final String cardNumber;
        private final String cvv;
        private final String validUntil;

        public YbProCardData(String str, String str2, String str3) {
            this.cardNumber = str;
            this.validUntil = str2;
            this.cvv = str3;
        }

        public static /* synthetic */ YbProCardData copy$default(YbProCardData ybProCardData, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ybProCardData.cardNumber;
            }
            if ((i & 2) != 0) {
                str2 = ybProCardData.validUntil;
            }
            if ((i & 4) != 0) {
                str3 = ybProCardData.cvv;
            }
            return ybProCardData.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCardNumber() {
            return this.cardNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getValidUntil() {
            return this.validUntil;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCvv() {
            return this.cvv;
        }

        public final YbProCardData copy(String cardNumber, String validUntil, String cvv) {
            return new YbProCardData(cardNumber, validUntil, cvv);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof YbProCardData)) {
                return false;
            }
            YbProCardData ybProCardData = (YbProCardData) other;
            return jl40.l(this.cardNumber, ybProCardData.cardNumber) && jl40.l(this.validUntil, ybProCardData.validUntil) && jl40.l(this.cvv, ybProCardData.cvv);
        }

        public final String getCardNumber() {
            return this.cardNumber;
        }

        public final String getCvv() {
            return this.cvv;
        }

        public final String getValidUntil() {
            return this.validUntil;
        }

        public int hashCode() {
            return this.cvv.hashCode() + unr0.b(this.cardNumber.hashCode() * 31, 31, this.validUntil);
        }

        public String toString() {
            String str = this.cardNumber;
            String str2 = this.validUntil;
            return oyr.t(b64.v("YbProCardData(cardNumber=", str, ", validUntil=", str2, ", cvv="), this.cvv, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.cardNumber);
            dest.writeString(this.validUntil);
            dest.writeString(this.cvv);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<YbProCardData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final YbProCardData createFromParcel(Parcel parcel) {
                return new YbProCardData(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final YbProCardData[] newArray(int i) {
                return new YbProCardData[i];
            }
        }
    }
}
