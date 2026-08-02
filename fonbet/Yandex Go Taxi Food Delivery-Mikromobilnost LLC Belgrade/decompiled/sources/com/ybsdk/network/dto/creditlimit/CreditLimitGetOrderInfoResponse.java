package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitGetOrderInfoResponse;", "", "plan", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanResponse;", "appLink", "", "<init>", "(Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanResponse;Ljava/lang/String;)V", "getPlan", "()Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanResponse;", "getAppLink", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditLimitGetOrderInfoResponse {
    private final String appLink;
    private final CreditLimitPlanResponse plan;

    public CreditLimitGetOrderInfoResponse(@Json(name = "plan") CreditLimitPlanResponse creditLimitPlanResponse, @Json(name = "JSON_FIELD_MEMBER_APP_LINK") String str) {
        this.plan = creditLimitPlanResponse;
        this.appLink = str;
    }

    public static /* synthetic */ CreditLimitGetOrderInfoResponse copy$default(CreditLimitGetOrderInfoResponse creditLimitGetOrderInfoResponse, CreditLimitPlanResponse creditLimitPlanResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            creditLimitPlanResponse = creditLimitGetOrderInfoResponse.plan;
        }
        if ((i & 2) != 0) {
            str = creditLimitGetOrderInfoResponse.appLink;
        }
        return creditLimitGetOrderInfoResponse.copy(creditLimitPlanResponse, str);
    }

    /* renamed from: component1, reason: from getter */
    public final CreditLimitPlanResponse getPlan() {
        return this.plan;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAppLink() {
        return this.appLink;
    }

    public final CreditLimitGetOrderInfoResponse copy(@Json(name = "plan") CreditLimitPlanResponse plan, @Json(name = "JSON_FIELD_MEMBER_APP_LINK") String appLink) {
        return new CreditLimitGetOrderInfoResponse(plan, appLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditLimitGetOrderInfoResponse)) {
            return false;
        }
        CreditLimitGetOrderInfoResponse creditLimitGetOrderInfoResponse = (CreditLimitGetOrderInfoResponse) other;
        return jl40.l(this.plan, creditLimitGetOrderInfoResponse.plan) && jl40.l(this.appLink, creditLimitGetOrderInfoResponse.appLink);
    }

    public final String getAppLink() {
        return this.appLink;
    }

    public final CreditLimitPlanResponse getPlan() {
        return this.plan;
    }

    public int hashCode() {
        return this.appLink.hashCode() + (this.plan.hashCode() * 31);
    }

    public String toString() {
        return "CreditLimitGetOrderInfoResponse(plan=" + this.plan + ", appLink=" + this.appLink + Extension.C_BRAKE;
    }
}
