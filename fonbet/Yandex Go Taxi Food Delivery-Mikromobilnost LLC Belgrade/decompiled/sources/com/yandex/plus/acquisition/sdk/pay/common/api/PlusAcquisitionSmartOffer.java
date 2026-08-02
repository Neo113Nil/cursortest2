package com.yandex.plus.acquisition.sdk.pay.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.acquisition.sdk.api.offers.PlusAcquisitionOffer;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import com.yandex.plus.acquisition.sdk.pay.common.api.b;
import com.yandex.yphone.service.settings.AppSettingsContract$Setting;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.b64;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.qv10;
import defpackage.sls;
import defpackage.smw0;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.xvz;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001:\u0004KLMNBe\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0010\u0010&\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b,\u0010!J\u0010\u0010-\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b/\u00100J\u0084\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b3\u0010!J\u0010\u00104\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b4\u0010\u0018J\u001a\u00107\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b=\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\b?\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b@\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\b\u000b\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010)R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010+R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\bF\u0010!R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010G\u001a\u0004\bH\u0010.R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010I\u001a\u0004\bJ\u00100¨\u0006O"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer;", "Landroid/os/Parcelable;", "", "priority", "", Constants.KEY_PAGE, "place", "Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$TargetAndFeatures;", "targetAndFeatures", "offerToken", "", "isOneClickEnabled", "Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$Texts;", "texts", "Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$Legals;", "legals", "language", "Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$Meta;", com.adjust.sdk.Constants.REFERRER_API_META, "Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionOffer;", "compositeOffer", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$TargetAndFeatures;Ljava/lang/String;ZLcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$Texts;Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$Legals;Ljava/lang/String;Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$Meta;Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionOffer;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$TargetAndFeatures;", "component5", "component6", "()Z", "component7", "()Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$Texts;", "component8", "()Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$Legals;", "component9", "component10", "()Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$Meta;", "component11", "()Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionOffer;", "copy", "(ILjava/lang/String;Ljava/lang/String;Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$TargetAndFeatures;Ljava/lang/String;ZLcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$Texts;Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$Legals;Ljava/lang/String;Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$Meta;Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionOffer;)Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getPriority", "Ljava/lang/String;", "getPage", "getPlace", "Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$TargetAndFeatures;", "getTargetAndFeatures", "getOfferToken", "Z", "Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$Texts;", "getTexts", "Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$Legals;", "getLegals", "getLanguage", "Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$Meta;", "getMeta", "Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionOffer;", "getCompositeOffer", "TargetAndFeatures", "Texts", "Legals", "Meta", "acquisition-sdk-pay-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusAcquisitionSmartOffer implements Parcelable {
    public static final Parcelable.Creator<PlusAcquisitionSmartOffer> CREATOR = new Creator();
    private final PlusAcquisitionOffer compositeOffer;
    private final boolean isOneClickEnabled;
    private final String language;
    private final Legals legals;
    private final Meta meta;
    private final String offerToken;
    private final String page;
    private final String place;
    private final int priority;
    private final TargetAndFeatures targetAndFeatures;
    private final Texts texts;

    public PlusAcquisitionSmartOffer(int i, String str, String str2, TargetAndFeatures targetAndFeatures, String str3, boolean z, Texts texts, Legals legals, String str4, Meta meta, PlusAcquisitionOffer plusAcquisitionOffer) {
        this.priority = i;
        this.page = str;
        this.place = str2;
        this.targetAndFeatures = targetAndFeatures;
        this.offerToken = str3;
        this.isOneClickEnabled = z;
        this.texts = texts;
        this.legals = legals;
        this.language = str4;
        this.meta = meta;
        this.compositeOffer = plusAcquisitionOffer;
    }

    public static /* synthetic */ PlusAcquisitionSmartOffer copy$default(PlusAcquisitionSmartOffer plusAcquisitionSmartOffer, int i, String str, String str2, TargetAndFeatures targetAndFeatures, String str3, boolean z, Texts texts, Legals legals, String str4, Meta meta, PlusAcquisitionOffer plusAcquisitionOffer, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = plusAcquisitionSmartOffer.priority;
        }
        if ((i2 & 2) != 0) {
            str = plusAcquisitionSmartOffer.page;
        }
        if ((i2 & 4) != 0) {
            str2 = plusAcquisitionSmartOffer.place;
        }
        if ((i2 & 8) != 0) {
            targetAndFeatures = plusAcquisitionSmartOffer.targetAndFeatures;
        }
        if ((i2 & 16) != 0) {
            str3 = plusAcquisitionSmartOffer.offerToken;
        }
        if ((i2 & 32) != 0) {
            z = plusAcquisitionSmartOffer.isOneClickEnabled;
        }
        if ((i2 & 64) != 0) {
            texts = plusAcquisitionSmartOffer.texts;
        }
        if ((i2 & 128) != 0) {
            legals = plusAcquisitionSmartOffer.legals;
        }
        if ((i2 & 256) != 0) {
            str4 = plusAcquisitionSmartOffer.language;
        }
        if ((i2 & 512) != 0) {
            meta = plusAcquisitionSmartOffer.meta;
        }
        if ((i2 & 1024) != 0) {
            plusAcquisitionOffer = plusAcquisitionSmartOffer.compositeOffer;
        }
        Meta meta2 = meta;
        PlusAcquisitionOffer plusAcquisitionOffer2 = plusAcquisitionOffer;
        Legals legals2 = legals;
        String str5 = str4;
        boolean z2 = z;
        Texts texts2 = texts;
        String str6 = str3;
        String str7 = str2;
        return plusAcquisitionSmartOffer.copy(i, str, str7, targetAndFeatures, str6, z2, texts2, legals2, str5, meta2, plusAcquisitionOffer2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    /* renamed from: component10, reason: from getter */
    public final Meta getMeta() {
        return this.meta;
    }

    /* renamed from: component11, reason: from getter */
    public final PlusAcquisitionOffer getCompositeOffer() {
        return this.compositeOffer;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPage() {
        return this.page;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPlace() {
        return this.place;
    }

    /* renamed from: component4, reason: from getter */
    public final TargetAndFeatures getTargetAndFeatures() {
        return this.targetAndFeatures;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOfferToken() {
        return this.offerToken;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsOneClickEnabled() {
        return this.isOneClickEnabled;
    }

    /* renamed from: component7, reason: from getter */
    public final Texts getTexts() {
        return this.texts;
    }

    /* renamed from: component8, reason: from getter */
    public final Legals getLegals() {
        return this.legals;
    }

    /* renamed from: component9, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    public final PlusAcquisitionSmartOffer copy(int priority, String page, String place, TargetAndFeatures targetAndFeatures, String offerToken, boolean isOneClickEnabled, Texts texts, Legals legals, String language, Meta meta, PlusAcquisitionOffer compositeOffer) {
        return new PlusAcquisitionSmartOffer(priority, page, place, targetAndFeatures, offerToken, isOneClickEnabled, texts, legals, language, meta, compositeOffer);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusAcquisitionSmartOffer)) {
            return false;
        }
        PlusAcquisitionSmartOffer plusAcquisitionSmartOffer = (PlusAcquisitionSmartOffer) other;
        return this.priority == plusAcquisitionSmartOffer.priority && jl40.l(this.page, plusAcquisitionSmartOffer.page) && jl40.l(this.place, plusAcquisitionSmartOffer.place) && jl40.l(this.targetAndFeatures, plusAcquisitionSmartOffer.targetAndFeatures) && jl40.l(this.offerToken, plusAcquisitionSmartOffer.offerToken) && this.isOneClickEnabled == plusAcquisitionSmartOffer.isOneClickEnabled && jl40.l(this.texts, plusAcquisitionSmartOffer.texts) && jl40.l(this.legals, plusAcquisitionSmartOffer.legals) && jl40.l(this.language, plusAcquisitionSmartOffer.language) && jl40.l(this.meta, plusAcquisitionSmartOffer.meta) && jl40.l(this.compositeOffer, plusAcquisitionSmartOffer.compositeOffer);
    }

    public final PlusAcquisitionOffer getCompositeOffer() {
        return this.compositeOffer;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Legals getLegals() {
        return this.legals;
    }

    public final Meta getMeta() {
        return this.meta;
    }

    public final String getOfferToken() {
        return this.offerToken;
    }

    public final String getPage() {
        return this.page;
    }

    public final String getPlace() {
        return this.place;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final TargetAndFeatures getTargetAndFeatures() {
        return this.targetAndFeatures;
    }

    public final Texts getTexts() {
        return this.texts;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.priority) * 31;
        String str = this.page;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.place;
        int hashCode3 = (this.targetAndFeatures.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.offerToken;
        return this.compositeOffer.hashCode() + ((this.meta.hashCode() + unr0.b((this.legals.hashCode() + ((this.texts.hashCode() + unr0.e((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.isOneClickEnabled)) * 31)) * 31, 31, this.language)) * 31);
    }

    public final boolean isOneClickEnabled() {
        return this.isOneClickEnabled;
    }

    public String toString() {
        return "PlusAcquisitionSmartOffer(priority=" + this.priority + ", page=" + this.page + ", place=" + this.place + ", targetAndFeatures=" + this.targetAndFeatures + ", offerToken=" + this.offerToken + ", isOneClickEnabled=" + this.isOneClickEnabled + ", texts=" + this.texts + ", legals=" + this.legals + ", language=" + this.language + ", meta=" + this.meta + ", compositeOffer=" + this.compositeOffer + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.priority);
        dest.writeString(this.page);
        dest.writeString(this.place);
        this.targetAndFeatures.writeToParcel(dest, flags);
        dest.writeString(this.offerToken);
        dest.writeInt(this.isOneClickEnabled ? 1 : 0);
        this.texts.writeToParcel(dest, flags);
        this.legals.writeToParcel(dest, flags);
        dest.writeString(this.language);
        this.meta.writeToParcel(dest, flags);
        dest.writeParcelable(this.compositeOffer, flags);
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J6\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\fJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0014R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0017¨\u0006'"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$Legals;", "Landroid/os/Parcelable;", "", "oneClickDisclaimer", "format", "", "Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$Legals$Argument;", "arguments", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$Legals;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOneClickDisclaimer", "getFormat", "Ljava/util/List;", "getArguments", "Argument", "acquisition-sdk-pay-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Legals implements Parcelable {
        public static final Parcelable.Creator<Legals> CREATOR = new Creator();
        private final List<Argument> arguments;
        private final String format;
        private final String oneClickDisclaimer;

        public Legals(String str, String str2, List<Argument> list) {
            this.oneClickDisclaimer = str;
            this.format = str2;
            this.arguments = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Legals copy$default(Legals legals, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = legals.oneClickDisclaimer;
            }
            if ((i & 2) != 0) {
                str2 = legals.format;
            }
            if ((i & 4) != 0) {
                list = legals.arguments;
            }
            return legals.copy(str, str2, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getOneClickDisclaimer() {
            return this.oneClickDisclaimer;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFormat() {
            return this.format;
        }

        public final List<Argument> component3() {
            return this.arguments;
        }

        public final Legals copy(String oneClickDisclaimer, String format, List<Argument> arguments) {
            return new Legals(oneClickDisclaimer, format, arguments);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Legals)) {
                return false;
            }
            Legals legals = (Legals) other;
            return jl40.l(this.oneClickDisclaimer, legals.oneClickDisclaimer) && jl40.l(this.format, legals.format) && jl40.l(this.arguments, legals.arguments);
        }

        public final List<Argument> getArguments() {
            return this.arguments;
        }

        public final String getFormat() {
            return this.format;
        }

        public final String getOneClickDisclaimer() {
            return this.oneClickDisclaimer;
        }

        public int hashCode() {
            String str = this.oneClickDisclaimer;
            return this.arguments.hashCode() + unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.format);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Legals(oneClickDisclaimer=");
            sb.append(this.oneClickDisclaimer);
            sb.append(", format=");
            sb.append(this.format);
            sb.append(", arguments=");
            return unr0.t(sb, this.arguments, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.oneClickDisclaimer);
            dest.writeString(this.format);
            Iterator t = vfc.t(dest, this.arguments);
            while (t.hasNext()) {
                ((Argument) t.next()).writeToParcel(dest, flags);
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\nJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0012¨\u0006\""}, d2 = {"Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$Legals$Argument;", "Landroid/os/Parcelable;", "", "key", "value", LaunchBrowserActivity.KEY_URI, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$Legals$Argument;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "getValue", "getUri", "acquisition-sdk-pay-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Argument implements Parcelable {
            public static final Parcelable.Creator<Argument> CREATOR = new Creator();
            private final String key;
            private final String uri;
            private final String value;

            public Argument(String str, String str2, String str3) {
                this.key = str;
                this.value = str2;
                this.uri = str3;
            }

            public static /* synthetic */ Argument copy$default(Argument argument, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = argument.key;
                }
                if ((i & 2) != 0) {
                    str2 = argument.value;
                }
                if ((i & 4) != 0) {
                    str3 = argument.uri;
                }
                return argument.copy(str, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* renamed from: component2, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            /* renamed from: component3, reason: from getter */
            public final String getUri() {
                return this.uri;
            }

            public final Argument copy(String key, String value, String uri) {
                return new Argument(key, value, uri);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Argument)) {
                    return false;
                }
                Argument argument = (Argument) other;
                return jl40.l(this.key, argument.key) && jl40.l(this.value, argument.value) && jl40.l(this.uri, argument.uri);
            }

            public final String getKey() {
                return this.key;
            }

            public final String getUri() {
                return this.uri;
            }

            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.uri.hashCode() + unr0.b(this.key.hashCode() * 31, 31, this.value);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Argument(key=");
                sb.append(this.key);
                sb.append(", value=");
                sb.append(this.value);
                sb.append(", uri=");
                return b64.p(sb, this.uri, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.key);
                dest.writeString(this.value);
                dest.writeString(this.uri);
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Argument> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Argument createFromParcel(Parcel parcel) {
                    return new Argument(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Argument[] newArray(int i) {
                    return new Argument[i];
                }
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Legals> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Legals createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = oo31.d(Argument.CREATOR, parcel, arrayList, i, 1);
                }
                return new Legals(readString, readString2, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Legals[] newArray(int i) {
                return new Legals[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016JR\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\fHÖ\u0001¢\u0006\u0004\b \u0010\u000eJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b-\u0010\u0016¨\u0006."}, d2 = {"Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$Meta;", "Landroid/os/Parcelable;", "", "sessionId", "batchId", "positionId", "mlRequestId", "", "configId", "placeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Long;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$Meta;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSessionId", "getBatchId", "getPositionId", "getMlRequestId", "Ljava/lang/Long;", "getConfigId", "getPlaceId", "acquisition-sdk-pay-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Meta implements Parcelable {
        public static final Parcelable.Creator<Meta> CREATOR = new Creator();
        private final String batchId;
        private final Long configId;
        private final String mlRequestId;
        private final String placeId;
        private final String positionId;
        private final String sessionId;

        public Meta(String str, String str2, String str3, String str4, Long l, String str5) {
            this.sessionId = str;
            this.batchId = str2;
            this.positionId = str3;
            this.mlRequestId = str4;
            this.configId = l;
            this.placeId = str5;
        }

        public static /* synthetic */ Meta copy$default(Meta meta, String str, String str2, String str3, String str4, Long l, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = meta.sessionId;
            }
            if ((i & 2) != 0) {
                str2 = meta.batchId;
            }
            if ((i & 4) != 0) {
                str3 = meta.positionId;
            }
            if ((i & 8) != 0) {
                str4 = meta.mlRequestId;
            }
            if ((i & 16) != 0) {
                l = meta.configId;
            }
            if ((i & 32) != 0) {
                str5 = meta.placeId;
            }
            Long l2 = l;
            String str6 = str5;
            return meta.copy(str, str2, str3, str4, l2, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBatchId() {
            return this.batchId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPositionId() {
            return this.positionId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getMlRequestId() {
            return this.mlRequestId;
        }

        /* renamed from: component5, reason: from getter */
        public final Long getConfigId() {
            return this.configId;
        }

        /* renamed from: component6, reason: from getter */
        public final String getPlaceId() {
            return this.placeId;
        }

        public final Meta copy(String sessionId, String batchId, String positionId, String mlRequestId, Long configId, String placeId) {
            return new Meta(sessionId, batchId, positionId, mlRequestId, configId, placeId);
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
            return jl40.l(this.sessionId, meta.sessionId) && jl40.l(this.batchId, meta.batchId) && jl40.l(this.positionId, meta.positionId) && jl40.l(this.mlRequestId, meta.mlRequestId) && jl40.l(this.configId, meta.configId) && jl40.l(this.placeId, meta.placeId);
        }

        public final String getBatchId() {
            return this.batchId;
        }

        public final Long getConfigId() {
            return this.configId;
        }

        public final String getMlRequestId() {
            return this.mlRequestId;
        }

        public final String getPlaceId() {
            return this.placeId;
        }

        public final String getPositionId() {
            return this.positionId;
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        public int hashCode() {
            int b = unr0.b(unr0.b(this.sessionId.hashCode() * 31, 31, this.batchId), 31, this.positionId);
            String str = this.mlRequestId;
            int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
            Long l = this.configId;
            int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
            String str2 = this.placeId;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Meta(sessionId=");
            sb.append(this.sessionId);
            sb.append(", batchId=");
            sb.append(this.batchId);
            sb.append(", positionId=");
            sb.append(this.positionId);
            sb.append(", mlRequestId=");
            sb.append(this.mlRequestId);
            sb.append(", configId=");
            sb.append(this.configId);
            sb.append(", placeId=");
            return b64.p(sb, this.placeId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.sessionId);
            dest.writeString(this.batchId);
            dest.writeString(this.positionId);
            dest.writeString(this.mlRequestId);
            Long l = this.configId;
            if (l == null) {
                dest.writeInt(0);
            } else {
                xvz.z(dest, 1, l);
            }
            dest.writeString(this.placeId);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Meta> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Meta createFromParcel(Parcel parcel) {
                return new Meta(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Meta[] newArray(int i) {
                return new Meta[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\nJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$TargetAndFeatures;", "Landroid/os/Parcelable;", "", "target", "", "features", "<init>", "(Ljava/lang/String;Ljava/util/Set;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Set;", "copy", "(Ljava/lang/String;Ljava/util/Set;)Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$TargetAndFeatures;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTarget", "Ljava/util/Set;", "getFeatures", "acquisition-sdk-pay-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TargetAndFeatures implements Parcelable {
        public static final Parcelable.Creator<TargetAndFeatures> CREATOR = new Creator();
        private final Set<String> features;
        private final String target;

        public TargetAndFeatures(String str, Set<String> set) {
            this.target = str;
            this.features = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TargetAndFeatures copy$default(TargetAndFeatures targetAndFeatures, String str, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                str = targetAndFeatures.target;
            }
            if ((i & 2) != 0) {
                set = targetAndFeatures.features;
            }
            return targetAndFeatures.copy(str, set);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTarget() {
            return this.target;
        }

        public final Set<String> component2() {
            return this.features;
        }

        public final TargetAndFeatures copy(String target, Set<String> features) {
            return new TargetAndFeatures(target, features);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TargetAndFeatures)) {
                return false;
            }
            TargetAndFeatures targetAndFeatures = (TargetAndFeatures) other;
            return jl40.l(this.target, targetAndFeatures.target) && jl40.l(this.features, targetAndFeatures.features);
        }

        public final Set<String> getFeatures() {
            return this.features;
        }

        public final String getTarget() {
            return this.target;
        }

        public int hashCode() {
            return this.features.hashCode() + (this.target.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("TargetAndFeatures(target=");
            sb.append(this.target);
            sb.append(", features=");
            return qv10.s(sb, this.features, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.target);
            Set<String> set = this.features;
            dest.writeInt(set.size());
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next());
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TargetAndFeatures> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TargetAndFeatures createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new TargetAndFeatures(readString, linkedHashSet);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TargetAndFeatures[] newArray(int i) {
                return new TargetAndFeatures[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 S2\u00020\u0001:\u00023TBw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001cJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001cJ\u001c\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000eHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0098\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000eHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001cJ\u0010\u0010,\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b,\u0010\u0014J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u00020\u0002H\u0002¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b9\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b:\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b;\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b<\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b=\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b>\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b?\u0010\u001cR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b@\u0010\u001cR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\bA\u0010\u001cR#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bC\u0010(R#\u0010I\u001a\u0004\u0018\u00010\u00028FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\bD\u0010E\u0012\u0004\bG\u0010H\u001a\u0004\bF\u0010\u001cR!\u0010N\u001a\u0002038FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\bJ\u0010E\u0012\u0004\bM\u0010H\u001a\u0004\bK\u0010LR!\u0010R\u001a\u0002038FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\bO\u0010E\u0012\u0004\bQ\u0010H\u001a\u0004\bP\u0010L¨\u0006U"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$Texts;", "Landroid/os/Parcelable;", "", "subscriptionName", "buttonText", "buttonTextWithDetails", "combinedIntroductoryText", "combinedPriceText", "combinedFullOfferText", "priceInMonth", "commonPrice", "currencySymbol", "discountPercent", "fullPriceText", "", "customTexts", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/yandex/plus/acquisition/sdk/pay/common/api/PlusAcquisitionSmartOffer$Texts;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", AppSettingsContract$Setting.COLUMN_PREFIX, "Lcom/yandex/plus/acquisition/sdk/pay/common/api/b;", "createCompositeProductTexts", "(Ljava/lang/String;)Lcom/yandex/plus/acquisition/sdk/pay/common/api/b;", "Ljava/lang/String;", "getSubscriptionName", "getButtonText", "getButtonTextWithDetails", "getCombinedIntroductoryText", "getCombinedPriceText", "getCombinedFullOfferText", "getPriceInMonth", "getCommonPrice", "getCurrencySymbol", "getDiscountPercent", "getFullPriceText", "Ljava/util/Map;", "getCustomTexts", "pointsText$delegate", "Li3y;", "getPointsText", "getPointsText$annotations", "()V", Texts.POINTS_TEXT, "compositeTariffTexts$delegate", "getCompositeTariffTexts", "()Lcom/yandex/plus/acquisition/sdk/pay/common/api/b;", "getCompositeTariffTexts$annotations", "compositeTariffTexts", "compositeOptionTexts$delegate", "getCompositeOptionTexts", "getCompositeOptionTexts$annotations", "compositeOptionTexts", "Companion", "com/yandex/plus/acquisition/sdk/pay/common/api/a", "acquisition-sdk-pay-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Texts implements Parcelable {

        @Deprecated
        public static final String ICON_LINK = "IconLink";

        @Deprecated
        public static final String INTRODUCTORY_TEXT = "IntroductoryText";

        @Deprecated
        public static final String NAME = "Name";

        @Deprecated
        public static final String OPTION_PREFIX = "option";

        @Deprecated
        public static final String POINTS_TEXT = "pointsText";

        @Deprecated
        public static final String PRICE_TEXT = "PriceText";

        @Deprecated
        public static final String TARIFF_PREFIX = "tariff";
        private final String buttonText;
        private final String buttonTextWithDetails;
        private final String combinedFullOfferText;
        private final String combinedIntroductoryText;
        private final String combinedPriceText;
        private final String commonPrice;

        /* renamed from: compositeOptionTexts$delegate, reason: from kotlin metadata */
        private final i3y compositeOptionTexts;

        /* renamed from: compositeTariffTexts$delegate, reason: from kotlin metadata */
        private final i3y compositeTariffTexts;
        private final String currencySymbol;
        private final Map<String, String> customTexts;
        private final String discountPercent;
        private final String fullPriceText;

        /* renamed from: pointsText$delegate, reason: from kotlin metadata */
        private final i3y pointsText;
        private final String priceInMonth;
        private final String subscriptionName;
        private static final a Companion = new a();
        public static final Parcelable.Creator<Texts> CREATOR = new Creator();

        public Texts(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Map<String, String> map) {
            this.subscriptionName = str;
            this.buttonText = str2;
            this.buttonTextWithDetails = str3;
            this.combinedIntroductoryText = str4;
            this.combinedPriceText = str5;
            this.combinedFullOfferText = str6;
            this.priceInMonth = str7;
            this.commonPrice = str8;
            this.currencySymbol = str9;
            this.discountPercent = str10;
            this.fullPriceText = str11;
            this.customTexts = map;
            final int i = 0;
            this.pointsText = kotlin.a.a(new sls(this) { // from class: h0d0
                public final /* synthetic */ PlusAcquisitionSmartOffer.Texts b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    String pointsText_delegate$lambda$0;
                    b compositeTariffTexts_delegate$lambda$1;
                    b compositeOptionTexts_delegate$lambda$2;
                    int i2 = i;
                    PlusAcquisitionSmartOffer.Texts texts = this.b;
                    switch (i2) {
                        case 0:
                            pointsText_delegate$lambda$0 = PlusAcquisitionSmartOffer.Texts.pointsText_delegate$lambda$0(texts);
                            return pointsText_delegate$lambda$0;
                        case 1:
                            compositeTariffTexts_delegate$lambda$1 = PlusAcquisitionSmartOffer.Texts.compositeTariffTexts_delegate$lambda$1(texts);
                            return compositeTariffTexts_delegate$lambda$1;
                        default:
                            compositeOptionTexts_delegate$lambda$2 = PlusAcquisitionSmartOffer.Texts.compositeOptionTexts_delegate$lambda$2(texts);
                            return compositeOptionTexts_delegate$lambda$2;
                    }
                }
            });
            final int i2 = 1;
            this.compositeTariffTexts = kotlin.a.a(new sls(this) { // from class: h0d0
                public final /* synthetic */ PlusAcquisitionSmartOffer.Texts b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    String pointsText_delegate$lambda$0;
                    b compositeTariffTexts_delegate$lambda$1;
                    b compositeOptionTexts_delegate$lambda$2;
                    int i22 = i2;
                    PlusAcquisitionSmartOffer.Texts texts = this.b;
                    switch (i22) {
                        case 0:
                            pointsText_delegate$lambda$0 = PlusAcquisitionSmartOffer.Texts.pointsText_delegate$lambda$0(texts);
                            return pointsText_delegate$lambda$0;
                        case 1:
                            compositeTariffTexts_delegate$lambda$1 = PlusAcquisitionSmartOffer.Texts.compositeTariffTexts_delegate$lambda$1(texts);
                            return compositeTariffTexts_delegate$lambda$1;
                        default:
                            compositeOptionTexts_delegate$lambda$2 = PlusAcquisitionSmartOffer.Texts.compositeOptionTexts_delegate$lambda$2(texts);
                            return compositeOptionTexts_delegate$lambda$2;
                    }
                }
            });
            final int i3 = 2;
            this.compositeOptionTexts = kotlin.a.a(new sls(this) { // from class: h0d0
                public final /* synthetic */ PlusAcquisitionSmartOffer.Texts b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    String pointsText_delegate$lambda$0;
                    b compositeTariffTexts_delegate$lambda$1;
                    b compositeOptionTexts_delegate$lambda$2;
                    int i22 = i3;
                    PlusAcquisitionSmartOffer.Texts texts = this.b;
                    switch (i22) {
                        case 0:
                            pointsText_delegate$lambda$0 = PlusAcquisitionSmartOffer.Texts.pointsText_delegate$lambda$0(texts);
                            return pointsText_delegate$lambda$0;
                        case 1:
                            compositeTariffTexts_delegate$lambda$1 = PlusAcquisitionSmartOffer.Texts.compositeTariffTexts_delegate$lambda$1(texts);
                            return compositeTariffTexts_delegate$lambda$1;
                        default:
                            compositeOptionTexts_delegate$lambda$2 = PlusAcquisitionSmartOffer.Texts.compositeOptionTexts_delegate$lambda$2(texts);
                            return compositeOptionTexts_delegate$lambda$2;
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b compositeOptionTexts_delegate$lambda$2(Texts texts) {
            return texts.createCompositeProductTexts(OPTION_PREFIX);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b compositeTariffTexts_delegate$lambda$1(Texts texts) {
            return texts.createCompositeProductTexts(TARIFF_PREFIX);
        }

        public static /* synthetic */ Texts copy$default(Texts texts, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = texts.subscriptionName;
            }
            if ((i & 2) != 0) {
                str2 = texts.buttonText;
            }
            if ((i & 4) != 0) {
                str3 = texts.buttonTextWithDetails;
            }
            if ((i & 8) != 0) {
                str4 = texts.combinedIntroductoryText;
            }
            if ((i & 16) != 0) {
                str5 = texts.combinedPriceText;
            }
            if ((i & 32) != 0) {
                str6 = texts.combinedFullOfferText;
            }
            if ((i & 64) != 0) {
                str7 = texts.priceInMonth;
            }
            if ((i & 128) != 0) {
                str8 = texts.commonPrice;
            }
            if ((i & 256) != 0) {
                str9 = texts.currencySymbol;
            }
            if ((i & 512) != 0) {
                str10 = texts.discountPercent;
            }
            if ((i & 1024) != 0) {
                str11 = texts.fullPriceText;
            }
            if ((i & 2048) != 0) {
                map = texts.customTexts;
            }
            String str12 = str11;
            Map map2 = map;
            String str13 = str9;
            String str14 = str10;
            String str15 = str7;
            String str16 = str8;
            String str17 = str5;
            String str18 = str6;
            return texts.copy(str, str2, str3, str4, str17, str18, str15, str16, str13, str14, str12, map2);
        }

        private final b createCompositeProductTexts(String prefix) {
            String str = this.customTexts.get(prefix + NAME);
            if (str == null) {
                str = "";
            }
            String str2 = this.customTexts.get(prefix + INTRODUCTORY_TEXT);
            if (str2 == null) {
                str2 = "";
            }
            String str3 = this.customTexts.get(prefix + PRICE_TEXT);
            if (str3 == null) {
                str3 = "";
            }
            String str4 = this.customTexts.get(prefix + ICON_LINK);
            return new b(str, str2, str3, str4 != null ? str4 : "");
        }

        public static /* synthetic */ void getCompositeOptionTexts$annotations() {
        }

        public static /* synthetic */ void getCompositeTariffTexts$annotations() {
        }

        public static /* synthetic */ void getPointsText$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String pointsText_delegate$lambda$0(Texts texts) {
            return texts.customTexts.get(POINTS_TEXT);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSubscriptionName() {
            return this.subscriptionName;
        }

        /* renamed from: component10, reason: from getter */
        public final String getDiscountPercent() {
            return this.discountPercent;
        }

        /* renamed from: component11, reason: from getter */
        public final String getFullPriceText() {
            return this.fullPriceText;
        }

        public final Map<String, String> component12() {
            return this.customTexts;
        }

        /* renamed from: component2, reason: from getter */
        public final String getButtonText() {
            return this.buttonText;
        }

        /* renamed from: component3, reason: from getter */
        public final String getButtonTextWithDetails() {
            return this.buttonTextWithDetails;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCombinedIntroductoryText() {
            return this.combinedIntroductoryText;
        }

        /* renamed from: component5, reason: from getter */
        public final String getCombinedPriceText() {
            return this.combinedPriceText;
        }

        /* renamed from: component6, reason: from getter */
        public final String getCombinedFullOfferText() {
            return this.combinedFullOfferText;
        }

        /* renamed from: component7, reason: from getter */
        public final String getPriceInMonth() {
            return this.priceInMonth;
        }

        /* renamed from: component8, reason: from getter */
        public final String getCommonPrice() {
            return this.commonPrice;
        }

        /* renamed from: component9, reason: from getter */
        public final String getCurrencySymbol() {
            return this.currencySymbol;
        }

        public final Texts copy(String subscriptionName, String buttonText, String buttonTextWithDetails, String combinedIntroductoryText, String combinedPriceText, String combinedFullOfferText, String priceInMonth, String commonPrice, String currencySymbol, String discountPercent, String fullPriceText, Map<String, String> customTexts) {
            return new Texts(subscriptionName, buttonText, buttonTextWithDetails, combinedIntroductoryText, combinedPriceText, combinedFullOfferText, priceInMonth, commonPrice, currencySymbol, discountPercent, fullPriceText, customTexts);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Texts)) {
                return false;
            }
            Texts texts = (Texts) other;
            return jl40.l(this.subscriptionName, texts.subscriptionName) && jl40.l(this.buttonText, texts.buttonText) && jl40.l(this.buttonTextWithDetails, texts.buttonTextWithDetails) && jl40.l(this.combinedIntroductoryText, texts.combinedIntroductoryText) && jl40.l(this.combinedPriceText, texts.combinedPriceText) && jl40.l(this.combinedFullOfferText, texts.combinedFullOfferText) && jl40.l(this.priceInMonth, texts.priceInMonth) && jl40.l(this.commonPrice, texts.commonPrice) && jl40.l(this.currencySymbol, texts.currencySymbol) && jl40.l(this.discountPercent, texts.discountPercent) && jl40.l(this.fullPriceText, texts.fullPriceText) && jl40.l(this.customTexts, texts.customTexts);
        }

        public final String getButtonText() {
            return this.buttonText;
        }

        public final String getButtonTextWithDetails() {
            return this.buttonTextWithDetails;
        }

        public final String getCombinedFullOfferText() {
            return this.combinedFullOfferText;
        }

        public final String getCombinedIntroductoryText() {
            return this.combinedIntroductoryText;
        }

        public final String getCombinedPriceText() {
            return this.combinedPriceText;
        }

        public final String getCommonPrice() {
            return this.commonPrice;
        }

        public final b getCompositeOptionTexts() {
            return (b) this.compositeOptionTexts.getValue();
        }

        public final b getCompositeTariffTexts() {
            return (b) this.compositeTariffTexts.getValue();
        }

        public final String getCurrencySymbol() {
            return this.currencySymbol;
        }

        public final Map<String, String> getCustomTexts() {
            return this.customTexts;
        }

        public final String getDiscountPercent() {
            return this.discountPercent;
        }

        public final String getFullPriceText() {
            return this.fullPriceText;
        }

        public final String getPointsText() {
            return (String) this.pointsText.getValue();
        }

        public final String getPriceInMonth() {
            return this.priceInMonth;
        }

        public final String getSubscriptionName() {
            return this.subscriptionName;
        }

        public int hashCode() {
            int b = unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.subscriptionName.hashCode() * 31, 31, this.buttonText), 31, this.buttonTextWithDetails), 31, this.combinedIntroductoryText), 31, this.combinedPriceText), 31, this.combinedFullOfferText), 31, this.priceInMonth), 31, this.commonPrice), 31, this.currencySymbol);
            String str = this.discountPercent;
            int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.fullPriceText;
            return this.customTexts.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Texts(subscriptionName=");
            sb.append(this.subscriptionName);
            sb.append(", buttonText=");
            sb.append(this.buttonText);
            sb.append(", buttonTextWithDetails=");
            sb.append(this.buttonTextWithDetails);
            sb.append(", combinedIntroductoryText=");
            sb.append(this.combinedIntroductoryText);
            sb.append(", combinedPriceText=");
            sb.append(this.combinedPriceText);
            sb.append(", combinedFullOfferText=");
            sb.append(this.combinedFullOfferText);
            sb.append(", priceInMonth=");
            sb.append(this.priceInMonth);
            sb.append(", commonPrice=");
            sb.append(this.commonPrice);
            sb.append(", currencySymbol=");
            sb.append(this.currencySymbol);
            sb.append(", discountPercent=");
            sb.append(this.discountPercent);
            sb.append(", fullPriceText=");
            sb.append(this.fullPriceText);
            sb.append(", customTexts=");
            return smw0.n(sb, this.customTexts, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.subscriptionName);
            dest.writeString(this.buttonText);
            dest.writeString(this.buttonTextWithDetails);
            dest.writeString(this.combinedIntroductoryText);
            dest.writeString(this.combinedPriceText);
            dest.writeString(this.combinedFullOfferText);
            dest.writeString(this.priceInMonth);
            dest.writeString(this.commonPrice);
            dest.writeString(this.currencySymbol);
            dest.writeString(this.discountPercent);
            dest.writeString(this.fullPriceText);
            Iterator x = qv10.x(this.customTexts, dest);
            while (x.hasNext()) {
                Map.Entry entry = (Map.Entry) x.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Texts> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Texts createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                int i = 0;
                while (i != readInt) {
                    i = xvz.b(parcel, linkedHashMap, parcel.readString(), i, 1);
                    readInt = readInt;
                }
                return new Texts(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Texts[] newArray(int i) {
                return new Texts[i];
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusAcquisitionSmartOffer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusAcquisitionSmartOffer createFromParcel(Parcel parcel) {
            return new PlusAcquisitionSmartOffer(parcel.readInt(), parcel.readString(), parcel.readString(), TargetAndFeatures.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, Texts.CREATOR.createFromParcel(parcel), Legals.CREATOR.createFromParcel(parcel), parcel.readString(), Meta.CREATOR.createFromParcel(parcel), (PlusAcquisitionOffer) parcel.readParcelable(PlusAcquisitionSmartOffer.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusAcquisitionSmartOffer[] newArray(int i) {
            return new PlusAcquisitionSmartOffer[i];
        }
    }
}
