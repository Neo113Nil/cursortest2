package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.MediaMessageListData;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/yandex/messaging/core/net/entities/MediaMessageListData_InfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/MediaMessageListData$Info;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MediaMessageListData_InfoJsonAdapter extends JsonAdapter<MediaMessageListData.Info> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("has_next", "has_prev", "next", "prev");

    public MediaMessageListData_InfoJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, "hasNext");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "next");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MediaMessageListData.Info fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        Boolean bool2 = null;
        Integer num = null;
        Integer num2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull("hasNext", "has_next", jsonReader);
                }
            } else if (selectName == 1) {
                bool2 = this.booleanAdapter.fromJson(jsonReader);
                if (bool2 == null) {
                    throw Util.unexpectedNull("hasPrev", "has_prev", jsonReader);
                }
            } else if (selectName == 2) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("next", "next", jsonReader);
                }
            } else if (selectName == 3 && (num2 = this.intAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("prev", "prev", jsonReader);
            }
        }
        jsonReader.endObject();
        if (bool == null) {
            throw Util.missingProperty("hasNext", "has_next", jsonReader);
        }
        boolean booleanValue = bool.booleanValue();
        if (bool2 == null) {
            throw Util.missingProperty("hasPrev", "has_prev", jsonReader);
        }
        boolean booleanValue2 = bool2.booleanValue();
        if (num == null) {
            throw Util.missingProperty("next", "next", jsonReader);
        }
        int intValue = num.intValue();
        if (num2 != null) {
            return new MediaMessageListData.Info(booleanValue, booleanValue2, intValue, num2.intValue());
        }
        throw Util.missingProperty("prev", "prev", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MediaMessageListData.Info info) {
        MediaMessageListData.Info info2 = info;
        if (info2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("has_next");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(info2.getHasNext()));
        jsonWriter.name("has_prev");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(info2.getHasPrev()));
        jsonWriter.name("next");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(info2.getNext()));
        jsonWriter.name("prev");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(info2.getPrev()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(MediaMessageListData.Info)");
    }
}
