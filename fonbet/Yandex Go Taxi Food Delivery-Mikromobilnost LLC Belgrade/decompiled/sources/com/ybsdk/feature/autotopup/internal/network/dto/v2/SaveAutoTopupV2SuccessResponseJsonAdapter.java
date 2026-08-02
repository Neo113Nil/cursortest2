package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/SaveAutoTopupV2SuccessResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/SaveAutoTopupV2SuccessResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SaveAutoTopupV2SuccessResponseJsonAdapter extends JsonAdapter<SaveAutoTopupV2SuccessResponse> {
    private final JsonReader.Options options = JsonReader.Options.of("request_id", "action");
    private final JsonAdapter<String> stringAdapter;

    public SaveAutoTopupV2SuccessResponseJsonAdapter(Moshi moshi) {
        this.stringAdapter = moshi.adapter(String.class, EmptySet.a, "requestId");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SaveAutoTopupV2SuccessResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
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
            } else if (selectName == 1 && (str2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("action", "action", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("requestId", "request_id", jsonReader);
        }
        if (str2 != null) {
            return new SaveAutoTopupV2SuccessResponse(str, str2);
        }
        throw Util.missingProperty("action", "action", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SaveAutoTopupV2SuccessResponse saveAutoTopupV2SuccessResponse) {
        SaveAutoTopupV2SuccessResponse saveAutoTopupV2SuccessResponse2 = saveAutoTopupV2SuccessResponse;
        if (saveAutoTopupV2SuccessResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("request_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) saveAutoTopupV2SuccessResponse2.getRequestId());
        jsonWriter.name("action");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) saveAutoTopupV2SuccessResponse2.getAction());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(52, "GeneratedJsonAdapter(SaveAutoTopupV2SuccessResponse)");
    }
}
