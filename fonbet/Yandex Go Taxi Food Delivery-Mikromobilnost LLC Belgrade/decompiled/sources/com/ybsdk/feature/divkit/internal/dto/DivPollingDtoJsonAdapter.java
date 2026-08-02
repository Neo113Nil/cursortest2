package com.ybsdk.feature.divkit.internal.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.utils.dto.FailDataResponse;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/dto/DivPollingDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/divkit/internal/dto/DivPollingDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/divkit/internal/dto/ResponseStatus;", "responseStatusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/divkit/internal/dto/DivPatchDto;", "nullableDivPatchDtoAdapter", "Lcom/ybsdk/core/utils/dto/FailDataResponse;", "nullableFailDataResponseAdapter", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DivPollingDtoJsonAdapter extends JsonAdapter<DivPollingDto> {
    private final JsonAdapter<DivPatchDto> nullableDivPatchDtoAdapter;
    private final JsonAdapter<FailDataResponse> nullableFailDataResponseAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(ACSPConstants.STATUS, "success_data", "in_progress_data", "fail_data");
    private final JsonAdapter<ResponseStatus> responseStatusAdapter;

    public DivPollingDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.responseStatusAdapter = moshi.adapter(ResponseStatus.class, emptySet, ACSPConstants.STATUS);
        this.nullableDivPatchDtoAdapter = moshi.adapter(DivPatchDto.class, emptySet, "successData");
        this.nullableFailDataResponseAdapter = moshi.adapter(FailDataResponse.class, emptySet, "failData");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DivPollingDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ResponseStatus responseStatus = null;
        DivPatchDto divPatchDto = null;
        DivPatchDto divPatchDto2 = null;
        FailDataResponse failDataResponse = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                responseStatus = this.responseStatusAdapter.fromJson(jsonReader);
                if (responseStatus == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 1) {
                divPatchDto = this.nullableDivPatchDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                divPatchDto2 = this.nullableDivPatchDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                failDataResponse = this.nullableFailDataResponseAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (responseStatus != null) {
            return new DivPollingDto(responseStatus, divPatchDto, divPatchDto2, failDataResponse);
        }
        throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DivPollingDto divPollingDto) {
        DivPollingDto divPollingDto2 = divPollingDto;
        if (divPollingDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ACSPConstants.STATUS);
        this.responseStatusAdapter.toJson(jsonWriter, (JsonWriter) divPollingDto2.getStatus());
        jsonWriter.name("success_data");
        this.nullableDivPatchDtoAdapter.toJson(jsonWriter, (JsonWriter) divPollingDto2.getSuccessData());
        jsonWriter.name("in_progress_data");
        this.nullableDivPatchDtoAdapter.toJson(jsonWriter, (JsonWriter) divPollingDto2.getInProgressData());
        jsonWriter.name("fail_data");
        this.nullableFailDataResponseAdapter.toJson(jsonWriter, (JsonWriter) divPollingDto2.getFailData());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(35, "GeneratedJsonAdapter(DivPollingDto)");
    }
}
