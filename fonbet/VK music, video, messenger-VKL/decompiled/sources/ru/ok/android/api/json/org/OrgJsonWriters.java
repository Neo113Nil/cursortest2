package ru.ok.android.api.json.org;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.api.json.JsonWriter;
import xsna.cqi;

/* loaded from: classes9.dex */
public final class OrgJsonWriters {
    private OrgJsonWriters() {
    }

    public static void orgJsonValue(@NonNull JsonWriter jsonWriter, @NonNull JSONObject jSONObject) throws IOException {
        jsonWriter.beginObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            jsonWriter.name(next);
            orgJsonValue(jsonWriter, jSONObject.opt(next));
        }
        jsonWriter.endObject();
    }

    public static void orgJsonValue(@NonNull JsonWriter jsonWriter, @NonNull JSONArray jSONArray) throws IOException {
        jsonWriter.beginArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            orgJsonValue(jsonWriter, jSONArray.opt(i));
        }
        jsonWriter.endArray();
    }

    private static void orgJsonValue(@NonNull JsonWriter jsonWriter, @Nullable Object obj) throws IOException {
        if (obj != null && !(obj instanceof String)) {
            if (obj == JSONObject.NULL) {
                jsonWriter.nullValue();
                return;
            }
            if (obj instanceof Boolean) {
                jsonWriter.value(((Boolean) obj).booleanValue());
                return;
            }
            if (!(obj instanceof Double) && !(obj instanceof Float)) {
                if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof Byte)) {
                    if (obj instanceof JSONObject) {
                        orgJsonValue(jsonWriter, (JSONObject) obj);
                        return;
                    } else {
                        if (obj instanceof JSONArray) {
                            orgJsonValue(jsonWriter, (JSONArray) obj);
                            return;
                        }
                        throw new IllegalArgumentException(cqi.c(obj, "Don't know how to write "));
                    }
                }
                jsonWriter.value(((Number) obj).longValue());
                return;
            }
            jsonWriter.value(((Number) obj).doubleValue());
            return;
        }
        jsonWriter.nullableValue((String) obj);
    }
}
