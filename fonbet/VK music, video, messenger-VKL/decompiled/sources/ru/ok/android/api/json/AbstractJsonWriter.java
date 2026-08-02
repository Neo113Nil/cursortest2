package ru.ok.android.api.json;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Locale;

/* loaded from: classes9.dex */
public abstract class AbstractJsonWriter implements JsonWriter {
    @Override // ru.ok.android.api.json.JsonWriter
    public void comment(@NonNull String str) throws IOException {
    }

    public abstract void jsonValue(@NonNull String str) throws IOException;

    @Override // ru.ok.android.api.json.JsonWriter
    public void nullValue() throws IOException {
        jsonValue("null");
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public final void nullableValue(@Nullable String str) throws IOException {
        if (str != null) {
            value(str);
        } else {
            nullValue();
        }
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void value(boolean z) throws IOException {
        jsonValue(String.valueOf(z));
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void comment(@NonNull String str, Object... objArr) throws IOException {
        comment(String.format(Locale.US, str, objArr));
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void value(int i) throws IOException {
        jsonValue(Integer.toString(i));
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void value(long j) throws IOException {
        jsonValue(Long.toString(j));
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public final void value(double d) throws IOException {
        if (!Double.isInfinite(d) && !Double.isNaN(d)) {
            jsonValue(Double.toString(d));
        } else {
            throw new IllegalArgumentException("Numeric value to be finite but was " + d);
        }
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void value(@NonNull Number number) throws IOException {
        if (!(number instanceof Integer) && !(number instanceof Long)) {
            if (!(number instanceof Double) && !(number instanceof Float)) {
                if (!(number instanceof Short) && !(number instanceof Byte) && !(number instanceof BigInteger) && !(number instanceof BigDecimal)) {
                    String obj = number.toString();
                    if (obj.matches("-?(0|[1-9][0-9]*)(\\.[0-9]+)?([eE][-+]?[0-9]+)?")) {
                        jsonValue(obj);
                        return;
                    }
                    throw new IllegalArgumentException("Numeric value cannot be converted to json ".concat(obj));
                }
                jsonValue(number.toString());
                return;
            }
            value(number.doubleValue());
            return;
        }
        jsonValue(number.toString());
    }

    @Override // ru.ok.android.api.json.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // ru.ok.android.api.json.JsonWriter, java.io.Flushable
    public void flush() throws IOException {
    }
}
