package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes4.dex */
public final class b4x0 extends n2 {
    public ic51 A;
    public yyu0 B;
    public lpf C;
    public lpf D;
    public fzo E;
    public h3 a;
    public k2 b;
    public k2 c;
    public wr1 w;
    public ic51 x;
    public u5z0 y;
    public u5z0 z;

    /* JADX WARN: Multi-variable type inference failed */
    public static b4x0 h(z1 z1Var) {
        int i;
        boolean z;
        boolean z2;
        k2 k2Var;
        yyu0 yyu0Var;
        fzo fzoVar;
        byo byoVar;
        v1 v1Var;
        if (z1Var instanceof b4x0) {
            return (b4x0) z1Var;
        }
        b4x0 b4x0Var = null;
        if (z1Var == null) {
            return null;
        }
        h3 r = h3.r(z1Var);
        b4x0 b4x0Var2 = new b4x0();
        b4x0Var2.a = r;
        if (r.s(0) instanceof r3) {
            b4x0Var2.b = (k2) k2.c.f((r3) r.s(0), true);
            i = 0;
        } else {
            b4x0Var2.b = new k2(0L);
            i = -1;
        }
        if (b4x0Var2.b.q(0)) {
            z2 = false;
            z = true;
        } else if (b4x0Var2.b.q(1)) {
            z = false;
            z2 = true;
        } else {
            if (!b4x0Var2.b.q(2)) {
                ny61.g("version number not recognised");
                return null;
            }
            z = false;
            z2 = false;
        }
        Object s = r.s(i + 1);
        if (s == null || (s instanceof k2)) {
            k2Var = (k2) s;
        } else {
            if (!(s instanceof byte[])) {
                ny61.g("illegal object in getInstance: ".concat(s.getClass().getName()));
                return null;
            }
            try {
                a3 m = a3.m((byte[]) s);
                if (!k2.class.isInstance(m)) {
                    throw new IllegalStateException("unexpected object: ".concat(m.getClass().getName()));
                }
                k2Var = (k2) m;
            } catch (Exception e) {
                xfo.l(e);
                return null;
            }
        }
        b4x0Var2.c = k2Var;
        b4x0Var2.w = wr1.h(r.s(i + 2));
        b4x0Var2.x = ic51.i(r.s(i + 3));
        h3 h3Var = (h3) r.s(i + 4);
        b4x0Var2.y = u5z0.h(h3Var.s(0));
        b4x0Var2.z = u5z0.h(h3Var.s(1));
        b4x0Var2.A = ic51.i(r.s(i + 5));
        int i2 = i + 6;
        z1 s2 = r.s(i2);
        if (s2 instanceof yyu0) {
            yyu0Var = (yyu0) s2;
        } else if (s2 != null) {
            h3 r2 = h3.r(s2);
            yyu0 yyu0Var2 = new yyu0();
            if (r2.size() != 2) {
                ny61.e(r2.size(), "Bad sequence size: ");
                return null;
            }
            Enumeration t = r2.t();
            yyu0Var2.a = wr1.h(t.nextElement());
            yyu0Var2.b = lpf.q(t.nextElement());
            yyu0Var = yyu0Var2;
        } else {
            yyu0Var = null;
        }
        b4x0Var2.B = yyu0Var;
        int size = (r.size() - i2) - 1;
        if (size != 0 && z) {
            ny61.g("version 1 certificate contains extra data");
            return null;
        }
        while (size > 0) {
            r3 r3Var = (r3) r.s(i2 + size);
            int i3 = r3Var.c;
            z1 z1Var2 = r3Var.w;
            int i4 = r3Var.b;
            b4x0 b4x0Var3 = b4x0Var;
            if (i3 != 1) {
                if (i3 != 2) {
                    int i5 = 3;
                    if (i3 != 3) {
                        ny61.e(r3Var.c, "Unknown tag encountered in structure: ");
                        return b4x0Var3;
                    }
                    if (z2) {
                        ny61.g("version 2 certificate cannot contain extensions");
                        return b4x0Var3;
                    }
                    h3 h3Var2 = (h3) h3.b.f(r3Var, true);
                    if (h3Var2 != null) {
                        h3 r3 = h3.r(h3Var2);
                        fzoVar = new fzo();
                        fzoVar.a = new Hashtable();
                        fzoVar.b = new Vector();
                        Enumeration t2 = r3.t();
                        while (t2.hasMoreElements()) {
                            Object nextElement = t2.nextElement();
                            t2 t2Var = byo.w;
                            if (nextElement instanceof byo) {
                                byoVar = (byo) nextElement;
                            } else if (nextElement != null) {
                                h3 r4 = h3.r(nextElement);
                                byo byoVar2 = new byo();
                                if (r4.size() == 2) {
                                    byoVar2.a = t2.s(r4.s(0));
                                    byoVar2.b = false;
                                    byoVar2.c = v2.p(r4.s(1));
                                } else {
                                    if (r4.size() != i5) {
                                        ny61.e(r4.size(), "Bad sequence size: ");
                                        return b4x0Var3;
                                    }
                                    byoVar2.a = t2.s(r4.s(0));
                                    Object s3 = r4.s(1);
                                    q1 q1Var = v1.b;
                                    if (s3 == null || (s3 instanceof v1)) {
                                        v1Var = (v1) s3;
                                    } else {
                                        if (!(s3 instanceof byte[])) {
                                            ny61.g("illegal object in getInstance: ".concat(s3.getClass().getName()));
                                            return b4x0Var3;
                                        }
                                        try {
                                            v1Var = (v1) v1.b.c((byte[]) s3);
                                        } catch (IOException e2) {
                                            ny61.g(x4e.d(e2, new StringBuilder("failed to construct boolean from byte[]: ")));
                                            return b4x0Var3;
                                        }
                                    }
                                    byoVar2.b = v1Var.q();
                                    byoVar2.c = v2.p(r4.s(2));
                                }
                                byoVar = byoVar2;
                            } else {
                                byoVar = b4x0Var3;
                            }
                            Hashtable hashtable = fzoVar.a;
                            t2 t2Var2 = byoVar.a;
                            if (hashtable.containsKey(t2Var2)) {
                                kbs.f(t2Var2, "repeated extension found: ");
                                return b4x0Var3;
                            }
                            fzoVar.a.put(t2Var2, byoVar);
                            fzoVar.b.addElement(t2Var2);
                            i5 = 3;
                        }
                    } else {
                        fzoVar = b4x0Var3;
                    }
                    b4x0Var2.E = fzoVar;
                } else {
                    if (128 != i4) {
                        ny61.r("this method only valid for CONTEXT_SPECIFIC tags");
                        return b4x0Var3;
                    }
                    a3 aSN1Primitive = z1Var2.toASN1Primitive();
                    b4x0Var2.D = aSN1Primitive instanceof lpf ? lpf.q(aSN1Primitive) : new lpf(v2.p(aSN1Primitive).a, true);
                }
            } else {
                if (128 != i4) {
                    ny61.r("this method only valid for CONTEXT_SPECIFIC tags");
                    return b4x0Var3;
                }
                a3 aSN1Primitive2 = z1Var2.toASN1Primitive();
                b4x0Var2.C = aSN1Primitive2 instanceof lpf ? lpf.q(aSN1Primitive2) : new lpf(v2.p(aSN1Primitive2).a, true);
            }
            size--;
            b4x0Var = b4x0Var3;
        }
        return b4x0Var2;
    }

    @Override // defpackage.z1
    public final a3 toASN1Primitive() {
        k2 k2Var = this.b;
        h3 h3Var = this.a;
        if (jtf0.a("org.bouncycastle.x509.allow_non-der_tbscert") == null || jtf0.b("org.bouncycastle.x509.allow_non-der_tbscert")) {
            return h3Var;
        }
        b2 b2Var = new b2();
        if (!k2Var.q(0)) {
            b2Var.a(new td4(true, 0, (z1) k2Var, false));
        }
        b2Var.a(this.c);
        b2Var.a(this.w);
        b2Var.a(this.x);
        b2 b2Var2 = new b2(2);
        b2Var2.a(this.y);
        b2Var2.a(this.z);
        b2Var.a(new iqf(b2Var2));
        ic51 ic51Var = this.A;
        if (ic51Var != null) {
            b2Var.a(ic51Var);
        } else {
            b2Var.a(new iqf());
        }
        b2Var.a(this.B);
        lpf lpfVar = this.C;
        if (lpfVar != null) {
            b2Var.a(new td4(2, 128, 1, (z1) lpfVar, false));
        }
        lpf lpfVar2 = this.D;
        if (lpfVar2 != null) {
            b2Var.a(new td4(2, 128, 2, (z1) lpfVar2, false));
        }
        fzo fzoVar = this.E;
        if (fzoVar != null) {
            b2Var.a(new td4(true, 3, (z1) fzoVar, false));
        }
        return new iqf(b2Var);
    }
}
