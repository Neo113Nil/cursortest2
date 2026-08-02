package com.ybsdk.feature.educations.api.data;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/educations/api/data/EducationDivKitContentDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/educations/api/data/EducationDivKitContentDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/educations/api/data/EducationsShadowDto;", "educationsShadowDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/educations/api/data/EducationDivkitContentPositionDto;", "educationDivkitContentPositionDtoAdapter", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "divDataDtoAdapter", "Lcom/ybsdk/feature/educations/api/data/EducationGlowDto;", "educationGlowDtoAdapter", "Lcom/ybsdk/feature/educations/api/data/EducationScrollBehaviourDto;", "nullableEducationScrollBehaviourDtoAdapter", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EducationDivKitContentDtoJsonAdapter extends JsonAdapter<EducationDivKitContentDto> {
    private final JsonAdapter<DivDataDto> divDataDtoAdapter;
    private final JsonAdapter<EducationDivkitContentPositionDto> educationDivkitContentPositionDtoAdapter;
    private final JsonAdapter<EducationGlowDto> educationGlowDtoAdapter;
    private final JsonAdapter<EducationsShadowDto> educationsShadowDtoAdapter;
    private final JsonAdapter<EducationScrollBehaviourDto> nullableEducationScrollBehaviourDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("shadow", "position", "divkit_data", "glow", "scroll_behaviour");

    public EducationDivKitContentDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.educationsShadowDtoAdapter = moshi.adapter(EducationsShadowDto.class, emptySet, "shadow");
        this.educationDivkitContentPositionDtoAdapter = moshi.adapter(EducationDivkitContentPositionDto.class, emptySet, "position");
        this.divDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "divkitData");
        this.educationGlowDtoAdapter = moshi.adapter(EducationGlowDto.class, emptySet, "glow");
        this.nullableEducationScrollBehaviourDtoAdapter = moshi.adapter(EducationScrollBehaviourDto.class, emptySet, "scrollBehaviour");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final EducationDivKitContentDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        EducationsShadowDto educationsShadowDto = null;
        EducationDivkitContentPositionDto educationDivkitContentPositionDto = null;
        DivDataDto divDataDto = null;
        EducationGlowDto educationGlowDto = null;
        EducationScrollBehaviourDto educationScrollBehaviourDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                educationsShadowDto = this.educationsShadowDtoAdapter.fromJson(jsonReader);
                if (educationsShadowDto == null) {
                    throw Util.unexpectedNull("shadow", "shadow", jsonReader);
                }
            } else if (selectName == 1) {
                educationDivkitContentPositionDto = this.educationDivkitContentPositionDtoAdapter.fromJson(jsonReader);
                if (educationDivkitContentPositionDto == null) {
                    throw Util.unexpectedNull("position", "position", jsonReader);
                }
            } else if (selectName == 2) {
                divDataDto = this.divDataDtoAdapter.fromJson(jsonReader);
                if (divDataDto == null) {
                    throw Util.unexpectedNull("divkitData", "divkit_data", jsonReader);
                }
            } else if (selectName == 3) {
                educationGlowDto = this.educationGlowDtoAdapter.fromJson(jsonReader);
                if (educationGlowDto == null) {
                    throw Util.unexpectedNull("glow", "glow", jsonReader);
                }
            } else if (selectName == 4) {
                educationScrollBehaviourDto = this.nullableEducationScrollBehaviourDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (educationsShadowDto == null) {
            throw Util.missingProperty("shadow", "shadow", jsonReader);
        }
        if (educationDivkitContentPositionDto == null) {
            throw Util.missingProperty("position", "position", jsonReader);
        }
        if (divDataDto == null) {
            throw Util.missingProperty("divkitData", "divkit_data", jsonReader);
        }
        if (educationGlowDto != null) {
            return new EducationDivKitContentDto(educationsShadowDto, educationDivkitContentPositionDto, divDataDto, educationGlowDto, educationScrollBehaviourDto);
        }
        throw Util.missingProperty("glow", "glow", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, EducationDivKitContentDto educationDivKitContentDto) {
        EducationDivKitContentDto educationDivKitContentDto2 = educationDivKitContentDto;
        if (educationDivKitContentDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("shadow");
        this.educationsShadowDtoAdapter.toJson(jsonWriter, (JsonWriter) educationDivKitContentDto2.getShadow());
        jsonWriter.name("position");
        this.educationDivkitContentPositionDtoAdapter.toJson(jsonWriter, (JsonWriter) educationDivKitContentDto2.getPosition());
        jsonWriter.name("divkit_data");
        this.divDataDtoAdapter.toJson(jsonWriter, (JsonWriter) educationDivKitContentDto2.getDivkitData());
        jsonWriter.name("glow");
        this.educationGlowDtoAdapter.toJson(jsonWriter, (JsonWriter) educationDivKitContentDto2.getGlow());
        jsonWriter.name("scroll_behaviour");
        this.nullableEducationScrollBehaviourDtoAdapter.toJson(jsonWriter, (JsonWriter) educationDivKitContentDto2.getScrollBehaviour());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(EducationDivKitContentDto)");
    }
}
