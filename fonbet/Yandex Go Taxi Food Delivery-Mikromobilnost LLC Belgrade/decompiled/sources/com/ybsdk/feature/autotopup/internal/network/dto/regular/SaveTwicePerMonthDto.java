package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveTwicePerMonthDto;", "", "monthToMoney1", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveMonthDayToMoneyDto;", "monthToMoney2", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveMonthDayToMoneyDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveMonthDayToMoneyDto;)V", "getMonthToMoney1", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveMonthDayToMoneyDto;", "getMonthToMoney2", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SaveTwicePerMonthDto {
    private final SaveMonthDayToMoneyDto monthToMoney1;
    private final SaveMonthDayToMoneyDto monthToMoney2;

    public SaveTwicePerMonthDto(@Json(name = "month_to_money_1") SaveMonthDayToMoneyDto saveMonthDayToMoneyDto, @Json(name = "month_to_money_2") SaveMonthDayToMoneyDto saveMonthDayToMoneyDto2) {
        this.monthToMoney1 = saveMonthDayToMoneyDto;
        this.monthToMoney2 = saveMonthDayToMoneyDto2;
    }

    public static /* synthetic */ SaveTwicePerMonthDto copy$default(SaveTwicePerMonthDto saveTwicePerMonthDto, SaveMonthDayToMoneyDto saveMonthDayToMoneyDto, SaveMonthDayToMoneyDto saveMonthDayToMoneyDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            saveMonthDayToMoneyDto = saveTwicePerMonthDto.monthToMoney1;
        }
        if ((i & 2) != 0) {
            saveMonthDayToMoneyDto2 = saveTwicePerMonthDto.monthToMoney2;
        }
        return saveTwicePerMonthDto.copy(saveMonthDayToMoneyDto, saveMonthDayToMoneyDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final SaveMonthDayToMoneyDto getMonthToMoney1() {
        return this.monthToMoney1;
    }

    /* renamed from: component2, reason: from getter */
    public final SaveMonthDayToMoneyDto getMonthToMoney2() {
        return this.monthToMoney2;
    }

    public final SaveTwicePerMonthDto copy(@Json(name = "month_to_money_1") SaveMonthDayToMoneyDto monthToMoney1, @Json(name = "month_to_money_2") SaveMonthDayToMoneyDto monthToMoney2) {
        return new SaveTwicePerMonthDto(monthToMoney1, monthToMoney2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveTwicePerMonthDto)) {
            return false;
        }
        SaveTwicePerMonthDto saveTwicePerMonthDto = (SaveTwicePerMonthDto) other;
        return jl40.l(this.monthToMoney1, saveTwicePerMonthDto.monthToMoney1) && jl40.l(this.monthToMoney2, saveTwicePerMonthDto.monthToMoney2);
    }

    public final SaveMonthDayToMoneyDto getMonthToMoney1() {
        return this.monthToMoney1;
    }

    public final SaveMonthDayToMoneyDto getMonthToMoney2() {
        return this.monthToMoney2;
    }

    public int hashCode() {
        return this.monthToMoney2.hashCode() + (this.monthToMoney1.hashCode() * 31);
    }

    public String toString() {
        return "SaveTwicePerMonthDto(monthToMoney1=" + this.monthToMoney1 + ", monthToMoney2=" + this.monthToMoney2 + Extension.C_BRAKE;
    }
}
