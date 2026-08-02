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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/rconfig/configs/ShakeConfigurationJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/ShakeConfiguration;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ShakeConfigurationJsonAdapter extends JsonAdapter<ShakeConfiguration> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("shake_threshold_gravity", "min_delay_between_hiding_balance_ms", "min_window_size_ms", "max_window_size_ms", "queue_size");

    public ShakeConfigurationJsonAdapter(Moshi moshi) {
        this.intAdapter = moshi.adapter(Integer.TYPE, EmptySet.a, "shakeThresholdGravity");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ShakeConfiguration fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        while (true) {
            Integer num6 = num;
            Integer num7 = num2;
            if (!jsonReader.hasNext()) {
                Integer num8 = num3;
                jsonReader.endObject();
                if (num6 == null) {
                    throw Util.missingProperty("shakeThresholdGravity", "shake_threshold_gravity", jsonReader);
                }
                int intValue = num6.intValue();
                if (num7 == null) {
                    throw Util.missingProperty("minDelayBetweenHidingBalanceMs", "min_delay_between_hiding_balance_ms", jsonReader);
                }
                int intValue2 = num7.intValue();
                if (num8 == null) {
                    throw Util.missingProperty("minWindowSizeMs", "min_window_size_ms", jsonReader);
                }
                int intValue3 = num8.intValue();
                if (num4 == null) {
                    throw Util.missingProperty("maxWindowSizeMs", "max_window_size_ms", jsonReader);
                }
                int intValue4 = num4.intValue();
                if (num5 != null) {
                    return new ShakeConfiguration(intValue, intValue2, intValue3, intValue4, num5.intValue());
                }
                throw Util.missingProperty("queueSize", "queue_size", jsonReader);
            }
            int selectName = jsonReader.selectName(this.options);
            Integer num9 = num3;
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("shakeThresholdGravity", "shake_threshold_gravity", jsonReader);
                }
                num2 = num7;
                num3 = num9;
            } else if (selectName == 1) {
                num2 = this.intAdapter.fromJson(jsonReader);
                if (num2 == null) {
                    throw Util.unexpectedNull("minDelayBetweenHidingBalanceMs", "min_delay_between_hiding_balance_ms", jsonReader);
                }
                num = num6;
                num3 = num9;
            } else if (selectName == 2) {
                num3 = this.intAdapter.fromJson(jsonReader);
                if (num3 == null) {
                    throw Util.unexpectedNull("minWindowSizeMs", "min_window_size_ms", jsonReader);
                }
                num = num6;
                num2 = num7;
            } else if (selectName == 3) {
                num4 = this.intAdapter.fromJson(jsonReader);
                if (num4 == null) {
                    throw Util.unexpectedNull("maxWindowSizeMs", "max_window_size_ms", jsonReader);
                }
            } else if (selectName == 4 && (num5 = this.intAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("queueSize", "queue_size", jsonReader);
            }
            num = num6;
            num2 = num7;
            num3 = num9;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ShakeConfiguration shakeConfiguration) {
        ShakeConfiguration shakeConfiguration2 = shakeConfiguration;
        if (shakeConfiguration2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("shake_threshold_gravity");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(shakeConfiguration2.getShakeThresholdGravity()));
        jsonWriter.name("min_delay_between_hiding_balance_ms");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(shakeConfiguration2.getMinDelayBetweenHidingBalanceMs()));
        jsonWriter.name("min_window_size_ms");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(shakeConfiguration2.getMinWindowSizeMs()));
        jsonWriter.name("max_window_size_ms");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(shakeConfiguration2.getMaxWindowSizeMs()));
        jsonWriter.name("queue_size");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(shakeConfiguration2.getQueueSize()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(ShakeConfiguration)");
    }
}
