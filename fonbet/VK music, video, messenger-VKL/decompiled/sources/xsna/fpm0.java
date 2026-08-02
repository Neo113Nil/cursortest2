package xsna;

import java.util.ArrayList;
import java.util.Arrays;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.WriteMode;
import xsna.d9y;
import xsna.gay;
import xsna.gmi0;

/* compiled from: StreamingJsonDecoder.kt */
/* loaded from: classes8.dex */
public final class fpm0 extends be implements x8y {
    public final j8y b;
    public final WriteMode c;
    public final af d;
    public final de e;
    public int f = -1;
    public a g;
    public final q8y h;
    public final d9y i;

    /* compiled from: StreamingJsonDecoder.kt */
    public static final class a {
        public String a;
    }

    /* compiled from: StreamingJsonDecoder.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WriteMode.values().length];
            try {
                iArr[WriteMode.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WriteMode.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WriteMode.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public fpm0(j8y j8yVar, WriteMode writeMode, af afVar, SerialDescriptor serialDescriptor, a aVar) {
        this.b = j8yVar;
        this.c = writeMode;
        this.d = afVar;
        this.e = j8yVar.b;
        this.g = aVar;
        q8y q8yVar = j8yVar.a;
        this.h = q8yVar;
        this.i = q8yVar.f ? null : new d9y(serialDescriptor);
    }

    @Override // xsna.be, kotlinx.serialization.encoding.Decoder
    public final int B() {
        af afVar = this.d;
        long i = afVar.i();
        int i2 = (int) i;
        if (i == i2) {
            return i2;
        }
        af.q(afVar, q9k.d("Failed to parse int for input '", i, '\''), 0, null, 6);
        throw null;
    }

    @Override // xsna.be, kotlinx.serialization.encoding.Decoder
    public final Decoder C(SerialDescriptor serialDescriptor) {
        return hpm0.a(serialDescriptor) ? new y8y(this.d, this.b) : this;
    }

    @Override // xsna.be, kotlinx.serialization.encoding.Decoder
    public final float D() {
        af afVar = this.d;
        String l = afVar.l();
        try {
            float parseFloat = Float.parseFloat(l);
            q8y q8yVar = this.b.a;
            if (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat)) {
                return parseFloat;
            }
            af.q(afVar, "Unexpected special floating-point value " + Float.valueOf(parseFloat) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            af.q(afVar, air.b('\'', "Failed to parse type 'float' for input '", l), 0, null, 6);
            throw null;
        }
    }

    @Override // xsna.be, kotlinx.serialization.encoding.Decoder
    public final boolean E() {
        boolean z;
        boolean z2;
        af afVar = this.d;
        int A = afVar.A();
        if (A == afVar.u().length()) {
            af.q(afVar, "EOF", 0, null, 6);
            throw null;
        }
        if (afVar.u().charAt(A) == '\"') {
            A++;
            z = true;
        } else {
            z = false;
        }
        int z3 = afVar.z(A);
        if (z3 >= afVar.u().length() || z3 == -1) {
            af.q(afVar, "EOF", 0, null, 6);
            throw null;
        }
        int i = z3 + 1;
        int charAt = afVar.u().charAt(z3) | ' ';
        if (charAt == 102) {
            afVar.d(i, "alse");
            z2 = false;
        } else {
            if (charAt != 116) {
                af.q(afVar, "Expected valid boolean literal prefix, but had '" + afVar.l() + '\'', 0, null, 6);
                throw null;
            }
            afVar.d(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (afVar.a == afVar.u().length()) {
            af.q(afVar, "EOF", 0, null, 6);
            throw null;
        }
        if (afVar.u().charAt(afVar.a) == '\"') {
            afVar.a++;
            return z2;
        }
        af.q(afVar, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // xsna.be, kotlinx.serialization.encoding.Decoder
    public final boolean G() {
        d9y d9yVar = this.i;
        return ((d9yVar != null ? d9yVar.b : false) || this.d.D(true)) ? false : true;
    }

    @Override // kotlinx.serialization.encoding.Decoder, xsna.ssi
    public final de c() {
        return this.e;
    }

    @Override // xsna.be, kotlinx.serialization.encoding.Decoder
    public final ssi d(SerialDescriptor serialDescriptor) {
        j8y j8yVar = this.b;
        WriteMode b2 = g2y0.b(serialDescriptor, j8yVar);
        af afVar = this.d;
        gay gayVar = afVar.b;
        int i = gayVar.c + 1;
        gayVar.c = i;
        Object[] objArr = gayVar.a;
        if (i == objArr.length) {
            int i2 = i * 2;
            gayVar.a = Arrays.copyOf(objArr, i2);
            gayVar.b = Arrays.copyOf(gayVar.b, i2);
        }
        gayVar.a[i] = serialDescriptor;
        afVar.h(b2.begin);
        if (afVar.x() != 4) {
            int i3 = b.$EnumSwitchMapping$0[b2.ordinal()];
            return (i3 == 1 || i3 == 2 || i3 == 3) ? new fpm0(this.b, b2, afVar, serialDescriptor, this.g) : (this.c == b2 && j8yVar.a.f) ? this : new fpm0(this.b, b2, afVar, serialDescriptor, this.g);
        }
        af.q(afVar, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // xsna.be, xsna.ssi
    public final void e(SerialDescriptor serialDescriptor) {
        if (this.b.a.b && serialDescriptor.c() == 0) {
            while (m(serialDescriptor) != -1) {
            }
        }
        af afVar = this.d;
        if (afVar.C()) {
            ne7.u(afVar, "");
            throw null;
        }
        afVar.h(this.c.end);
        gay gayVar = afVar.b;
        int i = gayVar.c;
        int[] iArr = gayVar.b;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            gayVar.c = i - 1;
        }
        int i2 = gayVar.c;
        if (i2 != -1) {
            gayVar.c = i2 - 1;
        }
    }

    @Override // xsna.x8y
    public final j8y f() {
        return this.b;
    }

    @Override // xsna.be, kotlinx.serialization.encoding.Decoder
    public final double g() {
        af afVar = this.d;
        String l = afVar.l();
        try {
            double parseDouble = Double.parseDouble(l);
            q8y q8yVar = this.b.a;
            if (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble)) {
                return parseDouble;
            }
            af.q(afVar, "Unexpected special floating-point value " + Double.valueOf(parseDouble) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            af.q(afVar, air.b('\'', "Failed to parse type 'double' for input '", l), 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011e  */
    @Override // xsna.be, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> T h(a3m<? extends T> a3mVar) {
        j8y j8yVar = this.b;
        af afVar = this.d;
        gay gayVar = afVar.b;
        try {
        } catch (MissingFieldException e) {
            if (!drm0.D(e.getMessage(), "at path", false)) {
            }
        }
        if (!(a3mVar instanceof dh)) {
            return a3mVar.deserialize(this);
        }
        q8y q8yVar = j8yVar.a;
        String c = sub0.c(((dh) a3mVar).getDescriptor(), j8yVar);
        String w = afVar.w(c, this.h.c);
        String str = null;
        if (w != null) {
            try {
                a3m l = rte0.l((dh) a3mVar, this, w);
                a aVar = new a();
                aVar.a = c;
                this.g = aVar;
                return (T) l.deserialize(this);
            } catch (SerializationException e2) {
                String W = drm0.W(drm0.l0(e2.getMessage(), '\n'), ".");
                String message = e2.getMessage();
                String str2 = "";
                int L = drm0.L(message, '\n', 0, 6);
                if (L != -1) {
                    str2 = message.substring(L + 1, message.length());
                }
                af.q(afVar, W, 0, str2, 2);
                throw null;
            }
        }
        if (a3mVar == null) {
            return (T) ((dh) a3mVar).deserialize(this);
        }
        q8y q8yVar2 = j8yVar.a;
        String c2 = sub0.c(((dh) a3mVar).getDescriptor(), j8yVar);
        JsonElement l2 = l();
        String f = ((dh) a3mVar).getDescriptor().f();
        if (l2 instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject) l2;
            JsonElement jsonElement = (JsonElement) jsonObject.get(c2);
            if (jsonElement != null) {
                JsonPrimitive e3 = c9y.e(jsonElement);
                if (!(e3 instanceof JsonNull)) {
                    str = e3.c();
                }
            }
            try {
                return (T) up2.r(j8yVar, c2, jsonObject, rte0.l((dh) a3mVar, this, str));
            } catch (SerializationException e4) {
                throw ne7.d(e4.getMessage(), jsonObject.toString(), -1);
            }
        }
        throw ne7.d("Expected " + fpf0.a(JsonObject.class).l() + ", but had " + fpf0.a(l2.getClass()).l() + " as the serialized body of " + f + " at element: " + gayVar.a(), l2.toString(), -1);
        if (!drm0.D(e.getMessage(), "at path", false)) {
            throw e;
        }
        throw new MissingFieldException(e.d(), e.getMessage() + " at path: " + gayVar.a(), e);
    }

    @Override // xsna.be, kotlinx.serialization.encoding.Decoder
    public final int j(SerialDescriptor serialDescriptor) {
        return t9y.b(serialDescriptor, this.b, x(), " at path ".concat(this.d.b.a()));
    }

    @Override // xsna.x8y
    public final JsonElement l() {
        return new jby(this.b.a, this.d).b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x00dc, code lost:
    
        r1 = r15.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00e0, code lost:
    
        if (r8 >= 64) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00e2, code lost:
    
        r1.c |= 1 << r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00ec, code lost:
    
        r2 = (r8 >>> 6) - 1;
        r1 = r1.d;
        r1[r2] = r1[r2] | (1 << (r8 & 63));
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0117, code lost:
    
        r2.p(xsna.drm0.O(0, 6, r2.B(0, r2.a), r12), xsna.air.b('\'', "Encountered an unknown key '", r12), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0131, code lost:
    
        throw null;
     */
    @Override // xsna.ssi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(SerialDescriptor serialDescriptor) {
        int i;
        int a2;
        byte b2;
        boolean z;
        byte b3;
        char c;
        String y;
        af afVar = this.d;
        gay gayVar = afVar.b;
        int[] iArr = b.$EnumSwitchMapping$0;
        WriteMode writeMode = this.c;
        int i2 = iArr[writeMode.ordinal()];
        char c2 = ':';
        boolean z2 = false;
        int i3 = 0;
        z2 = false;
        j8y j8yVar = this.b;
        boolean z3 = true;
        int i4 = -1;
        if (i2 == 2) {
            int i5 = this.f;
            boolean z4 = i5 % 2 != 0;
            if (z4) {
                i = -1;
                if (i5 != -1) {
                    z2 = afVar.C();
                }
            } else {
                i = -1;
                afVar.h(':');
            }
            if (afVar.c()) {
                if (z4) {
                    if (this.f == i) {
                        int i6 = afVar.a;
                        if (z2) {
                            af.q(afVar, "Unexpected leading comma", i6, null, 4);
                            throw null;
                        }
                    } else {
                        int i7 = afVar.a;
                        if (!z2) {
                            af.q(afVar, "Expected comma after the key-value pair", i7, null, 4);
                            throw null;
                        }
                    }
                }
                i4 = this.f + 1;
                this.f = i4;
            } else {
                if (z2) {
                    q8y q8yVar = j8yVar.a;
                    ne7.v(afVar);
                    throw null;
                }
                i4 = i;
            }
        } else if (i2 != 4) {
            boolean C = afVar.C();
            if (afVar.c()) {
                int i8 = this.f;
                if (i8 != -1 && !C) {
                    af.q(afVar, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i4 = i8 + 1;
                this.f = i4;
            } else if (C) {
                q8y q8yVar2 = j8yVar.a;
                ne7.u(afVar, "array");
                throw null;
            }
        } else {
            boolean C2 = afVar.C();
            while (true) {
                boolean c3 = afVar.c();
                d9y d9yVar = this.i;
                if (c3) {
                    q8y q8yVar3 = this.h;
                    boolean z5 = q8yVar3.c;
                    String m = z5 ? afVar.m() : afVar.e();
                    afVar.h(c2);
                    a2 = t9y.a(serialDescriptor, j8yVar, m);
                    if (a2 == -3) {
                        b2 = z3;
                        z = false;
                        b3 = b2;
                    } else {
                        if (!q8yVar3.h) {
                            break;
                        }
                        boolean i9 = serialDescriptor.i(a2);
                        SerialDescriptor h = serialDescriptor.h(a2);
                        if (!i9 || h.b() || !afVar.D(z3)) {
                            b2 = z3;
                            if (!epx.f(h.getKind(), gmi0.b.a) || ((h.b() && afVar.D(false)) || (y = afVar.y(z5)) == null)) {
                                break;
                            }
                            int a3 = t9y.a(h, j8yVar, y);
                            byte b4 = (j8yVar.a.f || !h.b()) ? (byte) 0 : b2;
                            if (a3 != -3 || (!i9 && b4 == 0)) {
                                break;
                            }
                            afVar.j();
                        } else {
                            b2 = z3;
                        }
                        z = afVar.C();
                        b3 = 0;
                    }
                    if (b3 != 0) {
                        if (!q8yVar3.b) {
                            a aVar = this.g;
                            if (aVar == null || !epx.f(aVar.a, m)) {
                                break;
                            }
                            aVar.a = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte x = afVar.x();
                        if (x == 8 || x == 6) {
                            while (true) {
                                byte x2 = afVar.x();
                                if (x2 != b2) {
                                    c = 6;
                                    if (x2 == 8 || x2 == 6) {
                                        arrayList.add(Byte.valueOf(x2));
                                    } else {
                                        if (x2 == 9) {
                                            if (((Number) j5g.i0(arrayList)).byteValue() != 8) {
                                                throw ne7.d("found ] instead of } at path: " + gayVar, afVar.u(), afVar.a);
                                            }
                                            g5g.I(arrayList);
                                        } else if (x2 == 7) {
                                            if (((Number) j5g.i0(arrayList)).byteValue() != 6) {
                                                throw ne7.d("found } instead of ] at path: " + gayVar, afVar.u(), afVar.a);
                                            }
                                            g5g.I(arrayList);
                                        } else if (x2 == 10) {
                                            af.q(afVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                            throw null;
                                        }
                                        c = 6;
                                    }
                                    afVar.f();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                } else if (z5) {
                                    afVar.l();
                                } else {
                                    afVar.e();
                                }
                                b2 = 1;
                            }
                        } else {
                            afVar.l();
                            c = 6;
                        }
                        C2 = afVar.C();
                    } else {
                        C2 = z;
                    }
                    c2 = ':';
                    z3 = true;
                } else {
                    if (C2) {
                        q8y q8yVar4 = j8yVar.a;
                        ne7.v(afVar);
                        throw null;
                    }
                    if (d9yVar != null) {
                        xap xapVar = d9yVar.a;
                        d9y.a aVar2 = xapVar.b;
                        SerialDescriptor serialDescriptor2 = xapVar.a;
                        int c4 = serialDescriptor2.c();
                        while (true) {
                            long j = xapVar.c;
                            if (j != -1) {
                                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                                xapVar.c |= 1 << numberOfTrailingZeros;
                                if (((Boolean) aVar2.invoke(serialDescriptor2, Integer.valueOf(numberOfTrailingZeros))).booleanValue()) {
                                    i4 = numberOfTrailingZeros;
                                    break;
                                }
                            } else if (c4 > 64) {
                                long[] jArr = xapVar.d;
                                int length = jArr.length;
                                loop3: while (i3 < length) {
                                    int i10 = i3 + 1;
                                    int i11 = i10 * 64;
                                    long j2 = jArr[i3];
                                    while (j2 != -1) {
                                        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j2);
                                        j2 |= 1 << numberOfTrailingZeros2;
                                        int i12 = numberOfTrailingZeros2 + i11;
                                        if (((Boolean) aVar2.invoke(serialDescriptor2, Integer.valueOf(i12))).booleanValue()) {
                                            jArr[i3] = j2;
                                            i4 = i12;
                                            break loop3;
                                        }
                                    }
                                    jArr[i3] = j2;
                                    i3 = i10;
                                }
                            }
                        }
                    }
                    i4 = -1;
                }
            }
            i4 = a2;
        }
        if (writeMode != WriteMode.MAP) {
            gayVar.b[gayVar.c] = i4;
        }
        return i4;
    }

    @Override // xsna.be, kotlinx.serialization.encoding.Decoder
    public final byte p() {
        af afVar = this.d;
        long i = afVar.i();
        byte b2 = (byte) i;
        if (i == b2) {
            return b2;
        }
        af.q(afVar, q9k.d("Failed to parse byte for input '", i, '\''), 0, null, 6);
        throw null;
    }

    @Override // xsna.be, kotlinx.serialization.encoding.Decoder
    public final long t() {
        return this.d.i();
    }

    @Override // xsna.be, kotlinx.serialization.encoding.Decoder
    public final short v() {
        af afVar = this.d;
        long i = afVar.i();
        short s = (short) i;
        if (i == s) {
            return s;
        }
        af.q(afVar, q9k.d("Failed to parse short for input '", i, '\''), 0, null, 6);
        throw null;
    }

    @Override // xsna.be, kotlinx.serialization.encoding.Decoder
    public final char w() {
        af afVar = this.d;
        String l = afVar.l();
        if (l.length() == 1) {
            return l.charAt(0);
        }
        af.q(afVar, air.b('\'', "Expected single char, but got '", l), 0, null, 6);
        throw null;
    }

    @Override // xsna.be, kotlinx.serialization.encoding.Decoder
    public final String x() {
        boolean z = this.h.c;
        af afVar = this.d;
        return z ? afVar.m() : afVar.j();
    }

    @Override // xsna.be, xsna.ssi
    public final <T> T y(SerialDescriptor serialDescriptor, int i, a3m<? extends T> a3mVar, T t) {
        gay gayVar = this.d.b;
        boolean z = this.c == WriteMode.MAP && (i & 1) == 0;
        if (z) {
            int[] iArr = gayVar.b;
            int i2 = gayVar.c;
            if (iArr[i2] == -2) {
                gayVar.a[i2] = gay.a.a;
            }
        }
        T t2 = (T) h(a3mVar);
        if (z) {
            int[] iArr2 = gayVar.b;
            int i3 = gayVar.c;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                gayVar.c = i4;
                Object[] objArr = gayVar.a;
                if (i4 == objArr.length) {
                    int i5 = i4 * 2;
                    gayVar.a = Arrays.copyOf(objArr, i5);
                    gayVar.b = Arrays.copyOf(gayVar.b, i5);
                }
            }
            Object[] objArr2 = gayVar.a;
            int i6 = gayVar.c;
            objArr2[i6] = t2;
            gayVar.b[i6] = -2;
        }
        return t2;
    }
}
