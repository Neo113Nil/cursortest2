package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditPlanLimit;", "", "remaining", "Lcom/ybsdk/core/common/data/network/dto/Money;", "base", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Money;)V", "getRemaining", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getBase", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditPlanLimit {
    private final Money base;
    private final Money remaining;

    public CreditPlanLimit(@Json(name = "remaining") Money money, @Json(name = "base") Money money2) {
        this.remaining = money;
        this.base = money2;
    }

    public static /* synthetic */ CreditPlanLimit copy$default(CreditPlanLimit creditPlanLimit, Money money, Money money2, int i, Object obj) {
        if ((i & 1) != 0) {
            money = creditPlanLimit.remaining;
        }
        if ((i & 2) != 0) {
            money2 = creditPlanLimit.base;
        }
        return creditPlanLimit.copy(money, money2);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getRemaining() {
        return this.remaining;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getBase() {
        return this.base;
    }

    public final CreditPlanLimit copy(@Json(name = "remaining") Money remaining, @Json(name = "base") Money base) {
        return new CreditPlanLimit(remaining, base);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditPlanLimit)) {
            return false;
        }
        CreditPlanLimit creditPlanLimit = (CreditPlanLimit) other;
        return jl40.l(this.remaining, creditPlanLimit.remaining) && jl40.l(this.base, creditPlanLimit.base);
    }

    public final Money getBase() {
        return this.base;
    }

    public final Money getRemaining() {
        return this.remaining;
    }

    public int hashCode() {
        Money money = this.remaining;
        int hashCode = (money == null ? 0 : money.hashCode()) * 31;
        Money money2 = this.base;
        return hashCode + (money2 != null ? money2.hashCode() : 0);
    }

    public String toString() {
        return "CreditPlanLimit(remaining=" + this.remaining + ", base=" + this.base + Extension.C_BRAKE;
    }
}
