package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.u530;
import defpackage.w530;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u001b\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f¨\u0006 "}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;", "", "Ljava/math/BigDecimal;", "amount", "", "currency", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;)V", "Lw530;", "moneyFormatter", "getFormattedBalance", "(Lw530;)Ljava/lang/String;", "component1", "()Ljava/math/BigDecimal;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/math/BigDecimal;Ljava/lang/String;)Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/math/BigDecimal;", "getAmount", "Ljava/lang/String;", "getCurrency", "Companion", "u530", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MoneyCommonResponse {
    public static final u530 Companion = new u530();
    private static final MoneyCommonResponse EMPTY = new MoneyCommonResponse(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    private final BigDecimal amount;
    private final String currency;

    public /* synthetic */ MoneyCommonResponse(BigDecimal bigDecimal, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BigDecimal.ZERO : bigDecimal, (i & 2) != 0 ? "" : str);
    }

    public static /* synthetic */ MoneyCommonResponse copy$default(MoneyCommonResponse moneyCommonResponse, BigDecimal bigDecimal, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = moneyCommonResponse.amount;
        }
        if ((i & 2) != 0) {
            str = moneyCommonResponse.currency;
        }
        return moneyCommonResponse.copy(bigDecimal, str);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final MoneyCommonResponse copy(@Json(name = "amount") BigDecimal amount, @Json(name = "currency") String currency) {
        return new MoneyCommonResponse(amount, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MoneyCommonResponse)) {
            return false;
        }
        MoneyCommonResponse moneyCommonResponse = (MoneyCommonResponse) other;
        return jl40.l(this.amount, moneyCommonResponse.amount) && jl40.l(this.currency, moneyCommonResponse.currency);
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getFormattedBalance(w530 moneyFormatter) {
        return w530.a(moneyFormatter, this.amount, this.currency, false, null, false, 60);
    }

    public int hashCode() {
        return this.currency.hashCode() + (this.amount.hashCode() * 31);
    }

    public String toString() {
        return "MoneyCommonResponse(amount=" + this.amount + ", currency=" + this.currency + Extension.C_BRAKE;
    }

    public MoneyCommonResponse(@Json(name = "amount") BigDecimal bigDecimal, @Json(name = "currency") String str) {
        this.amount = bigDecimal;
        this.currency = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MoneyCommonResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
