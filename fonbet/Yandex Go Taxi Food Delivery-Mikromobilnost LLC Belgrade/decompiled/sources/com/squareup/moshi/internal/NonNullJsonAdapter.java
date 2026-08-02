package com.squareup.moshi.internal;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import defpackage.kbs;
import java.io.IOException;

/* loaded from: classes11.dex */
public final class NonNullJsonAdapter<T> extends JsonAdapter<T> {
    private final JsonAdapter<T> delegate;

    public NonNullJsonAdapter(JsonAdapter<T> jsonAdapter) {
        this.delegate = jsonAdapter;
    }

    public JsonAdapter<T> delegate() {
        return this.delegate;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public T fromJson(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() != JsonReader.Token.NULL) {
            return this.delegate.fromJson(jsonReader);
        }
        kbs.s(jsonReader.getPath(), "Unexpected null at ");
        return null;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, T t) throws IOException {
        if (t != null) {
            this.delegate.toJson(jsonWriter, (JsonWriter) t);
        } else {
            kbs.s(jsonWriter.getPath(), "Unexpected null at ");
        }
    }

    public String toString() {
        return this.delegate + ".nonNull()";
    }
}
