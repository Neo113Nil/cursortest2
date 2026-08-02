package com.yandex.xplat.payment.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jo10;
import defpackage.mbb1;
import defpackage.tyj0;
import defpackage.ws00;
import defpackage.y3x;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u0000 \u001b2\u00060\u0001j\u0002`\u0002:\u0001\u001cB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/yandex/xplat/payment/sdk/MerchantAddress;", "Landroid/os/Parcelable;", "Lcom/yandex/xplat/common/Parcelable;", "", "city", "country", "home", "street", "zip", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCity", "()Ljava/lang/String;", "getCountry", "getHome", "getStreet", "getZip", "Companion", "jo10", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class MerchantAddress implements Parcelable {
    private final String city;
    private final String country;
    private final String home;
    private final String street;
    private final String zip;
    public static final jo10 Companion = new jo10();
    public static final Parcelable.Creator<MerchantAddress> CREATOR = new Creator();

    public MerchantAddress(String str, String str2, String str3, String str4, String str5) {
        this.city = str;
        this.country = str2;
        this.home = str3;
        this.street = str4;
        this.zip = str5;
    }

    public static tyj0 fromJsonItem(y3x y3xVar) {
        Companion.getClass();
        return mbb1.d(y3xVar, new ws00(20));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getHome() {
        return this.home;
    }

    public final String getStreet() {
        return this.street;
    }

    public final String getZip() {
        return this.zip;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.city);
        dest.writeString(this.country);
        dest.writeString(this.home);
        dest.writeString(this.street);
        dest.writeString(this.zip);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MerchantAddress> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MerchantAddress createFromParcel(Parcel parcel) {
            return new MerchantAddress(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MerchantAddress[] newArray(int i) {
            return new MerchantAddress[i];
        }
    }
}
