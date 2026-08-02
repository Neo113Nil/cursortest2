package com.ybsdk.feature.banners.api.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/banners/api/dto/FullScreenDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/banners/api/dto/FullScreenDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableBooleanAdapter", "feature-banners-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FullScreenDtoJsonAdapter extends JsonAdapter<FullScreenDto> {
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("event_id", "name", "url", "is_markable", "drop_sessions_without_fullscreens_on_show");
    private final JsonAdapter<String> stringAdapter;

    public FullScreenDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "name");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "isMarkable");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final FullScreenDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("id", "event_id", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                str3 = this.stringAdapter.fromJson(jsonReader);
                if (str3 == null) {
                    throw Util.unexpectedNull("action", "url", jsonReader);
                }
            } else if (selectName == 3) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                bool2 = this.nullableBooleanAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("id", "event_id", jsonReader);
        }
        if (str3 != null) {
            return new FullScreenDto(str, str2, str3, bool, bool2);
        }
        throw Util.missingProperty("action", "url", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, FullScreenDto fullScreenDto) {
        FullScreenDto fullScreenDto2 = fullScreenDto;
        if (fullScreenDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("event_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fullScreenDto2.getId());
        jsonWriter.name("name");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) fullScreenDto2.getName());
        jsonWriter.name("url");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fullScreenDto2.getAction());
        jsonWriter.name("is_markable");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) fullScreenDto2.isMarkable());
        jsonWriter.name("drop_sessions_without_fullscreens_on_show");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) fullScreenDto2.getDropSessionsWithoutFullscreensOnShow());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(35, "GeneratedJsonAdapter(FullScreenDto)");
    }
}
