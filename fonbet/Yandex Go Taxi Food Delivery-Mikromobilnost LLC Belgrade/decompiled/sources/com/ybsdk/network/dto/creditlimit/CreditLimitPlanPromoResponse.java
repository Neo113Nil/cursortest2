package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.MoneyCommonResponse;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003JQ\u0010#\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPromoResponse;", "", "type", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPromoType;", "fee", "Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;", "payments", "", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPaymentResponse;", "conditionAmount", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPromoOrderAmountCondition;", "disclaimerDocumentLink", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanDisclaimerResponse;", "id", "", "<init>", "(Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPromoType;Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;Ljava/util/List;Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPromoOrderAmountCondition;Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanDisclaimerResponse;Ljava/lang/String;)V", "getType", "()Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPromoType;", "getFee", "()Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;", "getPayments", "()Ljava/util/List;", "getConditionAmount", "()Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPromoOrderAmountCondition;", "getDisclaimerDocumentLink", "()Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanDisclaimerResponse;", "getId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditLimitPlanPromoResponse {
    private final CreditLimitPlanPromoOrderAmountCondition conditionAmount;
    private final CreditLimitPlanDisclaimerResponse disclaimerDocumentLink;
    private final MoneyCommonResponse fee;
    private final String id;
    private final List<CreditLimitPlanPaymentResponse> payments;
    private final CreditLimitPlanPromoType type;

    public CreditLimitPlanPromoResponse(@Json(name = "type") CreditLimitPlanPromoType creditLimitPlanPromoType, @Json(name = "fee") MoneyCommonResponse moneyCommonResponse, @Json(name = "payments") List<CreditLimitPlanPaymentResponse> list, @Json(name = "condition_amount") CreditLimitPlanPromoOrderAmountCondition creditLimitPlanPromoOrderAmountCondition, @Json(name = "disclaimer_document_link") CreditLimitPlanDisclaimerResponse creditLimitPlanDisclaimerResponse, @Json(name = "id") String str) {
        this.type = creditLimitPlanPromoType;
        this.fee = moneyCommonResponse;
        this.payments = list;
        this.conditionAmount = creditLimitPlanPromoOrderAmountCondition;
        this.disclaimerDocumentLink = creditLimitPlanDisclaimerResponse;
        this.id = str;
    }

    public static /* synthetic */ CreditLimitPlanPromoResponse copy$default(CreditLimitPlanPromoResponse creditLimitPlanPromoResponse, CreditLimitPlanPromoType creditLimitPlanPromoType, MoneyCommonResponse moneyCommonResponse, List list, CreditLimitPlanPromoOrderAmountCondition creditLimitPlanPromoOrderAmountCondition, CreditLimitPlanDisclaimerResponse creditLimitPlanDisclaimerResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            creditLimitPlanPromoType = creditLimitPlanPromoResponse.type;
        }
        if ((i & 2) != 0) {
            moneyCommonResponse = creditLimitPlanPromoResponse.fee;
        }
        if ((i & 4) != 0) {
            list = creditLimitPlanPromoResponse.payments;
        }
        if ((i & 8) != 0) {
            creditLimitPlanPromoOrderAmountCondition = creditLimitPlanPromoResponse.conditionAmount;
        }
        if ((i & 16) != 0) {
            creditLimitPlanDisclaimerResponse = creditLimitPlanPromoResponse.disclaimerDocumentLink;
        }
        if ((i & 32) != 0) {
            str = creditLimitPlanPromoResponse.id;
        }
        CreditLimitPlanDisclaimerResponse creditLimitPlanDisclaimerResponse2 = creditLimitPlanDisclaimerResponse;
        String str2 = str;
        return creditLimitPlanPromoResponse.copy(creditLimitPlanPromoType, moneyCommonResponse, list, creditLimitPlanPromoOrderAmountCondition, creditLimitPlanDisclaimerResponse2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final CreditLimitPlanPromoType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final MoneyCommonResponse getFee() {
        return this.fee;
    }

    public final List<CreditLimitPlanPaymentResponse> component3() {
        return this.payments;
    }

    /* renamed from: component4, reason: from getter */
    public final CreditLimitPlanPromoOrderAmountCondition getConditionAmount() {
        return this.conditionAmount;
    }

    /* renamed from: component5, reason: from getter */
    public final CreditLimitPlanDisclaimerResponse getDisclaimerDocumentLink() {
        return this.disclaimerDocumentLink;
    }

    /* renamed from: component6, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final CreditLimitPlanPromoResponse copy(@Json(name = "type") CreditLimitPlanPromoType type, @Json(name = "fee") MoneyCommonResponse fee, @Json(name = "payments") List<CreditLimitPlanPaymentResponse> payments, @Json(name = "condition_amount") CreditLimitPlanPromoOrderAmountCondition conditionAmount, @Json(name = "disclaimer_document_link") CreditLimitPlanDisclaimerResponse disclaimerDocumentLink, @Json(name = "id") String id) {
        return new CreditLimitPlanPromoResponse(type, fee, payments, conditionAmount, disclaimerDocumentLink, id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditLimitPlanPromoResponse)) {
            return false;
        }
        CreditLimitPlanPromoResponse creditLimitPlanPromoResponse = (CreditLimitPlanPromoResponse) other;
        return this.type == creditLimitPlanPromoResponse.type && jl40.l(this.fee, creditLimitPlanPromoResponse.fee) && jl40.l(this.payments, creditLimitPlanPromoResponse.payments) && jl40.l(this.conditionAmount, creditLimitPlanPromoResponse.conditionAmount) && jl40.l(this.disclaimerDocumentLink, creditLimitPlanPromoResponse.disclaimerDocumentLink) && jl40.l(this.id, creditLimitPlanPromoResponse.id);
    }

    public final CreditLimitPlanPromoOrderAmountCondition getConditionAmount() {
        return this.conditionAmount;
    }

    public final CreditLimitPlanDisclaimerResponse getDisclaimerDocumentLink() {
        return this.disclaimerDocumentLink;
    }

    public final MoneyCommonResponse getFee() {
        return this.fee;
    }

    public final String getId() {
        return this.id;
    }

    public final List<CreditLimitPlanPaymentResponse> getPayments() {
        return this.payments;
    }

    public final CreditLimitPlanPromoType getType() {
        return this.type;
    }

    public int hashCode() {
        int c = unr0.c((this.fee.hashCode() + (this.type.hashCode() * 31)) * 31, 31, this.payments);
        CreditLimitPlanPromoOrderAmountCondition creditLimitPlanPromoOrderAmountCondition = this.conditionAmount;
        int hashCode = (c + (creditLimitPlanPromoOrderAmountCondition == null ? 0 : creditLimitPlanPromoOrderAmountCondition.hashCode())) * 31;
        CreditLimitPlanDisclaimerResponse creditLimitPlanDisclaimerResponse = this.disclaimerDocumentLink;
        int hashCode2 = (hashCode + (creditLimitPlanDisclaimerResponse == null ? 0 : creditLimitPlanDisclaimerResponse.hashCode())) * 31;
        String str = this.id;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "CreditLimitPlanPromoResponse(type=" + this.type + ", fee=" + this.fee + ", payments=" + this.payments + ", conditionAmount=" + this.conditionAmount + ", disclaimerDocumentLink=" + this.disclaimerDocumentLink + ", id=" + this.id + Extension.C_BRAKE;
    }
}
