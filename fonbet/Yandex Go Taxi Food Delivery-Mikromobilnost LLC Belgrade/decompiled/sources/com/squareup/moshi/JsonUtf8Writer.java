package com.squareup.moshi;

import defpackage.ici0;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.oq6;
import defpackage.uis0;
import defpackage.yci0;
import defpackage.ydz0;
import defpackage.yp6;
import java.io.IOException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
final class JsonUtf8Writer extends JsonWriter {
    public static final String[] G = new String[128];
    public final oq6 D;
    public String E = ":";
    public String F;

    static {
        for (int i = 0; i <= 31; i++) {
            G[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = G;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public JsonUtf8Writer(oq6 oq6Var) {
        if (oq6Var == null) {
            ny61.t("sink == null");
            throw null;
        }
        this.D = oq6Var;
        d(6);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void v(oq6 oq6Var, String str) {
        int i;
        String str2;
        oq6Var.writeByte(34);
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = G[charAt];
                i = str2 == null ? i + 1 : 0;
                if (i2 < i) {
                    oq6Var.a2(i2, i, str);
                }
                oq6Var.p1(str2);
                i2 = i + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                }
                oq6Var.p1(str2);
                i2 = i + 1;
            }
        }
        if (i2 < length) {
            oq6Var.a2(i2, length, str);
        }
        oq6Var.writeByte(34);
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter beginArray() throws IOException {
        if (this.A) {
            yci0.t(getPath(), "Array cannot be used as a map key in JSON at path ");
            return null;
        }
        w();
        o(1, 2, '[');
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter beginObject() throws IOException {
        if (this.A) {
            yci0.t(getPath(), "Object cannot be used as a map key in JSON at path ");
            return null;
        }
        w();
        o(3, 5, '{');
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.D.close();
        int i = this.a;
        if (i > 1 || (i == 1 && this.b[i - 1] != 7)) {
            ny61.v("Incomplete document");
        } else {
            this.a = 0;
        }
    }

    public final void e() {
        int c = c();
        int i = 2;
        if (c != 1) {
            oq6 oq6Var = this.D;
            if (c != 2) {
                if (c == 4) {
                    oq6Var.p1(this.E);
                    i = 5;
                } else {
                    if (c == 9) {
                        ny61.r("Sink from valueSink() was not closed");
                        return;
                    }
                    if (c != 6) {
                        if (c != 7) {
                            ny61.r("Nesting problem.");
                            return;
                        } else if (!this.y) {
                            ny61.r("JSON must have only one top-level value.");
                            return;
                        }
                    }
                    i = 7;
                }
                this.b[this.a - 1] = i;
            }
            oq6Var.writeByte(44);
        }
        n();
        this.b[this.a - 1] = i;
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter endArray() throws IOException {
        k(1, 2, ']');
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter endObject() throws IOException {
        this.A = false;
        k(3, 5, '}');
        return this;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.a != 0) {
            this.D.flush();
        } else {
            ny61.r("JsonWriter is closed.");
        }
    }

    public final void k(int i, int i2, char c) {
        int c2 = c();
        if (c2 != i2 && c2 != i) {
            ny61.r("Nesting problem.");
            return;
        }
        if (this.F != null) {
            yci0.t(this.F, "Dangling name: ");
            return;
        }
        int i3 = this.a;
        int i4 = ~this.B;
        if (i3 == i4) {
            this.B = i4;
            return;
        }
        int i5 = i3 - 1;
        this.a = i5;
        this.c[i5] = null;
        int[] iArr = this.w;
        int i6 = i3 - 2;
        iArr[i6] = iArr[i6] + 1;
        if (c2 == i2) {
            n();
        }
        this.D.writeByte(c);
    }

    public final void n() {
        if (this.x == null) {
            return;
        }
        oq6 oq6Var = this.D;
        oq6Var.writeByte(10);
        int i = this.a;
        for (int i2 = 1; i2 < i; i2++) {
            oq6Var.p1(this.x);
        }
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
        int c = c();
        if ((c != 3 && c != 5) || this.F != null || this.A) {
            ny61.r("Nesting problem.");
            return null;
        }
        this.F = str;
        this.c[this.a - 1] = str;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter nullValue() throws IOException {
        if (this.A) {
            yci0.t(getPath(), "null cannot be used as a map key in JSON at path ");
            return null;
        }
        if (this.F != null) {
            if (!this.z) {
                this.F = null;
                return this;
            }
            w();
        }
        e();
        this.D.p1("null");
        int[] iArr = this.w;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    public final void o(int i, int i2, char c) {
        int i3;
        int i4 = this.a;
        int i5 = this.B;
        if (i4 == i5 && ((i3 = this.b[i4 - 1]) == i || i3 == i2)) {
            this.B = ~i5;
            return;
        }
        e();
        a();
        d(i);
        this.w[this.a - 1] = 0;
        this.D.writeByte(c);
    }

    @Override // com.squareup.moshi.JsonWriter
    public void setIndent(String str) {
        super.setIndent(str);
        this.E = !str.isEmpty() ? Extension.COLON_SPACE : ":";
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        String obj = number.toString();
        if (!this.y && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            kbs.f(number, "Numeric values must be finite, but was ");
            return null;
        }
        if (this.A) {
            this.A = false;
            return name(obj);
        }
        w();
        e();
        this.D.p1(obj);
        int[] iArr = this.w;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public oq6 valueSink() throws IOException {
        if (this.A) {
            yci0.t(getPath(), "BufferedSink cannot be used as a map key in JSON at path ");
            return null;
        }
        w();
        e();
        d(9);
        return new ici0(new uis0() { // from class: com.squareup.moshi.JsonUtf8Writer.1
            @Override // defpackage.uis0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                JsonUtf8Writer jsonUtf8Writer = JsonUtf8Writer.this;
                if (jsonUtf8Writer.c() != 9) {
                    ny61.w();
                    return;
                }
                int i = jsonUtf8Writer.a;
                jsonUtf8Writer.a = i - 1;
                int[] iArr = jsonUtf8Writer.w;
                int i2 = i - 2;
                iArr[i2] = iArr[i2] + 1;
            }

            @Override // defpackage.uis0, java.io.Flushable
            public void flush() throws IOException {
                JsonUtf8Writer.this.D.flush();
            }

            @Override // defpackage.uis0
            public ydz0 timeout() {
                return ydz0.d;
            }

            @Override // defpackage.uis0
            public void write(yp6 yp6Var, long j) throws IOException {
                JsonUtf8Writer.this.D.write(yp6Var, j);
            }
        });
    }

    public final void w() {
        if (this.F != null) {
            int c = c();
            oq6 oq6Var = this.D;
            if (c == 5) {
                oq6Var.writeByte(44);
            } else if (c != 3) {
                ny61.r("Nesting problem.");
                return;
            }
            n();
            this.b[this.a - 1] = 4;
            v(oq6Var, this.F);
            this.F = null;
        }
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(boolean z) throws IOException {
        if (!this.A) {
            w();
            e();
            this.D.p1(z ? "true" : "false");
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
        if (bool == null) {
            return nullValue();
        }
        return value(bool.booleanValue());
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(double d) throws IOException {
        if (!this.y && (Double.isNaN(d) || Double.isInfinite(d))) {
            kbs.d(d, "Numeric values must be finite, but was ");
            return null;
        }
        if (this.A) {
            this.A = false;
            return name(Double.toString(d));
        }
        w();
        e();
        this.D.p1(Double.toString(d));
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
        w();
        e();
        this.D.p1(Long.toString(j));
        int[] iArr = this.w;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        if (this.A) {
            this.A = false;
            return name(str);
        }
        w();
        e();
        v(this.D, str);
        int[] iArr = this.w;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }
}
