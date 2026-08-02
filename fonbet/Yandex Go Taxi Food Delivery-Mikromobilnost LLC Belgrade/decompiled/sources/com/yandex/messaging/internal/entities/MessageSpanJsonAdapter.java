package com.yandex.messaging.internal.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/yandex/messaging/internal/entities/MessageSpanJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/internal/entities/MessageSpan;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "messaging-core-entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessageSpanJsonAdapter extends JsonAdapter<MessageSpan> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("start", "end", "flags", LaunchBrowserActivity.KEY_URI);
    private final JsonAdapter<String> stringAdapter;

    public MessageSpanJsonAdapter(Moshi moshi) {
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.intAdapter = moshi.adapter(cls, emptySet, "start");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "strUri");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MessageSpan fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("start", "start", jsonReader);
                }
            } else if (selectName == 1) {
                num2 = this.intAdapter.fromJson(jsonReader);
                if (num2 == null) {
                    throw Util.unexpectedNull("end", "end", jsonReader);
                }
            } else if (selectName == 2) {
                num3 = this.intAdapter.fromJson(jsonReader);
                if (num3 == null) {
                    throw Util.unexpectedNull("flags", "flags", jsonReader);
                }
            } else if (selectName == 3 && (str = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("strUri", LaunchBrowserActivity.KEY_URI, jsonReader);
            }
        }
        jsonReader.endObject();
        if (num == null) {
            throw Util.missingProperty("start", "start", jsonReader);
        }
        int intValue = num.intValue();
        if (num2 == null) {
            throw Util.missingProperty("end", "end", jsonReader);
        }
        int intValue2 = num2.intValue();
        if (num3 == null) {
            throw Util.missingProperty("flags", "flags", jsonReader);
        }
        int intValue3 = num3.intValue();
        if (str != null) {
            return new MessageSpan(intValue, intValue2, intValue3, str);
        }
        throw Util.missingProperty("strUri", LaunchBrowserActivity.KEY_URI, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MessageSpan messageSpan) {
        MessageSpan messageSpan2 = messageSpan;
        if (messageSpan2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("start");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(messageSpan2.getStart()));
        jsonWriter.name("end");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(messageSpan2.getEnd()));
        jsonWriter.name("flags");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(messageSpan2.getFlags()));
        jsonWriter.name(LaunchBrowserActivity.KEY_URI);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) messageSpan2.getStrUri());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(33, "GeneratedJsonAdapter(MessageSpan)");
    }
}
