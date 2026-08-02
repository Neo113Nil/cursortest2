package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.smw0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bù\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0010\b\u0001\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0010\b\u0001\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003Jû\u0001\u00105\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0010\b\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u000e\b\u0003\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0003\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0003\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0003\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0010\b\u0003\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018¨\u0006<"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountThemeDto;", "", "id", "", "backgroundImage", "Lcom/ybsdk/core/common/data/network/dto/Themes;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "balanceTextColor", "interestMonthBackgroundColor", "firstButtonTextColor", "firstButtonSubtitleColor", "firstButtonBackgroundColor", "secondButtonTextColor", "secondButtonSubtitleColor", "secondButtonBackgroundColor", "interestPillTextColor", "interestPillBackgroundColor", "targetTextColor", "themeSelectorBackgroundImage", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getId", "()Ljava/lang/String;", "getBackgroundImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getBackgroundColor", "getBalanceTextColor", "getInterestMonthBackgroundColor", "getFirstButtonTextColor", "getFirstButtonSubtitleColor", "getFirstButtonBackgroundColor", "getSecondButtonTextColor", "getSecondButtonSubtitleColor", "getSecondButtonBackgroundColor", "getInterestPillTextColor", "getInterestPillBackgroundColor", "getTargetTextColor", "getThemeSelectorBackgroundImage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavingsAccountThemeDto {
    private final Themes<String> backgroundColor;
    private final Themes<String> backgroundImage;
    private final Themes<String> balanceTextColor;
    private final Themes<String> firstButtonBackgroundColor;
    private final Themes<String> firstButtonSubtitleColor;
    private final Themes<String> firstButtonTextColor;
    private final String id;
    private final Themes<String> interestMonthBackgroundColor;
    private final Themes<String> interestPillBackgroundColor;
    private final Themes<String> interestPillTextColor;
    private final Themes<String> secondButtonBackgroundColor;
    private final Themes<String> secondButtonSubtitleColor;
    private final Themes<String> secondButtonTextColor;
    private final Themes<String> targetTextColor;
    private final Themes<String> themeSelectorBackgroundImage;

    public SavingsAccountThemeDto(@Json(name = "theme_id") String str, @Json(name = "background_image") Themes<String> themes, @Json(name = "background_color") Themes<String> themes2, @Json(name = "balance_text_color") Themes<String> themes3, @Json(name = "interest_month_background_color") Themes<String> themes4, @Json(name = "first_button_text_color") Themes<String> themes5, @Json(name = "first_button_subtitle_text_color") Themes<String> themes6, @Json(name = "first_button_background_color") Themes<String> themes7, @Json(name = "second_button_text_color") Themes<String> themes8, @Json(name = "second_button_subtitle_text_color") Themes<String> themes9, @Json(name = "second_button_background_color") Themes<String> themes10, @Json(name = "interest_pill_text_color") Themes<String> themes11, @Json(name = "interest_pill_background_color") Themes<String> themes12, @Json(name = "target_text_color") Themes<String> themes13, @Json(name = "theme_selector_background_image") Themes<String> themes14) {
        this.id = str;
        this.backgroundImage = themes;
        this.backgroundColor = themes2;
        this.balanceTextColor = themes3;
        this.interestMonthBackgroundColor = themes4;
        this.firstButtonTextColor = themes5;
        this.firstButtonSubtitleColor = themes6;
        this.firstButtonBackgroundColor = themes7;
        this.secondButtonTextColor = themes8;
        this.secondButtonSubtitleColor = themes9;
        this.secondButtonBackgroundColor = themes10;
        this.interestPillTextColor = themes11;
        this.interestPillBackgroundColor = themes12;
        this.targetTextColor = themes13;
        this.themeSelectorBackgroundImage = themes14;
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final Themes<String> component10() {
        return this.secondButtonSubtitleColor;
    }

    public final Themes<String> component11() {
        return this.secondButtonBackgroundColor;
    }

    public final Themes<String> component12() {
        return this.interestPillTextColor;
    }

    public final Themes<String> component13() {
        return this.interestPillBackgroundColor;
    }

    public final Themes<String> component14() {
        return this.targetTextColor;
    }

    public final Themes<String> component15() {
        return this.themeSelectorBackgroundImage;
    }

    public final Themes<String> component2() {
        return this.backgroundImage;
    }

    public final Themes<String> component3() {
        return this.backgroundColor;
    }

    public final Themes<String> component4() {
        return this.balanceTextColor;
    }

    public final Themes<String> component5() {
        return this.interestMonthBackgroundColor;
    }

    public final Themes<String> component6() {
        return this.firstButtonTextColor;
    }

    public final Themes<String> component7() {
        return this.firstButtonSubtitleColor;
    }

    public final Themes<String> component8() {
        return this.firstButtonBackgroundColor;
    }

    public final Themes<String> component9() {
        return this.secondButtonTextColor;
    }

    public final SavingsAccountThemeDto copy(@Json(name = "theme_id") String id, @Json(name = "background_image") Themes<String> backgroundImage, @Json(name = "background_color") Themes<String> backgroundColor, @Json(name = "balance_text_color") Themes<String> balanceTextColor, @Json(name = "interest_month_background_color") Themes<String> interestMonthBackgroundColor, @Json(name = "first_button_text_color") Themes<String> firstButtonTextColor, @Json(name = "first_button_subtitle_text_color") Themes<String> firstButtonSubtitleColor, @Json(name = "first_button_background_color") Themes<String> firstButtonBackgroundColor, @Json(name = "second_button_text_color") Themes<String> secondButtonTextColor, @Json(name = "second_button_subtitle_text_color") Themes<String> secondButtonSubtitleColor, @Json(name = "second_button_background_color") Themes<String> secondButtonBackgroundColor, @Json(name = "interest_pill_text_color") Themes<String> interestPillTextColor, @Json(name = "interest_pill_background_color") Themes<String> interestPillBackgroundColor, @Json(name = "target_text_color") Themes<String> targetTextColor, @Json(name = "theme_selector_background_image") Themes<String> themeSelectorBackgroundImage) {
        return new SavingsAccountThemeDto(id, backgroundImage, backgroundColor, balanceTextColor, interestMonthBackgroundColor, firstButtonTextColor, firstButtonSubtitleColor, firstButtonBackgroundColor, secondButtonTextColor, secondButtonSubtitleColor, secondButtonBackgroundColor, interestPillTextColor, interestPillBackgroundColor, targetTextColor, themeSelectorBackgroundImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingsAccountThemeDto)) {
            return false;
        }
        SavingsAccountThemeDto savingsAccountThemeDto = (SavingsAccountThemeDto) other;
        return jl40.l(this.id, savingsAccountThemeDto.id) && jl40.l(this.backgroundImage, savingsAccountThemeDto.backgroundImage) && jl40.l(this.backgroundColor, savingsAccountThemeDto.backgroundColor) && jl40.l(this.balanceTextColor, savingsAccountThemeDto.balanceTextColor) && jl40.l(this.interestMonthBackgroundColor, savingsAccountThemeDto.interestMonthBackgroundColor) && jl40.l(this.firstButtonTextColor, savingsAccountThemeDto.firstButtonTextColor) && jl40.l(this.firstButtonSubtitleColor, savingsAccountThemeDto.firstButtonSubtitleColor) && jl40.l(this.firstButtonBackgroundColor, savingsAccountThemeDto.firstButtonBackgroundColor) && jl40.l(this.secondButtonTextColor, savingsAccountThemeDto.secondButtonTextColor) && jl40.l(this.secondButtonSubtitleColor, savingsAccountThemeDto.secondButtonSubtitleColor) && jl40.l(this.secondButtonBackgroundColor, savingsAccountThemeDto.secondButtonBackgroundColor) && jl40.l(this.interestPillTextColor, savingsAccountThemeDto.interestPillTextColor) && jl40.l(this.interestPillBackgroundColor, savingsAccountThemeDto.interestPillBackgroundColor) && jl40.l(this.targetTextColor, savingsAccountThemeDto.targetTextColor) && jl40.l(this.themeSelectorBackgroundImage, savingsAccountThemeDto.themeSelectorBackgroundImage);
    }

    public final Themes<String> getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Themes<String> getBackgroundImage() {
        return this.backgroundImage;
    }

    public final Themes<String> getBalanceTextColor() {
        return this.balanceTextColor;
    }

    public final Themes<String> getFirstButtonBackgroundColor() {
        return this.firstButtonBackgroundColor;
    }

    public final Themes<String> getFirstButtonSubtitleColor() {
        return this.firstButtonSubtitleColor;
    }

    public final Themes<String> getFirstButtonTextColor() {
        return this.firstButtonTextColor;
    }

    public final String getId() {
        return this.id;
    }

    public final Themes<String> getInterestMonthBackgroundColor() {
        return this.interestMonthBackgroundColor;
    }

    public final Themes<String> getInterestPillBackgroundColor() {
        return this.interestPillBackgroundColor;
    }

    public final Themes<String> getInterestPillTextColor() {
        return this.interestPillTextColor;
    }

    public final Themes<String> getSecondButtonBackgroundColor() {
        return this.secondButtonBackgroundColor;
    }

    public final Themes<String> getSecondButtonSubtitleColor() {
        return this.secondButtonSubtitleColor;
    }

    public final Themes<String> getSecondButtonTextColor() {
        return this.secondButtonTextColor;
    }

    public final Themes<String> getTargetTextColor() {
        return this.targetTextColor;
    }

    public final Themes<String> getThemeSelectorBackgroundImage() {
        return this.themeSelectorBackgroundImage;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        Themes<String> themes = this.backgroundImage;
        int c = nnm.c(this.firstButtonTextColor, nnm.c(this.interestMonthBackgroundColor, nnm.c(this.balanceTextColor, nnm.c(this.backgroundColor, (hashCode + (themes == null ? 0 : themes.hashCode())) * 31, 31), 31), 31), 31);
        Themes<String> themes2 = this.firstButtonSubtitleColor;
        int c2 = nnm.c(this.secondButtonTextColor, nnm.c(this.firstButtonBackgroundColor, (c + (themes2 == null ? 0 : themes2.hashCode())) * 31, 31), 31);
        Themes<String> themes3 = this.secondButtonSubtitleColor;
        int c3 = nnm.c(this.targetTextColor, nnm.c(this.interestPillBackgroundColor, nnm.c(this.interestPillTextColor, nnm.c(this.secondButtonBackgroundColor, (c2 + (themes3 == null ? 0 : themes3.hashCode())) * 31, 31), 31), 31), 31);
        Themes<String> themes4 = this.themeSelectorBackgroundImage;
        return c3 + (themes4 != null ? themes4.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        Themes<String> themes = this.backgroundImage;
        Themes<String> themes2 = this.backgroundColor;
        Themes<String> themes3 = this.balanceTextColor;
        Themes<String> themes4 = this.interestMonthBackgroundColor;
        Themes<String> themes5 = this.firstButtonTextColor;
        Themes<String> themes6 = this.firstButtonSubtitleColor;
        Themes<String> themes7 = this.firstButtonBackgroundColor;
        Themes<String> themes8 = this.secondButtonTextColor;
        Themes<String> themes9 = this.secondButtonSubtitleColor;
        Themes<String> themes10 = this.secondButtonBackgroundColor;
        Themes<String> themes11 = this.interestPillTextColor;
        Themes<String> themes12 = this.interestPillBackgroundColor;
        Themes<String> themes13 = this.targetTextColor;
        Themes<String> themes14 = this.themeSelectorBackgroundImage;
        StringBuilder sb = new StringBuilder("SavingsAccountThemeDto(id=");
        sb.append(str);
        sb.append(", backgroundImage=");
        sb.append(themes);
        sb.append(", backgroundColor=");
        sb.append(themes2);
        sb.append(", balanceTextColor=");
        sb.append(themes3);
        sb.append(", interestMonthBackgroundColor=");
        sb.append(themes4);
        sb.append(", firstButtonTextColor=");
        sb.append(themes5);
        sb.append(", firstButtonSubtitleColor=");
        sb.append(themes6);
        sb.append(", firstButtonBackgroundColor=");
        sb.append(themes7);
        sb.append(", secondButtonTextColor=");
        sb.append(themes8);
        sb.append(", secondButtonSubtitleColor=");
        sb.append(themes9);
        sb.append(", secondButtonBackgroundColor=");
        sb.append(themes10);
        sb.append(", interestPillTextColor=");
        sb.append(themes11);
        sb.append(", interestPillBackgroundColor=");
        sb.append(themes12);
        sb.append(", targetTextColor=");
        sb.append(themes13);
        sb.append(", themeSelectorBackgroundImage=");
        return smw0.l(sb, themes14, Extension.C_BRAKE);
    }
}
