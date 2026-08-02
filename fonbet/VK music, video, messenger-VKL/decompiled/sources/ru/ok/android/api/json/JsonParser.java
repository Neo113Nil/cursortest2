package ru.ok.android.api.json;

import androidx.annotation.NonNull;
import java.io.IOException;

/* loaded from: classes9.dex */
public interface JsonParser<T> {
    T parse(@NonNull JsonReader jsonReader) throws IOException, JsonParseException;
}
