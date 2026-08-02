package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.widgets.common.ImageScaleTypeDto;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/ExistingAccountInfoResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/ExistingAccountInfoResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "", "nullableBooleanAdapter", "nullableMoneyAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "themesOfStringAdapter", "nullableThemesOfStringAdapter", "Lcom/ybsdk/widgets/common/ImageScaleTypeDto;", "nullableImageScaleTypeDtoAdapter", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExistingAccountInfoResponseJsonAdapter extends JsonAdapter<ExistingAccountInfoResponse> {
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonAdapter<ImageScaleTypeDto> nullableImageScaleTypeDtoAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "subtitle", "action", "balance", "interest", "interest_locked", "interest_payment_term", "target", "agreement_id", C0553n3.g, "title_text_color", "balance_text_color", "subtitle_text_color", "interest_text_color", "interest_background", "target_text_color", "background_image", "background_image_scale_type", "div_subtitle");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public ExistingAccountInfoResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "subtitle");
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "balance");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "interestLocked");
        this.nullableMoneyAdapter = moshi.adapter(Money.class, emptySet, "target");
        this.themesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "cardBackground");
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "subtitleTextColor");
        this.nullableImageScaleTypeDtoAdapter = moshi.adapter(ImageScaleTypeDto.class, emptySet, "imageScaleTypeDto");
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "divSubtitle");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ExistingAccountInfoResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        Money money = null;
        Money money2 = null;
        Boolean bool = null;
        String str4 = null;
        Money money3 = null;
        String str5 = null;
        Themes<String> themes = null;
        Themes<String> themes2 = null;
        Themes<String> themes3 = null;
        Themes<String> themes4 = null;
        Themes<String> themes5 = null;
        Themes<String> themes6 = null;
        Themes<String> themes7 = null;
        Themes<String> themes8 = null;
        ImageScaleTypeDto imageScaleTypeDto = null;
        DivDataDto divDataDto = null;
        while (true) {
            String str6 = str;
            String str7 = str2;
            String str8 = str3;
            Money money4 = money;
            Money money5 = money2;
            Boolean bool2 = bool;
            String str9 = str4;
            Money money6 = money3;
            String str10 = str5;
            Themes<String> themes9 = themes;
            Themes<String> themes10 = themes2;
            Themes<String> themes11 = themes3;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (str6 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (str8 == null) {
                    throw Util.missingProperty("action", "action", jsonReader);
                }
                if (money4 == null) {
                    throw Util.missingProperty("balance", "balance", jsonReader);
                }
                if (money5 == null) {
                    throw Util.missingProperty("interest", "interest", jsonReader);
                }
                if (str10 == null) {
                    throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
                }
                if (themes9 == null) {
                    throw Util.missingProperty("cardBackground", C0553n3.g, jsonReader);
                }
                if (themes10 == null) {
                    throw Util.missingProperty("titleTextColor", "title_text_color", jsonReader);
                }
                if (themes11 == null) {
                    throw Util.missingProperty("balanceTextColor", "balance_text_color", jsonReader);
                }
                if (themes5 == null) {
                    throw Util.missingProperty("interestTextColor", "interest_text_color", jsonReader);
                }
                if (themes6 != null) {
                    return new ExistingAccountInfoResponse(str6, str7, str8, money4, money5, bool2, str9, money6, str10, themes9, themes10, themes11, themes4, themes5, themes6, themes7, themes8, imageScaleTypeDto, divDataDto);
                }
                throw Util.missingProperty("interestBackground", "interest_background", jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    money = money4;
                    money2 = money5;
                    bool = bool2;
                    str4 = str9;
                    money3 = money6;
                    str5 = str10;
                    themes = themes9;
                    themes2 = themes10;
                    themes3 = themes11;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    str2 = str7;
                    str3 = str8;
                    money = money4;
                    money2 = money5;
                    bool = bool2;
                    str4 = str9;
                    money3 = money6;
                    str5 = str10;
                    themes = themes9;
                    themes2 = themes10;
                    themes3 = themes11;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    str = str6;
                    str3 = str8;
                    money = money4;
                    money2 = money5;
                    bool = bool2;
                    str4 = str9;
                    money3 = money6;
                    str5 = str10;
                    themes = themes9;
                    themes2 = themes10;
                    themes3 = themes11;
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("action", "action", jsonReader);
                    }
                    str = str6;
                    str2 = str7;
                    money = money4;
                    money2 = money5;
                    bool = bool2;
                    str4 = str9;
                    money3 = money6;
                    str5 = str10;
                    themes = themes9;
                    themes2 = themes10;
                    themes3 = themes11;
                case 3:
                    money = this.moneyAdapter.fromJson(jsonReader);
                    if (money == null) {
                        throw Util.unexpectedNull("balance", "balance", jsonReader);
                    }
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    money2 = money5;
                    bool = bool2;
                    str4 = str9;
                    money3 = money6;
                    str5 = str10;
                    themes = themes9;
                    themes2 = themes10;
                    themes3 = themes11;
                case 4:
                    money2 = this.moneyAdapter.fromJson(jsonReader);
                    if (money2 == null) {
                        throw Util.unexpectedNull("interest", "interest", jsonReader);
                    }
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    money = money4;
                    bool = bool2;
                    str4 = str9;
                    money3 = money6;
                    str5 = str10;
                    themes = themes9;
                    themes2 = themes10;
                    themes3 = themes11;
                case 5:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    money = money4;
                    money2 = money5;
                    str4 = str9;
                    money3 = money6;
                    str5 = str10;
                    themes = themes9;
                    themes2 = themes10;
                    themes3 = themes11;
                case 6:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    money = money4;
                    money2 = money5;
                    bool = bool2;
                    money3 = money6;
                    str5 = str10;
                    themes = themes9;
                    themes2 = themes10;
                    themes3 = themes11;
                case 7:
                    money3 = this.nullableMoneyAdapter.fromJson(jsonReader);
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    money = money4;
                    money2 = money5;
                    bool = bool2;
                    str4 = str9;
                    str5 = str10;
                    themes = themes9;
                    themes2 = themes10;
                    themes3 = themes11;
                case 8:
                    str5 = this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("agreementId", "agreement_id", jsonReader);
                    }
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    money = money4;
                    money2 = money5;
                    bool = bool2;
                    str4 = str9;
                    money3 = money6;
                    themes = themes9;
                    themes2 = themes10;
                    themes3 = themes11;
                case 9:
                    themes = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes == null) {
                        throw Util.unexpectedNull("cardBackground", C0553n3.g, jsonReader);
                    }
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    money = money4;
                    money2 = money5;
                    bool = bool2;
                    str4 = str9;
                    money3 = money6;
                    str5 = str10;
                    themes2 = themes10;
                    themes3 = themes11;
                case 10:
                    themes2 = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes2 == null) {
                        throw Util.unexpectedNull("titleTextColor", "title_text_color", jsonReader);
                    }
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    money = money4;
                    money2 = money5;
                    bool = bool2;
                    str4 = str9;
                    money3 = money6;
                    str5 = str10;
                    themes = themes9;
                    themes3 = themes11;
                case 11:
                    themes3 = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes3 == null) {
                        throw Util.unexpectedNull("balanceTextColor", "balance_text_color", jsonReader);
                    }
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    money = money4;
                    money2 = money5;
                    bool = bool2;
                    str4 = str9;
                    money3 = money6;
                    str5 = str10;
                    themes = themes9;
                    themes2 = themes10;
                case 12:
                    themes4 = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    money = money4;
                    money2 = money5;
                    bool = bool2;
                    str4 = str9;
                    money3 = money6;
                    str5 = str10;
                    themes = themes9;
                    themes2 = themes10;
                    themes3 = themes11;
                case 13:
                    themes5 = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes5 == null) {
                        throw Util.unexpectedNull("interestTextColor", "interest_text_color", jsonReader);
                    }
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    money = money4;
                    money2 = money5;
                    bool = bool2;
                    str4 = str9;
                    money3 = money6;
                    str5 = str10;
                    themes = themes9;
                    themes2 = themes10;
                    themes3 = themes11;
                case 14:
                    themes6 = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes6 == null) {
                        throw Util.unexpectedNull("interestBackground", "interest_background", jsonReader);
                    }
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    money = money4;
                    money2 = money5;
                    bool = bool2;
                    str4 = str9;
                    money3 = money6;
                    str5 = str10;
                    themes = themes9;
                    themes2 = themes10;
                    themes3 = themes11;
                case 15:
                    themes7 = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    money = money4;
                    money2 = money5;
                    bool = bool2;
                    str4 = str9;
                    money3 = money6;
                    str5 = str10;
                    themes = themes9;
                    themes2 = themes10;
                    themes3 = themes11;
                case 16:
                    themes8 = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    money = money4;
                    money2 = money5;
                    bool = bool2;
                    str4 = str9;
                    money3 = money6;
                    str5 = str10;
                    themes = themes9;
                    themes2 = themes10;
                    themes3 = themes11;
                case 17:
                    imageScaleTypeDto = this.nullableImageScaleTypeDtoAdapter.fromJson(jsonReader);
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    money = money4;
                    money2 = money5;
                    bool = bool2;
                    str4 = str9;
                    money3 = money6;
                    str5 = str10;
                    themes = themes9;
                    themes2 = themes10;
                    themes3 = themes11;
                case 18:
                    divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    money = money4;
                    money2 = money5;
                    bool = bool2;
                    str4 = str9;
                    money3 = money6;
                    str5 = str10;
                    themes = themes9;
                    themes2 = themes10;
                    themes3 = themes11;
                default:
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    money = money4;
                    money2 = money5;
                    bool = bool2;
                    str4 = str9;
                    money3 = money6;
                    str5 = str10;
                    themes = themes9;
                    themes2 = themes10;
                    themes3 = themes11;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ExistingAccountInfoResponse existingAccountInfoResponse) {
        ExistingAccountInfoResponse existingAccountInfoResponse2 = existingAccountInfoResponse;
        if (existingAccountInfoResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) existingAccountInfoResponse2.getTitle());
        jsonWriter.name("subtitle");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) existingAccountInfoResponse2.getSubtitle());
        jsonWriter.name("action");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) existingAccountInfoResponse2.getAction());
        jsonWriter.name("balance");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) existingAccountInfoResponse2.getBalance());
        jsonWriter.name("interest");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) existingAccountInfoResponse2.getInterest());
        jsonWriter.name("interest_locked");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) existingAccountInfoResponse2.getInterestLocked());
        jsonWriter.name("interest_payment_term");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) existingAccountInfoResponse2.getTextUnderAmount());
        jsonWriter.name("target");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) existingAccountInfoResponse2.getTarget());
        jsonWriter.name("agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) existingAccountInfoResponse2.getAgreementId());
        jsonWriter.name(C0553n3.g);
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) existingAccountInfoResponse2.getCardBackground());
        jsonWriter.name("title_text_color");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) existingAccountInfoResponse2.getTitleTextColor());
        jsonWriter.name("balance_text_color");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) existingAccountInfoResponse2.getBalanceTextColor());
        jsonWriter.name("subtitle_text_color");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) existingAccountInfoResponse2.getSubtitleTextColor());
        jsonWriter.name("interest_text_color");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) existingAccountInfoResponse2.getInterestTextColor());
        jsonWriter.name("interest_background");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) existingAccountInfoResponse2.getInterestBackground());
        jsonWriter.name("target_text_color");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) existingAccountInfoResponse2.getTargetTextColor());
        jsonWriter.name("background_image");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) existingAccountInfoResponse2.getBackgroundImage());
        jsonWriter.name("background_image_scale_type");
        this.nullableImageScaleTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) existingAccountInfoResponse2.getImageScaleTypeDto());
        jsonWriter.name("div_subtitle");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) existingAccountInfoResponse2.getDivSubtitle());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(ExistingAccountInfoResponse)");
    }
}
