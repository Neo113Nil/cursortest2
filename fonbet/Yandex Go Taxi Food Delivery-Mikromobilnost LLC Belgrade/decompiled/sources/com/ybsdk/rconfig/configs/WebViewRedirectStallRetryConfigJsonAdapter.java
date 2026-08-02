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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/rconfig/configs/WebViewRedirectStallRetryConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/WebViewRedirectStallRetryConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "nullableLongAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class WebViewRedirectStallRetryConfigJsonAdapter extends JsonAdapter<WebViewRedirectStallRetryConfig> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("is_enabled", "stall_timeout_ms", "status_check_timeout_ms", "status_check_poll_interval_ms", "init_delay_ms");

    public WebViewRedirectStallRetryConfigJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, "isEnabled");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "stallTimeoutMs");
        this.nullableLongAdapter = moshi.adapter(Long.class, emptySet, "statusCheckTimeoutMs");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final WebViewRedirectStallRetryConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull("isEnabled", "is_enabled", jsonReader);
                }
            } else if (selectName == 1) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull("stallTimeoutMs", "stall_timeout_ms", jsonReader);
                }
            } else if (selectName == 2) {
                l3 = this.nullableLongAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                l4 = this.nullableLongAdapter.fromJson(jsonReader);
            } else if (selectName == 4 && (l2 = this.longAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("initDelayMs", "init_delay_ms", jsonReader);
            }
        }
        jsonReader.endObject();
        Long l5 = l2;
        if (bool == null) {
            throw Util.missingProperty("isEnabled", "is_enabled", jsonReader);
        }
        boolean booleanValue = bool.booleanValue();
        if (l == null) {
            throw Util.missingProperty("stallTimeoutMs", "stall_timeout_ms", jsonReader);
        }
        long longValue = l.longValue();
        if (l5 != null) {
            return new WebViewRedirectStallRetryConfig(booleanValue, longValue, l3, l4, l5.longValue());
        }
        throw Util.missingProperty("initDelayMs", "init_delay_ms", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, WebViewRedirectStallRetryConfig webViewRedirectStallRetryConfig) {
        WebViewRedirectStallRetryConfig webViewRedirectStallRetryConfig2 = webViewRedirectStallRetryConfig;
        if (webViewRedirectStallRetryConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("is_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(webViewRedirectStallRetryConfig2.isEnabled()));
        jsonWriter.name("stall_timeout_ms");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(webViewRedirectStallRetryConfig2.getStallTimeoutMs()));
        jsonWriter.name("status_check_timeout_ms");
        this.nullableLongAdapter.toJson(jsonWriter, (JsonWriter) webViewRedirectStallRetryConfig2.getStatusCheckTimeoutMs());
        jsonWriter.name("status_check_poll_interval_ms");
        this.nullableLongAdapter.toJson(jsonWriter, (JsonWriter) webViewRedirectStallRetryConfig2.getStatusCheckPollIntervalMs());
        jsonWriter.name("init_delay_ms");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(webViewRedirectStallRetryConfig2.getInitDelayMs()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(53, "GeneratedJsonAdapter(WebViewRedirectStallRetryConfig)");
    }
}
