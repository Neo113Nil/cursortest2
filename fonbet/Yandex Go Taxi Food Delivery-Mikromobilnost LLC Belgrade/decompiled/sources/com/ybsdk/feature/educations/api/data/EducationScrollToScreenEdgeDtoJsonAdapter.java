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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/educations/api/data/EducationScrollToScreenEdgeDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/educations/api/data/EducationScrollToScreenEdgeDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/educations/api/data/EducationScrollScreenEdge;", "educationScrollScreenEdgeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EducationScrollToScreenEdgeDtoJsonAdapter extends JsonAdapter<EducationScrollToScreenEdgeDto> {
    private final JsonAdapter<EducationScrollScreenEdge> educationScrollScreenEdgeAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("screen_edge");

    public EducationScrollToScreenEdgeDtoJsonAdapter(Moshi moshi) {
        this.educationScrollScreenEdgeAdapter = moshi.adapter(EducationScrollScreenEdge.class, EmptySet.a, "screenEdge");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final EducationScrollToScreenEdgeDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        EducationScrollScreenEdge educationScrollScreenEdge = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (educationScrollScreenEdge = this.educationScrollScreenEdgeAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("screenEdge", "screen_edge", jsonReader);
            }
        }
        jsonReader.endObject();
        if (educationScrollScreenEdge != null) {
            return new EducationScrollToScreenEdgeDto(educationScrollScreenEdge);
        }
        throw Util.missingProperty("screenEdge", "screen_edge", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, EducationScrollToScreenEdgeDto educationScrollToScreenEdgeDto) {
        EducationScrollToScreenEdgeDto educationScrollToScreenEdgeDto2 = educationScrollToScreenEdgeDto;
        if (educationScrollToScreenEdgeDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("screen_edge");
        this.educationScrollScreenEdgeAdapter.toJson(jsonWriter, (JsonWriter) educationScrollToScreenEdgeDto2.getScreenEdge());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(52, "GeneratedJsonAdapter(EducationScrollToScreenEdgeDto)");
    }
}
