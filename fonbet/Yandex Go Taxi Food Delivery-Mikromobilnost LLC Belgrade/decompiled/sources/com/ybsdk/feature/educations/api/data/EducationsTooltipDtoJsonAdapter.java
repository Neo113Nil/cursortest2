package com.ybsdk.feature.educations.api.data;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.educations.api.data.EducationsTooltipDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/educations/api/data/EducationsTooltipDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/educations/api/data/EducationsTooltipDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/educations/api/data/EducationsTooltipAnchorDto;", "educationsTooltipAnchorDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/educations/api/data/EducationsTooltipDto$EducationsTooltipBehaviour;", "educationsTooltipBehaviourAdapter", "Lcom/ybsdk/feature/educations/api/data/EducationsTooltipDto$EducationsTooltipAlignment;", "educationsTooltipAlignmentAdapter", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "divDataDtoAdapter", "", "intAdapter", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EducationsTooltipDtoJsonAdapter extends JsonAdapter<EducationsTooltipDto> {
    private final JsonAdapter<DivDataDto> divDataDtoAdapter;
    private final JsonAdapter<EducationsTooltipDto.EducationsTooltipAlignment> educationsTooltipAlignmentAdapter;
    private final JsonAdapter<EducationsTooltipAnchorDto> educationsTooltipAnchorDtoAdapter;
    private final JsonAdapter<EducationsTooltipDto.EducationsTooltipBehaviour> educationsTooltipBehaviourAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("anchor", "behaviour", "alignment", "divkit_data", "margin");

    public EducationsTooltipDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.educationsTooltipAnchorDtoAdapter = moshi.adapter(EducationsTooltipAnchorDto.class, emptySet, "anchor");
        this.educationsTooltipBehaviourAdapter = moshi.adapter(EducationsTooltipDto.EducationsTooltipBehaviour.class, emptySet, "behaviour");
        this.educationsTooltipAlignmentAdapter = moshi.adapter(EducationsTooltipDto.EducationsTooltipAlignment.class, emptySet, "alignment");
        this.divDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "divkitData");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "margin");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final EducationsTooltipDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        EducationsTooltipAnchorDto educationsTooltipAnchorDto = null;
        EducationsTooltipDto.EducationsTooltipBehaviour educationsTooltipBehaviour = null;
        EducationsTooltipDto.EducationsTooltipAlignment educationsTooltipAlignment = null;
        DivDataDto divDataDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                educationsTooltipAnchorDto = this.educationsTooltipAnchorDtoAdapter.fromJson(jsonReader);
                if (educationsTooltipAnchorDto == null) {
                    throw Util.unexpectedNull("anchor", "anchor", jsonReader);
                }
            } else if (selectName == 1) {
                educationsTooltipBehaviour = this.educationsTooltipBehaviourAdapter.fromJson(jsonReader);
                if (educationsTooltipBehaviour == null) {
                    throw Util.unexpectedNull("behaviour", "behaviour", jsonReader);
                }
            } else if (selectName == 2) {
                educationsTooltipAlignment = this.educationsTooltipAlignmentAdapter.fromJson(jsonReader);
                if (educationsTooltipAlignment == null) {
                    throw Util.unexpectedNull("alignment", "alignment", jsonReader);
                }
            } else if (selectName == 3) {
                divDataDto = this.divDataDtoAdapter.fromJson(jsonReader);
                if (divDataDto == null) {
                    throw Util.unexpectedNull("divkitData", "divkit_data", jsonReader);
                }
            } else if (selectName == 4 && (num = this.intAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("margin", "margin", jsonReader);
            }
        }
        jsonReader.endObject();
        if (educationsTooltipAnchorDto == null) {
            throw Util.missingProperty("anchor", "anchor", jsonReader);
        }
        if (educationsTooltipBehaviour == null) {
            throw Util.missingProperty("behaviour", "behaviour", jsonReader);
        }
        if (educationsTooltipAlignment == null) {
            throw Util.missingProperty("alignment", "alignment", jsonReader);
        }
        if (divDataDto == null) {
            throw Util.missingProperty("divkitData", "divkit_data", jsonReader);
        }
        if (num != null) {
            return new EducationsTooltipDto(educationsTooltipAnchorDto, educationsTooltipBehaviour, educationsTooltipAlignment, divDataDto, num.intValue());
        }
        throw Util.missingProperty("margin", "margin", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, EducationsTooltipDto educationsTooltipDto) {
        EducationsTooltipDto educationsTooltipDto2 = educationsTooltipDto;
        if (educationsTooltipDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("anchor");
        this.educationsTooltipAnchorDtoAdapter.toJson(jsonWriter, (JsonWriter) educationsTooltipDto2.getAnchor());
        jsonWriter.name("behaviour");
        this.educationsTooltipBehaviourAdapter.toJson(jsonWriter, (JsonWriter) educationsTooltipDto2.getBehaviour());
        jsonWriter.name("alignment");
        this.educationsTooltipAlignmentAdapter.toJson(jsonWriter, (JsonWriter) educationsTooltipDto2.getAlignment());
        jsonWriter.name("divkit_data");
        this.divDataDtoAdapter.toJson(jsonWriter, (JsonWriter) educationsTooltipDto2.getDivkitData());
        jsonWriter.name("margin");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(educationsTooltipDto2.getMargin()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(EducationsTooltipDto)");
    }
}
