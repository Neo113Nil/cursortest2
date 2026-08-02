package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlansRequest;", "", "loan", "Lcom/ybsdk/core/common/data/network/dto/Money;", "payment", "filters", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlansFilters;", "experimentFlags", "", "", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlansFilters;Ljava/util/List;)V", "getLoan", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getPayment", "getFilters", "()Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlansFilters;", "getExperimentFlags", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CreditLimitPlansRequest {
    private final List<String> experimentFlags;
    private final CreditLimitPlansFilters filters;
    private final Money loan;
    private final Money payment;

    public CreditLimitPlansRequest(@Json(name = "loan") Money money, @Json(name = "payment") Money money2, @Json(name = "filters") CreditLimitPlansFilters creditLimitPlansFilters, @Json(name = "experiment_flags") List<String> list) {
        this.loan = money;
        this.payment = money2;
        this.filters = creditLimitPlansFilters;
        this.experimentFlags = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreditLimitPlansRequest copy$default(CreditLimitPlansRequest creditLimitPlansRequest, Money money, Money money2, CreditLimitPlansFilters creditLimitPlansFilters, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            money = creditLimitPlansRequest.loan;
        }
        if ((i & 2) != 0) {
            money2 = creditLimitPlansRequest.payment;
        }
        if ((i & 4) != 0) {
            creditLimitPlansFilters = creditLimitPlansRequest.filters;
        }
        if ((i & 8) != 0) {
            list = creditLimitPlansRequest.experimentFlags;
        }
        return creditLimitPlansRequest.copy(money, money2, creditLimitPlansFilters, list);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getLoan() {
        return this.loan;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getPayment() {
        return this.payment;
    }

    /* renamed from: component3, reason: from getter */
    public final CreditLimitPlansFilters getFilters() {
        return this.filters;
    }

    public final List<String> component4() {
        return this.experimentFlags;
    }

    public final CreditLimitPlansRequest copy(@Json(name = "loan") Money loan, @Json(name = "payment") Money payment, @Json(name = "filters") CreditLimitPlansFilters filters, @Json(name = "experiment_flags") List<String> experimentFlags) {
        return new CreditLimitPlansRequest(loan, payment, filters, experimentFlags);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditLimitPlansRequest)) {
            return false;
        }
        CreditLimitPlansRequest creditLimitPlansRequest = (CreditLimitPlansRequest) other;
        return jl40.l(this.loan, creditLimitPlansRequest.loan) && jl40.l(this.payment, creditLimitPlansRequest.payment) && jl40.l(this.filters, creditLimitPlansRequest.filters) && jl40.l(this.experimentFlags, creditLimitPlansRequest.experimentFlags);
    }

    public final List<String> getExperimentFlags() {
        return this.experimentFlags;
    }

    public final CreditLimitPlansFilters getFilters() {
        return this.filters;
    }

    public final Money getLoan() {
        return this.loan;
    }

    public final Money getPayment() {
        return this.payment;
    }

    public int hashCode() {
        int hashCode = this.loan.hashCode() * 31;
        Money money = this.payment;
        int hashCode2 = (hashCode + (money == null ? 0 : money.hashCode())) * 31;
        CreditLimitPlansFilters creditLimitPlansFilters = this.filters;
        int hashCode3 = (hashCode2 + (creditLimitPlansFilters == null ? 0 : creditLimitPlansFilters.hashCode())) * 31;
        List<String> list = this.experimentFlags;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "CreditLimitPlansRequest(loan=" + this.loan + ", payment=" + this.payment + ", filters=" + this.filters + ", experimentFlags=" + this.experimentFlags + Extension.C_BRAKE;
    }
}
