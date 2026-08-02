package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public abstract class i3 extends b3 implements Iterable {
    public static final p1 b = new p1(17, i3.class);
    public a2[] a;

    public i3(a2 a2Var) {
        if (a2Var != null) {
            this.a = new a2[]{a2Var};
        } else {
            ny61.t("'element' cannot be null");
            throw null;
        }
    }

    public static i3 y(s3 s3Var, boolean z) {
        return (i3) b.Hg(s3Var, z);
    }

    public static i3 z(Object obj) {
        String d;
        if (obj == null || (obj instanceof i3)) {
            return (i3) obj;
        }
        if (obj instanceof a2) {
            b3 aSN1Primitive = ((a2) obj).toASN1Primitive();
            if (aSN1Primitive instanceof i3) {
                return (i3) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (i3) b.Eg((byte[]) obj);
            } catch (IOException e) {
                d = x4e.d(e, new StringBuilder("failed to construct sequence from byte[]: "));
            }
        }
        d = qv10.n(obj, "unknown object in getInstance: ");
        ny61.g(d);
        return null;
    }

    public a2 A(int i) {
        return this.a[i];
    }

    public Enumeration B() {
        return new f3(this);
    }

    public abstract s1 C();

    public abstract opf E();

    public abstract w2 F();

    public abstract m3 G();

    public a2[] H() {
        return c2.b(this.a);
    }

    @Override // defpackage.b3, defpackage.o2
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
        return new b73(1, this.a);
    }

    @Override // defpackage.b3
    public final boolean m(b3 b3Var) {
        if (!(b3Var instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) b3Var;
        int size = size();
        if (i3Var.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            b3 aSN1Primitive = this.a[i].toASN1Primitive();
            b3 aSN1Primitive2 = i3Var.a[i].toASN1Primitive();
            if (aSN1Primitive != aSN1Primitive2 && !aSN1Primitive.m(aSN1Primitive2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.b3
    public final boolean o() {
        return true;
    }

    @Override // defpackage.b3
    public b3 s() {
        jqf jqfVar = new jqf(this.a);
        jqfVar.c = -1;
        return jqfVar;
    }

    public int size() {
        return this.a.length;
    }

    @Override // defpackage.b3
    public b3 t() {
        xvf xvfVar = new xvf(this.a);
        xvfVar.c = -1;
        return xvfVar;
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

    public final s1[] u() {
        int size = size();
        s1[] s1VarArr = new s1[size];
        for (int i = 0; i < size; i++) {
            s1VarArr[i] = s1.y(this.a[i]);
        }
        return s1VarArr;
    }

    public final w2[] x() {
        int size = size();
        w2[] w2VarArr = new w2[size];
        for (int i = 0; i < size; i++) {
            w2VarArr[i] = w2.x(this.a[i]);
        }
        return w2VarArr;
    }

    public i3() {
        this.a = c2.d;
    }

    public i3(c2 c2Var) {
        if (c2Var != null) {
            this.a = c2Var.d();
        } else {
            ny61.t("'elementVector' cannot be null");
            throw null;
        }
    }

    public i3(a2[] a2VarArr) {
        this.a = a2VarArr;
    }
}
