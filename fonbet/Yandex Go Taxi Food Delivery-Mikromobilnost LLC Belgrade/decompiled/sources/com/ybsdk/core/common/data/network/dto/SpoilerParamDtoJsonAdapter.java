package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/SpoilerParamDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/SpoilerParamDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "themesOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SpoilerParamDtoJsonAdapter extends JsonAdapter<SpoilerParamDto> {
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("particle_color", "height", "width");
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public SpoilerParamDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(Themes.class, String.class);
        EmptySet emptySet = EmptySet.a;
        this.themesOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, "particleColor");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "height");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SpoilerParamDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Themes<String> themes = null;
        Integer num = null;
        Integer num2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                themes = this.themesOfStringAdapter.fromJson(jsonReader);
                if (themes == null) {
                    throw Util.unexpectedNull("particleColor", "particle_color", jsonReader);
                }
            } else if (selectName == 1) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                num2 = this.nullableIntAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (themes != null) {
            return new SpoilerParamDto(themes, num, num2);
        }
        throw Util.missingProperty("particleColor", "particle_color", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SpoilerParamDto spoilerParamDto) {
        SpoilerParamDto spoilerParamDto2 = spoilerParamDto;
        if (spoilerParamDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("particle_color");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) spoilerParamDto2.getParticleColor());
        jsonWriter.name("height");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) spoilerParamDto2.getHeight());
        jsonWriter.name("width");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) spoilerParamDto2.getWidth());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(SpoilerParamDto)");
    }
}
