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

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/educations/api/data/EducationScrollBehaviourDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/educations/api/data/EducationScrollBehaviourDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/educations/api/data/EducationScrollType;", "educationScrollTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/educations/api/data/EducationScrollToScreenEdgeDto;", "nullableEducationScrollToScreenEdgeDtoAdapter", "Lcom/ybsdk/feature/educations/api/data/EducationScrollToScreenItemDto;", "nullableEducationScrollToScreenItemDtoAdapter", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EducationScrollBehaviourDtoJsonAdapter extends JsonAdapter<EducationScrollBehaviourDto> {
    private final JsonAdapter<EducationScrollType> educationScrollTypeAdapter;
    private final JsonAdapter<EducationScrollToScreenEdgeDto> nullableEducationScrollToScreenEdgeDtoAdapter;
    private final JsonAdapter<EducationScrollToScreenItemDto> nullableEducationScrollToScreenItemDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("scroll_type", "scroll_to_screen_edge", "scroll_to_screen_item");

    public EducationScrollBehaviourDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.educationScrollTypeAdapter = moshi.adapter(EducationScrollType.class, emptySet, "scrollType");
        this.nullableEducationScrollToScreenEdgeDtoAdapter = moshi.adapter(EducationScrollToScreenEdgeDto.class, emptySet, "scrollToScreenEdge");
        this.nullableEducationScrollToScreenItemDtoAdapter = moshi.adapter(EducationScrollToScreenItemDto.class, emptySet, "scrollToScreenItem");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final EducationScrollBehaviourDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        EducationScrollType educationScrollType = null;
        EducationScrollToScreenEdgeDto educationScrollToScreenEdgeDto = null;
        EducationScrollToScreenItemDto educationScrollToScreenItemDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                educationScrollType = this.educationScrollTypeAdapter.fromJson(jsonReader);
                if (educationScrollType == null) {
                    throw Util.unexpectedNull("scrollType", "scroll_type", jsonReader);
                }
            } else if (selectName == 1) {
                educationScrollToScreenEdgeDto = this.nullableEducationScrollToScreenEdgeDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                educationScrollToScreenItemDto = this.nullableEducationScrollToScreenItemDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (educationScrollType != null) {
            return new EducationScrollBehaviourDto(educationScrollType, educationScrollToScreenEdgeDto, educationScrollToScreenItemDto);
        }
        throw Util.missingProperty("scrollType", "scroll_type", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, EducationScrollBehaviourDto educationScrollBehaviourDto) {
        EducationScrollBehaviourDto educationScrollBehaviourDto2 = educationScrollBehaviourDto;
        if (educationScrollBehaviourDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("scroll_type");
        this.educationScrollTypeAdapter.toJson(jsonWriter, (JsonWriter) educationScrollBehaviourDto2.getScrollType());
        jsonWriter.name("scroll_to_screen_edge");
        this.nullableEducationScrollToScreenEdgeDtoAdapter.toJson(jsonWriter, (JsonWriter) educationScrollBehaviourDto2.getScrollToScreenEdge());
        jsonWriter.name("scroll_to_screen_item");
        this.nullableEducationScrollToScreenItemDtoAdapter.toJson(jsonWriter, (JsonWriter) educationScrollBehaviourDto2.getScrollToScreenItem());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(EducationScrollBehaviourDto)");
    }
}
