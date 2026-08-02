package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes4.dex */
public final class gzo extends o2 {
    public Hashtable a;
    public Vector b;

    public static gzo n(Object obj) {
        ayo ayoVar;
        a2 A;
        if (obj instanceof gzo) {
            return (gzo) obj;
        }
        if (obj != null) {
            i3 z = i3.z(obj);
            gzo gzoVar = new gzo();
            gzoVar.a = new Hashtable();
            gzoVar.b = new Vector();
            if (z.size() != 0) {
                Enumeration B = z.B();
                while (B.hasMoreElements()) {
                    Object nextElement = B.nextElement();
                    u2 u2Var = ayo.w;
                    if (nextElement instanceof ayo) {
                        ayoVar = (ayo) nextElement;
                    } else if (nextElement != null) {
                        i3 z2 = i3.z(nextElement);
                        ayo ayoVar2 = new ayo();
                        if (z2.size() == 2) {
                            ayoVar2.a = u2.A(z2.A(0));
                            ayoVar2.b = false;
                            A = z2.A(1);
                        } else {
                            if (z2.size() != 3) {
                                ny61.g(vfc.n(z2, new StringBuilder("Bad sequence size: ")));
                                return null;
                            }
                            ayoVar2.a = u2.A(z2.A(0));
                            ayoVar2.b = w1.x(z2.A(1)).y();
                            A = z2.A(2);
                        }
                        ayoVar2.c = w2.x(A);
                        ayoVar = ayoVar2;
                    } else {
                        ayoVar = null;
                    }
                    Hashtable hashtable = gzoVar.a;
                    u2 u2Var2 = ayoVar.a;
                    if (hashtable.containsKey(u2Var2) && !ltf0.b("org.bouncycastle.x509.ignore_repeated_extensions")) {
                        kbs.f(u2Var2, "repeated extension found: ");
                        return null;
                    }
                    gzoVar.a.put(u2Var2, ayoVar);
                    gzoVar.b.addElement(u2Var2);
                }
                return gzoVar;
            }
            ny61.g("empty extension sequence found");
        }
        return null;
    }

    public final u2[] m() {
        Vector vector = this.b;
        Vector vector2 = new Vector();
        for (int i = 0; i != vector.size(); i++) {
            Object elementAt = vector.elementAt(i);
            if (((ayo) this.a.get(elementAt)).b) {
                vector2.addElement(elementAt);
            }
        }
        int size = vector2.size();
        u2[] u2VarArr = new u2[size];
        for (int i2 = 0; i2 != size; i2++) {
            u2VarArr[i2] = (u2) vector2.elementAt(i2);
        }
        return u2VarArr;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        Vector vector = this.b;
        c2 c2Var = new c2(vector.size());
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            c2Var.a((ayo) this.a.get((u2) elements.nextElement()));
        }
        return new jqf(c2Var);
    }
}
