package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPaymentIntervalResponse;", "", "type", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPaymentIntervalType;", "value", "", "<init>", "(Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPaymentIntervalType;I)V", "getType", "()Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPaymentIntervalType;", "getValue", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditLimitPlanPaymentIntervalResponse {
    private final CreditLimitPlanPaymentIntervalType type;
    private final int value;

    public CreditLimitPlanPaymentIntervalResponse(@Json(name = "type") CreditLimitPlanPaymentIntervalType creditLimitPlanPaymentIntervalType, @Json(name = "value") int i) {
        this.type = creditLimitPlanPaymentIntervalType;
        this.value = i;
    }

    public static /* synthetic */ CreditLimitPlanPaymentIntervalResponse copy$default(CreditLimitPlanPaymentIntervalResponse creditLimitPlanPaymentIntervalResponse, CreditLimitPlanPaymentIntervalType creditLimitPlanPaymentIntervalType, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            creditLimitPlanPaymentIntervalType = creditLimitPlanPaymentIntervalResponse.type;
        }
        if ((i2 & 2) != 0) {
            i = creditLimitPlanPaymentIntervalResponse.value;
        }
        return creditLimitPlanPaymentIntervalResponse.copy(creditLimitPlanPaymentIntervalType, i);
    }

    /* renamed from: component1, reason: from getter */
    public final CreditLimitPlanPaymentIntervalType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public final CreditLimitPlanPaymentIntervalResponse copy(@Json(name = "type") CreditLimitPlanPaymentIntervalType type, @Json(name = "value") int value) {
        return new CreditLimitPlanPaymentIntervalResponse(type, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditLimitPlanPaymentIntervalResponse)) {
            return false;
        }
        CreditLimitPlanPaymentIntervalResponse creditLimitPlanPaymentIntervalResponse = (CreditLimitPlanPaymentIntervalResponse) other;
        return this.type == creditLimitPlanPaymentIntervalResponse.type && this.value == creditLimitPlanPaymentIntervalResponse.value;
    }

    public final CreditLimitPlanPaymentIntervalType getType() {
        return this.type;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return Integer.hashCode(this.value) + (this.type.hashCode() * 31);
    }

    public String toString() {
        return "CreditLimitPlanPaymentIntervalResponse(type=" + this.type + ", value=" + this.value + Extension.C_BRAKE;
    }
}
