package com.yandex.xplat.payment.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.mbb1;
import defpackage.mo10;
import defpackage.tyj0;
import defpackage.ws00;
import defpackage.y3x;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0017\u0018\u0000 \u001c2\u00060\u0001j\u0002`\u0002:\u0001\u001dB)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/yandex/xplat/payment/sdk/MerchantInfo;", "Landroid/os/Parcelable;", "Lcom/yandex/xplat/common/Parcelable;", "", "name", "scheduleText", "ogrn", "Lcom/yandex/xplat/payment/sdk/MerchantAddress;", "merchantAddress", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/xplat/payment/sdk/MerchantAddress;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getScheduleText", "getOgrn", "Lcom/yandex/xplat/payment/sdk/MerchantAddress;", "getMerchantAddress", "()Lcom/yandex/xplat/payment/sdk/MerchantAddress;", "Companion", "mo10", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class MerchantInfo implements Parcelable {
    private final MerchantAddress merchantAddress;
    private final String name;
    private final String ogrn;
    private final String scheduleText;
    public static final mo10 Companion = new mo10();
    public static final Parcelable.Creator<MerchantInfo> CREATOR = new Creator();

    public MerchantInfo(String str, String str2, String str3, MerchantAddress merchantAddress) {
        this.name = str;
        this.scheduleText = str2;
        this.ogrn = str3;
        this.merchantAddress = merchantAddress;
    }

    public static tyj0 fromJsonItem(y3x y3xVar) {
        Companion.getClass();
        return mbb1.d(y3xVar, new ws00(21));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
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
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.scheduleText);
        dest.writeString(this.ogrn);
        dest.writeParcelable(this.merchantAddress, flags);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MerchantInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MerchantInfo createFromParcel(Parcel parcel) {
            return new MerchantInfo(parcel.readString(), parcel.readString(), parcel.readString(), (MerchantAddress) parcel.readParcelable(MerchantInfo.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MerchantInfo[] newArray(int i) {
            return new MerchantInfo[i];
        }
    }
}
