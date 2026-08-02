package ru.ok.android.api.json;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public class EmptyListJsonParser<T> implements JsonParser<List<T>> {
    private final JsonParser<? extends T> delegate;

    private EmptyListJsonParser(@NonNull JsonParser<? extends T> jsonParser) {
        this.delegate = jsonParser;
    }

    @NonNull
    public static <T> JsonParser<List<T>> wrap(@NonNull JsonParser<? extends T> jsonParser) {
        return new EmptyListJsonParser(jsonParser);
    }

    @Override // ru.ok.android.api.json.JsonParser
    public List<T> parse(@NonNull JsonReader jsonReader) throws IOException, JsonParseException {
        if (jsonReader.peek() != 110) {
            return JsonParsers.parseList(jsonReader, this.delegate);
        }
        jsonReader.skipValue();
        return Collections.EMPTY_LIST;
    }
}
