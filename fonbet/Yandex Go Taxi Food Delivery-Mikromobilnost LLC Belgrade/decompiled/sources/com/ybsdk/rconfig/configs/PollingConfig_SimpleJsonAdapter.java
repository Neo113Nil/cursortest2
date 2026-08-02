package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.rconfig.configs.PollingConfig;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/rconfig/configs/PollingConfig_SimpleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/PollingConfig$Simple;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "doubleAdapter", "Lcom/squareup/moshi/JsonAdapter;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PollingConfig_SimpleJsonAdapter extends JsonAdapter<PollingConfig.Simple> {
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("base", "initial_delay", "max_duration");

    public PollingConfig_SimpleJsonAdapter(Moshi moshi) {
        this.doubleAdapter = moshi.adapter(Double.TYPE, EmptySet.a, "base");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PollingConfig.Simple fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Double d = null;
        Double d2 = null;
        Double d3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                d = this.doubleAdapter.fromJson(jsonReader);
                if (d == null) {
                    throw Util.unexpectedNull("base", "base", jsonReader);
                }
            } else if (selectName == 1) {
                d2 = this.doubleAdapter.fromJson(jsonReader);
                if (d2 == null) {
                    throw Util.unexpectedNull("initialDelay", "initial_delay", jsonReader);
                }
            } else if (selectName == 2 && (d3 = this.doubleAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("maxDuration", "max_duration", jsonReader);
            }
        }
        jsonReader.endObject();
        Double d4 = d;
        if (d4 == null) {
            throw Util.missingProperty("base", "base", jsonReader);
        }
        double doubleValue = d4.doubleValue();
        if (d2 == null) {
            throw Util.missingProperty("initialDelay", "initial_delay", jsonReader);
        }
        double doubleValue2 = d2.doubleValue();
        if (d3 != null) {
            return new PollingConfig.Simple(doubleValue, doubleValue2, d3.doubleValue());
        }
        throw Util.missingProperty("maxDuration", "max_duration", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PollingConfig.Simple simple) {
        PollingConfig.Simple simple2 = simple;
        if (simple2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("base");
        this.doubleAdapter.toJson(jsonWriter, (JsonWriter) Double.valueOf(simple2.getBase()));
        jsonWriter.name("initial_delay");
        this.doubleAdapter.toJson(jsonWriter, (JsonWriter) Double.valueOf(simple2.getInitialDelay()));
        jsonWriter.name("max_duration");
        this.doubleAdapter.toJson(jsonWriter, (JsonWriter) Double.valueOf(simple2.getMaxDuration()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(PollingConfig.Simple)");
    }
}
