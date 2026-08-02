package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.HmacDto;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.jl40;
import defpackage.tse0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveMonthDayToMoneyDto;", "", "day", "", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "hmacDto", "Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "<init>", "(ILcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/HmacDto;)V", "getDay", "()I", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getHmacDto", "()Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SaveMonthDayToMoneyDto {
    private final int day;
    private final HmacDto hmacDto;
    private final Money money;

    public SaveMonthDayToMoneyDto(@Json(name = "day") int i, @Json(name = "money") Money money, @Json(name = "hmac") HmacDto hmacDto) {
        this.day = i;
        this.money = money;
        this.hmacDto = hmacDto;
    }

    public static /* synthetic */ SaveMonthDayToMoneyDto copy$default(SaveMonthDayToMoneyDto saveMonthDayToMoneyDto, int i, Money money, HmacDto hmacDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = saveMonthDayToMoneyDto.day;
        }
        if ((i2 & 2) != 0) {
            money = saveMonthDayToMoneyDto.money;
        }
        if ((i2 & 4) != 0) {
            hmacDto = saveMonthDayToMoneyDto.hmacDto;
        }
        return saveMonthDayToMoneyDto.copy(i, money, hmacDto);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDay() {
        return this.day;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    /* renamed from: component3, reason: from getter */
    public final HmacDto getHmacDto() {
        return this.hmacDto;
    }

    public final SaveMonthDayToMoneyDto copy(@Json(name = "day") int day, @Json(name = "money") Money money, @Json(name = "hmac") HmacDto hmacDto) {
        return new SaveMonthDayToMoneyDto(day, money, hmacDto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveMonthDayToMoneyDto)) {
            return false;
        }
        SaveMonthDayToMoneyDto saveMonthDayToMoneyDto = (SaveMonthDayToMoneyDto) other;
        return this.day == saveMonthDayToMoneyDto.day && jl40.l(this.money, saveMonthDayToMoneyDto.money) && jl40.l(this.hmacDto, saveMonthDayToMoneyDto.hmacDto);
    }

    public final int getDay() {
        return this.day;
    }

    public final HmacDto getHmacDto() {
        return this.hmacDto;
    }

    public final Money getMoney() {
        return this.money;
    }

    public int hashCode() {
        return this.hmacDto.hashCode() + tse0.c(this.money, Integer.hashCode(this.day) * 31, 31);
    }

    public String toString() {
        return "SaveMonthDayToMoneyDto(day=" + this.day + ", money=" + this.money + ", hmacDto=" + this.hmacDto + Extension.C_BRAKE;
    }
}
