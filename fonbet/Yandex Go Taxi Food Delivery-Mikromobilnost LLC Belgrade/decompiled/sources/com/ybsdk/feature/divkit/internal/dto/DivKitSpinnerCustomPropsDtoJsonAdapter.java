package com.ybsdk.feature.divkit.internal.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/dto/DivKitSpinnerCustomPropsDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/divkit/internal/dto/DivKitSpinnerCustomPropsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "nullableThemesOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableFloatAdapter", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DivKitSpinnerCustomPropsDtoJsonAdapter extends JsonAdapter<DivKitSpinnerCustomPropsDto> {
    private final JsonAdapter<Float> nullableFloatAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("spinner_color", "spinner_thickness", "circumference");

    public DivKitSpinnerCustomPropsDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(Themes.class, String.class);
        EmptySet emptySet = EmptySet.a;
        this.nullableThemesOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, "spinnerColor");
        this.nullableFloatAdapter = moshi.adapter(Float.class, emptySet, "spinnerThickness");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DivKitSpinnerCustomPropsDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Themes<String> themes = null;
        Float f = null;
        Float f2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                themes = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                f = this.nullableFloatAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                f2 = this.nullableFloatAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new DivKitSpinnerCustomPropsDto(themes, f, f2);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DivKitSpinnerCustomPropsDto divKitSpinnerCustomPropsDto) {
        DivKitSpinnerCustomPropsDto divKitSpinnerCustomPropsDto2 = divKitSpinnerCustomPropsDto;
        if (divKitSpinnerCustomPropsDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("spinner_color");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) divKitSpinnerCustomPropsDto2.getSpinnerColor());
        jsonWriter.name("spinner_thickness");
        this.nullableFloatAdapter.toJson(jsonWriter, (JsonWriter) divKitSpinnerCustomPropsDto2.getSpinnerThickness());
        jsonWriter.name("circumference");
        this.nullableFloatAdapter.toJson(jsonWriter, (JsonWriter) divKitSpinnerCustomPropsDto2.getCircumference());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(DivKitSpinnerCustomPropsDto)");
    }
}
