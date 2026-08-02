package ru.ok.android.api.json.org;

import androidx.annotation.NonNull;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.api.json.JsonReader;
import ru.ok.android.api.json.JsonStateException;
import ru.ok.android.api.json.JsonTypeMismatchException;

/* loaded from: classes9.dex */
public final class OrgJsonReaders {
    private OrgJsonReaders() {
    }

    @NonNull
    public static JSONArray orgJsonArrayValue(@NonNull JsonReader jsonReader) throws IOException, JsonTypeMismatchException {
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.peek() != 93) {
            jSONArray.put(orgJsonValue(jsonReader, null));
        }
        jsonReader.endArray();
        return jSONArray;
    }

    @NonNull
    private static Number orgJsonNumberValue(@NonNull JsonReader jsonReader) throws IOException, JsonTypeMismatchException {
        String jsonValue = jsonReader.jsonValue();
        if (jsonValue.indexOf(46) >= 0 || jsonValue.indexOf(101) >= 0 || jsonValue.indexOf(69) >= 0) {
            return Double.valueOf(Double.parseDouble(jsonValue));
        }
        long parseLong = Long.parseLong(jsonValue);
        return (parseLong < -2147483648L || parseLong > 2147483647L) ? Long.valueOf(parseLong) : Integer.valueOf((int) parseLong);
    }

    @NonNull
    public static JSONObject orgJsonObjectValue(@NonNull JsonReader jsonReader) throws IOException, JsonTypeMismatchException {
        try {
            JSONObject jSONObject = new JSONObject();
            jsonReader.beginObject();
            while (jsonReader.peek() != 125) {
                jSONObject.put(jsonReader.name(), orgJsonValue(jsonReader, JSONObject.NULL));
            }
            jsonReader.endObject();
            return jSONObject;
        } catch (JSONException e) {
            throw new AssertionError(e);
        }
    }

    public static Object orgJsonValue(@NonNull JsonReader jsonReader) throws IOException {
        return orgJsonValue(jsonReader, null);
    }

    private static Object orgJsonValue(@NonNull JsonReader jsonReader, Object obj) throws IOException {
        try {
            int peek = jsonReader.peek();
            if (peek == 34) {
                return jsonReader.stringValue();
            }
            if (peek == 49) {
                return orgJsonNumberValue(jsonReader);
            }
            if (peek == 91) {
                return orgJsonArrayValue(jsonReader);
            }
            if (peek == 98) {
                return Boolean.valueOf(jsonReader.booleanValue());
            }
            if (peek == 110) {
                jsonReader.skipValue();
                return obj;
            }
            if (peek == 123) {
                return orgJsonObjectValue(jsonReader);
            }
            throw JsonStateException.notAtValue(peek);
        } catch (JsonTypeMismatchException e) {
            throw new AssertionError(e);
        }
    }
}
