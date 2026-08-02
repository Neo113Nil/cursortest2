package com.ybsdk.core.common.data.cache;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/core/common/data/cache/StoredLayoutInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/cache/StoredLayoutInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "", "booleanAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class StoredLayoutInfoJsonAdapter extends JsonAdapter<StoredLayoutInfo> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<StoredLayoutInfo> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("ttl", "receivedAt", "hash", "stale", "version");
    private final JsonAdapter<String> stringAdapter;

    public StoredLayoutInfoJsonAdapter(Moshi moshi) {
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.longAdapter = moshi.adapter(cls, emptySet, "ttl");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "hash");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "stale");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "version");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final StoredLayoutInfo fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Long l = null;
        Long l2 = null;
        Boolean bool = null;
        Integer num = null;
        String str = null;
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
                    throw Util.unexpectedNull("hash", "hash", jsonReader);
                }
            } else if (selectName == 3) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull("stale", "stale", jsonReader);
                }
            } else if (selectName == 4 && (num = this.intAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("version", "version", jsonReader);
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
            throw Util.missingProperty("hash", "hash", jsonReader);
        }
        if (bool2 == null) {
            throw Util.missingProperty("stale", "stale", jsonReader);
        }
        boolean booleanValue = bool2.booleanValue();
        if (num != null) {
            return new StoredLayoutInfo(longValue, longValue2, str, booleanValue, num.intValue(), null, 32, null);
        }
        throw Util.missingProperty("version", "version", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, StoredLayoutInfo storedLayoutInfo) {
        StoredLayoutInfo storedLayoutInfo2 = storedLayoutInfo;
        if (storedLayoutInfo2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("ttl");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(storedLayoutInfo2.getTtl()));
        jsonWriter.name("receivedAt");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(storedLayoutInfo2.getReceivedAt()));
        jsonWriter.name("hash");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) storedLayoutInfo2.getHash());
        jsonWriter.name("stale");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(storedLayoutInfo2.getStale()));
        jsonWriter.name("version");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(storedLayoutInfo2.getVersion()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(StoredLayoutInfo)");
    }
}
