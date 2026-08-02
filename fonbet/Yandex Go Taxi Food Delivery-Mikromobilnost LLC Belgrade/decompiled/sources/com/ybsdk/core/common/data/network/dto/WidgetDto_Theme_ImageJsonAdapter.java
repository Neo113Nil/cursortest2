package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.WidgetDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/WidgetDto_Theme_ImageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$Image;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$Image$Type;", "typeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WidgetDto_Theme_ImageJsonAdapter extends JsonAdapter<WidgetDto.Theme.Image> {
    private final JsonReader.Options options = JsonReader.Options.of("size_type", "url");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<WidgetDto.Theme.Image.Type> typeAdapter;

    public WidgetDto_Theme_ImageJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.typeAdapter = moshi.adapter(WidgetDto.Theme.Image.Type.class, emptySet, "type");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "url");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final WidgetDto.Theme.Image fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        WidgetDto.Theme.Image.Type type = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                type = this.typeAdapter.fromJson(jsonReader);
                if (type == null) {
                    throw Util.unexpectedNull("type", "size_type", jsonReader);
                }
            } else if (selectName == 1 && (str = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("url", "url", jsonReader);
            }
        }
        jsonReader.endObject();
        if (type == null) {
            throw Util.missingProperty("type", "size_type", jsonReader);
        }
        if (str != null) {
            return new WidgetDto.Theme.Image(type, str);
        }
        throw Util.missingProperty("url", "url", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, WidgetDto.Theme.Image image) {
        WidgetDto.Theme.Image image2 = image;
        if (image2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("size_type");
        this.typeAdapter.toJson(jsonWriter, (JsonWriter) image2.getType());
        jsonWriter.name("url");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) image2.getUrl());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(WidgetDto.Theme.Image)");
    }
}
