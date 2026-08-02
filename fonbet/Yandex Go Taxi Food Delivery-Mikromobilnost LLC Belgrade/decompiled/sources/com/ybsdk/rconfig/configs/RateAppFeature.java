package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.utils.text.Text;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.n;
import defpackage.oyr;
import defpackage.vfc;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b-\b\u0081\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b%\u0010&J\u009a\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b+\u0010\u0019J\u001a\u0010-\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b\u0003\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b2\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b3\u0010\u0019R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\u001dR\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b6\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b7\u0010\u001dR\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b8\u0010\u001dR\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b9\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b:\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b;\u0010\u001dR\u001a\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b<\u0010\u001dR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010=\u001a\u0004\b>\u0010&¨\u0006?"}, d2 = {"Lcom/ybsdk/rconfig/configs/RateAppFeature;", "", "", "isEnabled", "", "showingCount", "transactionCount", "showPeriodInDays", "Lcom/ybsdk/core/utils/text/Text;", "rateTitleText", "rateDescriptionText", "ratePositiveText", "rateNegativeText", "negativeTitleText", "negativeDescriptionText", "negativeSupportButtonText", "negativeCloseButtonText", "", "", "supportedStores", "<init>", "(ZIIILcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Ljava/util/List;)V", "component1", "()Z", "component2", "()I", "component3", "component4", "component5", "()Lcom/ybsdk/core/utils/text/Text;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "()Ljava/util/List;", "copy", "(ZIIILcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Ljava/util/List;)Lcom/ybsdk/rconfig/configs/RateAppFeature;", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", CA20Status.STATUS_USER_I, "getShowingCount", "getTransactionCount", "getShowPeriodInDays", "Lcom/ybsdk/core/utils/text/Text;", "getRateTitleText", "getRateDescriptionText", "getRatePositiveText", "getRateNegativeText", "getNegativeTitleText", "getNegativeDescriptionText", "getNegativeSupportButtonText", "getNegativeCloseButtonText", "Ljava/util/List;", "getSupportedStores", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RateAppFeature {

    @Json(name = "is_enabled")
    private final boolean isEnabled;

    @Json(name = "negative_close_button_text")
    private final Text negativeCloseButtonText;

    @Json(name = "negative_description_text")
    private final Text negativeDescriptionText;

    @Json(name = "negative_support_button_text")
    private final Text negativeSupportButtonText;

    @Json(name = "negative_title_text")
    private final Text negativeTitleText;

    @Json(name = "rate_description_text")
    private final Text rateDescriptionText;

    @Json(name = "rate_negative_text")
    private final Text rateNegativeText;

    @Json(name = "rate_positive_text")
    private final Text ratePositiveText;

    @Json(name = "rate_title_text")
    private final Text rateTitleText;

    @Json(name = "show_period_in_days")
    private final int showPeriodInDays;

    @Json(name = "showing_count")
    private final int showingCount;

    @Json(name = "supported_stores")
    private final List<String> supportedStores;

    @Json(name = "transaction_count")
    private final int transactionCount;

    public RateAppFeature(boolean z, int i, int i2, int i3, Text text, Text text2, Text text3, Text text4, Text text5, Text text6, Text text7, Text text8, List<String> list) {
        this.isEnabled = z;
        this.showingCount = i;
        this.transactionCount = i2;
        this.showPeriodInDays = i3;
        this.rateTitleText = text;
        this.rateDescriptionText = text2;
        this.ratePositiveText = text3;
        this.rateNegativeText = text4;
        this.negativeTitleText = text5;
        this.negativeDescriptionText = text6;
        this.negativeSupportButtonText = text7;
        this.negativeCloseButtonText = text8;
        this.supportedStores = list;
    }

    public static /* synthetic */ RateAppFeature copy$default(RateAppFeature rateAppFeature, boolean z, int i, int i2, int i3, Text text, Text text2, Text text3, Text text4, Text text5, Text text6, Text text7, Text text8, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = rateAppFeature.isEnabled;
        }
        return rateAppFeature.copy(z, (i4 & 2) != 0 ? rateAppFeature.showingCount : i, (i4 & 4) != 0 ? rateAppFeature.transactionCount : i2, (i4 & 8) != 0 ? rateAppFeature.showPeriodInDays : i3, (i4 & 16) != 0 ? rateAppFeature.rateTitleText : text, (i4 & 32) != 0 ? rateAppFeature.rateDescriptionText : text2, (i4 & 64) != 0 ? rateAppFeature.ratePositiveText : text3, (i4 & 128) != 0 ? rateAppFeature.rateNegativeText : text4, (i4 & 256) != 0 ? rateAppFeature.negativeTitleText : text5, (i4 & 512) != 0 ? rateAppFeature.negativeDescriptionText : text6, (i4 & 1024) != 0 ? rateAppFeature.negativeSupportButtonText : text7, (i4 & 2048) != 0 ? rateAppFeature.negativeCloseButtonText : text8, (i4 & 4096) != 0 ? rateAppFeature.supportedStores : list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component10, reason: from getter */
    public final Text getNegativeDescriptionText() {
        return this.negativeDescriptionText;
    }

    /* renamed from: component11, reason: from getter */
    public final Text getNegativeSupportButtonText() {
        return this.negativeSupportButtonText;
    }

    /* renamed from: component12, reason: from getter */
    public final Text getNegativeCloseButtonText() {
        return this.negativeCloseButtonText;
    }

    public final List<String> component13() {
        return this.supportedStores;
    }

    /* renamed from: component2, reason: from getter */
    public final int getShowingCount() {
        return this.showingCount;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTransactionCount() {
        return this.transactionCount;
    }

    /* renamed from: component4, reason: from getter */
    public final int getShowPeriodInDays() {
        return this.showPeriodInDays;
    }

    /* renamed from: component5, reason: from getter */
    public final Text getRateTitleText() {
        return this.rateTitleText;
    }

    /* renamed from: component6, reason: from getter */
    public final Text getRateDescriptionText() {
        return this.rateDescriptionText;
    }

    /* renamed from: component7, reason: from getter */
    public final Text getRatePositiveText() {
        return this.ratePositiveText;
    }

    /* renamed from: component8, reason: from getter */
    public final Text getRateNegativeText() {
        return this.rateNegativeText;
    }

    /* renamed from: component9, reason: from getter */
    public final Text getNegativeTitleText() {
        return this.negativeTitleText;
    }

    public final RateAppFeature copy(boolean isEnabled, int showingCount, int transactionCount, int showPeriodInDays, Text rateTitleText, Text rateDescriptionText, Text ratePositiveText, Text rateNegativeText, Text negativeTitleText, Text negativeDescriptionText, Text negativeSupportButtonText, Text negativeCloseButtonText, List<String> supportedStores) {
        return new RateAppFeature(isEnabled, showingCount, transactionCount, showPeriodInDays, rateTitleText, rateDescriptionText, ratePositiveText, rateNegativeText, negativeTitleText, negativeDescriptionText, negativeSupportButtonText, negativeCloseButtonText, supportedStores);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RateAppFeature)) {
            return false;
        }
        RateAppFeature rateAppFeature = (RateAppFeature) other;
        return this.isEnabled == rateAppFeature.isEnabled && this.showingCount == rateAppFeature.showingCount && this.transactionCount == rateAppFeature.transactionCount && this.showPeriodInDays == rateAppFeature.showPeriodInDays && jl40.l(this.rateTitleText, rateAppFeature.rateTitleText) && jl40.l(this.rateDescriptionText, rateAppFeature.rateDescriptionText) && jl40.l(this.ratePositiveText, rateAppFeature.ratePositiveText) && jl40.l(this.rateNegativeText, rateAppFeature.rateNegativeText) && jl40.l(this.negativeTitleText, rateAppFeature.negativeTitleText) && jl40.l(this.negativeDescriptionText, rateAppFeature.negativeDescriptionText) && jl40.l(this.negativeSupportButtonText, rateAppFeature.negativeSupportButtonText) && jl40.l(this.negativeCloseButtonText, rateAppFeature.negativeCloseButtonText) && jl40.l(this.supportedStores, rateAppFeature.supportedStores);
    }

    public final Text getNegativeCloseButtonText() {
        return this.negativeCloseButtonText;
    }

    public final Text getNegativeDescriptionText() {
        return this.negativeDescriptionText;
    }

    public final Text getNegativeSupportButtonText() {
        return this.negativeSupportButtonText;
    }

    public final Text getNegativeTitleText() {
        return this.negativeTitleText;
    }

    public final Text getRateDescriptionText() {
        return this.rateDescriptionText;
    }

    public final Text getRateNegativeText() {
        return this.rateNegativeText;
    }

    public final Text getRatePositiveText() {
        return this.ratePositiveText;
    }

    public final Text getRateTitleText() {
        return this.rateTitleText;
    }

    public final int getShowPeriodInDays() {
        return this.showPeriodInDays;
    }

    public final int getShowingCount() {
        return this.showingCount;
    }

    public final List<String> getSupportedStores() {
        return this.supportedStores;
    }

    public final int getTransactionCount() {
        return this.transactionCount;
    }

    public int hashCode() {
        int c = n.c(this.negativeCloseButtonText, n.c(this.negativeSupportButtonText, n.c(this.negativeDescriptionText, n.c(this.negativeTitleText, n.c(this.rateNegativeText, n.c(this.ratePositiveText, n.c(this.rateDescriptionText, n.c(this.rateTitleText, oyr.b(this.showPeriodInDays, oyr.b(this.transactionCount, oyr.b(this.showingCount, Boolean.hashCode(this.isEnabled) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        List<String> list = this.supportedStores;
        return c + (list == null ? 0 : list.hashCode());
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        boolean z = this.isEnabled;
        int i = this.showingCount;
        int i2 = this.transactionCount;
        int i3 = this.showPeriodInDays;
        Text text = this.rateTitleText;
        Text text2 = this.rateDescriptionText;
        Text text3 = this.ratePositiveText;
        Text text4 = this.rateNegativeText;
        Text text5 = this.negativeTitleText;
        Text text6 = this.negativeDescriptionText;
        Text text7 = this.negativeSupportButtonText;
        Text text8 = this.negativeCloseButtonText;
        List<String> list = this.supportedStores;
        StringBuilder p = xvz.p("RateAppFeature(isEnabled=", i, ", showingCount=", ", transactionCount=", z);
        vfc.u(i2, i3, ", showPeriodInDays=", ", rateTitleText=", p);
        ly3.C(p, text, ", rateDescriptionText=", text2, ", ratePositiveText=");
        ly3.C(p, text3, ", rateNegativeText=", text4, ", negativeTitleText=");
        ly3.C(p, text5, ", negativeDescriptionText=", text6, ", negativeSupportButtonText=");
        ly3.C(p, text7, ", negativeCloseButtonText=", text8, ", supportedStores=");
        return ly3.s(p, list, Extension.C_BRAKE);
    }
}
