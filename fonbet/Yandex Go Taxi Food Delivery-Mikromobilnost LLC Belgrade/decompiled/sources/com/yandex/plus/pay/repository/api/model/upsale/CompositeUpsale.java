package com.yandex.plus.pay.repository.api.model.upsale;

import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.yandex.plus.pay.repository.api.model.offers.InAppReplacementParams;
import com.yandex.plus.pay.repository.api.model.offers.Offer;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u000201B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ:\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\"\u0010\u000eJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u001c¨\u00062"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/upsale/CompositeUpsale;", "Landroid/os/Parcelable;", "Lcom/yandex/plus/pay/repository/api/model/offers/Offer;", "offer", "Lcom/yandex/plus/pay/repository/api/model/upsale/CompositeUpsale$Template;", "template", "Lcom/yandex/plus/pay/repository/api/model/offers/InAppReplacementParams;", "inAppReplacementParams", "Lcom/yandex/plus/pay/repository/api/model/upsale/CompositeUpsale$Meta;", Constants.REFERRER_API_META, "<init>", "(Lcom/yandex/plus/pay/repository/api/model/offers/Offer;Lcom/yandex/plus/pay/repository/api/model/upsale/CompositeUpsale$Template;Lcom/yandex/plus/pay/repository/api/model/offers/InAppReplacementParams;Lcom/yandex/plus/pay/repository/api/model/upsale/CompositeUpsale$Meta;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/repository/api/model/offers/Offer;", "component2", "()Lcom/yandex/plus/pay/repository/api/model/upsale/CompositeUpsale$Template;", "component3", "()Lcom/yandex/plus/pay/repository/api/model/offers/InAppReplacementParams;", "component4", "()Lcom/yandex/plus/pay/repository/api/model/upsale/CompositeUpsale$Meta;", "copy", "(Lcom/yandex/plus/pay/repository/api/model/offers/Offer;Lcom/yandex/plus/pay/repository/api/model/upsale/CompositeUpsale$Template;Lcom/yandex/plus/pay/repository/api/model/offers/InAppReplacementParams;Lcom/yandex/plus/pay/repository/api/model/upsale/CompositeUpsale$Meta;)Lcom/yandex/plus/pay/repository/api/model/upsale/CompositeUpsale;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/repository/api/model/offers/Offer;", "getOffer", "Lcom/yandex/plus/pay/repository/api/model/upsale/CompositeUpsale$Template;", "getTemplate", "Lcom/yandex/plus/pay/repository/api/model/offers/InAppReplacementParams;", "getInAppReplacementParams", "Lcom/yandex/plus/pay/repository/api/model/upsale/CompositeUpsale$Meta;", "getMeta", "Template", "Meta", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CompositeUpsale implements Parcelable {
    public static final Parcelable.Creator<CompositeUpsale> CREATOR = new Creator();
    private final InAppReplacementParams inAppReplacementParams;
    private final Meta meta;
    private final Offer offer;
    private final Template template;

    public CompositeUpsale(Offer offer, Template template, InAppReplacementParams inAppReplacementParams, Meta meta) {
        this.offer = offer;
        this.template = template;
        this.inAppReplacementParams = inAppReplacementParams;
        this.meta = meta;
    }

    public static /* synthetic */ CompositeUpsale copy$default(CompositeUpsale compositeUpsale, Offer offer, Template template, InAppReplacementParams inAppReplacementParams, Meta meta, int i, Object obj) {
        if ((i & 1) != 0) {
            offer = compositeUpsale.offer;
        }
        if ((i & 2) != 0) {
            template = compositeUpsale.template;
        }
        if ((i & 4) != 0) {
            inAppReplacementParams = compositeUpsale.inAppReplacementParams;
        }
        if ((i & 8) != 0) {
            meta = compositeUpsale.meta;
        }
        return compositeUpsale.copy(offer, template, inAppReplacementParams, meta);
    }

    /* renamed from: component1, reason: from getter */
    public final Offer getOffer() {
        return this.offer;
    }

    /* renamed from: component2, reason: from getter */
    public final Template getTemplate() {
        return this.template;
    }

    /* renamed from: component3, reason: from getter */
    public final InAppReplacementParams getInAppReplacementParams() {
        return this.inAppReplacementParams;
    }

    /* renamed from: component4, reason: from getter */
    public final Meta getMeta() {
        return this.meta;
    }

    public final CompositeUpsale copy(Offer offer, Template template, InAppReplacementParams inAppReplacementParams, Meta meta) {
        return new CompositeUpsale(offer, template, inAppReplacementParams, meta);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompositeUpsale)) {
            return false;
        }
        CompositeUpsale compositeUpsale = (CompositeUpsale) other;
        return jl40.l(this.offer, compositeUpsale.offer) && jl40.l(this.template, compositeUpsale.template) && jl40.l(this.inAppReplacementParams, compositeUpsale.inAppReplacementParams) && jl40.l(this.meta, compositeUpsale.meta);
    }

    public final InAppReplacementParams getInAppReplacementParams() {
        return this.inAppReplacementParams;
    }

    public final Meta getMeta() {
        return this.meta;
    }

    public final Offer getOffer() {
        return this.offer;
    }

    public final Template getTemplate() {
        return this.template;
    }

    public int hashCode() {
        int hashCode = (this.template.hashCode() + (this.offer.hashCode() * 31)) * 31;
        InAppReplacementParams inAppReplacementParams = this.inAppReplacementParams;
        return this.meta.hashCode() + ((hashCode + (inAppReplacementParams == null ? 0 : inAppReplacementParams.hashCode())) * 31);
    }

    public String toString() {
        return "CompositeUpsale(offer=" + this.offer + ", template=" + this.template + ", inAppReplacementParams=" + this.inAppReplacementParams + ", meta=" + this.meta + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.offer.writeToParcel(dest, flags);
        this.template.writeToParcel(dest, flags);
        InAppReplacementParams inAppReplacementParams = this.inAppReplacementParams;
        if (inAppReplacementParams == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inAppReplacementParams.writeToParcel(dest, flags);
        }
        this.meta.writeToParcel(dest, flags);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/upsale/CompositeUpsale$Meta;", "Landroid/os/Parcelable;", "", "sessionId", "offersBatchId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/repository/api/model/upsale/CompositeUpsale$Meta;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSessionId", "getOffersBatchId", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019Jp\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0019J\u0010\u0010&\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b&\u0010\u0011J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b3\u0010\u0019R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b4\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b5\u0010\u0019R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b6\u0010\u0019¨\u00067"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/upsale/CompositeUpsale$Template;", "Landroid/os/Parcelable;", "", "title", "subtitle", "offerText", "additionalOfferText", "", "benefits", "acceptButtonText", "rejectButtonText", "mainImageMobile", "mainImageTv", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/repository/api/model/upsale/CompositeUpsale$Template;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "getOfferText", "getAdditionalOfferText", "Ljava/util/List;", "getBenefits", "getAcceptButtonText", "getRejectButtonText", "getMainImageMobile", "getMainImageTv", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Template implements Parcelable {
        public static final Parcelable.Creator<Template> CREATOR = new Creator();
        private final String acceptButtonText;
        private final String additionalOfferText;
        private final List<String> benefits;
        private final String mainImageMobile;
        private final String mainImageTv;
        private final String offerText;
        private final String rejectButtonText;
        private final String subtitle;
        private final String title;

        public Template(String str, String str2, String str3, String str4, List<String> list, String str5, String str6, String str7, String str8) {
            this.title = str;
            this.subtitle = str2;
            this.offerText = str3;
            this.additionalOfferText = str4;
            this.benefits = list;
            this.acceptButtonText = str5;
            this.rejectButtonText = str6;
            this.mainImageMobile = str7;
            this.mainImageTv = str8;
        }

        public static /* synthetic */ Template copy$default(Template template, String str, String str2, String str3, String str4, List list, String str5, String str6, String str7, String str8, int i, Object obj) {
            if ((i & 1) != 0) {
                str = template.title;
            }
            if ((i & 2) != 0) {
                str2 = template.subtitle;
            }
            if ((i & 4) != 0) {
                str3 = template.offerText;
            }
            if ((i & 8) != 0) {
                str4 = template.additionalOfferText;
            }
            if ((i & 16) != 0) {
                list = template.benefits;
            }
            if ((i & 32) != 0) {
                str5 = template.acceptButtonText;
            }
            if ((i & 64) != 0) {
                str6 = template.rejectButtonText;
            }
            if ((i & 128) != 0) {
                str7 = template.mainImageMobile;
            }
            if ((i & 256) != 0) {
                str8 = template.mainImageTv;
            }
            String str9 = str7;
            String str10 = str8;
            String str11 = str5;
            String str12 = str6;
            List list2 = list;
            String str13 = str3;
            return template.copy(str, str2, str13, str4, list2, str11, str12, str9, str10);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final String getOfferText() {
            return this.offerText;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAdditionalOfferText() {
            return this.additionalOfferText;
        }

        public final List<String> component5() {
            return this.benefits;
        }

        /* renamed from: component6, reason: from getter */
        public final String getAcceptButtonText() {
            return this.acceptButtonText;
        }

        /* renamed from: component7, reason: from getter */
        public final String getRejectButtonText() {
            return this.rejectButtonText;
        }

        /* renamed from: component8, reason: from getter */
        public final String getMainImageMobile() {
            return this.mainImageMobile;
        }

        /* renamed from: component9, reason: from getter */
        public final String getMainImageTv() {
            return this.mainImageTv;
        }

        public final Template copy(String title, String subtitle, String offerText, String additionalOfferText, List<String> benefits, String acceptButtonText, String rejectButtonText, String mainImageMobile, String mainImageTv) {
            return new Template(title, subtitle, offerText, additionalOfferText, benefits, acceptButtonText, rejectButtonText, mainImageMobile, mainImageTv);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Template)) {
                return false;
            }
            Template template = (Template) other;
            return jl40.l(this.title, template.title) && jl40.l(this.subtitle, template.subtitle) && jl40.l(this.offerText, template.offerText) && jl40.l(this.additionalOfferText, template.additionalOfferText) && jl40.l(this.benefits, template.benefits) && jl40.l(this.acceptButtonText, template.acceptButtonText) && jl40.l(this.rejectButtonText, template.rejectButtonText) && jl40.l(this.mainImageMobile, template.mainImageMobile) && jl40.l(this.mainImageTv, template.mainImageTv);
        }

        public final String getAcceptButtonText() {
            return this.acceptButtonText;
        }

        public final String getAdditionalOfferText() {
            return this.additionalOfferText;
        }

        public final List<String> getBenefits() {
            return this.benefits;
        }

        public final String getMainImageMobile() {
            return this.mainImageMobile;
        }

        public final String getMainImageTv() {
            return this.mainImageTv;
        }

        public final String getOfferText() {
            return this.offerText;
        }

        public final String getRejectButtonText() {
            return this.rejectButtonText;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.mainImageTv.hashCode() + unr0.b(unr0.b(unr0.b(unr0.c(unr0.b(unr0.b(unr0.b(this.title.hashCode() * 31, 31, this.subtitle), 31, this.offerText), 31, this.additionalOfferText), 31, this.benefits), 31, this.acceptButtonText), 31, this.rejectButtonText), 31, this.mainImageMobile);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Template(title=");
            sb.append(this.title);
            sb.append(", subtitle=");
            sb.append(this.subtitle);
            sb.append(", offerText=");
            sb.append(this.offerText);
            sb.append(", additionalOfferText=");
            sb.append(this.additionalOfferText);
            sb.append(", benefits=");
            sb.append(this.benefits);
            sb.append(", acceptButtonText=");
            sb.append(this.acceptButtonText);
            sb.append(", rejectButtonText=");
            sb.append(this.rejectButtonText);
            sb.append(", mainImageMobile=");
            sb.append(this.mainImageMobile);
            sb.append(", mainImageTv=");
            return b64.p(sb, this.mainImageTv, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            dest.writeString(this.offerText);
            dest.writeString(this.additionalOfferText);
            dest.writeStringList(this.benefits);
            dest.writeString(this.acceptButtonText);
            dest.writeString(this.rejectButtonText);
            dest.writeString(this.mainImageMobile);
            dest.writeString(this.mainImageTv);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Template> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Template createFromParcel(Parcel parcel) {
                return new Template(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Template[] newArray(int i) {
                return new Template[i];
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CompositeUpsale> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CompositeUpsale createFromParcel(Parcel parcel) {
            return new CompositeUpsale(Offer.CREATOR.createFromParcel(parcel), Template.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InAppReplacementParams.CREATOR.createFromParcel(parcel), Meta.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CompositeUpsale[] newArray(int i) {
            return new CompositeUpsale[i];
        }
    }
}
