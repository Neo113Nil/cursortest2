package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.HmacDto;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/AutoFundPayload;", "", "fundAmountLimit", "Lcom/ybsdk/core/common/data/network/dto/Money;", "hmac", "Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/HmacDto;)V", "getFundAmountLimit", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getHmac", "()Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoFundPayload {
    private final Money fundAmountLimit;
    private final HmacDto hmac;

    public AutoFundPayload(@Json(name = "fund_amount_limit") Money money, @Json(name = "hmac") HmacDto hmacDto) {
        this.fundAmountLimit = money;
        this.hmac = hmacDto;
    }

    public static /* synthetic */ AutoFundPayload copy$default(AutoFundPayload autoFundPayload, Money money, HmacDto hmacDto, int i, Object obj) {
        if ((i & 1) != 0) {
            money = autoFundPayload.fundAmountLimit;
        }
        if ((i & 2) != 0) {
            hmacDto = autoFundPayload.hmac;
        }
        return autoFundPayload.copy(money, hmacDto);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getFundAmountLimit() {
        return this.fundAmountLimit;
    }

    /* renamed from: component2, reason: from getter */
    public final HmacDto getHmac() {
        return this.hmac;
    }

    public final AutoFundPayload copy(@Json(name = "fund_amount_limit") Money fundAmountLimit, @Json(name = "hmac") HmacDto hmac) {
        return new AutoFundPayload(fundAmountLimit, hmac);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoFundPayload)) {
            return false;
        }
        AutoFundPayload autoFundPayload = (AutoFundPayload) other;
        return jl40.l(this.fundAmountLimit, autoFundPayload.fundAmountLimit) && jl40.l(this.hmac, autoFundPayload.hmac);
    }

    public final Money getFundAmountLimit() {
        return this.fundAmountLimit;
    }

    public final HmacDto getHmac() {
        return this.hmac;
    }

    public int hashCode() {
        return this.hmac.hashCode() + (this.fundAmountLimit.hashCode() * 31);
    }

    public String toString() {
        return "AutoFundPayload(fundAmountLimit=" + this.fundAmountLimit + ", hmac=" + this.hmac + Extension.C_BRAKE;
    }
}
