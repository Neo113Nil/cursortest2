package ru.ok.android.api.json;

import androidx.annotation.NonNull;
import java.io.IOException;

/* loaded from: classes9.dex */
public interface JsonSerializer<T> {
    void serialize(@NonNull JsonWriter jsonWriter, T t) throws IOException, JsonSerializeException;
}
