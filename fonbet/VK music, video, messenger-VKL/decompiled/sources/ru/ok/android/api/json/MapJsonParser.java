package ru.ok.android.api.json;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class MapJsonParser<K, V> extends ObjectJsonParser<LinkedHashMap<K, V>, Map<K, V>> {

    public static abstract class WithStringKeys<V> extends MapJsonParser<String, V> {
        @Override // ru.ok.android.api.json.MapJsonParser, ru.ok.android.api.json.ObjectJsonParser
        public /* bridge */ /* synthetic */ void accumulateValue(@NonNull Object obj, @NonNull String str, @NonNull JsonReader jsonReader) throws JsonParseException, IOException {
            accumulateValue((LinkedHashMap) obj, str, jsonReader);
        }

        @Override // ru.ok.android.api.json.MapJsonParser
        public final String convertName(@NonNull String str) throws JsonParseException {
            return str;
        }

        @Override // ru.ok.android.api.json.MapJsonParser, ru.ok.android.api.json.ObjectJsonParser
        @NonNull
        public /* bridge */ /* synthetic */ Object convertResult(@NonNull Object obj) throws JsonParseException {
            return convertResult((LinkedHashMap) obj);
        }

        @Override // ru.ok.android.api.json.MapJsonParser, ru.ok.android.api.json.ObjectJsonParser
        @NonNull
        public /* bridge */ /* synthetic */ Object createAccumulator() {
            return createAccumulator();
        }
    }

    public static final class Wrapped<V> extends WithStringKeys<V> {
        private final JsonParser<V> parser;

        public Wrapped(JsonParser<V> jsonParser) {
            this.parser = jsonParser;
        }

        @Override // ru.ok.android.api.json.MapJsonParser
        public V parseValue(@NonNull String str, @NonNull JsonReader jsonReader) throws JsonParseException, IOException {
            return this.parser.parse(jsonReader);
        }
    }

    public static <V> JsonParser<Map<String, V>> wrap(@NonNull JsonParser<V> jsonParser) {
        return new Wrapped(jsonParser);
    }

    public abstract K convertName(@NonNull String str) throws JsonParseException;

    public abstract V parseValue(@NonNull K k, @NonNull JsonReader jsonReader) throws JsonParseException, IOException;

    @Override // ru.ok.android.api.json.ObjectJsonParser
    public final void accumulateValue(@NonNull LinkedHashMap<K, V> linkedHashMap, @NonNull String str, @NonNull JsonReader jsonReader) throws JsonParseException, IOException {
        K convertName = convertName(str);
        linkedHashMap.put(convertName, parseValue(convertName, jsonReader));
    }

    @Override // ru.ok.android.api.json.ObjectJsonParser
    @NonNull
    public final Map<K, V> convertResult(@NonNull LinkedHashMap<K, V> linkedHashMap) throws JsonParseException {
        checkResult(linkedHashMap);
        return linkedHashMap;
    }

    @Override // ru.ok.android.api.json.ObjectJsonParser
    @NonNull
    public final LinkedHashMap<K, V> createAccumulator() {
        return new LinkedHashMap<>();
    }

    public void checkResult(@NonNull HashMap<K, V> hashMap) throws JsonParseException {
    }
}
