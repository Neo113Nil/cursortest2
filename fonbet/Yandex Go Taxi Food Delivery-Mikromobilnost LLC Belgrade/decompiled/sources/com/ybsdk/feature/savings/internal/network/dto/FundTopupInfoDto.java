package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.HmacDto;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/FundTopupInfoDto;", "", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "sourceAgreementId", "", "hmac", "Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/HmacDto;)V", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getSourceAgreementId", "()Ljava/lang/String;", "getHmac", "()Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FundTopupInfoDto {
    private final HmacDto hmac;
    private final Money money;
    private final String sourceAgreementId;

    public FundTopupInfoDto(@Json(name = "money") Money money, @Json(name = "source_agreement_id") String str, @Json(name = "hmac") HmacDto hmacDto) {
        this.money = money;
        this.sourceAgreementId = str;
        this.hmac = hmacDto;
    }

    public static /* synthetic */ FundTopupInfoDto copy$default(FundTopupInfoDto fundTopupInfoDto, Money money, String str, HmacDto hmacDto, int i, Object obj) {
        if ((i & 1) != 0) {
            money = fundTopupInfoDto.money;
        }
        if ((i & 2) != 0) {
            str = fundTopupInfoDto.sourceAgreementId;
        }
        if ((i & 4) != 0) {
            hmacDto = fundTopupInfoDto.hmac;
        }
        return fundTopupInfoDto.copy(money, str, hmacDto);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSourceAgreementId() {
        return this.sourceAgreementId;
    }

    /* renamed from: component3, reason: from getter */
    public final HmacDto getHmac() {
        return this.hmac;
    }

    public final FundTopupInfoDto copy(@Json(name = "money") Money money, @Json(name = "source_agreement_id") String sourceAgreementId, @Json(name = "hmac") HmacDto hmac) {
        return new FundTopupInfoDto(money, sourceAgreementId, hmac);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FundTopupInfoDto)) {
            return false;
        }
        FundTopupInfoDto fundTopupInfoDto = (FundTopupInfoDto) other;
        return jl40.l(this.money, fundTopupInfoDto.money) && jl40.l(this.sourceAgreementId, fundTopupInfoDto.sourceAgreementId) && jl40.l(this.hmac, fundTopupInfoDto.hmac);
    }

    public final HmacDto getHmac() {
        return this.hmac;
    }

    public final Money getMoney() {
        return this.money;
    }

    public final String getSourceAgreementId() {
        return this.sourceAgreementId;
    }

    public int hashCode() {
        return this.hmac.hashCode() + unr0.b(this.money.hashCode() * 31, 31, this.sourceAgreementId);
    }

    public String toString() {
        return "FundTopupInfoDto(money=" + this.money + ", sourceAgreementId=" + this.sourceAgreementId + ", hmac=" + this.hmac + Extension.C_BRAKE;
    }
}
