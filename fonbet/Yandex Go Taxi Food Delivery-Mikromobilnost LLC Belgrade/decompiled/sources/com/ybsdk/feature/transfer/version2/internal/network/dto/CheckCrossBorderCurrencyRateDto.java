package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckCrossBorderCurrencyRateDto;", "", "rate", "Lcom/ybsdk/core/common/data/network/dto/Money;", "uiRate", "", "convertationTemplate", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Ljava/lang/String;)V", "getRate", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getUiRate", "()Ljava/lang/String;", "getConvertationTemplate", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckCrossBorderCurrencyRateDto {
    private final String convertationTemplate;
    private final Money rate;
    private final String uiRate;

    public CheckCrossBorderCurrencyRateDto(@Json(name = "rate") Money money, @Json(name = "ui_rate") String str, @Json(name = "convertation_template") String str2) {
        this.rate = money;
        this.uiRate = str;
        this.convertationTemplate = str2;
    }

    public static /* synthetic */ CheckCrossBorderCurrencyRateDto copy$default(CheckCrossBorderCurrencyRateDto checkCrossBorderCurrencyRateDto, Money money, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            money = checkCrossBorderCurrencyRateDto.rate;
        }
        if ((i & 2) != 0) {
            str = checkCrossBorderCurrencyRateDto.uiRate;
        }
        if ((i & 4) != 0) {
            str2 = checkCrossBorderCurrencyRateDto.convertationTemplate;
        }
        return checkCrossBorderCurrencyRateDto.copy(money, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getRate() {
        return this.rate;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUiRate() {
        return this.uiRate;
    }

    /* renamed from: component3, reason: from getter */
    public final String getConvertationTemplate() {
        return this.convertationTemplate;
    }

    public final CheckCrossBorderCurrencyRateDto copy(@Json(name = "rate") Money rate, @Json(name = "ui_rate") String uiRate, @Json(name = "convertation_template") String convertationTemplate) {
        return new CheckCrossBorderCurrencyRateDto(rate, uiRate, convertationTemplate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckCrossBorderCurrencyRateDto)) {
            return false;
        }
        CheckCrossBorderCurrencyRateDto checkCrossBorderCurrencyRateDto = (CheckCrossBorderCurrencyRateDto) other;
        return jl40.l(this.rate, checkCrossBorderCurrencyRateDto.rate) && jl40.l(this.uiRate, checkCrossBorderCurrencyRateDto.uiRate) && jl40.l(this.convertationTemplate, checkCrossBorderCurrencyRateDto.convertationTemplate);
    }

    public final String getConvertationTemplate() {
        return this.convertationTemplate;
    }

    public final Money getRate() {
        return this.rate;
    }

    public final String getUiRate() {
        return this.uiRate;
    }

    public int hashCode() {
        Money money = this.rate;
        int hashCode = (money == null ? 0 : money.hashCode()) * 31;
        String str = this.uiRate;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.convertationTemplate;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Money money = this.rate;
        String str = this.uiRate;
        String str2 = this.convertationTemplate;
        StringBuilder sb = new StringBuilder("CheckCrossBorderCurrencyRateDto(rate=");
        sb.append(money);
        sb.append(", uiRate=");
        sb.append(str);
        sb.append(", convertationTemplate=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
