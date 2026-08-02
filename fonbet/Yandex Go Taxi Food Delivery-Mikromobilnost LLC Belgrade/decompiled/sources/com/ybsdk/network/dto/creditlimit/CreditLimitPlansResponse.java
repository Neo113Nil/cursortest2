package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u00013Bo\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\n\u0012\b\b\u0001\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003Jq\u0010,\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\f\u001a\u00020\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\n2\b\b\u0003\u0010\u0011\u001a\u00020\nHÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001b¨\u00064"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlansResponse;", "", "upgradeStatus", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlansResponse$UpgradeStatus;", "limit", "Lcom/ybsdk/network/dto/creditlimit/CreditPlanLimitResponse;", "plans", "", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanResponse;", "splitCardId", "", "onboardingUrl", "publicDocuments", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPublicDocumentsResponse;", "creditPaymentMethod", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPaymentMethodResponse;", "changePaymentMethodAction", "appLink", "<init>", "(Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlansResponse$UpgradeStatus;Lcom/ybsdk/network/dto/creditlimit/CreditPlanLimitResponse;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/network/dto/creditlimit/CreditLimitPublicDocumentsResponse;Lcom/ybsdk/network/dto/creditlimit/CreditLimitPaymentMethodResponse;Ljava/lang/String;Ljava/lang/String;)V", "getUpgradeStatus", "()Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlansResponse$UpgradeStatus;", "getLimit", "()Lcom/ybsdk/network/dto/creditlimit/CreditPlanLimitResponse;", "getPlans", "()Ljava/util/List;", "getSplitCardId", "()Ljava/lang/String;", "getOnboardingUrl", "getPublicDocuments", "()Lcom/ybsdk/network/dto/creditlimit/CreditLimitPublicDocumentsResponse;", "getCreditPaymentMethod", "()Lcom/ybsdk/network/dto/creditlimit/CreditLimitPaymentMethodResponse;", "getChangePaymentMethodAction", "getAppLink", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "UpgradeStatus", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditLimitPlansResponse {
    private final String appLink;
    private final String changePaymentMethodAction;
    private final CreditLimitPaymentMethodResponse creditPaymentMethod;
    private final CreditPlanLimitResponse limit;
    private final String onboardingUrl;
    private final List<CreditLimitPlanResponse> plans;
    private final CreditLimitPublicDocumentsResponse publicDocuments;
    private final String splitCardId;
    private final UpgradeStatus upgradeStatus;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlansResponse$UpgradeStatus;", "", "<init>", "(Ljava/lang/String;I)V", "UPGRADED", "SHOW_UPGRADE", "DONT_SHOW_UPGRADE", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class UpgradeStatus {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ UpgradeStatus[] $VALUES;
        public static final UpgradeStatus UPGRADED = new UpgradeStatus("UPGRADED", 0);
        public static final UpgradeStatus SHOW_UPGRADE = new UpgradeStatus("SHOW_UPGRADE", 1);
        public static final UpgradeStatus DONT_SHOW_UPGRADE = new UpgradeStatus("DONT_SHOW_UPGRADE", 2);

        private static final /* synthetic */ UpgradeStatus[] $values() {
            return new UpgradeStatus[]{UPGRADED, SHOW_UPGRADE, DONT_SHOW_UPGRADE};
        }

        static {
            UpgradeStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private UpgradeStatus(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static UpgradeStatus valueOf(String str) {
            return (UpgradeStatus) Enum.valueOf(UpgradeStatus.class, str);
        }

        public static UpgradeStatus[] values() {
            return (UpgradeStatus[]) $VALUES.clone();
        }
    }

    public CreditLimitPlansResponse(@Json(name = "upgrade_status") UpgradeStatus upgradeStatus, @Json(name = "limit") CreditPlanLimitResponse creditPlanLimitResponse, @Json(name = "plans") List<CreditLimitPlanResponse> list, @Json(name = "split_card_id") String str, @Json(name = "onboarding_url") String str2, @Json(name = "public_documents") CreditLimitPublicDocumentsResponse creditLimitPublicDocumentsResponse, @Json(name = "credit_payment_method") CreditLimitPaymentMethodResponse creditLimitPaymentMethodResponse, @Json(name = "change_payment_method_action") String str3, @Json(name = "JSON_FIELD_MEMBER_APP_LINK") String str4) {
        this.upgradeStatus = upgradeStatus;
        this.limit = creditPlanLimitResponse;
        this.plans = list;
        this.splitCardId = str;
        this.onboardingUrl = str2;
        this.publicDocuments = creditLimitPublicDocumentsResponse;
        this.creditPaymentMethod = creditLimitPaymentMethodResponse;
        this.changePaymentMethodAction = str3;
        this.appLink = str4;
    }

    public static /* synthetic */ CreditLimitPlansResponse copy$default(CreditLimitPlansResponse creditLimitPlansResponse, UpgradeStatus upgradeStatus, CreditPlanLimitResponse creditPlanLimitResponse, List list, String str, String str2, CreditLimitPublicDocumentsResponse creditLimitPublicDocumentsResponse, CreditLimitPaymentMethodResponse creditLimitPaymentMethodResponse, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            upgradeStatus = creditLimitPlansResponse.upgradeStatus;
        }
        if ((i & 2) != 0) {
            creditPlanLimitResponse = creditLimitPlansResponse.limit;
        }
        if ((i & 4) != 0) {
            list = creditLimitPlansResponse.plans;
        }
        if ((i & 8) != 0) {
            str = creditLimitPlansResponse.splitCardId;
        }
        if ((i & 16) != 0) {
            str2 = creditLimitPlansResponse.onboardingUrl;
        }
        if ((i & 32) != 0) {
            creditLimitPublicDocumentsResponse = creditLimitPlansResponse.publicDocuments;
        }
        if ((i & 64) != 0) {
            creditLimitPaymentMethodResponse = creditLimitPlansResponse.creditPaymentMethod;
        }
        if ((i & 128) != 0) {
            str3 = creditLimitPlansResponse.changePaymentMethodAction;
        }
        if ((i & 256) != 0) {
            str4 = creditLimitPlansResponse.appLink;
        }
        String str5 = str3;
        String str6 = str4;
        CreditLimitPublicDocumentsResponse creditLimitPublicDocumentsResponse2 = creditLimitPublicDocumentsResponse;
        CreditLimitPaymentMethodResponse creditLimitPaymentMethodResponse2 = creditLimitPaymentMethodResponse;
        String str7 = str2;
        List list2 = list;
        return creditLimitPlansResponse.copy(upgradeStatus, creditPlanLimitResponse, list2, str, str7, creditLimitPublicDocumentsResponse2, creditLimitPaymentMethodResponse2, str5, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final UpgradeStatus getUpgradeStatus() {
        return this.upgradeStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final CreditPlanLimitResponse getLimit() {
        return this.limit;
    }

    public final List<CreditLimitPlanResponse> component3() {
        return this.plans;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSplitCardId() {
        return this.splitCardId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOnboardingUrl() {
        return this.onboardingUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final CreditLimitPublicDocumentsResponse getPublicDocuments() {
        return this.publicDocuments;
    }

    /* renamed from: component7, reason: from getter */
    public final CreditLimitPaymentMethodResponse getCreditPaymentMethod() {
        return this.creditPaymentMethod;
    }

    /* renamed from: component8, reason: from getter */
    public final String getChangePaymentMethodAction() {
        return this.changePaymentMethodAction;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAppLink() {
        return this.appLink;
    }

    public final CreditLimitPlansResponse copy(@Json(name = "upgrade_status") UpgradeStatus upgradeStatus, @Json(name = "limit") CreditPlanLimitResponse limit, @Json(name = "plans") List<CreditLimitPlanResponse> plans, @Json(name = "split_card_id") String splitCardId, @Json(name = "onboarding_url") String onboardingUrl, @Json(name = "public_documents") CreditLimitPublicDocumentsResponse publicDocuments, @Json(name = "credit_payment_method") CreditLimitPaymentMethodResponse creditPaymentMethod, @Json(name = "change_payment_method_action") String changePaymentMethodAction, @Json(name = "JSON_FIELD_MEMBER_APP_LINK") String appLink) {
        return new CreditLimitPlansResponse(upgradeStatus, limit, plans, splitCardId, onboardingUrl, publicDocuments, creditPaymentMethod, changePaymentMethodAction, appLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditLimitPlansResponse)) {
            return false;
        }
        CreditLimitPlansResponse creditLimitPlansResponse = (CreditLimitPlansResponse) other;
        return this.upgradeStatus == creditLimitPlansResponse.upgradeStatus && jl40.l(this.limit, creditLimitPlansResponse.limit) && jl40.l(this.plans, creditLimitPlansResponse.plans) && jl40.l(this.splitCardId, creditLimitPlansResponse.splitCardId) && jl40.l(this.onboardingUrl, creditLimitPlansResponse.onboardingUrl) && jl40.l(this.publicDocuments, creditLimitPlansResponse.publicDocuments) && jl40.l(this.creditPaymentMethod, creditLimitPlansResponse.creditPaymentMethod) && jl40.l(this.changePaymentMethodAction, creditLimitPlansResponse.changePaymentMethodAction) && jl40.l(this.appLink, creditLimitPlansResponse.appLink);
    }

    public final String getAppLink() {
        return this.appLink;
    }

    public final String getChangePaymentMethodAction() {
        return this.changePaymentMethodAction;
    }

    public final CreditLimitPaymentMethodResponse getCreditPaymentMethod() {
        return this.creditPaymentMethod;
    }

    public final CreditPlanLimitResponse getLimit() {
        return this.limit;
    }

    public final String getOnboardingUrl() {
        return this.onboardingUrl;
    }

    public final List<CreditLimitPlanResponse> getPlans() {
        return this.plans;
    }

    public final CreditLimitPublicDocumentsResponse getPublicDocuments() {
        return this.publicDocuments;
    }

    public final String getSplitCardId() {
        return this.splitCardId;
    }

    public final UpgradeStatus getUpgradeStatus() {
        return this.upgradeStatus;
    }

    public int hashCode() {
        int hashCode = this.upgradeStatus.hashCode() * 31;
        CreditPlanLimitResponse creditPlanLimitResponse = this.limit;
        int c = unr0.c((hashCode + (creditPlanLimitResponse == null ? 0 : creditPlanLimitResponse.hashCode())) * 31, 31, this.plans);
        String str = this.splitCardId;
        int hashCode2 = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.onboardingUrl;
        int hashCode3 = (this.publicDocuments.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        CreditLimitPaymentMethodResponse creditLimitPaymentMethodResponse = this.creditPaymentMethod;
        return this.appLink.hashCode() + unr0.b((hashCode3 + (creditLimitPaymentMethodResponse != null ? creditLimitPaymentMethodResponse.hashCode() : 0)) * 31, 31, this.changePaymentMethodAction);
    }

    public String toString() {
        UpgradeStatus upgradeStatus = this.upgradeStatus;
        CreditPlanLimitResponse creditPlanLimitResponse = this.limit;
        List<CreditLimitPlanResponse> list = this.plans;
        String str = this.splitCardId;
        String str2 = this.onboardingUrl;
        CreditLimitPublicDocumentsResponse creditLimitPublicDocumentsResponse = this.publicDocuments;
        CreditLimitPaymentMethodResponse creditLimitPaymentMethodResponse = this.creditPaymentMethod;
        String str3 = this.changePaymentMethodAction;
        String str4 = this.appLink;
        StringBuilder sb = new StringBuilder("CreditLimitPlansResponse(upgradeStatus=");
        sb.append(upgradeStatus);
        sb.append(", limit=");
        sb.append(creditPlanLimitResponse);
        sb.append(", plans=");
        oyr.D(", splitCardId=", str, ", onboardingUrl=", sb, list);
        sb.append(str2);
        sb.append(", publicDocuments=");
        sb.append(creditLimitPublicDocumentsResponse);
        sb.append(", creditPaymentMethod=");
        sb.append(creditLimitPaymentMethodResponse);
        sb.append(", changePaymentMethodAction=");
        sb.append(str3);
        sb.append(", appLink=");
        return oyr.t(sb, str4, Extension.C_BRAKE);
    }
}
