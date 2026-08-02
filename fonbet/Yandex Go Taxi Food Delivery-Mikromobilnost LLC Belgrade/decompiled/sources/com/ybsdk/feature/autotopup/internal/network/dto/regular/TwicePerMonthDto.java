package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/TwicePerMonthDto;", "", "monthToMoney1", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/MonthDayToMoneyDto;", "monthToMoney2", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/MonthDayToMoneyDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/MonthDayToMoneyDto;)V", "getMonthToMoney1", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/MonthDayToMoneyDto;", "getMonthToMoney2", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TwicePerMonthDto {
    private final MonthDayToMoneyDto monthToMoney1;
    private final MonthDayToMoneyDto monthToMoney2;

    public TwicePerMonthDto(@Json(name = "month_to_money_1") MonthDayToMoneyDto monthDayToMoneyDto, @Json(name = "month_to_money_2") MonthDayToMoneyDto monthDayToMoneyDto2) {
        this.monthToMoney1 = monthDayToMoneyDto;
        this.monthToMoney2 = monthDayToMoneyDto2;
    }

    public static /* synthetic */ TwicePerMonthDto copy$default(TwicePerMonthDto twicePerMonthDto, MonthDayToMoneyDto monthDayToMoneyDto, MonthDayToMoneyDto monthDayToMoneyDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            monthDayToMoneyDto = twicePerMonthDto.monthToMoney1;
        }
        if ((i & 2) != 0) {
            monthDayToMoneyDto2 = twicePerMonthDto.monthToMoney2;
        }
        return twicePerMonthDto.copy(monthDayToMoneyDto, monthDayToMoneyDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final MonthDayToMoneyDto getMonthToMoney1() {
        return this.monthToMoney1;
    }

    /* renamed from: component2, reason: from getter */
    public final MonthDayToMoneyDto getMonthToMoney2() {
        return this.monthToMoney2;
    }

    public final TwicePerMonthDto copy(@Json(name = "month_to_money_1") MonthDayToMoneyDto monthToMoney1, @Json(name = "month_to_money_2") MonthDayToMoneyDto monthToMoney2) {
        return new TwicePerMonthDto(monthToMoney1, monthToMoney2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TwicePerMonthDto)) {
            return false;
        }
        TwicePerMonthDto twicePerMonthDto = (TwicePerMonthDto) other;
        return jl40.l(this.monthToMoney1, twicePerMonthDto.monthToMoney1) && jl40.l(this.monthToMoney2, twicePerMonthDto.monthToMoney2);
    }

    public final MonthDayToMoneyDto getMonthToMoney1() {
        return this.monthToMoney1;
    }

    public final MonthDayToMoneyDto getMonthToMoney2() {
        return this.monthToMoney2;
    }

    public int hashCode() {
        return this.monthToMoney2.hashCode() + (this.monthToMoney1.hashCode() * 31);
    }

    public String toString() {
        return "TwicePerMonthDto(monthToMoney1=" + this.monthToMoney1 + ", monthToMoney2=" + this.monthToMoney2 + Extension.C_BRAKE;
    }
}
