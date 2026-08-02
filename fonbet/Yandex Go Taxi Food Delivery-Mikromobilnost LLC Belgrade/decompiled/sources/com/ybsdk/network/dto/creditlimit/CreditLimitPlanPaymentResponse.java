package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.MoneyCommonResponse;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPaymentResponse;", "", "dateTime", "", "amount", "Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;", ACSPConstants.STATUS, "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPaymentStatus;", "overpaymentAmount", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPaymentStatus;Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;)V", "getDateTime", "()Ljava/lang/String;", "getAmount", "()Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;", "getStatus", "()Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPaymentStatus;", "getOverpaymentAmount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditLimitPlanPaymentResponse {
    private final MoneyCommonResponse amount;
    private final String dateTime;
    private final MoneyCommonResponse overpaymentAmount;
    private final CreditLimitPlanPaymentStatus status;

    public CreditLimitPlanPaymentResponse(@Json(name = "date_time") String str, @Json(name = "amount") MoneyCommonResponse moneyCommonResponse, @Json(name = "status") CreditLimitPlanPaymentStatus creditLimitPlanPaymentStatus, @Json(name = "overpayment_amount") MoneyCommonResponse moneyCommonResponse2) {
        this.dateTime = str;
        this.amount = moneyCommonResponse;
        this.status = creditLimitPlanPaymentStatus;
        this.overpaymentAmount = moneyCommonResponse2;
    }

    public static /* synthetic */ CreditLimitPlanPaymentResponse copy$default(CreditLimitPlanPaymentResponse creditLimitPlanPaymentResponse, String str, MoneyCommonResponse moneyCommonResponse, CreditLimitPlanPaymentStatus creditLimitPlanPaymentStatus, MoneyCommonResponse moneyCommonResponse2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditLimitPlanPaymentResponse.dateTime;
        }
        if ((i & 2) != 0) {
            moneyCommonResponse = creditLimitPlanPaymentResponse.amount;
        }
        if ((i & 4) != 0) {
            creditLimitPlanPaymentStatus = creditLimitPlanPaymentResponse.status;
        }
        if ((i & 8) != 0) {
            moneyCommonResponse2 = creditLimitPlanPaymentResponse.overpaymentAmount;
        }
        return creditLimitPlanPaymentResponse.copy(str, moneyCommonResponse, creditLimitPlanPaymentStatus, moneyCommonResponse2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDateTime() {
        return this.dateTime;
    }

    /* renamed from: component2, reason: from getter */
    public final MoneyCommonResponse getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final CreditLimitPlanPaymentStatus getStatus() {
        return this.status;
    }

    /* renamed from: component4, reason: from getter */
    public final MoneyCommonResponse getOverpaymentAmount() {
        return this.overpaymentAmount;
    }

    public final CreditLimitPlanPaymentResponse copy(@Json(name = "date_time") String dateTime, @Json(name = "amount") MoneyCommonResponse amount, @Json(name = "status") CreditLimitPlanPaymentStatus status, @Json(name = "overpayment_amount") MoneyCommonResponse overpaymentAmount) {
        return new CreditLimitPlanPaymentResponse(dateTime, amount, status, overpaymentAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditLimitPlanPaymentResponse)) {
            return false;
        }
        CreditLimitPlanPaymentResponse creditLimitPlanPaymentResponse = (CreditLimitPlanPaymentResponse) other;
        return jl40.l(this.dateTime, creditLimitPlanPaymentResponse.dateTime) && jl40.l(this.amount, creditLimitPlanPaymentResponse.amount) && this.status == creditLimitPlanPaymentResponse.status && jl40.l(this.overpaymentAmount, creditLimitPlanPaymentResponse.overpaymentAmount);
    }

    public final MoneyCommonResponse getAmount() {
        return this.amount;
    }

    public final String getDateTime() {
        return this.dateTime;
    }

    public final MoneyCommonResponse getOverpaymentAmount() {
        return this.overpaymentAmount;
    }

    public final CreditLimitPlanPaymentStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = (this.status.hashCode() + ((this.amount.hashCode() + (this.dateTime.hashCode() * 31)) * 31)) * 31;
        MoneyCommonResponse moneyCommonResponse = this.overpaymentAmount;
        return hashCode + (moneyCommonResponse == null ? 0 : moneyCommonResponse.hashCode());
    }

    public String toString() {
        return "CreditLimitPlanPaymentResponse(dateTime=" + this.dateTime + ", amount=" + this.amount + ", status=" + this.status + ", overpaymentAmount=" + this.overpaymentAmount + Extension.C_BRAKE;
    }
}
