package ru.ok.android.externcalls.sdk.api;

import androidx.annotation.NonNull;
import java.io.IOException;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonReader;
import xsna.i5s;

/* loaded from: classes9.dex */
public final class UnwrappingParser<T> implements JsonParser<T> {

    @NonNull
    private final String fieldName;

    @NonNull
    private final JsonParser<T> valueParser;

    public UnwrappingParser(@NonNull String str, @NonNull JsonParser<T> jsonParser) {
        this.fieldName = str;
        this.valueParser = jsonParser;
    }

    @Override // ru.ok.android.api.json.JsonParser
    public T parse(@NonNull JsonReader jsonReader) throws IOException, JsonParseException {
        jsonReader.beginObject();
        T t = null;
        while (jsonReader.hasNext()) {
            if (this.fieldName.equals(jsonReader.name())) {
                t = this.valueParser.parse(jsonReader);
            }
        }
        jsonReader.endObject();
        if (t != null) {
            return t;
        }
        throw new JsonParseException(i5s.a(new StringBuilder("\""), this.fieldName, "\" not found"));
    }
}
