package com.ybsdk.feature.split.deposit.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.CurrentPaymentMethodDto;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.PaymentMethodsListDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.smw0;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0004%&'(B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003J=\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006)"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse;", "", "divkitData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "header", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$Header;", "paymentMethod", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$PaymentMethod;", "transactionStatusScreen", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$TransactionStatusScreen;", "autoTopupData", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$AutoTopupData;", "<init>", "(Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$Header;Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$PaymentMethod;Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$TransactionStatusScreen;Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$AutoTopupData;)V", "getDivkitData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getHeader", "()Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$Header;", "getPaymentMethod", "()Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$PaymentMethod;", "getTransactionStatusScreen", "()Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$TransactionStatusScreen;", "getAutoTopupData", "()Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$AutoTopupData;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Header", "PaymentMethod", "TransactionStatusScreen", "AutoTopupData", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetDepositPageResponse {
    private final AutoTopupData autoTopupData;
    private final DivDataDto divkitData;
    private final Header header;
    private final PaymentMethod paymentMethod;
    private final TransactionStatusScreen transactionStatusScreen;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0004'()*BE\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JG\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006+"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$AutoTopupData;", "", "paymentMethodsBottomSheet", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$AutoTopupData$PaymentMethodsBottomSheet;", "statusScreen", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$AutoTopupData$StatusScreen;", "targetAgreementId", "", "externalMemberConfirmationDeeplink", "autoTopupSettings", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$AutoTopupData$AutoTopupSettings;", "walletPaymentMethod", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$AutoTopupData$WalletPaymentMethod;", "<init>", "(Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$AutoTopupData$PaymentMethodsBottomSheet;Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$AutoTopupData$StatusScreen;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$AutoTopupData$AutoTopupSettings;Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$AutoTopupData$WalletPaymentMethod;)V", "getPaymentMethodsBottomSheet", "()Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$AutoTopupData$PaymentMethodsBottomSheet;", "getStatusScreen", "()Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$AutoTopupData$StatusScreen;", "getTargetAgreementId", "()Ljava/lang/String;", "getExternalMemberConfirmationDeeplink", "getAutoTopupSettings", "()Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$AutoTopupData$AutoTopupSettings;", "getWalletPaymentMethod", "()Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$AutoTopupData$WalletPaymentMethod;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "AutoTopupSettings", "WalletPaymentMethod", "PaymentMethodsBottomSheet", "StatusScreen", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AutoTopupData {
        private final AutoTopupSettings autoTopupSettings;
        private final String externalMemberConfirmationDeeplink;
        private final PaymentMethodsBottomSheet paymentMethodsBottomSheet;
        private final StatusScreen statusScreen;
        private final String targetAgreementId;
        private final WalletPaymentMethod walletPaymentMethod;

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$AutoTopupData$AutoTopupSettings;", "", "autoFundLimit", "Lcom/ybsdk/core/common/data/network/dto/Money;", "autoTopupAmount", "autoTopupThreshold", "autoTopupStatus", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/AutoTopupStatus;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/AutoTopupStatus;)V", "getAutoFundLimit", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getAutoTopupAmount", "getAutoTopupThreshold", "getAutoTopupStatus", "()Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/AutoTopupStatus;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class AutoTopupSettings {
            private final Money autoFundLimit;
            private final Money autoTopupAmount;
            private final AutoTopupStatus autoTopupStatus;
            private final Money autoTopupThreshold;

            public AutoTopupSettings(@Json(name = "auto_fund_limit") Money money, @Json(name = "auto_topup_amount") Money money2, @Json(name = "auto_topup_threshold") Money money3, @Json(name = "auto_topup_status") AutoTopupStatus autoTopupStatus) {
                this.autoFundLimit = money;
                this.autoTopupAmount = money2;
                this.autoTopupThreshold = money3;
                this.autoTopupStatus = autoTopupStatus;
            }

            public static /* synthetic */ AutoTopupSettings copy$default(AutoTopupSettings autoTopupSettings, Money money, Money money2, Money money3, AutoTopupStatus autoTopupStatus, int i, Object obj) {
                if ((i & 1) != 0) {
                    money = autoTopupSettings.autoFundLimit;
                }
                if ((i & 2) != 0) {
                    money2 = autoTopupSettings.autoTopupAmount;
                }
                if ((i & 4) != 0) {
                    money3 = autoTopupSettings.autoTopupThreshold;
                }
                if ((i & 8) != 0) {
                    autoTopupStatus = autoTopupSettings.autoTopupStatus;
                }
                return autoTopupSettings.copy(money, money2, money3, autoTopupStatus);
            }

            /* renamed from: component1, reason: from getter */
            public final Money getAutoFundLimit() {
                return this.autoFundLimit;
            }

            /* renamed from: component2, reason: from getter */
            public final Money getAutoTopupAmount() {
                return this.autoTopupAmount;
            }

            /* renamed from: component3, reason: from getter */
            public final Money getAutoTopupThreshold() {
                return this.autoTopupThreshold;
            }

            /* renamed from: component4, reason: from getter */
            public final AutoTopupStatus getAutoTopupStatus() {
                return this.autoTopupStatus;
            }

            public final AutoTopupSettings copy(@Json(name = "auto_fund_limit") Money autoFundLimit, @Json(name = "auto_topup_amount") Money autoTopupAmount, @Json(name = "auto_topup_threshold") Money autoTopupThreshold, @Json(name = "auto_topup_status") AutoTopupStatus autoTopupStatus) {
                return new AutoTopupSettings(autoFundLimit, autoTopupAmount, autoTopupThreshold, autoTopupStatus);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AutoTopupSettings)) {
                    return false;
                }
                AutoTopupSettings autoTopupSettings = (AutoTopupSettings) other;
                return jl40.l(this.autoFundLimit, autoTopupSettings.autoFundLimit) && jl40.l(this.autoTopupAmount, autoTopupSettings.autoTopupAmount) && jl40.l(this.autoTopupThreshold, autoTopupSettings.autoTopupThreshold) && this.autoTopupStatus == autoTopupSettings.autoTopupStatus;
            }

            public final Money getAutoFundLimit() {
                return this.autoFundLimit;
            }

            public final Money getAutoTopupAmount() {
                return this.autoTopupAmount;
            }

            public final AutoTopupStatus getAutoTopupStatus() {
                return this.autoTopupStatus;
            }

            public final Money getAutoTopupThreshold() {
                return this.autoTopupThreshold;
            }

            public int hashCode() {
                return this.autoTopupStatus.hashCode() + tse0.c(this.autoTopupThreshold, tse0.c(this.autoTopupAmount, this.autoFundLimit.hashCode() * 31, 31), 31);
            }

            public String toString() {
                return "AutoTopupSettings(autoFundLimit=" + this.autoFundLimit + ", autoTopupAmount=" + this.autoTopupAmount + ", autoTopupThreshold=" + this.autoTopupThreshold + ", autoTopupStatus=" + this.autoTopupStatus + Extension.C_BRAKE;
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$AutoTopupData$PaymentMethodsBottomSheet;", "", "title", "", "selectedPaymentMethod", "Lcom/ybsdk/core/common/data/network/dto/CurrentPaymentMethodDto;", "paymentMethods", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodsListDto;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/CurrentPaymentMethodDto;Lcom/ybsdk/core/common/data/network/dto/PaymentMethodsListDto;)V", "getTitle", "()Ljava/lang/String;", "getSelectedPaymentMethod", "()Lcom/ybsdk/core/common/data/network/dto/CurrentPaymentMethodDto;", "getPaymentMethods", "()Lcom/ybsdk/core/common/data/network/dto/PaymentMethodsListDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PaymentMethodsBottomSheet {
            private final PaymentMethodsListDto paymentMethods;
            private final CurrentPaymentMethodDto selectedPaymentMethod;
            private final String title;

            public PaymentMethodsBottomSheet(@Json(name = "title") String str, @Json(name = "selected_payment_method") CurrentPaymentMethodDto currentPaymentMethodDto, @Json(name = "payment_methods_list") PaymentMethodsListDto paymentMethodsListDto) {
                this.title = str;
                this.selectedPaymentMethod = currentPaymentMethodDto;
                this.paymentMethods = paymentMethodsListDto;
            }

            public static /* synthetic */ PaymentMethodsBottomSheet copy$default(PaymentMethodsBottomSheet paymentMethodsBottomSheet, String str, CurrentPaymentMethodDto currentPaymentMethodDto, PaymentMethodsListDto paymentMethodsListDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = paymentMethodsBottomSheet.title;
                }
                if ((i & 2) != 0) {
                    currentPaymentMethodDto = paymentMethodsBottomSheet.selectedPaymentMethod;
                }
                if ((i & 4) != 0) {
                    paymentMethodsListDto = paymentMethodsBottomSheet.paymentMethods;
                }
                return paymentMethodsBottomSheet.copy(str, currentPaymentMethodDto, paymentMethodsListDto);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final CurrentPaymentMethodDto getSelectedPaymentMethod() {
                return this.selectedPaymentMethod;
            }

            /* renamed from: component3, reason: from getter */
            public final PaymentMethodsListDto getPaymentMethods() {
                return this.paymentMethods;
            }

            public final PaymentMethodsBottomSheet copy(@Json(name = "title") String title, @Json(name = "selected_payment_method") CurrentPaymentMethodDto selectedPaymentMethod, @Json(name = "payment_methods_list") PaymentMethodsListDto paymentMethods) {
                return new PaymentMethodsBottomSheet(title, selectedPaymentMethod, paymentMethods);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PaymentMethodsBottomSheet)) {
                    return false;
                }
                PaymentMethodsBottomSheet paymentMethodsBottomSheet = (PaymentMethodsBottomSheet) other;
                return jl40.l(this.title, paymentMethodsBottomSheet.title) && jl40.l(this.selectedPaymentMethod, paymentMethodsBottomSheet.selectedPaymentMethod) && jl40.l(this.paymentMethods, paymentMethodsBottomSheet.paymentMethods);
            }

            public final PaymentMethodsListDto getPaymentMethods() {
                return this.paymentMethods;
            }

            public final CurrentPaymentMethodDto getSelectedPaymentMethod() {
                return this.selectedPaymentMethod;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                CurrentPaymentMethodDto currentPaymentMethodDto = this.selectedPaymentMethod;
                return this.paymentMethods.hashCode() + ((hashCode + (currentPaymentMethodDto == null ? 0 : currentPaymentMethodDto.hashCode())) * 31);
            }

            public String toString() {
                return "PaymentMethodsBottomSheet(title=" + this.title + ", selectedPaymentMethod=" + this.selectedPaymentMethod + ", paymentMethods=" + this.paymentMethods + Extension.C_BRAKE;
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$AutoTopupData$StatusScreen;", "", "pendingData", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/StatusScreenData;", "timeoutData", "failData", "successData", "<init>", "(Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/StatusScreenData;Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/StatusScreenData;Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/StatusScreenData;Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/StatusScreenData;)V", "getPendingData", "()Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/StatusScreenData;", "getTimeoutData", "getFailData", "getSuccessData", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class StatusScreen {
            private final StatusScreenData failData;
            private final StatusScreenData pendingData;
            private final StatusScreenData successData;
            private final StatusScreenData timeoutData;

            public StatusScreen(@Json(name = "pending_data") StatusScreenData statusScreenData, @Json(name = "timeout_data") StatusScreenData statusScreenData2, @Json(name = "fail_data") StatusScreenData statusScreenData3, @Json(name = "success_data") StatusScreenData statusScreenData4) {
                this.pendingData = statusScreenData;
                this.timeoutData = statusScreenData2;
                this.failData = statusScreenData3;
                this.successData = statusScreenData4;
            }

            public static /* synthetic */ StatusScreen copy$default(StatusScreen statusScreen, StatusScreenData statusScreenData, StatusScreenData statusScreenData2, StatusScreenData statusScreenData3, StatusScreenData statusScreenData4, int i, Object obj) {
                if ((i & 1) != 0) {
                    statusScreenData = statusScreen.pendingData;
                }
                if ((i & 2) != 0) {
                    statusScreenData2 = statusScreen.timeoutData;
                }
                if ((i & 4) != 0) {
                    statusScreenData3 = statusScreen.failData;
                }
                if ((i & 8) != 0) {
                    statusScreenData4 = statusScreen.successData;
                }
                return statusScreen.copy(statusScreenData, statusScreenData2, statusScreenData3, statusScreenData4);
            }

            /* renamed from: component1, reason: from getter */
            public final StatusScreenData getPendingData() {
                return this.pendingData;
            }

            /* renamed from: component2, reason: from getter */
            public final StatusScreenData getTimeoutData() {
                return this.timeoutData;
            }

            /* renamed from: component3, reason: from getter */
            public final StatusScreenData getFailData() {
                return this.failData;
            }

            /* renamed from: component4, reason: from getter */
            public final StatusScreenData getSuccessData() {
                return this.successData;
            }

            public final StatusScreen copy(@Json(name = "pending_data") StatusScreenData pendingData, @Json(name = "timeout_data") StatusScreenData timeoutData, @Json(name = "fail_data") StatusScreenData failData, @Json(name = "success_data") StatusScreenData successData) {
                return new StatusScreen(pendingData, timeoutData, failData, successData);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StatusScreen)) {
                    return false;
                }
                StatusScreen statusScreen = (StatusScreen) other;
                return jl40.l(this.pendingData, statusScreen.pendingData) && jl40.l(this.timeoutData, statusScreen.timeoutData) && jl40.l(this.failData, statusScreen.failData) && jl40.l(this.successData, statusScreen.successData);
            }

            public final StatusScreenData getFailData() {
                return this.failData;
            }

            public final StatusScreenData getPendingData() {
                return this.pendingData;
            }

            public final StatusScreenData getSuccessData() {
                return this.successData;
            }

            public final StatusScreenData getTimeoutData() {
                return this.timeoutData;
            }

            public int hashCode() {
                return this.successData.hashCode() + ((this.failData.hashCode() + ((this.timeoutData.hashCode() + (this.pendingData.hashCode() * 31)) * 31)) * 31);
            }

            public String toString() {
                return "StatusScreen(pendingData=" + this.pendingData + ", timeoutData=" + this.timeoutData + ", failData=" + this.failData + ", successData=" + this.successData + Extension.C_BRAKE;
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$AutoTopupData$WalletPaymentMethod;", "", "trustId", "", "title", "icon", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getTrustId", "()Ljava/lang/String;", "getTitle", "getIcon", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class WalletPaymentMethod {
            private final Themes<String> icon;
            private final String title;
            private final String trustId;

            public WalletPaymentMethod(@Json(name = "trust_id") String str, @Json(name = "title") String str2, @Json(name = "icon") Themes<String> themes) {
                this.trustId = str;
                this.title = str2;
                this.icon = themes;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ WalletPaymentMethod copy$default(WalletPaymentMethod walletPaymentMethod, String str, String str2, Themes themes, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = walletPaymentMethod.trustId;
                }
                if ((i & 2) != 0) {
                    str2 = walletPaymentMethod.title;
                }
                if ((i & 4) != 0) {
                    themes = walletPaymentMethod.icon;
                }
                return walletPaymentMethod.copy(str, str2, themes);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTrustId() {
                return this.trustId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final Themes<String> component3() {
                return this.icon;
            }

            public final WalletPaymentMethod copy(@Json(name = "trust_id") String trustId, @Json(name = "title") String title, @Json(name = "icon") Themes<String> icon) {
                return new WalletPaymentMethod(trustId, title, icon);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof WalletPaymentMethod)) {
                    return false;
                }
                WalletPaymentMethod walletPaymentMethod = (WalletPaymentMethod) other;
                return jl40.l(this.trustId, walletPaymentMethod.trustId) && jl40.l(this.title, walletPaymentMethod.title) && jl40.l(this.icon, walletPaymentMethod.icon);
            }

            public final Themes<String> getIcon() {
                return this.icon;
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getTrustId() {
                return this.trustId;
            }

            public int hashCode() {
                return this.icon.hashCode() + unr0.b(this.trustId.hashCode() * 31, 31, this.title);
            }

            public String toString() {
                String str = this.trustId;
                String str2 = this.title;
                return smw0.l(b64.v("WalletPaymentMethod(trustId=", str, ", title=", str2, ", icon="), this.icon, Extension.C_BRAKE);
            }
        }

        public AutoTopupData(@Json(name = "payment_methods") PaymentMethodsBottomSheet paymentMethodsBottomSheet, @Json(name = "status_screen") StatusScreen statusScreen, @Json(name = "target_agreement_id") String str, @Json(name = "external_member_confirmation_deeplink") String str2, @Json(name = "auto_topup_settings") AutoTopupSettings autoTopupSettings, @Json(name = "wallet_payment_method") WalletPaymentMethod walletPaymentMethod) {
            this.paymentMethodsBottomSheet = paymentMethodsBottomSheet;
            this.statusScreen = statusScreen;
            this.targetAgreementId = str;
            this.externalMemberConfirmationDeeplink = str2;
            this.autoTopupSettings = autoTopupSettings;
            this.walletPaymentMethod = walletPaymentMethod;
        }

        public static /* synthetic */ AutoTopupData copy$default(AutoTopupData autoTopupData, PaymentMethodsBottomSheet paymentMethodsBottomSheet, StatusScreen statusScreen, String str, String str2, AutoTopupSettings autoTopupSettings, WalletPaymentMethod walletPaymentMethod, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentMethodsBottomSheet = autoTopupData.paymentMethodsBottomSheet;
            }
            if ((i & 2) != 0) {
                statusScreen = autoTopupData.statusScreen;
            }
            if ((i & 4) != 0) {
                str = autoTopupData.targetAgreementId;
            }
            if ((i & 8) != 0) {
                str2 = autoTopupData.externalMemberConfirmationDeeplink;
            }
            if ((i & 16) != 0) {
                autoTopupSettings = autoTopupData.autoTopupSettings;
            }
            if ((i & 32) != 0) {
                walletPaymentMethod = autoTopupData.walletPaymentMethod;
            }
            AutoTopupSettings autoTopupSettings2 = autoTopupSettings;
            WalletPaymentMethod walletPaymentMethod2 = walletPaymentMethod;
            return autoTopupData.copy(paymentMethodsBottomSheet, statusScreen, str, str2, autoTopupSettings2, walletPaymentMethod2);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentMethodsBottomSheet getPaymentMethodsBottomSheet() {
            return this.paymentMethodsBottomSheet;
        }

        /* renamed from: component2, reason: from getter */
        public final StatusScreen getStatusScreen() {
            return this.statusScreen;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTargetAgreementId() {
            return this.targetAgreementId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getExternalMemberConfirmationDeeplink() {
            return this.externalMemberConfirmationDeeplink;
        }

        /* renamed from: component5, reason: from getter */
        public final AutoTopupSettings getAutoTopupSettings() {
            return this.autoTopupSettings;
        }

        /* renamed from: component6, reason: from getter */
        public final WalletPaymentMethod getWalletPaymentMethod() {
            return this.walletPaymentMethod;
        }

        public final AutoTopupData copy(@Json(name = "payment_methods") PaymentMethodsBottomSheet paymentMethodsBottomSheet, @Json(name = "status_screen") StatusScreen statusScreen, @Json(name = "target_agreement_id") String targetAgreementId, @Json(name = "external_member_confirmation_deeplink") String externalMemberConfirmationDeeplink, @Json(name = "auto_topup_settings") AutoTopupSettings autoTopupSettings, @Json(name = "wallet_payment_method") WalletPaymentMethod walletPaymentMethod) {
            return new AutoTopupData(paymentMethodsBottomSheet, statusScreen, targetAgreementId, externalMemberConfirmationDeeplink, autoTopupSettings, walletPaymentMethod);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoTopupData)) {
                return false;
            }
            AutoTopupData autoTopupData = (AutoTopupData) other;
            return jl40.l(this.paymentMethodsBottomSheet, autoTopupData.paymentMethodsBottomSheet) && jl40.l(this.statusScreen, autoTopupData.statusScreen) && jl40.l(this.targetAgreementId, autoTopupData.targetAgreementId) && jl40.l(this.externalMemberConfirmationDeeplink, autoTopupData.externalMemberConfirmationDeeplink) && jl40.l(this.autoTopupSettings, autoTopupData.autoTopupSettings) && jl40.l(this.walletPaymentMethod, autoTopupData.walletPaymentMethod);
        }

        public final AutoTopupSettings getAutoTopupSettings() {
            return this.autoTopupSettings;
        }

        public final String getExternalMemberConfirmationDeeplink() {
            return this.externalMemberConfirmationDeeplink;
        }

        public final PaymentMethodsBottomSheet getPaymentMethodsBottomSheet() {
            return this.paymentMethodsBottomSheet;
        }

        public final StatusScreen getStatusScreen() {
            return this.statusScreen;
        }

        public final String getTargetAgreementId() {
            return this.targetAgreementId;
        }

        public final WalletPaymentMethod getWalletPaymentMethod() {
            return this.walletPaymentMethod;
        }

        public int hashCode() {
            int b = unr0.b((this.statusScreen.hashCode() + (this.paymentMethodsBottomSheet.hashCode() * 31)) * 31, 31, this.targetAgreementId);
            String str = this.externalMemberConfirmationDeeplink;
            return this.walletPaymentMethod.hashCode() + ((this.autoTopupSettings.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public String toString() {
            PaymentMethodsBottomSheet paymentMethodsBottomSheet = this.paymentMethodsBottomSheet;
            StatusScreen statusScreen = this.statusScreen;
            String str = this.targetAgreementId;
            String str2 = this.externalMemberConfirmationDeeplink;
            AutoTopupSettings autoTopupSettings = this.autoTopupSettings;
            WalletPaymentMethod walletPaymentMethod = this.walletPaymentMethod;
            StringBuilder sb = new StringBuilder("AutoTopupData(paymentMethodsBottomSheet=");
            sb.append(paymentMethodsBottomSheet);
            sb.append(", statusScreen=");
            sb.append(statusScreen);
            sb.append(", targetAgreementId=");
            g8e.D(sb, str, ", externalMemberConfirmationDeeplink=", str2, ", autoTopupSettings=");
            sb.append(autoTopupSettings);
            sb.append(", walletPaymentMethod=");
            sb.append(walletPaymentMethod);
            sb.append(Extension.C_BRAKE);
            return sb.toString();
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$Header;", "", "action", "", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Header {
        private final String action;
        private final String title;

        public Header(@Json(name = "action") String str, @Json(name = "title") String str2) {
            this.action = str;
            this.title = str2;
        }

        public static /* synthetic */ Header copy$default(Header header, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = header.action;
            }
            if ((i & 2) != 0) {
                str2 = header.title;
            }
            return header.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final Header copy(@Json(name = "action") String action, @Json(name = "title") String title) {
            return new Header(action, title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return jl40.l(this.action, header.action) && jl40.l(this.title, header.title);
        }

        public final String getAction() {
            return this.action;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode() + (this.action.hashCode() * 31);
        }

        public String toString() {
            return unr0.p("Header(action=", this.action, ", title=", this.title, Extension.C_BRAKE);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$PaymentMethod;", "", "id", "", "title", "icon", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getId", "()Ljava/lang/String;", "getTitle", "getIcon", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PaymentMethod {
        private final Themes<String> icon;
        private final String id;
        private final String title;

        public PaymentMethod(@Json(name = "trust_id") String str, @Json(name = "title") String str2, @Json(name = "icon") Themes<String> themes) {
            this.id = str;
            this.title = str2;
            this.icon = themes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethod copy$default(PaymentMethod paymentMethod, String str, String str2, Themes themes, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paymentMethod.id;
            }
            if ((i & 2) != 0) {
                str2 = paymentMethod.title;
            }
            if ((i & 4) != 0) {
                themes = paymentMethod.icon;
            }
            return paymentMethod.copy(str, str2, themes);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final Themes<String> component3() {
            return this.icon;
        }

        public final PaymentMethod copy(@Json(name = "trust_id") String id, @Json(name = "title") String title, @Json(name = "icon") Themes<String> icon) {
            return new PaymentMethod(id, title, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentMethod)) {
                return false;
            }
            PaymentMethod paymentMethod = (PaymentMethod) other;
            return jl40.l(this.id, paymentMethod.id) && jl40.l(this.title, paymentMethod.title) && jl40.l(this.icon, paymentMethod.icon);
        }

        public final Themes<String> getIcon() {
            return this.icon;
        }

        public final String getId() {
            return this.id;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int b = unr0.b(this.id.hashCode() * 31, 31, this.title);
            Themes<String> themes = this.icon;
            return b + (themes == null ? 0 : themes.hashCode());
        }

        public String toString() {
            String str = this.id;
            String str2 = this.title;
            return smw0.l(b64.v("PaymentMethod(id=", str, ", title=", str2, ", icon="), this.icon, Extension.C_BRAKE);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$TransactionStatusScreen;", "", "pendingScreenData", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/StatusScreenData;", "timeoutScreenData", "<init>", "(Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/StatusScreenData;Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/StatusScreenData;)V", "getPendingScreenData", "()Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/StatusScreenData;", "getTimeoutScreenData", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TransactionStatusScreen {
        private final StatusScreenData pendingScreenData;
        private final StatusScreenData timeoutScreenData;

        public TransactionStatusScreen(@Json(name = "pending_data") StatusScreenData statusScreenData, @Json(name = "timeout_data") StatusScreenData statusScreenData2) {
            this.pendingScreenData = statusScreenData;
            this.timeoutScreenData = statusScreenData2;
        }

        public static /* synthetic */ TransactionStatusScreen copy$default(TransactionStatusScreen transactionStatusScreen, StatusScreenData statusScreenData, StatusScreenData statusScreenData2, int i, Object obj) {
            if ((i & 1) != 0) {
                statusScreenData = transactionStatusScreen.pendingScreenData;
            }
            if ((i & 2) != 0) {
                statusScreenData2 = transactionStatusScreen.timeoutScreenData;
            }
            return transactionStatusScreen.copy(statusScreenData, statusScreenData2);
        }

        /* renamed from: component1, reason: from getter */
        public final StatusScreenData getPendingScreenData() {
            return this.pendingScreenData;
        }

        /* renamed from: component2, reason: from getter */
        public final StatusScreenData getTimeoutScreenData() {
            return this.timeoutScreenData;
        }

        public final TransactionStatusScreen copy(@Json(name = "pending_data") StatusScreenData pendingScreenData, @Json(name = "timeout_data") StatusScreenData timeoutScreenData) {
            return new TransactionStatusScreen(pendingScreenData, timeoutScreenData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransactionStatusScreen)) {
                return false;
            }
            TransactionStatusScreen transactionStatusScreen = (TransactionStatusScreen) other;
            return jl40.l(this.pendingScreenData, transactionStatusScreen.pendingScreenData) && jl40.l(this.timeoutScreenData, transactionStatusScreen.timeoutScreenData);
        }

        public final StatusScreenData getPendingScreenData() {
            return this.pendingScreenData;
        }

        public final StatusScreenData getTimeoutScreenData() {
            return this.timeoutScreenData;
        }

        public int hashCode() {
            return this.timeoutScreenData.hashCode() + (this.pendingScreenData.hashCode() * 31);
        }

        public String toString() {
            return "TransactionStatusScreen(pendingScreenData=" + this.pendingScreenData + ", timeoutScreenData=" + this.timeoutScreenData + Extension.C_BRAKE;
        }
    }

    public GetDepositPageResponse(@Json(name = "divkit_data") DivDataDto divDataDto, @Json(name = "header") Header header, @Json(name = "payment_method") PaymentMethod paymentMethod, @Json(name = "transaction_status_screen") TransactionStatusScreen transactionStatusScreen, @Json(name = "auto_topup_data") AutoTopupData autoTopupData) {
        this.divkitData = divDataDto;
        this.header = header;
        this.paymentMethod = paymentMethod;
        this.transactionStatusScreen = transactionStatusScreen;
        this.autoTopupData = autoTopupData;
    }

    public static /* synthetic */ GetDepositPageResponse copy$default(GetDepositPageResponse getDepositPageResponse, DivDataDto divDataDto, Header header, PaymentMethod paymentMethod, TransactionStatusScreen transactionStatusScreen, AutoTopupData autoTopupData, int i, Object obj) {
        if ((i & 1) != 0) {
            divDataDto = getDepositPageResponse.divkitData;
        }
        if ((i & 2) != 0) {
            header = getDepositPageResponse.header;
        }
        if ((i & 4) != 0) {
            paymentMethod = getDepositPageResponse.paymentMethod;
        }
        if ((i & 8) != 0) {
            transactionStatusScreen = getDepositPageResponse.transactionStatusScreen;
        }
        if ((i & 16) != 0) {
            autoTopupData = getDepositPageResponse.autoTopupData;
        }
        AutoTopupData autoTopupData2 = autoTopupData;
        PaymentMethod paymentMethod2 = paymentMethod;
        return getDepositPageResponse.copy(divDataDto, header, paymentMethod2, transactionStatusScreen, autoTopupData2);
    }

    /* renamed from: component1, reason: from getter */
    public final DivDataDto getDivkitData() {
        return this.divkitData;
    }

    /* renamed from: component2, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    /* renamed from: component3, reason: from getter */
    public final PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    /* renamed from: component4, reason: from getter */
    public final TransactionStatusScreen getTransactionStatusScreen() {
        return this.transactionStatusScreen;
    }

    /* renamed from: component5, reason: from getter */
    public final AutoTopupData getAutoTopupData() {
        return this.autoTopupData;
    }

    public final GetDepositPageResponse copy(@Json(name = "divkit_data") DivDataDto divkitData, @Json(name = "header") Header header, @Json(name = "payment_method") PaymentMethod paymentMethod, @Json(name = "transaction_status_screen") TransactionStatusScreen transactionStatusScreen, @Json(name = "auto_topup_data") AutoTopupData autoTopupData) {
        return new GetDepositPageResponse(divkitData, header, paymentMethod, transactionStatusScreen, autoTopupData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetDepositPageResponse)) {
            return false;
        }
        GetDepositPageResponse getDepositPageResponse = (GetDepositPageResponse) other;
        return jl40.l(this.divkitData, getDepositPageResponse.divkitData) && jl40.l(this.header, getDepositPageResponse.header) && jl40.l(this.paymentMethod, getDepositPageResponse.paymentMethod) && jl40.l(this.transactionStatusScreen, getDepositPageResponse.transactionStatusScreen) && jl40.l(this.autoTopupData, getDepositPageResponse.autoTopupData);
    }

    public final AutoTopupData getAutoTopupData() {
        return this.autoTopupData;
    }

    public final DivDataDto getDivkitData() {
        return this.divkitData;
    }

    public final Header getHeader() {
        return this.header;
    }

    public final PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public final TransactionStatusScreen getTransactionStatusScreen() {
        return this.transactionStatusScreen;
    }

    public int hashCode() {
        int hashCode = (this.transactionStatusScreen.hashCode() + ((this.paymentMethod.hashCode() + ((this.header.hashCode() + (this.divkitData.hashCode() * 31)) * 31)) * 31)) * 31;
        AutoTopupData autoTopupData = this.autoTopupData;
        return hashCode + (autoTopupData == null ? 0 : autoTopupData.hashCode());
    }

    public String toString() {
        return "GetDepositPageResponse(divkitData=" + this.divkitData + ", header=" + this.header + ", paymentMethod=" + this.paymentMethod + ", transactionStatusScreen=" + this.transactionStatusScreen + ", autoTopupData=" + this.autoTopupData + Extension.C_BRAKE;
    }
}
