package com.ybsdk.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/network/dto/GetUserInfoResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/GetUserInfoResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/network/dto/UserIdentificationStatus;", "userIdentificationStatusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetUserInfoResponseJsonAdapter extends JsonAdapter<GetUserInfoResponse> {
    private volatile Constructor<GetUserInfoResponse> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("auth_status", "phone");
    private final JsonAdapter<UserIdentificationStatus> userIdentificationStatusAdapter;

    public GetUserInfoResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.userIdentificationStatusAdapter = moshi.adapter(UserIdentificationStatus.class, emptySet, "identificationStatus");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "phone");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetUserInfoResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        UserIdentificationStatus userIdentificationStatus = null;
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                userIdentificationStatus = this.userIdentificationStatusAdapter.fromJson(jsonReader);
                if (userIdentificationStatus == null) {
                    throw Util.unexpectedNull("identificationStatus", "auth_status", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                i = -3;
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            if (userIdentificationStatus != null) {
                return new GetUserInfoResponse(userIdentificationStatus, str);
            }
            throw Util.missingProperty("identificationStatus", "auth_status", jsonReader);
        }
        Constructor<GetUserInfoResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = GetUserInfoResponse.class.getDeclaredConstructor(UserIdentificationStatus.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (userIdentificationStatus != null) {
            return constructor.newInstance(userIdentificationStatus, str, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("identificationStatus", "auth_status", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetUserInfoResponse getUserInfoResponse) {
        GetUserInfoResponse getUserInfoResponse2 = getUserInfoResponse;
        if (getUserInfoResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("auth_status");
        this.userIdentificationStatusAdapter.toJson(jsonWriter, (JsonWriter) getUserInfoResponse2.getIdentificationStatus());
        jsonWriter.name("phone");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) getUserInfoResponse2.getPhone());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(GetUserInfoResponse)");
    }
}
