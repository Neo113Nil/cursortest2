package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0086\u0001\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b\u0003\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b\u0004\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b\u0006\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b\u0007\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b\b\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b\t\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b\n\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b\u000b\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010\u001c¨\u0006,"}, d2 = {"Lcom/ybsdk/rconfig/configs/YbDivkitSkeletonsConfig;", "", "", "isEnabled", "isEnabledOnTransfersScreen", "isEnabledOnUserCardsScreen", "isEnabledOnCardRenameScreen", "isEnabledOnMerchantOffersScreen", "isEnabledOnTransactionsFeedScreen", "isEnabledOnCreditDashboardV1Screen", "isEnabledOnCreditAccountDashboardV1Screen", "isEnabledOnProductsScreen", "", "skeletonsCacheTtlMs", "<init>", "(ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;)V", "component1", "()Z", "component2", "()Ljava/lang/Boolean;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Ljava/lang/Long;", "copy", "(ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;)Lcom/ybsdk/rconfig/configs/YbDivkitSkeletonsConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/lang/Boolean;", "Ljava/lang/Long;", "getSkeletonsCacheTtlMs", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class YbDivkitSkeletonsConfig {

    @Json(name = "is_enabled")
    private final boolean isEnabled;

    @Json(name = "is_enabled_on_card_rename_screen")
    private final Boolean isEnabledOnCardRenameScreen;

    @Json(name = "is_enabled_on_credit_account_dashboard_screen")
    private final Boolean isEnabledOnCreditAccountDashboardV1Screen;

    @Json(name = "is_enabled_on_credit_dashboard_screen")
    private final Boolean isEnabledOnCreditDashboardV1Screen;

    @Json(name = "is_enabled_on_merchant_offers_screen")
    private final Boolean isEnabledOnMerchantOffersScreen;

    @Json(name = "is_enabled_on_products_screen")
    private final Boolean isEnabledOnProductsScreen;

    @Json(name = "is_enabled_on_transactions_feed_screen")
    private final Boolean isEnabledOnTransactionsFeedScreen;

    @Json(name = "is_enabled_on_transfers_screen")
    private final Boolean isEnabledOnTransfersScreen;

    @Json(name = "is_enabled_on_user_cards_screen")
    private final Boolean isEnabledOnUserCardsScreen;

    @Json(name = "skeletons_cache_ttl_ms")
    private final Long skeletonsCacheTtlMs;

    public YbDivkitSkeletonsConfig(boolean z, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Long l) {
        this.isEnabled = z;
        this.isEnabledOnTransfersScreen = bool;
        this.isEnabledOnUserCardsScreen = bool2;
        this.isEnabledOnCardRenameScreen = bool3;
        this.isEnabledOnMerchantOffersScreen = bool4;
        this.isEnabledOnTransactionsFeedScreen = bool5;
        this.isEnabledOnCreditDashboardV1Screen = bool6;
        this.isEnabledOnCreditAccountDashboardV1Screen = bool7;
        this.isEnabledOnProductsScreen = bool8;
        this.skeletonsCacheTtlMs = l;
    }

    public static /* synthetic */ YbDivkitSkeletonsConfig copy$default(YbDivkitSkeletonsConfig ybDivkitSkeletonsConfig, boolean z, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ybDivkitSkeletonsConfig.isEnabled;
        }
        if ((i & 2) != 0) {
            bool = ybDivkitSkeletonsConfig.isEnabledOnTransfersScreen;
        }
        if ((i & 4) != 0) {
            bool2 = ybDivkitSkeletonsConfig.isEnabledOnUserCardsScreen;
        }
        if ((i & 8) != 0) {
            bool3 = ybDivkitSkeletonsConfig.isEnabledOnCardRenameScreen;
        }
        if ((i & 16) != 0) {
            bool4 = ybDivkitSkeletonsConfig.isEnabledOnMerchantOffersScreen;
        }
        if ((i & 32) != 0) {
            bool5 = ybDivkitSkeletonsConfig.isEnabledOnTransactionsFeedScreen;
        }
        if ((i & 64) != 0) {
            bool6 = ybDivkitSkeletonsConfig.isEnabledOnCreditDashboardV1Screen;
        }
        if ((i & 128) != 0) {
            bool7 = ybDivkitSkeletonsConfig.isEnabledOnCreditAccountDashboardV1Screen;
        }
        if ((i & 256) != 0) {
            bool8 = ybDivkitSkeletonsConfig.isEnabledOnProductsScreen;
        }
        if ((i & 512) != 0) {
            l = ybDivkitSkeletonsConfig.skeletonsCacheTtlMs;
        }
        Boolean bool9 = bool8;
        Long l2 = l;
        Boolean bool10 = bool6;
        Boolean bool11 = bool7;
        Boolean bool12 = bool4;
        Boolean bool13 = bool5;
        return ybDivkitSkeletonsConfig.copy(z, bool, bool2, bool3, bool12, bool13, bool10, bool11, bool9, l2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component10, reason: from getter */
    public final Long getSkeletonsCacheTtlMs() {
        return this.skeletonsCacheTtlMs;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsEnabledOnTransfersScreen() {
        return this.isEnabledOnTransfersScreen;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsEnabledOnUserCardsScreen() {
        return this.isEnabledOnUserCardsScreen;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIsEnabledOnCardRenameScreen() {
        return this.isEnabledOnCardRenameScreen;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getIsEnabledOnMerchantOffersScreen() {
        return this.isEnabledOnMerchantOffersScreen;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsEnabledOnTransactionsFeedScreen() {
        return this.isEnabledOnTransactionsFeedScreen;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getIsEnabledOnCreditDashboardV1Screen() {
        return this.isEnabledOnCreditDashboardV1Screen;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getIsEnabledOnCreditAccountDashboardV1Screen() {
        return this.isEnabledOnCreditAccountDashboardV1Screen;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getIsEnabledOnProductsScreen() {
        return this.isEnabledOnProductsScreen;
    }

    public final YbDivkitSkeletonsConfig copy(boolean isEnabled, Boolean isEnabledOnTransfersScreen, Boolean isEnabledOnUserCardsScreen, Boolean isEnabledOnCardRenameScreen, Boolean isEnabledOnMerchantOffersScreen, Boolean isEnabledOnTransactionsFeedScreen, Boolean isEnabledOnCreditDashboardV1Screen, Boolean isEnabledOnCreditAccountDashboardV1Screen, Boolean isEnabledOnProductsScreen, Long skeletonsCacheTtlMs) {
        return new YbDivkitSkeletonsConfig(isEnabled, isEnabledOnTransfersScreen, isEnabledOnUserCardsScreen, isEnabledOnCardRenameScreen, isEnabledOnMerchantOffersScreen, isEnabledOnTransactionsFeedScreen, isEnabledOnCreditDashboardV1Screen, isEnabledOnCreditAccountDashboardV1Screen, isEnabledOnProductsScreen, skeletonsCacheTtlMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YbDivkitSkeletonsConfig)) {
            return false;
        }
        YbDivkitSkeletonsConfig ybDivkitSkeletonsConfig = (YbDivkitSkeletonsConfig) other;
        return this.isEnabled == ybDivkitSkeletonsConfig.isEnabled && jl40.l(this.isEnabledOnTransfersScreen, ybDivkitSkeletonsConfig.isEnabledOnTransfersScreen) && jl40.l(this.isEnabledOnUserCardsScreen, ybDivkitSkeletonsConfig.isEnabledOnUserCardsScreen) && jl40.l(this.isEnabledOnCardRenameScreen, ybDivkitSkeletonsConfig.isEnabledOnCardRenameScreen) && jl40.l(this.isEnabledOnMerchantOffersScreen, ybDivkitSkeletonsConfig.isEnabledOnMerchantOffersScreen) && jl40.l(this.isEnabledOnTransactionsFeedScreen, ybDivkitSkeletonsConfig.isEnabledOnTransactionsFeedScreen) && jl40.l(this.isEnabledOnCreditDashboardV1Screen, ybDivkitSkeletonsConfig.isEnabledOnCreditDashboardV1Screen) && jl40.l(this.isEnabledOnCreditAccountDashboardV1Screen, ybDivkitSkeletonsConfig.isEnabledOnCreditAccountDashboardV1Screen) && jl40.l(this.isEnabledOnProductsScreen, ybDivkitSkeletonsConfig.isEnabledOnProductsScreen) && jl40.l(this.skeletonsCacheTtlMs, ybDivkitSkeletonsConfig.skeletonsCacheTtlMs);
    }

    public final Long getSkeletonsCacheTtlMs() {
        return this.skeletonsCacheTtlMs;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        Boolean bool = this.isEnabledOnTransfersScreen;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isEnabledOnUserCardsScreen;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isEnabledOnCardRenameScreen;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isEnabledOnMerchantOffersScreen;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isEnabledOnTransactionsFeedScreen;
        int hashCode6 = (hashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isEnabledOnCreditDashboardV1Screen;
        int hashCode7 = (hashCode6 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.isEnabledOnCreditAccountDashboardV1Screen;
        int hashCode8 = (hashCode7 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.isEnabledOnProductsScreen;
        int hashCode9 = (hashCode8 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Long l = this.skeletonsCacheTtlMs;
        return hashCode9 + (l != null ? l.hashCode() : 0);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final Boolean isEnabledOnCardRenameScreen() {
        return this.isEnabledOnCardRenameScreen;
    }

    public final Boolean isEnabledOnCreditAccountDashboardV1Screen() {
        return this.isEnabledOnCreditAccountDashboardV1Screen;
    }

    public final Boolean isEnabledOnCreditDashboardV1Screen() {
        return this.isEnabledOnCreditDashboardV1Screen;
    }

    public final Boolean isEnabledOnMerchantOffersScreen() {
        return this.isEnabledOnMerchantOffersScreen;
    }

    public final Boolean isEnabledOnProductsScreen() {
        return this.isEnabledOnProductsScreen;
    }

    public final Boolean isEnabledOnTransactionsFeedScreen() {
        return this.isEnabledOnTransactionsFeedScreen;
    }

    public final Boolean isEnabledOnTransfersScreen() {
        return this.isEnabledOnTransfersScreen;
    }

    public final Boolean isEnabledOnUserCardsScreen() {
        return this.isEnabledOnUserCardsScreen;
    }

    public String toString() {
        return "YbDivkitSkeletonsConfig(isEnabled=" + this.isEnabled + ", isEnabledOnTransfersScreen=" + this.isEnabledOnTransfersScreen + ", isEnabledOnUserCardsScreen=" + this.isEnabledOnUserCardsScreen + ", isEnabledOnCardRenameScreen=" + this.isEnabledOnCardRenameScreen + ", isEnabledOnMerchantOffersScreen=" + this.isEnabledOnMerchantOffersScreen + ", isEnabledOnTransactionsFeedScreen=" + this.isEnabledOnTransactionsFeedScreen + ", isEnabledOnCreditDashboardV1Screen=" + this.isEnabledOnCreditDashboardV1Screen + ", isEnabledOnCreditAccountDashboardV1Screen=" + this.isEnabledOnCreditAccountDashboardV1Screen + ", isEnabledOnProductsScreen=" + this.isEnabledOnProductsScreen + ", skeletonsCacheTtlMs=" + this.skeletonsCacheTtlMs + Extension.C_BRAKE;
    }
}
