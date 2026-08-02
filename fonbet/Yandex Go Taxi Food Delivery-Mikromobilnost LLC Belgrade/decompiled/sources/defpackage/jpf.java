package defpackage;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class jpf extends a3 implements p3 {
    public final char[] a;

    public jpf(char[] cArr) {
        this.a = cArr;
    }

    public static jpf p(char[] cArr) {
        return new jpf(cArr);
    }

    @Override // defpackage.p3
    public final String f() {
        return new String(this.a);
    }

    @Override // defpackage.a3
    public final boolean h(a3 a3Var) {
        if (a3Var instanceof jpf) {
            return Arrays.equals(this.a, ((jpf) a3Var).a);
        }
        return false;
    }

    @Override // defpackage.a3, defpackage.n2
    public final int hashCode() {
        char[] cArr = this.a;
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    @Override // defpackage.a3
    public final void i(g191 g191Var, boolean z) {
        char[] cArr = this.a;
        int length = cArr.length;
        g191Var.c0(30, z);
        g191Var.W(length * 2);
        byte[] bArr = new byte[8];
        int i = length & (-4);
        int i2 = 0;
        while (i2 < i) {
            char c = cArr[i2];
            char c2 = cArr[i2 + 1];
            char c3 = cArr[i2 + 2];
            char c4 = cArr[i2 + 3];
            i2 += 4;
            bArr[0] = (byte) (c >> '\b');
            bArr[1] = (byte) c;
            bArr[2] = (byte) (c2 >> '\b');
            bArr[3] = (byte) c2;
            bArr[4] = (byte) (c3 >> '\b');
            bArr[5] = (byte) c3;
            bArr[6] = (byte) (c4 >> '\b');
            bArr[7] = (byte) c4;
            g191Var.V(bArr, 0, 8);
        }
        if (i2 < length) {
            int i3 = 0;
            do {
                char c5 = cArr[i2];
                i2++;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (c5 >> '\b');
                i3 += 2;
                bArr[i4] = (byte) c5;
            } while (i2 < length);
            g191Var.V(bArr, 0, i3);
        }
    }

    @Override // defpackage.a3
    public final boolean j() {
        return false;
    }

    @Override // defpackage.a3
    public final int k(boolean z) {
        return g191.M(this.a.length * 2, z);
    }

    public final String toString() {
        return f();
    }
}
