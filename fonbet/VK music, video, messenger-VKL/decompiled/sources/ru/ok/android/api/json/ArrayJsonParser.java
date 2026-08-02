package ru.ok.android.api.json;

import androidx.annotation.NonNull;
import java.io.IOException;

/* loaded from: classes9.dex */
public abstract class ArrayJsonParser<A, T> implements JsonParser<T> {
    public abstract void accumulateValue(A a, int i, @NonNull JsonReader jsonReader) throws JsonParseException, IOException;

    public abstract T convertResult(A a) throws JsonParseException;

    public abstract A createAccumulator();

    @Override // ru.ok.android.api.json.JsonParser
    public final T parse(@NonNull JsonReader jsonReader) throws IOException, JsonParseException {
        A createAccumulator = createAccumulator();
        jsonReader.beginArray();
        int i = 0;
        while (jsonReader.hasNext()) {
            accumulateValue(createAccumulator, i, jsonReader);
            i++;
        }
        jsonReader.endArray();
        return convertResult(createAccumulator);
    }
}
