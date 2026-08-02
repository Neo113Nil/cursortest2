package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.autotopup.internal.domain.entities.regular.FrequencyType;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveSelectedRegularAutotopupOptionDto;", "", "selected", "Lcom/ybsdk/feature/autotopup/internal/domain/entities/regular/FrequencyType;", "oncePerWeek", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveOncePerWeekDto;", "oncePerMonth", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveOncePerMonthDto;", "twicePerMonth", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveTwicePerMonthDto;", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/domain/entities/regular/FrequencyType;Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveOncePerWeekDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveOncePerMonthDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveTwicePerMonthDto;)V", "getSelected", "()Lcom/ybsdk/feature/autotopup/internal/domain/entities/regular/FrequencyType;", "getOncePerWeek", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveOncePerWeekDto;", "getOncePerMonth", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveOncePerMonthDto;", "getTwicePerMonth", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveTwicePerMonthDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SaveSelectedRegularAutotopupOptionDto {
    private final SaveOncePerMonthDto oncePerMonth;
    private final SaveOncePerWeekDto oncePerWeek;
    private final FrequencyType selected;
    private final SaveTwicePerMonthDto twicePerMonth;

    public SaveSelectedRegularAutotopupOptionDto(@Json(name = "selected_option_id") FrequencyType frequencyType, @Json(name = "once_per_week") SaveOncePerWeekDto saveOncePerWeekDto, @Json(name = "once_per_month") SaveOncePerMonthDto saveOncePerMonthDto, @Json(name = "twice_per_month") SaveTwicePerMonthDto saveTwicePerMonthDto) {
        this.selected = frequencyType;
        this.oncePerWeek = saveOncePerWeekDto;
        this.oncePerMonth = saveOncePerMonthDto;
        this.twicePerMonth = saveTwicePerMonthDto;
    }

    public static /* synthetic */ SaveSelectedRegularAutotopupOptionDto copy$default(SaveSelectedRegularAutotopupOptionDto saveSelectedRegularAutotopupOptionDto, FrequencyType frequencyType, SaveOncePerWeekDto saveOncePerWeekDto, SaveOncePerMonthDto saveOncePerMonthDto, SaveTwicePerMonthDto saveTwicePerMonthDto, int i, Object obj) {
        if ((i & 1) != 0) {
            frequencyType = saveSelectedRegularAutotopupOptionDto.selected;
        }
        if ((i & 2) != 0) {
            saveOncePerWeekDto = saveSelectedRegularAutotopupOptionDto.oncePerWeek;
        }
        if ((i & 4) != 0) {
            saveOncePerMonthDto = saveSelectedRegularAutotopupOptionDto.oncePerMonth;
        }
        if ((i & 8) != 0) {
            saveTwicePerMonthDto = saveSelectedRegularAutotopupOptionDto.twicePerMonth;
        }
        return saveSelectedRegularAutotopupOptionDto.copy(frequencyType, saveOncePerWeekDto, saveOncePerMonthDto, saveTwicePerMonthDto);
    }

    /* renamed from: component1, reason: from getter */
    public final FrequencyType getSelected() {
        return this.selected;
    }

    /* renamed from: component2, reason: from getter */
    public final SaveOncePerWeekDto getOncePerWeek() {
        return this.oncePerWeek;
    }

    /* renamed from: component3, reason: from getter */
    public final SaveOncePerMonthDto getOncePerMonth() {
        return this.oncePerMonth;
    }

    /* renamed from: component4, reason: from getter */
    public final SaveTwicePerMonthDto getTwicePerMonth() {
        return this.twicePerMonth;
    }

    public final SaveSelectedRegularAutotopupOptionDto copy(@Json(name = "selected_option_id") FrequencyType selected, @Json(name = "once_per_week") SaveOncePerWeekDto oncePerWeek, @Json(name = "once_per_month") SaveOncePerMonthDto oncePerMonth, @Json(name = "twice_per_month") SaveTwicePerMonthDto twicePerMonth) {
        return new SaveSelectedRegularAutotopupOptionDto(selected, oncePerWeek, oncePerMonth, twicePerMonth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveSelectedRegularAutotopupOptionDto)) {
            return false;
        }
        SaveSelectedRegularAutotopupOptionDto saveSelectedRegularAutotopupOptionDto = (SaveSelectedRegularAutotopupOptionDto) other;
        return this.selected == saveSelectedRegularAutotopupOptionDto.selected && jl40.l(this.oncePerWeek, saveSelectedRegularAutotopupOptionDto.oncePerWeek) && jl40.l(this.oncePerMonth, saveSelectedRegularAutotopupOptionDto.oncePerMonth) && jl40.l(this.twicePerMonth, saveSelectedRegularAutotopupOptionDto.twicePerMonth);
    }

    public final SaveOncePerMonthDto getOncePerMonth() {
        return this.oncePerMonth;
    }

    public final SaveOncePerWeekDto getOncePerWeek() {
        return this.oncePerWeek;
    }

    public final FrequencyType getSelected() {
        return this.selected;
    }

    public final SaveTwicePerMonthDto getTwicePerMonth() {
        return this.twicePerMonth;
    }

    public int hashCode() {
        int hashCode = this.selected.hashCode() * 31;
        SaveOncePerWeekDto saveOncePerWeekDto = this.oncePerWeek;
        int hashCode2 = (hashCode + (saveOncePerWeekDto == null ? 0 : saveOncePerWeekDto.hashCode())) * 31;
        SaveOncePerMonthDto saveOncePerMonthDto = this.oncePerMonth;
        int hashCode3 = (hashCode2 + (saveOncePerMonthDto == null ? 0 : saveOncePerMonthDto.hashCode())) * 31;
        SaveTwicePerMonthDto saveTwicePerMonthDto = this.twicePerMonth;
        return hashCode3 + (saveTwicePerMonthDto != null ? saveTwicePerMonthDto.hashCode() : 0);
    }

    public String toString() {
        return "SaveSelectedRegularAutotopupOptionDto(selected=" + this.selected + ", oncePerWeek=" + this.oncePerWeek + ", oncePerMonth=" + this.oncePerMonth + ", twicePerMonth=" + this.twicePerMonth + Extension.C_BRAKE;
    }
}
