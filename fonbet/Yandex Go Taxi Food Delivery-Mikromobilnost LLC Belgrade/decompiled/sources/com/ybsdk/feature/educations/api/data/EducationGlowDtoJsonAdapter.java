package com.ybsdk.feature.educations.api.data;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/educations/api/data/EducationGlowDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/educations/api/data/EducationGlowDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "themesOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EducationGlowDtoJsonAdapter extends JsonAdapter<EducationGlowDto> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("color", "radius");
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public EducationGlowDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(Themes.class, String.class);
        EmptySet emptySet = EmptySet.a;
        this.themesOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, "color");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "radius");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final EducationGlowDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Themes<String> themes = null;
        Integer num = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                themes = this.themesOfStringAdapter.fromJson(jsonReader);
                if (themes == null) {
                    throw Util.unexpectedNull("color", "color", jsonReader);
                }
            } else if (selectName == 1 && (num = this.intAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("radius", "radius", jsonReader);
            }
        }
        jsonReader.endObject();
        if (themes == null) {
            throw Util.missingProperty("color", "color", jsonReader);
        }
        if (num != null) {
            return new EducationGlowDto(themes, num.intValue());
        }
        throw Util.missingProperty("radius", "radius", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, EducationGlowDto educationGlowDto) {
        EducationGlowDto educationGlowDto2 = educationGlowDto;
        if (educationGlowDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("color");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) educationGlowDto2.getColor());
        jsonWriter.name("radius");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(educationGlowDto2.getRadius()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(EducationGlowDto)");
    }
}
