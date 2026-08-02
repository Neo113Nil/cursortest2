package com.ybsdk.feature.qr.payments.internal.network.v2.dto.check;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.payment.common.result.ResultType;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/ResultPageDataDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/ResultPageDataDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/ResultPageLoadingDataDto;", "resultPageLoadingDataDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/StatusPageDataDto;", "statusPageDataDtoAdapter", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ResultPageDataDtoJsonAdapter extends JsonAdapter<ResultPageDataDto> {
    private final JsonReader.Options options = JsonReader.Options.of(ResultType.RESULT_TYPE_LOADING, "timeout", "error");
    private final JsonAdapter<ResultPageLoadingDataDto> resultPageLoadingDataDtoAdapter;
    private final JsonAdapter<StatusPageDataDto> statusPageDataDtoAdapter;

    public ResultPageDataDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.resultPageLoadingDataDtoAdapter = moshi.adapter(ResultPageLoadingDataDto.class, emptySet, ResultType.RESULT_TYPE_LOADING);
        this.statusPageDataDtoAdapter = moshi.adapter(StatusPageDataDto.class, emptySet, "timeout");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ResultPageDataDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ResultPageLoadingDataDto resultPageLoadingDataDto = null;
        StatusPageDataDto statusPageDataDto = null;
        StatusPageDataDto statusPageDataDto2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                resultPageLoadingDataDto = this.resultPageLoadingDataDtoAdapter.fromJson(jsonReader);
                if (resultPageLoadingDataDto == null) {
                    throw Util.unexpectedNull(ResultType.RESULT_TYPE_LOADING, ResultType.RESULT_TYPE_LOADING, jsonReader);
                }
            } else if (selectName == 1) {
                statusPageDataDto = this.statusPageDataDtoAdapter.fromJson(jsonReader);
                if (statusPageDataDto == null) {
                    throw Util.unexpectedNull("timeout", "timeout", jsonReader);
                }
            } else if (selectName == 2 && (statusPageDataDto2 = this.statusPageDataDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("error", "error", jsonReader);
            }
        }
        jsonReader.endObject();
        if (resultPageLoadingDataDto == null) {
            throw Util.missingProperty(ResultType.RESULT_TYPE_LOADING, ResultType.RESULT_TYPE_LOADING, jsonReader);
        }
        if (statusPageDataDto == null) {
            throw Util.missingProperty("timeout", "timeout", jsonReader);
        }
        if (statusPageDataDto2 != null) {
            return new ResultPageDataDto(resultPageLoadingDataDto, statusPageDataDto, statusPageDataDto2);
        }
        throw Util.missingProperty("error", "error", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ResultPageDataDto resultPageDataDto) {
        ResultPageDataDto resultPageDataDto2 = resultPageDataDto;
        if (resultPageDataDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ResultType.RESULT_TYPE_LOADING);
        this.resultPageLoadingDataDtoAdapter.toJson(jsonWriter, (JsonWriter) resultPageDataDto2.getLoading());
        jsonWriter.name("timeout");
        this.statusPageDataDtoAdapter.toJson(jsonWriter, (JsonWriter) resultPageDataDto2.getTimeout());
        jsonWriter.name("error");
        this.statusPageDataDtoAdapter.toJson(jsonWriter, (JsonWriter) resultPageDataDto2.getError());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(ResultPageDataDto)");
    }
}
