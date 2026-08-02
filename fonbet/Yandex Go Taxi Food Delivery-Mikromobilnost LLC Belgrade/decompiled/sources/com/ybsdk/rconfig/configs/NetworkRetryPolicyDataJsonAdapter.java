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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/rconfig/configs/NetworkRetryPolicyDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/NetworkRetryPolicyData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "doubleAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NetworkRetryPolicyDataJsonAdapter extends JsonAdapter<NetworkRetryPolicyData> {
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("factor", "base_ms", "cap_ms", "timeout_ms", "delay_margin_ms");

    public NetworkRetryPolicyDataJsonAdapter(Moshi moshi) {
        Class cls = Double.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.doubleAdapter = moshi.adapter(cls, emptySet, "factor");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "baseMs");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NetworkRetryPolicyData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Double d = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        while (true) {
            Double d2 = d;
            if (!jsonReader.hasNext()) {
                Long l5 = l;
                jsonReader.endObject();
                if (d2 == null) {
                    throw Util.missingProperty("factor", "factor", jsonReader);
                }
                double doubleValue = d2.doubleValue();
                if (l5 == null) {
                    throw Util.missingProperty("baseMs", "base_ms", jsonReader);
                }
                long longValue = l5.longValue();
                if (l2 == null) {
                    throw Util.missingProperty("capMs", "cap_ms", jsonReader);
                }
                long longValue2 = l2.longValue();
                if (l3 == null) {
                    throw Util.missingProperty("timeoutMs", "timeout_ms", jsonReader);
                }
                long longValue3 = l3.longValue();
                if (l4 != null) {
                    return new NetworkRetryPolicyData(doubleValue, longValue, longValue2, longValue3, l4.longValue());
                }
                throw Util.missingProperty("delayMarginMs", "delay_margin_ms", jsonReader);
            }
            int selectName = jsonReader.selectName(this.options);
            Long l6 = l;
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                Double fromJson = this.doubleAdapter.fromJson(jsonReader);
                if (fromJson == null) {
                    throw Util.unexpectedNull("factor", "factor", jsonReader);
                }
                d = fromJson;
                l = l6;
            } else if (selectName == 1) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull("baseMs", "base_ms", jsonReader);
                }
                d = d2;
            } else if (selectName == 2) {
                l2 = this.longAdapter.fromJson(jsonReader);
                if (l2 == null) {
                    throw Util.unexpectedNull("capMs", "cap_ms", jsonReader);
                }
            } else if (selectName == 3) {
                l3 = this.longAdapter.fromJson(jsonReader);
                if (l3 == null) {
                    throw Util.unexpectedNull("timeoutMs", "timeout_ms", jsonReader);
                }
            } else if (selectName == 4 && (l4 = this.longAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("delayMarginMs", "delay_margin_ms", jsonReader);
            }
            d = d2;
            l = l6;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NetworkRetryPolicyData networkRetryPolicyData) {
        NetworkRetryPolicyData networkRetryPolicyData2 = networkRetryPolicyData;
        if (networkRetryPolicyData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("factor");
        this.doubleAdapter.toJson(jsonWriter, (JsonWriter) Double.valueOf(networkRetryPolicyData2.getFactor()));
        jsonWriter.name("base_ms");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(networkRetryPolicyData2.getBaseMs()));
        jsonWriter.name("cap_ms");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(networkRetryPolicyData2.getCapMs()));
        jsonWriter.name("timeout_ms");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(networkRetryPolicyData2.getTimeoutMs()));
        jsonWriter.name("delay_margin_ms");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(networkRetryPolicyData2.getDelayMarginMs()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(NetworkRetryPolicyData)");
    }
}
