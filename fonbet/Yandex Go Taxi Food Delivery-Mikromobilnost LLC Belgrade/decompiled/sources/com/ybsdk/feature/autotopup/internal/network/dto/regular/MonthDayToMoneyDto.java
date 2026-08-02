package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/MonthDayToMoneyDto;", "", "day", "", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "<init>", "(ILcom/ybsdk/core/common/data/network/dto/Money;)V", "getDay", "()I", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MonthDayToMoneyDto {
    private final int day;
    private final Money money;

    public MonthDayToMoneyDto(@Json(name = "day") int i, @Json(name = "money") Money money) {
        this.day = i;
        this.money = money;
    }

    public static /* synthetic */ MonthDayToMoneyDto copy$default(MonthDayToMoneyDto monthDayToMoneyDto, int i, Money money, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = monthDayToMoneyDto.day;
        }
        if ((i2 & 2) != 0) {
            money = monthDayToMoneyDto.money;
        }
        return monthDayToMoneyDto.copy(i, money);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDay() {
        return this.day;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    public final MonthDayToMoneyDto copy(@Json(name = "day") int day, @Json(name = "money") Money money) {
        return new MonthDayToMoneyDto(day, money);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MonthDayToMoneyDto)) {
            return false;
        }
        MonthDayToMoneyDto monthDayToMoneyDto = (MonthDayToMoneyDto) other;
        return this.day == monthDayToMoneyDto.day && jl40.l(this.money, monthDayToMoneyDto.money);
    }

    public final int getDay() {
        return this.day;
    }

    public final Money getMoney() {
        return this.money;
    }

    public int hashCode() {
        return this.money.hashCode() + (Integer.hashCode(this.day) * 31);
    }

    public String toString() {
        return "MonthDayToMoneyDto(day=" + this.day + ", money=" + this.money + Extension.C_BRAKE;
    }
}
