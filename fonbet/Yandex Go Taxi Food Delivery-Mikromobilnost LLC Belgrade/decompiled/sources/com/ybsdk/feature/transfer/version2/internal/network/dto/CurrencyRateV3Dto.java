package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CurrencyRateV3Dto;", "", "amount", "", "currency", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getCurrency", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CurrencyRateV3Dto {
    private final String amount;
    private final String currency;

    public CurrencyRateV3Dto(@Json(name = "amount") String str, @Json(name = "currency") String str2) {
        this.amount = str;
        this.currency = str2;
    }

    public static /* synthetic */ CurrencyRateV3Dto copy$default(CurrencyRateV3Dto currencyRateV3Dto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = currencyRateV3Dto.amount;
        }
        if ((i & 2) != 0) {
            str2 = currencyRateV3Dto.currency;
        }
        return currencyRateV3Dto.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final CurrencyRateV3Dto copy(@Json(name = "amount") String amount, @Json(name = "currency") String currency) {
        return new CurrencyRateV3Dto(amount, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrencyRateV3Dto)) {
            return false;
        }
        CurrencyRateV3Dto currencyRateV3Dto = (CurrencyRateV3Dto) other;
        return jl40.l(this.amount, currencyRateV3Dto.amount) && jl40.l(this.currency, currencyRateV3Dto.currency);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return this.currency.hashCode() + (this.amount.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("CurrencyRateV3Dto(amount=", this.amount, ", currency=", this.currency, Extension.C_BRAKE);
    }
}
