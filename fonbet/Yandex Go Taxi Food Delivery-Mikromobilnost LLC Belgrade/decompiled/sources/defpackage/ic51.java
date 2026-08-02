package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes4.dex */
public final class ic51 extends n2 implements x1 {
    public static final wc4 y = wc4.m;
    public boolean a;
    public int b;
    public final xa c;
    public final u4i0[] w;
    public final iqf x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ic51(String str) {
        this(r0, (u4i0[]) new ic51(r5, r1).w.clone());
        wc4 wc4Var = y;
        wc4Var.getClass();
        mc51 mc51Var = new mc51(HexString.CHAR_COMMA, 0, str);
        kc51 kc51Var = new kc51(wc4Var);
        while (true) {
            boolean a = mc51Var.a();
            Vector vector = kc51Var.b;
            xa xaVar = kc51Var.a;
            if (!a) {
                int size = vector.size();
                u4i0[] u4i0VarArr = new u4i0[size];
                for (int i = 0; i != size; i++) {
                    u4i0VarArr[i] = (u4i0) vector.elementAt(i);
                }
                this.c = wc4Var;
                return;
            }
            String b = mc51Var.b();
            if (b.indexOf(43) > 0) {
                mc51 mc51Var2 = new mc51('+', 0, b);
                mc51 mc51Var3 = new mc51('=', 0, mc51Var2.b());
                String b2 = mc51Var3.b();
                if (!mc51Var3.a()) {
                    ny61.g("badly formatted directory string");
                    throw null;
                }
                String b3 = mc51Var3.b();
                t2 f = wc4Var.f(b2.trim());
                if (mc51Var2.a()) {
                    Vector vector2 = new Vector();
                    Vector vector3 = new Vector();
                    vector2.addElement(f);
                    vector3.addElement(w2v.d(b3));
                    while (mc51Var2.a()) {
                        mc51 mc51Var4 = new mc51('=', 0, mc51Var2.b());
                        String b4 = mc51Var4.b();
                        if (!mc51Var4.a()) {
                            ny61.g("badly formatted directory string");
                            throw null;
                        }
                        String b5 = mc51Var4.b();
                        vector2.addElement(wc4Var.f(b4.trim()));
                        vector3.addElement(w2v.d(b5));
                    }
                    int size2 = vector2.size();
                    t2[] t2VarArr = new t2[size2];
                    for (int i2 = 0; i2 != size2; i2++) {
                        t2VarArr[i2] = (t2) vector2.elementAt(i2);
                    }
                    int size3 = vector3.size();
                    String[] strArr = new String[size3];
                    for (int i3 = 0; i3 != size3; i3++) {
                        strArr[i3] = (String) vector3.elementAt(i3);
                    }
                    z1[] z1VarArr = new z1[size3];
                    for (int i4 = 0; i4 != size3; i4++) {
                        z1VarArr[i4] = xaVar.d(t2VarArr[i4], strArr[i4]);
                    }
                    yc3[] yc3VarArr = new yc3[size2];
                    for (int i5 = 0; i5 != size2; i5++) {
                        t2 t2Var = t2VarArr[i5];
                        z1 z1Var = z1VarArr[i5];
                        yc3 yc3Var = new yc3();
                        yc3Var.a = t2Var;
                        yc3Var.b = z1Var;
                        yc3VarArr[i5] = yc3Var;
                    }
                    u4i0 u4i0Var = new u4i0();
                    kqf kqfVar = new kqf(yc3VarArr);
                    kqfVar.c = -1;
                    u4i0Var.a = kqfVar;
                    vector.addElement(u4i0Var);
                } else {
                    kc51Var.a(f, w2v.d(b3));
                }
            } else {
                mc51 mc51Var5 = new mc51('=', 0, b);
                String b6 = mc51Var5.b();
                if (!mc51Var5.a()) {
                    ny61.g("badly formatted directory string");
                    throw null;
                }
                kc51Var.a(wc4Var.f(b6.trim()), w2v.d(mc51Var5.b()));
            }
        }
    }

    public static ic51 h(r3 r3Var) {
        return i((h3) h3.b.f(r3Var, true));
    }

    public static ic51 i(Object obj) {
        if (obj instanceof ic51) {
            return (ic51) obj;
        }
        if (obj != null) {
            return new ic51(h3.r(obj));
        }
        return null;
    }

    @Override // defpackage.n2
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ic51) && !(obj instanceof h3)) {
            return false;
        }
        if (this.x.l(((z1) obj).toASN1Primitive())) {
            return true;
        }
        try {
            xa xaVar = this.c;
            ic51 ic51Var = new ic51(h3.r(((z1) obj).toASN1Primitive()));
            xaVar.getClass();
            return xa.a(this, ic51Var);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // defpackage.n2
    public final int hashCode() {
        if (this.a) {
            return this.b;
        }
        this.a = true;
        this.c.getClass();
        u4i0[] u4i0VarArr = (u4i0[]) this.w.clone();
        int i = 0;
        for (int i2 = 0; i2 != u4i0VarArr.length; i2++) {
            u4i0 u4i0Var = u4i0VarArr[i2];
            if (u4i0Var.a.a.length > 1) {
                yc3[] i3 = u4i0Var.i();
                for (int i4 = 0; i4 != i3.length; i4++) {
                    i = (i ^ i3[i4].a.a.hashCode()) ^ w2v.b(i3[i4].b).hashCode();
                }
            } else {
                i = (i ^ u4i0Var.h().a.a.hashCode()) ^ w2v.b(u4i0VarArr[i2].h().b).hashCode();
            }
        }
        this.b = i;
        return i;
    }

    public final u4i0[] j(t2 t2Var) {
        u4i0[] u4i0VarArr = this.w;
        int length = u4i0VarArr.length;
        u4i0[] u4i0VarArr2 = new u4i0[length];
        int i = 0;
        for (int i2 = 0; i2 != u4i0VarArr.length; i2++) {
            u4i0 u4i0Var = u4i0VarArr[i2];
            l3 l3Var = u4i0Var.a;
            int length2 = l3Var.a.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    break;
                }
                if (yc3.h(l3Var.a[i3]).a.l(t2Var)) {
                    u4i0VarArr2[i] = u4i0Var;
                    i++;
                    break;
                }
                i3++;
            }
        }
        if (i >= length) {
            return u4i0VarArr2;
        }
        u4i0[] u4i0VarArr3 = new u4i0[i];
        System.arraycopy(u4i0VarArr2, 0, u4i0VarArr3, 0, i);
        return u4i0VarArr3;
    }

    @Override // defpackage.z1
    public final a3 toASN1Primitive() {
        return this.x;
    }

    public final String toString() {
        return this.c.e(this);
    }

    public ic51(xa xaVar, u4i0[] u4i0VarArr) {
        this.c = xaVar;
        u4i0[] u4i0VarArr2 = (u4i0[]) u4i0VarArr.clone();
        this.w = u4i0VarArr2;
        this.x = new iqf(u4i0VarArr2);
    }

    public ic51(h3 h3Var) {
        u4i0 u4i0Var;
        l3 l3Var;
        this.c = y;
        this.w = new u4i0[h3Var.size()];
        Enumeration t = h3Var.t();
        boolean z = true;
        int i = 0;
        while (t.hasMoreElements()) {
            Object nextElement = t.nextElement();
            if (nextElement instanceof u4i0) {
                u4i0Var = (u4i0) nextElement;
            } else {
                u4i0Var = null;
                if (nextElement != null) {
                    if (nextElement instanceof l3) {
                        l3Var = (l3) nextElement;
                    } else if (nextElement instanceof z1) {
                        a3 aSN1Primitive = ((z1) nextElement).toASN1Primitive();
                        if (aSN1Primitive instanceof l3) {
                            l3Var = (l3) aSN1Primitive;
                        } else {
                            ny61.g(qv10.n(nextElement, "unknown object in getInstance: "));
                            throw null;
                        }
                    } else if (nextElement instanceof byte[]) {
                        try {
                            a3 m = a3.m((byte[]) nextElement);
                            if (l3.class.isInstance(m)) {
                                l3Var = (l3) m;
                            } else {
                                throw new IllegalStateException("unexpected object: ".concat(m.getClass().getName()));
                            }
                        } catch (IOException e) {
                            ny61.g(x4e.d(e, new StringBuilder("failed to construct set from byte[]: ")));
                            throw null;
                        }
                    } else {
                        ny61.g(qv10.n(nextElement, "unknown object in getInstance: "));
                        throw null;
                    }
                    u4i0 u4i0Var2 = new u4i0();
                    u4i0Var2.a = l3Var;
                    u4i0Var = u4i0Var2;
                }
            }
            z &= u4i0Var == nextElement;
            this.w[i] = u4i0Var;
            i++;
        }
        if (z) {
            this.x = (iqf) h3Var.n();
        } else {
            this.x = new iqf(this.w);
        }
    }
}
