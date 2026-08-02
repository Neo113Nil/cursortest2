package ru.ok.android.api.json.dom;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import ru.ok.android.api.json.JsonWriter;

/* loaded from: classes9.dex */
public final class DomJsonWriters {
    private DomJsonWriters() {
    }

    public static void domArrayValue(@Nullable Iterable<?> iterable, @NonNull JsonWriter jsonWriter) throws IOException {
        if (iterable == null) {
            jsonWriter.nullValue();
        } else {
            domCollectionValue(iterable, jsonWriter);
        }
    }

    private static void domCollectionValue(@NonNull Iterable<?> iterable, @NonNull JsonWriter jsonWriter) throws IOException {
        jsonWriter.beginArray();
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            domValue(it.next(), jsonWriter);
        }
        jsonWriter.endArray();
    }

    private static void domMapValue(@NonNull Map<?, ?> map, @NonNull JsonWriter jsonWriter) throws IOException {
        jsonWriter.beginObject();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key == null) {
                throw new DomSerializeException("Cannot serialize map with null keys");
            }
            try {
                jsonWriter.name((String) key);
                domValue(entry.getValue(), jsonWriter);
            } catch (ClassCastException unused) {
                throw new DomSerializeException("Cannot serialize map with non-string keys");
            }
        }
        jsonWriter.endObject();
    }

    public static void domObjectValue(@Nullable Map<String, ?> map, @NonNull JsonWriter jsonWriter) throws IOException {
        if (map == null) {
            jsonWriter.nullValue();
        } else {
            domMapValue(map, jsonWriter);
        }
    }

    public static void domValue(@Nullable Object obj, @NonNull JsonWriter jsonWriter) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Iterable) {
            domCollectionValue((Iterable<?>) obj, jsonWriter);
            return;
        }
        if (obj instanceof Map) {
            domMapValue((Map) obj, jsonWriter);
        } else {
            if (obj instanceof Object[]) {
                domCollectionValue((Object[]) obj, jsonWriter);
                return;
            }
            throw new DomSerializeException("Cannot convert " + obj.getClass().getName() + " to json");
        }
    }

    public static void domArrayValue(@Nullable Object[] objArr, @NonNull JsonWriter jsonWriter) throws IOException {
        if (objArr == null) {
            jsonWriter.nullValue();
        } else {
            domCollectionValue(objArr, jsonWriter);
        }
    }

    private static void domCollectionValue(@NonNull Object[] objArr, @NonNull JsonWriter jsonWriter) throws IOException {
        jsonWriter.beginArray();
        for (Object obj : objArr) {
            domValue(obj, jsonWriter);
        }
        jsonWriter.endArray();
    }
}
