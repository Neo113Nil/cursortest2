package com.squareup.moshi;

import defpackage.fas;
import defpackage.ici0;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.oq6;
import defpackage.qir;
import defpackage.yci0;
import defpackage.yp6;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
final class JsonValueWriter extends JsonWriter {
    public Object[] D = new Object[32];
    public String E;

    public JsonValueWriter() {
        d(6);
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter beginArray() throws IOException {
        if (this.A) {
            yci0.t(getPath(), "Array cannot be used as a map key in JSON at path ");
            return null;
        }
        int i = this.a;
        int i2 = this.B;
        if (i == i2 && this.b[i - 1] == 1) {
            this.B = ~i2;
            return this;
        }
        a();
        ArrayList arrayList = new ArrayList();
        e(arrayList);
        Object[] objArr = this.D;
        int i3 = this.a;
        objArr[i3] = arrayList;
        this.w[i3] = 0;
        d(1);
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter beginObject() throws IOException {
        if (this.A) {
            yci0.t(getPath(), "Object cannot be used as a map key in JSON at path ");
            return null;
        }
        int i = this.a;
        int i2 = this.B;
        if (i == i2 && this.b[i - 1] == 3) {
            this.B = ~i2;
            return this;
        }
        a();
        LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
        e(linkedHashTreeMap);
        this.D[this.a] = linkedHashTreeMap;
        d(3);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i = this.a;
        if (i > 1 || (i == 1 && this.b[i - 1] != 7)) {
            ny61.v("Incomplete document");
        } else {
            this.a = 0;
        }
    }

    public final void e(Object obj) {
        String str;
        Object put;
        int c = c();
        int i = this.a;
        if (i == 1) {
            if (c != 6) {
                ny61.r("JSON must have only one top-level value.");
                return;
            }
            int i2 = i - 1;
            this.b[i2] = 7;
            this.D[i2] = obj;
            return;
        }
        if (c == 3 && (str = this.E) != null) {
            if ((obj != null || this.z) && (put = ((Map) this.D[i - 1]).put(str, obj)) != null) {
                qir.r("Map key '", this.E, "' has multiple values at path ", getPath(), Extension.COLON_SPACE, put, " and ", obj);
                return;
            } else {
                this.E = null;
                return;
            }
        }
        if (c == 1) {
            ((List) this.D[i - 1]).add(obj);
        } else if (c == 9) {
            ny61.r("Sink from valueSink() was not closed");
        } else {
            ny61.r("Nesting problem.");
        }
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter endArray() throws IOException {
        if (c() != 1) {
            ny61.r("Nesting problem.");
            return null;
        }
        int i = this.a;
        int i2 = ~this.B;
        if (i == i2) {
            this.B = i2;
            return this;
        }
        int i3 = i - 1;
        this.a = i3;
        this.D[i3] = null;
        int[] iArr = this.w;
        int i4 = i - 2;
        iArr[i4] = iArr[i4] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter endObject() throws IOException {
        if (c() != 3) {
            ny61.r("Nesting problem.");
            return null;
        }
        if (this.E != null) {
            yci0.t(this.E, "Dangling name: ");
            return null;
        }
        int i = this.a;
        int i2 = ~this.B;
        if (i == i2) {
            this.B = i2;
            return this;
        }
        this.A = false;
        int i3 = i - 1;
        this.a = i3;
        this.D[i3] = null;
        this.c[i3] = null;
        int[] iArr = this.w;
        int i4 = i - 2;
        iArr[i4] = iArr[i4] + 1;
        return this;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.a != 0) {
            return;
        }
        ny61.r("JsonWriter is closed.");
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter name(String str) throws IOException {
        if (str == null) {
            ny61.t("name == null");
            return null;
        }
        if (this.a == 0) {
            ny61.r("JsonWriter is closed.");
            return null;
        }
        if (c() != 3 || this.E != null || this.A) {
            ny61.r("Nesting problem.");
            return null;
        }
        this.E = str;
        this.c[this.a - 1] = str;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter nullValue() throws IOException {
        if (this.A) {
            yci0.t(getPath(), "null cannot be used as a map key in JSON at path ");
            return null;
        }
        e(null);
        int[] iArr = this.w;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    public Object root() {
        int i = this.a;
        if (i <= 1 && (i != 1 || this.b[i - 1] == 7)) {
            return this.D[0];
        }
        ny61.r("Incomplete document");
        return null;
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(Number number) throws IOException {
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            return value(number.longValue());
        }
        if ((number instanceof Float) || (number instanceof Double)) {
            return value(number.doubleValue());
        }
        if (number == null) {
            return nullValue();
        }
        BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
        if (this.A) {
            this.A = false;
            return name(bigDecimal.toString());
        }
        e(bigDecimal);
        int[] iArr = this.w;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public oq6 valueSink() {
        if (this.A) {
            yci0.t(getPath(), "BufferedSink cannot be used as a map key in JSON at path ");
            return null;
        }
        if (c() == 9) {
            ny61.r("Sink from valueSink() was not closed");
            return null;
        }
        d(9);
        final yp6 yp6Var = new yp6();
        return new ici0(new fas(yp6Var) { // from class: com.squareup.moshi.JsonValueWriter.1
            @Override // defpackage.fas, defpackage.uis0, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                JsonValueWriter jsonValueWriter = JsonValueWriter.this;
                if (jsonValueWriter.c() == 9) {
                    Object[] objArr = jsonValueWriter.D;
                    int i = jsonValueWriter.a;
                    if (objArr[i] == null) {
                        jsonValueWriter.a = i - 1;
                        Object readJsonValue = JsonReader.of(yp6Var).readJsonValue();
                        boolean z = jsonValueWriter.z;
                        jsonValueWriter.z = true;
                        try {
                            jsonValueWriter.e(readJsonValue);
                            jsonValueWriter.z = z;
                            int[] iArr = jsonValueWriter.w;
                            int i2 = jsonValueWriter.a - 1;
                            iArr[i2] = iArr[i2] + 1;
                            return;
                        } catch (Throwable th) {
                            jsonValueWriter.z = z;
                            throw th;
                        }
                    }
                }
                ny61.w();
            }
        });
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(boolean z) throws IOException {
        if (!this.A) {
            e(Boolean.valueOf(z));
            int[] iArr = this.w;
            int i = this.a - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        yci0.t(getPath(), "Boolean cannot be used as a map key in JSON at path ");
        return null;
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(Boolean bool) throws IOException {
        if (!this.A) {
            e(bool);
            int[] iArr = this.w;
            int i = this.a - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        yci0.t(getPath(), "Boolean cannot be used as a map key in JSON at path ");
        return null;
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(double d) throws IOException {
        if (!this.y && (Double.isNaN(d) || d == Double.NEGATIVE_INFINITY || d == Double.POSITIVE_INFINITY)) {
            kbs.d(d, "Numeric values must be finite, but was ");
            return null;
        }
        if (this.A) {
            this.A = false;
            return name(Double.toString(d));
        }
        e(Double.valueOf(d));
        int[] iArr = this.w;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(long j) throws IOException {
        if (this.A) {
            this.A = false;
            return name(Long.toString(j));
        }
        e(Long.valueOf(j));
        int[] iArr = this.w;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(String str) throws IOException {
        if (this.A) {
            this.A = false;
            return name(str);
        }
        e(str);
        int[] iArr = this.w;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }
}
