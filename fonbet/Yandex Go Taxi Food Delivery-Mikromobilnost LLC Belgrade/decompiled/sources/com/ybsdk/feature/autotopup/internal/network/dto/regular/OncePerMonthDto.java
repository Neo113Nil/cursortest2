package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.jl40;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J.\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/OncePerMonthDto;", "", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "day", "", "isLastDay", "", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/Integer;Z)V", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getDay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "component1", "component2", "component3", "copy", "(Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/Integer;Z)Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/OncePerMonthDto;", "equals", "other", "hashCode", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OncePerMonthDto {
    private final Integer day;
    private final boolean isLastDay;
    private final Money money;

    public OncePerMonthDto(@Json(name = "money") Money money, @Json(name = "day") Integer num, @Json(name = "is_last_day") boolean z) {
        this.money = money;
        this.day = num;
        this.isLastDay = z;
    }

    public static /* synthetic */ OncePerMonthDto copy$default(OncePerMonthDto oncePerMonthDto, Money money, Integer num, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            money = oncePerMonthDto.money;
        }
        if ((i & 2) != 0) {
            num = oncePerMonthDto.day;
        }
        if ((i & 4) != 0) {
            z = oncePerMonthDto.isLastDay;
        }
        return oncePerMonthDto.copy(money, num, z);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getDay() {
        return this.day;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLastDay() {
        return this.isLastDay;
    }

    public final OncePerMonthDto copy(@Json(name = "money") Money money, @Json(name = "day") Integer day, @Json(name = "is_last_day") boolean isLastDay) {
        return new OncePerMonthDto(money, day, isLastDay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OncePerMonthDto)) {
            return false;
        }
        OncePerMonthDto oncePerMonthDto = (OncePerMonthDto) other;
        return jl40.l(this.money, oncePerMonthDto.money) && jl40.l(this.day, oncePerMonthDto.day) && this.isLastDay == oncePerMonthDto.isLastDay;
    }

    public final Integer getDay() {
        return this.day;
    }

    public final Money getMoney() {
        return this.money;
    }

    public int hashCode() {
        int hashCode = this.money.hashCode() * 31;
        Integer num = this.day;
        return Boolean.hashCode(this.isLastDay) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final boolean isLastDay() {
        return this.isLastDay;
    }

    public String toString() {
        Money money = this.money;
        Integer num = this.day;
        boolean z = this.isLastDay;
        StringBuilder sb = new StringBuilder("OncePerMonthDto(money=");
        sb.append(money);
        sb.append(", day=");
        sb.append(num);
        sb.append(", isLastDay=");
        return x4e.i(sb, z, Extension.C_BRAKE);
    }
}
