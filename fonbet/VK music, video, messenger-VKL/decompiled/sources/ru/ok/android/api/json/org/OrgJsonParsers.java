package ru.ok.android.api.json.org;

import androidx.annotation.NonNull;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonReader;

/* loaded from: classes9.dex */
public final class OrgJsonParsers {
    private static final JsonParser<JSONObject> OBJECT_PARSER = new JsonParser<JSONObject>() { // from class: ru.ok.android.api.json.org.OrgJsonParsers.1
        @Override // ru.ok.android.api.json.JsonParser
        @NonNull
        public JSONObject parse(@NonNull JsonReader jsonReader) throws IOException, JsonParseException {
            return OrgJsonReaders.orgJsonObjectValue(jsonReader);
        }
    };
    private static final JsonParser<JSONArray> ARRAY_PARSER = new JsonParser<JSONArray>() { // from class: ru.ok.android.api.json.org.OrgJsonParsers.2
        @Override // ru.ok.android.api.json.JsonParser
        @NonNull
        public JSONArray parse(@NonNull JsonReader jsonReader) throws IOException, JsonParseException {
            return OrgJsonReaders.orgJsonArrayValue(jsonReader);
        }
    };

    private OrgJsonParsers() {
    }

    @NonNull
    public static JsonParser<JSONArray> orgJsonArrayParser() {
        return ARRAY_PARSER;
    }

    @NonNull
    public static JsonParser<JSONObject> orgJsonObjectParser() {
        return OBJECT_PARSER;
    }
}
