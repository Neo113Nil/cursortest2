package xsna;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import io.jsonwebtoken.JwtParser;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: JSONObjectGsonReader.kt */
/* loaded from: classes17.dex */
public final class wwx extends JsonReader {
    public static final Object g = new Object();
    public static final b h;
    public final JSONObject b;
    public int c;
    public Object[] d;
    public String[] e;
    public int[] f;

    /* compiled from: JSONObjectGsonReader.kt */
    public static final class a extends may {
        public final /* synthetic */ may a;

        public a(may mayVar) {
            this.a = mayVar;
        }

        @Override // xsna.may
        public final void promoteNameToValue(JsonReader jsonReader) {
            if (!(jsonReader instanceof wwx)) {
                this.a.promoteNameToValue(jsonReader);
                return;
            }
            wwx wwxVar = (wwx) jsonReader;
            wwxVar.b(JsonToken.NAME);
            Map.Entry entry = (Map.Entry) ((Iterator) wwxVar.o()).next();
            Object key = entry.getKey();
            wwxVar.q(entry.getValue());
            wwxVar.q(key);
        }
    }

    /* compiled from: JSONObjectGsonReader.kt */
    public static final class b extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    }

    /* compiled from: JSONObjectGsonReader.kt */
    public static final class c {
        public final JsonToken a;
        public final Object b;

        /* compiled from: JSONObjectGsonReader.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[JsonToken.values().length];
                try {
                    iArr[JsonToken.NUMBER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[JsonToken.STRING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public c(JsonToken jsonToken, Object obj) {
            this.a = jsonToken;
            this.b = obj;
        }
    }

    static {
        b bVar = new b();
        h = bVar;
        new JsonReader(bVar);
        may.INSTANCE = new a(may.INSTANCE);
    }

    public wwx(JSONObject jSONObject) {
        super(h);
        this.b = jSONObject;
        this.d = new Object[32];
        this.e = new String[32];
        this.f = new int[32];
        q(jSONObject);
    }

    public final void b(JsonToken jsonToken) throws IOException {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException(("Expected " + jsonToken + " but was " + peek() + " at path ".concat(getPath())).toString());
    }

    @Override // com.google.gson.stream.JsonReader
    public final void beginArray() {
        b(JsonToken.BEGIN_ARRAY);
        q(new zwx((JSONArray) o()));
        this.f[this.c - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void beginObject() {
        b(JsonToken.BEGIN_OBJECT);
        JSONObject jSONObject = (JSONObject) o();
        q(new ywx(jSONObject.keys(), jSONObject));
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d = new Object[]{g};
        this.c = 1;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void endArray() {
        b(JsonToken.END_ARRAY);
        p();
        p();
        m();
    }

    @Override // com.google.gson.stream.JsonReader
    public final void endObject() {
        b(JsonToken.END_OBJECT);
        p();
        p();
        m();
    }

    @Override // com.google.gson.stream.JsonReader
    public final String getPath() {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (i < this.c) {
            Object[] objArr = this.d;
            Object obj = objArr[i];
            if (obj instanceof JSONArray) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f[i]);
                    sb.append(']');
                }
            } else if (obj instanceof JSONObject) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append(JwtParser.SEPARATOR_CHAR);
                    String str = this.e[i];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean hasNext() {
        JsonToken peek = peek();
        return (peek == JsonToken.END_OBJECT || peek == JsonToken.END_ARRAY) ? false : true;
    }

    public final void m() {
        int i = this.c;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final c n() {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek == jsonToken || peek == JsonToken.STRING) {
            Object o = o();
            o.getClass();
            c cVar = new c(peek, o);
            p();
            m();
            return cVar;
        }
        throw new IllegalStateException(("Expected " + jsonToken + " but was " + peek + " at path ".concat(getPath())).toString());
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean nextBoolean() {
        b(JsonToken.BOOLEAN);
        boolean booleanValue = ((Boolean) p()).booleanValue();
        m();
        return booleanValue;
    }

    @Override // com.google.gson.stream.JsonReader
    public final double nextDouble() {
        c n = n();
        Object obj = n.b;
        int i = c.a.$EnumSwitchMapping$0[n.a.ordinal()];
        double parseDouble = i != 1 ? i != 2 ? Double.NaN : Double.parseDouble((String) obj) : ((Number) obj).doubleValue();
        if (isLenient() || !(Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            return parseDouble;
        }
        throw new NumberFormatException("JSON forbids NaN and infinities: " + parseDouble);
    }

    @Override // com.google.gson.stream.JsonReader
    public final int nextInt() {
        c n = n();
        Object obj = n.b;
        int i = c.a.$EnumSwitchMapping$0[n.a.ordinal()];
        if (i == 1) {
            return ((Number) obj).intValue();
        }
        if (i != 2) {
            return 0;
        }
        return Integer.parseInt((String) obj);
    }

    @Override // com.google.gson.stream.JsonReader
    public final long nextLong() {
        c n = n();
        Object obj = n.b;
        int i = c.a.$EnumSwitchMapping$0[n.a.ordinal()];
        if (i == 1) {
            return ((Number) obj).longValue();
        }
        if (i != 2) {
            return 0L;
        }
        return Long.parseLong((String) obj);
    }

    @Override // com.google.gson.stream.JsonReader
    public final String nextName() {
        b(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) o()).next();
        Object key = entry.getKey();
        Object value = entry.getValue();
        String str = (String) key;
        this.e[this.c - 1] = str;
        q(value);
        return str;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void nextNull() {
        b(JsonToken.NULL);
        p();
        m();
    }

    @Override // com.google.gson.stream.JsonReader
    public final String nextString() {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (peek == jsonToken || peek == JsonToken.NUMBER) {
            String valueOf = String.valueOf(p());
            m();
            return valueOf;
        }
        throw new IllegalStateException(("Expected " + jsonToken + " but was " + peek + " at path ".concat(getPath())).toString());
    }

    public final Object o() {
        return this.d[this.c - 1];
    }

    public final Object p() {
        Object[] objArr = this.d;
        int i = this.c - 1;
        this.c = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public final JsonToken peek() {
        if (this.c == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object o = o();
        if (o instanceof Iterator) {
            Iterator it = (Iterator) o;
            boolean z = this.d[this.c - 2] instanceof JSONObject;
            if (!it.hasNext()) {
                return z ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z) {
                return JsonToken.NAME;
            }
            q(it.next());
            return peek();
        }
        if (o instanceof JSONObject) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (o instanceof JSONArray) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (o instanceof String) {
            return JsonToken.STRING;
        }
        if (o instanceof Boolean) {
            return JsonToken.BOOLEAN;
        }
        if (o instanceof Number) {
            return JsonToken.NUMBER;
        }
        if (JSONObject.NULL.equals(o)) {
            return JsonToken.NULL;
        }
        if (o == null) {
            return JsonToken.NULL;
        }
        if (o.equals(g)) {
            throw new IllegalStateException("Reader is closed!!!");
        }
        throw new AssertionError("Peeked object is ".concat(o.getClass().getName()));
    }

    public final void q(Object obj) {
        int i = this.c;
        Object[] objArr = this.d;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.d = Arrays.copyOf(objArr, i2);
            this.f = Arrays.copyOf(this.f, i2);
            this.e = (String[]) Arrays.copyOf(this.e, i2);
        }
        Object[] objArr2 = this.d;
        int i3 = this.c;
        this.c = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void skipValue() {
        if (peek() == JsonToken.NAME) {
            nextName();
            this.e[this.c - 2] = "null";
        } else {
            p();
            int i = this.c;
            if (i > 0) {
                this.e[i - 1] = "null";
            }
        }
        m();
    }

    @Override // com.google.gson.stream.JsonReader
    public final String toString() {
        return wwx.class.getSimpleName() + " at path ".concat(getPath());
    }
}
