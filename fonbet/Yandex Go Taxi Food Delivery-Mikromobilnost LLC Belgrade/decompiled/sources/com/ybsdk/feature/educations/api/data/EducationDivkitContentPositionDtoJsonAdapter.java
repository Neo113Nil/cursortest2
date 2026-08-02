package com.ybsdk.feature.educations.api.data;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/educations/api/data/EducationDivkitContentPositionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/educations/api/data/EducationDivkitContentPositionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/educations/api/data/EducationDivkitContentPosition;", "educationDivkitContentPositionAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EducationDivkitContentPositionDtoJsonAdapter extends JsonAdapter<EducationDivkitContentPositionDto> {
    private final JsonAdapter<EducationDivkitContentPosition> educationDivkitContentPositionAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("type", "view_id");

    public EducationDivkitContentPositionDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.educationDivkitContentPositionAdapter = moshi.adapter(EducationDivkitContentPosition.class, emptySet, "type");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "viewId");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final EducationDivkitContentPositionDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        EducationDivkitContentPosition educationDivkitContentPosition = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                educationDivkitContentPosition = this.educationDivkitContentPositionAdapter.fromJson(jsonReader);
                if (educationDivkitContentPosition == null) {
                    throw Util.unexpectedNull("type", "type", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (educationDivkitContentPosition != null) {
            return new EducationDivkitContentPositionDto(educationDivkitContentPosition, str);
        }
        throw Util.missingProperty("type", "type", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, EducationDivkitContentPositionDto educationDivkitContentPositionDto) {
        EducationDivkitContentPositionDto educationDivkitContentPositionDto2 = educationDivkitContentPositionDto;
        if (educationDivkitContentPositionDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.educationDivkitContentPositionAdapter.toJson(jsonWriter, (JsonWriter) educationDivkitContentPositionDto2.getType());
        jsonWriter.name("view_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) educationDivkitContentPositionDto2.getViewId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(55, "GeneratedJsonAdapter(EducationDivkitContentPositionDto)");
    }
}
