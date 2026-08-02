package ru.ok.android.api.json;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Reader;

/* loaded from: classes9.dex */
public interface JsonWriter extends Flushable, Closeable {
    void beginArray() throws IOException;

    void beginObject() throws IOException;

    void close() throws IOException;

    void comment(@NonNull String str) throws IOException;

    void comment(@NonNull String str, Object... objArr) throws IOException;

    void endArray() throws IOException;

    void endObject() throws IOException;

    @Override // java.io.Flushable
    void flush() throws IOException;

    void jsonValue(@NonNull Reader reader) throws IOException;

    @NonNull
    JsonWriter name(@NonNull String str) throws IOException;

    void nullValue() throws IOException;

    void nullableValue(@Nullable String str) throws IOException;

    void value(double d) throws IOException;

    void value(int i) throws IOException;

    void value(long j) throws IOException;

    void value(@NonNull Number number) throws IOException;

    void value(@NonNull String str) throws IOException;

    void value(boolean z) throws IOException;
}
