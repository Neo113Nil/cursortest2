package com.ybsdk.feature.divkit.internal.domain;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.divkit.internal.domain.DownloadPayload;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/domain/DownloadPayload_PollingDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/divkit/internal/domain/DownloadPayload$PollingData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DownloadPayload_PollingDataJsonAdapter extends JsonAdapter<DownloadPayload.PollingData> {
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("timeout_ms", "interval_ms");

    public DownloadPayload_PollingDataJsonAdapter(Moshi moshi) {
        this.longAdapter = moshi.adapter(Long.TYPE, EmptySet.a, "timeoutMs");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DownloadPayload.PollingData fromJson(JsonReader jsonReader) {
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
                    throw Util.unexpectedNull("timeoutMs", "timeout_ms", jsonReader);
                }
            } else if (selectName == 1 && (l2 = this.longAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("intervalMs", "interval_ms", jsonReader);
            }
        }
        jsonReader.endObject();
        if (l == null) {
            throw Util.missingProperty("timeoutMs", "timeout_ms", jsonReader);
        }
        long longValue = l.longValue();
        if (l2 != null) {
            return new DownloadPayload.PollingData(longValue, l2.longValue());
        }
        throw Util.missingProperty("intervalMs", "interval_ms", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DownloadPayload.PollingData pollingData) {
        DownloadPayload.PollingData pollingData2 = pollingData;
        if (pollingData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("timeout_ms");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(pollingData2.getTimeoutMs()));
        jsonWriter.name("interval_ms");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(pollingData2.getIntervalMs()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(DownloadPayload.PollingData)");
    }
}
