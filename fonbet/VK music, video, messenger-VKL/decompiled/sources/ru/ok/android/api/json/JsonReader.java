package ru.ok.android.api.json;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes9.dex */
public interface JsonReader extends JsonReaderContext, Closeable {
    void beginArray() throws IOException, JsonTypeMismatchException;

    void beginObject() throws IOException, JsonTypeMismatchException;

    boolean booleanValue() throws IOException, JsonTypeMismatchException;

    void close() throws IOException;

    @NonNull
    default JsonReader createChildReader() {
        return new ChildJsonReader(this);
    }

    double doubleValue() throws IOException, JsonTypeMismatchException;

    void endArray() throws IOException;

    void endObject() throws IOException;

    boolean hasNext() throws IOException;

    int intValue() throws IOException, JsonTypeMismatchException;

    @NonNull
    String jsonValue() throws IOException;

    long longValue() throws IOException, JsonTypeMismatchException;

    @NonNull
    String name() throws IOException;

    @Nullable
    String nullableStringValue() throws IOException;

    @NonNull
    Number numberValue() throws IOException, JsonTypeMismatchException;

    int peek() throws IOException;

    void skipValue() throws IOException;

    @NonNull
    String stringValue() throws IOException;
}
