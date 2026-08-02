package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.nzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanAdditionalProperties;", "", "isBestByFee", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditLimitPlanAdditionalProperties {
    private final boolean isBestByFee;

    public CreditLimitPlanAdditionalProperties(@Json(name = "is_best_by_fee") boolean z) {
        this.isBestByFee = z;
    }

    public static /* synthetic */ CreditLimitPlanAdditionalProperties copy$default(CreditLimitPlanAdditionalProperties creditLimitPlanAdditionalProperties, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = creditLimitPlanAdditionalProperties.isBestByFee;
        }
        return creditLimitPlanAdditionalProperties.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsBestByFee() {
        return this.isBestByFee;
    }

    public final CreditLimitPlanAdditionalProperties copy(@Json(name = "is_best_by_fee") boolean isBestByFee) {
        return new CreditLimitPlanAdditionalProperties(isBestByFee);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CreditLimitPlanAdditionalProperties) && this.isBestByFee == ((CreditLimitPlanAdditionalProperties) other).isBestByFee;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isBestByFee);
    }

    public final boolean isBestByFee() {
        return this.isBestByFee;
    }

    public String toString() {
        return nzs.b("CreditLimitPlanAdditionalProperties(isBestByFee=", Extension.C_BRAKE, this.isBestByFee);
    }
}
