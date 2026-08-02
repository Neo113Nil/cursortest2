package ru.ok.android.api.json.dom;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonReader;
import ru.ok.android.api.json.JsonReaderJackson;
import ru.ok.android.api.json.JsonSyntaxException;

/* loaded from: classes9.dex */
public final class DomJsonParsers {
    private static final JsonParser<Object> DOM_PARSER = new JsonParser<Object>() { // from class: ru.ok.android.api.json.dom.DomJsonParsers.1
        @Override // ru.ok.android.api.json.JsonParser
        public Object parse(@NonNull JsonReader jsonReader) throws IOException, JsonParseException {
            return DomJsonReaders.domValue(jsonReader);
        }
    };
    private static final JsonParser<List<Object>> DOM_ARRAY_PARSER = new JsonParser<List<Object>>() { // from class: ru.ok.android.api.json.dom.DomJsonParsers.2
        @Override // ru.ok.android.api.json.JsonParser
        public List<Object> parse(@NonNull JsonReader jsonReader) throws IOException, JsonParseException {
            return DomJsonReaders.domArrayValue(jsonReader);
        }
    };
    private static final JsonParser<Map<String, Object>> DOM_OBJECT_PARSER = new JsonParser<Map<String, Object>>() { // from class: ru.ok.android.api.json.dom.DomJsonParsers.3
        @Override // ru.ok.android.api.json.JsonParser
        public Map<String, Object> parse(@NonNull JsonReader jsonReader) throws IOException, JsonParseException {
            return DomJsonReaders.domObjectValue(jsonReader);
        }
    };

    private DomJsonParsers() {
    }

    @NonNull
    public static JsonParser<List<Object>> domArrayParser() {
        return DOM_ARRAY_PARSER;
    }

    @NonNull
    public static JsonParser<Map<String, Object>> domObjectParser() {
        return DOM_OBJECT_PARSER;
    }

    @NonNull
    public static JsonParser<Object> domParser() {
        return DOM_PARSER;
    }

    @Nullable
    public static Object fromJsonString(@NonNull String str) throws JsonSyntaxException {
        try {
            return DomJsonReaders.domValue(JsonReaderJackson.create(str));
        } catch (JsonSyntaxException e) {
            throw e;
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
