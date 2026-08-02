package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.widgets.common.ImageScaleTypeDto;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/OpeningAccountInfoResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/OpeningAccountInfoResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "themesOfStringAdapter", "nullableThemesOfStringAdapter", "Lcom/ybsdk/widgets/common/ImageScaleTypeDto;", "nullableImageScaleTypeDtoAdapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OpeningAccountInfoResponseJsonAdapter extends JsonAdapter<OpeningAccountInfoResponse> {
    private final JsonAdapter<ImageScaleTypeDto> nullableImageScaleTypeDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "main_text", "action", C0553n3.g, "image", "title_text_color", "main_text_color", "background_image", "background_image_scale_type");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public OpeningAccountInfoResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "titleText");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "mainText");
        this.themesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "cardBackground");
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "backgroundImage");
        this.nullableImageScaleTypeDtoAdapter = moshi.adapter(ImageScaleTypeDto.class, emptySet, "imageScaleTypeDto");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final OpeningAccountInfoResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        Themes<String> themes = null;
        Themes<String> themes2 = null;
        Themes<String> themes3 = null;
        Themes<String> themes4 = null;
        Themes<String> themes5 = null;
        ImageScaleTypeDto imageScaleTypeDto = null;
        while (true) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            Themes<String> themes6 = themes;
            if (!jsonReader.hasNext()) {
                Themes<String> themes7 = themes2;
                jsonReader.endObject();
                if (str5 == null) {
                    throw Util.missingProperty("mainText", "main_text", jsonReader);
                }
                if (themes6 == null) {
                    throw Util.missingProperty("cardBackground", C0553n3.g, jsonReader);
                }
                if (themes7 == null) {
                    throw Util.missingProperty("image", "image", jsonReader);
                }
                if (themes3 == null) {
                    throw Util.missingProperty("titleTextColor", "title_text_color", jsonReader);
                }
                if (themes4 != null) {
                    return new OpeningAccountInfoResponse(str4, str5, str6, themes6, themes7, themes3, themes4, themes5, imageScaleTypeDto);
                }
                throw Util.missingProperty("mainTextColor", "main_text_color", jsonReader);
            }
            Themes<String> themes8 = themes2;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    themes2 = themes8;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    themes = themes6;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    themes2 = themes8;
                    str2 = str5;
                    str3 = str6;
                    themes = themes6;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("mainText", "main_text", jsonReader);
                    }
                    themes2 = themes8;
                    str = str4;
                    str3 = str6;
                    themes = themes6;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    themes2 = themes8;
                    str = str4;
                    str2 = str5;
                    themes = themes6;
                case 3:
                    themes = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes == null) {
                        throw Util.unexpectedNull("cardBackground", C0553n3.g, jsonReader);
                    }
                    themes2 = themes8;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                case 4:
                    themes2 = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes2 == null) {
                        throw Util.unexpectedNull("image", "image", jsonReader);
                    }
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    themes = themes6;
                case 5:
                    themes3 = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes3 == null) {
                        throw Util.unexpectedNull("titleTextColor", "title_text_color", jsonReader);
                    }
                    themes2 = themes8;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    themes = themes6;
                case 6:
                    themes4 = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes4 == null) {
                        throw Util.unexpectedNull("mainTextColor", "main_text_color", jsonReader);
                    }
                    themes2 = themes8;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    themes = themes6;
                case 7:
                    themes5 = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    themes2 = themes8;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    themes = themes6;
                case 8:
                    imageScaleTypeDto = this.nullableImageScaleTypeDtoAdapter.fromJson(jsonReader);
                    themes2 = themes8;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    themes = themes6;
                default:
                    themes2 = themes8;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    themes = themes6;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, OpeningAccountInfoResponse openingAccountInfoResponse) {
        OpeningAccountInfoResponse openingAccountInfoResponse2 = openingAccountInfoResponse;
        if (openingAccountInfoResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) openingAccountInfoResponse2.getTitleText());
        jsonWriter.name("main_text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) openingAccountInfoResponse2.getMainText());
        jsonWriter.name("action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) openingAccountInfoResponse2.getAction());
        jsonWriter.name(C0553n3.g);
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) openingAccountInfoResponse2.getCardBackground());
        jsonWriter.name("image");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) openingAccountInfoResponse2.getImage());
        jsonWriter.name("title_text_color");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) openingAccountInfoResponse2.getTitleTextColor());
        jsonWriter.name("main_text_color");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) openingAccountInfoResponse2.getMainTextColor());
        jsonWriter.name("background_image");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) openingAccountInfoResponse2.getBackgroundImage());
        jsonWriter.name("background_image_scale_type");
        this.nullableImageScaleTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) openingAccountInfoResponse2.getImageScaleTypeDto());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(OpeningAccountInfoResponse)");
    }
}
