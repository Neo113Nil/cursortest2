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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/CreateAccountInfoResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/CreateAccountInfoResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "themesOfStringAdapter", "nullableThemesOfStringAdapter", "Lcom/ybsdk/widgets/common/ImageScaleTypeDto;", "nullableImageScaleTypeDtoAdapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreateAccountInfoResponseJsonAdapter extends JsonAdapter<CreateAccountInfoResponse> {
    private final JsonAdapter<ImageScaleTypeDto> nullableImageScaleTypeDtoAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("main_text", "action", C0553n3.g, "image", "main_text_color", "background_image", "background_image_scale_type");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public CreateAccountInfoResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "mainText");
        this.themesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "cardBackground");
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "backgroundImage");
        this.nullableImageScaleTypeDtoAdapter = moshi.adapter(ImageScaleTypeDto.class, emptySet, "imageScaleTypeDto");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CreateAccountInfoResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        Themes<String> themes = null;
        Themes<String> themes2 = null;
        Themes<String> themes3 = null;
        Themes<String> themes4 = null;
        ImageScaleTypeDto imageScaleTypeDto = null;
        while (true) {
            String str3 = str;
            String str4 = str2;
            if (!jsonReader.hasNext()) {
                Themes<String> themes5 = themes;
                jsonReader.endObject();
                if (str3 == null) {
                    throw Util.missingProperty("mainText", "main_text", jsonReader);
                }
                if (str4 == null) {
                    throw Util.missingProperty("action", "action", jsonReader);
                }
                if (themes5 == null) {
                    throw Util.missingProperty("cardBackground", C0553n3.g, jsonReader);
                }
                if (themes2 == null) {
                    throw Util.missingProperty("cellImage", "image", jsonReader);
                }
                if (themes3 != null) {
                    return new CreateAccountInfoResponse(str3, str4, themes5, themes2, themes3, themes4, imageScaleTypeDto);
                }
                throw Util.missingProperty("mainTextColor", "main_text_color", jsonReader);
            }
            Themes<String> themes6 = themes;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    themes = themes6;
                    str = str3;
                    str2 = str4;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("mainText", "main_text", jsonReader);
                    }
                    themes = themes6;
                    str2 = str4;
                case 1:
                    String fromJson = this.stringAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("action", "action", jsonReader);
                    }
                    str2 = fromJson;
                    themes = themes6;
                    str = str3;
                case 2:
                    themes = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes == null) {
                        throw Util.unexpectedNull("cardBackground", C0553n3.g, jsonReader);
                    }
                    str = str3;
                    str2 = str4;
                case 3:
                    themes2 = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes2 == null) {
                        throw Util.unexpectedNull("cellImage", "image", jsonReader);
                    }
                    themes = themes6;
                    str = str3;
                    str2 = str4;
                case 4:
                    themes3 = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes3 == null) {
                        throw Util.unexpectedNull("mainTextColor", "main_text_color", jsonReader);
                    }
                    themes = themes6;
                    str = str3;
                    str2 = str4;
                case 5:
                    themes4 = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    themes = themes6;
                    str = str3;
                    str2 = str4;
                case 6:
                    imageScaleTypeDto = this.nullableImageScaleTypeDtoAdapter.fromJson(jsonReader);
                    themes = themes6;
                    str = str3;
                    str2 = str4;
                default:
                    themes = themes6;
                    str = str3;
                    str2 = str4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CreateAccountInfoResponse createAccountInfoResponse) {
        CreateAccountInfoResponse createAccountInfoResponse2 = createAccountInfoResponse;
        if (createAccountInfoResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("main_text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) createAccountInfoResponse2.getMainText());
        jsonWriter.name("action");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) createAccountInfoResponse2.getAction());
        jsonWriter.name(C0553n3.g);
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) createAccountInfoResponse2.getCardBackground());
        jsonWriter.name("image");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) createAccountInfoResponse2.getCellImage());
        jsonWriter.name("main_text_color");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) createAccountInfoResponse2.getMainTextColor());
        jsonWriter.name("background_image");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) createAccountInfoResponse2.getBackgroundImage());
        jsonWriter.name("background_image_scale_type");
        this.nullableImageScaleTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) createAccountInfoResponse2.getImageScaleTypeDto());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(CreateAccountInfoResponse)");
    }
}
