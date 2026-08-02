package xsna;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: ParserMinimalBase.java */
/* loaded from: classes12.dex */
public abstract class qj90 extends JsonParser {
    public static final byte[] d = new byte[0];
    public static final BigInteger e;
    public static final BigInteger f;
    public static final BigInteger g;
    public static final BigInteger h;
    public static final BigDecimal i;
    public static final BigDecimal j;
    public static final BigDecimal k;
    public static final BigDecimal l;
    public JsonToken c;

    static {
        BigInteger valueOf = BigInteger.valueOf(-2147483648L);
        e = valueOf;
        BigInteger valueOf2 = BigInteger.valueOf(2147483647L);
        f = valueOf2;
        BigInteger valueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        g = valueOf3;
        BigInteger valueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        h = valueOf4;
        i = new BigDecimal(valueOf3);
        j = new BigDecimal(valueOf4);
        k = new BigDecimal(valueOf);
        l = new BigDecimal(valueOf2);
    }

    public static final String P(int i2) {
        char c = (char) i2;
        if (Character.isISOControl(c)) {
            return tgw.b(i2, "(CTRL-CHAR, code ", ")");
        }
        if (i2 <= 255) {
            return "'" + c + "' (code " + i2 + ")";
        }
        return "'" + c + "' (code " + i2 + " / 0x" + Integer.toHexString(i2) + ")";
    }

    public static String S(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", Integer.valueOf(length));
    }

    public static String T(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", Integer.valueOf(length));
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final qj90 O() throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) {
            int i2 = 1;
            while (true) {
                JsonToken N = N();
                if (N == null) {
                    Q();
                    return this;
                }
                if (N.l()) {
                    i2++;
                } else if (N.k()) {
                    i2--;
                    if (i2 == 0) {
                        break;
                    }
                } else if (N == JsonToken.NOT_AVAILABLE) {
                    throw b("Not enough content available for `skipChildren()`: non-blocking parser? (" + getClass().getName() + ")");
                }
            }
        }
        return this;
    }

    public abstract void Q() throws JsonParseException;

    public final void U(String str, JsonToken jsonToken) throws JsonParseException {
        throw new JsonEOFException(this, jsonToken, go9.b("Unexpected end-of-input", str));
    }

    public final void V(JsonToken jsonToken) throws JsonParseException {
        U(jsonToken != JsonToken.VALUE_STRING ? (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value" : " in a String value", jsonToken);
        throw null;
    }

    public final void X(int i2, String str) throws JsonParseException {
        if (i2 >= 0) {
            String a = zr.a("Unexpected character (", P(i2), ")");
            if (str != null) {
                a = pzl.b(a, ": ", str);
            }
            throw b(a);
        }
        U(" in " + this.c, this.c);
        throw null;
    }

    public final void Y(int i2, String str) throws JsonParseException {
        throw b(zr.a("Unexpected character (", P(i2), ") in numeric value") + ": " + str);
    }

    public final void a0(int i2) throws JsonParseException {
        throw b("Illegal character (" + P((char) i2) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
    }

    public final void b0(String str) throws IOException {
        throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of long (%d - %s)", S(str), Long.MIN_VALUE, Long.MAX_VALUE), this.c, Long.TYPE);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JsonToken m() {
        return this.c;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int n() {
        JsonToken jsonToken = this.c;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.j();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JsonToken r() {
        return this.c;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public final int s() {
        JsonToken jsonToken = this.c;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.j();
    }
}
