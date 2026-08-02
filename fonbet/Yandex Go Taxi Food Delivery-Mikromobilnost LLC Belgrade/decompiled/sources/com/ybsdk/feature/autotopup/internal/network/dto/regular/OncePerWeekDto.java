package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/OncePerWeekDto;", "", "day", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/DayOfWeekDto;", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/DayOfWeekDto;Lcom/ybsdk/core/common/data/network/dto/Money;)V", "getDay", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/DayOfWeekDto;", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OncePerWeekDto {
    private final DayOfWeekDto day;
    private final Money money;

    public OncePerWeekDto(@Json(name = "day") DayOfWeekDto dayOfWeekDto, @Json(name = "money") Money money) {
        this.day = dayOfWeekDto;
        this.money = money;
    }

    public static /* synthetic */ OncePerWeekDto copy$default(OncePerWeekDto oncePerWeekDto, DayOfWeekDto dayOfWeekDto, Money money, int i, Object obj) {
        if ((i & 1) != 0) {
            dayOfWeekDto = oncePerWeekDto.day;
        }
        if ((i & 2) != 0) {
            money = oncePerWeekDto.money;
        }
        return oncePerWeekDto.copy(dayOfWeekDto, money);
    }

    /* renamed from: component1, reason: from getter */
    public final DayOfWeekDto getDay() {
        return this.day;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    public final OncePerWeekDto copy(@Json(name = "day") DayOfWeekDto day, @Json(name = "money") Money money) {
        return new OncePerWeekDto(day, money);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OncePerWeekDto)) {
            return false;
        }
        OncePerWeekDto oncePerWeekDto = (OncePerWeekDto) other;
        return this.day == oncePerWeekDto.day && jl40.l(this.money, oncePerWeekDto.money);
    }

    public final DayOfWeekDto getDay() {
        return this.day;
    }

    public final Money getMoney() {
        return this.money;
    }

    public int hashCode() {
        return this.money.hashCode() + (this.day.hashCode() * 31);
    }

    public String toString() {
        return "OncePerWeekDto(day=" + this.day + ", money=" + this.money + Extension.C_BRAKE;
    }
}
