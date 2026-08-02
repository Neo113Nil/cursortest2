package com.ybsdk.feature.educations.api.data;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/educations/api/data/EducationsV2DtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/educations/api/data/EducationsV2Dto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "Lcom/ybsdk/feature/educations/api/data/EducationStepDto;", "listOfEducationStepDtoAdapter", "", "nullableIntAdapter", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EducationsV2DtoJsonAdapter extends JsonAdapter<EducationsV2Dto> {
    private final JsonAdapter<List<EducationStepDto>> listOfEducationStepDtoAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("name", "event_id", "defaults_group", "steps", "showing_delay");
    private final JsonAdapter<String> stringAdapter;

    public EducationsV2DtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "name");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "defaultsGroup");
        this.listOfEducationStepDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, EducationStepDto.class), emptySet, "steps");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "showingDelay");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final EducationsV2Dto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        List<EducationStepDto> list = null;
        Integer num = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("name", "name", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("eventId", "event_id", jsonReader);
                }
            } else if (selectName == 2) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                list = this.listOfEducationStepDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("steps", "steps", jsonReader);
                }
            } else if (selectName == 4) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("name", "name", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("eventId", "event_id", jsonReader);
        }
        if (list != null) {
            return new EducationsV2Dto(str, str2, str3, list, num);
        }
        throw Util.missingProperty("steps", "steps", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, EducationsV2Dto educationsV2Dto) {
        EducationsV2Dto educationsV2Dto2 = educationsV2Dto;
        if (educationsV2Dto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("name");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) educationsV2Dto2.getName());
        jsonWriter.name("event_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) educationsV2Dto2.getEventId());
        jsonWriter.name("defaults_group");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) educationsV2Dto2.getDefaultsGroup());
        jsonWriter.name("steps");
        this.listOfEducationStepDtoAdapter.toJson(jsonWriter, (JsonWriter) educationsV2Dto2.getSteps());
        jsonWriter.name("showing_delay");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) educationsV2Dto2.getShowingDelay());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(EducationsV2Dto)");
    }
}
