package com.ybsdk.core.common.data.cache;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/core/common/data/cache/StoredDataEntryJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/cache/StoredDataEntry;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "", "booleanAdapter", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class StoredDataEntryJsonAdapter extends JsonAdapter<StoredDataEntry> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("ttl", "receivedAt", "type", "value", "stale");
    private final JsonAdapter<String> stringAdapter;

    public StoredDataEntryJsonAdapter(Moshi moshi) {
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.longAdapter = moshi.adapter(cls, emptySet, "ttl");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "type");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "stale");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final StoredDataEntry fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Long l = null;
        Long l2 = null;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull("ttl", "ttl", jsonReader);
                }
            } else if (selectName == 1) {
                l2 = this.longAdapter.fromJson(jsonReader);
                if (l2 == null) {
                    throw Util.unexpectedNull("receivedAt", "receivedAt", jsonReader);
                }
            } else if (selectName == 2) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("type", "type", jsonReader);
                }
            } else if (selectName == 3) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("value__", "value", jsonReader);
                }
            } else if (selectName == 4 && (bool = this.booleanAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("stale", "stale", jsonReader);
            }
        }
        jsonReader.endObject();
        Boolean bool2 = bool;
        if (l == null) {
            throw Util.missingProperty("ttl", "ttl", jsonReader);
        }
        long longValue = l.longValue();
        if (l2 == null) {
            throw Util.missingProperty("receivedAt", "receivedAt", jsonReader);
        }
        long longValue2 = l2.longValue();
        if (str == null) {
            throw Util.missingProperty("type", "type", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("value__", "value", jsonReader);
        }
        if (bool2 != null) {
            return new StoredDataEntry(longValue, longValue2, str, str2, bool2.booleanValue());
        }
        throw Util.missingProperty("stale", "stale", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, StoredDataEntry storedDataEntry) {
        StoredDataEntry storedDataEntry2 = storedDataEntry;
        if (storedDataEntry2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("ttl");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(storedDataEntry2.getTtl()));
        jsonWriter.name("receivedAt");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(storedDataEntry2.getReceivedAt()));
        jsonWriter.name("type");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) storedDataEntry2.getType());
        jsonWriter.name("value");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) storedDataEntry2.getValue());
        jsonWriter.name("stale");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(storedDataEntry2.getStale()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(StoredDataEntry)");
    }
}
