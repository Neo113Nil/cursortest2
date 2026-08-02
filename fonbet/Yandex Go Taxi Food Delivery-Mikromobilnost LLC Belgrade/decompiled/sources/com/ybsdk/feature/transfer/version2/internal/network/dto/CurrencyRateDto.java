package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CurrencyRateDto;", "", "rate", "Lcom/ybsdk/core/common/data/network/dto/Money;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Money;)V", "getRate", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CurrencyRateDto {
    private final Money rate;

    public CurrencyRateDto(@Json(name = "rate") Money money) {
        this.rate = money;
    }

    public static /* synthetic */ CurrencyRateDto copy$default(CurrencyRateDto currencyRateDto, Money money, int i, Object obj) {
        if ((i & 1) != 0) {
            money = currencyRateDto.rate;
        }
        return currencyRateDto.copy(money);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getRate() {
        return this.rate;
    }

    public final CurrencyRateDto copy(@Json(name = "rate") Money rate) {
        return new CurrencyRateDto(rate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CurrencyRateDto) && jl40.l(this.rate, ((CurrencyRateDto) other).rate);
    }

    public final Money getRate() {
        return this.rate;
    }

    public int hashCode() {
        return this.rate.hashCode();
    }

    public String toString() {
        return "CurrencyRateDto(rate=" + this.rate + Extension.C_BRAKE;
    }
}
