package com.yandex.plus.pay.repository.api.model.upsale;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import com.yandex.plus.core.data.common.ColorPair;
import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale;", "Landroid/os/Parcelable;", "<init>", "()V", "template", "Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale$Template;", "getTemplate", "()Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale$Template;", "Link", "Subscription", "Tariff", "Template", "Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale$Link;", "Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale$Subscription;", "Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale$Tariff;", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class Upsale implements Parcelable {
    public /* synthetic */ Upsale(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Template getTemplate();

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J0\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006%"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale$Link;", "Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale;", "", "target", "url", "Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale$Template;", "template", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale$Template;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale$Template;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale$Template;)Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale$Link;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTarget", "getUrl", "Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale$Template;", "getTemplate", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Link extends Upsale {
        public static final Parcelable.Creator<Link> CREATOR = new Creator();
        private final String target;
        private final Template template;
        private final String url;

        public Link(String str, String str2, Template template) {
            super(null);
            this.target = str;
            this.url = str2;
            this.template = template;
        }

        public static /* synthetic */ Link copy$default(Link link, String str, String str2, Template template, int i, Object obj) {
            if ((i & 1) != 0) {
                str = link.target;
            }
            if ((i & 2) != 0) {
                str2 = link.url;
            }
            if ((i & 4) != 0) {
                template = link.template;
            }
            return link.copy(str, str2, template);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTarget() {
            return this.target;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component3, reason: from getter */
        public final Template getTemplate() {
            return this.template;
        }

        public final Link copy(String target, String url, Template template) {
            return new Link(target, url, template);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Link)) {
                return false;
            }
            Link link = (Link) other;
            return jl40.l(this.target, link.target) && jl40.l(this.url, link.url) && jl40.l(this.template, link.template);
        }

        public final String getTarget() {
            return this.target;
        }

        @Override // com.yandex.plus.pay.repository.api.model.upsale.Upsale
        public Template getTemplate() {
            return this.template;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.target;
            return this.template.hashCode() + unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.url);
        }

        public String toString() {
            return "Link(target=" + this.target + ", url=" + this.url + ", template=" + this.template + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.target);
            dest.writeString(this.url);
            this.template.writeToParcel(dest, flags);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Link> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Link createFromParcel(Parcel parcel) {
                return new Link(parcel.readString(), parcel.readString(), Template.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Link[] newArray(int i) {
                return new Link[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006%"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale$Subscription;", "Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale;", "", "target", "productId", "Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale$Template;", "template", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale$Template;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale$Template;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale$Template;)Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale$Subscription;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTarget", "getProductId", "Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale$Template;", "getTemplate", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Subscription extends Upsale {
        public static final Parcelable.Creator<Subscription> CREATOR = new Creator();
        private final String productId;
        private final String target;
        private final Template template;

        public Subscription(String str, String str2, Template template) {
            super(null);
            this.target = str;
            this.productId = str2;
            this.template = template;
        }

        public static /* synthetic */ Subscription copy$default(Subscription subscription, String str, String str2, Template template, int i, Object obj) {
            if ((i & 1) != 0) {
                str = subscription.target;
            }
            if ((i & 2) != 0) {
                str2 = subscription.productId;
            }
            if ((i & 4) != 0) {
                template = subscription.template;
            }
            return subscription.copy(str, str2, template);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTarget() {
            return this.target;
        }

        /* renamed from: component2, reason: from getter */
        public final String getProductId() {
            return this.productId;
        }

        /* renamed from: component3, reason: from getter */
        public final Template getTemplate() {
            return this.template;
        }

        public final Subscription copy(String target, String productId, Template template) {
            return new Subscription(target, productId, template);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Subscription)) {
                return false;
            }
            Subscription subscription = (Subscription) other;
            return jl40.l(this.target, subscription.target) && jl40.l(this.productId, subscription.productId) && jl40.l(this.template, subscription.template);
        }

        public final String getProductId() {
            return this.productId;
        }

        public final String getTarget() {
            return this.target;
        }

        @Override // com.yandex.plus.pay.repository.api.model.upsale.Upsale
        public Template getTemplate() {
            return this.template;
        }

        public int hashCode() {
            return this.template.hashCode() + unr0.b(this.target.hashCode() * 31, 31, this.productId);
        }

        public String toString() {
            return "Subscription(target=" + this.target + ", productId=" + this.productId + ", template=" + this.template + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.target);
            dest.writeString(this.productId);
            this.template.writeToParcel(dest, flags);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Subscription> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Subscription createFromParcel(Parcel parcel) {
                return new Subscription(parcel.readString(), parcel.readString(), Template.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Subscription[] newArray(int i) {
                return new Subscription[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJD\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\rJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0015R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u001a¨\u0006+"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale$Tariff;", "Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale;", "", "target", PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, "", "options", "Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale$Template;", "template", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale$Template;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale$Template;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale$Template;)Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale$Tariff;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTarget", "getTariff", "Ljava/util/List;", "getOptions", "Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale$Template;", "getTemplate", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Tariff extends Upsale {
        public static final Parcelable.Creator<Tariff> CREATOR = new Creator();
        private final List<String> options;
        private final String target;
        private final String tariff;
        private final Template template;

        public Tariff(String str, String str2, List<String> list, Template template) {
            super(null);
            this.target = str;
            this.tariff = str2;
            this.options = list;
            this.template = template;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Tariff copy$default(Tariff tariff, String str, String str2, List list, Template template, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tariff.target;
            }
            if ((i & 2) != 0) {
                str2 = tariff.tariff;
            }
            if ((i & 4) != 0) {
                list = tariff.options;
            }
            if ((i & 8) != 0) {
                template = tariff.template;
            }
            return tariff.copy(str, str2, list, template);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTarget() {
            return this.target;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTariff() {
            return this.tariff;
        }

        public final List<String> component3() {
            return this.options;
        }

        /* renamed from: component4, reason: from getter */
        public final Template getTemplate() {
            return this.template;
        }

        public final Tariff copy(String target, String tariff, List<String> options, Template template) {
            return new Tariff(target, tariff, options, template);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tariff)) {
                return false;
            }
            Tariff tariff = (Tariff) other;
            return jl40.l(this.target, tariff.target) && jl40.l(this.tariff, tariff.tariff) && jl40.l(this.options, tariff.options) && jl40.l(this.template, tariff.template);
        }

        public final List<String> getOptions() {
            return this.options;
        }

        public final String getTarget() {
            return this.target;
        }

        public final String getTariff() {
            return this.tariff;
        }

        @Override // com.yandex.plus.pay.repository.api.model.upsale.Upsale
        public Template getTemplate() {
            return this.template;
        }

        public int hashCode() {
            String str = this.target;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.tariff;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<String> list = this.options;
            return this.template.hashCode() + ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31);
        }

        public String toString() {
            return "Tariff(target=" + this.target + ", tariff=" + this.tariff + ", options=" + this.options + ", template=" + this.template + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.target);
            dest.writeString(this.tariff);
            dest.writeStringList(this.options);
            this.template.writeToParcel(dest, flags);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Tariff> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Tariff createFromParcel(Parcel parcel) {
                return new Tariff(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), Template.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Tariff[] newArray(int i) {
                return new Tariff[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b(\u0010&J\u0080\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001cJ\u0010\u0010,\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b,\u0010\u0014J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001cR\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b6\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b7\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b8\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010#R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b;\u0010#R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010&R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b>\u0010&R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b?\u0010&¨\u0006@"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale$Template;", "Landroid/os/Parcelable;", "", "title", "", "benefits", "acceptButtonText", "additionalButtonText", "rejectButtonText", "Lcom/yandex/plus/core/data/common/ColorPair;", "textColor", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "backgroundImage", "iconImage", "headingImage", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/ColorPair;Lcom/yandex/plus/core/data/common/ColorPair;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/core/data/common/PlusThemedImage;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "component6", "()Lcom/yandex/plus/core/data/common/ColorPair;", "component7", "component8", "()Lcom/yandex/plus/core/data/common/PlusThemedImage;", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/ColorPair;Lcom/yandex/plus/core/data/common/ColorPair;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/core/data/common/PlusThemedImage;)Lcom/yandex/plus/pay/repository/api/model/upsale/Upsale$Template;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getBenefits", "getAcceptButtonText", "getAdditionalButtonText", "getRejectButtonText", "Lcom/yandex/plus/core/data/common/ColorPair;", "getTextColor", "getBackgroundColor", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "getBackgroundImage", "getIconImage", "getHeadingImage", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Template implements Parcelable {
        public static final Parcelable.Creator<Template> CREATOR = new Creator();
        private final String acceptButtonText;
        private final String additionalButtonText;
        private final ColorPair backgroundColor;
        private final PlusThemedImage backgroundImage;
        private final List<String> benefits;
        private final PlusThemedImage headingImage;
        private final PlusThemedImage iconImage;
        private final String rejectButtonText;
        private final ColorPair textColor;
        private final String title;

        public Template(String str, List<String> list, String str2, String str3, String str4, ColorPair colorPair, ColorPair colorPair2, PlusThemedImage plusThemedImage, PlusThemedImage plusThemedImage2, PlusThemedImage plusThemedImage3) {
            this.title = str;
            this.benefits = list;
            this.acceptButtonText = str2;
            this.additionalButtonText = str3;
            this.rejectButtonText = str4;
            this.textColor = colorPair;
            this.backgroundColor = colorPair2;
            this.backgroundImage = plusThemedImage;
            this.iconImage = plusThemedImage2;
            this.headingImage = plusThemedImage3;
        }

        public static /* synthetic */ Template copy$default(Template template, String str, List list, String str2, String str3, String str4, ColorPair colorPair, ColorPair colorPair2, PlusThemedImage plusThemedImage, PlusThemedImage plusThemedImage2, PlusThemedImage plusThemedImage3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = template.title;
            }
            if ((i & 2) != 0) {
                list = template.benefits;
            }
            if ((i & 4) != 0) {
                str2 = template.acceptButtonText;
            }
            if ((i & 8) != 0) {
                str3 = template.additionalButtonText;
            }
            if ((i & 16) != 0) {
                str4 = template.rejectButtonText;
            }
            if ((i & 32) != 0) {
                colorPair = template.textColor;
            }
            if ((i & 64) != 0) {
                colorPair2 = template.backgroundColor;
            }
            if ((i & 128) != 0) {
                plusThemedImage = template.backgroundImage;
            }
            if ((i & 256) != 0) {
                plusThemedImage2 = template.iconImage;
            }
            if ((i & 512) != 0) {
                plusThemedImage3 = template.headingImage;
            }
            PlusThemedImage plusThemedImage4 = plusThemedImage2;
            PlusThemedImage plusThemedImage5 = plusThemedImage3;
            ColorPair colorPair3 = colorPair2;
            PlusThemedImage plusThemedImage6 = plusThemedImage;
            String str5 = str4;
            ColorPair colorPair4 = colorPair;
            return template.copy(str, list, str2, str3, str5, colorPair4, colorPair3, plusThemedImage6, plusThemedImage4, plusThemedImage5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component10, reason: from getter */
        public final PlusThemedImage getHeadingImage() {
            return this.headingImage;
        }

        public final List<String> component2() {
            return this.benefits;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAcceptButtonText() {
            return this.acceptButtonText;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAdditionalButtonText() {
            return this.additionalButtonText;
        }

        /* renamed from: component5, reason: from getter */
        public final String getRejectButtonText() {
            return this.rejectButtonText;
        }

        /* renamed from: component6, reason: from getter */
        public final ColorPair getTextColor() {
            return this.textColor;
        }

        /* renamed from: component7, reason: from getter */
        public final ColorPair getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component8, reason: from getter */
        public final PlusThemedImage getBackgroundImage() {
            return this.backgroundImage;
        }

        /* renamed from: component9, reason: from getter */
        public final PlusThemedImage getIconImage() {
            return this.iconImage;
        }

        public final Template copy(String title, List<String> benefits, String acceptButtonText, String additionalButtonText, String rejectButtonText, ColorPair textColor, ColorPair backgroundColor, PlusThemedImage backgroundImage, PlusThemedImage iconImage, PlusThemedImage headingImage) {
            return new Template(title, benefits, acceptButtonText, additionalButtonText, rejectButtonText, textColor, backgroundColor, backgroundImage, iconImage, headingImage);
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
            return jl40.l(this.title, template.title) && jl40.l(this.benefits, template.benefits) && jl40.l(this.acceptButtonText, template.acceptButtonText) && jl40.l(this.additionalButtonText, template.additionalButtonText) && jl40.l(this.rejectButtonText, template.rejectButtonText) && jl40.l(this.textColor, template.textColor) && jl40.l(this.backgroundColor, template.backgroundColor) && jl40.l(this.backgroundImage, template.backgroundImage) && jl40.l(this.iconImage, template.iconImage) && jl40.l(this.headingImage, template.headingImage);
        }

        public final String getAcceptButtonText() {
            return this.acceptButtonText;
        }

        public final String getAdditionalButtonText() {
            return this.additionalButtonText;
        }

        public final ColorPair getBackgroundColor() {
            return this.backgroundColor;
        }

        public final PlusThemedImage getBackgroundImage() {
            return this.backgroundImage;
        }

        public final List<String> getBenefits() {
            return this.benefits;
        }

        public final PlusThemedImage getHeadingImage() {
            return this.headingImage;
        }

        public final PlusThemedImage getIconImage() {
            return this.iconImage;
        }

        public final String getRejectButtonText() {
            return this.rejectButtonText;
        }

        public final ColorPair getTextColor() {
            return this.textColor;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            List<String> list = this.benefits;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.acceptButtonText;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.additionalButtonText;
            return this.headingImage.hashCode() + ((this.iconImage.hashCode() + ((this.backgroundImage.hashCode() + ((this.backgroundColor.hashCode() + ((this.textColor.hashCode() + unr0.b((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.rejectButtonText)) * 31)) * 31)) * 31)) * 31);
        }

        public String toString() {
            return "Template(title=" + this.title + ", benefits=" + this.benefits + ", acceptButtonText=" + this.acceptButtonText + ", additionalButtonText=" + this.additionalButtonText + ", rejectButtonText=" + this.rejectButtonText + ", textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ", backgroundImage=" + this.backgroundImage + ", iconImage=" + this.iconImage + ", headingImage=" + this.headingImage + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.title);
            dest.writeStringList(this.benefits);
            dest.writeString(this.acceptButtonText);
            dest.writeString(this.additionalButtonText);
            dest.writeString(this.rejectButtonText);
            dest.writeParcelable(this.textColor, flags);
            dest.writeParcelable(this.backgroundColor, flags);
            dest.writeParcelable(this.backgroundImage, flags);
            dest.writeParcelable(this.iconImage, flags);
            dest.writeParcelable(this.headingImage, flags);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Template> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Template createFromParcel(Parcel parcel) {
                return new Template(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), (ColorPair) parcel.readParcelable(Template.class.getClassLoader()), (ColorPair) parcel.readParcelable(Template.class.getClassLoader()), (PlusThemedImage) parcel.readParcelable(Template.class.getClassLoader()), (PlusThemedImage) parcel.readParcelable(Template.class.getClassLoader()), (PlusThemedImage) parcel.readParcelable(Template.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Template[] newArray(int i) {
                return new Template[i];
            }
        }
    }

    private Upsale() {
    }
}
