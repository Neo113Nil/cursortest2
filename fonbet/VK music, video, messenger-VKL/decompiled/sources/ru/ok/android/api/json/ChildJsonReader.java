package ru.ok.android.api.json;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes9.dex */
final class ChildJsonReader extends AbstractJsonReaderContext {

    @NonNull
    private final JsonReader delegate;

    public ChildJsonReader(@NonNull JsonReader jsonReader) {
        super(new SimpleJsonReaderContext(jsonReader));
        this.delegate = jsonReader;
    }

    @Override // ru.ok.android.api.json.JsonReader
    public void beginArray() throws IOException, JsonTypeMismatchException {
        this.delegate.beginArray();
    }

    @Override // ru.ok.android.api.json.JsonReader
    public void beginObject() throws IOException, JsonTypeMismatchException {
        this.delegate.beginObject();
    }

    @Override // ru.ok.android.api.json.JsonReader
    public boolean booleanValue() throws IOException, JsonTypeMismatchException {
        return this.delegate.booleanValue();
    }

    @Override // ru.ok.android.api.json.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // ru.ok.android.api.json.JsonReader
    public double doubleValue() throws IOException, JsonTypeMismatchException {
        return this.delegate.doubleValue();
    }

    @Override // ru.ok.android.api.json.JsonReader
    public void endArray() throws IOException {
        this.delegate.endArray();
    }

    @Override // ru.ok.android.api.json.JsonReader
    public void endObject() throws IOException {
        this.delegate.endObject();
    }

    @Override // ru.ok.android.api.json.JsonReader
    public boolean hasNext() throws IOException {
        return this.delegate.hasNext();
    }

    @Override // ru.ok.android.api.json.JsonReader
    public int intValue() throws IOException, JsonTypeMismatchException {
        return this.delegate.intValue();
    }

    @Override // ru.ok.android.api.json.JsonReader
    @NonNull
    public String jsonValue() throws IOException {
        return this.delegate.jsonValue();
    }

    @Override // ru.ok.android.api.json.JsonReader
    public long longValue() throws IOException, JsonTypeMismatchException {
        return this.delegate.longValue();
    }

    @Override // ru.ok.android.api.json.JsonReader
    @NonNull
    public String name() throws IOException {
        return this.delegate.name();
    }

    @Override // ru.ok.android.api.json.JsonReader
    @Nullable
    public String nullableStringValue() throws IOException {
        return this.delegate.nullableStringValue();
    }

    @Override // ru.ok.android.api.json.JsonReader
    @NonNull
    public Number numberValue() throws IOException, JsonTypeMismatchException {
        return this.delegate.numberValue();
    }

    @Override // ru.ok.android.api.json.JsonReader
    public int peek() throws IOException {
        return this.delegate.peek();
    }

    @Override // ru.ok.android.api.json.JsonReader
    public void skipValue() throws IOException {
        this.delegate.skipValue();
    }

    @Override // ru.ok.android.api.json.JsonReader
    @NonNull
    public String stringValue() throws IOException {
        return this.delegate.stringValue();
    }
}
