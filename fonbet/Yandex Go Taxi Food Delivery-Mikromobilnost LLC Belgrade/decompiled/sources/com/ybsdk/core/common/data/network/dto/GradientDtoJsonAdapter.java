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
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR&\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/GradientDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/GradientDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "listOfThemedParameterOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GradientDtoJsonAdapter extends JsonAdapter<GradientDto> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<ThemedParameter<String>>> listOfThemedParameterOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("colors", "angle");

    public GradientDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, Types.newParameterizedType(ThemedParameter.class, String.class));
        EmptySet emptySet = EmptySet.a;
        this.listOfThemedParameterOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, "colors");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "angle");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GradientDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<ThemedParameter<String>> list = null;
        Integer num = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfThemedParameterOfStringAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("colors", "colors", jsonReader);
                }
            } else if (selectName == 1 && (num = this.intAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("angle", "angle", jsonReader);
            }
        }
        jsonReader.endObject();
        if (list == null) {
            throw Util.missingProperty("colors", "colors", jsonReader);
        }
        if (num != null) {
            return new GradientDto(list, num.intValue());
        }
        throw Util.missingProperty("angle", "angle", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GradientDto gradientDto) {
        GradientDto gradientDto2 = gradientDto;
        if (gradientDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("colors");
        this.listOfThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) gradientDto2.getColors());
        jsonWriter.name("angle");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(gradientDto2.getAngle()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(33, "GeneratedJsonAdapter(GradientDto)");
    }
}
