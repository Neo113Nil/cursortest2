package defpackage;

import kotlin.collections.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.JsonEncodingException;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes9.dex */
public abstract class f8 extends x150 implements vcx {
    public final sbx b;
    public final tls c;
    public final ccx d;
    public String e;
    public String f;

    public f8(sbx sbxVar, tls tlsVar) {
        this.b = sbxVar;
        this.c = tlsVar;
        this.d = sbxVar.a;
    }

    @Override // defpackage.o7x0, kotlinx.serialization.encoding.Encoder
    public final void C() {
    }

    @Override // defpackage.yjd
    public final boolean F() {
        return this.d.a;
    }

    @Override // defpackage.o7x0
    public final void G(Object obj, boolean z) {
        Z((String) obj, qcx.a(Boolean.valueOf(z)));
    }

    @Override // defpackage.o7x0
    public final void H(Object obj, byte b) {
        Z((String) obj, qcx.b(Byte.valueOf(b)));
    }

    @Override // defpackage.o7x0
    public final void I(Object obj, char c) {
        Z((String) obj, qcx.c(String.valueOf(c)));
    }

    @Override // defpackage.o7x0
    public final void J(Object obj, double d) {
        String str = (String) obj;
        Z(str, qcx.b(Double.valueOf(d)));
        this.d.getClass();
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw new JsonEncodingException(qje.I(Double.valueOf(d), str), null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        }
    }

    @Override // defpackage.o7x0
    public final void K(Object obj, SerialDescriptor serialDescriptor, int i) {
        Z((String) obj, qcx.c(serialDescriptor.f(i)));
    }

    @Override // defpackage.o7x0
    public final void L(float f, Object obj) {
        String str = (String) obj;
        Z(str, qcx.b(Float.valueOf(f)));
        this.d.getClass();
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw new JsonEncodingException(qje.I(Float.valueOf(f), str), null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        }
    }

    @Override // defpackage.o7x0
    public final Encoder M(Object obj, SerialDescriptor serialDescriptor) {
        String str = (String) obj;
        if (wru0.a(serialDescriptor)) {
            return new e8(this, str);
        }
        if (serialDescriptor.isInline() && serialDescriptor.equals(qcx.a)) {
            return new e8(this, str, serialDescriptor);
        }
        this.a.add(str);
        return this;
    }

    @Override // defpackage.o7x0
    public final void N(int i, Object obj) {
        Z((String) obj, qcx.b(Integer.valueOf(i)));
    }

    @Override // defpackage.o7x0
    public final void O(long j, Object obj) {
        Z((String) obj, qcx.b(Long.valueOf(j)));
    }

    @Override // defpackage.o7x0
    public final void P(Object obj) {
        Z((String) obj, JsonNull.INSTANCE);
    }

    @Override // defpackage.o7x0
    public final void Q(Object obj, short s) {
        Z((String) obj, qcx.b(Short.valueOf(s)));
    }

    @Override // defpackage.o7x0
    public final void R(Object obj, String str) {
        Z((String) obj, qcx.c(str));
    }

    @Override // defpackage.o7x0
    public final void S(Object obj, Object obj2) {
        Z((String) obj, qcx.c(obj2.toString()));
    }

    @Override // defpackage.o7x0
    public final void T() {
        this.c.invoke(Y());
    }

    @Override // defpackage.x150
    public final String W(String str, String str2) {
        return str2;
    }

    @Override // defpackage.x150
    public String X(SerialDescriptor serialDescriptor, int i) {
        ddx.e(this.b, serialDescriptor);
        return serialDescriptor.f(i);
    }

    public abstract b Y();

    public abstract void Z(String str, b bVar);

    @Override // defpackage.o7x0, kotlinx.serialization.encoding.Encoder
    public final kf5 a() {
        return this.b.b;
    }

    @Override // defpackage.o7x0, kotlinx.serialization.encoding.Encoder
    public final yjd b(SerialDescriptor serialDescriptor) {
        lex lexVar;
        lex lexVar2;
        tls d8Var = a.b0(this.a) == null ? this.c : new d8(0, this);
        jl40 kind = serialDescriptor.getKind();
        boolean l = jl40.l(kind, ovu0.h);
        sbx sbxVar = this.b;
        if (l || (kind instanceof s5e0)) {
            lexVar = new lex(sbxVar, d8Var, 1);
        } else {
            if (jl40.l(kind, ovu0.i)) {
                SerialDescriptor b = vez0.b(serialDescriptor.d(0), sbxVar.b);
                jl40 kind2 = b.getKind();
                if ((kind2 instanceof h2f0) || jl40.l(kind2, fsq0.g)) {
                    oex oexVar = new oex(sbxVar, d8Var, 0);
                    oexVar.j = true;
                    lexVar2 = oexVar;
                } else {
                    if (!sbxVar.a.d) {
                        throw qje.a(b);
                    }
                    lexVar = new lex(sbxVar, d8Var, 1);
                }
            } else {
                lexVar2 = new lex(sbxVar, d8Var, 0);
            }
            lexVar = lexVar2;
        }
        String str = this.e;
        if (str != null) {
            if (lexVar instanceof oex) {
                oex oexVar2 = (oex) lexVar;
                oexVar2.Z("key", qcx.c(str));
                String str2 = this.f;
                if (str2 == null) {
                    str2 = serialDescriptor.h();
                }
                oexVar2.Z("value", qcx.c(str2));
            } else {
                String str3 = this.f;
                if (str3 == null) {
                    str3 = serialDescriptor.h();
                }
                lexVar.Z(str, qcx.c(str3));
            }
            this.e = null;
            this.f = null;
        }
        return lexVar;
    }

    @Override // defpackage.vcx
    public final sbx d() {
        return this.b;
    }

    @Override // defpackage.o7x0, kotlinx.serialization.encoding.Encoder
    public final Encoder i(SerialDescriptor serialDescriptor) {
        if (a.b0(this.a) == null) {
            return new tdx(this.b, this.c).i(serialDescriptor);
        }
        if (this.e != null) {
            this.f = serialDescriptor.h();
        }
        return super.i(serialDescriptor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r0 != kotlinx.serialization.json.ClassDiscriminatorMode.NONE) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0063, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.ovu0.j) == false) goto L28;
     */
    @Override // kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(Object obj, KSerializer kSerializer) {
        String f;
        KSerializer kSerializer2;
        Object b0 = a.b0(this.a);
        sbx sbxVar = this.b;
        if (b0 == null) {
            SerialDescriptor b = vez0.b(kSerializer.getDescriptor(), sbxVar.b);
            if ((b.getKind() instanceof h2f0) || b.getKind() == fsq0.g) {
                new tdx(sbxVar, this.c).j(obj, kSerializer);
                return;
            }
        }
        boolean z = kSerializer instanceof i9;
        ClassDiscriminatorMode classDiscriminatorMode = sbxVar.a.m;
        if (!z) {
            int i = t5e0.a[classDiscriminatorMode.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    w511.b();
                    return;
                } else {
                    jl40 kind = kSerializer.getDescriptor().getKind();
                    if (!jl40.l(kind, ovu0.g)) {
                    }
                    f = s8o.f(sbxVar, kSerializer.getDescriptor());
                }
            }
            f = null;
        }
        if (z) {
            i9 i9Var = (i9) kSerializer;
            if (obj == null) {
                yci0.x("Value for serializer ", i9Var.getDescriptor(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.");
                return;
            }
            kSerializer2 = rzo.x(i9Var, this, obj);
        } else {
            kSerializer2 = kSerializer;
        }
        if (f != null) {
            s8o.b(sbxVar, kSerializer, kSerializer2, f);
            s8o.e(kSerializer2.getDescriptor().getKind());
            String h = kSerializer2.getDescriptor().h();
            this.e = f;
            this.f = h;
        }
        kSerializer2.serialize(this, obj);
    }

    @Override // defpackage.vcx
    public final void p(b bVar) {
        if (this.e == null || (bVar instanceof c)) {
            j(bVar, rcx.a);
        } else {
            s8o.U(this.f, bVar);
            throw null;
        }
    }

    @Override // defpackage.o7x0, kotlinx.serialization.encoding.Encoder
    public final void y() {
        String str = (String) a.b0(this.a);
        if (str == null) {
            this.c.invoke(JsonNull.INSTANCE);
        } else {
            Z(str, JsonNull.INSTANCE);
        }
    }
}
