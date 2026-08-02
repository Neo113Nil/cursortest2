package com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.search;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.StatusInfoDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.search.GetStatusChargeSearchResponse;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/search/GetStatusChargeSearchResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/search/GetStatusChargeSearchResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/search/GetStatusChargeSearchResponse$Status;", "statusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/StatusInfoDto;", "nullableStatusInfoDtoAdapter", "", "nullableStringAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetStatusChargeSearchResponseJsonAdapter extends JsonAdapter<GetStatusChargeSearchResponse> {
    private final JsonAdapter<StatusInfoDto> nullableStatusInfoDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(ACSPConstants.STATUS, "status_info", "action");
    private final JsonAdapter<GetStatusChargeSearchResponse.Status> statusAdapter;

    public GetStatusChargeSearchResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.statusAdapter = moshi.adapter(GetStatusChargeSearchResponse.Status.class, emptySet, ACSPConstants.STATUS);
        this.nullableStatusInfoDtoAdapter = moshi.adapter(StatusInfoDto.class, emptySet, "statusInfo");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "action");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetStatusChargeSearchResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        GetStatusChargeSearchResponse.Status status = null;
        StatusInfoDto statusInfoDto = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                status = this.statusAdapter.fromJson(jsonReader);
                if (status == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 1) {
                statusInfoDto = this.nullableStatusInfoDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (status != null) {
            return new GetStatusChargeSearchResponse(status, statusInfoDto, str);
        }
        throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetStatusChargeSearchResponse getStatusChargeSearchResponse) {
        GetStatusChargeSearchResponse getStatusChargeSearchResponse2 = getStatusChargeSearchResponse;
        if (getStatusChargeSearchResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ACSPConstants.STATUS);
        this.statusAdapter.toJson(jsonWriter, (JsonWriter) getStatusChargeSearchResponse2.getStatus());
        jsonWriter.name("status_info");
        this.nullableStatusInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) getStatusChargeSearchResponse2.getStatusInfo());
        jsonWriter.name("action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) getStatusChargeSearchResponse2.getAction());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(51, "GeneratedJsonAdapter(GetStatusChargeSearchResponse)");
    }
}
