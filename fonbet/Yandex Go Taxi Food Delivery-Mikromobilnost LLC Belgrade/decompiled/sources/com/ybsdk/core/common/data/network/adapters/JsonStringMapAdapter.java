package com.ybsdk.core.common.data.network.adapters;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import defpackage.fex;
import defpackage.gex;
import defpackage.x4c;
import java.io.EOFException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/core/common/data/network/adapters/JsonStringMapAdapter;", "", "Lcom/squareup/moshi/JsonReader;", "reader", "Lfex;", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lfex;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "Lzy11;", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lfex;)V", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class JsonStringMapAdapter {
    public static final JsonStringMapAdapter a = new JsonStringMapAdapter();

    @FromJson
    public final fex fromJson(JsonReader reader) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            reader.beginObject();
            while (reader.hasNext()) {
                String nextName = reader.nextName();
                JsonReader.Token peek = reader.peek();
                int i = peek == null ? -1 : gex.a[peek.ordinal()];
                if (i == 1 || i == 2) {
                    linkedHashMap.put(nextName, reader.nextString());
                } else if (i == 3) {
                    linkedHashMap.put(nextName, String.valueOf(reader.nextBoolean()));
                } else if (i == 4 || i == 5) {
                    linkedHashMap.put(nextName, reader.nextSource().I0());
                } else {
                    reader.skipValue();
                }
            }
            reader.endObject();
        } catch (EOFException e) {
            x4c.g("Exception during fromJson() in JsonStringMap", e, null, null, 12);
        }
        return new fex(linkedHashMap);
    }

    @ToJson
    public final void toJson(JsonWriter writer, fex value) {
        writer.beginObject();
        for (Map.Entry entry : value.a.entrySet()) {
            String str = (String) entry.getKey();
            writer.name(str).value((String) entry.getValue());
        }
        writer.endObject();
    }
}
