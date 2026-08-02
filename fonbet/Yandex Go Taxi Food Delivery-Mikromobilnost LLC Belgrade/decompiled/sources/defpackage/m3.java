package defpackage;

import java.io.IOException;
import java.util.Iterator;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public abstract class m3 extends b3 implements Iterable {
    public static final p1 c = new p1(18, m3.class);
    public final a2[] a;
    public a2[] b;

    public m3(c2 c2Var, boolean z) {
        a2[] d;
        int i;
        if (c2Var == null) {
            ny61.t("'elementVector' cannot be null");
            throw null;
        }
        if (!z || (i = c2Var.b) < 2) {
            d = c2Var.d();
        } else {
            if (i == 0) {
                d = c2.d;
            } else {
                a2[] a2VarArr = new a2[i];
                System.arraycopy(c2Var.a, 0, a2VarArr, 0, i);
                d = a2VarArr;
            }
            z(d);
        }
        this.a = d;
        this.b = (z || d.length < 2) ? d : null;
    }

    public static byte[] u(a2 a2Var) {
        try {
            return a2Var.toASN1Primitive().getEncoded("DER");
        } catch (IOException unused) {
            ny61.g("cannot encode object added to SET");
            return null;
        }
    }

    public static m3 x(a2 a2Var) {
        if (a2Var == null || (a2Var instanceof m3)) {
            return (m3) a2Var;
        }
        b3 aSN1Primitive = a2Var.toASN1Primitive();
        if (aSN1Primitive instanceof m3) {
            return (m3) aSN1Primitive;
        }
        ny61.g("unknown object in getInstance: ".concat(a2Var.getClass().getName()));
        return null;
    }

    public static boolean y(byte[] bArr, byte[] bArr2) {
        int i = bArr[0] & 223;
        int i2 = bArr2[0] & 223;
        if (i != i2) {
            return i < i2;
        }
        int min = Math.min(bArr.length, bArr2.length) - 1;
        for (int i3 = 1; i3 < min; i3++) {
            byte b = bArr[i3];
            byte b2 = bArr2[i3];
            if (b != b2) {
                return (b & 255) < (b2 & 255);
            }
        }
        return (bArr[min] & 255) <= (bArr2[min] & 255);
    }

    public static void z(a2[] a2VarArr) {
        int i;
        int length = a2VarArr.length;
        if (length < 2) {
            return;
        }
        a2 a2Var = a2VarArr[0];
        a2 a2Var2 = a2VarArr[1];
        byte[] u = u(a2Var);
        byte[] u2 = u(a2Var2);
        if (y(u2, u)) {
            a2Var2 = a2Var;
            a2Var = a2Var2;
            u2 = u;
            u = u2;
        }
        for (int i2 = 2; i2 < length; i2++) {
            a2 a2Var3 = a2VarArr[i2];
            byte[] u3 = u(a2Var3);
            if (y(u2, u3)) {
                a2VarArr[i2 - 2] = a2Var;
                a2Var = a2Var2;
                u = u2;
                a2Var2 = a2Var3;
                u2 = u3;
            } else if (y(u, u3)) {
                a2VarArr[i2 - 2] = a2Var;
                a2Var = a2Var3;
                u = u3;
            } else {
                int i3 = i2 - 1;
                while (true) {
                    i = i3 - 1;
                    if (i <= 0) {
                        break;
                    }
                    a2 a2Var4 = a2VarArr[i3 - 2];
                    if (y(u(a2Var4), u3)) {
                        break;
                    }
                    a2VarArr[i] = a2Var4;
                    i3 = i;
                }
                a2VarArr[i] = a2Var3;
            }
        }
        a2VarArr[length - 2] = a2Var;
        a2VarArr[length - 1] = a2Var2;
    }

    @Override // defpackage.b3, defpackage.o2
    public final int hashCode() {
        a2[] a2VarArr = this.a;
        int length = a2VarArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i += a2VarArr[length].toASN1Primitive().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b73(1, c2.b(this.a));
    }

    @Override // defpackage.b3
    public final boolean m(b3 b3Var) {
        if (b3Var instanceof m3) {
            m3 m3Var = (m3) b3Var;
            int length = this.a.length;
            if (m3Var.a.length == length) {
                lqf lqfVar = (lqf) s();
                lqf lqfVar2 = (lqf) m3Var.s();
                for (int i = 0; i < length; i++) {
                    b3 aSN1Primitive = lqfVar.a[i].toASN1Primitive();
                    b3 aSN1Primitive2 = lqfVar2.a[i].toASN1Primitive();
                    if (aSN1Primitive == aSN1Primitive2 || aSN1Primitive.m(aSN1Primitive2)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.b3
    public final boolean o() {
        return true;
    }

    @Override // defpackage.b3
    public b3 s() {
        if (this.b == null) {
            a2[] a2VarArr = (a2[]) this.a.clone();
            this.b = a2VarArr;
            z(a2VarArr);
        }
        lqf lqfVar = new lqf(true, this.b);
        lqfVar.w = -1;
        return lqfVar;
    }

    @Override // defpackage.b3
    public b3 t() {
        zvf zvfVar = new zvf(this.a, this.b);
        zvfVar.w = -1;
        return zvfVar;
    }

    public final String toString() {
        a2[] a2VarArr = this.a;
        int length = a2VarArr.length;
        if (length == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i = 0;
        while (true) {
            stringBuffer.append(a2VarArr[i]);
            i++;
            if (i >= length) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(Extension.FIX_SPACE);
        }
    }

    public m3(a2 a2Var) {
        if (a2Var == null) {
            ny61.t("'element' cannot be null");
            throw null;
        }
        a2[] a2VarArr = {a2Var};
        this.a = a2VarArr;
        this.b = a2VarArr;
    }

    public m3() {
        a2[] a2VarArr = c2.d;
        this.a = a2VarArr;
        this.b = a2VarArr;
    }

    public m3(boolean z, a2[] a2VarArr) {
        this.a = a2VarArr;
        if (!z && a2VarArr.length >= 2) {
            a2VarArr = null;
        }
        this.b = a2VarArr;
    }

    public m3(a2[] a2VarArr, boolean z) {
        if (a2VarArr != null) {
            for (a2 a2Var : a2VarArr) {
                if (a2Var != null) {
                }
            }
            a2[] b = c2.b(a2VarArr);
            if (z && b.length >= 2) {
                z(b);
            }
            this.a = b;
            if (!z && b.length >= 2) {
                a2VarArr = null;
            }
            this.b = a2VarArr;
            return;
        }
        ny61.t("'elements' cannot be null, or contain null");
        throw null;
    }

    public m3(a2[] a2VarArr, a2[] a2VarArr2) {
        this.a = a2VarArr;
        this.b = a2VarArr2;
    }
}
