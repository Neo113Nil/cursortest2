package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/yandex/messaging/core/net/entities/YaDiskInfoDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/YaDiskInfoData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableLongAdapter", "Lcom/squareup/moshi/JsonAdapter;", "longAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class YaDiskInfoDataJsonAdapter extends JsonAdapter<YaDiskInfoData> {
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("trash_space", "total_space", "used_space");

    public YaDiskInfoDataJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableLongAdapter = moshi.adapter(Long.class, emptySet, "trashSize");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "totalSpace");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final YaDiskInfoData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                l3 = this.nullableLongAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull("totalSpace", "total_space", jsonReader);
                }
            } else if (selectName == 2 && (l2 = this.longAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("usedSpace", "used_space", jsonReader);
            }
        }
        jsonReader.endObject();
        Long l4 = l2;
        if (l == null) {
            throw Util.missingProperty("totalSpace", "total_space", jsonReader);
        }
        long longValue = l.longValue();
        if (l4 != null) {
            return new YaDiskInfoData(l3, longValue, l4.longValue());
        }
        throw Util.missingProperty("usedSpace", "used_space", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, YaDiskInfoData yaDiskInfoData) {
        YaDiskInfoData yaDiskInfoData2 = yaDiskInfoData;
        if (yaDiskInfoData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("trash_space");
        this.nullableLongAdapter.toJson(jsonWriter, (JsonWriter) yaDiskInfoData2.getTrashSize());
        jsonWriter.name("total_space");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(yaDiskInfoData2.getTotalSpace()));
        jsonWriter.name("used_space");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(yaDiskInfoData2.getUsedSpace()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(36, "GeneratedJsonAdapter(YaDiskInfoData)");
    }
}
