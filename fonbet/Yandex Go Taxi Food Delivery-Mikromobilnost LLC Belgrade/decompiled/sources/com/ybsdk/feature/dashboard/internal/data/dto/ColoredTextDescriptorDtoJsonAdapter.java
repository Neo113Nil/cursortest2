package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.common.data.network.dto.cache.DataEntryDescriptorDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/ColoredTextDescriptorDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/ColoredTextDescriptorDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/cache/DataEntryDescriptorDto;", "dataEntryDescriptorDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "themesOfStringAdapter", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ColoredTextDescriptorDtoJsonAdapter extends JsonAdapter<ColoredTextDescriptorDto> {
    private final JsonAdapter<DataEntryDescriptorDto> dataEntryDescriptorDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("text", "color");
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public ColoredTextDescriptorDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.dataEntryDescriptorDtoAdapter = moshi.adapter(DataEntryDescriptorDto.class, emptySet, "text");
        this.themesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "color");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ColoredTextDescriptorDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        DataEntryDescriptorDto dataEntryDescriptorDto = null;
        Themes<String> themes = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                dataEntryDescriptorDto = this.dataEntryDescriptorDtoAdapter.fromJson(jsonReader);
                if (dataEntryDescriptorDto == null) {
                    throw Util.unexpectedNull("text", "text", jsonReader);
                }
            } else if (selectName == 1 && (themes = this.themesOfStringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("color", "color", jsonReader);
            }
        }
        jsonReader.endObject();
        if (dataEntryDescriptorDto == null) {
            throw Util.missingProperty("text", "text", jsonReader);
        }
        if (themes != null) {
            return new ColoredTextDescriptorDto(dataEntryDescriptorDto, themes);
        }
        throw Util.missingProperty("color", "color", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ColoredTextDescriptorDto coloredTextDescriptorDto) {
        ColoredTextDescriptorDto coloredTextDescriptorDto2 = coloredTextDescriptorDto;
        if (coloredTextDescriptorDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("text");
        this.dataEntryDescriptorDtoAdapter.toJson(jsonWriter, (JsonWriter) coloredTextDescriptorDto2.getText());
        jsonWriter.name("color");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) coloredTextDescriptorDto2.getColor());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(ColoredTextDescriptorDto)");
    }
}
