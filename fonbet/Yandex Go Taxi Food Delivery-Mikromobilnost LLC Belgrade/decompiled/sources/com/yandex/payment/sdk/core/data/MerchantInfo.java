package com.yandex.payment.sdk.core.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/payment/sdk/core/data/MerchantInfo;", "Landroid/os/Parcelable;", "", "name", "scheduleText", "ogrn", "Lcom/yandex/payment/sdk/core/data/MerchantAddress;", "merchantAddress", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/payment/sdk/core/data/MerchantAddress;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getScheduleText", "getOgrn", "Lcom/yandex/payment/sdk/core/data/MerchantAddress;", "getMerchantAddress", "()Lcom/yandex/payment/sdk/core/data/MerchantAddress;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MerchantInfo implements Parcelable {
    public static final Parcelable.Creator<MerchantInfo> CREATOR = new Creator();
    private final MerchantAddress merchantAddress;
    private final String name;
    private final String ogrn;
    private final String scheduleText;

    public MerchantInfo(String str, String str2, String str3, MerchantAddress merchantAddress) {
        this.name = str;
        this.scheduleText = str2;
        this.ogrn = str3;
        this.merchantAddress = merchantAddress;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MerchantAddress getMerchantAddress() {
        return this.merchantAddress;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOgrn() {
        return this.ogrn;
    }

    public final String getScheduleText() {
        return this.scheduleText;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.scheduleText);
        dest.writeString(this.ogrn);
        MerchantAddress merchantAddress = this.merchantAddress;
        if (merchantAddress == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            merchantAddress.writeToParcel(dest, flags);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MerchantInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MerchantInfo createFromParcel(Parcel parcel) {
            return new MerchantInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : MerchantAddress.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MerchantInfo[] newArray(int i) {
            return new MerchantInfo[i];
        }
    }
}
