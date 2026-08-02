package com.ybsdk.feature.transactions.impl.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.transactions.api.dto.Transaction;
import com.ybsdk.feature.transactions.api.entities.TransactionEntity;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u000223Bo\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u0007\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jq\u0010+\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0003\u0010\n\u001a\u00020\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00064"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionInfoResponse;", "", "baseTransactionInfo", "Lcom/ybsdk/feature/transactions/api/dto/Transaction;", "error", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionErrorResponse;", "statement", "", "fee", "Lcom/ybsdk/core/common/data/network/dto/Money;", "supportUrl", "mccCategory", "mcc", "usedCardInfo", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionInfoResponse$UsedCardInfo;", "usedTokenInfo", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionInfoResponse$UsedTokenInfo;", "<init>", "(Lcom/ybsdk/feature/transactions/api/dto/Transaction;Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionErrorResponse;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionInfoResponse$UsedCardInfo;Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionInfoResponse$UsedTokenInfo;)V", "getBaseTransactionInfo", "()Lcom/ybsdk/feature/transactions/api/dto/Transaction;", "getError", "()Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionErrorResponse;", "getStatement", "()Ljava/lang/String;", "getFee", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getSupportUrl", "getMccCategory", "getMcc", "getUsedCardInfo", "()Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionInfoResponse$UsedCardInfo;", "getUsedTokenInfo", "()Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionInfoResponse$UsedTokenInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "UsedCardInfo", "UsedTokenInfo", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransactionInfoResponse {
    private final Transaction baseTransactionInfo;
    private final TransactionErrorResponse error;
    private final Money fee;
    private final String mcc;
    private final String mccCategory;
    private final String statement;
    private final String supportUrl;
    private final UsedCardInfo usedCardInfo;
    private final UsedTokenInfo usedTokenInfo;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionInfoResponse$UsedCardInfo;", "", "lastDigits", "", "paymentSystem", "Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$PaymentSystem;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$PaymentSystem;)V", "getLastDigits", "()Ljava/lang/String;", "getPaymentSystem", "()Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$PaymentSystem;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UsedCardInfo {
        private final String lastDigits;
        private final TransactionEntity.PaymentSystem paymentSystem;

        public UsedCardInfo(@Json(name = "last_digits") String str, @Json(name = "payment_system") TransactionEntity.PaymentSystem paymentSystem) {
            this.lastDigits = str;
            this.paymentSystem = paymentSystem;
        }

        public static /* synthetic */ UsedCardInfo copy$default(UsedCardInfo usedCardInfo, String str, TransactionEntity.PaymentSystem paymentSystem, int i, Object obj) {
            if ((i & 1) != 0) {
                str = usedCardInfo.lastDigits;
            }
            if ((i & 2) != 0) {
                paymentSystem = usedCardInfo.paymentSystem;
            }
            return usedCardInfo.copy(str, paymentSystem);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLastDigits() {
            return this.lastDigits;
        }

        /* renamed from: component2, reason: from getter */
        public final TransactionEntity.PaymentSystem getPaymentSystem() {
            return this.paymentSystem;
        }

        public final UsedCardInfo copy(@Json(name = "last_digits") String lastDigits, @Json(name = "payment_system") TransactionEntity.PaymentSystem paymentSystem) {
            return new UsedCardInfo(lastDigits, paymentSystem);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UsedCardInfo)) {
                return false;
            }
            UsedCardInfo usedCardInfo = (UsedCardInfo) other;
            return jl40.l(this.lastDigits, usedCardInfo.lastDigits) && this.paymentSystem == usedCardInfo.paymentSystem;
        }

        public final String getLastDigits() {
            return this.lastDigits;
        }

        public final TransactionEntity.PaymentSystem getPaymentSystem() {
            return this.paymentSystem;
        }

        public int hashCode() {
            return this.paymentSystem.hashCode() + (this.lastDigits.hashCode() * 31);
        }

        public String toString() {
            return "UsedCardInfo(lastDigits=" + this.lastDigits + ", paymentSystem=" + this.paymentSystem + Extension.C_BRAKE;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionInfoResponse$UsedTokenInfo;", "", "lastDigits", "", "provider", "Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$TokenProvider;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$TokenProvider;)V", "getLastDigits", "()Ljava/lang/String;", "getProvider", "()Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$TokenProvider;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UsedTokenInfo {
        private final String lastDigits;
        private final TransactionEntity.TokenProvider provider;

        public UsedTokenInfo(@Json(name = "pan_suffix") String str, @Json(name = "provider") TransactionEntity.TokenProvider tokenProvider) {
            this.lastDigits = str;
            this.provider = tokenProvider;
        }

        public static /* synthetic */ UsedTokenInfo copy$default(UsedTokenInfo usedTokenInfo, String str, TransactionEntity.TokenProvider tokenProvider, int i, Object obj) {
            if ((i & 1) != 0) {
                str = usedTokenInfo.lastDigits;
            }
            if ((i & 2) != 0) {
                tokenProvider = usedTokenInfo.provider;
            }
            return usedTokenInfo.copy(str, tokenProvider);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLastDigits() {
            return this.lastDigits;
        }

        /* renamed from: component2, reason: from getter */
        public final TransactionEntity.TokenProvider getProvider() {
            return this.provider;
        }

        public final UsedTokenInfo copy(@Json(name = "pan_suffix") String lastDigits, @Json(name = "provider") TransactionEntity.TokenProvider provider) {
            return new UsedTokenInfo(lastDigits, provider);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UsedTokenInfo)) {
                return false;
            }
            UsedTokenInfo usedTokenInfo = (UsedTokenInfo) other;
            return jl40.l(this.lastDigits, usedTokenInfo.lastDigits) && this.provider == usedTokenInfo.provider;
        }

        public final String getLastDigits() {
            return this.lastDigits;
        }

        public final TransactionEntity.TokenProvider getProvider() {
            return this.provider;
        }

        public int hashCode() {
            return this.provider.hashCode() + (this.lastDigits.hashCode() * 31);
        }

        public String toString() {
            return "UsedTokenInfo(lastDigits=" + this.lastDigits + ", provider=" + this.provider + Extension.C_BRAKE;
        }
    }

    public /* synthetic */ TransactionInfoResponse(Transaction transaction, TransactionErrorResponse transactionErrorResponse, String str, Money money, String str2, String str3, String str4, UsedCardInfo usedCardInfo, UsedTokenInfo usedTokenInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(transaction, (i & 2) != 0 ? null : transactionErrorResponse, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : money, str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : usedCardInfo, (i & 256) != 0 ? null : usedTokenInfo);
    }

    public static /* synthetic */ TransactionInfoResponse copy$default(TransactionInfoResponse transactionInfoResponse, Transaction transaction, TransactionErrorResponse transactionErrorResponse, String str, Money money, String str2, String str3, String str4, UsedCardInfo usedCardInfo, UsedTokenInfo usedTokenInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            transaction = transactionInfoResponse.baseTransactionInfo;
        }
        if ((i & 2) != 0) {
            transactionErrorResponse = transactionInfoResponse.error;
        }
        if ((i & 4) != 0) {
            str = transactionInfoResponse.statement;
        }
        if ((i & 8) != 0) {
            money = transactionInfoResponse.fee;
        }
        if ((i & 16) != 0) {
            str2 = transactionInfoResponse.supportUrl;
        }
        if ((i & 32) != 0) {
            str3 = transactionInfoResponse.mccCategory;
        }
        if ((i & 64) != 0) {
            str4 = transactionInfoResponse.mcc;
        }
        if ((i & 128) != 0) {
            usedCardInfo = transactionInfoResponse.usedCardInfo;
        }
        if ((i & 256) != 0) {
            usedTokenInfo = transactionInfoResponse.usedTokenInfo;
        }
        UsedCardInfo usedCardInfo2 = usedCardInfo;
        UsedTokenInfo usedTokenInfo2 = usedTokenInfo;
        String str5 = str3;
        String str6 = str4;
        String str7 = str2;
        String str8 = str;
        return transactionInfoResponse.copy(transaction, transactionErrorResponse, str8, money, str7, str5, str6, usedCardInfo2, usedTokenInfo2);
    }

    /* renamed from: component1, reason: from getter */
    public final Transaction getBaseTransactionInfo() {
        return this.baseTransactionInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final TransactionErrorResponse getError() {
        return this.error;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStatement() {
        return this.statement;
    }

    /* renamed from: component4, reason: from getter */
    public final Money getFee() {
        return this.fee;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSupportUrl() {
        return this.supportUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMccCategory() {
        return this.mccCategory;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMcc() {
        return this.mcc;
    }

    /* renamed from: component8, reason: from getter */
    public final UsedCardInfo getUsedCardInfo() {
        return this.usedCardInfo;
    }

    /* renamed from: component9, reason: from getter */
    public final UsedTokenInfo getUsedTokenInfo() {
        return this.usedTokenInfo;
    }

    public final TransactionInfoResponse copy(@Json(name = "base_info") Transaction baseTransactionInfo, @Json(name = "error") TransactionErrorResponse error, @Json(name = "statement") String statement, @Json(name = "fee") Money fee, @Json(name = "support_url") String supportUrl, @Json(name = "mcc_category") String mccCategory, @Json(name = "mcc") String mcc, @Json(name = "used_card") UsedCardInfo usedCardInfo, @Json(name = "used_token") UsedTokenInfo usedTokenInfo) {
        return new TransactionInfoResponse(baseTransactionInfo, error, statement, fee, supportUrl, mccCategory, mcc, usedCardInfo, usedTokenInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionInfoResponse)) {
            return false;
        }
        TransactionInfoResponse transactionInfoResponse = (TransactionInfoResponse) other;
        return jl40.l(this.baseTransactionInfo, transactionInfoResponse.baseTransactionInfo) && jl40.l(this.error, transactionInfoResponse.error) && jl40.l(this.statement, transactionInfoResponse.statement) && jl40.l(this.fee, transactionInfoResponse.fee) && jl40.l(this.supportUrl, transactionInfoResponse.supportUrl) && jl40.l(this.mccCategory, transactionInfoResponse.mccCategory) && jl40.l(this.mcc, transactionInfoResponse.mcc) && jl40.l(this.usedCardInfo, transactionInfoResponse.usedCardInfo) && jl40.l(this.usedTokenInfo, transactionInfoResponse.usedTokenInfo);
    }

    public final Transaction getBaseTransactionInfo() {
        return this.baseTransactionInfo;
    }

    public final TransactionErrorResponse getError() {
        return this.error;
    }

    public final Money getFee() {
        return this.fee;
    }

    public final String getMcc() {
        return this.mcc;
    }

    public final String getMccCategory() {
        return this.mccCategory;
    }

    public final String getStatement() {
        return this.statement;
    }

    public final String getSupportUrl() {
        return this.supportUrl;
    }

    public final UsedCardInfo getUsedCardInfo() {
        return this.usedCardInfo;
    }

    public final UsedTokenInfo getUsedTokenInfo() {
        return this.usedTokenInfo;
    }

    public int hashCode() {
        int hashCode = this.baseTransactionInfo.hashCode() * 31;
        TransactionErrorResponse transactionErrorResponse = this.error;
        int hashCode2 = (hashCode + (transactionErrorResponse == null ? 0 : transactionErrorResponse.hashCode())) * 31;
        String str = this.statement;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Money money = this.fee;
        int b = unr0.b((hashCode3 + (money == null ? 0 : money.hashCode())) * 31, 31, this.supportUrl);
        String str2 = this.mccCategory;
        int hashCode4 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mcc;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UsedCardInfo usedCardInfo = this.usedCardInfo;
        int hashCode6 = (hashCode5 + (usedCardInfo == null ? 0 : usedCardInfo.hashCode())) * 31;
        UsedTokenInfo usedTokenInfo = this.usedTokenInfo;
        return hashCode6 + (usedTokenInfo != null ? usedTokenInfo.hashCode() : 0);
    }

    public String toString() {
        Transaction transaction = this.baseTransactionInfo;
        TransactionErrorResponse transactionErrorResponse = this.error;
        String str = this.statement;
        Money money = this.fee;
        String str2 = this.supportUrl;
        String str3 = this.mccCategory;
        String str4 = this.mcc;
        UsedCardInfo usedCardInfo = this.usedCardInfo;
        UsedTokenInfo usedTokenInfo = this.usedTokenInfo;
        StringBuilder sb = new StringBuilder("TransactionInfoResponse(baseTransactionInfo=");
        sb.append(transaction);
        sb.append(", error=");
        sb.append(transactionErrorResponse);
        sb.append(", statement=");
        sb.append(str);
        sb.append(", fee=");
        sb.append(money);
        sb.append(", supportUrl=");
        g8e.D(sb, str2, ", mccCategory=", str3, ", mcc=");
        sb.append(str4);
        sb.append(", usedCardInfo=");
        sb.append(usedCardInfo);
        sb.append(", usedTokenInfo=");
        sb.append(usedTokenInfo);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public TransactionInfoResponse(@Json(name = "base_info") Transaction transaction, @Json(name = "error") TransactionErrorResponse transactionErrorResponse, @Json(name = "statement") String str, @Json(name = "fee") Money money, @Json(name = "support_url") String str2, @Json(name = "mcc_category") String str3, @Json(name = "mcc") String str4, @Json(name = "used_card") UsedCardInfo usedCardInfo, @Json(name = "used_token") UsedTokenInfo usedTokenInfo) {
        this.baseTransactionInfo = transaction;
        this.error = transactionErrorResponse;
        this.statement = str;
        this.fee = money;
        this.supportUrl = str2;
        this.mccCategory = str3;
        this.mcc = str4;
        this.usedCardInfo = usedCardInfo;
        this.usedTokenInfo = usedTokenInfo;
    }
}
