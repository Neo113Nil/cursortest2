package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.feature.savings.internal.network.dto.SavingsAccountOpeningStatusResponse;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountOpeningStatusResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountOpeningStatusResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountOpeningStatusResponse$Status;", "statusAdapter", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "nullableThemedParameterOfStringAdapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavingsAccountOpeningStatusResponseJsonAdapter extends JsonAdapter<SavingsAccountOpeningStatusResponse> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<ThemedParameter<String>> nullableThemedParameterOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("request_id", "request_status", "request_status_title", "request_status_description", "processing_status_title", "processing_status_description", "request_status_image", "support_url", "agreement_id");
    private final JsonAdapter<SavingsAccountOpeningStatusResponse.Status> statusAdapter;
    private final JsonAdapter<String> stringAdapter;

    public SavingsAccountOpeningStatusResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "requestId");
        this.statusAdapter = moshi.adapter(SavingsAccountOpeningStatusResponse.Status.class, emptySet, "requestStatus");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "statusTitle");
        this.nullableThemedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), emptySet, "requestStatusImage");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SavingsAccountOpeningStatusResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        SavingsAccountOpeningStatusResponse.Status status = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ThemedParameter<String> themedParameter = null;
        String str6 = null;
        String str7 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("requestId", "request_id", jsonReader);
                    }
                    break;
                case 1:
                    status = this.statusAdapter.fromJson(jsonReader);
                    if (status == null) {
                        throw Util.unexpectedNull("requestStatus", "request_status", jsonReader);
                    }
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    themedParameter = this.nullableThemedParameterOfStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("requestId", "request_id", jsonReader);
        }
        if (status != null) {
            return new SavingsAccountOpeningStatusResponse(str, status, str2, str3, str4, str5, themedParameter, str6, str7);
        }
        throw Util.missingProperty("requestStatus", "request_status", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SavingsAccountOpeningStatusResponse savingsAccountOpeningStatusResponse) {
        SavingsAccountOpeningStatusResponse savingsAccountOpeningStatusResponse2 = savingsAccountOpeningStatusResponse;
        if (savingsAccountOpeningStatusResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("request_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountOpeningStatusResponse2.getRequestId());
        jsonWriter.name("request_status");
        this.statusAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountOpeningStatusResponse2.getRequestStatus());
        jsonWriter.name("request_status_title");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountOpeningStatusResponse2.getStatusTitle());
        jsonWriter.name("request_status_description");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountOpeningStatusResponse2.getStatusDescription());
        jsonWriter.name("processing_status_title");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountOpeningStatusResponse2.getProcessingStatusTitle());
        jsonWriter.name("processing_status_description");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountOpeningStatusResponse2.getProcessingStatusDescription());
        jsonWriter.name("request_status_image");
        this.nullableThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountOpeningStatusResponse2.getRequestStatusImage());
        jsonWriter.name("support_url");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountOpeningStatusResponse2.getSupportUrl());
        jsonWriter.name("agreement_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountOpeningStatusResponse2.getAgreementId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(57, "GeneratedJsonAdapter(SavingsAccountOpeningStatusResponse)");
    }
}
