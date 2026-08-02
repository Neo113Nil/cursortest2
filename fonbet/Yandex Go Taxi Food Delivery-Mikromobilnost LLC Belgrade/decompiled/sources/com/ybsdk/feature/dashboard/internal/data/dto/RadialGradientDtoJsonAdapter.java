package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/RadialGradientDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/RadialGradientDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "floatAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/feature/dashboard/internal/data/dto/RadialGradientColorDto;", "listOfRadialGradientColorDtoAdapter", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RadialGradientDtoJsonAdapter extends JsonAdapter<RadialGradientDto> {
    private final JsonAdapter<Float> floatAdapter;
    private final JsonAdapter<List<RadialGradientColorDto>> listOfRadialGradientColorDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("center_x", "center_y", "radius", "colors");

    public RadialGradientDtoJsonAdapter(Moshi moshi) {
        Class cls = Float.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.floatAdapter = moshi.adapter(cls, emptySet, "centerX");
        this.listOfRadialGradientColorDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, RadialGradientColorDto.class), emptySet, "colors");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RadialGradientDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Float f = null;
        Float f2 = null;
        Float f3 = null;
        List<RadialGradientColorDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                f = this.floatAdapter.fromJson(jsonReader);
                if (f == null) {
                    throw Util.unexpectedNull("centerX", "center_x", jsonReader);
                }
            } else if (selectName == 1) {
                f2 = this.floatAdapter.fromJson(jsonReader);
                if (f2 == null) {
                    throw Util.unexpectedNull("centerY", "center_y", jsonReader);
                }
            } else if (selectName == 2) {
                f3 = this.floatAdapter.fromJson(jsonReader);
                if (f3 == null) {
                    throw Util.unexpectedNull("radius", "radius", jsonReader);
                }
            } else if (selectName == 3 && (list = this.listOfRadialGradientColorDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("colors", "colors", jsonReader);
            }
        }
        jsonReader.endObject();
        if (f == null) {
            throw Util.missingProperty("centerX", "center_x", jsonReader);
        }
        float floatValue = f.floatValue();
        if (f2 == null) {
            throw Util.missingProperty("centerY", "center_y", jsonReader);
        }
        float floatValue2 = f2.floatValue();
        if (f3 == null) {
            throw Util.missingProperty("radius", "radius", jsonReader);
        }
        float floatValue3 = f3.floatValue();
        if (list != null) {
            return new RadialGradientDto(floatValue, floatValue2, floatValue3, list);
        }
        throw Util.missingProperty("colors", "colors", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RadialGradientDto radialGradientDto) {
        RadialGradientDto radialGradientDto2 = radialGradientDto;
        if (radialGradientDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("center_x");
        this.floatAdapter.toJson(jsonWriter, (JsonWriter) Float.valueOf(radialGradientDto2.getCenterX()));
        jsonWriter.name("center_y");
        this.floatAdapter.toJson(jsonWriter, (JsonWriter) Float.valueOf(radialGradientDto2.getCenterY()));
        jsonWriter.name("radius");
        this.floatAdapter.toJson(jsonWriter, (JsonWriter) Float.valueOf(radialGradientDto2.getRadius()));
        jsonWriter.name("colors");
        this.listOfRadialGradientColorDtoAdapter.toJson(jsonWriter, (JsonWriter) radialGradientDto2.getColors());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(RadialGradientDto)");
    }
}
