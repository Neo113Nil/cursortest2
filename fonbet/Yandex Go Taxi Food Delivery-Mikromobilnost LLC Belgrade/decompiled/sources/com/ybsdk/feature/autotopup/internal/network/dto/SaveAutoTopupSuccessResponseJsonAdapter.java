package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.data.network.dto.CommonSheet;
import com.ybsdk.feature.autotopup.internal.network.dto.SaveAutoTopupSuccessResponse;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/SaveAutoTopupSuccessResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/SaveAutoTopupSuccessResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "nullableActionButtonDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/CommonSheet;", "nullableCommonSheetAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/SaveAutoTopupSuccessResponse$SaveAutoTopupResultDto;", "saveAutoTopupResultDtoAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SaveAutoTopupSuccessResponseJsonAdapter extends JsonAdapter<SaveAutoTopupSuccessResponse> {
    private final JsonAdapter<ActionButtonDto> nullableActionButtonDtoAdapter;
    private final JsonAdapter<CommonSheet> nullableCommonSheetAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("request_id", "button", "app_not_found_sheet", "result_data");
    private final JsonAdapter<SaveAutoTopupSuccessResponse.SaveAutoTopupResultDto> saveAutoTopupResultDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public SaveAutoTopupSuccessResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "requestId");
        this.nullableActionButtonDtoAdapter = moshi.adapter(ActionButtonDto.class, emptySet, "button");
        this.nullableCommonSheetAdapter = moshi.adapter(CommonSheet.class, emptySet, "appNotFoundSheet");
        this.saveAutoTopupResultDtoAdapter = moshi.adapter(SaveAutoTopupSuccessResponse.SaveAutoTopupResultDto.class, emptySet, "resultData");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SaveAutoTopupSuccessResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        ActionButtonDto actionButtonDto = null;
        CommonSheet commonSheet = null;
        SaveAutoTopupSuccessResponse.SaveAutoTopupResultDto saveAutoTopupResultDto = null;
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
                actionButtonDto = this.nullableActionButtonDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                commonSheet = this.nullableCommonSheetAdapter.fromJson(jsonReader);
            } else if (selectName == 3 && (saveAutoTopupResultDto = this.saveAutoTopupResultDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("resultData", "result_data", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("requestId", "request_id", jsonReader);
        }
        if (saveAutoTopupResultDto != null) {
            return new SaveAutoTopupSuccessResponse(str, actionButtonDto, commonSheet, saveAutoTopupResultDto);
        }
        throw Util.missingProperty("resultData", "result_data", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SaveAutoTopupSuccessResponse saveAutoTopupSuccessResponse) {
        SaveAutoTopupSuccessResponse saveAutoTopupSuccessResponse2 = saveAutoTopupSuccessResponse;
        if (saveAutoTopupSuccessResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("request_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) saveAutoTopupSuccessResponse2.getRequestId());
        jsonWriter.name("button");
        this.nullableActionButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) saveAutoTopupSuccessResponse2.getButton());
        jsonWriter.name("app_not_found_sheet");
        this.nullableCommonSheetAdapter.toJson(jsonWriter, (JsonWriter) saveAutoTopupSuccessResponse2.getAppNotFoundSheet());
        jsonWriter.name("result_data");
        this.saveAutoTopupResultDtoAdapter.toJson(jsonWriter, (JsonWriter) saveAutoTopupSuccessResponse2.getResultData());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(50, "GeneratedJsonAdapter(SaveAutoTopupSuccessResponse)");
    }
}
