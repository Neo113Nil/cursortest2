package com.ybsdk.feature.educations.api.data;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.educations.api.data.EducationsShadowDrawRuleDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/educations/api/data/EducationsShadowDrawRuleDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/educations/api/data/EducationsShadowDrawRuleDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/educations/api/data/EducationsShadowDrawRuleDto$EducationsShadowDrawRuleType;", "educationsShadowDrawRuleTypeAdapter", "", "nullableIntAdapter", "Lcom/ybsdk/feature/educations/api/data/MarginsDto;", "nullableMarginsDtoAdapter", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EducationsShadowDrawRuleDtoJsonAdapter extends JsonAdapter<EducationsShadowDrawRuleDto> {
    private final JsonAdapter<EducationsShadowDrawRuleDto.EducationsShadowDrawRuleType> educationsShadowDrawRuleTypeAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<MarginsDto> nullableMarginsDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("view_id", "draw_type", "corner_radius", "margins");
    private final JsonAdapter<String> stringAdapter;

    public EducationsShadowDrawRuleDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "viewId");
        this.educationsShadowDrawRuleTypeAdapter = moshi.adapter(EducationsShadowDrawRuleDto.EducationsShadowDrawRuleType.class, emptySet, "drawType");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "cornersRadius");
        this.nullableMarginsDtoAdapter = moshi.adapter(MarginsDto.class, emptySet, "margins");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final EducationsShadowDrawRuleDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        EducationsShadowDrawRuleDto.EducationsShadowDrawRuleType educationsShadowDrawRuleType = null;
        Integer num = null;
        MarginsDto marginsDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("viewId", "view_id", jsonReader);
                }
            } else if (selectName == 1) {
                educationsShadowDrawRuleType = this.educationsShadowDrawRuleTypeAdapter.fromJson(jsonReader);
                if (educationsShadowDrawRuleType == null) {
                    throw Util.unexpectedNull("drawType", "draw_type", jsonReader);
                }
            } else if (selectName == 2) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                marginsDto = this.nullableMarginsDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("viewId", "view_id", jsonReader);
        }
        if (educationsShadowDrawRuleType != null) {
            return new EducationsShadowDrawRuleDto(str, educationsShadowDrawRuleType, num, marginsDto);
        }
        throw Util.missingProperty("drawType", "draw_type", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, EducationsShadowDrawRuleDto educationsShadowDrawRuleDto) {
        EducationsShadowDrawRuleDto educationsShadowDrawRuleDto2 = educationsShadowDrawRuleDto;
        if (educationsShadowDrawRuleDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("view_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) educationsShadowDrawRuleDto2.getViewId());
        jsonWriter.name("draw_type");
        this.educationsShadowDrawRuleTypeAdapter.toJson(jsonWriter, (JsonWriter) educationsShadowDrawRuleDto2.getDrawType());
        jsonWriter.name("corner_radius");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) educationsShadowDrawRuleDto2.getCornersRadius());
        jsonWriter.name("margins");
        this.nullableMarginsDtoAdapter.toJson(jsonWriter, (JsonWriter) educationsShadowDrawRuleDto2.getMargins());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(EducationsShadowDrawRuleDto)");
    }
}
