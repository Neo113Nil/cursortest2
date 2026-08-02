package com.yandex.plus.pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J0\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001e\u0010\fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0018¨\u0006+"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeUpsale;", "Landroid/os/Parcelable;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "offer", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeUpsale$Template;", "template", "Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams;", "inAppReplacementParams", "<init>", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;Lcom/yandex/plus/pay/api/model/PlusPayCompositeUpsale$Template;Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "component2", "()Lcom/yandex/plus/pay/api/model/PlusPayCompositeUpsale$Template;", "component3", "()Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams;", "copy", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;Lcom/yandex/plus/pay/api/model/PlusPayCompositeUpsale$Template;Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams;)Lcom/yandex/plus/pay/api/model/PlusPayCompositeUpsale;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "getOffer", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeUpsale$Template;", "getTemplate", "Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams;", "getInAppReplacementParams", "Template", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusPayCompositeUpsale implements Parcelable {
    public static final Parcelable.Creator<PlusPayCompositeUpsale> CREATOR = new Creator();
    private final PlusPayInAppReplacementParams inAppReplacementParams;
    private final PlusPayCompositeOffers.Offer offer;
    private final Template template;

    public PlusPayCompositeUpsale(PlusPayCompositeOffers.Offer offer, Template template, PlusPayInAppReplacementParams plusPayInAppReplacementParams) {
        this.offer = offer;
        this.template = template;
        this.inAppReplacementParams = plusPayInAppReplacementParams;
    }

    public static /* synthetic */ PlusPayCompositeUpsale copy$default(PlusPayCompositeUpsale plusPayCompositeUpsale, PlusPayCompositeOffers.Offer offer, Template template, PlusPayInAppReplacementParams plusPayInAppReplacementParams, int i, Object obj) {
        if ((i & 1) != 0) {
            offer = plusPayCompositeUpsale.offer;
        }
        if ((i & 2) != 0) {
            template = plusPayCompositeUpsale.template;
        }
        if ((i & 4) != 0) {
            plusPayInAppReplacementParams = plusPayCompositeUpsale.inAppReplacementParams;
        }
        return plusPayCompositeUpsale.copy(offer, template, plusPayInAppReplacementParams);
    }

    /* renamed from: component1, reason: from getter */
    public final PlusPayCompositeOffers.Offer getOffer() {
        return this.offer;
    }

    /* renamed from: component2, reason: from getter */
    public final Template getTemplate() {
        return this.template;
    }

    /* renamed from: component3, reason: from getter */
    public final PlusPayInAppReplacementParams getInAppReplacementParams() {
        return this.inAppReplacementParams;
    }

    public final PlusPayCompositeUpsale copy(PlusPayCompositeOffers.Offer offer, Template template, PlusPayInAppReplacementParams inAppReplacementParams) {
        return new PlusPayCompositeUpsale(offer, template, inAppReplacementParams);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusPayCompositeUpsale)) {
            return false;
        }
        PlusPayCompositeUpsale plusPayCompositeUpsale = (PlusPayCompositeUpsale) other;
        return jl40.l(this.offer, plusPayCompositeUpsale.offer) && jl40.l(this.template, plusPayCompositeUpsale.template) && jl40.l(this.inAppReplacementParams, plusPayCompositeUpsale.inAppReplacementParams);
    }

    public final PlusPayInAppReplacementParams getInAppReplacementParams() {
        return this.inAppReplacementParams;
    }

    public final PlusPayCompositeOffers.Offer getOffer() {
        return this.offer;
    }

    public final Template getTemplate() {
        return this.template;
    }

    public int hashCode() {
        int hashCode = (this.template.hashCode() + (this.offer.hashCode() * 31)) * 31;
        PlusPayInAppReplacementParams plusPayInAppReplacementParams = this.inAppReplacementParams;
        return hashCode + (plusPayInAppReplacementParams == null ? 0 : plusPayInAppReplacementParams.hashCode());
    }

    public String toString() {
        return "PlusPayCompositeUpsale(offer=" + this.offer + ", template=" + this.template + ", inAppReplacementParams=" + this.inAppReplacementParams + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.offer.writeToParcel(dest, flags);
        this.template.writeToParcel(dest, flags);
        PlusPayInAppReplacementParams plusPayInAppReplacementParams = this.inAppReplacementParams;
        if (plusPayInAppReplacementParams == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            plusPayInAppReplacementParams.writeToParcel(dest, flags);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u00017BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"Jf\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0019J\u0010\u0010&\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b&\u0010\u0011J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b3\u0010\u0019R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b4\u0010\u0019R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u0010\"¨\u00068"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeUpsale$Template;", "Landroid/os/Parcelable;", "", "title", "subtitle", "offerText", "additionalOfferText", "", "benefits", "acceptButtonText", "rejectButtonText", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeUpsale$Template$MainImage;", "mainImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayCompositeUpsale$Template$MainImage;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "()Lcom/yandex/plus/pay/api/model/PlusPayCompositeUpsale$Template$MainImage;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayCompositeUpsale$Template$MainImage;)Lcom/yandex/plus/pay/api/model/PlusPayCompositeUpsale$Template;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "getOfferText", "getAdditionalOfferText", "Ljava/util/List;", "getBenefits", "getAcceptButtonText", "getRejectButtonText", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeUpsale$Template$MainImage;", "getMainImage", "MainImage", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Template implements Parcelable {
        public static final Parcelable.Creator<Template> CREATOR = new Creator();
        private final String acceptButtonText;
        private final String additionalOfferText;
        private final List<String> benefits;
        private final MainImage mainImage;
        private final String offerText;
        private final String rejectButtonText;
        private final String subtitle;
        private final String title;

        public Template(String str, String str2, String str3, String str4, List<String> list, String str5, String str6, MainImage mainImage) {
            this.title = str;
            this.subtitle = str2;
            this.offerText = str3;
            this.additionalOfferText = str4;
            this.benefits = list;
            this.acceptButtonText = str5;
            this.rejectButtonText = str6;
            this.mainImage = mainImage;
        }

        public static /* synthetic */ Template copy$default(Template template, String str, String str2, String str3, String str4, List list, String str5, String str6, MainImage mainImage, int i, Object obj) {
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
                mainImage = template.mainImage;
            }
            String str7 = str6;
            MainImage mainImage2 = mainImage;
            List list2 = list;
            String str8 = str5;
            return template.copy(str, str2, str3, str4, list2, str8, str7, mainImage2);
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
        public final MainImage getMainImage() {
            return this.mainImage;
        }

        public final Template copy(String title, String subtitle, String offerText, String additionalOfferText, List<String> benefits, String acceptButtonText, String rejectButtonText, MainImage mainImage) {
            return new Template(title, subtitle, offerText, additionalOfferText, benefits, acceptButtonText, rejectButtonText, mainImage);
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
            return jl40.l(this.title, template.title) && jl40.l(this.subtitle, template.subtitle) && jl40.l(this.offerText, template.offerText) && jl40.l(this.additionalOfferText, template.additionalOfferText) && jl40.l(this.benefits, template.benefits) && jl40.l(this.acceptButtonText, template.acceptButtonText) && jl40.l(this.rejectButtonText, template.rejectButtonText) && jl40.l(this.mainImage, template.mainImage);
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

        public final MainImage getMainImage() {
            return this.mainImage;
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
            return this.mainImage.hashCode() + unr0.b(unr0.b(unr0.c(unr0.b(unr0.b(unr0.b(this.title.hashCode() * 31, 31, this.subtitle), 31, this.offerText), 31, this.additionalOfferText), 31, this.benefits), 31, this.acceptButtonText), 31, this.rejectButtonText);
        }

        public String toString() {
            return "Template(title=" + this.title + ", subtitle=" + this.subtitle + ", offerText=" + this.offerText + ", additionalOfferText=" + this.additionalOfferText + ", benefits=" + this.benefits + ", acceptButtonText=" + this.acceptButtonText + ", rejectButtonText=" + this.rejectButtonText + ", mainImage=" + this.mainImage + ')';
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
            this.mainImage.writeToParcel(dest, flags);
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeUpsale$Template$MainImage;", "Landroid/os/Parcelable;", "", "mobileUrl", "tvUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/api/model/PlusPayCompositeUpsale$Template$MainImage;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMobileUrl", "getTvUrl", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class MainImage implements Parcelable {
            public static final Parcelable.Creator<MainImage> CREATOR = new Creator();
            private final String mobileUrl;
            private final String tvUrl;

            public MainImage(String str, String str2) {
                this.mobileUrl = str;
                this.tvUrl = str2;
            }

            public static /* synthetic */ MainImage copy$default(MainImage mainImage, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = mainImage.mobileUrl;
                }
                if ((i & 2) != 0) {
                    str2 = mainImage.tvUrl;
                }
                return mainImage.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMobileUrl() {
                return this.mobileUrl;
            }

            /* renamed from: component2, reason: from getter */
            public final String getTvUrl() {
                return this.tvUrl;
            }

            public final MainImage copy(String mobileUrl, String tvUrl) {
                return new MainImage(mobileUrl, tvUrl);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MainImage)) {
                    return false;
                }
                MainImage mainImage = (MainImage) other;
                return jl40.l(this.mobileUrl, mainImage.mobileUrl) && jl40.l(this.tvUrl, mainImage.tvUrl);
            }

            public final String getMobileUrl() {
                return this.mobileUrl;
            }

            public final String getTvUrl() {
                return this.tvUrl;
            }

            public int hashCode() {
                return this.tvUrl.hashCode() + (this.mobileUrl.hashCode() * 31);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("MainImage(mobileUrl=");
                sb.append(this.mobileUrl);
                sb.append(", tvUrl=");
                return b64.p(sb, this.tvUrl, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.mobileUrl);
                dest.writeString(this.tvUrl);
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<MainImage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MainImage createFromParcel(Parcel parcel) {
                    return new MainImage(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MainImage[] newArray(int i) {
                    return new MainImage[i];
                }
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Template> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Template createFromParcel(Parcel parcel) {
                return new Template(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), MainImage.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Template[] newArray(int i) {
                return new Template[i];
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusPayCompositeUpsale> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayCompositeUpsale createFromParcel(Parcel parcel) {
            return new PlusPayCompositeUpsale(PlusPayCompositeOffers.Offer.CREATOR.createFromParcel(parcel), Template.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PlusPayInAppReplacementParams.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayCompositeUpsale[] newArray(int i) {
            return new PlusPayCompositeUpsale[i];
        }
    }
}
