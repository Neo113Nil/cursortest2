package xsna;

import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;

/* compiled from: JsonElement.java */
/* loaded from: classes.dex */
public abstract class b9y {
    public abstract b9y c();

    public boolean d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public float e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final l8y g() {
        if (this instanceof l8y) {
            return (l8y) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public final x9y h() {
        if (this instanceof x9y) {
            return (x9y) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public final hay i() {
        if (this instanceof hay) {
            return (hay) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public long j() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String k() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.setLenient(true);
            TypeAdapters.B.c(jsonWriter, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
