package com.yandex.plus.acquisition.sdk.api.offers;

import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.xvz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0001AB]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u001c\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b)\u0010*Jv\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u001dJ\u0010\u0010.\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b.\u0010\u0015J\u001a\u00101\u001a\u00020\u000f2\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b7\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010&R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010(R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\b\u0010\u0010*¨\u0006B"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionOffer;", "Landroid/os/Parcelable;", "", "positionId", "currentTariffName", "Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionProduct;", PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, "", "options", "Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionAssets;", "assets", "Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionOffer$Meta;", Constants.REFERRER_API_META, "", "payload", "", "isSilentInvoiceAvailable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionProduct;Ljava/util/List;Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionAssets;Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionOffer$Meta;Ljava/util/Map;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionProduct;", "component4", "()Ljava/util/List;", "component5", "()Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionAssets;", "component6", "()Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionOffer$Meta;", "component7", "()Ljava/util/Map;", "component8", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionProduct;Ljava/util/List;Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionAssets;Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionOffer$Meta;Ljava/util/Map;Z)Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionOffer;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPositionId", "getCurrentTariffName", "Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionProduct;", "getTariff", "Ljava/util/List;", "getOptions", "Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionAssets;", "getAssets", "Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionOffer$Meta;", "getMeta", "Ljava/util/Map;", "getPayload", "Z", "Meta", "acquisition-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusAcquisitionOffer implements Parcelable {
    public static final Parcelable.Creator<PlusAcquisitionOffer> CREATOR = new Creator();
    private final PlusAcquisitionAssets assets;
    private final String currentTariffName;
    private final boolean isSilentInvoiceAvailable;
    private final Meta meta;
    private final List<PlusAcquisitionProduct> options;
    private final Map<String, String> payload;
    private final String positionId;
    private final PlusAcquisitionProduct tariff;

    public PlusAcquisitionOffer(String str, String str2, PlusAcquisitionProduct plusAcquisitionProduct, List<PlusAcquisitionProduct> list, PlusAcquisitionAssets plusAcquisitionAssets, Meta meta, Map<String, String> map, boolean z) {
        this.positionId = str;
        this.currentTariffName = str2;
        this.tariff = plusAcquisitionProduct;
        this.options = list;
        this.assets = plusAcquisitionAssets;
        this.meta = meta;
        this.payload = map;
        this.isSilentInvoiceAvailable = z;
    }

    public static /* synthetic */ PlusAcquisitionOffer copy$default(PlusAcquisitionOffer plusAcquisitionOffer, String str, String str2, PlusAcquisitionProduct plusAcquisitionProduct, List list, PlusAcquisitionAssets plusAcquisitionAssets, Meta meta, Map map, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plusAcquisitionOffer.positionId;
        }
        if ((i & 2) != 0) {
            str2 = plusAcquisitionOffer.currentTariffName;
        }
        if ((i & 4) != 0) {
            plusAcquisitionProduct = plusAcquisitionOffer.tariff;
        }
        if ((i & 8) != 0) {
            list = plusAcquisitionOffer.options;
        }
        if ((i & 16) != 0) {
            plusAcquisitionAssets = plusAcquisitionOffer.assets;
        }
        if ((i & 32) != 0) {
            meta = plusAcquisitionOffer.meta;
        }
        if ((i & 64) != 0) {
            map = plusAcquisitionOffer.payload;
        }
        if ((i & 128) != 0) {
            z = plusAcquisitionOffer.isSilentInvoiceAvailable;
        }
        Map map2 = map;
        boolean z2 = z;
        PlusAcquisitionAssets plusAcquisitionAssets2 = plusAcquisitionAssets;
        Meta meta2 = meta;
        return plusAcquisitionOffer.copy(str, str2, plusAcquisitionProduct, list, plusAcquisitionAssets2, meta2, map2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPositionId() {
        return this.positionId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrentTariffName() {
        return this.currentTariffName;
    }

    /* renamed from: component3, reason: from getter */
    public final PlusAcquisitionProduct getTariff() {
        return this.tariff;
    }

    public final List<PlusAcquisitionProduct> component4() {
        return this.options;
    }

    /* renamed from: component5, reason: from getter */
    public final PlusAcquisitionAssets getAssets() {
        return this.assets;
    }

    /* renamed from: component6, reason: from getter */
    public final Meta getMeta() {
        return this.meta;
    }

    public final Map<String, String> component7() {
        return this.payload;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsSilentInvoiceAvailable() {
        return this.isSilentInvoiceAvailable;
    }

    public final PlusAcquisitionOffer copy(String positionId, String currentTariffName, PlusAcquisitionProduct tariff, List<PlusAcquisitionProduct> options, PlusAcquisitionAssets assets, Meta meta, Map<String, String> payload, boolean isSilentInvoiceAvailable) {
        return new PlusAcquisitionOffer(positionId, currentTariffName, tariff, options, assets, meta, payload, isSilentInvoiceAvailable);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusAcquisitionOffer)) {
            return false;
        }
        PlusAcquisitionOffer plusAcquisitionOffer = (PlusAcquisitionOffer) other;
        return jl40.l(this.positionId, plusAcquisitionOffer.positionId) && jl40.l(this.currentTariffName, plusAcquisitionOffer.currentTariffName) && jl40.l(this.tariff, plusAcquisitionOffer.tariff) && jl40.l(this.options, plusAcquisitionOffer.options) && jl40.l(this.assets, plusAcquisitionOffer.assets) && jl40.l(this.meta, plusAcquisitionOffer.meta) && jl40.l(this.payload, plusAcquisitionOffer.payload) && this.isSilentInvoiceAvailable == plusAcquisitionOffer.isSilentInvoiceAvailable;
    }

    public final PlusAcquisitionAssets getAssets() {
        return this.assets;
    }

    public final String getCurrentTariffName() {
        return this.currentTariffName;
    }

    public final Meta getMeta() {
        return this.meta;
    }

    public final List<PlusAcquisitionProduct> getOptions() {
        return this.options;
    }

    public final Map<String, String> getPayload() {
        return this.payload;
    }

    public final String getPositionId() {
        return this.positionId;
    }

    public final PlusAcquisitionProduct getTariff() {
        return this.tariff;
    }

    public int hashCode() {
        int hashCode = this.positionId.hashCode() * 31;
        String str = this.currentTariffName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        PlusAcquisitionProduct plusAcquisitionProduct = this.tariff;
        return Boolean.hashCode(this.isSilentInvoiceAvailable) + unr0.d((this.meta.hashCode() + ((this.assets.hashCode() + unr0.c((hashCode2 + (plusAcquisitionProduct != null ? plusAcquisitionProduct.hashCode() : 0)) * 31, 31, this.options)) * 31)) * 31, 31, this.payload);
    }

    public final boolean isSilentInvoiceAvailable() {
        return this.isSilentInvoiceAvailable;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlusAcquisitionOffer(positionId=");
        sb.append(this.positionId);
        sb.append(", currentTariffName=");
        sb.append(this.currentTariffName);
        sb.append(", tariff=");
        sb.append(this.tariff);
        sb.append(", options=");
        sb.append(this.options);
        sb.append(", assets=");
        sb.append(this.assets);
        sb.append(", meta=");
        sb.append(this.meta);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", isSilentInvoiceAvailable=");
        return unr0.u(sb, this.isSilentInvoiceAvailable, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.positionId);
        dest.writeString(this.currentTariffName);
        PlusAcquisitionProduct plusAcquisitionProduct = this.tariff;
        if (plusAcquisitionProduct == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            plusAcquisitionProduct.writeToParcel(dest, flags);
        }
        Iterator t = vfc.t(dest, this.options);
        while (t.hasNext()) {
            ((PlusAcquisitionProduct) t.next()).writeToParcel(dest, flags);
        }
        this.assets.writeToParcel(dest, flags);
        this.meta.writeToParcel(dest, flags);
        Iterator x = qv10.x(this.payload, dest);
        while (x.hasNext()) {
            Map.Entry entry = (Map.Entry) x.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
        dest.writeInt(this.isSilentInvoiceAvailable ? 1 : 0);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionOffer$Meta;", "Landroid/os/Parcelable;", "", "sessionId", "offersBatchId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionOffer$Meta;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSessionId", "getOffersBatchId", "acquisition-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Meta implements Parcelable {
        public static final Parcelable.Creator<Meta> CREATOR = new Creator();
        private final String offersBatchId;
        private final String sessionId;

        public Meta(String str, String str2) {
            this.sessionId = str;
            this.offersBatchId = str2;
        }

        public static /* synthetic */ Meta copy$default(Meta meta, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = meta.sessionId;
            }
            if ((i & 2) != 0) {
                str2 = meta.offersBatchId;
            }
            return meta.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getOffersBatchId() {
            return this.offersBatchId;
        }

        public final Meta copy(String sessionId, String offersBatchId) {
            return new Meta(sessionId, offersBatchId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Meta)) {
                return false;
            }
            Meta meta = (Meta) other;
            return jl40.l(this.sessionId, meta.sessionId) && jl40.l(this.offersBatchId, meta.offersBatchId);
        }

        public final String getOffersBatchId() {
            return this.offersBatchId;
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        public int hashCode() {
            return this.offersBatchId.hashCode() + (this.sessionId.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Meta(sessionId=");
            sb.append(this.sessionId);
            sb.append(", offersBatchId=");
            return b64.p(sb, this.offersBatchId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.sessionId);
            dest.writeString(this.offersBatchId);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Meta> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Meta createFromParcel(Parcel parcel) {
                return new Meta(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Meta[] newArray(int i) {
                return new Meta[i];
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusAcquisitionOffer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusAcquisitionOffer createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            PlusAcquisitionProduct createFromParcel = parcel.readInt() == 0 ? null : PlusAcquisitionProduct.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = oo31.d(PlusAcquisitionProduct.CREATOR, parcel, arrayList, i, 1);
            }
            PlusAcquisitionAssets createFromParcel2 = PlusAcquisitionAssets.CREATOR.createFromParcel(parcel);
            Meta createFromParcel3 = Meta.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = xvz.b(parcel, linkedHashMap, parcel.readString(), i2, 1);
            }
            return new PlusAcquisitionOffer(readString, readString2, createFromParcel, arrayList, createFromParcel2, createFromParcel3, linkedHashMap, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusAcquisitionOffer[] newArray(int i) {
            return new PlusAcquisitionOffer[i];
        }
    }
}
