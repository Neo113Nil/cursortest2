package com.ybsdk.screens.registration.data.auth;

import androidx.core.provider.FontsContractCompat$Columns;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.screens.registration.data.auth.MkkCashoutVerifyCodeResponse;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/screens/registration/data/auth/MkkCashoutVerifyCodeResponse_VerifyFailDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/screens/registration/data/auth/MkkCashoutVerifyCodeResponse$VerifyFailData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MkkCashoutVerifyCodeResponse_VerifyFailDataJsonAdapter extends JsonAdapter<MkkCashoutVerifyCodeResponse.VerifyFailData> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("attempts_left", FontsContractCompat$Columns.RESULT_CODE);
    private final JsonAdapter<String> stringAdapter;

    public MkkCashoutVerifyCodeResponse_VerifyFailDataJsonAdapter(Moshi moshi) {
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.intAdapter = moshi.adapter(cls, emptySet, "attemptsLeft");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "resultCode");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MkkCashoutVerifyCodeResponse.VerifyFailData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("attemptsLeft", "attempts_left", jsonReader);
                }
            } else if (selectName == 1 && (str = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("resultCode", FontsContractCompat$Columns.RESULT_CODE, jsonReader);
            }
        }
        jsonReader.endObject();
        if (num == null) {
            throw Util.missingProperty("attemptsLeft", "attempts_left", jsonReader);
        }
        int intValue = num.intValue();
        if (str != null) {
            return new MkkCashoutVerifyCodeResponse.VerifyFailData(intValue, str);
        }
        throw Util.missingProperty("resultCode", FontsContractCompat$Columns.RESULT_CODE, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MkkCashoutVerifyCodeResponse.VerifyFailData verifyFailData) {
        MkkCashoutVerifyCodeResponse.VerifyFailData verifyFailData2 = verifyFailData;
        if (verifyFailData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("attempts_left");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(verifyFailData2.getAttemptsLeft()));
        jsonWriter.name(FontsContractCompat$Columns.RESULT_CODE);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) verifyFailData2.getResultCode());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(65, "GeneratedJsonAdapter(MkkCashoutVerifyCodeResponse.VerifyFailData)");
    }
}
