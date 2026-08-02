package com.squareup.moshi;

import com.squareup.moshi.JsonReader;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qq6;
import defpackage.yp6;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class JsonValueReader extends JsonReader {
    public static final Object B = new Object();
    public Object[] A;

    public static final class JsonIterator implements Iterator<Object>, Cloneable {
        public final JsonReader.Token a;
        public final Object[] b;
        public int c;

        public JsonIterator(JsonReader.Token token, Object[] objArr, int i) {
            this.a = token;
            this.b = objArr;
            this.c = i;
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public JsonIterator m129clone() {
            return new JsonIterator(this.a, this.b, this.c);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c < this.b.length;
        }

        @Override // java.util.Iterator
        public Object next() {
            int i = this.c;
            this.c = i + 1;
            return this.b[i];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public void beginArray() throws IOException {
        List list = (List) n(List.class, JsonReader.Token.BEGIN_ARRAY);
        JsonIterator jsonIterator = new JsonIterator(JsonReader.Token.END_ARRAY, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.A;
        int i = this.a;
        objArr[i - 1] = jsonIterator;
        this.b[i - 1] = 1;
        this.w[i - 1] = 0;
        if (jsonIterator.hasNext()) {
            e(jsonIterator.next());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public void beginObject() throws IOException {
        Map map = (Map) n(Map.class, JsonReader.Token.BEGIN_OBJECT);
        JsonIterator jsonIterator = new JsonIterator(JsonReader.Token.END_OBJECT, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.A;
        int i = this.a;
        objArr[i - 1] = jsonIterator;
        this.b[i - 1] = 3;
        if (jsonIterator.hasNext()) {
            e(jsonIterator.next());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Arrays.fill(this.A, 0, this.a, (Object) null);
        this.A[0] = B;
        this.b[0] = 8;
        this.a = 1;
    }

    public final void e(Object obj) {
        int i = this.a;
        if (i == this.A.length) {
            if (i == 256) {
                kbs.s(getPath(), "Nesting too deep at ");
                return;
            }
            int[] iArr = this.b;
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.c;
            this.c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.w;
            this.w = Arrays.copyOf(iArr2, iArr2.length * 2);
            Object[] objArr = this.A;
            this.A = Arrays.copyOf(objArr, objArr.length * 2);
        }
        Object[] objArr2 = this.A;
        int i2 = this.a;
        this.a = i2 + 1;
        objArr2[i2] = obj;
    }

    @Override // com.squareup.moshi.JsonReader
    public void endArray() throws IOException {
        JsonReader.Token token = JsonReader.Token.END_ARRAY;
        JsonIterator jsonIterator = (JsonIterator) n(JsonIterator.class, token);
        if (jsonIterator.a != token || jsonIterator.hasNext()) {
            throw d(jsonIterator, token);
        }
        k();
    }

    @Override // com.squareup.moshi.JsonReader
    public void endObject() throws IOException {
        JsonReader.Token token = JsonReader.Token.END_OBJECT;
        JsonIterator jsonIterator = (JsonIterator) n(JsonIterator.class, token);
        if (jsonIterator.a != token || jsonIterator.hasNext()) {
            throw d(jsonIterator, token);
        }
        this.c[this.a - 1] = null;
        k();
    }

    @Override // com.squareup.moshi.JsonReader
    public boolean hasNext() throws IOException {
        int i = this.a;
        if (i == 0) {
            return false;
        }
        Object obj = this.A[i - 1];
        return !(obj instanceof Iterator) || ((Iterator) obj).hasNext();
    }

    public final void k() {
        int i = this.a;
        int i2 = i - 1;
        this.a = i2;
        Object[] objArr = this.A;
        objArr[i2] = null;
        this.b[i2] = 0;
        if (i2 > 0) {
            int[] iArr = this.w;
            int i3 = i - 2;
            iArr[i3] = iArr[i3] + 1;
            Object obj = objArr[i - 2];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    e(it.next());
                }
            }
        }
    }

    public final Object n(Class cls, JsonReader.Token token) {
        int i = this.a;
        Object obj = i != 0 ? this.A[i - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && token == JsonReader.Token.NULL) {
            return null;
        }
        if (obj != B) {
            throw d(obj, token);
        }
        ny61.r("JsonReader is closed");
        return null;
    }

    @Override // com.squareup.moshi.JsonReader
    public boolean nextBoolean() throws IOException {
        Boolean bool = (Boolean) n(Boolean.class, JsonReader.Token.BOOLEAN);
        k();
        return bool.booleanValue();
    }

    @Override // com.squareup.moshi.JsonReader
    public double nextDouble() throws IOException {
        double parseDouble;
        JsonReader.Token token = JsonReader.Token.NUMBER;
        Object n = n(Object.class, token);
        if (n instanceof Number) {
            parseDouble = ((Number) n).doubleValue();
        } else {
            if (!(n instanceof String)) {
                throw d(n, token);
            }
            try {
                parseDouble = Double.parseDouble((String) n);
            } catch (NumberFormatException unused) {
                throw d(n, JsonReader.Token.NUMBER);
            }
        }
        if (this.x || !(Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            k();
            return parseDouble;
        }
        StringBuilder u = oyr.u(parseDouble, "JSON forbids NaN and infinities: ", " at path ");
        u.append(getPath());
        throw new JsonEncodingException(u.toString());
    }

    @Override // com.squareup.moshi.JsonReader
    public int nextInt() throws IOException {
        int intValueExact;
        JsonReader.Token token = JsonReader.Token.NUMBER;
        Object n = n(Object.class, token);
        if (n instanceof Number) {
            intValueExact = ((Number) n).intValue();
        } else {
            if (!(n instanceof String)) {
                throw d(n, token);
            }
            try {
                try {
                    intValueExact = Integer.parseInt((String) n);
                } catch (NumberFormatException unused) {
                    throw d(n, JsonReader.Token.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                intValueExact = new BigDecimal((String) n).intValueExact();
            }
        }
        k();
        return intValueExact;
    }

    @Override // com.squareup.moshi.JsonReader
    public long nextLong() throws IOException {
        long longValueExact;
        JsonReader.Token token = JsonReader.Token.NUMBER;
        Object n = n(Object.class, token);
        if (n instanceof Number) {
            longValueExact = ((Number) n).longValue();
        } else {
            if (!(n instanceof String)) {
                throw d(n, token);
            }
            try {
                try {
                    longValueExact = Long.parseLong((String) n);
                } catch (NumberFormatException unused) {
                    throw d(n, JsonReader.Token.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                longValueExact = new BigDecimal((String) n).longValueExact();
            }
        }
        k();
        return longValueExact;
    }

    @Override // com.squareup.moshi.JsonReader
    public String nextName() throws IOException {
        JsonReader.Token token = JsonReader.Token.NAME;
        Map.Entry entry = (Map.Entry) n(Map.Entry.class, token);
        Object key = entry.getKey();
        if (!(key instanceof String)) {
            throw d(key, token);
        }
        String str = (String) key;
        this.A[this.a - 1] = entry.getValue();
        this.c[this.a - 2] = str;
        return str;
    }

    @Override // com.squareup.moshi.JsonReader
    public <T> T nextNull() throws IOException {
        n(Void.class, JsonReader.Token.NULL);
        k();
        return null;
    }

    @Override // com.squareup.moshi.JsonReader
    public qq6 nextSource() throws IOException {
        Object readJsonValue = readJsonValue();
        yp6 yp6Var = new yp6();
        JsonWriter of = JsonWriter.of(yp6Var);
        try {
            of.jsonValue(readJsonValue);
            of.close();
            return yp6Var;
        } catch (Throwable th) {
            if (of != null) {
                try {
                    of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public String nextString() throws IOException {
        int i = this.a;
        Object obj = i != 0 ? this.A[i - 1] : null;
        if (obj instanceof String) {
            k();
            return (String) obj;
        }
        if (obj instanceof Number) {
            k();
            return obj.toString();
        }
        if (obj != B) {
            throw d(obj, JsonReader.Token.STRING);
        }
        ny61.r("JsonReader is closed");
        return null;
    }

    @Override // com.squareup.moshi.JsonReader
    public JsonReader.Token peek() throws IOException {
        int i = this.a;
        if (i == 0) {
            return JsonReader.Token.END_DOCUMENT;
        }
        Object obj = this.A[i - 1];
        if (obj instanceof JsonIterator) {
            return ((JsonIterator) obj).a;
        }
        if (obj instanceof List) {
            return JsonReader.Token.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return JsonReader.Token.BEGIN_OBJECT;
        }
        if (obj instanceof Map.Entry) {
            return JsonReader.Token.NAME;
        }
        if (obj instanceof String) {
            return JsonReader.Token.STRING;
        }
        if (obj instanceof Boolean) {
            return JsonReader.Token.BOOLEAN;
        }
        if (obj instanceof Number) {
            return JsonReader.Token.NUMBER;
        }
        if (obj == null) {
            return JsonReader.Token.NULL;
        }
        if (obj != B) {
            throw d(obj, "a JSON value");
        }
        ny61.r("JsonReader is closed");
        return null;
    }

    @Override // com.squareup.moshi.JsonReader
    public JsonReader peekJson() {
        JsonValueReader jsonValueReader = new JsonValueReader(this);
        jsonValueReader.A = (Object[]) this.A.clone();
        for (int i = 0; i < jsonValueReader.a; i++) {
            Object[] objArr = jsonValueReader.A;
            Object obj = objArr[i];
            if (obj instanceof JsonIterator) {
                objArr[i] = ((JsonIterator) obj).m129clone();
            }
        }
        return jsonValueReader;
    }

    @Override // com.squareup.moshi.JsonReader
    public void promoteNameToValue() throws IOException {
        if (hasNext()) {
            e(nextName());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public int selectName(JsonReader.Options options) throws IOException {
        JsonReader.Token token = JsonReader.Token.NAME;
        Map.Entry entry = (Map.Entry) n(Map.Entry.class, token);
        Object key = entry.getKey();
        if (!(key instanceof String)) {
            throw d(key, token);
        }
        String str = (String) key;
        int length = options.a.length;
        for (int i = 0; i < length; i++) {
            if (options.a[i].equals(str)) {
                this.A[this.a - 1] = entry.getValue();
                this.c[this.a - 2] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.JsonReader
    public int selectString(JsonReader.Options options) throws IOException {
        int i = this.a;
        Object obj = i != 0 ? this.A[i - 1] : null;
        if (!(obj instanceof String)) {
            if (obj != B) {
                return -1;
            }
            ny61.r("JsonReader is closed");
            return 0;
        }
        String str = (String) obj;
        int length = options.a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (options.a[i2].equals(str)) {
                k();
                return i2;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.JsonReader
    public void skipName() throws IOException {
        if (!this.y) {
            this.A[this.a - 1] = ((Map.Entry) n(Map.Entry.class, JsonReader.Token.NAME)).getValue();
            this.c[this.a - 2] = "null";
        } else {
            JsonReader.Token peek = peek();
            nextName();
            StringBuilder sb = new StringBuilder("Cannot skip unexpected ");
            sb.append(peek);
            kbs.u(sb, " at ", getPath());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public void skipValue() throws IOException {
        if (this.y) {
            StringBuilder sb = new StringBuilder("Cannot skip unexpected ");
            sb.append(peek());
            kbs.u(sb, " at ", getPath());
            return;
        }
        int i = this.a;
        if (i > 1) {
            this.c[i - 2] = "null";
        }
        Object obj = i != 0 ? this.A[i - 1] : null;
        if (obj instanceof JsonIterator) {
            StringBuilder sb2 = new StringBuilder("Expected a value but was ");
            sb2.append(peek());
            kbs.u(sb2, " at path ", getPath());
        } else if (obj instanceof Map.Entry) {
            Object[] objArr = this.A;
            objArr[i - 1] = ((Map.Entry) objArr[i - 1]).getValue();
        } else {
            if (i > 0) {
                k();
                return;
            }
            StringBuilder sb3 = new StringBuilder("Expected a value but was ");
            sb3.append(peek());
            kbs.u(sb3, " at path ", getPath());
        }
    }
}
