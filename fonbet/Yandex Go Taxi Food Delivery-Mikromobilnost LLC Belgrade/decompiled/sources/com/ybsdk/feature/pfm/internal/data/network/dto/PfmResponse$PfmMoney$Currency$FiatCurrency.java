package com.ybsdk.feature.pfm.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"com/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney$Currency$FiatCurrency", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/a;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney$CurrencyType;", "currencyType", "", "currency", "<init>", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney$CurrencyType;Ljava/lang/String;)V", "component1", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney$CurrencyType;", "component2", "()Ljava/lang/String;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney$Currency$FiatCurrency;", "copy", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney$CurrencyType;Ljava/lang/String;)Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney$Currency$FiatCurrency;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney$CurrencyType;", "getCurrencyType", "Ljava/lang/String;", "getCurrency", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PfmResponse$PfmMoney$Currency$FiatCurrency implements a {
    private final String currency;
    private final PfmResponse.PfmMoney.CurrencyType currencyType;

    public PfmResponse$PfmMoney$Currency$FiatCurrency(@Json(name = "currency_type") PfmResponse.PfmMoney.CurrencyType currencyType, @Json(name = "currency") String str) {
        this.currencyType = currencyType;
        this.currency = str;
    }

    public static /* synthetic */ PfmResponse$PfmMoney$Currency$FiatCurrency copy$default(PfmResponse$PfmMoney$Currency$FiatCurrency pfmResponse$PfmMoney$Currency$FiatCurrency, PfmResponse.PfmMoney.CurrencyType currencyType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            currencyType = pfmResponse$PfmMoney$Currency$FiatCurrency.currencyType;
        }
        if ((i & 2) != 0) {
            str = pfmResponse$PfmMoney$Currency$FiatCurrency.currency;
        }
        return pfmResponse$PfmMoney$Currency$FiatCurrency.copy(currencyType, str);
    }

    /* renamed from: component1, reason: from getter */
    public final PfmResponse.PfmMoney.CurrencyType getCurrencyType() {
        return this.currencyType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final PfmResponse$PfmMoney$Currency$FiatCurrency copy(@Json(name = "currency_type") PfmResponse.PfmMoney.CurrencyType currencyType, @Json(name = "currency") String currency) {
        return new PfmResponse$PfmMoney$Currency$FiatCurrency(currencyType, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PfmResponse$PfmMoney$Currency$FiatCurrency)) {
            return false;
        }
        PfmResponse$PfmMoney$Currency$FiatCurrency pfmResponse$PfmMoney$Currency$FiatCurrency = (PfmResponse$PfmMoney$Currency$FiatCurrency) other;
        return this.currencyType == pfmResponse$PfmMoney$Currency$FiatCurrency.currencyType && jl40.l(this.currency, pfmResponse$PfmMoney$Currency$FiatCurrency.currency);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final PfmResponse.PfmMoney.CurrencyType getCurrencyType() {
        return this.currencyType;
    }

    public int hashCode() {
        return this.currency.hashCode() + (this.currencyType.hashCode() * 31);
    }

    public String toString() {
        return "FiatCurrency(currencyType=" + this.currencyType + ", currency=" + this.currency + Extension.C_BRAKE;
    }
}
