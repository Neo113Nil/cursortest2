package ru.ok.android.api.json.dom;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ru.ok.android.api.json.JsonReader;
import ru.ok.android.api.json.JsonStateException;
import ru.ok.android.api.json.JsonTypeMismatchException;

/* loaded from: classes9.dex */
public final class DomJsonReaders {
    private DomJsonReaders() {
    }

    @NonNull
    public static List<Object> domArrayValue(@NonNull JsonReader jsonReader) throws IOException, JsonTypeMismatchException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(domValue(jsonReader));
        }
        jsonReader.endArray();
        return arrayList;
    }

    @NonNull
    public static Map<String, Object> domObjectValue(@NonNull JsonReader jsonReader) throws IOException, JsonTypeMismatchException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            linkedHashMap.put(jsonReader.name(), domValue(jsonReader));
        }
        jsonReader.endObject();
        return linkedHashMap;
    }

    @Nullable
    public static Object domValue(@NonNull JsonReader jsonReader) throws IOException {
        try {
            int peek = jsonReader.peek();
            if (peek == 34) {
                return jsonReader.stringValue();
            }
            if (peek == 49) {
                return jsonReader.numberValue();
            }
            if (peek == 91) {
                return domArrayValue(jsonReader);
            }
            if (peek == 98) {
                return Boolean.valueOf(jsonReader.booleanValue());
            }
            if (peek == 110) {
                jsonReader.skipValue();
                return null;
            }
            if (peek == 123) {
                return domObjectValue(jsonReader);
            }
            throw JsonStateException.notAtValue(jsonReader.peek());
        } catch (JsonTypeMismatchException e) {
            throw new AssertionError(e);
        }
    }
}
