package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ly3;
import defpackage.n;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0003\"#$B;\u0012\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003JB\u0010\u001a\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006%"}, d2 = {"Lcom/ybsdk/network/dto/WalletsInfoResponse;", "", "walletsInfo", "", "Lcom/ybsdk/network/dto/WalletsInfoResponse$WalletInfo;", "shouldPoll", "", "splitInfo", "Lcom/ybsdk/network/dto/WalletsInfoResponse$SplitInfo;", "saverInfo", "Lcom/ybsdk/network/dto/WalletsInfoResponse$SaverInfo;", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Lcom/ybsdk/network/dto/WalletsInfoResponse$SplitInfo;Lcom/ybsdk/network/dto/WalletsInfoResponse$SaverInfo;)V", "getWalletsInfo", "()Ljava/util/List;", "getShouldPoll", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSplitInfo", "()Lcom/ybsdk/network/dto/WalletsInfoResponse$SplitInfo;", "getSaverInfo", "()Lcom/ybsdk/network/dto/WalletsInfoResponse$SaverInfo;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Lcom/ybsdk/network/dto/WalletsInfoResponse$SplitInfo;Lcom/ybsdk/network/dto/WalletsInfoResponse$SaverInfo;)Lcom/ybsdk/network/dto/WalletsInfoResponse;", "equals", "other", "hashCode", "", "toString", "", "WalletInfo", "SplitInfo", "SaverInfo", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WalletsInfoResponse {
    private final SaverInfo saverInfo;
    private final Boolean shouldPoll;
    private final SplitInfo splitInfo;
    private final List<WalletInfo> walletsInfo;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/network/dto/WalletsInfoResponse$SaverInfo;", "", "shouldShowPromo", "", "maxInterestRate", "", "action", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "getShouldShowPromo", "()Z", "getMaxInterestRate", "()Ljava/lang/String;", "getAction", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SaverInfo {
        private final String action;
        private final String maxInterestRate;
        private final boolean shouldShowPromo;

        public SaverInfo(@Json(name = "should_show_promo") boolean z, @Json(name = "max_interest_rate") String str, @Json(name = "action") String str2) {
            this.shouldShowPromo = z;
            this.maxInterestRate = str;
            this.action = str2;
        }

        public static /* synthetic */ SaverInfo copy$default(SaverInfo saverInfo, boolean z, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = saverInfo.shouldShowPromo;
            }
            if ((i & 2) != 0) {
                str = saverInfo.maxInterestRate;
            }
            if ((i & 4) != 0) {
                str2 = saverInfo.action;
            }
            return saverInfo.copy(z, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShouldShowPromo() {
            return this.shouldShowPromo;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMaxInterestRate() {
            return this.maxInterestRate;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        public final SaverInfo copy(@Json(name = "should_show_promo") boolean shouldShowPromo, @Json(name = "max_interest_rate") String maxInterestRate, @Json(name = "action") String action) {
            return new SaverInfo(shouldShowPromo, maxInterestRate, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SaverInfo)) {
                return false;
            }
            SaverInfo saverInfo = (SaverInfo) other;
            return this.shouldShowPromo == saverInfo.shouldShowPromo && jl40.l(this.maxInterestRate, saverInfo.maxInterestRate) && jl40.l(this.action, saverInfo.action);
        }

        public final String getAction() {
            return this.action;
        }

        public final String getMaxInterestRate() {
            return this.maxInterestRate;
        }

        public final boolean getShouldShowPromo() {
            return this.shouldShowPromo;
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.shouldShowPromo) * 31;
            String str = this.maxInterestRate;
            return this.action.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            boolean z = this.shouldShowPromo;
            String str = this.maxInterestRate;
            return oyr.t(ly3.v("SaverInfo(shouldShowPromo=", ", maxInterestRate=", str, ", action=", z), this.action, Extension.C_BRAKE);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003JM\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006#"}, d2 = {"Lcom/ybsdk/network/dto/WalletsInfoResponse$SplitInfo;", "", "isUserUpgraded", "", "limit", "Lcom/ybsdk/network/dto/SplitInfoLimit;", "overdue", "Lcom/ybsdk/network/dto/SplitInfoOverdue;", "accountUrl", "", "onboardingUrl", "futurePaymentsUrl", "<init>", "(ZLcom/ybsdk/network/dto/SplitInfoLimit;Lcom/ybsdk/network/dto/SplitInfoOverdue;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Z", "getLimit", "()Lcom/ybsdk/network/dto/SplitInfoLimit;", "getOverdue", "()Lcom/ybsdk/network/dto/SplitInfoOverdue;", "getAccountUrl", "()Ljava/lang/String;", "getOnboardingUrl", "getFuturePaymentsUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SplitInfo {
        private final String accountUrl;
        private final String futurePaymentsUrl;
        private final boolean isUserUpgraded;
        private final SplitInfoLimit limit;
        private final String onboardingUrl;
        private final SplitInfoOverdue overdue;

        public SplitInfo(@Json(name = "is_user_upgraded") boolean z, @Json(name = "limit") SplitInfoLimit splitInfoLimit, @Json(name = "overdue") SplitInfoOverdue splitInfoOverdue, @Json(name = "account_url") String str, @Json(name = "onboarding_url") String str2, @Json(name = "future_payments_url") String str3) {
            this.isUserUpgraded = z;
            this.limit = splitInfoLimit;
            this.overdue = splitInfoOverdue;
            this.accountUrl = str;
            this.onboardingUrl = str2;
            this.futurePaymentsUrl = str3;
        }

        public static /* synthetic */ SplitInfo copy$default(SplitInfo splitInfo, boolean z, SplitInfoLimit splitInfoLimit, SplitInfoOverdue splitInfoOverdue, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = splitInfo.isUserUpgraded;
            }
            if ((i & 2) != 0) {
                splitInfoLimit = splitInfo.limit;
            }
            if ((i & 4) != 0) {
                splitInfoOverdue = splitInfo.overdue;
            }
            if ((i & 8) != 0) {
                str = splitInfo.accountUrl;
            }
            if ((i & 16) != 0) {
                str2 = splitInfo.onboardingUrl;
            }
            if ((i & 32) != 0) {
                str3 = splitInfo.futurePaymentsUrl;
            }
            String str4 = str2;
            String str5 = str3;
            return splitInfo.copy(z, splitInfoLimit, splitInfoOverdue, str, str4, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsUserUpgraded() {
            return this.isUserUpgraded;
        }

        /* renamed from: component2, reason: from getter */
        public final SplitInfoLimit getLimit() {
            return this.limit;
        }

        /* renamed from: component3, reason: from getter */
        public final SplitInfoOverdue getOverdue() {
            return this.overdue;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAccountUrl() {
            return this.accountUrl;
        }

        /* renamed from: component5, reason: from getter */
        public final String getOnboardingUrl() {
            return this.onboardingUrl;
        }

        /* renamed from: component6, reason: from getter */
        public final String getFuturePaymentsUrl() {
            return this.futurePaymentsUrl;
        }

        public final SplitInfo copy(@Json(name = "is_user_upgraded") boolean isUserUpgraded, @Json(name = "limit") SplitInfoLimit limit, @Json(name = "overdue") SplitInfoOverdue overdue, @Json(name = "account_url") String accountUrl, @Json(name = "onboarding_url") String onboardingUrl, @Json(name = "future_payments_url") String futurePaymentsUrl) {
            return new SplitInfo(isUserUpgraded, limit, overdue, accountUrl, onboardingUrl, futurePaymentsUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SplitInfo)) {
                return false;
            }
            SplitInfo splitInfo = (SplitInfo) other;
            return this.isUserUpgraded == splitInfo.isUserUpgraded && jl40.l(this.limit, splitInfo.limit) && jl40.l(this.overdue, splitInfo.overdue) && jl40.l(this.accountUrl, splitInfo.accountUrl) && jl40.l(this.onboardingUrl, splitInfo.onboardingUrl) && jl40.l(this.futurePaymentsUrl, splitInfo.futurePaymentsUrl);
        }

        public final String getAccountUrl() {
            return this.accountUrl;
        }

        public final String getFuturePaymentsUrl() {
            return this.futurePaymentsUrl;
        }

        public final SplitInfoLimit getLimit() {
            return this.limit;
        }

        public final String getOnboardingUrl() {
            return this.onboardingUrl;
        }

        public final SplitInfoOverdue getOverdue() {
            return this.overdue;
        }

        public int hashCode() {
            int hashCode = (this.limit.hashCode() + (Boolean.hashCode(this.isUserUpgraded) * 31)) * 31;
            SplitInfoOverdue splitInfoOverdue = this.overdue;
            int hashCode2 = (hashCode + (splitInfoOverdue == null ? 0 : splitInfoOverdue.hashCode())) * 31;
            String str = this.accountUrl;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.onboardingUrl;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.futurePaymentsUrl;
            return hashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean isUserUpgraded() {
            return this.isUserUpgraded;
        }

        public String toString() {
            boolean z = this.isUserUpgraded;
            SplitInfoLimit splitInfoLimit = this.limit;
            SplitInfoOverdue splitInfoOverdue = this.overdue;
            String str = this.accountUrl;
            String str2 = this.onboardingUrl;
            String str3 = this.futurePaymentsUrl;
            StringBuilder sb = new StringBuilder("SplitInfo(isUserUpgraded=");
            sb.append(z);
            sb.append(", limit=");
            sb.append(splitInfoLimit);
            sb.append(", overdue=");
            sb.append(splitInfoOverdue);
            sb.append(", accountUrl=");
            sb.append(str);
            sb.append(", onboardingUrl=");
            return g8e.r(sb, str2, ", futurePaymentsUrl=", str3, Extension.C_BRAKE);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u009f\u0001\u00107\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0017R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u0017R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)¨\u0006>"}, d2 = {"Lcom/ybsdk/network/dto/WalletsInfoResponse$WalletInfo;", "", "title", "", "subtitle", "image", "themedImage", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "paymentMethodId", "balance", "Lcom/ybsdk/core/common/data/network/dto/Money;", "logo", "themedLogo", "action", "Lcom/ybsdk/network/dto/WalletInfoAction;", "productType", "Lcom/ybsdk/network/dto/PaymentMethodProductType;", "autoTopupInfo", "Lcom/ybsdk/network/dto/AutoTopupInfo;", "autoFundInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/network/dto/WalletInfoAction;Lcom/ybsdk/network/dto/PaymentMethodProductType;Lcom/ybsdk/network/dto/AutoTopupInfo;Lcom/ybsdk/network/dto/AutoTopupInfo;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getImage$annotations", "()V", "getImage", "getThemedImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getPaymentMethodId", "getBalance", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getLogo$annotations", "getLogo", "getThemedLogo", "getAction", "()Lcom/ybsdk/network/dto/WalletInfoAction;", "getProductType", "()Lcom/ybsdk/network/dto/PaymentMethodProductType;", "getAutoTopupInfo", "()Lcom/ybsdk/network/dto/AutoTopupInfo;", "getAutoFundInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WalletInfo {
        private final WalletInfoAction action;
        private final AutoTopupInfo autoFundInfo;
        private final AutoTopupInfo autoTopupInfo;
        private final Money balance;
        private final String image;
        private final String logo;
        private final String paymentMethodId;
        private final PaymentMethodProductType productType;
        private final String subtitle;
        private final Themes<String> themedImage;
        private final Themes<String> themedLogo;
        private final String title;

        public WalletInfo(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "image") String str3, @Json(name = "themed_image") Themes<String> themes, @Json(name = "payment_method_id") String str4, @Json(name = "balance") Money money, @Json(name = "logo") String str5, @Json(name = "themed_logo") Themes<String> themes2, @Json(name = "manage_button") WalletInfoAction walletInfoAction, @Json(name = "product") PaymentMethodProductType paymentMethodProductType, @Json(name = "auto_topup") AutoTopupInfo autoTopupInfo, @Json(name = "auto_fund") AutoTopupInfo autoTopupInfo2) {
            this.title = str;
            this.subtitle = str2;
            this.image = str3;
            this.themedImage = themes;
            this.paymentMethodId = str4;
            this.balance = money;
            this.logo = str5;
            this.themedLogo = themes2;
            this.action = walletInfoAction;
            this.productType = paymentMethodProductType;
            this.autoTopupInfo = autoTopupInfo;
            this.autoFundInfo = autoTopupInfo2;
        }

        public static /* synthetic */ WalletInfo copy$default(WalletInfo walletInfo, String str, String str2, String str3, Themes themes, String str4, Money money, String str5, Themes themes2, WalletInfoAction walletInfoAction, PaymentMethodProductType paymentMethodProductType, AutoTopupInfo autoTopupInfo, AutoTopupInfo autoTopupInfo2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = walletInfo.title;
            }
            if ((i & 2) != 0) {
                str2 = walletInfo.subtitle;
            }
            if ((i & 4) != 0) {
                str3 = walletInfo.image;
            }
            if ((i & 8) != 0) {
                themes = walletInfo.themedImage;
            }
            if ((i & 16) != 0) {
                str4 = walletInfo.paymentMethodId;
            }
            if ((i & 32) != 0) {
                money = walletInfo.balance;
            }
            if ((i & 64) != 0) {
                str5 = walletInfo.logo;
            }
            if ((i & 128) != 0) {
                themes2 = walletInfo.themedLogo;
            }
            if ((i & 256) != 0) {
                walletInfoAction = walletInfo.action;
            }
            if ((i & 512) != 0) {
                paymentMethodProductType = walletInfo.productType;
            }
            if ((i & 1024) != 0) {
                autoTopupInfo = walletInfo.autoTopupInfo;
            }
            if ((i & 2048) != 0) {
                autoTopupInfo2 = walletInfo.autoFundInfo;
            }
            AutoTopupInfo autoTopupInfo3 = autoTopupInfo;
            AutoTopupInfo autoTopupInfo4 = autoTopupInfo2;
            WalletInfoAction walletInfoAction2 = walletInfoAction;
            PaymentMethodProductType paymentMethodProductType2 = paymentMethodProductType;
            String str6 = str5;
            Themes themes3 = themes2;
            String str7 = str4;
            Money money2 = money;
            return walletInfo.copy(str, str2, str3, themes, str7, money2, str6, themes3, walletInfoAction2, paymentMethodProductType2, autoTopupInfo3, autoTopupInfo4);
        }

        @jxi
        public static /* synthetic */ void getImage$annotations() {
        }

        @jxi
        public static /* synthetic */ void getLogo$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component10, reason: from getter */
        public final PaymentMethodProductType getProductType() {
            return this.productType;
        }

        /* renamed from: component11, reason: from getter */
        public final AutoTopupInfo getAutoTopupInfo() {
            return this.autoTopupInfo;
        }

        /* renamed from: component12, reason: from getter */
        public final AutoTopupInfo getAutoFundInfo() {
            return this.autoFundInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        public final Themes<String> component4() {
            return this.themedImage;
        }

        /* renamed from: component5, reason: from getter */
        public final String getPaymentMethodId() {
            return this.paymentMethodId;
        }

        /* renamed from: component6, reason: from getter */
        public final Money getBalance() {
            return this.balance;
        }

        /* renamed from: component7, reason: from getter */
        public final String getLogo() {
            return this.logo;
        }

        public final Themes<String> component8() {
            return this.themedLogo;
        }

        /* renamed from: component9, reason: from getter */
        public final WalletInfoAction getAction() {
            return this.action;
        }

        public final WalletInfo copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "image") String image, @Json(name = "themed_image") Themes<String> themedImage, @Json(name = "payment_method_id") String paymentMethodId, @Json(name = "balance") Money balance, @Json(name = "logo") String logo, @Json(name = "themed_logo") Themes<String> themedLogo, @Json(name = "manage_button") WalletInfoAction action, @Json(name = "product") PaymentMethodProductType productType, @Json(name = "auto_topup") AutoTopupInfo autoTopupInfo, @Json(name = "auto_fund") AutoTopupInfo autoFundInfo) {
            return new WalletInfo(title, subtitle, image, themedImage, paymentMethodId, balance, logo, themedLogo, action, productType, autoTopupInfo, autoFundInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WalletInfo)) {
                return false;
            }
            WalletInfo walletInfo = (WalletInfo) other;
            return jl40.l(this.title, walletInfo.title) && jl40.l(this.subtitle, walletInfo.subtitle) && jl40.l(this.image, walletInfo.image) && jl40.l(this.themedImage, walletInfo.themedImage) && jl40.l(this.paymentMethodId, walletInfo.paymentMethodId) && jl40.l(this.balance, walletInfo.balance) && jl40.l(this.logo, walletInfo.logo) && jl40.l(this.themedLogo, walletInfo.themedLogo) && jl40.l(this.action, walletInfo.action) && this.productType == walletInfo.productType && jl40.l(this.autoTopupInfo, walletInfo.autoTopupInfo) && jl40.l(this.autoFundInfo, walletInfo.autoFundInfo);
        }

        public final WalletInfoAction getAction() {
            return this.action;
        }

        public final AutoTopupInfo getAutoFundInfo() {
            return this.autoFundInfo;
        }

        public final AutoTopupInfo getAutoTopupInfo() {
            return this.autoTopupInfo;
        }

        public final Money getBalance() {
            return this.balance;
        }

        public final String getImage() {
            return this.image;
        }

        public final String getLogo() {
            return this.logo;
        }

        public final String getPaymentMethodId() {
            return this.paymentMethodId;
        }

        public final PaymentMethodProductType getProductType() {
            return this.productType;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final Themes<String> getThemedImage() {
            return this.themedImage;
        }

        public final Themes<String> getThemedLogo() {
            return this.themedLogo;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int b = unr0.b(unr0.b(this.title.hashCode() * 31, 31, this.subtitle), 31, this.image);
            Themes<String> themes = this.themedImage;
            int hashCode = (b + (themes == null ? 0 : themes.hashCode())) * 31;
            String str = this.paymentMethodId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Money money = this.balance;
            int hashCode3 = (hashCode2 + (money == null ? 0 : money.hashCode())) * 31;
            String str2 = this.logo;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Themes<String> themes2 = this.themedLogo;
            int hashCode5 = (hashCode4 + (themes2 == null ? 0 : themes2.hashCode())) * 31;
            WalletInfoAction walletInfoAction = this.action;
            int hashCode6 = (hashCode5 + (walletInfoAction == null ? 0 : walletInfoAction.hashCode())) * 31;
            PaymentMethodProductType paymentMethodProductType = this.productType;
            int hashCode7 = (hashCode6 + (paymentMethodProductType == null ? 0 : paymentMethodProductType.hashCode())) * 31;
            AutoTopupInfo autoTopupInfo = this.autoTopupInfo;
            int hashCode8 = (hashCode7 + (autoTopupInfo == null ? 0 : autoTopupInfo.hashCode())) * 31;
            AutoTopupInfo autoTopupInfo2 = this.autoFundInfo;
            return hashCode8 + (autoTopupInfo2 != null ? autoTopupInfo2.hashCode() : 0);
        }

        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            String str3 = this.image;
            Themes<String> themes = this.themedImage;
            String str4 = this.paymentMethodId;
            Money money = this.balance;
            String str5 = this.logo;
            Themes<String> themes2 = this.themedLogo;
            WalletInfoAction walletInfoAction = this.action;
            PaymentMethodProductType paymentMethodProductType = this.productType;
            AutoTopupInfo autoTopupInfo = this.autoTopupInfo;
            AutoTopupInfo autoTopupInfo2 = this.autoFundInfo;
            StringBuilder v = b64.v("WalletInfo(title=", str, ", subtitle=", str2, ", image=");
            n.B(v, str3, ", themedImage=", themes, ", paymentMethodId=");
            v.append(str4);
            v.append(", balance=");
            v.append(money);
            v.append(", logo=");
            n.B(v, str5, ", themedLogo=", themes2, ", action=");
            v.append(walletInfoAction);
            v.append(", productType=");
            v.append(paymentMethodProductType);
            v.append(", autoTopupInfo=");
            v.append(autoTopupInfo);
            v.append(", autoFundInfo=");
            v.append(autoTopupInfo2);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }
    }

    public /* synthetic */ WalletsInfoResponse(List list, Boolean bool, SplitInfo splitInfo, SaverInfo saverInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EmptyList.a : list, (i & 2) != 0 ? null : bool, splitInfo, saverInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletsInfoResponse copy$default(WalletsInfoResponse walletsInfoResponse, List list, Boolean bool, SplitInfo splitInfo, SaverInfo saverInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            list = walletsInfoResponse.walletsInfo;
        }
        if ((i & 2) != 0) {
            bool = walletsInfoResponse.shouldPoll;
        }
        if ((i & 4) != 0) {
            splitInfo = walletsInfoResponse.splitInfo;
        }
        if ((i & 8) != 0) {
            saverInfo = walletsInfoResponse.saverInfo;
        }
        return walletsInfoResponse.copy(list, bool, splitInfo, saverInfo);
    }

    public final List<WalletInfo> component1() {
        return this.walletsInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getShouldPoll() {
        return this.shouldPoll;
    }

    /* renamed from: component3, reason: from getter */
    public final SplitInfo getSplitInfo() {
        return this.splitInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final SaverInfo getSaverInfo() {
        return this.saverInfo;
    }

    public final WalletsInfoResponse copy(@Json(name = "wallets_info") List<WalletInfo> walletsInfo, @Json(name = "should_poll") Boolean shouldPoll, @Json(name = "split_info") SplitInfo splitInfo, @Json(name = "saver_info") SaverInfo saverInfo) {
        return new WalletsInfoResponse(walletsInfo, shouldPoll, splitInfo, saverInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletsInfoResponse)) {
            return false;
        }
        WalletsInfoResponse walletsInfoResponse = (WalletsInfoResponse) other;
        return jl40.l(this.walletsInfo, walletsInfoResponse.walletsInfo) && jl40.l(this.shouldPoll, walletsInfoResponse.shouldPoll) && jl40.l(this.splitInfo, walletsInfoResponse.splitInfo) && jl40.l(this.saverInfo, walletsInfoResponse.saverInfo);
    }

    public final SaverInfo getSaverInfo() {
        return this.saverInfo;
    }

    public final Boolean getShouldPoll() {
        return this.shouldPoll;
    }

    public final SplitInfo getSplitInfo() {
        return this.splitInfo;
    }

    public final List<WalletInfo> getWalletsInfo() {
        return this.walletsInfo;
    }

    public int hashCode() {
        int hashCode = this.walletsInfo.hashCode() * 31;
        Boolean bool = this.shouldPoll;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        SplitInfo splitInfo = this.splitInfo;
        int hashCode3 = (hashCode2 + (splitInfo == null ? 0 : splitInfo.hashCode())) * 31;
        SaverInfo saverInfo = this.saverInfo;
        return hashCode3 + (saverInfo != null ? saverInfo.hashCode() : 0);
    }

    public String toString() {
        return "WalletsInfoResponse(walletsInfo=" + this.walletsInfo + ", shouldPoll=" + this.shouldPoll + ", splitInfo=" + this.splitInfo + ", saverInfo=" + this.saverInfo + Extension.C_BRAKE;
    }

    public WalletsInfoResponse(@Json(name = "wallets_info") List<WalletInfo> list, @Json(name = "should_poll") Boolean bool, @Json(name = "split_info") SplitInfo splitInfo, @Json(name = "saver_info") SaverInfo saverInfo) {
        this.walletsInfo = list;
        this.shouldPoll = bool;
        this.splitInfo = splitInfo;
        this.saverInfo = saverInfo;
    }
}
