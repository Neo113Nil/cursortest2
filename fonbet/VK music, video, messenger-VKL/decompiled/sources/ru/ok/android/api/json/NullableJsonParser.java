package ru.ok.android.api.json;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes9.dex */
public class NullableJsonParser<T> implements JsonParser<T> {
    private final JsonParser<? extends T> delegate;

    private NullableJsonParser(@NonNull JsonParser<? extends T> jsonParser) {
        this.delegate = jsonParser;
    }

    @NonNull
    public static <T> JsonParser<T> wrap(@NonNull JsonParser<? extends T> jsonParser) {
        return new NullableJsonParser(jsonParser);
    }

    @Override // ru.ok.android.api.json.JsonParser
    @Nullable
    public T parse(@NonNull JsonReader jsonReader) throws IOException, JsonParseException {
        return (T) JsonParsers.parseNullable(jsonReader, this.delegate);
    }
}
