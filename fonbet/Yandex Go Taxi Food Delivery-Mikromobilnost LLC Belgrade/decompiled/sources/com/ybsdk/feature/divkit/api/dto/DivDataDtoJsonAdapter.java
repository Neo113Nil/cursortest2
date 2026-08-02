package com.ybsdk.feature.divkit.api.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.ybsdk.core.common.data.network.adapters.RawJsonString;
import defpackage.ny61;
import defpackage.uw51;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/feature/divkit/api/dto/DivDataDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAtRawJsonStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DivDataDtoJsonAdapter extends JsonAdapter<DivDataDto> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<String> nullableStringAtRawJsonStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("card", "palette", "templates", "hash");

    public DivDataDtoJsonAdapter(Moshi moshi) {
        this.nullableStringAtRawJsonStringAdapter = moshi.adapter(String.class, Collections.singleton(new RawJsonString() { // from class: com.ybsdk.feature.divkit.api.dto.DivDataDtoJsonAdapter.a
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return RawJsonString.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof RawJsonString;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return "@com.ybsdk.core.common.data.network.adapters.RawJsonString()";
            }
        }), "card");
        this.nullableStringAdapter = moshi.adapter(String.class, EmptySet.a, "hash");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DivDataDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.nullableStringAtRawJsonStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                str2 = this.nullableStringAtRawJsonStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                str3 = this.nullableStringAtRawJsonStringAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                str4 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new DivDataDto(str, str2, str3, str4);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DivDataDto divDataDto) {
        DivDataDto divDataDto2 = divDataDto;
        if (divDataDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("card");
        this.nullableStringAtRawJsonStringAdapter.toJson(jsonWriter, (JsonWriter) divDataDto2.getCard());
        jsonWriter.name("palette");
        this.nullableStringAtRawJsonStringAdapter.toJson(jsonWriter, (JsonWriter) divDataDto2.getPalette());
        jsonWriter.name("templates");
        this.nullableStringAtRawJsonStringAdapter.toJson(jsonWriter, (JsonWriter) divDataDto2.getTemplates());
        jsonWriter.name("hash");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) divDataDto2.getHash());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(32, "GeneratedJsonAdapter(DivDataDto)");
    }
}
