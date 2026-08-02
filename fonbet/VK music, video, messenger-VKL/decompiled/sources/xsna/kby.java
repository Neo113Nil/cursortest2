package xsna;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/* compiled from: JsonTreeWriter.java */
/* loaded from: classes13.dex */
public final class kby extends JsonWriter {
    public static final a e = new a();
    public static final hay f = new hay("closed");
    public final ArrayList b;
    public String c;
    public b9y d;

    /* compiled from: JsonTreeWriter.java */
    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public kby() {
        super(e);
        this.b = new ArrayList();
        this.d = u9y.b;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter beginArray() throws IOException {
        l8y l8yVar = new l8y();
        o(l8yVar);
        this.b.add(l8yVar);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter beginObject() throws IOException {
        x9y x9yVar = new x9y();
        o(x9yVar);
        this.b.add(x9yVar);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.b;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(f);
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter endArray() throws IOException {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty() || this.c != null) {
            throw new IllegalStateException();
        }
        if (!(n() instanceof l8y)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter endObject() throws IOException {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty() || this.c != null) {
            throw new IllegalStateException();
        }
        if (!(n() instanceof x9y)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
        return this;
    }

    public final b9y m() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return this.d;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    public final b9y n() {
        return (b9y) xy9.b(1, this.b);
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter name(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.b.isEmpty() || this.c != null) {
            throw new IllegalStateException();
        }
        if (!(n() instanceof x9y)) {
            throw new IllegalStateException();
        }
        this.c = str;
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter nullValue() throws IOException {
        o(u9y.b);
        return this;
    }

    public final void o(b9y b9yVar) {
        if (this.c != null) {
            b9yVar.getClass();
            if (!(b9yVar instanceof u9y) || getSerializeNulls()) {
                ((x9y) n()).l(b9yVar, this.c);
            }
            this.c = null;
            return;
        }
        if (this.b.isEmpty()) {
            this.d = b9yVar;
            return;
        }
        b9y n = n();
        if (!(n instanceof l8y)) {
            throw new IllegalStateException();
        }
        ((l8y) n).l(b9yVar);
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            o(u9y.b);
            return this;
        }
        o(new hay(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(Number number) throws IOException {
        if (number == null) {
            o(u9y.b);
            return this;
        }
        if (!isLenient()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        o(new hay(number));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(String str) throws IOException {
        if (str == null) {
            o(u9y.b);
            return this;
        }
        o(new hay(str));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(boolean z) throws IOException {
        o(new hay(Boolean.valueOf(z)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(float f2) throws IOException {
        if (!isLenient() && (Float.isNaN(f2) || Float.isInfinite(f2))) {
            throw new IllegalArgumentException(n23.a(f2, "JSON forbids NaN and infinities: "));
        }
        o(new hay(Float.valueOf(f2)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public final void flush() throws IOException {
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(double d) throws IOException {
        if (!isLenient() && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
        o(new hay(Double.valueOf(d)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(long j) throws IOException {
        o(new hay(Long.valueOf(j)));
        return this;
    }
}
