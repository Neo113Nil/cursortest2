package ru.ok.android.api.json;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;

/* loaded from: classes9.dex */
public class JsonWriterJackson implements Closeable {
    private static final JsonFactory FACTORY = new JsonFactory();

    @NonNull
    private final JsonGenerator jsonGenerator;

    private JsonWriterJackson(@NonNull OutputStream outputStream) throws IOException {
        this.jsonGenerator = FACTORY.c(outputStream, JsonEncoding.UTF8);
    }

    public static JsonWriterJackson create(@NonNull OutputStream outputStream) throws IOException {
        return new JsonWriterJackson(outputStream);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.jsonGenerator.close();
    }

    public void endArray() throws IOException {
        this.jsonGenerator.m();
    }

    public void endObject() throws IOException {
        this.jsonGenerator.n();
    }

    public void startArray() throws IOException {
        this.jsonGenerator.y();
    }

    public void startObject() throws IOException {
        this.jsonGenerator.z();
    }

    public void writeBooleanField(String str, boolean z) throws IOException {
        JsonGenerator jsonGenerator = this.jsonGenerator;
        jsonGenerator.o(str);
        jsonGenerator.k(z);
    }

    public void writeNullField(String str) throws IOException {
        JsonGenerator jsonGenerator = this.jsonGenerator;
        jsonGenerator.o(str);
        jsonGenerator.p();
    }

    public void writeNumberField(String str, int i) throws IOException {
        JsonGenerator jsonGenerator = this.jsonGenerator;
        jsonGenerator.o(str);
        jsonGenerator.s(i);
    }

    public void writeStringField(@NonNull String str, @NonNull String str2) throws IOException {
        JsonGenerator jsonGenerator = this.jsonGenerator;
        jsonGenerator.o(str);
        jsonGenerator.A(str2);
    }

    public void writeNumberField(String str, long j) throws IOException {
        JsonGenerator jsonGenerator = this.jsonGenerator;
        jsonGenerator.o(str);
        jsonGenerator.t(j);
    }

    public void writeNumberField(String str, double d) throws IOException {
        JsonGenerator jsonGenerator = this.jsonGenerator;
        jsonGenerator.o(str);
        jsonGenerator.q(d);
    }

    public void writeNumberField(String str, float f) throws IOException {
        JsonGenerator jsonGenerator = this.jsonGenerator;
        jsonGenerator.o(str);
        jsonGenerator.r(f);
    }

    public void writeNumberField(String str, BigDecimal bigDecimal) throws IOException {
        JsonGenerator jsonGenerator = this.jsonGenerator;
        jsonGenerator.o(str);
        jsonGenerator.v(bigDecimal);
    }
}
