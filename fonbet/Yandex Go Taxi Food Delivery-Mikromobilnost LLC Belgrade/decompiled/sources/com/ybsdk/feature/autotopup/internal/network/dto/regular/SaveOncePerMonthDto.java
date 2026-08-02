package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.HmacDto;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J8\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveOncePerMonthDto;", "", "day", "", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "isLastDay", "", "hmacDto", "Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "<init>", "(Ljava/lang/Integer;Lcom/ybsdk/core/common/data/network/dto/Money;ZLcom/ybsdk/core/common/data/network/dto/HmacDto;)V", "getDay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "()Z", "getHmacDto", "()Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Lcom/ybsdk/core/common/data/network/dto/Money;ZLcom/ybsdk/core/common/data/network/dto/HmacDto;)Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveOncePerMonthDto;", "equals", "other", "hashCode", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SaveOncePerMonthDto {
    private final Integer day;
    private final HmacDto hmacDto;
    private final boolean isLastDay;
    private final Money money;

    public SaveOncePerMonthDto(@Json(name = "day") Integer num, @Json(name = "money") Money money, @Json(name = "is_last_day") boolean z, @Json(name = "hmac") HmacDto hmacDto) {
        this.day = num;
        this.money = money;
        this.isLastDay = z;
        this.hmacDto = hmacDto;
    }

    public static /* synthetic */ SaveOncePerMonthDto copy$default(SaveOncePerMonthDto saveOncePerMonthDto, Integer num, Money money, boolean z, HmacDto hmacDto, int i, Object obj) {
        if ((i & 1) != 0) {
            num = saveOncePerMonthDto.day;
        }
        if ((i & 2) != 0) {
            money = saveOncePerMonthDto.money;
        }
        if ((i & 4) != 0) {
            z = saveOncePerMonthDto.isLastDay;
        }
        if ((i & 8) != 0) {
            hmacDto = saveOncePerMonthDto.hmacDto;
        }
        return saveOncePerMonthDto.copy(num, money, z, hmacDto);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getDay() {
        return this.day;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLastDay() {
        return this.isLastDay;
    }

    /* renamed from: component4, reason: from getter */
    public final HmacDto getHmacDto() {
        return this.hmacDto;
    }

    public final SaveOncePerMonthDto copy(@Json(name = "day") Integer day, @Json(name = "money") Money money, @Json(name = "is_last_day") boolean isLastDay, @Json(name = "hmac") HmacDto hmacDto) {
        return new SaveOncePerMonthDto(day, money, isLastDay, hmacDto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveOncePerMonthDto)) {
            return false;
        }
        SaveOncePerMonthDto saveOncePerMonthDto = (SaveOncePerMonthDto) other;
        return jl40.l(this.day, saveOncePerMonthDto.day) && jl40.l(this.money, saveOncePerMonthDto.money) && this.isLastDay == saveOncePerMonthDto.isLastDay && jl40.l(this.hmacDto, saveOncePerMonthDto.hmacDto);
    }

    public final Integer getDay() {
        return this.day;
    }

    public final HmacDto getHmacDto() {
        return this.hmacDto;
    }

    public final Money getMoney() {
        return this.money;
    }

    public int hashCode() {
        Integer num = this.day;
        return this.hmacDto.hashCode() + unr0.e(tse0.c(this.money, (num == null ? 0 : num.hashCode()) * 31, 31), 31, this.isLastDay);
    }

    public final boolean isLastDay() {
        return this.isLastDay;
    }

    public String toString() {
        return "SaveOncePerMonthDto(day=" + this.day + ", money=" + this.money + ", isLastDay=" + this.isLastDay + ", hmacDto=" + this.hmacDto + Extension.C_BRAKE;
    }
}
