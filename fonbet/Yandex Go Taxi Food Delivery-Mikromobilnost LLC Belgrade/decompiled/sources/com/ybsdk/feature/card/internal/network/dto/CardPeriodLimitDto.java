package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.LimitHintDto;
import defpackage.b64;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.x4e;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\b\u0001\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003J[\u0010\"\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0003\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/CardPeriodLimitDto;", "", "settingKey", "", "periodTitle", "inputTitle", "defaultValue", "Ljava/math/BigDecimal;", "currency", "limitHints", "", "Lcom/ybsdk/core/common/data/network/dto/LimitHintDto;", "selected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/util/List;Z)V", "getSettingKey", "()Ljava/lang/String;", "getPeriodTitle", "getInputTitle", "getDefaultValue", "()Ljava/math/BigDecimal;", "getCurrency", "getLimitHints", "()Ljava/util/List;", "getSelected", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardPeriodLimitDto {
    private final String currency;
    private final BigDecimal defaultValue;
    private final String inputTitle;
    private final List<LimitHintDto> limitHints;
    private final String periodTitle;
    private final boolean selected;
    private final String settingKey;

    public CardPeriodLimitDto(@Json(name = "setting_key") String str, @Json(name = "period_title") String str2, @Json(name = "input_title") String str3, @Json(name = "default_value") BigDecimal bigDecimal, @Json(name = "currency") String str4, @Json(name = "limit_hints") List<LimitHintDto> list, @Json(name = "selected") boolean z) {
        this.settingKey = str;
        this.periodTitle = str2;
        this.inputTitle = str3;
        this.defaultValue = bigDecimal;
        this.currency = str4;
        this.limitHints = list;
        this.selected = z;
    }

    public static /* synthetic */ CardPeriodLimitDto copy$default(CardPeriodLimitDto cardPeriodLimitDto, String str, String str2, String str3, BigDecimal bigDecimal, String str4, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardPeriodLimitDto.settingKey;
        }
        if ((i & 2) != 0) {
            str2 = cardPeriodLimitDto.periodTitle;
        }
        if ((i & 4) != 0) {
            str3 = cardPeriodLimitDto.inputTitle;
        }
        if ((i & 8) != 0) {
            bigDecimal = cardPeriodLimitDto.defaultValue;
        }
        if ((i & 16) != 0) {
            str4 = cardPeriodLimitDto.currency;
        }
        if ((i & 32) != 0) {
            list = cardPeriodLimitDto.limitHints;
        }
        if ((i & 64) != 0) {
            z = cardPeriodLimitDto.selected;
        }
        List list2 = list;
        boolean z2 = z;
        String str5 = str4;
        String str6 = str3;
        return cardPeriodLimitDto.copy(str, str2, str6, bigDecimal, str5, list2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSettingKey() {
        return this.settingKey;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPeriodTitle() {
        return this.periodTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getInputTitle() {
        return this.inputTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getDefaultValue() {
        return this.defaultValue;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final List<LimitHintDto> component6() {
        return this.limitHints;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    public final CardPeriodLimitDto copy(@Json(name = "setting_key") String settingKey, @Json(name = "period_title") String periodTitle, @Json(name = "input_title") String inputTitle, @Json(name = "default_value") BigDecimal defaultValue, @Json(name = "currency") String currency, @Json(name = "limit_hints") List<LimitHintDto> limitHints, @Json(name = "selected") boolean selected) {
        return new CardPeriodLimitDto(settingKey, periodTitle, inputTitle, defaultValue, currency, limitHints, selected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardPeriodLimitDto)) {
            return false;
        }
        CardPeriodLimitDto cardPeriodLimitDto = (CardPeriodLimitDto) other;
        return jl40.l(this.settingKey, cardPeriodLimitDto.settingKey) && jl40.l(this.periodTitle, cardPeriodLimitDto.periodTitle) && jl40.l(this.inputTitle, cardPeriodLimitDto.inputTitle) && jl40.l(this.defaultValue, cardPeriodLimitDto.defaultValue) && jl40.l(this.currency, cardPeriodLimitDto.currency) && jl40.l(this.limitHints, cardPeriodLimitDto.limitHints) && this.selected == cardPeriodLimitDto.selected;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final BigDecimal getDefaultValue() {
        return this.defaultValue;
    }

    public final String getInputTitle() {
        return this.inputTitle;
    }

    public final List<LimitHintDto> getLimitHints() {
        return this.limitHints;
    }

    public final String getPeriodTitle() {
        return this.periodTitle;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final String getSettingKey() {
        return this.settingKey;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(this.settingKey.hashCode() * 31, 31, this.periodTitle), 31, this.inputTitle);
        BigDecimal bigDecimal = this.defaultValue;
        int hashCode = (b + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.currency;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<LimitHintDto> list = this.limitHints;
        return Boolean.hashCode(this.selected) + ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.settingKey;
        String str2 = this.periodTitle;
        String str3 = this.inputTitle;
        BigDecimal bigDecimal = this.defaultValue;
        String str4 = this.currency;
        List<LimitHintDto> list = this.limitHints;
        boolean z = this.selected;
        StringBuilder v = b64.v("CardPeriodLimitDto(settingKey=", str, ", periodTitle=", str2, ", inputTitle=");
        v.append(str3);
        v.append(", defaultValue=");
        v.append(bigDecimal);
        v.append(", currency=");
        tse0.x(str4, ", limitHints=", ", selected=", v, list);
        return x4e.i(v, z, Extension.C_BRAKE);
    }
}
