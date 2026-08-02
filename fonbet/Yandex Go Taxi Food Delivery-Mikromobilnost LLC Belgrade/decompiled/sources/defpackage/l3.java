package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public abstract class l3 extends a3 implements Iterable {
    public final z1[] a;
    public final boolean b;

    static {
        new q1(7, l3.class);
    }

    public l3(z1[] z1VarArr) {
        for (z1 z1Var : z1VarArr) {
            if (z1Var == null) {
                ny61.t("'elements' cannot be null, or contain null");
                throw null;
            }
        }
        z1[] b = b2.b(z1VarArr);
        if (b.length >= 2) {
            r(b);
        }
        this.a = b;
        this.b = true;
    }

    public static byte[] p(z1 z1Var) {
        try {
            a3 aSN1Primitive = z1Var.toASN1Primitive();
            aSN1Primitive.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            g191.H(byteArrayOutputStream).d0(aSN1Primitive);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            ny61.g("cannot encode object added to SET");
            return null;
        }
    }

    public static boolean q(byte[] bArr, byte[] bArr2) {
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

    public static void r(z1[] z1VarArr) {
        int i;
        int length = z1VarArr.length;
        if (length < 2) {
            return;
        }
        z1 z1Var = z1VarArr[0];
        z1 z1Var2 = z1VarArr[1];
        byte[] p = p(z1Var);
        byte[] p2 = p(z1Var2);
        if (q(p2, p)) {
            z1Var2 = z1Var;
            z1Var = z1Var2;
            p2 = p;
            p = p2;
        }
        for (int i2 = 2; i2 < length; i2++) {
            z1 z1Var3 = z1VarArr[i2];
            byte[] p3 = p(z1Var3);
            if (q(p2, p3)) {
                z1VarArr[i2 - 2] = z1Var;
                z1Var = z1Var2;
                p = p2;
                z1Var2 = z1Var3;
                p2 = p3;
            } else if (q(p, p3)) {
                z1VarArr[i2 - 2] = z1Var;
                z1Var = z1Var3;
                p = p3;
            } else {
                int i3 = i2 - 1;
                while (true) {
                    i = i3 - 1;
                    if (i <= 0) {
                        break;
                    }
                    z1 z1Var4 = z1VarArr[i3 - 2];
                    if (q(p(z1Var4), p3)) {
                        break;
                    }
                    z1VarArr[i] = z1Var4;
                    i3 = i;
                }
                z1VarArr[i] = z1Var3;
            }
        }
        z1VarArr[length - 2] = z1Var;
        z1VarArr[length - 1] = z1Var2;
    }

    @Override // defpackage.a3
    public final boolean h(a3 a3Var) {
        if (a3Var instanceof l3) {
            l3 l3Var = (l3) a3Var;
            int length = this.a.length;
            if (l3Var.a.length == length) {
                kqf kqfVar = (kqf) n();
                kqf kqfVar2 = (kqf) l3Var.n();
                for (int i = 0; i < length; i++) {
                    a3 aSN1Primitive = kqfVar.a[i].toASN1Primitive();
                    a3 aSN1Primitive2 = kqfVar2.a[i].toASN1Primitive();
                    if (aSN1Primitive == aSN1Primitive2 || aSN1Primitive.h(aSN1Primitive2)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.a3, defpackage.n2
    public final int hashCode() {
        z1[] z1VarArr = this.a;
        int length = z1VarArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i += z1VarArr[length].toASN1Primitive().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b73(0, b2.b(this.a));
    }

    @Override // defpackage.a3
    public final boolean j() {
        return true;
    }

    @Override // defpackage.a3
    public a3 n() {
        boolean z = this.b;
        z1[] z1VarArr = this.a;
        if (!z) {
            z1VarArr = (z1[]) z1VarArr.clone();
            r(z1VarArr);
        }
        return new kqf(z1VarArr);
    }

    @Override // defpackage.a3
    public a3 o() {
        return new yvf(this.b, this.a);
    }

    public final String toString() {
        z1[] z1VarArr = this.a;
        int length = z1VarArr.length;
        if (length == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i = 0;
        while (true) {
            stringBuffer.append(z1VarArr[i]);
            i++;
            if (i >= length) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(Extension.FIX_SPACE);
        }
    }

    public l3(b2 b2Var) {
        if (b2Var != null) {
            z1[] d = b2Var.d();
            this.a = d;
            this.b = d.length < 2;
            return;
        }
        ny61.t("'elementVector' cannot be null");
        throw null;
    }

    public l3(iqf iqfVar) {
        this.a = new z1[]{iqfVar};
        this.b = true;
    }

    public l3(boolean z, z1[] z1VarArr) {
        this.a = z1VarArr;
        this.b = z || z1VarArr.length < 2;
    }

    public l3() {
        this.a = b2.d;
        this.b = true;
    }
}
