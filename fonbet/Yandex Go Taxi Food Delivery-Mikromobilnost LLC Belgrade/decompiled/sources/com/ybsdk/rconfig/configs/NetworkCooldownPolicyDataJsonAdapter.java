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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/rconfig/configs/NetworkCooldownPolicyDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/NetworkCooldownPolicyData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NetworkCooldownPolicyDataJsonAdapter extends JsonAdapter<NetworkCooldownPolicyData> {
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("min_cooldown_ms", "max_cooldown_ms");

    public NetworkCooldownPolicyDataJsonAdapter(Moshi moshi) {
        this.longAdapter = moshi.adapter(Long.TYPE, EmptySet.a, "minCooldownMs");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NetworkCooldownPolicyData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Long l = null;
        Long l2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull("minCooldownMs", "min_cooldown_ms", jsonReader);
                }
            } else if (selectName == 1 && (l2 = this.longAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("maxCooldownMs", "max_cooldown_ms", jsonReader);
            }
        }
        jsonReader.endObject();
        if (l == null) {
            throw Util.missingProperty("minCooldownMs", "min_cooldown_ms", jsonReader);
        }
        long longValue = l.longValue();
        if (l2 != null) {
            return new NetworkCooldownPolicyData(longValue, l2.longValue());
        }
        throw Util.missingProperty("maxCooldownMs", "max_cooldown_ms", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NetworkCooldownPolicyData networkCooldownPolicyData) {
        NetworkCooldownPolicyData networkCooldownPolicyData2 = networkCooldownPolicyData;
        if (networkCooldownPolicyData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("min_cooldown_ms");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(networkCooldownPolicyData2.getMinCooldownMs()));
        jsonWriter.name("max_cooldown_ms");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(networkCooldownPolicyData2.getMaxCooldownMs()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(NetworkCooldownPolicyData)");
    }
}
