package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/ErrorInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/ErrorInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "", "longAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ErrorInfoJsonAdapter extends JsonAdapter<ErrorInfo> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("Message", "WorkerId", "TimeMcs", "RetryAfter");
    private final JsonAdapter<String> stringAdapter;

    public ErrorInfoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, Constants.KEY_MESSAGE);
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "workerId");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "timeMcs");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ErrorInfo fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        Long l = null;
        String str = null;
        Long l2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull(Constants.KEY_MESSAGE, "Message", jsonReader);
                }
            } else if (selectName == 1) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("workerId", "WorkerId", jsonReader);
                }
            } else if (selectName == 2) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull("timeMcs", "TimeMcs", jsonReader);
                }
            } else if (selectName == 3 && (l2 = this.longAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("retryAfter", "RetryAfter", jsonReader);
            }
        }
        jsonReader.endObject();
        Long l3 = l;
        if (str == null) {
            throw Util.missingProperty(Constants.KEY_MESSAGE, "Message", jsonReader);
        }
        if (num == null) {
            throw Util.missingProperty("workerId", "WorkerId", jsonReader);
        }
        int intValue = num.intValue();
        if (l3 == null) {
            throw Util.missingProperty("timeMcs", "TimeMcs", jsonReader);
        }
        long longValue = l3.longValue();
        if (l2 != null) {
            return new ErrorInfo(str, intValue, longValue, l2.longValue());
        }
        throw Util.missingProperty("retryAfter", "RetryAfter", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ErrorInfo errorInfo) {
        ErrorInfo errorInfo2 = errorInfo;
        if (errorInfo2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("Message");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) errorInfo2.getMessage());
        jsonWriter.name("WorkerId");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(errorInfo2.getWorkerId()));
        jsonWriter.name("TimeMcs");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(errorInfo2.getTimeMcs()));
        jsonWriter.name("RetryAfter");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(errorInfo2.getRetryAfter()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(31, "GeneratedJsonAdapter(ErrorInfo)");
    }
}
