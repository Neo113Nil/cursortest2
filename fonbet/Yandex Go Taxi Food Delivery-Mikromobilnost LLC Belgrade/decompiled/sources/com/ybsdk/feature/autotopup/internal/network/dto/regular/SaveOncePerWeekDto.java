package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.HmacDto;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.autotopup.internal.domain.entities.regular.DayOfWeek;
import defpackage.jl40;
import defpackage.tse0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveOncePerWeekDto;", "", "day", "Lcom/ybsdk/feature/autotopup/internal/domain/entities/regular/DayOfWeek;", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "hmacDto", "Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/domain/entities/regular/DayOfWeek;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/HmacDto;)V", "getDay", "()Lcom/ybsdk/feature/autotopup/internal/domain/entities/regular/DayOfWeek;", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getHmacDto", "()Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SaveOncePerWeekDto {
    private final DayOfWeek day;
    private final HmacDto hmacDto;
    private final Money money;

    public SaveOncePerWeekDto(@Json(name = "day") DayOfWeek dayOfWeek, @Json(name = "money") Money money, @Json(name = "hmac") HmacDto hmacDto) {
        this.day = dayOfWeek;
        this.money = money;
        this.hmacDto = hmacDto;
    }

    public static /* synthetic */ SaveOncePerWeekDto copy$default(SaveOncePerWeekDto saveOncePerWeekDto, DayOfWeek dayOfWeek, Money money, HmacDto hmacDto, int i, Object obj) {
        if ((i & 1) != 0) {
            dayOfWeek = saveOncePerWeekDto.day;
        }
        if ((i & 2) != 0) {
            money = saveOncePerWeekDto.money;
        }
        if ((i & 4) != 0) {
            hmacDto = saveOncePerWeekDto.hmacDto;
        }
        return saveOncePerWeekDto.copy(dayOfWeek, money, hmacDto);
    }

    /* renamed from: component1, reason: from getter */
    public final DayOfWeek getDay() {
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

    public final SaveOncePerWeekDto copy(@Json(name = "day") DayOfWeek day, @Json(name = "money") Money money, @Json(name = "hmac") HmacDto hmacDto) {
        return new SaveOncePerWeekDto(day, money, hmacDto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveOncePerWeekDto)) {
            return false;
        }
        SaveOncePerWeekDto saveOncePerWeekDto = (SaveOncePerWeekDto) other;
        return this.day == saveOncePerWeekDto.day && jl40.l(this.money, saveOncePerWeekDto.money) && jl40.l(this.hmacDto, saveOncePerWeekDto.hmacDto);
    }

    public final DayOfWeek getDay() {
        return this.day;
    }

    public final HmacDto getHmacDto() {
        return this.hmacDto;
    }

    public final Money getMoney() {
        return this.money;
    }

    public int hashCode() {
        return this.hmacDto.hashCode() + tse0.c(this.money, this.day.hashCode() * 31, 31);
    }

    public String toString() {
        return "SaveOncePerWeekDto(day=" + this.day + ", money=" + this.money + ", hmacDto=" + this.hmacDto + Extension.C_BRAKE;
    }
}
