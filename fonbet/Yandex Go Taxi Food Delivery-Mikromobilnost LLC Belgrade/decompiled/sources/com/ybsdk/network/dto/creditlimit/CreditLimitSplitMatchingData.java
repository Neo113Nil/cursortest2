package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JS\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006$"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitSplitMatchingData;", "", "purchaseTimestamp", "", "purchaseSum", "Lcom/ybsdk/core/common/data/network/dto/Money;", "cardId", "merchantId", "externalId", FinishFlowStatus.ORDER_ID_FIELD_NAME, "splitId", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPurchaseTimestamp", "()Ljava/lang/String;", "getPurchaseSum", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getCardId", "getMerchantId", "getExternalId", "getOrderId", "getSplitId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditLimitSplitMatchingData {
    private final String cardId;
    private final String externalId;
    private final String merchantId;
    private final String orderId;
    private final Money purchaseSum;
    private final String purchaseTimestamp;
    private final String splitId;

    public CreditLimitSplitMatchingData(@Json(name = "purchase_timestamp") String str, @Json(name = "purchase_sum") Money money, @Json(name = "card_id") String str2, @Json(name = "merchant_id") String str3, @Json(name = "external_id") String str4, @Json(name = "order_id") String str5, @Json(name = "split_id") String str6) {
        this.purchaseTimestamp = str;
        this.purchaseSum = money;
        this.cardId = str2;
        this.merchantId = str3;
        this.externalId = str4;
        this.orderId = str5;
        this.splitId = str6;
    }

    public static /* synthetic */ CreditLimitSplitMatchingData copy$default(CreditLimitSplitMatchingData creditLimitSplitMatchingData, String str, Money money, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditLimitSplitMatchingData.purchaseTimestamp;
        }
        if ((i & 2) != 0) {
            money = creditLimitSplitMatchingData.purchaseSum;
        }
        if ((i & 4) != 0) {
            str2 = creditLimitSplitMatchingData.cardId;
        }
        if ((i & 8) != 0) {
            str3 = creditLimitSplitMatchingData.merchantId;
        }
        if ((i & 16) != 0) {
            str4 = creditLimitSplitMatchingData.externalId;
        }
        if ((i & 32) != 0) {
            str5 = creditLimitSplitMatchingData.orderId;
        }
        if ((i & 64) != 0) {
            str6 = creditLimitSplitMatchingData.splitId;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str2;
        return creditLimitSplitMatchingData.copy(str, money, str10, str3, str9, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPurchaseTimestamp() {
        return this.purchaseTimestamp;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getPurchaseSum() {
        return this.purchaseSum;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMerchantId() {
        return this.merchantId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getExternalId() {
        return this.externalId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSplitId() {
        return this.splitId;
    }

    public final CreditLimitSplitMatchingData copy(@Json(name = "purchase_timestamp") String purchaseTimestamp, @Json(name = "purchase_sum") Money purchaseSum, @Json(name = "card_id") String cardId, @Json(name = "merchant_id") String merchantId, @Json(name = "external_id") String externalId, @Json(name = "order_id") String orderId, @Json(name = "split_id") String splitId) {
        return new CreditLimitSplitMatchingData(purchaseTimestamp, purchaseSum, cardId, merchantId, externalId, orderId, splitId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditLimitSplitMatchingData)) {
            return false;
        }
        CreditLimitSplitMatchingData creditLimitSplitMatchingData = (CreditLimitSplitMatchingData) other;
        return jl40.l(this.purchaseTimestamp, creditLimitSplitMatchingData.purchaseTimestamp) && jl40.l(this.purchaseSum, creditLimitSplitMatchingData.purchaseSum) && jl40.l(this.cardId, creditLimitSplitMatchingData.cardId) && jl40.l(this.merchantId, creditLimitSplitMatchingData.merchantId) && jl40.l(this.externalId, creditLimitSplitMatchingData.externalId) && jl40.l(this.orderId, creditLimitSplitMatchingData.orderId) && jl40.l(this.splitId, creditLimitSplitMatchingData.splitId);
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final String getMerchantId() {
        return this.merchantId;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final Money getPurchaseSum() {
        return this.purchaseSum;
    }

    public final String getPurchaseTimestamp() {
        return this.purchaseTimestamp;
    }

    public final String getSplitId() {
        return this.splitId;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(tse0.c(this.purchaseSum, this.purchaseTimestamp.hashCode() * 31, 31), 31, this.cardId), 31, this.merchantId), 31, this.externalId);
        String str = this.orderId;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.splitId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.purchaseTimestamp;
        Money money = this.purchaseSum;
        String str2 = this.cardId;
        String str3 = this.merchantId;
        String str4 = this.externalId;
        String str5 = this.orderId;
        String str6 = this.splitId;
        StringBuilder sb = new StringBuilder("CreditLimitSplitMatchingData(purchaseTimestamp=");
        sb.append(str);
        sb.append(", purchaseSum=");
        sb.append(money);
        sb.append(", cardId=");
        g8e.D(sb, str2, ", merchantId=", str3, ", externalId=");
        g8e.D(sb, str4, ", orderId=", str5, ", splitId=");
        return oyr.t(sb, str6, Extension.C_BRAKE);
    }
}
