package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public abstract class h3 extends a3 implements Iterable {
    public static final q1 b = new q1(6, h3.class);
    public z1[] a;

    public h3(a3 a3Var) {
        if (a3Var != null) {
            this.a = new z1[]{a3Var};
        } else {
            ny61.t("'element' cannot be null");
            throw null;
        }
    }

    public static h3 r(Object obj) {
        if (obj == null || (obj instanceof h3)) {
            return (h3) obj;
        }
        if (obj instanceof z1) {
            a3 aSN1Primitive = ((z1) obj).toASN1Primitive();
            if (aSN1Primitive instanceof h3) {
                return (h3) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (h3) b.c((byte[]) obj);
            } catch (IOException e) {
                ny61.g(x4e.d(e, new StringBuilder("failed to construct sequence from byte[]: ")));
                return null;
            }
        }
        ny61.g(qv10.n(obj, "unknown object in getInstance: "));
        return null;
    }

    @Override // defpackage.a3
    public final boolean h(a3 a3Var) {
        if (a3Var instanceof h3) {
            h3 h3Var = (h3) a3Var;
            int size = size();
            if (h3Var.size() == size) {
                for (int i = 0; i < size; i++) {
                    a3 aSN1Primitive = this.a[i].toASN1Primitive();
                    a3 aSN1Primitive2 = h3Var.a[i].toASN1Primitive();
                    if (aSN1Primitive == aSN1Primitive2 || aSN1Primitive.h(aSN1Primitive2)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.a3, defpackage.n2
    public int hashCode() {
        int length = this.a.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ this.a[length].toASN1Primitive().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new b73(0, this.a);
    }

    @Override // defpackage.a3
    public final boolean j() {
        return true;
    }

    @Override // defpackage.a3
    public a3 n() {
        return new iqf(this.a, 0);
    }

    @Override // defpackage.a3
    public a3 o() {
        wvf wvfVar = new wvf(this.a);
        wvfVar.c = -1;
        return wvfVar;
    }

    public final r1[] p() {
        z1 z1Var;
        int size = size();
        r1[] r1VarArr = new r1[size];
        for (int i = 0; i < size; i++) {
            z1 z1Var2 = this.a[i];
            if (z1Var2 == null || (z1Var2 instanceof r1)) {
                z1Var = z1Var2;
            } else {
                z1Var = z1Var2.toASN1Primitive();
                if (!(z1Var instanceof r1)) {
                    ny61.g("illegal object in getInstance: ".concat(z1Var2.getClass().getName()));
                    return null;
                }
            }
            r1VarArr[i] = (r1) z1Var;
        }
        return r1VarArr;
    }

    public final v2[] q() {
        int size = size();
        v2[] v2VarArr = new v2[size];
        for (int i = 0; i < size; i++) {
            v2VarArr[i] = v2.p(this.a[i]);
        }
        return v2VarArr;
    }

    public z1 s(int i) {
        return this.a[i];
    }

    public int size() {
        return this.a.length;
    }

    public Enumeration t() {
        return new e3(this);
    }

    public final String toString() {
        int size = size();
        if (size == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i = 0;
        while (true) {
            stringBuffer.append(this.a[i]);
            i++;
            if (i >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(Extension.FIX_SPACE);
        }
    }

    public abstract r1 u();

    public abstract v2 x();

    public abstract l3 y();

    public h3(b2 b2Var) {
        if (b2Var != null) {
            this.a = b2Var.d();
        } else {
            ny61.t("'elementVector' cannot be null");
            throw null;
        }
    }

    public h3() {
        this.a = b2.d;
    }

    public h3(z1[] z1VarArr) {
        this.a = z1VarArr;
    }
}
