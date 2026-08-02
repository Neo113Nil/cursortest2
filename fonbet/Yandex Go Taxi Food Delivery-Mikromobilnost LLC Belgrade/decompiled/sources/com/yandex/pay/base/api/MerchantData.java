package com.yandex.pay.base.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J0\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0012J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0018¨\u0006*"}, d2 = {"Lcom/yandex/pay/base/api/MerchantData;", "Landroid/os/Parcelable;", "Lcom/yandex/pay/base/api/MerchantId;", "id", "Lcom/yandex/pay/base/api/MerchantName;", "name", "Lcom/yandex/pay/base/api/MerchantUrl;", "url", "<init>", "(Lcom/yandex/pay/base/api/MerchantId;Lcom/yandex/pay/base/api/MerchantName;Lcom/yandex/pay/base/api/MerchantUrl;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/pay/base/api/MerchantId;", "component2", "()Lcom/yandex/pay/base/api/MerchantName;", "component3", "()Lcom/yandex/pay/base/api/MerchantUrl;", "copy", "(Lcom/yandex/pay/base/api/MerchantId;Lcom/yandex/pay/base/api/MerchantName;Lcom/yandex/pay/base/api/MerchantUrl;)Lcom/yandex/pay/base/api/MerchantData;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/pay/base/api/MerchantId;", "getId", "Lcom/yandex/pay/base/api/MerchantName;", "getName", "Lcom/yandex/pay/base/api/MerchantUrl;", "getUrl", "flows-applink-payment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MerchantData implements Parcelable {
    public static final Parcelable.Creator<MerchantData> CREATOR = new Creator();
    private final MerchantId id;
    private final MerchantName name;
    private final MerchantUrl url;

    public MerchantData(MerchantId merchantId, MerchantName merchantName, MerchantUrl merchantUrl) {
        this.id = merchantId;
        this.name = merchantName;
        this.url = merchantUrl;
    }

    public static /* synthetic */ MerchantData copy$default(MerchantData merchantData, MerchantId merchantId, MerchantName merchantName, MerchantUrl merchantUrl, int i, Object obj) {
        if ((i & 1) != 0) {
            merchantId = merchantData.id;
        }
        if ((i & 2) != 0) {
            merchantName = merchantData.name;
        }
        if ((i & 4) != 0) {
            merchantUrl = merchantData.url;
        }
        return merchantData.copy(merchantId, merchantName, merchantUrl);
    }

    /* renamed from: component1, reason: from getter */
    public final MerchantId getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final MerchantName getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final MerchantUrl getUrl() {
        return this.url;
    }

    public final MerchantData copy(MerchantId id, MerchantName name, MerchantUrl url) {
        return new MerchantData(id, name, url);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MerchantData)) {
            return false;
        }
        MerchantData merchantData = (MerchantData) other;
        return jl40.l(this.id, merchantData.id) && jl40.l(this.name, merchantData.name) && jl40.l(this.url, merchantData.url);
    }

    public final MerchantId getId() {
        return this.id;
    }

    public final MerchantName getName() {
        return this.name;
    }

    public final MerchantUrl getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = (this.name.hashCode() + (this.id.hashCode() * 31)) * 31;
        MerchantUrl merchantUrl = this.url;
        return hashCode + (merchantUrl == null ? 0 : merchantUrl.hashCode());
    }

    public String toString() {
        return "MerchantData(id=" + this.id + ", name=" + this.name + ", url=" + this.url + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.id.writeToParcel(dest, flags);
        this.name.writeToParcel(dest, flags);
        MerchantUrl merchantUrl = this.url;
        if (merchantUrl == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            merchantUrl.writeToParcel(dest, flags);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MerchantData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MerchantData createFromParcel(Parcel parcel) {
            return new MerchantData(MerchantId.CREATOR.createFromParcel(parcel), MerchantName.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MerchantUrl.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MerchantData[] newArray(int i) {
            return new MerchantData[i];
        }
    }
}
