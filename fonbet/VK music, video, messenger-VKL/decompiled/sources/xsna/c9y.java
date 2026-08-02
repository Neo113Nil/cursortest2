package xsna;

import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* compiled from: JsonElement.kt */
/* loaded from: classes8.dex */
public final class c9y {
    public static final qzw a = his0.a("kotlinx.serialization.json.JsonUnquotedLiteral", oqm0.a);

    public static final JsonPrimitive a(Number number) {
        return number == null ? JsonNull.INSTANCE : new o9y(number, false, null);
    }

    public static final JsonPrimitive b(String str) {
        return str == null ? JsonNull.INSTANCE : new o9y(str, true, null);
    }

    public static final void c(String str, JsonElement jsonElement) {
        throw new IllegalArgumentException("Element " + fpf0.a(jsonElement.getClass()) + " is not a " + str);
    }

    public static final int d(JsonPrimitive jsonPrimitive) {
        try {
            long i = new fqm0(jsonPrimitive.c()).i();
            if (-2147483648L <= i && i <= 2147483647L) {
                return (int) i;
            }
            throw new NumberFormatException(jsonPrimitive.c() + " is not an Int");
        } catch (JsonDecodingException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    public static final JsonPrimitive e(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        c("JsonPrimitive", jsonElement);
        throw null;
    }
}
