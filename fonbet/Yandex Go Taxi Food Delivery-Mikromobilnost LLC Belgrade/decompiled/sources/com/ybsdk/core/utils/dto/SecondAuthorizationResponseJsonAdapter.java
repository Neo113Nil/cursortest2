package com.ybsdk.core.utils.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.utils.dto.SecondAuthorizationResponse;
import defpackage.dac;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponseJsonAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "", "Ljava/lang/reflect/Type;", "types", "<init>", "(Lcom/squareup/moshi/Moshi;[Ljava/lang/reflect/Type;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse$RequestStatus;", "requestStatusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse$AuthorizationInfo;", "nullableAuthorizationInfoAdapter", "Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse$FailData;", "nullableFailDataAdapter", "nullableTNullableAnyAdapter", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SecondAuthorizationResponseJsonAdapter<T> extends JsonAdapter<SecondAuthorizationResponse<T>> {
    private final JsonAdapter<SecondAuthorizationResponse.AuthorizationInfo> nullableAuthorizationInfoAdapter;
    private final JsonAdapter<SecondAuthorizationResponse.FailData> nullableFailDataAdapter;
    private final JsonAdapter<T> nullableTNullableAnyAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<SecondAuthorizationResponse.RequestStatus> requestStatusAdapter;

    public SecondAuthorizationResponseJsonAdapter(Moshi moshi, Type[] typeArr) {
        if (typeArr.length != 1) {
            dac.e(typeArr.length, "TypeVariable mismatch: Expecting 1 type for generic type variables [T], but received ");
            throw null;
        }
        this.options = JsonReader.Options.of("result_status", "authorization_info", "fail_data", "success_data");
        EmptySet emptySet = EmptySet.a;
        this.requestStatusAdapter = moshi.adapter(SecondAuthorizationResponse.RequestStatus.class, emptySet, "resultStatus");
        this.nullableAuthorizationInfoAdapter = moshi.adapter(SecondAuthorizationResponse.AuthorizationInfo.class, emptySet, "authorizationInfo");
        this.nullableFailDataAdapter = moshi.adapter(SecondAuthorizationResponse.FailData.class, emptySet, "failData");
        this.nullableTNullableAnyAdapter = moshi.adapter(typeArr[0], emptySet, "successData");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        SecondAuthorizationResponse.RequestStatus requestStatus = null;
        SecondAuthorizationResponse.AuthorizationInfo authorizationInfo = null;
        SecondAuthorizationResponse.FailData failData = null;
        T t = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                requestStatus = this.requestStatusAdapter.fromJson(jsonReader);
                if (requestStatus == null) {
                    throw Util.unexpectedNull("resultStatus", "result_status", jsonReader);
                }
            } else if (selectName == 1) {
                authorizationInfo = this.nullableAuthorizationInfoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                failData = this.nullableFailDataAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                t = this.nullableTNullableAnyAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (requestStatus != null) {
            return new SecondAuthorizationResponse(requestStatus, authorizationInfo, failData, t);
        }
        throw Util.missingProperty("resultStatus", "result_status", jsonReader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        SecondAuthorizationResponse secondAuthorizationResponse = (SecondAuthorizationResponse) obj;
        if (secondAuthorizationResponse == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("result_status");
        this.requestStatusAdapter.toJson(jsonWriter, (JsonWriter) secondAuthorizationResponse.getResultStatus());
        jsonWriter.name("authorization_info");
        this.nullableAuthorizationInfoAdapter.toJson(jsonWriter, (JsonWriter) secondAuthorizationResponse.getAuthorizationInfo());
        jsonWriter.name("fail_data");
        this.nullableFailDataAdapter.toJson(jsonWriter, (JsonWriter) secondAuthorizationResponse.getFailData());
        jsonWriter.name("success_data");
        this.nullableTNullableAnyAdapter.toJson(jsonWriter, (JsonWriter) secondAuthorizationResponse.getSuccessData());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(SecondAuthorizationResponse)");
    }
}
