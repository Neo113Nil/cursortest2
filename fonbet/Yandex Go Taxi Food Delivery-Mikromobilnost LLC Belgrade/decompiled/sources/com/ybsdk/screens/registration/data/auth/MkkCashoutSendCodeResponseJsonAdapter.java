package com.ybsdk.screens.registration.data.auth;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.screens.registration.data.auth.MkkCashoutSendCodeResponse;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/screens/registration/data/auth/MkkCashoutSendCodeResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/screens/registration/data/auth/MkkCashoutSendCodeResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/screens/registration/data/auth/MkkCashoutSendCodeResponse$ActionStatus;", "actionStatusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lcom/ybsdk/screens/registration/data/auth/MkkCashoutSendCodeResponse$SendFailData;", "nullableSendFailDataAdapter", "Lcom/ybsdk/screens/registration/data/auth/MkkCashoutSendCodeResponse$CodeFormat;", "nullableCodeFormatAdapter", "", "nullableStringAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MkkCashoutSendCodeResponseJsonAdapter extends JsonAdapter<MkkCashoutSendCodeResponse> {
    private final JsonAdapter<MkkCashoutSendCodeResponse.ActionStatus> actionStatusAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<MkkCashoutSendCodeResponse.CodeFormat> nullableCodeFormatAdapter;
    private final JsonAdapter<MkkCashoutSendCodeResponse.SendFailData> nullableSendFailDataAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(ACSPConstants.STATUS, "retry_interval", "fail_data", "code_format", "testing_sent_code", "phone");

    public MkkCashoutSendCodeResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.actionStatusAdapter = moshi.adapter(MkkCashoutSendCodeResponse.ActionStatus.class, emptySet, ACSPConstants.STATUS);
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "retryInterval");
        this.nullableSendFailDataAdapter = moshi.adapter(MkkCashoutSendCodeResponse.SendFailData.class, emptySet, "failData");
        this.nullableCodeFormatAdapter = moshi.adapter(MkkCashoutSendCodeResponse.CodeFormat.class, emptySet, "codeFormat");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "testingSentCode");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MkkCashoutSendCodeResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        MkkCashoutSendCodeResponse.ActionStatus actionStatus = null;
        MkkCashoutSendCodeResponse.SendFailData sendFailData = null;
        MkkCashoutSendCodeResponse.CodeFormat codeFormat = null;
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    actionStatus = this.actionStatusAdapter.fromJson(jsonReader);
                    if (actionStatus == null) {
                        throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                    }
                    break;
                case 1:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("retryInterval", "retry_interval", jsonReader);
                    }
                    break;
                case 2:
                    sendFailData = this.nullableSendFailDataAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    codeFormat = this.nullableCodeFormatAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (actionStatus == null) {
            throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
        }
        if (num != null) {
            return new MkkCashoutSendCodeResponse(actionStatus, num.intValue(), sendFailData, codeFormat, str, str2);
        }
        throw Util.missingProperty("retryInterval", "retry_interval", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MkkCashoutSendCodeResponse mkkCashoutSendCodeResponse) {
        MkkCashoutSendCodeResponse mkkCashoutSendCodeResponse2 = mkkCashoutSendCodeResponse;
        if (mkkCashoutSendCodeResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ACSPConstants.STATUS);
        this.actionStatusAdapter.toJson(jsonWriter, (JsonWriter) mkkCashoutSendCodeResponse2.getStatus());
        jsonWriter.name("retry_interval");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(mkkCashoutSendCodeResponse2.getRetryInterval()));
        jsonWriter.name("fail_data");
        this.nullableSendFailDataAdapter.toJson(jsonWriter, (JsonWriter) mkkCashoutSendCodeResponse2.getFailData());
        jsonWriter.name("code_format");
        this.nullableCodeFormatAdapter.toJson(jsonWriter, (JsonWriter) mkkCashoutSendCodeResponse2.getCodeFormat());
        jsonWriter.name("testing_sent_code");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) mkkCashoutSendCodeResponse2.getTestingSentCode());
        jsonWriter.name("phone");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) mkkCashoutSendCodeResponse2.getPhone());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(MkkCashoutSendCodeResponse)");
    }
}
