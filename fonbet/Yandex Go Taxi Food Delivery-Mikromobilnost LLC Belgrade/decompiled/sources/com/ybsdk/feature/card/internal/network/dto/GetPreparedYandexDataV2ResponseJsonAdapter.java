package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/GetPreparedYandexDataV2ResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/GetPreparedYandexDataV2Response;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/card/internal/network/dto/GetPreparedYandexDataV2ResponseStatus;", "getPreparedYandexDataV2ResponseStatusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/GetPreparedYandexDataV2SuccessDto;", "nullableGetPreparedYandexDataV2SuccessDtoAdapter", "Lcom/ybsdk/feature/card/internal/network/dto/GetPreparedYandexDataV2FailureDto;", "nullableGetPreparedYandexDataV2FailureDtoAdapter", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetPreparedYandexDataV2ResponseJsonAdapter extends JsonAdapter<GetPreparedYandexDataV2Response> {
    private final JsonAdapter<GetPreparedYandexDataV2ResponseStatus> getPreparedYandexDataV2ResponseStatusAdapter;
    private final JsonAdapter<GetPreparedYandexDataV2FailureDto> nullableGetPreparedYandexDataV2FailureDtoAdapter;
    private final JsonAdapter<GetPreparedYandexDataV2SuccessDto> nullableGetPreparedYandexDataV2SuccessDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(ACSPConstants.STATUS, Constants.KEY_DATA, "error");

    public GetPreparedYandexDataV2ResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.getPreparedYandexDataV2ResponseStatusAdapter = moshi.adapter(GetPreparedYandexDataV2ResponseStatus.class, emptySet, ACSPConstants.STATUS);
        this.nullableGetPreparedYandexDataV2SuccessDtoAdapter = moshi.adapter(GetPreparedYandexDataV2SuccessDto.class, emptySet, "successData");
        this.nullableGetPreparedYandexDataV2FailureDtoAdapter = moshi.adapter(GetPreparedYandexDataV2FailureDto.class, emptySet, "failureData");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetPreparedYandexDataV2Response fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        GetPreparedYandexDataV2ResponseStatus getPreparedYandexDataV2ResponseStatus = null;
        GetPreparedYandexDataV2SuccessDto getPreparedYandexDataV2SuccessDto = null;
        GetPreparedYandexDataV2FailureDto getPreparedYandexDataV2FailureDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                getPreparedYandexDataV2ResponseStatus = this.getPreparedYandexDataV2ResponseStatusAdapter.fromJson(jsonReader);
                if (getPreparedYandexDataV2ResponseStatus == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 1) {
                getPreparedYandexDataV2SuccessDto = this.nullableGetPreparedYandexDataV2SuccessDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                getPreparedYandexDataV2FailureDto = this.nullableGetPreparedYandexDataV2FailureDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (getPreparedYandexDataV2ResponseStatus != null) {
            return new GetPreparedYandexDataV2Response(getPreparedYandexDataV2ResponseStatus, getPreparedYandexDataV2SuccessDto, getPreparedYandexDataV2FailureDto);
        }
        throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetPreparedYandexDataV2Response getPreparedYandexDataV2Response) {
        GetPreparedYandexDataV2Response getPreparedYandexDataV2Response2 = getPreparedYandexDataV2Response;
        if (getPreparedYandexDataV2Response2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ACSPConstants.STATUS);
        this.getPreparedYandexDataV2ResponseStatusAdapter.toJson(jsonWriter, (JsonWriter) getPreparedYandexDataV2Response2.getStatus());
        jsonWriter.name(Constants.KEY_DATA);
        this.nullableGetPreparedYandexDataV2SuccessDtoAdapter.toJson(jsonWriter, (JsonWriter) getPreparedYandexDataV2Response2.getSuccessData());
        jsonWriter.name("error");
        this.nullableGetPreparedYandexDataV2FailureDtoAdapter.toJson(jsonWriter, (JsonWriter) getPreparedYandexDataV2Response2.getFailureData());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(53, "GeneratedJsonAdapter(GetPreparedYandexDataV2Response)");
    }
}
