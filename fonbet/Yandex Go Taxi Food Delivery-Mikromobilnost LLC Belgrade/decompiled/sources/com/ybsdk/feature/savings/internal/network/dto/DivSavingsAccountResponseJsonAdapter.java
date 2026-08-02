package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.savings.internal.network.dto.DivSavingsAccountResponse;
import com.ybsdk.widgets.common.ImageScaleTypeDto;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/DivSavingsAccountResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/DivSavingsAccountResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "divDataDtoAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/DivSavingsAccountResponse$Type;", "typeAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "themesOfStringAdapter", "nullableThemesOfStringAdapter", "Lcom/ybsdk/widgets/common/ImageScaleTypeDto;", "nullableImageScaleTypeDtoAdapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DivSavingsAccountResponseJsonAdapter extends JsonAdapter<DivSavingsAccountResponse> {
    private final JsonAdapter<DivDataDto> divDataDtoAdapter;
    private final JsonAdapter<ImageScaleTypeDto> nullableImageScaleTypeDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("id", "div", "type", "agreement_id", C0553n3.g, "background_image", "background_image_scale_type");
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;
    private final JsonAdapter<DivSavingsAccountResponse.Type> typeAdapter;

    public DivSavingsAccountResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.divDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "div");
        this.typeAdapter = moshi.adapter(DivSavingsAccountResponse.Type.class, emptySet, "type");
        this.themesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, C0553n3.g);
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "backgroundImage");
        this.nullableImageScaleTypeDtoAdapter = moshi.adapter(ImageScaleTypeDto.class, emptySet, "imageScaleTypeDto");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DivSavingsAccountResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        DivDataDto divDataDto = null;
        DivSavingsAccountResponse.Type type = null;
        String str2 = null;
        Themes<String> themes = null;
        Themes<String> themes2 = null;
        ImageScaleTypeDto imageScaleTypeDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    divDataDto = this.divDataDtoAdapter.fromJson(jsonReader);
                    if (divDataDto == null) {
                        throw Util.unexpectedNull("div", "div", jsonReader);
                    }
                    break;
                case 2:
                    type = this.typeAdapter.fromJson(jsonReader);
                    if (type == null) {
                        throw Util.unexpectedNull("type", "type", jsonReader);
                    }
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    themes = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes == null) {
                        throw Util.unexpectedNull(C0553n3.g, C0553n3.g, jsonReader);
                    }
                    break;
                case 5:
                    themes2 = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    imageScaleTypeDto = this.nullableImageScaleTypeDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (divDataDto == null) {
            throw Util.missingProperty("div", "div", jsonReader);
        }
        if (type == null) {
            throw Util.missingProperty("type", "type", jsonReader);
        }
        if (themes != null) {
            return new DivSavingsAccountResponse(str, divDataDto, type, str2, themes, themes2, imageScaleTypeDto);
        }
        throw Util.missingProperty(C0553n3.g, C0553n3.g, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DivSavingsAccountResponse divSavingsAccountResponse) {
        DivSavingsAccountResponse divSavingsAccountResponse2 = divSavingsAccountResponse;
        if (divSavingsAccountResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) divSavingsAccountResponse2.getId());
        jsonWriter.name("div");
        this.divDataDtoAdapter.toJson(jsonWriter, (JsonWriter) divSavingsAccountResponse2.getDiv());
        jsonWriter.name("type");
        this.typeAdapter.toJson(jsonWriter, (JsonWriter) divSavingsAccountResponse2.getType());
        jsonWriter.name("agreement_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) divSavingsAccountResponse2.getAgreementId());
        jsonWriter.name(C0553n3.g);
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) divSavingsAccountResponse2.getBackground());
        jsonWriter.name("background_image");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) divSavingsAccountResponse2.getBackgroundImage());
        jsonWriter.name("background_image_scale_type");
        this.nullableImageScaleTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) divSavingsAccountResponse2.getImageScaleTypeDto());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(DivSavingsAccountResponse)");
    }
}
