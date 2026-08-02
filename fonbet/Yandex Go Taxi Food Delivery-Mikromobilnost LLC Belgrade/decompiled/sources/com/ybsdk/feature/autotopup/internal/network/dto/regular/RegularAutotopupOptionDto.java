package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0001\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bHÆ\u0003Ja\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\u0016\b\u0003\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupOptionDto;", "", "type", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupTypeDto;", "text", "", "hintMoney", "hintDate", "formatDate", "placeholderLastDay", "dayOfWeekText", "", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/DayOfWeekDto;", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getType", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupTypeDto;", "getText", "()Ljava/lang/String;", "getHintMoney", "getHintDate", "getFormatDate", "getPlaceholderLastDay", "getDayOfWeekText", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RegularAutotopupOptionDto {
    private final Map<DayOfWeekDto, String> dayOfWeekText;
    private final String formatDate;
    private final String hintDate;
    private final String hintMoney;
    private final String placeholderLastDay;
    private final String text;
    private final RegularAutotopupTypeDto type;

    public RegularAutotopupOptionDto(@Json(name = "id") RegularAutotopupTypeDto regularAutotopupTypeDto, @Json(name = "text") String str, @Json(name = "money_hint") String str2, @Json(name = "date_hint") String str3, @Json(name = "date_format") String str4, @Json(name = "last_day_placeholder") String str5, @Json(name = "week_day_to_date_string") Map<DayOfWeekDto, String> map) {
        this.type = regularAutotopupTypeDto;
        this.text = str;
        this.hintMoney = str2;
        this.hintDate = str3;
        this.formatDate = str4;
        this.placeholderLastDay = str5;
        this.dayOfWeekText = map;
    }

    public static /* synthetic */ RegularAutotopupOptionDto copy$default(RegularAutotopupOptionDto regularAutotopupOptionDto, RegularAutotopupTypeDto regularAutotopupTypeDto, String str, String str2, String str3, String str4, String str5, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            regularAutotopupTypeDto = regularAutotopupOptionDto.type;
        }
        if ((i & 2) != 0) {
            str = regularAutotopupOptionDto.text;
        }
        if ((i & 4) != 0) {
            str2 = regularAutotopupOptionDto.hintMoney;
        }
        if ((i & 8) != 0) {
            str3 = regularAutotopupOptionDto.hintDate;
        }
        if ((i & 16) != 0) {
            str4 = regularAutotopupOptionDto.formatDate;
        }
        if ((i & 32) != 0) {
            str5 = regularAutotopupOptionDto.placeholderLastDay;
        }
        if ((i & 64) != 0) {
            map = regularAutotopupOptionDto.dayOfWeekText;
        }
        String str6 = str5;
        Map map2 = map;
        String str7 = str4;
        String str8 = str2;
        return regularAutotopupOptionDto.copy(regularAutotopupTypeDto, str, str8, str3, str7, str6, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final RegularAutotopupTypeDto getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHintMoney() {
        return this.hintMoney;
    }

    /* renamed from: component4, reason: from getter */
    public final String getHintDate() {
        return this.hintDate;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFormatDate() {
        return this.formatDate;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPlaceholderLastDay() {
        return this.placeholderLastDay;
    }

    public final Map<DayOfWeekDto, String> component7() {
        return this.dayOfWeekText;
    }

    public final RegularAutotopupOptionDto copy(@Json(name = "id") RegularAutotopupTypeDto type, @Json(name = "text") String text, @Json(name = "money_hint") String hintMoney, @Json(name = "date_hint") String hintDate, @Json(name = "date_format") String formatDate, @Json(name = "last_day_placeholder") String placeholderLastDay, @Json(name = "week_day_to_date_string") Map<DayOfWeekDto, String> dayOfWeekText) {
        return new RegularAutotopupOptionDto(type, text, hintMoney, hintDate, formatDate, placeholderLastDay, dayOfWeekText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegularAutotopupOptionDto)) {
            return false;
        }
        RegularAutotopupOptionDto regularAutotopupOptionDto = (RegularAutotopupOptionDto) other;
        return this.type == regularAutotopupOptionDto.type && jl40.l(this.text, regularAutotopupOptionDto.text) && jl40.l(this.hintMoney, regularAutotopupOptionDto.hintMoney) && jl40.l(this.hintDate, regularAutotopupOptionDto.hintDate) && jl40.l(this.formatDate, regularAutotopupOptionDto.formatDate) && jl40.l(this.placeholderLastDay, regularAutotopupOptionDto.placeholderLastDay) && jl40.l(this.dayOfWeekText, regularAutotopupOptionDto.dayOfWeekText);
    }

    public final Map<DayOfWeekDto, String> getDayOfWeekText() {
        return this.dayOfWeekText;
    }

    public final String getFormatDate() {
        return this.formatDate;
    }

    public final String getHintDate() {
        return this.hintDate;
    }

    public final String getHintMoney() {
        return this.hintMoney;
    }

    public final String getPlaceholderLastDay() {
        return this.placeholderLastDay;
    }

    public final String getText() {
        return this.text;
    }

    public final RegularAutotopupTypeDto getType() {
        return this.type;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(this.type.hashCode() * 31, 31, this.text), 31, this.hintMoney), 31, this.hintDate);
        String str = this.formatDate;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.placeholderLastDay;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<DayOfWeekDto, String> map = this.dayOfWeekText;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        RegularAutotopupTypeDto regularAutotopupTypeDto = this.type;
        String str = this.text;
        String str2 = this.hintMoney;
        String str3 = this.hintDate;
        String str4 = this.formatDate;
        String str5 = this.placeholderLastDay;
        Map<DayOfWeekDto, String> map = this.dayOfWeekText;
        StringBuilder sb = new StringBuilder("RegularAutotopupOptionDto(type=");
        sb.append(regularAutotopupTypeDto);
        sb.append(", text=");
        sb.append(str);
        sb.append(", hintMoney=");
        g8e.D(sb, str2, ", hintDate=", str3, ", formatDate=");
        g8e.D(sb, str4, ", placeholderLastDay=", str5, ", dayOfWeekText=");
        return b64.r(sb, map, Extension.C_BRAKE);
    }
}
