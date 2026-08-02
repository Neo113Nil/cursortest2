package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.MoneyCommonResponse;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditPlanLimitResponse;", "", "remaining", "Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;", "base", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;)V", "getRemaining", "()Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;", "getBase", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditPlanLimitResponse {
    private final MoneyCommonResponse base;
    private final MoneyCommonResponse remaining;

    public CreditPlanLimitResponse(@Json(name = "remaining") MoneyCommonResponse moneyCommonResponse, @Json(name = "base") MoneyCommonResponse moneyCommonResponse2) {
        this.remaining = moneyCommonResponse;
        this.base = moneyCommonResponse2;
    }

    public static /* synthetic */ CreditPlanLimitResponse copy$default(CreditPlanLimitResponse creditPlanLimitResponse, MoneyCommonResponse moneyCommonResponse, MoneyCommonResponse moneyCommonResponse2, int i, Object obj) {
        if ((i & 1) != 0) {
            moneyCommonResponse = creditPlanLimitResponse.remaining;
        }
        if ((i & 2) != 0) {
            moneyCommonResponse2 = creditPlanLimitResponse.base;
        }
        return creditPlanLimitResponse.copy(moneyCommonResponse, moneyCommonResponse2);
    }

    /* renamed from: component1, reason: from getter */
    public final MoneyCommonResponse getRemaining() {
        return this.remaining;
    }

    /* renamed from: component2, reason: from getter */
    public final MoneyCommonResponse getBase() {
        return this.base;
    }

    public final CreditPlanLimitResponse copy(@Json(name = "remaining") MoneyCommonResponse remaining, @Json(name = "base") MoneyCommonResponse base) {
        return new CreditPlanLimitResponse(remaining, base);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditPlanLimitResponse)) {
            return false;
        }
        CreditPlanLimitResponse creditPlanLimitResponse = (CreditPlanLimitResponse) other;
        return jl40.l(this.remaining, creditPlanLimitResponse.remaining) && jl40.l(this.base, creditPlanLimitResponse.base);
    }

    public final MoneyCommonResponse getBase() {
        return this.base;
    }

    public final MoneyCommonResponse getRemaining() {
        return this.remaining;
    }

    public int hashCode() {
        return this.base.hashCode() + (this.remaining.hashCode() * 31);
    }

    public String toString() {
        return "CreditPlanLimitResponse(remaining=" + this.remaining + ", base=" + this.base + Extension.C_BRAKE;
    }
}
