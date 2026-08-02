package com.squareup.moshi;

import defpackage.ny61;
import defpackage.oq6;
import defpackage.qq6;
import defpackage.qv10;
import defpackage.yci0;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class JsonWriter implements Closeable, Flushable {
    public boolean A;
    public LinkedHashMap C;
    public String x;
    public boolean y;
    public boolean z;
    public int a = 0;
    public int[] b = new int[32];
    public String[] c = new String[32];
    public int[] w = new int[32];
    public int B = -1;

    public static JsonWriter of(oq6 oq6Var) {
        return new JsonUtf8Writer(oq6Var);
    }

    public final void a() {
        int i = this.a;
        int[] iArr = this.b;
        if (i != iArr.length) {
            return;
        }
        if (i == 256) {
            throw new JsonDataException("Nesting too deep at " + getPath() + ": circular reference?");
        }
        this.b = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.c;
        this.c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.w;
        this.w = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (this instanceof JsonValueWriter) {
            JsonValueWriter jsonValueWriter = (JsonValueWriter) this;
            Object[] objArr = jsonValueWriter.D;
            jsonValueWriter.D = Arrays.copyOf(objArr, objArr.length * 2);
        }
    }

    public abstract JsonWriter beginArray() throws IOException;

    public final int beginFlatten() {
        int c = c();
        if (c != 5 && c != 3 && c != 2 && c != 1) {
            ny61.r("Nesting problem.");
            return 0;
        }
        int i = this.B;
        this.B = this.a;
        return i;
    }

    public abstract JsonWriter beginObject() throws IOException;

    public final int c() {
        int i = this.a;
        if (i != 0) {
            return this.b[i - 1];
        }
        ny61.r("JsonWriter is closed.");
        return 0;
    }

    public final void d(int i) {
        int[] iArr = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        iArr[i2] = i;
    }

    public abstract JsonWriter endArray() throws IOException;

    public final void endFlatten(int i) {
        this.B = i;
    }

    public abstract JsonWriter endObject() throws IOException;

    public final String getIndent() {
        String str = this.x;
        return str != null ? str : "";
    }

    public final String getPath() {
        return JsonScope.a(this.a, this.b, this.c, this.w);
    }

    public final boolean getSerializeNulls() {
        return this.z;
    }

    public final boolean isLenient() {
        return this.y;
    }

    public final JsonWriter jsonValue(Object obj) throws IOException {
        if (obj instanceof Map) {
            beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw new IllegalArgumentException(key == null ? "Map keys must be non-null" : qv10.n(key, "Map keys must be of type String: "));
                }
                name((String) key);
                jsonValue(entry.getValue());
            }
            endObject();
            return this;
        }
        if (obj instanceof List) {
            beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                jsonValue(it.next());
            }
            endArray();
            return this;
        }
        if (obj instanceof String) {
            value((String) obj);
            return this;
        }
        if (obj instanceof Boolean) {
            value(((Boolean) obj).booleanValue());
            return this;
        }
        if (obj instanceof Double) {
            value(((Double) obj).doubleValue());
            return this;
        }
        if (obj instanceof Long) {
            value(((Long) obj).longValue());
            return this;
        }
        if (obj instanceof Number) {
            value((Number) obj);
            return this;
        }
        if (obj == null) {
            nullValue();
            return this;
        }
        ny61.g(qv10.n(obj, "Unsupported type: "));
        return null;
    }

    public abstract JsonWriter name(String str) throws IOException;

    public abstract JsonWriter nullValue() throws IOException;

    public final void promoteValueToName() throws IOException {
        int c = c();
        if (c == 5 || c == 3) {
            this.A = true;
        } else {
            ny61.r("Nesting problem.");
        }
    }

    public void setIndent(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.x = str;
    }

    public final void setLenient(boolean z) {
        this.y = z;
    }

    public final void setSerializeNulls(boolean z) {
        this.z = z;
    }

    public final <T> void setTag(Class<T> cls, T t) {
        if (!cls.isAssignableFrom(t.getClass())) {
            ny61.g("Tag value must be of type ".concat(cls.getName()));
            return;
        }
        if (this.C == null) {
            this.C = new LinkedHashMap();
        }
        this.C.put(cls, t);
    }

    public final <T> T tag(Class<T> cls) {
        LinkedHashMap linkedHashMap = this.C;
        if (linkedHashMap == null) {
            return null;
        }
        return (T) linkedHashMap.get(cls);
    }

    public abstract JsonWriter value(double d) throws IOException;

    public abstract JsonWriter value(long j) throws IOException;

    public abstract JsonWriter value(Boolean bool) throws IOException;

    public abstract JsonWriter value(Number number) throws IOException;

    public abstract JsonWriter value(String str) throws IOException;

    public final JsonWriter value(qq6 qq6Var) throws IOException {
        if (this.A) {
            yci0.t(getPath(), "BufferedSource cannot be used as a map key in JSON at path ");
            return null;
        }
        oq6 valueSink = valueSink();
        try {
            qq6Var.y0(valueSink);
            if (valueSink != null) {
                valueSink.close();
            }
            return this;
        } catch (Throwable th) {
            if (valueSink != null) {
                try {
                    valueSink.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public abstract JsonWriter value(boolean z) throws IOException;

    public abstract oq6 valueSink() throws IOException;
}
