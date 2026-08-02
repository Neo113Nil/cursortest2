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

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/educations/api/data/EducationStepDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/educations/api/data/EducationStepDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/educations/api/data/ContentType;", "contentTypeAdapter", "Lcom/ybsdk/feature/educations/api/data/EducationTooltipContentDto;", "nullableEducationTooltipContentDtoAdapter", "Lcom/ybsdk/feature/educations/api/data/EducationDivKitContentDto;", "nullableEducationDivKitContentDtoAdapter", "Lcom/ybsdk/feature/educations/api/data/EducationFullscreenContentDto;", "nullableEducationFullscreenContentDtoAdapter", "Lcom/ybsdk/feature/educations/api/data/EducationVideoContentDto;", "nullableEducationVideoContentDtoAdapter", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EducationStepDtoJsonAdapter extends JsonAdapter<EducationStepDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<ContentType> contentTypeAdapter;
    private final JsonAdapter<EducationDivKitContentDto> nullableEducationDivKitContentDtoAdapter;
    private final JsonAdapter<EducationFullscreenContentDto> nullableEducationFullscreenContentDtoAdapter;
    private final JsonAdapter<EducationTooltipContentDto> nullableEducationTooltipContentDtoAdapter;
    private final JsonAdapter<EducationVideoContentDto> nullableEducationVideoContentDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("show_cross", "content_type", "tooltip_content", "divkit_content", "fullscreen_content", "video_content");

    public EducationStepDtoJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, "showCross");
        this.contentTypeAdapter = moshi.adapter(ContentType.class, emptySet, "contentType");
        this.nullableEducationTooltipContentDtoAdapter = moshi.adapter(EducationTooltipContentDto.class, emptySet, "tooltipContent");
        this.nullableEducationDivKitContentDtoAdapter = moshi.adapter(EducationDivKitContentDto.class, emptySet, "divkitContent");
        this.nullableEducationFullscreenContentDtoAdapter = moshi.adapter(EducationFullscreenContentDto.class, emptySet, "fullscreenContent");
        this.nullableEducationVideoContentDtoAdapter = moshi.adapter(EducationVideoContentDto.class, emptySet, "videoContent");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final EducationStepDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        ContentType contentType = null;
        EducationTooltipContentDto educationTooltipContentDto = null;
        EducationDivKitContentDto educationDivKitContentDto = null;
        EducationFullscreenContentDto educationFullscreenContentDto = null;
        EducationVideoContentDto educationVideoContentDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("showCross", "show_cross", jsonReader);
                    }
                    break;
                case 1:
                    contentType = this.contentTypeAdapter.fromJson(jsonReader);
                    if (contentType == null) {
                        throw Util.unexpectedNull("contentType", "content_type", jsonReader);
                    }
                    break;
                case 2:
                    educationTooltipContentDto = this.nullableEducationTooltipContentDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    educationDivKitContentDto = this.nullableEducationDivKitContentDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    educationFullscreenContentDto = this.nullableEducationFullscreenContentDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    educationVideoContentDto = this.nullableEducationVideoContentDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (bool == null) {
            throw Util.missingProperty("showCross", "show_cross", jsonReader);
        }
        boolean booleanValue = bool.booleanValue();
        if (contentType != null) {
            return new EducationStepDto(booleanValue, contentType, educationTooltipContentDto, educationDivKitContentDto, educationFullscreenContentDto, educationVideoContentDto);
        }
        throw Util.missingProperty("contentType", "content_type", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, EducationStepDto educationStepDto) {
        EducationStepDto educationStepDto2 = educationStepDto;
        if (educationStepDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("show_cross");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(educationStepDto2.getShowCross()));
        jsonWriter.name("content_type");
        this.contentTypeAdapter.toJson(jsonWriter, (JsonWriter) educationStepDto2.getContentType());
        jsonWriter.name("tooltip_content");
        this.nullableEducationTooltipContentDtoAdapter.toJson(jsonWriter, (JsonWriter) educationStepDto2.getTooltipContent());
        jsonWriter.name("divkit_content");
        this.nullableEducationDivKitContentDtoAdapter.toJson(jsonWriter, (JsonWriter) educationStepDto2.getDivkitContent());
        jsonWriter.name("fullscreen_content");
        this.nullableEducationFullscreenContentDtoAdapter.toJson(jsonWriter, (JsonWriter) educationStepDto2.getFullscreenContent());
        jsonWriter.name("video_content");
        this.nullableEducationVideoContentDtoAdapter.toJson(jsonWriter, (JsonWriter) educationStepDto2.getVideoContent());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(EducationStepDto)");
    }
}
