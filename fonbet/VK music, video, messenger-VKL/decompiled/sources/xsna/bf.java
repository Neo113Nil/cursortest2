package xsna;

import androidx.credentials.provider.CredentialEntry;
import io.jsonwebtoken.JwtParser;
import java.util.NoSuchElementException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.JsonDecodingException;
import xsna.gmi0;
import xsna.prm0;

/* compiled from: TreeJsonDecoder.kt */
/* loaded from: classes8.dex */
public abstract class bf extends au50 implements x8y {
    public final j8y d;
    public final String e;
    public final q8y f;

    public bf(j8y j8yVar, JsonElement jsonElement, String str) {
        this.d = j8yVar;
        this.e = str;
        this.f = j8yVar.a;
    }

    @Override // xsna.au50, kotlinx.serialization.encoding.Decoder
    public final Decoder C(SerialDescriptor serialDescriptor) {
        if (j5g.k0(this.b) != null) {
            return super.C(serialDescriptor);
        }
        return new iay(this.d, W(), this.e).C(serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean G() {
        return !(V() instanceof JsonNull);
    }

    @Override // xsna.au50
    public final char H(Object obj) {
        String str = (String) obj;
        JsonElement U = U(str);
        if (!(U instanceof JsonPrimitive)) {
            throw ne7.d("Expected " + fpf0.a(JsonPrimitive.class).l() + ", but had " + fpf0.a(U.getClass()).l() + " as the serialized body of char at element: " + X(str), U.toString(), -1);
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) U;
        try {
            String c = jsonPrimitive.c();
            int length = c.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return c.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            Y(jsonPrimitive, "char", str);
            throw null;
        }
    }

    @Override // xsna.au50
    public final double I(Object obj) {
        String str = (String) obj;
        JsonElement U = U(str);
        if (!(U instanceof JsonPrimitive)) {
            throw ne7.d("Expected " + fpf0.a(JsonPrimitive.class).l() + ", but had " + fpf0.a(U.getClass()).l() + " as the serialized body of double at element: " + X(str), U.toString(), -1);
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) U;
        try {
            qzw qzwVar = c9y.a;
            double parseDouble = Double.parseDouble(jsonPrimitive.c());
            q8y q8yVar = this.d.a;
            if (Double.isInfinite(parseDouble) || Double.isNaN(parseDouble)) {
                throw ne7.c(-1, ne7.H(Double.valueOf(parseDouble), str, V().toString()));
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            Y(jsonPrimitive, "double", str);
            throw null;
        }
    }

    @Override // xsna.au50
    public final int J(Object obj, SerialDescriptor serialDescriptor) {
        String str = (String) obj;
        JsonElement U = U(str);
        String f = serialDescriptor.f();
        if (U instanceof JsonPrimitive) {
            return t9y.b(serialDescriptor, this.d, ((JsonPrimitive) U).c(), "");
        }
        throw ne7.d("Expected " + fpf0.a(JsonPrimitive.class).l() + ", but had " + fpf0.a(U.getClass()).l() + " as the serialized body of " + f + " at element: " + X(str), U.toString(), -1);
    }

    @Override // xsna.au50
    public final float K(Object obj) {
        String str = (String) obj;
        JsonElement U = U(str);
        if (!(U instanceof JsonPrimitive)) {
            throw ne7.d("Expected " + fpf0.a(JsonPrimitive.class).l() + ", but had " + fpf0.a(U.getClass()).l() + " as the serialized body of float at element: " + X(str), U.toString(), -1);
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) U;
        try {
            qzw qzwVar = c9y.a;
            float parseFloat = Float.parseFloat(jsonPrimitive.c());
            q8y q8yVar = this.d.a;
            if (Float.isInfinite(parseFloat) || Float.isNaN(parseFloat)) {
                throw ne7.c(-1, ne7.H(Float.valueOf(parseFloat), str, V().toString()));
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            Y(jsonPrimitive, "float", str);
            throw null;
        }
    }

    @Override // xsna.au50
    public final Decoder L(Object obj, SerialDescriptor serialDescriptor) {
        String str = (String) obj;
        if (!hpm0.a(serialDescriptor)) {
            this.b.add(str);
            return this;
        }
        JsonElement U = U(str);
        String f = serialDescriptor.f();
        if (U instanceof JsonPrimitive) {
            String c = ((JsonPrimitive) U).c();
            j8y j8yVar = this.d;
            q8y q8yVar = j8yVar.a;
            return new y8y(new fqm0(c), j8yVar);
        }
        throw ne7.d("Expected " + fpf0.a(JsonPrimitive.class).l() + ", but had " + fpf0.a(U.getClass()).l() + " as the serialized body of " + f + " at element: " + X(str), U.toString(), -1);
    }

    @Override // xsna.au50
    public final int M(Object obj) {
        String str = (String) obj;
        JsonElement U = U(str);
        if (U instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) U;
            try {
                return c9y.d(jsonPrimitive);
            } catch (IllegalArgumentException unused) {
                Y(jsonPrimitive, "int", str);
                throw null;
            }
        }
        throw ne7.d("Expected " + fpf0.a(JsonPrimitive.class).l() + ", but had " + fpf0.a(U.getClass()).l() + " as the serialized body of int at element: " + X(str), U.toString(), -1);
    }

    @Override // xsna.au50
    public final long N(Object obj) {
        String str = (String) obj;
        JsonElement U = U(str);
        if (U instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) U;
            try {
                qzw qzwVar = c9y.a;
                try {
                    return new fqm0(jsonPrimitive.c()).i();
                } catch (JsonDecodingException e) {
                    throw new NumberFormatException(e.getMessage());
                }
            } catch (IllegalArgumentException unused) {
                Y(jsonPrimitive, "long", str);
                throw null;
            }
        }
        throw ne7.d("Expected " + fpf0.a(JsonPrimitive.class).l() + ", but had " + fpf0.a(U.getClass()).l() + " as the serialized body of long at element: " + X(str), U.toString(), -1);
    }

    @Override // xsna.au50
    public final short O(Object obj) {
        String str = (String) obj;
        JsonElement U = U(str);
        if (!(U instanceof JsonPrimitive)) {
            throw ne7.d("Expected " + fpf0.a(JsonPrimitive.class).l() + ", but had " + fpf0.a(U.getClass()).l() + " as the serialized body of short at element: " + X(str), U.toString(), -1);
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) U;
        try {
            int d = c9y.d(jsonPrimitive);
            Short valueOf = (-32768 > d || d > 32767) ? null : Short.valueOf((short) d);
            if (valueOf != null) {
                return valueOf.shortValue();
            }
            Y(jsonPrimitive, "short", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            Y(jsonPrimitive, "short", str);
            throw null;
        }
    }

    @Override // xsna.au50
    public final String P(Object obj) {
        String str = (String) obj;
        JsonElement U = U(str);
        if (!(U instanceof JsonPrimitive)) {
            throw ne7.d("Expected " + fpf0.a(JsonPrimitive.class).l() + ", but had " + fpf0.a(U.getClass()).l() + " as the serialized body of string at element: " + X(str), U.toString(), -1);
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) U;
        if (!(jsonPrimitive instanceof o9y)) {
            StringBuilder a = t33.a("Expected string value for a non-null key '", str, "', got null literal instead at element: ");
            a.append(X(str));
            throw ne7.d(a.toString(), V().toString(), -1);
        }
        o9y o9yVar = (o9y) jsonPrimitive;
        if (o9yVar.b || this.d.a.c) {
            return o9yVar.d;
        }
        StringBuilder a2 = t33.a("String literal for key '", str, "' should be quoted at element: ");
        a2.append(X(str));
        a2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw ne7.d(a2.toString(), V().toString(), -1);
    }

    public abstract JsonElement U(String str);

    public final JsonElement V() {
        JsonElement U;
        String str = (String) j5g.k0(this.b);
        return (str == null || (U = U(str)) == null) ? W() : U;
    }

    public abstract JsonElement W();

    public final String X(String str) {
        return T() + JwtParser.SEPARATOR_CHAR + str;
    }

    public final void Y(JsonPrimitive jsonPrimitive, String str, String str2) {
        throw ne7.d("Failed to parse literal '" + jsonPrimitive + "' as " + (brm0.B(str, "i", false) ? "an " : "a ").concat(str) + " value at element: " + X(str2), V().toString(), -1);
    }

    @Override // xsna.au50
    public final boolean a(Object obj) {
        String str = (String) obj;
        JsonElement U = U(str);
        if (!(U instanceof JsonPrimitive)) {
            throw ne7.d("Expected " + fpf0.a(JsonPrimitive.class).l() + ", but had " + fpf0.a(U.getClass()).l() + " as the serialized body of boolean at element: " + X(str), U.toString(), -1);
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) U;
        try {
            qzw qzwVar = c9y.a;
            String c = jsonPrimitive.c();
            String[] strArr = jqm0.a;
            Boolean bool = c.equalsIgnoreCase("true") ? Boolean.TRUE : c.equalsIgnoreCase(CredentialEntry.FALSE_STRING) ? Boolean.FALSE : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            Y(jsonPrimitive, "boolean", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            Y(jsonPrimitive, "boolean", str);
            throw null;
        }
    }

    @Override // xsna.au50
    public final byte b(Object obj) {
        String str = (String) obj;
        JsonElement U = U(str);
        if (!(U instanceof JsonPrimitive)) {
            throw ne7.d("Expected " + fpf0.a(JsonPrimitive.class).l() + ", but had " + fpf0.a(U.getClass()).l() + " as the serialized body of byte at element: " + X(str), U.toString(), -1);
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) U;
        try {
            int d = c9y.d(jsonPrimitive);
            Byte valueOf = (-128 > d || d > 127) ? null : Byte.valueOf((byte) d);
            if (valueOf != null) {
                return valueOf.byteValue();
            }
            Y(jsonPrimitive, "byte", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            Y(jsonPrimitive, "byte", str);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder, xsna.ssi
    public final de c() {
        return this.d.b;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public ssi d(SerialDescriptor serialDescriptor) {
        JsonElement V = V();
        gmi0 kind = serialDescriptor.getKind();
        boolean f = epx.f(kind, prm0.b.a);
        j8y j8yVar = this.d;
        if (f || (kind instanceof rub0)) {
            String f2 = serialDescriptor.f();
            if (V instanceof JsonArray) {
                return new cby(j8yVar, (JsonArray) V);
            }
            throw ne7.d("Expected " + fpf0.a(JsonArray.class).l() + ", but had " + fpf0.a(V.getClass()).l() + " as the serialized body of " + f2 + " at element: " + T(), V.toString(), -1);
        }
        if (!epx.f(kind, prm0.c.a)) {
            String f3 = serialDescriptor.f();
            if (V instanceof JsonObject) {
                return new aby(j8yVar, (JsonObject) V, this.e, 8);
            }
            throw ne7.d("Expected " + fpf0.a(JsonObject.class).l() + ", but had " + fpf0.a(V.getClass()).l() + " as the serialized body of " + f3 + " at element: " + T(), V.toString(), -1);
        }
        SerialDescriptor a = g2y0.a(serialDescriptor.h(0), j8yVar.b);
        gmi0 kind2 = a.getKind();
        if ((kind2 instanceof gbd0) || epx.f(kind2, gmi0.b.a)) {
            String f4 = serialDescriptor.f();
            if (V instanceof JsonObject) {
                return new eby(j8yVar, (JsonObject) V);
            }
            throw ne7.d("Expected " + fpf0.a(JsonObject.class).l() + ", but had " + fpf0.a(V.getClass()).l() + " as the serialized body of " + f4 + " at element: " + T(), V.toString(), -1);
        }
        if (!j8yVar.a.d) {
            throw ne7.b(a);
        }
        String f5 = serialDescriptor.f();
        if (V instanceof JsonArray) {
            return new cby(j8yVar, (JsonArray) V);
        }
        throw ne7.d("Expected " + fpf0.a(JsonArray.class).l() + ", but had " + fpf0.a(V.getClass()).l() + " as the serialized body of " + f5 + " at element: " + T(), V.toString(), -1);
    }

    @Override // xsna.x8y
    public final j8y f() {
        return this.d;
    }

    @Override // xsna.au50, kotlinx.serialization.encoding.Decoder
    public final <T> T h(a3m<? extends T> a3mVar) {
        if (!(a3mVar instanceof dh)) {
            return a3mVar.deserialize(this);
        }
        j8y j8yVar = this.d;
        q8y q8yVar = j8yVar.a;
        dh dhVar = (dh) a3mVar;
        String c = sub0.c(dhVar.getDescriptor(), j8yVar);
        JsonElement V = V();
        String f = dhVar.getDescriptor().f();
        if (!(V instanceof JsonObject)) {
            throw ne7.d("Expected " + fpf0.a(JsonObject.class).l() + ", but had " + fpf0.a(V.getClass()).l() + " as the serialized body of " + f + " at element: " + T(), V.toString(), -1);
        }
        JsonObject jsonObject = (JsonObject) V;
        JsonElement jsonElement = (JsonElement) jsonObject.get(c);
        String str = null;
        if (jsonElement != null) {
            JsonPrimitive e = c9y.e(jsonElement);
            if (!(e instanceof JsonNull)) {
                str = e.c();
            }
        }
        try {
            return (T) up2.r(j8yVar, c, jsonObject, rte0.l((dh) a3mVar, this, str));
        } catch (SerializationException e2) {
            throw ne7.d(e2.getMessage(), jsonObject.toString(), -1);
        }
    }

    @Override // xsna.x8y
    public final JsonElement l() {
        return V();
    }

    public void e(SerialDescriptor serialDescriptor) {
    }
}
