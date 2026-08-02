package com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.search;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.StatusInfoDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/search/StartChargeSearchResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/search/StartChargeSearchResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/StatusInfoDto;", "statusInfoDtoAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StartChargeSearchResponseJsonAdapter extends JsonAdapter<StartChargeSearchResponse> {
    private final JsonReader.Options options = JsonReader.Options.of("request_id", "processing_info", "timeout_info");
    private final JsonAdapter<StatusInfoDto> statusInfoDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public StartChargeSearchResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "requestId");
        this.statusInfoDtoAdapter = moshi.adapter(StatusInfoDto.class, emptySet, "processingInfo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final StartChargeSearchResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        StatusInfoDto statusInfoDto = null;
        StatusInfoDto statusInfoDto2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("requestId", "request_id", jsonReader);
                }
            } else if (selectName == 1) {
                statusInfoDto = this.statusInfoDtoAdapter.fromJson(jsonReader);
                if (statusInfoDto == null) {
                    throw Util.unexpectedNull("processingInfo", "processing_info", jsonReader);
                }
            } else if (selectName == 2 && (statusInfoDto2 = this.statusInfoDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("timeoutInfo", "timeout_info", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("requestId", "request_id", jsonReader);
        }
        if (statusInfoDto == null) {
            throw Util.missingProperty("processingInfo", "processing_info", jsonReader);
        }
        if (statusInfoDto2 != null) {
            return new StartChargeSearchResponse(str, statusInfoDto, statusInfoDto2);
        }
        throw Util.missingProperty("timeoutInfo", "timeout_info", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, StartChargeSearchResponse startChargeSearchResponse) {
        StartChargeSearchResponse startChargeSearchResponse2 = startChargeSearchResponse;
        if (startChargeSearchResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("request_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) startChargeSearchResponse2.getRequestId());
        jsonWriter.name("processing_info");
        this.statusInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) startChargeSearchResponse2.getProcessingInfo());
        jsonWriter.name("timeout_info");
        this.statusInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) startChargeSearchResponse2.getTimeoutInfo());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(StartChargeSearchResponse)");
    }
}
