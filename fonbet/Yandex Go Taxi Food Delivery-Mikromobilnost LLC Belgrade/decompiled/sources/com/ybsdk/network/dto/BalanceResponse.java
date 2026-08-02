package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.MoneyCommonResponse;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/network/dto/BalanceResponse;", "", "money", "Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;", "plus", "cashback", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;)V", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;", "getPlus", "getCashback", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BalanceResponse {
    private final MoneyCommonResponse cashback;
    private final MoneyCommonResponse money;
    private final MoneyCommonResponse plus;

    public /* synthetic */ BalanceResponse(MoneyCommonResponse moneyCommonResponse, MoneyCommonResponse moneyCommonResponse2, MoneyCommonResponse moneyCommonResponse3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : moneyCommonResponse, (i & 2) != 0 ? null : moneyCommonResponse2, (i & 4) != 0 ? null : moneyCommonResponse3);
    }

    public static /* synthetic */ BalanceResponse copy$default(BalanceResponse balanceResponse, MoneyCommonResponse moneyCommonResponse, MoneyCommonResponse moneyCommonResponse2, MoneyCommonResponse moneyCommonResponse3, int i, Object obj) {
        if ((i & 1) != 0) {
            moneyCommonResponse = balanceResponse.money;
        }
        if ((i & 2) != 0) {
            moneyCommonResponse2 = balanceResponse.plus;
        }
        if ((i & 4) != 0) {
            moneyCommonResponse3 = balanceResponse.cashback;
        }
        return balanceResponse.copy(moneyCommonResponse, moneyCommonResponse2, moneyCommonResponse3);
    }

    /* renamed from: component1, reason: from getter */
    public final MoneyCommonResponse getMoney() {
        return this.money;
    }

    /* renamed from: component2, reason: from getter */
    public final MoneyCommonResponse getPlus() {
        return this.plus;
    }

    /* renamed from: component3, reason: from getter */
    public final MoneyCommonResponse getCashback() {
        return this.cashback;
    }

    public final BalanceResponse copy(@Json(name = "money") MoneyCommonResponse money, @Json(name = "plus") MoneyCommonResponse plus, @Json(name = "cashback") MoneyCommonResponse cashback) {
        return new BalanceResponse(money, plus, cashback);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BalanceResponse)) {
            return false;
        }
        BalanceResponse balanceResponse = (BalanceResponse) other;
        return jl40.l(this.money, balanceResponse.money) && jl40.l(this.plus, balanceResponse.plus) && jl40.l(this.cashback, balanceResponse.cashback);
    }

    public final MoneyCommonResponse getCashback() {
        return this.cashback;
    }

    public final MoneyCommonResponse getMoney() {
        return this.money;
    }

    public final MoneyCommonResponse getPlus() {
        return this.plus;
    }

    public int hashCode() {
        MoneyCommonResponse moneyCommonResponse = this.money;
        int hashCode = (moneyCommonResponse == null ? 0 : moneyCommonResponse.hashCode()) * 31;
        MoneyCommonResponse moneyCommonResponse2 = this.plus;
        int hashCode2 = (hashCode + (moneyCommonResponse2 == null ? 0 : moneyCommonResponse2.hashCode())) * 31;
        MoneyCommonResponse moneyCommonResponse3 = this.cashback;
        return hashCode2 + (moneyCommonResponse3 != null ? moneyCommonResponse3.hashCode() : 0);
    }

    public String toString() {
        return "BalanceResponse(money=" + this.money + ", plus=" + this.plus + ", cashback=" + this.cashback + Extension.C_BRAKE;
    }

    public BalanceResponse(@Json(name = "money") MoneyCommonResponse moneyCommonResponse, @Json(name = "plus") MoneyCommonResponse moneyCommonResponse2, @Json(name = "cashback") MoneyCommonResponse moneyCommonResponse3) {
        this.money = moneyCommonResponse;
        this.plus = moneyCommonResponse2;
        this.cashback = moneyCommonResponse3;
    }

    public BalanceResponse() {
        this(null, null, null, 7, null);
    }
}
