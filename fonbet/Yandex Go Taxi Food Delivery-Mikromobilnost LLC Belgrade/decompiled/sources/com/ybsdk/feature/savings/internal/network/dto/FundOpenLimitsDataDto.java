package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/FundOpenLimitsDataDto;", "", "minLimit", "", "minLimitText", "", "notEnoughFundsText", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getMinLimit", "()I", "getMinLimitText", "()Ljava/lang/String;", "getNotEnoughFundsText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FundOpenLimitsDataDto {
    private final int minLimit;
    private final String minLimitText;
    private final String notEnoughFundsText;

    public FundOpenLimitsDataDto(@Json(name = "min_limit") int i, @Json(name = "min_limit_text") String str, @Json(name = "not_enough_funds_text") String str2) {
        this.minLimit = i;
        this.minLimitText = str;
        this.notEnoughFundsText = str2;
    }

    public static /* synthetic */ FundOpenLimitsDataDto copy$default(FundOpenLimitsDataDto fundOpenLimitsDataDto, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fundOpenLimitsDataDto.minLimit;
        }
        if ((i2 & 2) != 0) {
            str = fundOpenLimitsDataDto.minLimitText;
        }
        if ((i2 & 4) != 0) {
            str2 = fundOpenLimitsDataDto.notEnoughFundsText;
        }
        return fundOpenLimitsDataDto.copy(i, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMinLimit() {
        return this.minLimit;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMinLimitText() {
        return this.minLimitText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNotEnoughFundsText() {
        return this.notEnoughFundsText;
    }

    public final FundOpenLimitsDataDto copy(@Json(name = "min_limit") int minLimit, @Json(name = "min_limit_text") String minLimitText, @Json(name = "not_enough_funds_text") String notEnoughFundsText) {
        return new FundOpenLimitsDataDto(minLimit, minLimitText, notEnoughFundsText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FundOpenLimitsDataDto)) {
            return false;
        }
        FundOpenLimitsDataDto fundOpenLimitsDataDto = (FundOpenLimitsDataDto) other;
        return this.minLimit == fundOpenLimitsDataDto.minLimit && jl40.l(this.minLimitText, fundOpenLimitsDataDto.minLimitText) && jl40.l(this.notEnoughFundsText, fundOpenLimitsDataDto.notEnoughFundsText);
    }

    public final int getMinLimit() {
        return this.minLimit;
    }

    public final String getMinLimitText() {
        return this.minLimitText;
    }

    public final String getNotEnoughFundsText() {
        return this.notEnoughFundsText;
    }

    public int hashCode() {
        return this.notEnoughFundsText.hashCode() + unr0.b(Integer.hashCode(this.minLimit) * 31, 31, this.minLimitText);
    }

    public String toString() {
        int i = this.minLimit;
        String str = this.minLimitText;
        return oyr.t(unr0.v(i, "FundOpenLimitsDataDto(minLimit=", ", minLimitText=", str, ", notEnoughFundsText="), this.notEnoughFundsText, Extension.C_BRAKE);
    }
}
