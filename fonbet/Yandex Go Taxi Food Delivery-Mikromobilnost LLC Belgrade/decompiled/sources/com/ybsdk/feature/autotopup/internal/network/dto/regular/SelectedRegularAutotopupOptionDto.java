package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SelectedRegularAutotopupOptionDto;", "", "selected", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupTypeDto;", "oncePerWeek", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/OncePerWeekDto;", "oncePerMonth", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/OncePerMonthDto;", "twicePerMonth", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/TwicePerMonthDto;", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupTypeDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/OncePerWeekDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/OncePerMonthDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/TwicePerMonthDto;)V", "getSelected", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupTypeDto;", "getOncePerWeek", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/OncePerWeekDto;", "getOncePerMonth", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/OncePerMonthDto;", "getTwicePerMonth", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/TwicePerMonthDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SelectedRegularAutotopupOptionDto {
    private final OncePerMonthDto oncePerMonth;
    private final OncePerWeekDto oncePerWeek;
    private final RegularAutotopupTypeDto selected;
    private final TwicePerMonthDto twicePerMonth;

    public SelectedRegularAutotopupOptionDto(@Json(name = "selected_option_id") RegularAutotopupTypeDto regularAutotopupTypeDto, @Json(name = "once_per_week") OncePerWeekDto oncePerWeekDto, @Json(name = "once_per_month") OncePerMonthDto oncePerMonthDto, @Json(name = "twice_per_month") TwicePerMonthDto twicePerMonthDto) {
        this.selected = regularAutotopupTypeDto;
        this.oncePerWeek = oncePerWeekDto;
        this.oncePerMonth = oncePerMonthDto;
        this.twicePerMonth = twicePerMonthDto;
    }

    public static /* synthetic */ SelectedRegularAutotopupOptionDto copy$default(SelectedRegularAutotopupOptionDto selectedRegularAutotopupOptionDto, RegularAutotopupTypeDto regularAutotopupTypeDto, OncePerWeekDto oncePerWeekDto, OncePerMonthDto oncePerMonthDto, TwicePerMonthDto twicePerMonthDto, int i, Object obj) {
        if ((i & 1) != 0) {
            regularAutotopupTypeDto = selectedRegularAutotopupOptionDto.selected;
        }
        if ((i & 2) != 0) {
            oncePerWeekDto = selectedRegularAutotopupOptionDto.oncePerWeek;
        }
        if ((i & 4) != 0) {
            oncePerMonthDto = selectedRegularAutotopupOptionDto.oncePerMonth;
        }
        if ((i & 8) != 0) {
            twicePerMonthDto = selectedRegularAutotopupOptionDto.twicePerMonth;
        }
        return selectedRegularAutotopupOptionDto.copy(regularAutotopupTypeDto, oncePerWeekDto, oncePerMonthDto, twicePerMonthDto);
    }

    /* renamed from: component1, reason: from getter */
    public final RegularAutotopupTypeDto getSelected() {
        return this.selected;
    }

    /* renamed from: component2, reason: from getter */
    public final OncePerWeekDto getOncePerWeek() {
        return this.oncePerWeek;
    }

    /* renamed from: component3, reason: from getter */
    public final OncePerMonthDto getOncePerMonth() {
        return this.oncePerMonth;
    }

    /* renamed from: component4, reason: from getter */
    public final TwicePerMonthDto getTwicePerMonth() {
        return this.twicePerMonth;
    }

    public final SelectedRegularAutotopupOptionDto copy(@Json(name = "selected_option_id") RegularAutotopupTypeDto selected, @Json(name = "once_per_week") OncePerWeekDto oncePerWeek, @Json(name = "once_per_month") OncePerMonthDto oncePerMonth, @Json(name = "twice_per_month") TwicePerMonthDto twicePerMonth) {
        return new SelectedRegularAutotopupOptionDto(selected, oncePerWeek, oncePerMonth, twicePerMonth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectedRegularAutotopupOptionDto)) {
            return false;
        }
        SelectedRegularAutotopupOptionDto selectedRegularAutotopupOptionDto = (SelectedRegularAutotopupOptionDto) other;
        return this.selected == selectedRegularAutotopupOptionDto.selected && jl40.l(this.oncePerWeek, selectedRegularAutotopupOptionDto.oncePerWeek) && jl40.l(this.oncePerMonth, selectedRegularAutotopupOptionDto.oncePerMonth) && jl40.l(this.twicePerMonth, selectedRegularAutotopupOptionDto.twicePerMonth);
    }

    public final OncePerMonthDto getOncePerMonth() {
        return this.oncePerMonth;
    }

    public final OncePerWeekDto getOncePerWeek() {
        return this.oncePerWeek;
    }

    public final RegularAutotopupTypeDto getSelected() {
        return this.selected;
    }

    public final TwicePerMonthDto getTwicePerMonth() {
        return this.twicePerMonth;
    }

    public int hashCode() {
        int hashCode = this.selected.hashCode() * 31;
        OncePerWeekDto oncePerWeekDto = this.oncePerWeek;
        int hashCode2 = (hashCode + (oncePerWeekDto == null ? 0 : oncePerWeekDto.hashCode())) * 31;
        OncePerMonthDto oncePerMonthDto = this.oncePerMonth;
        int hashCode3 = (hashCode2 + (oncePerMonthDto == null ? 0 : oncePerMonthDto.hashCode())) * 31;
        TwicePerMonthDto twicePerMonthDto = this.twicePerMonth;
        return hashCode3 + (twicePerMonthDto != null ? twicePerMonthDto.hashCode() : 0);
    }

    public String toString() {
        return "SelectedRegularAutotopupOptionDto(selected=" + this.selected + ", oncePerWeek=" + this.oncePerWeek + ", oncePerMonth=" + this.oncePerMonth + ", twicePerMonth=" + this.twicePerMonth + Extension.C_BRAKE;
    }
}
