package com.ybsdk.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.network.dto.VerifyAuthorizationCodeResponse;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/network/dto/VerifyAuthorizationCodeResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/VerifyAuthorizationCodeResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/network/dto/VerifyAuthorizationCodeResponse$Status;", "statusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/VerifyAuthorizationCodeResponse$OkData;", "nullableOkDataAdapter", "Lcom/ybsdk/network/dto/VerifyAuthorizationCodeResponse$FailData;", "nullableFailDataAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VerifyAuthorizationCodeResponseJsonAdapter extends JsonAdapter<VerifyAuthorizationCodeResponse> {
    private final JsonAdapter<VerifyAuthorizationCodeResponse.FailData> nullableFailDataAdapter;
    private final JsonAdapter<VerifyAuthorizationCodeResponse.OkData> nullableOkDataAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("verification_result", "ok_data", "fail_data");
    private final JsonAdapter<VerifyAuthorizationCodeResponse.Status> statusAdapter;

    public VerifyAuthorizationCodeResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.statusAdapter = moshi.adapter(VerifyAuthorizationCodeResponse.Status.class, emptySet, "verificationResult");
        this.nullableOkDataAdapter = moshi.adapter(VerifyAuthorizationCodeResponse.OkData.class, emptySet, "okData");
        this.nullableFailDataAdapter = moshi.adapter(VerifyAuthorizationCodeResponse.FailData.class, emptySet, "failData");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final VerifyAuthorizationCodeResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        VerifyAuthorizationCodeResponse.Status status = null;
        VerifyAuthorizationCodeResponse.OkData okData = null;
        VerifyAuthorizationCodeResponse.FailData failData = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                status = this.statusAdapter.fromJson(jsonReader);
                if (status == null) {
                    throw Util.unexpectedNull("verificationResult", "verification_result", jsonReader);
                }
            } else if (selectName == 1) {
                okData = this.nullableOkDataAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                failData = this.nullableFailDataAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (status != null) {
            return new VerifyAuthorizationCodeResponse(status, okData, failData);
        }
        throw Util.missingProperty("verificationResult", "verification_result", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, VerifyAuthorizationCodeResponse verifyAuthorizationCodeResponse) {
        VerifyAuthorizationCodeResponse verifyAuthorizationCodeResponse2 = verifyAuthorizationCodeResponse;
        if (verifyAuthorizationCodeResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("verification_result");
        this.statusAdapter.toJson(jsonWriter, (JsonWriter) verifyAuthorizationCodeResponse2.getVerificationResult());
        jsonWriter.name("ok_data");
        this.nullableOkDataAdapter.toJson(jsonWriter, (JsonWriter) verifyAuthorizationCodeResponse2.getOkData());
        jsonWriter.name("fail_data");
        this.nullableFailDataAdapter.toJson(jsonWriter, (JsonWriter) verifyAuthorizationCodeResponse2.getFailData());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(53, "GeneratedJsonAdapter(VerifyAuthorizationCodeResponse)");
    }
}
