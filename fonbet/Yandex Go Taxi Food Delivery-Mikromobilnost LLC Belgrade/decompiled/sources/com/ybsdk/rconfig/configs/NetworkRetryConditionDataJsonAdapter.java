package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/rconfig/configs/NetworkRetryConditionDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/NetworkRetryConditionData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableIntAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/NetworkCodeRangeData;", "nullableNetworkCodeRangeDataAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NetworkRetryConditionDataJsonAdapter extends JsonAdapter<NetworkRetryConditionData> {
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<NetworkCodeRangeData> nullableNetworkCodeRangeDataAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(AuthSdkActivity.RESPONSE_TYPE_CODE, "code_range");

    public NetworkRetryConditionDataJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, AuthSdkActivity.RESPONSE_TYPE_CODE);
        this.nullableNetworkCodeRangeDataAdapter = moshi.adapter(NetworkCodeRangeData.class, emptySet, "codeRange");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NetworkRetryConditionData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        NetworkCodeRangeData networkCodeRangeData = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                networkCodeRangeData = this.nullableNetworkCodeRangeDataAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new NetworkRetryConditionData(num, networkCodeRangeData);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NetworkRetryConditionData networkRetryConditionData) {
        NetworkRetryConditionData networkRetryConditionData2 = networkRetryConditionData;
        if (networkRetryConditionData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(AuthSdkActivity.RESPONSE_TYPE_CODE);
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) networkRetryConditionData2.getCode());
        jsonWriter.name("code_range");
        this.nullableNetworkCodeRangeDataAdapter.toJson(jsonWriter, (JsonWriter) networkRetryConditionData2.getCodeRange());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(NetworkRetryConditionData)");
    }
}
