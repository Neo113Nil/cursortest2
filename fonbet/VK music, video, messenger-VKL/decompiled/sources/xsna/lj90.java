package xsna;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadConstraints;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import com.fasterxml.jackson.core.io.ContentReference;
import com.unity3d.services.UnityAdsConstants;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: ParserBase.java */
/* loaded from: classes12.dex */
public abstract class lj90 extends qj90 {
    public boolean A;
    public int B;
    public int C;
    public long D;
    public float E;
    public double F;
    public BigInteger G;
    public BigDecimal H;
    public String I;
    public boolean J;
    public int K;
    public final tnv m;
    public final StreamReadConstraints n;
    public boolean o;
    public int p;
    public int q;
    public long r;
    public int s;
    public int t;
    public int u;
    public int v;
    public lay w;
    public JsonToken x;
    public final c7f0 y;
    public char[] z;

    public lj90(tnv tnvVar, int i) {
        this.b = i;
        this.s = 1;
        this.u = 1;
        this.B = 0;
        this.m = tnvVar;
        StreamReadConstraints streamReadConstraints = tnvVar.f;
        this.n = streamReadConstraints;
        this.y = new c7f0(streamReadConstraints, tnvVar.e);
        this.w = new lay(null, 0, JsonParser.Feature.STRICT_DUPLICATE_DETECTION.j(i) ? new xno(this) : null, 0, 1, 0);
    }

    public static int[] t0(int i, int[] iArr) {
        return iArr == null ? new int[i] : Arrays.copyOf(iArr, iArr.length + i);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final Number A() throws IOException {
        if (this.B == 0) {
            k0(0);
        }
        if (this.c == JsonToken.VALUE_NUMBER_INT) {
            int i = this.B;
            if ((i & 1) != 0) {
                return Integer.valueOf(this.C);
            }
            if ((i & 2) != 0) {
                return Long.valueOf(this.D);
            }
            if ((i & 4) != 0) {
                return g0();
            }
            cor0.a();
            throw null;
        }
        int i2 = this.B;
        if ((i2 & 16) != 0) {
            return f0();
        }
        if ((i2 & 32) != 0) {
            return Float.valueOf(i0());
        }
        if ((i2 & 8) != 0) {
            return Double.valueOf(h0());
        }
        cor0.a();
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final boolean L() {
        JsonToken jsonToken = this.c;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return true;
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this.A;
        }
        return false;
    }

    @Override // xsna.qj90
    public final void Q() throws JsonParseException {
        if (this.w.d()) {
            return;
        }
        String str = this.w.b() ? "Array" : "Object";
        lay layVar = this.w;
        U(String.format(": expected close marker for %s (start marker at %s)", str, new JsonLocation(d0(), -1L, -1L, layVar.h, layVar.i)), null);
        throw null;
    }

    public abstract void c0() throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.o) {
            return;
        }
        this.p = Math.max(this.p, this.q);
        this.o = true;
        try {
            c0();
        } finally {
            m0();
        }
    }

    public final ContentReference d0() {
        return JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION.j(this.b) ? this.m.a : ContentReference.c;
    }

    public final BigInteger e0(BigDecimal bigDecimal) throws IOException {
        int scale = bigDecimal.scale();
        this.n.getClass();
        if (Math.abs(scale) <= 100000) {
            return bigDecimal.toBigInteger();
        }
        throw new StreamConstraintsException(String.format("BigDecimal scale (%d) magnitude exceeds maximum allowed (%d)", Integer.valueOf(scale), 100000));
    }

    public final BigDecimal f0() throws JsonParseException {
        BigDecimal bigDecimal = this.H;
        if (bigDecimal != null) {
            return bigDecimal;
        }
        String str = this.I;
        if (str == null) {
            throw new IllegalStateException("cannot get BigDecimal from current parser state");
        }
        try {
            BigDecimal a = en70.a(str, StreamReadFeature.USE_FAST_BIG_NUMBER_PARSER.j().j(this.b));
            this.H = a;
            this.I = null;
            return a;
        } catch (NumberFormatException e) {
            throw new JsonParseException("Malformed numeric value (" + qj90.T(this.I) + ")", p(), e);
        }
    }

    public final BigInteger g0() throws JsonParseException {
        BigInteger bigInteger = this.G;
        if (bigInteger != null) {
            return bigInteger;
        }
        String str = this.I;
        if (str == null) {
            throw new IllegalStateException("cannot get BigInteger from current parser state");
        }
        try {
            BigInteger b = en70.b(str, StreamReadFeature.USE_FAST_BIG_NUMBER_PARSER.j().j(this.b));
            this.G = b;
            this.I = null;
            return b;
        } catch (NumberFormatException e) {
            throw new JsonParseException("Malformed numeric value (" + qj90.T(this.I) + ")", p(), e);
        }
    }

    public final double h0() throws JsonParseException {
        double parseDouble;
        String str = this.I;
        if (str != null) {
            try {
                boolean j = StreamReadFeature.USE_FAST_DOUBLE_PARSER.j().j(this.b);
                String str2 = en70.a;
                if (j) {
                    nxx nxxVar = oxx.a;
                    parseDouble = Double.longBitsToDouble(oxx.a.e(str.length(), str));
                } else {
                    parseDouble = Double.parseDouble(str);
                }
                this.F = parseDouble;
                this.I = null;
            } catch (NumberFormatException e) {
                throw new JsonParseException("Malformed numeric value (" + qj90.T(this.I) + ")", p(), e);
            }
        }
        return this.F;
    }

    public final float i0() throws JsonParseException {
        float parseFloat;
        String str = this.I;
        if (str != null) {
            try {
                boolean j = StreamReadFeature.USE_FAST_DOUBLE_PARSER.j().j(this.b);
                String str2 = en70.a;
                if (j) {
                    rxx rxxVar = sxx.a;
                    parseFloat = Float.intBitsToFloat((int) sxx.a.e(str.length(), str));
                } else {
                    parseFloat = Float.parseFloat(str);
                }
                this.E = parseFloat;
                this.I = null;
            } catch (NumberFormatException e) {
                throw new JsonParseException("Malformed numeric value (" + qj90.T(this.I) + ")", p(), e);
            }
        }
        return this.E;
    }

    public final void j0(char c) throws JsonProcessingException {
        JsonParser.Feature feature = JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        int i = this.b;
        if (feature.j(i)) {
            return;
        }
        if (c == '\'' && JsonParser.Feature.ALLOW_SINGLE_QUOTES.j(i)) {
            return;
        }
        throw b("Unrecognized character escape " + qj90.P(c));
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b9, code lost:
    
        if (r15 < 0) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k0(int i) throws IOException {
        long d;
        long d2;
        char[] cArr;
        if (this.o) {
            throw b("Internal error: _parseNumericValue called when parser instance closed");
        }
        JsonToken jsonToken = this.c;
        JsonToken jsonToken2 = JsonToken.VALUE_NUMBER_INT;
        c7f0 c7f0Var = this.y;
        if (jsonToken != jsonToken2) {
            if (jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
                throw b("Current token (" + jsonToken + ") not numeric, can not use numeric value accessors");
            }
            if (i == 16) {
                this.H = null;
                this.I = c7f0Var.d();
                this.B = 16;
                return;
            } else if (i == 32) {
                this.E = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.I = c7f0Var.d();
                this.B = 32;
                return;
            } else {
                this.F = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                this.I = c7f0Var.d();
                this.B = 8;
                return;
            }
        }
        int i2 = this.K;
        if (i2 <= 9) {
            this.C = c7f0Var.c(this.J);
            this.B = 1;
            return;
        }
        if (i2 <= 18) {
            boolean z = this.J;
            int i3 = c7f0Var.c;
            if (i3 >= 0 && (cArr = c7f0Var.b) != null) {
                if (!z) {
                    d = en70.d(cArr, i3, c7f0Var.d);
                    if (i2 == 10) {
                    }
                    this.D = d;
                    this.B = 2;
                    return;
                }
                d2 = en70.d(cArr, i3 + 1, c7f0Var.d - 1);
                d = -d2;
                if (i2 == 10) {
                }
                this.D = d;
                this.B = 2;
                return;
            }
            if (!z) {
                d = en70.d(c7f0Var.h, 0, c7f0Var.i);
                if (i2 == 10) {
                }
                this.D = d;
                this.B = 2;
                return;
            }
            d2 = en70.d(c7f0Var.h, 1, c7f0Var.i - 1);
            d = -d2;
            if (i2 == 10) {
                if (this.J) {
                    if (d >= -2147483648L) {
                        this.C = (int) d;
                        this.B = 1;
                        return;
                    }
                } else if (d <= 2147483647L) {
                    this.C = (int) d;
                    this.B = 1;
                    return;
                }
            }
            this.D = d;
            this.B = 2;
            return;
        }
        if (i2 == 19) {
            char[] i4 = c7f0Var.i();
            int i5 = c7f0Var.c;
            if (i5 < 0) {
                i5 = 0;
            }
            boolean z2 = this.J;
            if (z2) {
                i5++;
            }
            String str = z2 ? en70.a : en70.b;
            int length = str.length();
            if (i2 >= length) {
                if (i2 <= length) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length) {
                            break;
                        }
                        int charAt = i4[i5 + i6] - str.charAt(i6);
                        if (charAt == 0) {
                            i6++;
                        }
                    }
                }
            }
            boolean z3 = this.J;
            String str2 = en70.a;
            long j = 0;
            for (int i7 = 0; i7 < 19; i7++) {
                j = (j * 10) + (i4[i5 + i7] - '0');
            }
            if (z3) {
                j = -j;
            }
            this.D = j;
            this.B = 2;
            return;
        }
        String d3 = c7f0Var.d();
        if (i == 1 || i == 2) {
            if (i == 1) {
                throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", qj90.S(d3), Integer.MIN_VALUE, Integer.MAX_VALUE), this.c, Integer.TYPE);
            }
            b0(d3);
            throw null;
        }
        if (i == 8 || i == 32) {
            this.I = d3;
            this.B = 8;
        } else {
            this.G = null;
            this.I = d3;
            this.B = 4;
        }
    }

    public void m0() throws IOException {
        c7f0 c7f0Var = this.y;
        c7f0Var.c = -1;
        c7f0Var.i = 0;
        c7f0Var.d = 0;
        c7f0Var.b = null;
        c7f0Var.k = null;
        if (c7f0Var.f) {
            c7f0Var.b();
        }
        im8 im8Var = c7f0Var.a;
        char[] cArr = c7f0Var.h;
        if (cArr != null) {
            c7f0Var.h = null;
            im8Var.b.set(2, cArr);
        }
        char[] cArr2 = this.z;
        if (cArr2 != null) {
            this.z = null;
            tnv tnvVar = this.m;
            char[] cArr3 = tnvVar.k;
            if (cArr2 != cArr3 && cArr2.length < cArr3.length) {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
            tnvVar.k = null;
            tnvVar.e.b.set(3, cArr2);
        }
    }

    public final void n0(char c, int i) throws JsonParseException {
        lay layVar = this.w;
        throw b(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", Character.valueOf((char) i), Character.valueOf(c), layVar.e(), new JsonLocation(d0(), -1L, -1L, layVar.h, layVar.i)));
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final BigInteger o() throws IOException {
        int i = this.B;
        if ((i & 4) == 0) {
            if (i == 0) {
                k0(4);
            }
            int i2 = this.B;
            if ((i2 & 4) == 0) {
                if ((i2 & 16) != 0) {
                    this.G = e0(f0());
                } else if ((i2 & 2) != 0) {
                    this.G = BigInteger.valueOf(this.D);
                } else if ((i2 & 1) != 0) {
                    this.G = BigInteger.valueOf(this.C);
                } else {
                    if ((i2 & 8) == 0) {
                        cor0.a();
                        throw null;
                    }
                    if (this.I != null) {
                        this.G = e0(f0());
                    } else {
                        this.G = e0(BigDecimal.valueOf(h0()));
                    }
                }
                this.B |= 4;
            }
        }
        return g0();
    }

    public final void o0(int i, String str) throws JsonParseException {
        if (!JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS.j(this.b) || i > 32) {
            throw b("Illegal unquoted character (" + qj90.P((char) i) + "): has to be escaped using backslash to be included in " + str);
        }
    }

    public final String p0() throws IOException {
        return JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.j(this.b) ? "(JSON String, Number (or 'NaN'/'INF'/'+INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String q() throws IOException {
        lay layVar;
        JsonToken jsonToken = this.c;
        return ((jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) && (layVar = this.w.d) != null) ? layVar.g : this.w.g;
    }

    public final void q0() throws IOException {
        int i = this.B;
        int i2 = i & 2;
        Class cls = Integer.TYPE;
        if (i2 != 0) {
            long j = this.D;
            int i3 = (int) j;
            if (i3 != j) {
                throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", qj90.S(E()), Integer.MIN_VALUE, Integer.MAX_VALUE), this.c, cls);
            }
            this.C = i3;
        } else if ((i & 4) != 0) {
            BigInteger g0 = g0();
            if (qj90.e.compareTo(g0) > 0 || qj90.f.compareTo(g0) < 0) {
                throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", qj90.S(E()), Integer.MIN_VALUE, Integer.MAX_VALUE), this.c, cls);
            }
            this.C = g0.intValue();
        } else if ((i & 8) != 0) {
            double h0 = h0();
            if (h0 < -2.147483648E9d || h0 > 2.147483647E9d) {
                throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", qj90.S(E()), Integer.MIN_VALUE, Integer.MAX_VALUE), this.c, cls);
            }
            this.C = (int) h0;
        } else {
            if ((i & 16) == 0) {
                cor0.a();
                throw null;
            }
            BigDecimal f0 = f0();
            if (qj90.k.compareTo(f0) > 0 || qj90.l.compareTo(f0) < 0) {
                throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", qj90.S(E()), Integer.MIN_VALUE, Integer.MAX_VALUE), this.c, cls);
            }
            this.C = f0.intValue();
        }
        this.B |= 1;
    }

    public final void r0(int i, int i2) throws IOException {
        lay layVar = this.w;
        lay layVar2 = layVar.f;
        if (layVar2 == null) {
            int i3 = layVar.c + 1;
            xno xnoVar = layVar.e;
            layVar2 = new lay(layVar, i3, xnoVar != null ? new xno((Closeable) xnoVar.a) : null, 1, i, i2);
            layVar.f = layVar2;
        } else {
            layVar2.a = 1;
            layVar2.b = -1;
            layVar2.h = i;
            layVar2.i = i2;
            layVar2.g = null;
            xno xnoVar2 = layVar2.e;
            if (xnoVar2 != null) {
                xnoVar2.b = null;
                xnoVar2.c = null;
                xnoVar2.d = null;
            }
        }
        this.w = layVar2;
        this.n.c(layVar2.c);
    }

    public final void s0(int i, int i2) throws IOException {
        lay layVar = this.w;
        lay layVar2 = layVar.f;
        if (layVar2 == null) {
            int i3 = layVar.c + 1;
            xno xnoVar = layVar.e;
            layVar2 = new lay(layVar, i3, xnoVar != null ? new xno((Closeable) xnoVar.a) : null, 2, i, i2);
            layVar.f = layVar2;
        } else {
            layVar2.a = 2;
            layVar2.b = -1;
            layVar2.h = i;
            layVar2.i = i2;
            layVar2.g = null;
            xno xnoVar2 = layVar2.e;
            if (xnoVar2 != null) {
                xnoVar2.b = null;
                xnoVar2.c = null;
                xnoVar2.d = null;
            }
        }
        this.w = layVar2;
        this.n.c(layVar2.c);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final BigDecimal t() throws IOException {
        int i = this.B;
        if ((i & 16) == 0) {
            if (i == 0) {
                k0(16);
            }
            int i2 = this.B;
            if ((i2 & 16) == 0) {
                if ((i2 & 8) != 0) {
                    String str = this.I;
                    if (str == null) {
                        str = E();
                    }
                    this.H = en70.a(str, StreamReadFeature.USE_FAST_BIG_NUMBER_PARSER.j().j(this.b));
                } else if ((i2 & 4) != 0) {
                    this.H = new BigDecimal(g0());
                } else if ((i2 & 2) != 0) {
                    this.H = BigDecimal.valueOf(this.D);
                } else {
                    if ((i2 & 1) == 0) {
                        cor0.a();
                        throw null;
                    }
                    this.H = BigDecimal.valueOf(this.C);
                }
                this.B |= 16;
            }
        }
        return f0();
    }

    public final JsonToken u0(double d, String str) throws IOException {
        c7f0 c7f0Var = this.y;
        c7f0Var.b = null;
        c7f0Var.c = -1;
        c7f0Var.d = 0;
        c7f0Var.m(str.length());
        c7f0Var.j = str;
        c7f0Var.k = null;
        if (c7f0Var.f) {
            c7f0Var.b();
        }
        c7f0Var.i = 0;
        this.F = d;
        this.B = 8;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final double v() throws IOException {
        int i = this.B;
        if ((i & 8) == 0) {
            if (i == 0) {
                k0(8);
            }
            int i2 = this.B;
            if ((i2 & 8) == 0) {
                if ((i2 & 16) != 0) {
                    if (this.I != null) {
                        this.F = h0();
                    } else {
                        this.F = f0().doubleValue();
                    }
                } else if ((i2 & 4) != 0) {
                    if (this.I != null) {
                        this.F = h0();
                    } else {
                        this.F = g0().doubleValue();
                    }
                } else if ((i2 & 2) != 0) {
                    this.F = this.D;
                } else if ((i2 & 1) != 0) {
                    this.F = this.C;
                } else {
                    if ((i2 & 32) == 0) {
                        cor0.a();
                        throw null;
                    }
                    if (this.I != null) {
                        this.F = h0();
                    } else {
                        this.F = i0();
                    }
                }
                this.B |= 8;
            }
        }
        return h0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final float w() throws IOException {
        int i = this.B;
        if ((i & 32) == 0) {
            if (i == 0) {
                k0(32);
            }
            int i2 = this.B;
            if ((i2 & 32) == 0) {
                if ((i2 & 16) != 0) {
                    if (this.I != null) {
                        this.E = i0();
                    } else {
                        this.E = f0().floatValue();
                    }
                } else if ((i2 & 4) != 0) {
                    if (this.I != null) {
                        this.E = i0();
                    } else {
                        this.E = g0().floatValue();
                    }
                } else if ((i2 & 2) != 0) {
                    this.E = this.D;
                } else if ((i2 & 1) != 0) {
                    this.E = this.C;
                } else {
                    if ((i2 & 8) == 0) {
                        cor0.a();
                        throw null;
                    }
                    if (this.I != null) {
                        this.E = i0();
                    } else {
                        this.E = (float) h0();
                    }
                }
                this.B |= 32;
            }
        }
        return i0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int x() throws IOException {
        int i = this.B;
        int i2 = i & 1;
        if (i2 == 0) {
            if (i == 0) {
                if (this.o) {
                    throw b("Internal error: _parseNumericValue called when parser instance closed");
                }
                if (this.c != JsonToken.VALUE_NUMBER_INT || this.K > 9) {
                    k0(1);
                    if ((this.B & 1) == 0) {
                        q0();
                    }
                    return this.C;
                }
                int c = this.y.c(this.J);
                this.C = c;
                this.B = 1;
                return c;
            }
            if (i2 == 0) {
                q0();
            }
        }
        return this.C;
    }

    public final JsonToken x0(int i, int i2, int i3, boolean z) throws IOException {
        this.n.a(i2 + i + i3);
        this.J = z;
        this.K = i;
        this.B = 0;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final long y() throws IOException {
        int i = this.B;
        if ((i & 2) == 0) {
            if (i == 0) {
                k0(2);
            }
            int i2 = this.B;
            if ((i2 & 2) == 0) {
                if ((i2 & 1) != 0) {
                    this.D = this.C;
                } else if ((i2 & 4) != 0) {
                    BigInteger g0 = g0();
                    if (qj90.g.compareTo(g0) > 0 || qj90.h.compareTo(g0) < 0) {
                        b0(E());
                        throw null;
                    }
                    this.D = g0.longValue();
                } else if ((i2 & 8) != 0) {
                    double h0 = h0();
                    if (h0 < -9.223372036854776E18d || h0 > 9.223372036854776E18d) {
                        b0(E());
                        throw null;
                    }
                    this.D = (long) h0;
                } else {
                    if ((i2 & 16) == 0) {
                        cor0.a();
                        throw null;
                    }
                    BigDecimal f0 = f0();
                    if (qj90.i.compareTo(f0) > 0 || qj90.j.compareTo(f0) < 0) {
                        b0(E());
                        throw null;
                    }
                    this.D = f0.longValue();
                }
                this.B |= 2;
            }
        }
        return this.D;
    }

    public final JsonToken y0(int i, boolean z) throws IOException {
        this.n.b(i);
        this.J = z;
        this.K = i;
        this.B = 0;
        return JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JsonParser.NumberType z() throws IOException {
        if (this.B == 0) {
            k0(0);
        }
        if (this.c == JsonToken.VALUE_NUMBER_INT) {
            int i = this.B;
            return (i & 1) != 0 ? JsonParser.NumberType.INT : (i & 2) != 0 ? JsonParser.NumberType.LONG : JsonParser.NumberType.BIG_INTEGER;
        }
        int i2 = this.B;
        return (i2 & 16) != 0 ? JsonParser.NumberType.BIG_DECIMAL : (i2 & 32) != 0 ? JsonParser.NumberType.FLOAT : JsonParser.NumberType.DOUBLE;
    }
}
