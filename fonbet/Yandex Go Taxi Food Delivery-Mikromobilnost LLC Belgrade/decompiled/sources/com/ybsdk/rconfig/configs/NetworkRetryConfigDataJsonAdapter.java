package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/rconfig/configs/NetworkRetryConfigDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/NetworkRetryConfigData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/rconfig/configs/NetworkRetryPolicyData;", "networkRetryPolicyDataAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/NetworkCooldownPolicyData;", "networkCooldownPolicyDataAdapter", "Lcom/ybsdk/rconfig/configs/NetworkRetryBudgetData;", "networkRetryBudgetDataAdapter", "", "Lcom/ybsdk/rconfig/configs/NetworkRetryConfigSettingData;", "listOfNetworkRetryConfigSettingDataAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NetworkRetryConfigDataJsonAdapter extends JsonAdapter<NetworkRetryConfigData> {
    private final JsonAdapter<List<NetworkRetryConfigSettingData>> listOfNetworkRetryConfigSettingDataAdapter;
    private final JsonAdapter<NetworkCooldownPolicyData> networkCooldownPolicyDataAdapter;
    private final JsonAdapter<NetworkRetryBudgetData> networkRetryBudgetDataAdapter;
    private final JsonAdapter<NetworkRetryPolicyData> networkRetryPolicyDataAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("retry_policy", "cooldown_policy", "retry_budget", "settings");

    public NetworkRetryConfigDataJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.networkRetryPolicyDataAdapter = moshi.adapter(NetworkRetryPolicyData.class, emptySet, "retryPolicy");
        this.networkCooldownPolicyDataAdapter = moshi.adapter(NetworkCooldownPolicyData.class, emptySet, "cooldownPolicy");
        this.networkRetryBudgetDataAdapter = moshi.adapter(NetworkRetryBudgetData.class, emptySet, "retryBudget");
        this.listOfNetworkRetryConfigSettingDataAdapter = moshi.adapter(Types.newParameterizedType(List.class, NetworkRetryConfigSettingData.class), emptySet, "settings");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NetworkRetryConfigData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        NetworkRetryPolicyData networkRetryPolicyData = null;
        NetworkCooldownPolicyData networkCooldownPolicyData = null;
        NetworkRetryBudgetData networkRetryBudgetData = null;
        List<NetworkRetryConfigSettingData> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                networkRetryPolicyData = this.networkRetryPolicyDataAdapter.fromJson(jsonReader);
                if (networkRetryPolicyData == null) {
                    throw Util.unexpectedNull("retryPolicy", "retry_policy", jsonReader);
                }
            } else if (selectName == 1) {
                networkCooldownPolicyData = this.networkCooldownPolicyDataAdapter.fromJson(jsonReader);
                if (networkCooldownPolicyData == null) {
                    throw Util.unexpectedNull("cooldownPolicy", "cooldown_policy", jsonReader);
                }
            } else if (selectName == 2) {
                networkRetryBudgetData = this.networkRetryBudgetDataAdapter.fromJson(jsonReader);
                if (networkRetryBudgetData == null) {
                    throw Util.unexpectedNull("retryBudget", "retry_budget", jsonReader);
                }
            } else if (selectName == 3 && (list = this.listOfNetworkRetryConfigSettingDataAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("settings", "settings", jsonReader);
            }
        }
        jsonReader.endObject();
        if (networkRetryPolicyData == null) {
            throw Util.missingProperty("retryPolicy", "retry_policy", jsonReader);
        }
        if (networkCooldownPolicyData == null) {
            throw Util.missingProperty("cooldownPolicy", "cooldown_policy", jsonReader);
        }
        if (networkRetryBudgetData == null) {
            throw Util.missingProperty("retryBudget", "retry_budget", jsonReader);
        }
        if (list != null) {
            return new NetworkRetryConfigData(networkRetryPolicyData, networkCooldownPolicyData, networkRetryBudgetData, list);
        }
        throw Util.missingProperty("settings", "settings", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NetworkRetryConfigData networkRetryConfigData) {
        NetworkRetryConfigData networkRetryConfigData2 = networkRetryConfigData;
        if (networkRetryConfigData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("retry_policy");
        this.networkRetryPolicyDataAdapter.toJson(jsonWriter, (JsonWriter) networkRetryConfigData2.getRetryPolicy());
        jsonWriter.name("cooldown_policy");
        this.networkCooldownPolicyDataAdapter.toJson(jsonWriter, (JsonWriter) networkRetryConfigData2.getCooldownPolicy());
        jsonWriter.name("retry_budget");
        this.networkRetryBudgetDataAdapter.toJson(jsonWriter, (JsonWriter) networkRetryConfigData2.getRetryBudget());
        jsonWriter.name("settings");
        this.listOfNetworkRetryConfigSettingDataAdapter.toJson(jsonWriter, (JsonWriter) networkRetryConfigData2.getSettings());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(NetworkRetryConfigData)");
    }
}
