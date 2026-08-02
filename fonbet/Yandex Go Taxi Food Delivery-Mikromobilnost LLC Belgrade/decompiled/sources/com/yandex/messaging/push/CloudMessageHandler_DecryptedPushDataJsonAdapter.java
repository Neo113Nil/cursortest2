package com.yandex.messaging.push;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.internal.entities.JsonString;
import defpackage.ny61;
import defpackage.uw51;
import java.util.Collections;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/messaging/push/CloudMessageHandler_DecryptedPushDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/push/CloudMessageHandler$DecryptedPushData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAtJsonStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CloudMessageHandler_DecryptedPushDataJsonAdapter extends JsonAdapter<CloudMessageHandler$DecryptedPushData> {
    public static final int $stable = 8;
    private final JsonReader.Options options = JsonReader.Options.of("messenger");
    private final JsonAdapter<String> stringAtJsonStringAdapter;

    public CloudMessageHandler_DecryptedPushDataJsonAdapter(Moshi moshi) {
        this.stringAtJsonStringAdapter = moshi.adapter(String.class, Collections.singleton(new JsonString() { // from class: com.yandex.messaging.push.CloudMessageHandler_DecryptedPushDataJsonAdapter.a
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return JsonString.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof JsonString;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return "@com.yandex.messaging.internal.entities.JsonString()";
            }
        }), "messenger");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CloudMessageHandler$DecryptedPushData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (str = this.stringAtJsonStringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("messenger", "messenger", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new CloudMessageHandler$DecryptedPushData(str);
        }
        throw Util.missingProperty("messenger", "messenger", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CloudMessageHandler$DecryptedPushData cloudMessageHandler$DecryptedPushData) {
        CloudMessageHandler$DecryptedPushData cloudMessageHandler$DecryptedPushData2 = cloudMessageHandler$DecryptedPushData;
        if (cloudMessageHandler$DecryptedPushData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("messenger");
        this.stringAtJsonStringAdapter.toJson(jsonWriter, (JsonWriter) cloudMessageHandler$DecryptedPushData2.getMessenger());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(59, "GeneratedJsonAdapter(CloudMessageHandler.DecryptedPushData)");
    }
}
