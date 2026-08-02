package defpackage;

import com.adjust.sdk.Constants;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.util.NoSuchElementException;
import kotlin.collections.a;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* loaded from: classes9.dex */
public abstract class c8 extends w150 implements ncx {
    public final sbx c;
    public final String d;
    public final ccx e;

    public c8(sbx sbxVar, String str) {
        this.c = sbxVar;
        this.d = str;
        this.e = sbxVar.a;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Object B(myi myiVar) {
        if (!(myiVar instanceof i9)) {
            return myiVar.deserialize(this);
        }
        sbx sbxVar = this.c;
        ccx ccxVar = sbxVar.a;
        i9 i9Var = (i9) myiVar;
        String f = s8o.f(sbxVar, i9Var.getDescriptor());
        b Z = Z();
        String h = i9Var.getDescriptor().h();
        if (Z instanceof c) {
            c cVar = (c) Z;
            b bVar = (b) cVar.get(f);
            try {
                myi w = rzo.w((i9) myiVar, this, bVar != null ? qcx.g(qcx.n(bVar)) : null);
                return new kex(sbxVar, cVar, f, w.getDescriptor()).B(w);
            } catch (SerializationException e) {
                String message = e.getMessage();
                String obj = sbxVar.a.n ? qje.G(-1, cVar.toString()).toString() : null;
                throw new JsonDecodingException(qje.n(-1, message, null, null, obj), message, null, obj, -1, null);
            }
        }
        String str = "Expected " + qoi0.a(c.class).d() + ", but had " + qoi0.a(Z.getClass()).d() + " as the serialized body of " + h;
        String X = X();
        String obj2 = sbxVar.a.n ? qje.G(-1, Z.toString()).toString() : null;
        throw new JsonDecodingException(qje.n(-1, str, X, null, obj2), str, X, obj2, -1, null);
    }

    @Override // defpackage.n7x0, kotlinx.serialization.encoding.Decoder
    public boolean D() {
        return !(Z() instanceof JsonNull);
    }

    @Override // defpackage.n7x0
    public final boolean G(Object obj) {
        String str = (String) obj;
        b Y = Y(str);
        if (Y instanceof d) {
            d dVar = (d) Y;
            try {
                Boolean f = qcx.f(dVar);
                if (f != null) {
                    return f.booleanValue();
                }
                c0(dVar, "boolean", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                c0(dVar, "boolean", str);
                throw null;
            }
        }
        String str2 = "Expected " + qoi0.a(d.class).d() + ", but had " + qoi0.a(Y.getClass()).d() + " as the serialized body of boolean";
        String b0 = b0(str);
        String obj2 = this.c.a.n ? qje.G(-1, Y.toString()).toString() : null;
        throw new JsonDecodingException(qje.n(-1, str2, b0, null, obj2), str2, b0, obj2, -1, null);
    }

    @Override // defpackage.n7x0
    public final byte H(Object obj) {
        String str = (String) obj;
        b Y = Y(str);
        if (Y instanceof d) {
            d dVar = (d) Y;
            try {
                long p = qcx.p(dVar);
                Byte valueOf = (-128 > p || p > 127) ? null : Byte.valueOf((byte) p);
                if (valueOf != null) {
                    return valueOf.byteValue();
                }
                c0(dVar, "byte", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                c0(dVar, "byte", str);
                throw null;
            }
        }
        String str2 = "Expected " + qoi0.a(d.class).d() + ", but had " + qoi0.a(Y.getClass()).d() + " as the serialized body of byte";
        String b0 = b0(str);
        String obj2 = this.c.a.n ? qje.G(-1, Y.toString()).toString() : null;
        throw new JsonDecodingException(qje.n(-1, str2, b0, null, obj2), str2, b0, obj2, -1, null);
    }

    @Override // defpackage.n7x0
    public final char I(Object obj) {
        String str = (String) obj;
        b Y = Y(str);
        if (!(Y instanceof d)) {
            String str2 = "Expected " + qoi0.a(d.class).d() + ", but had " + qoi0.a(Y.getClass()).d() + " as the serialized body of char";
            String b0 = b0(str);
            String obj2 = this.c.a.n ? qje.G(-1, Y.toString()).toString() : null;
            throw new JsonDecodingException(qje.n(-1, str2, b0, null, obj2), str2, b0, obj2, -1, null);
        }
        d dVar = (d) Y;
        try {
            String a = dVar.a();
            int length = a.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return a.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            c0(dVar, "char", str);
            throw null;
        }
    }

    @Override // defpackage.n7x0
    public final double J(Object obj) {
        String str = (String) obj;
        b Y = Y(str);
        boolean z = Y instanceof d;
        sbx sbxVar = this.c;
        if (!z) {
            String str2 = "Expected " + qoi0.a(d.class).d() + ", but had " + qoi0.a(Y.getClass()).d() + " as the serialized body of double";
            String b0 = b0(str);
            String obj2 = sbxVar.a.n ? qje.G(-1, Y.toString()).toString() : null;
            throw new JsonDecodingException(qje.n(-1, str2, b0, null, obj2), str2, b0, obj2, -1, null);
        }
        d dVar = (d) Y;
        try {
            double h = qcx.h(dVar);
            ccx ccxVar = sbxVar.a;
            if (Math.abs(h) <= Double.MAX_VALUE) {
                return h;
            }
            String I = qje.I(Double.valueOf(h), str);
            String obj3 = sbxVar.a.n ? qje.G(-1, Z().toString()).toString() : null;
            throw new JsonDecodingException(qje.n(-1, I, null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", obj3), I, null, obj3, -1, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        } catch (IllegalArgumentException unused) {
            c0(dVar, "double", str);
            throw null;
        }
    }

    @Override // defpackage.n7x0
    public final int K(Object obj, SerialDescriptor serialDescriptor) {
        String str = (String) obj;
        b Y = Y(str);
        String h = serialDescriptor.h();
        boolean z = Y instanceof d;
        sbx sbxVar = this.c;
        if (z) {
            return ddx.c(serialDescriptor, sbxVar, ((d) Y).a(), "");
        }
        String str2 = "Expected " + qoi0.a(d.class).d() + ", but had " + qoi0.a(Y.getClass()).d() + " as the serialized body of " + h;
        String b0 = b0(str);
        String obj2 = sbxVar.a.n ? qje.G(-1, Y.toString()).toString() : null;
        throw new JsonDecodingException(qje.n(-1, str2, b0, null, obj2), str2, b0, obj2, -1, null);
    }

    @Override // defpackage.n7x0
    public final float L(Object obj) {
        String str = (String) obj;
        b Y = Y(str);
        boolean z = Y instanceof d;
        sbx sbxVar = this.c;
        if (!z) {
            String str2 = "Expected " + qoi0.a(d.class).d() + ", but had " + qoi0.a(Y.getClass()).d() + " as the serialized body of float";
            String b0 = b0(str);
            String obj2 = sbxVar.a.n ? qje.G(-1, Y.toString()).toString() : null;
            throw new JsonDecodingException(qje.n(-1, str2, b0, null, obj2), str2, b0, obj2, -1, null);
        }
        d dVar = (d) Y;
        try {
            exv exvVar = qcx.a;
            float parseFloat = Float.parseFloat(dVar.a());
            ccx ccxVar = sbxVar.a;
            if (Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            String I = qje.I(Float.valueOf(parseFloat), str);
            String obj3 = sbxVar.a.n ? qje.G(-1, Z().toString()).toString() : null;
            throw new JsonDecodingException(qje.n(-1, I, null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", obj3), I, null, obj3, -1, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        } catch (IllegalArgumentException unused) {
            c0(dVar, "float", str);
            throw null;
        }
    }

    @Override // defpackage.n7x0
    public final Decoder M(Object obj, SerialDescriptor serialDescriptor) {
        String str = (String) obj;
        if (!wru0.a(serialDescriptor)) {
            this.a.add(str);
            return this;
        }
        b Y = Y(str);
        String h = serialDescriptor.h();
        boolean z = Y instanceof d;
        sbx sbxVar = this.c;
        if (z) {
            return new ocx(ffx.d(sbxVar, ((d) Y).a()), sbxVar);
        }
        String str2 = "Expected " + qoi0.a(d.class).d() + ", but had " + qoi0.a(Y.getClass()).d() + " as the serialized body of " + h;
        String b0 = b0(str);
        String obj2 = sbxVar.a.n ? qje.G(-1, Y.toString()).toString() : null;
        throw new JsonDecodingException(qje.n(-1, str2, b0, null, obj2), str2, b0, obj2, -1, null);
    }

    @Override // defpackage.n7x0
    public final int N(Object obj) {
        String str = (String) obj;
        b Y = Y(str);
        if (Y instanceof d) {
            d dVar = (d) Y;
            try {
                long p = qcx.p(dVar);
                Integer valueOf = (-2147483648L > p || p > 2147483647L) ? null : Integer.valueOf((int) p);
                if (valueOf != null) {
                    return valueOf.intValue();
                }
                c0(dVar, "int", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                c0(dVar, "int", str);
                throw null;
            }
        }
        String str2 = "Expected " + qoi0.a(d.class).d() + ", but had " + qoi0.a(Y.getClass()).d() + " as the serialized body of int";
        String b0 = b0(str);
        String obj2 = this.c.a.n ? qje.G(-1, Y.toString()).toString() : null;
        throw new JsonDecodingException(qje.n(-1, str2, b0, null, obj2), str2, b0, obj2, -1, null);
    }

    @Override // defpackage.n7x0
    public final long O(Object obj) {
        String str = (String) obj;
        b Y = Y(str);
        if (Y instanceof d) {
            d dVar = (d) Y;
            try {
                return qcx.p(dVar);
            } catch (IllegalArgumentException unused) {
                this.c0(dVar, Constants.LONG, str);
                throw null;
            }
        }
        String str2 = "Expected " + qoi0.a(d.class).d() + ", but had " + qoi0.a(Y.getClass()).d() + " as the serialized body of long";
        String b0 = b0(str);
        String obj2 = this.c.a.n ? qje.G(-1, Y.toString()).toString() : null;
        throw new JsonDecodingException(qje.n(-1, str2, b0, null, obj2), str2, b0, obj2, -1, null);
    }

    @Override // defpackage.n7x0
    public final boolean P(Object obj) {
        return Y((String) obj) != JsonNull.INSTANCE;
    }

    @Override // defpackage.n7x0
    public final short Q(Object obj) {
        String str = (String) obj;
        b Y = Y(str);
        if (Y instanceof d) {
            d dVar = (d) Y;
            try {
                long p = qcx.p(dVar);
                Short valueOf = (-32768 > p || p > 32767) ? null : Short.valueOf((short) p);
                if (valueOf != null) {
                    return valueOf.shortValue();
                }
                c0(dVar, "short", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                c0(dVar, "short", str);
                throw null;
            }
        }
        String str2 = "Expected " + qoi0.a(d.class).d() + ", but had " + qoi0.a(Y.getClass()).d() + " as the serialized body of short";
        String b0 = b0(str);
        String obj2 = this.c.a.n ? qje.G(-1, Y.toString()).toString() : null;
        throw new JsonDecodingException(qje.n(-1, str2, b0, null, obj2), str2, b0, obj2, -1, null);
    }

    @Override // defpackage.n7x0
    public final String R(Object obj) {
        String str = (String) obj;
        b Y = Y(str);
        boolean z = Y instanceof d;
        sbx sbxVar = this.c;
        if (!z) {
            String str2 = "Expected " + qoi0.a(d.class).d() + ", but had " + qoi0.a(Y.getClass()).d() + " as the serialized body of string";
            String b0 = b0(str);
            String obj2 = sbxVar.a.n ? qje.G(-1, Y.toString()).toString() : null;
            throw new JsonDecodingException(qje.n(-1, str2, b0, null, obj2), str2, b0, obj2, -1, null);
        }
        d dVar = (d) Y;
        if (!(dVar instanceof adx)) {
            String p = oyr.p("Expected string value for a non-null key '", str, "', got null literal instead");
            String b02 = b0(str);
            String obj3 = sbxVar.a.n ? qje.G(-1, Z().toString()).toString() : null;
            throw new JsonDecodingException(qje.n(-1, p, b02, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.", obj3), p, b02, obj3, -1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
        }
        adx adxVar = (adx) dVar;
        if (adxVar.a || sbxVar.a.c) {
            return adxVar.c;
        }
        String p2 = oyr.p("String literal for value of key '", str, "' should be quoted");
        String b03 = b0(str);
        String obj4 = sbxVar.a.n ? qje.G(-1, Z().toString()).toString() : null;
        throw new JsonDecodingException(qje.n(-1, p2, b03, "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", obj4), p2, b03, obj4, -1, "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
    }

    @Override // defpackage.w150
    public final String V(String str, String str2) {
        return str2;
    }

    public abstract b Y(String str);

    public final b Z() {
        b Y;
        String str = (String) a.b0(this.a);
        return (str == null || (Y = Y(str)) == null) ? a0() : Y;
    }

    @Override // defpackage.n7x0, kotlinx.serialization.encoding.Decoder, defpackage.sjd
    public final kf5 a() {
        return this.c.b;
    }

    public abstract b a0();

    @Override // defpackage.n7x0, kotlinx.serialization.encoding.Decoder
    public sjd b(SerialDescriptor serialDescriptor) {
        b Z = Z();
        jl40 kind = serialDescriptor.getKind();
        boolean l = jl40.l(kind, ovu0.h);
        sbx sbxVar = this.c;
        if (l || (kind instanceof s5e0)) {
            String h = serialDescriptor.h();
            if (Z instanceof kotlinx.serialization.json.a) {
                return new mex(sbxVar, (kotlinx.serialization.json.a) Z);
            }
            String str = "Expected " + qoi0.a(kotlinx.serialization.json.a.class).d() + ", but had " + qoi0.a(Z.getClass()).d() + " as the serialized body of " + h;
            String X = X();
            String obj = sbxVar.a.n ? qje.G(-1, Z.toString()).toString() : null;
            throw new JsonDecodingException(qje.n(-1, str, X, null, obj), str, X, obj, -1, null);
        }
        if (!jl40.l(kind, ovu0.i)) {
            String h2 = serialDescriptor.h();
            if (Z instanceof c) {
                return new kex(sbxVar, (c) Z, this.d, 8);
            }
            String str2 = "Expected " + qoi0.a(c.class).d() + ", but had " + qoi0.a(Z.getClass()).d() + " as the serialized body of " + h2;
            String X2 = X();
            String obj2 = sbxVar.a.n ? qje.G(-1, Z.toString()).toString() : null;
            throw new JsonDecodingException(qje.n(-1, str2, X2, null, obj2), str2, X2, obj2, -1, null);
        }
        SerialDescriptor b = vez0.b(serialDescriptor.d(0), sbxVar.b);
        jl40 kind2 = b.getKind();
        if ((kind2 instanceof h2f0) || jl40.l(kind2, fsq0.g)) {
            String h3 = serialDescriptor.h();
            if (Z instanceof c) {
                return new nex(sbxVar, (c) Z);
            }
            String str3 = "Expected " + qoi0.a(c.class).d() + ", but had " + qoi0.a(Z.getClass()).d() + " as the serialized body of " + h3;
            String X3 = X();
            String obj3 = sbxVar.a.n ? qje.G(-1, Z.toString()).toString() : null;
            throw new JsonDecodingException(qje.n(-1, str3, X3, null, obj3), str3, X3, obj3, -1, null);
        }
        if (!sbxVar.a.d) {
            throw qje.a(b);
        }
        String h4 = serialDescriptor.h();
        if (Z instanceof kotlinx.serialization.json.a) {
            return new mex(sbxVar, (kotlinx.serialization.json.a) Z);
        }
        String str4 = "Expected " + qoi0.a(kotlinx.serialization.json.a.class).d() + ", but had " + qoi0.a(Z.getClass()).d() + " as the serialized body of " + h4;
        String X4 = X();
        String obj4 = sbxVar.a.n ? qje.G(-1, Z.toString()).toString() : null;
        throw new JsonDecodingException(qje.n(-1, str4, X4, null, obj4), str4, X4, obj4, -1, null);
    }

    public final String b0(String str) {
        return X() + '.' + str;
    }

    @Override // defpackage.n7x0, defpackage.sjd
    public void c(SerialDescriptor serialDescriptor) {
    }

    public final void c0(d dVar, String str, String str2) {
        String str3 = "Failed to parse literal '" + dVar + "' as " + (cvu0.x(str, CoreConstants.PushMessage.SERVICE_TYPE, false) ? "an " : "a ").concat(str) + " value";
        String b0 = b0(str2);
        String obj = this.c.a.n ? qje.G(-1, Z().toString()).toString() : null;
        throw new JsonDecodingException(qje.n(-1, str3, b0, null, obj), str3, b0, obj, -1, null);
    }

    @Override // defpackage.ncx
    public final sbx d() {
        return this.c;
    }

    @Override // defpackage.ncx
    public final b t() {
        return Z();
    }

    @Override // defpackage.n7x0, kotlinx.serialization.encoding.Decoder
    public final Decoder w(SerialDescriptor serialDescriptor) {
        if (a.b0(this.a) != null) {
            return super.w(serialDescriptor);
        }
        return new sdx(this.c, a0(), this.d).w(serialDescriptor);
    }
}
