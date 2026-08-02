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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/rconfig/configs/YbUiStatEventConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/YbUiStatEventConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class YbUiStatEventConfigJsonAdapter extends JsonAdapter<YbUiStatEventConfig> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("max_queue_size", "send_debounce_ms");

    public YbUiStatEventConfigJsonAdapter(Moshi moshi) {
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.intAdapter = moshi.adapter(cls, emptySet, "maxQueueSize");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "sendDebounceMs");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final YbUiStatEventConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        Long l = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("maxQueueSize", "max_queue_size", jsonReader);
                }
            } else if (selectName == 1 && (l = this.longAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("sendDebounceMs", "send_debounce_ms", jsonReader);
            }
        }
        jsonReader.endObject();
        if (num == null) {
            throw Util.missingProperty("maxQueueSize", "max_queue_size", jsonReader);
        }
        int intValue = num.intValue();
        if (l != null) {
            return new YbUiStatEventConfig(intValue, l.longValue());
        }
        throw Util.missingProperty("sendDebounceMs", "send_debounce_ms", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, YbUiStatEventConfig ybUiStatEventConfig) {
        YbUiStatEventConfig ybUiStatEventConfig2 = ybUiStatEventConfig;
        if (ybUiStatEventConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("max_queue_size");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(ybUiStatEventConfig2.getMaxQueueSize()));
        jsonWriter.name("send_debounce_ms");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(ybUiStatEventConfig2.getSendDebounceMs()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(YbUiStatEventConfig)");
    }
}
