package ru.ok.android.api.json;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import ru.ok.android.api.json.MapJsonParser;
import ru.ok.android.commons.util.Promise;
import xsna.cay;
import xsna.day;
import xsna.eay;
import xsna.fay;
import xsna.utu;

/* loaded from: classes9.dex */
public class JsonParsers {
    private static final JsonParser<Void> SKIP_PARSER = new JsonParser<Void>() { // from class: ru.ok.android.api.json.JsonParsers.1
        @Override // ru.ok.android.api.json.JsonParser
        public Void parse(@NonNull JsonReader jsonReader) throws IOException, JsonParseException {
            jsonReader.skipValue();
            return null;
        }
    };
    private static final JsonParser<Void> VOID_PARSER = new JsonParser<Void>() { // from class: ru.ok.android.api.json.JsonParsers.2
        @Override // ru.ok.android.api.json.JsonParser
        public Void parse(@NonNull JsonReader jsonReader) throws IOException, JsonParseException {
            if (jsonReader.peek() == 0) {
                return null;
            }
            return (Void) JsonParsers.SKIP_PARSER.parse(jsonReader);
        }
    };
    private static final JsonParser<long[]> LONG_ARRAY_PARSER = new JsonParser<long[]>() { // from class: ru.ok.android.api.json.JsonParsers.3
        @Override // ru.ok.android.api.json.JsonParser
        public long[] parse(@NonNull JsonReader jsonReader) throws IOException, JsonParseException {
            long[] jArr = new long[10];
            jsonReader.beginArray();
            int i = 0;
            while (jsonReader.hasNext()) {
                if (i >= jArr.length) {
                    jArr = Arrays.copyOf(jArr, jArr.length * 2);
                }
                try {
                    jArr[i] = jsonReader.longValue();
                    i++;
                } catch (NumberFormatException e) {
                    throw new JsonParseException(e);
                }
            }
            jsonReader.endArray();
            return i < jArr.length ? Arrays.copyOf(jArr, i) : jArr;
        }
    };
    private static final JsonParser<String[]> STRING_ARRAY_PARSER = new ArrayJsonParser<ArrayList<String>, String[]>() { // from class: ru.ok.android.api.json.JsonParsers.4
        @Override // ru.ok.android.api.json.ArrayJsonParser
        public void accumulateValue(@NonNull ArrayList<String> arrayList, int i, @NonNull JsonReader jsonReader) throws JsonParseException, IOException {
            arrayList.add(jsonReader.stringValue());
        }

        @Override // ru.ok.android.api.json.ArrayJsonParser
        public String[] convertResult(ArrayList<String> arrayList) throws JsonParseException {
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }

        @Override // ru.ok.android.api.json.ArrayJsonParser
        @NonNull
        public ArrayList<String> createAccumulator() {
            return new ArrayList<>();
        }
    };
    private static final JsonParser<List<String>> STRING_LIST_PARSER = new ListJsonParser<String>() { // from class: ru.ok.android.api.json.JsonParsers.5
        @Override // ru.ok.android.api.json.ListJsonParser
        public String parseValue(int i, @NonNull JsonReader jsonReader) throws JsonParseException, IOException {
            return jsonReader.stringValue();
        }
    };
    private static final JsonParser<Map<String, String>> STRING_MAP_PARSER = new MapJsonParser.WithStringKeys<String>() { // from class: ru.ok.android.api.json.JsonParsers.6
        @Override // ru.ok.android.api.json.MapJsonParser
        public String parseValue(@NonNull String str, @NonNull JsonReader jsonReader) throws JsonParseException, IOException {
            return jsonReader.stringValue();
        }
    };
    private static final JsonParser<Map<String, Boolean>> STRING_BOOLEAN_MAP_PARSER = new MapJsonParser.WithStringKeys<Boolean>() { // from class: ru.ok.android.api.json.JsonParsers.7
        @Override // ru.ok.android.api.json.MapJsonParser
        public Boolean parseValue(@NonNull String str, @NonNull JsonReader jsonReader) throws JsonParseException, IOException {
            return Boolean.valueOf(jsonReader.booleanValue());
        }
    };
    private static final JsonParser<Map<String, Integer>> INT_MAP_PARSER = new MapJsonParser.WithStringKeys<Integer>() { // from class: ru.ok.android.api.json.JsonParsers.8
        @Override // ru.ok.android.api.json.MapJsonParser
        public Integer parseValue(@NonNull String str, @NonNull JsonReader jsonReader) throws IOException, JsonTypeMismatchException {
            return Integer.valueOf(jsonReader.intValue());
        }
    };

    public static JsonParser<Boolean> booleanParser() {
        return new cay();
    }

    @NonNull
    public static JsonParser<Map<String, Integer>> intMapParser() {
        return INT_MAP_PARSER;
    }

    public static JsonParser<Integer> intParser() {
        return new eay();
    }

    @NonNull
    public static JsonParser<long[]> longArrayParser() {
        return LONG_ARRAY_PARSER;
    }

    public static JsonParser<Long> longParser() {
        return new day();
    }

    public static <T> void parseCollectionInto(@NonNull Collection<T> collection, @NonNull JsonReader jsonReader, @NonNull JsonParser<? extends T> jsonParser) throws IOException, JsonParseException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            collection.add(jsonParser.parse(jsonReader));
        }
        jsonReader.endArray();
    }

    @NonNull
    public static <T> List<T> parseList(@NonNull JsonReader jsonReader, @NonNull JsonParser<? extends T> jsonParser) throws JsonParseException, IOException {
        ArrayList arrayList = new ArrayList();
        parseCollectionInto(arrayList, jsonReader, jsonParser);
        return arrayList;
    }

    @Nullable
    public static <T> T parseNullable(@NonNull JsonReader jsonReader, @NonNull JsonParser<T> jsonParser) throws JsonParseException, IOException {
        if (jsonReader.peek() != 110) {
            return jsonParser.parse(jsonReader);
        }
        jsonReader.skipValue();
        return null;
    }

    @NonNull
    public static <T> Promise<T> parsePromise(@NonNull JsonReader jsonReader, @NonNull Class<? extends T> cls) throws IOException {
        return jsonReader.refer(jsonReader.stringValue(), cls);
    }

    public static <T> void parsePromiseCollectionInto(@NonNull Collection<Promise<T>> collection, @NonNull JsonReader jsonReader, @NonNull Class<? extends T> cls) throws IOException, JsonTypeMismatchException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            collection.add(parsePromise(jsonReader, cls));
        }
        jsonReader.endArray();
    }

    public static <T> List<Promise<T>> parsePromiseList(@NonNull JsonReader jsonReader, @NonNull Class<? extends T> cls) throws IOException, JsonParseException {
        ArrayList arrayList = new ArrayList();
        parsePromiseCollectionInto(arrayList, jsonReader, cls);
        return arrayList;
    }

    @NonNull
    public static JsonParser<String> reprParser() {
        return new fay();
    }

    @NonNull
    public static JsonParser<Void> skipParser() {
        return SKIP_PARSER;
    }

    @NonNull
    public static JsonParser<String[]> stringArrayParser() {
        return STRING_ARRAY_PARSER;
    }

    @NonNull
    public static JsonParser<Map<String, Boolean>> stringBooleanMapParser() {
        return STRING_BOOLEAN_MAP_PARSER;
    }

    @NonNull
    public static JsonParser<List<String>> stringListParser() {
        return STRING_LIST_PARSER;
    }

    @NonNull
    public static JsonParser<Map<String, String>> stringMapParser() {
        return STRING_MAP_PARSER;
    }

    @NonNull
    public static JsonParser<String> stringParser() {
        return new utu(1);
    }

    @NonNull
    public static JsonParser<Void> voidParser() {
        return VOID_PARSER;
    }
}
