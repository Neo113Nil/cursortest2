package com.yandex.plus.acquisition.sdk.api.offers;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.smw0;
import defpackage.unr0;
import defpackage.x4e;
import defpackage.xvz;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u001e\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0088\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001cJ\u0010\u0010,\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b,\u0010\u0014J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b5\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b6\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b7\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b8\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b9\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010$R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010&R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b?\u0010(¨\u0006@"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionProduct;", "Landroid/os/Parcelable;", "", "name", "simpleName", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "text", "additionalText", "period", "Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionPrice;", "price", "Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionVendorType;", "offerVendorType", "", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionPrice;Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionVendorType;Ljava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionPrice;", "component9", "()Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionVendorType;", "component10", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionPrice;Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionVendorType;Ljava/util/Map;)Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionProduct;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getSimpleName", "getTitle", "getDescription", "getText", "getAdditionalText", "getPeriod", "Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionPrice;", "getPrice", "Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionVendorType;", "getOfferVendorType", "Ljava/util/Map;", "getPayload", "acquisition-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusAcquisitionProduct implements Parcelable {
    public static final Parcelable.Creator<PlusAcquisitionProduct> CREATOR = new Creator();
    private final String additionalText;
    private final String description;
    private final String name;
    private final PlusAcquisitionVendorType offerVendorType;
    private final Map<String, String> payload;
    private final String period;
    private final PlusAcquisitionPrice price;
    private final String simpleName;
    private final String text;
    private final String title;

    public PlusAcquisitionProduct(String str, String str2, String str3, String str4, String str5, String str6, String str7, PlusAcquisitionPrice plusAcquisitionPrice, PlusAcquisitionVendorType plusAcquisitionVendorType, Map<String, String> map) {
        this.name = str;
        this.simpleName = str2;
        this.title = str3;
        this.description = str4;
        this.text = str5;
        this.additionalText = str6;
        this.period = str7;
        this.price = plusAcquisitionPrice;
        this.offerVendorType = plusAcquisitionVendorType;
        this.payload = map;
    }

    public static /* synthetic */ PlusAcquisitionProduct copy$default(PlusAcquisitionProduct plusAcquisitionProduct, String str, String str2, String str3, String str4, String str5, String str6, String str7, PlusAcquisitionPrice plusAcquisitionPrice, PlusAcquisitionVendorType plusAcquisitionVendorType, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plusAcquisitionProduct.name;
        }
        if ((i & 2) != 0) {
            str2 = plusAcquisitionProduct.simpleName;
        }
        if ((i & 4) != 0) {
            str3 = plusAcquisitionProduct.title;
        }
        if ((i & 8) != 0) {
            str4 = plusAcquisitionProduct.description;
        }
        if ((i & 16) != 0) {
            str5 = plusAcquisitionProduct.text;
        }
        if ((i & 32) != 0) {
            str6 = plusAcquisitionProduct.additionalText;
        }
        if ((i & 64) != 0) {
            str7 = plusAcquisitionProduct.period;
        }
        if ((i & 128) != 0) {
            plusAcquisitionPrice = plusAcquisitionProduct.price;
        }
        if ((i & 256) != 0) {
            plusAcquisitionVendorType = plusAcquisitionProduct.offerVendorType;
        }
        if ((i & 512) != 0) {
            map = plusAcquisitionProduct.payload;
        }
        PlusAcquisitionVendorType plusAcquisitionVendorType2 = plusAcquisitionVendorType;
        Map map2 = map;
        String str8 = str7;
        PlusAcquisitionPrice plusAcquisitionPrice2 = plusAcquisitionPrice;
        String str9 = str5;
        String str10 = str6;
        return plusAcquisitionProduct.copy(str, str2, str3, str4, str9, str10, str8, plusAcquisitionPrice2, plusAcquisitionVendorType2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final Map<String, String> component10() {
        return this.payload;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSimpleName() {
        return this.simpleName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAdditionalText() {
        return this.additionalText;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    /* renamed from: component8, reason: from getter */
    public final PlusAcquisitionPrice getPrice() {
        return this.price;
    }

    /* renamed from: component9, reason: from getter */
    public final PlusAcquisitionVendorType getOfferVendorType() {
        return this.offerVendorType;
    }

    public final PlusAcquisitionProduct copy(String name, String simpleName, String title, String description, String text, String additionalText, String period, PlusAcquisitionPrice price, PlusAcquisitionVendorType offerVendorType, Map<String, String> payload) {
        return new PlusAcquisitionProduct(name, simpleName, title, description, text, additionalText, period, price, offerVendorType, payload);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusAcquisitionProduct)) {
            return false;
        }
        PlusAcquisitionProduct plusAcquisitionProduct = (PlusAcquisitionProduct) other;
        return jl40.l(this.name, plusAcquisitionProduct.name) && jl40.l(this.simpleName, plusAcquisitionProduct.simpleName) && jl40.l(this.title, plusAcquisitionProduct.title) && jl40.l(this.description, plusAcquisitionProduct.description) && jl40.l(this.text, plusAcquisitionProduct.text) && jl40.l(this.additionalText, plusAcquisitionProduct.additionalText) && jl40.l(this.period, plusAcquisitionProduct.period) && jl40.l(this.price, plusAcquisitionProduct.price) && jl40.l(this.offerVendorType, plusAcquisitionProduct.offerVendorType) && jl40.l(this.payload, plusAcquisitionProduct.payload);
    }

    public final String getAdditionalText() {
        return this.additionalText;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public final PlusAcquisitionVendorType getOfferVendorType() {
        return this.offerVendorType;
    }

    public final Map<String, String> getPayload() {
        return this.payload;
    }

    public final String getPeriod() {
        return this.period;
    }

    public final PlusAcquisitionPrice getPrice() {
        return this.price;
    }

    public final String getSimpleName() {
        return this.simpleName;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(this.name.hashCode() * 31, 31, this.simpleName), 31, this.title);
        String str = this.description;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.additionalText;
        int hashCode3 = (this.offerVendorType.hashCode() + ((this.price.hashCode() + unr0.b((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.period)) * 31)) * 31;
        Map<String, String> map = this.payload;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlusAcquisitionProduct(name=");
        sb.append(this.name);
        sb.append(", simpleName=");
        sb.append(this.simpleName);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", additionalText=");
        sb.append(this.additionalText);
        sb.append(", period=");
        sb.append(this.period);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", offerVendorType=");
        sb.append(this.offerVendorType);
        sb.append(", payload=");
        return smw0.n(sb, this.payload, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.simpleName);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.text);
        dest.writeString(this.additionalText);
        dest.writeString(this.period);
        this.price.writeToParcel(dest, flags);
        dest.writeParcelable(this.offerVendorType, flags);
        Map<String, String> map = this.payload;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        Iterator s = x4e.s(dest, 1, map);
        while (s.hasNext()) {
            Map.Entry entry = (Map.Entry) s.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusAcquisitionProduct> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusAcquisitionProduct createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            PlusAcquisitionPrice createFromParcel = PlusAcquisitionPrice.CREATOR.createFromParcel(parcel);
            PlusAcquisitionVendorType plusAcquisitionVendorType = (PlusAcquisitionVendorType) parcel.readParcelable(PlusAcquisitionProduct.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i = 0;
                while (i != readInt) {
                    i = xvz.b(parcel, linkedHashMap2, parcel.readString(), i, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new PlusAcquisitionProduct(readString, readString2, readString3, readString4, readString5, readString6, readString7, createFromParcel, plusAcquisitionVendorType, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusAcquisitionProduct[] newArray(int i) {
            return new PlusAcquisitionProduct[i];
        }
    }
}
