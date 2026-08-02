package com.ybsdk.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.network.dto.SendAuthorizationCodeResponse;
import com.ybsdk.screens.registration.domain.OtpResponseDataEntity;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/network/dto/SendAuthorizationCodeResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/SendAuthorizationCodeResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/network/dto/SendAuthorizationCodeResponse$Status;", "statusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lcom/ybsdk/network/dto/SendAuthorizationCodeResponse$FailData;", "nullableFailDataAdapter", "", "nullableStringAdapter", "Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity$CodeFormat;", "codeFormatAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SendAuthorizationCodeResponseJsonAdapter extends JsonAdapter<SendAuthorizationCodeResponse> {
    private final JsonAdapter<OtpResponseDataEntity.CodeFormat> codeFormatAdapter;
    private volatile Constructor<SendAuthorizationCodeResponse> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<SendAuthorizationCodeResponse.FailData> nullableFailDataAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(ACSPConstants.STATUS, "retry_interval", "fail_data", "phone", "code_format");
    private final JsonAdapter<SendAuthorizationCodeResponse.Status> statusAdapter;

    public SendAuthorizationCodeResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.statusAdapter = moshi.adapter(SendAuthorizationCodeResponse.Status.class, emptySet, ACSPConstants.STATUS);
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "retryInterval");
        this.nullableFailDataAdapter = moshi.adapter(SendAuthorizationCodeResponse.FailData.class, emptySet, "failData");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "phone");
        this.codeFormatAdapter = moshi.adapter(OtpResponseDataEntity.CodeFormat.class, emptySet, "codeFormat");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SendAuthorizationCodeResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = 0;
        SendAuthorizationCodeResponse.Status status = null;
        SendAuthorizationCodeResponse.FailData failData = null;
        String str = null;
        OtpResponseDataEntity.CodeFormat codeFormat = null;
        int i = -1;
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
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("retryInterval", "retry_interval", jsonReader);
                }
                i = -3;
            } else if (selectName == 2) {
                failData = this.nullableFailDataAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 4 && (codeFormat = this.codeFormatAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("codeFormat", "code_format", jsonReader);
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            SendAuthorizationCodeResponse.FailData failData2 = failData;
            if (status == null) {
                throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
            }
            OtpResponseDataEntity.CodeFormat codeFormat2 = codeFormat;
            int intValue = num.intValue();
            if (codeFormat2 != null) {
                return new SendAuthorizationCodeResponse(status, intValue, failData2, str, codeFormat2);
            }
            throw Util.missingProperty("codeFormat", "code_format", jsonReader);
        }
        SendAuthorizationCodeResponse.FailData failData3 = failData;
        OtpResponseDataEntity.CodeFormat codeFormat3 = codeFormat;
        Constructor<SendAuthorizationCodeResponse> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls2 = Integer.TYPE;
            constructor = SendAuthorizationCodeResponse.class.getDeclaredConstructor(SendAuthorizationCodeResponse.Status.class, cls2, SendAuthorizationCodeResponse.FailData.class, String.class, OtpResponseDataEntity.CodeFormat.class, cls2, cls);
            this.constructorRef = constructor;
        }
        if (status == null) {
            throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
        }
        if (codeFormat3 != null) {
            return constructor.newInstance(status, num, failData3, str, codeFormat3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("codeFormat", "code_format", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SendAuthorizationCodeResponse sendAuthorizationCodeResponse) {
        SendAuthorizationCodeResponse sendAuthorizationCodeResponse2 = sendAuthorizationCodeResponse;
        if (sendAuthorizationCodeResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ACSPConstants.STATUS);
        this.statusAdapter.toJson(jsonWriter, (JsonWriter) sendAuthorizationCodeResponse2.getStatus());
        jsonWriter.name("retry_interval");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(sendAuthorizationCodeResponse2.getRetryInterval()));
        jsonWriter.name("fail_data");
        this.nullableFailDataAdapter.toJson(jsonWriter, (JsonWriter) sendAuthorizationCodeResponse2.getFailData());
        jsonWriter.name("phone");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) sendAuthorizationCodeResponse2.getPhone());
        jsonWriter.name("code_format");
        this.codeFormatAdapter.toJson(jsonWriter, (JsonWriter) sendAuthorizationCodeResponse2.getCodeFormat());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(51, "GeneratedJsonAdapter(SendAuthorizationCodeResponse)");
    }
}
