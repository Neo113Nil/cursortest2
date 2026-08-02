package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/rconfig/configs/NetworkRetryConfigSettingDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/NetworkRetryConfigSettingData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/rconfig/configs/NetworkRetryConditionData;", "networkRetryConditionDataAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/NetworkRetryEnabledData;", "networkRetryEnabledDataAdapter", "Lcom/ybsdk/rconfig/configs/NetworkCooldownEnabledData;", "networkCooldownEnabledDataAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NetworkRetryConfigSettingDataJsonAdapter extends JsonAdapter<NetworkRetryConfigSettingData> {
    private final JsonAdapter<NetworkCooldownEnabledData> networkCooldownEnabledDataAdapter;
    private final JsonAdapter<NetworkRetryConditionData> networkRetryConditionDataAdapter;
    private final JsonAdapter<NetworkRetryEnabledData> networkRetryEnabledDataAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("condition", "retry", "cooldown");

    public NetworkRetryConfigSettingDataJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.networkRetryConditionDataAdapter = moshi.adapter(NetworkRetryConditionData.class, emptySet, "condition");
        this.networkRetryEnabledDataAdapter = moshi.adapter(NetworkRetryEnabledData.class, emptySet, "retry");
        this.networkCooldownEnabledDataAdapter = moshi.adapter(NetworkCooldownEnabledData.class, emptySet, "cooldown");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NetworkRetryConfigSettingData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        NetworkRetryConditionData networkRetryConditionData = null;
        NetworkRetryEnabledData networkRetryEnabledData = null;
        NetworkCooldownEnabledData networkCooldownEnabledData = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                networkRetryConditionData = this.networkRetryConditionDataAdapter.fromJson(jsonReader);
                if (networkRetryConditionData == null) {
                    throw Util.unexpectedNull("condition", "condition", jsonReader);
                }
            } else if (selectName == 1) {
                networkRetryEnabledData = this.networkRetryEnabledDataAdapter.fromJson(jsonReader);
                if (networkRetryEnabledData == null) {
                    throw Util.unexpectedNull("retry", "retry", jsonReader);
                }
            } else if (selectName == 2 && (networkCooldownEnabledData = this.networkCooldownEnabledDataAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("cooldown", "cooldown", jsonReader);
            }
        }
        jsonReader.endObject();
        if (networkRetryConditionData == null) {
            throw Util.missingProperty("condition", "condition", jsonReader);
        }
        if (networkRetryEnabledData == null) {
            throw Util.missingProperty("retry", "retry", jsonReader);
        }
        if (networkCooldownEnabledData != null) {
            return new NetworkRetryConfigSettingData(networkRetryConditionData, networkRetryEnabledData, networkCooldownEnabledData);
        }
        throw Util.missingProperty("cooldown", "cooldown", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NetworkRetryConfigSettingData networkRetryConfigSettingData) {
        NetworkRetryConfigSettingData networkRetryConfigSettingData2 = networkRetryConfigSettingData;
        if (networkRetryConfigSettingData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("condition");
        this.networkRetryConditionDataAdapter.toJson(jsonWriter, (JsonWriter) networkRetryConfigSettingData2.getCondition());
        jsonWriter.name("retry");
        this.networkRetryEnabledDataAdapter.toJson(jsonWriter, (JsonWriter) networkRetryConfigSettingData2.getRetry());
        jsonWriter.name("cooldown");
        this.networkCooldownEnabledDataAdapter.toJson(jsonWriter, (JsonWriter) networkRetryConfigSettingData2.getCooldown());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(51, "GeneratedJsonAdapter(NetworkRetryConfigSettingData)");
    }
}
