package xsna;

import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import io.jsonwebtoken.JwtParser;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JsonTreeReader.java */
/* loaded from: classes.dex */
public final class gby extends JsonReader {
    public static final a f = new a();
    public static final Object g = new Object();
    public Object[] b;
    public int c;
    public String[] d;
    public int[] e;

    /* compiled from: JsonTreeReader.java */
    /* loaded from: classes13.dex */
    public class a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    }

    public final void b(JsonToken jsonToken) throws IOException {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + m());
    }

    @Override // com.google.gson.stream.JsonReader
    public final void beginArray() throws IOException {
        b(JsonToken.BEGIN_ARRAY);
        p(((l8y) n()).b.iterator());
        this.e[this.c - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void beginObject() throws IOException {
        b(JsonToken.BEGIN_OBJECT);
        p(((LinkedTreeMap.b) ((x9y) n()).b.entrySet()).iterator());
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b = new Object[]{g};
        this.c = 1;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void endArray() throws IOException {
        b(JsonToken.END_ARRAY);
        o();
        o();
        int i = this.c;
        if (i > 0) {
            int[] iArr = this.e;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final void endObject() throws IOException {
        b(JsonToken.END_OBJECT);
        o();
        o();
        int i = this.c;
        if (i > 0) {
            int[] iArr = this.e;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final String getPath(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.c;
            if (i >= i2) {
                return sb.toString();
            }
            Object[] objArr = this.b;
            Object obj = objArr[i];
            if (obj instanceof l8y) {
                i++;
                if (i < i2 && (objArr[i] instanceof Iterator)) {
                    int i3 = this.e[i];
                    if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                        i3--;
                    }
                    sb.append('[');
                    sb.append(i3);
                    sb.append(']');
                }
            } else if ((obj instanceof x9y) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                sb.append(JwtParser.SEPARATOR_CHAR);
                String str = this.d[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String getPreviousPath() {
        return getPath(true);
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean hasNext() throws IOException {
        JsonToken peek = peek();
        return (peek == JsonToken.END_OBJECT || peek == JsonToken.END_ARRAY || peek == JsonToken.END_DOCUMENT) ? false : true;
    }

    public final String m() {
        return " at path " + getPath(false);
    }

    public final Object n() {
        return this.b[this.c - 1];
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean nextBoolean() throws IOException {
        b(JsonToken.BOOLEAN);
        boolean d = ((hay) o()).d();
        int i = this.c;
        if (i > 0) {
            int[] iArr = this.e;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return d;
    }

    @Override // com.google.gson.stream.JsonReader
    public final double nextDouble() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + m());
        }
        hay hayVar = (hay) n();
        double doubleValue = hayVar.b instanceof Number ? hayVar.l().doubleValue() : Double.parseDouble(hayVar.k());
        if (!isLenient() && (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + doubleValue);
        }
        o();
        int i = this.c;
        if (i > 0) {
            int[] iArr = this.e;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return doubleValue;
    }

    @Override // com.google.gson.stream.JsonReader
    public final int nextInt() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + m());
        }
        int f2 = ((hay) n()).f();
        o();
        int i = this.c;
        if (i > 0) {
            int[] iArr = this.e;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return f2;
    }

    @Override // com.google.gson.stream.JsonReader
    public final long nextLong() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + m());
        }
        long j = ((hay) n()).j();
        o();
        int i = this.c;
        if (i > 0) {
            int[] iArr = this.e;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return j;
    }

    @Override // com.google.gson.stream.JsonReader
    public final String nextName() throws IOException {
        b(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) n()).next();
        String str = (String) entry.getKey();
        this.d[this.c - 1] = str;
        p(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void nextNull() throws IOException {
        b(JsonToken.NULL);
        o();
        int i = this.c;
        if (i > 0) {
            int[] iArr = this.e;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String nextString() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (peek != jsonToken && peek != JsonToken.NUMBER) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + m());
        }
        String k = ((hay) o()).k();
        int i = this.c;
        if (i > 0) {
            int[] iArr = this.e;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return k;
    }

    public final Object o() {
        Object[] objArr = this.b;
        int i = this.c - 1;
        this.c = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void p(Object obj) {
        int i = this.c;
        Object[] objArr = this.b;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.b = Arrays.copyOf(objArr, i2);
            this.e = Arrays.copyOf(this.e, i2);
            this.d = (String[]) Arrays.copyOf(this.d, i2);
        }
        Object[] objArr2 = this.b;
        int i3 = this.c;
        this.c = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public final JsonToken peek() throws IOException {
        if (this.c == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object n = n();
        if (n instanceof Iterator) {
            boolean z = this.b[this.c - 2] instanceof x9y;
            Iterator it = (Iterator) n;
            if (!it.hasNext()) {
                return z ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z) {
                return JsonToken.NAME;
            }
            p(it.next());
            return peek();
        }
        if (n instanceof x9y) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (n instanceof l8y) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (!(n instanceof hay)) {
            if (n instanceof u9y) {
                return JsonToken.NULL;
            }
            if (n == g) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        Serializable serializable = ((hay) n).b;
        if (serializable instanceof String) {
            return JsonToken.STRING;
        }
        if (serializable instanceof Boolean) {
            return JsonToken.BOOLEAN;
        }
        if (serializable instanceof Number) {
            return JsonToken.NUMBER;
        }
        throw new AssertionError();
    }

    @Override // com.google.gson.stream.JsonReader
    public final void skipValue() throws IOException {
        if (peek() == JsonToken.NAME) {
            nextName();
            this.d[this.c - 2] = "null";
        } else {
            o();
            int i = this.c;
            if (i > 0) {
                this.d[i - 1] = "null";
            }
        }
        int i2 = this.c;
        if (i2 > 0) {
            int[] iArr = this.e;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String toString() {
        return gby.class.getSimpleName() + m();
    }

    @Override // com.google.gson.stream.JsonReader
    public final String getPath() {
        return getPath(false);
    }
}
