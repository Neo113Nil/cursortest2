package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.MoneyCommonResponse;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPromoOrderAmountCondition;", "", "minAmount", "Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;", "maxAmount", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;)V", "getMinAmount", "()Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;", "getMaxAmount", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditLimitPlanPromoOrderAmountCondition {
    private final MoneyCommonResponse maxAmount;
    private final MoneyCommonResponse minAmount;

    public CreditLimitPlanPromoOrderAmountCondition(@Json(name = "min_amount") MoneyCommonResponse moneyCommonResponse, @Json(name = "max_amount") MoneyCommonResponse moneyCommonResponse2) {
        this.minAmount = moneyCommonResponse;
        this.maxAmount = moneyCommonResponse2;
    }

    public static /* synthetic */ CreditLimitPlanPromoOrderAmountCondition copy$default(CreditLimitPlanPromoOrderAmountCondition creditLimitPlanPromoOrderAmountCondition, MoneyCommonResponse moneyCommonResponse, MoneyCommonResponse moneyCommonResponse2, int i, Object obj) {
        if ((i & 1) != 0) {
            moneyCommonResponse = creditLimitPlanPromoOrderAmountCondition.minAmount;
        }
        if ((i & 2) != 0) {
            moneyCommonResponse2 = creditLimitPlanPromoOrderAmountCondition.maxAmount;
        }
        return creditLimitPlanPromoOrderAmountCondition.copy(moneyCommonResponse, moneyCommonResponse2);
    }

    /* renamed from: component1, reason: from getter */
    public final MoneyCommonResponse getMinAmount() {
        return this.minAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final MoneyCommonResponse getMaxAmount() {
        return this.maxAmount;
    }

    public final CreditLimitPlanPromoOrderAmountCondition copy(@Json(name = "min_amount") MoneyCommonResponse minAmount, @Json(name = "max_amount") MoneyCommonResponse maxAmount) {
        return new CreditLimitPlanPromoOrderAmountCondition(minAmount, maxAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditLimitPlanPromoOrderAmountCondition)) {
            return false;
        }
        CreditLimitPlanPromoOrderAmountCondition creditLimitPlanPromoOrderAmountCondition = (CreditLimitPlanPromoOrderAmountCondition) other;
        return jl40.l(this.minAmount, creditLimitPlanPromoOrderAmountCondition.minAmount) && jl40.l(this.maxAmount, creditLimitPlanPromoOrderAmountCondition.maxAmount);
    }

    public final MoneyCommonResponse getMaxAmount() {
        return this.maxAmount;
    }

    public final MoneyCommonResponse getMinAmount() {
        return this.minAmount;
    }

    public int hashCode() {
        MoneyCommonResponse moneyCommonResponse = this.minAmount;
        int hashCode = (moneyCommonResponse == null ? 0 : moneyCommonResponse.hashCode()) * 31;
        MoneyCommonResponse moneyCommonResponse2 = this.maxAmount;
        return hashCode + (moneyCommonResponse2 != null ? moneyCommonResponse2.hashCode() : 0);
    }

    public String toString() {
        return "CreditLimitPlanPromoOrderAmountCondition(minAmount=" + this.minAmount + ", maxAmount=" + this.maxAmount + Extension.C_BRAKE;
    }
}
