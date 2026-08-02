package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountThemeDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountThemeDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "nullableThemesOfStringAdapter", "themesOfStringAdapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavingsAccountThemeDtoJsonAdapter extends JsonAdapter<SavingsAccountThemeDto> {
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("theme_id", "background_image", "background_color", "balance_text_color", "interest_month_background_color", "first_button_text_color", "first_button_subtitle_text_color", "first_button_background_color", "second_button_text_color", "second_button_subtitle_text_color", "second_button_background_color", "interest_pill_text_color", "interest_pill_background_color", "target_text_color", "theme_selector_background_image");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public SavingsAccountThemeDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "backgroundImage");
        this.themesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, UrbanAdsBottomSheetFragment.BACKGROUND_COLOR);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SavingsAccountThemeDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Themes<String> themes = null;
        Themes<String> themes2 = null;
        Themes<String> themes3 = null;
        Themes<String> themes4 = null;
        Themes<String> themes5 = null;
        Themes<String> themes6 = null;
        Themes<String> themes7 = null;
        Themes<String> themes8 = null;
        Themes<String> themes9 = null;
        Themes<String> themes10 = null;
        Themes<String> themes11 = null;
        Themes<String> themes12 = null;
        Themes<String> themes13 = null;
        Themes<String> themes14 = null;
        while (true) {
            String str2 = str;
            Themes<String> themes15 = themes;
            Themes<String> themes16 = themes2;
            Themes<String> themes17 = themes3;
            Themes<String> themes18 = themes4;
            Themes<String> themes19 = themes5;
            Themes<String> themes20 = themes6;
            Themes<String> themes21 = themes7;
            Themes<String> themes22 = themes8;
            Themes<String> themes23 = themes9;
            Themes<String> themes24 = themes10;
            Themes<String> themes25 = themes11;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (str2 == null) {
                    throw Util.missingProperty("id", "theme_id", jsonReader);
                }
                if (themes16 == null) {
                    throw Util.missingProperty(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
                }
                if (themes17 == null) {
                    throw Util.missingProperty("balanceTextColor", "balance_text_color", jsonReader);
                }
                if (themes18 == null) {
                    throw Util.missingProperty("interestMonthBackgroundColor", "interest_month_background_color", jsonReader);
                }
                if (themes19 == null) {
                    throw Util.missingProperty("firstButtonTextColor", "first_button_text_color", jsonReader);
                }
                if (themes21 == null) {
                    throw Util.missingProperty("firstButtonBackgroundColor", "first_button_background_color", jsonReader);
                }
                if (themes22 == null) {
                    throw Util.missingProperty("secondButtonTextColor", "second_button_text_color", jsonReader);
                }
                if (themes24 == null) {
                    throw Util.missingProperty("secondButtonBackgroundColor", "second_button_background_color", jsonReader);
                }
                if (themes25 == null) {
                    throw Util.missingProperty("interestPillTextColor", "interest_pill_text_color", jsonReader);
                }
                if (themes12 == null) {
                    throw Util.missingProperty("interestPillBackgroundColor", "interest_pill_background_color", jsonReader);
                }
                if (themes13 != null) {
                    return new SavingsAccountThemeDto(str2, themes15, themes16, themes17, themes18, themes19, themes20, themes21, themes22, themes23, themes24, themes25, themes12, themes13, themes14);
                }
                throw Util.missingProperty("targetTextColor", "target_text_color", jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str = str2;
                    themes = themes15;
                    themes2 = themes16;
                    themes3 = themes17;
                    themes4 = themes18;
                    themes5 = themes19;
                    themes6 = themes20;
                    themes7 = themes21;
                    themes8 = themes22;
                    themes9 = themes23;
                    themes10 = themes24;
                    themes11 = themes25;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("id", "theme_id", jsonReader);
                    }
                    themes = themes15;
                    themes2 = themes16;
                    themes3 = themes17;
                    themes4 = themes18;
                    themes5 = themes19;
                    themes6 = themes20;
                    themes7 = themes21;
                    themes8 = themes22;
                    themes9 = themes23;
                    themes10 = themes24;
                    themes11 = themes25;
                case 1:
                    themes = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    str = str2;
                    themes2 = themes16;
                    themes3 = themes17;
                    themes4 = themes18;
                    themes5 = themes19;
                    themes6 = themes20;
                    themes7 = themes21;
                    themes8 = themes22;
                    themes9 = themes23;
                    themes10 = themes24;
                    themes11 = themes25;
                case 2:
                    themes2 = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes2 == null) {
                        throw Util.unexpectedNull(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
                    }
                    str = str2;
                    themes = themes15;
                    themes3 = themes17;
                    themes4 = themes18;
                    themes5 = themes19;
                    themes6 = themes20;
                    themes7 = themes21;
                    themes8 = themes22;
                    themes9 = themes23;
                    themes10 = themes24;
                    themes11 = themes25;
                case 3:
                    themes3 = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes3 == null) {
                        throw Util.unexpectedNull("balanceTextColor", "balance_text_color", jsonReader);
                    }
                    str = str2;
                    themes = themes15;
                    themes2 = themes16;
                    themes4 = themes18;
                    themes5 = themes19;
                    themes6 = themes20;
                    themes7 = themes21;
                    themes8 = themes22;
                    themes9 = themes23;
                    themes10 = themes24;
                    themes11 = themes25;
                case 4:
                    themes4 = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes4 == null) {
                        throw Util.unexpectedNull("interestMonthBackgroundColor", "interest_month_background_color", jsonReader);
                    }
                    str = str2;
                    themes = themes15;
                    themes2 = themes16;
                    themes3 = themes17;
                    themes5 = themes19;
                    themes6 = themes20;
                    themes7 = themes21;
                    themes8 = themes22;
                    themes9 = themes23;
                    themes10 = themes24;
                    themes11 = themes25;
                case 5:
                    themes5 = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes5 == null) {
                        throw Util.unexpectedNull("firstButtonTextColor", "first_button_text_color", jsonReader);
                    }
                    str = str2;
                    themes = themes15;
                    themes2 = themes16;
                    themes3 = themes17;
                    themes4 = themes18;
                    themes6 = themes20;
                    themes7 = themes21;
                    themes8 = themes22;
                    themes9 = themes23;
                    themes10 = themes24;
                    themes11 = themes25;
                case 6:
                    themes6 = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    str = str2;
                    themes = themes15;
                    themes2 = themes16;
                    themes3 = themes17;
                    themes4 = themes18;
                    themes5 = themes19;
                    themes7 = themes21;
                    themes8 = themes22;
                    themes9 = themes23;
                    themes10 = themes24;
                    themes11 = themes25;
                case 7:
                    themes7 = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes7 == null) {
                        throw Util.unexpectedNull("firstButtonBackgroundColor", "first_button_background_color", jsonReader);
                    }
                    str = str2;
                    themes = themes15;
                    themes2 = themes16;
                    themes3 = themes17;
                    themes4 = themes18;
                    themes5 = themes19;
                    themes6 = themes20;
                    themes8 = themes22;
                    themes9 = themes23;
                    themes10 = themes24;
                    themes11 = themes25;
                case 8:
                    themes8 = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes8 == null) {
                        throw Util.unexpectedNull("secondButtonTextColor", "second_button_text_color", jsonReader);
                    }
                    str = str2;
                    themes = themes15;
                    themes2 = themes16;
                    themes3 = themes17;
                    themes4 = themes18;
                    themes5 = themes19;
                    themes6 = themes20;
                    themes7 = themes21;
                    themes9 = themes23;
                    themes10 = themes24;
                    themes11 = themes25;
                case 9:
                    themes9 = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    str = str2;
                    themes = themes15;
                    themes2 = themes16;
                    themes3 = themes17;
                    themes4 = themes18;
                    themes5 = themes19;
                    themes6 = themes20;
                    themes7 = themes21;
                    themes8 = themes22;
                    themes10 = themes24;
                    themes11 = themes25;
                case 10:
                    themes10 = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes10 == null) {
                        throw Util.unexpectedNull("secondButtonBackgroundColor", "second_button_background_color", jsonReader);
                    }
                    str = str2;
                    themes = themes15;
                    themes2 = themes16;
                    themes3 = themes17;
                    themes4 = themes18;
                    themes5 = themes19;
                    themes6 = themes20;
                    themes7 = themes21;
                    themes8 = themes22;
                    themes9 = themes23;
                    themes11 = themes25;
                case 11:
                    themes11 = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes11 == null) {
                        throw Util.unexpectedNull("interestPillTextColor", "interest_pill_text_color", jsonReader);
                    }
                    str = str2;
                    themes = themes15;
                    themes2 = themes16;
                    themes3 = themes17;
                    themes4 = themes18;
                    themes5 = themes19;
                    themes6 = themes20;
                    themes7 = themes21;
                    themes8 = themes22;
                    themes9 = themes23;
                    themes10 = themes24;
                case 12:
                    themes12 = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes12 == null) {
                        throw Util.unexpectedNull("interestPillBackgroundColor", "interest_pill_background_color", jsonReader);
                    }
                    str = str2;
                    themes = themes15;
                    themes2 = themes16;
                    themes3 = themes17;
                    themes4 = themes18;
                    themes5 = themes19;
                    themes6 = themes20;
                    themes7 = themes21;
                    themes8 = themes22;
                    themes9 = themes23;
                    themes10 = themes24;
                    themes11 = themes25;
                case 13:
                    themes13 = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes13 == null) {
                        throw Util.unexpectedNull("targetTextColor", "target_text_color", jsonReader);
                    }
                    str = str2;
                    themes = themes15;
                    themes2 = themes16;
                    themes3 = themes17;
                    themes4 = themes18;
                    themes5 = themes19;
                    themes6 = themes20;
                    themes7 = themes21;
                    themes8 = themes22;
                    themes9 = themes23;
                    themes10 = themes24;
                    themes11 = themes25;
                case 14:
                    themes14 = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    str = str2;
                    themes = themes15;
                    themes2 = themes16;
                    themes3 = themes17;
                    themes4 = themes18;
                    themes5 = themes19;
                    themes6 = themes20;
                    themes7 = themes21;
                    themes8 = themes22;
                    themes9 = themes23;
                    themes10 = themes24;
                    themes11 = themes25;
                default:
                    str = str2;
                    themes = themes15;
                    themes2 = themes16;
                    themes3 = themes17;
                    themes4 = themes18;
                    themes5 = themes19;
                    themes6 = themes20;
                    themes7 = themes21;
                    themes8 = themes22;
                    themes9 = themes23;
                    themes10 = themes24;
                    themes11 = themes25;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SavingsAccountThemeDto savingsAccountThemeDto) {
        SavingsAccountThemeDto savingsAccountThemeDto2 = savingsAccountThemeDto;
        if (savingsAccountThemeDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("theme_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountThemeDto2.getId());
        jsonWriter.name("background_image");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountThemeDto2.getBackgroundImage());
        jsonWriter.name("background_color");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountThemeDto2.getBackgroundColor());
        jsonWriter.name("balance_text_color");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountThemeDto2.getBalanceTextColor());
        jsonWriter.name("interest_month_background_color");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountThemeDto2.getInterestMonthBackgroundColor());
        jsonWriter.name("first_button_text_color");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountThemeDto2.getFirstButtonTextColor());
        jsonWriter.name("first_button_subtitle_text_color");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountThemeDto2.getFirstButtonSubtitleColor());
        jsonWriter.name("first_button_background_color");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountThemeDto2.getFirstButtonBackgroundColor());
        jsonWriter.name("second_button_text_color");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountThemeDto2.getSecondButtonTextColor());
        jsonWriter.name("second_button_subtitle_text_color");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountThemeDto2.getSecondButtonSubtitleColor());
        jsonWriter.name("second_button_background_color");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountThemeDto2.getSecondButtonBackgroundColor());
        jsonWriter.name("interest_pill_text_color");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountThemeDto2.getInterestPillTextColor());
        jsonWriter.name("interest_pill_background_color");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountThemeDto2.getInterestPillBackgroundColor());
        jsonWriter.name("target_text_color");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountThemeDto2.getTargetTextColor());
        jsonWriter.name("theme_selector_background_image");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountThemeDto2.getThemeSelectorBackgroundImage());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(SavingsAccountThemeDto)");
    }
}
