package com.ybsdk.feature.transfer.internal.network.dto.transfer.result;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.feature.autotopup.api.dto.AutoTopupWidgetDto;
import com.ybsdk.feature.transfer.internal.network.dto.transfer.TransferResult;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/result/GetResultResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/result/GetResultResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/TransferResult;", "transferResultAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto;", "nullableListOfAutoTopupWidgetDtoAdapter", "feature-transfer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetResultResponseJsonAdapter extends JsonAdapter<GetResultResponse> {
    private final JsonAdapter<List<AutoTopupWidgetDto>> nullableListOfAutoTopupWidgetDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(TarifficatorScenarioActivity.RESULT_KEY, "widgets");
    private final JsonAdapter<TransferResult> transferResultAdapter;

    public GetResultResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.transferResultAdapter = moshi.adapter(TransferResult.class, emptySet, TarifficatorScenarioActivity.RESULT_KEY);
        this.nullableListOfAutoTopupWidgetDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, AutoTopupWidgetDto.class), emptySet, "widgets");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetResultResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        TransferResult transferResult = null;
        List<AutoTopupWidgetDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                transferResult = this.transferResultAdapter.fromJson(jsonReader);
                if (transferResult == null) {
                    throw Util.unexpectedNull(TarifficatorScenarioActivity.RESULT_KEY, TarifficatorScenarioActivity.RESULT_KEY, jsonReader);
                }
            } else if (selectName == 1) {
                list = this.nullableListOfAutoTopupWidgetDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (transferResult != null) {
            return new GetResultResponse(transferResult, list);
        }
        throw Util.missingProperty(TarifficatorScenarioActivity.RESULT_KEY, TarifficatorScenarioActivity.RESULT_KEY, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetResultResponse getResultResponse) {
        GetResultResponse getResultResponse2 = getResultResponse;
        if (getResultResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(TarifficatorScenarioActivity.RESULT_KEY);
        this.transferResultAdapter.toJson(jsonWriter, (JsonWriter) getResultResponse2.getResult());
        jsonWriter.name("widgets");
        this.nullableListOfAutoTopupWidgetDtoAdapter.toJson(jsonWriter, (JsonWriter) getResultResponse2.getWidgets());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(GetResultResponse)");
    }
}
