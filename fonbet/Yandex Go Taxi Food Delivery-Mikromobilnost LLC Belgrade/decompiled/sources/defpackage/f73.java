package defpackage;

import java.util.Arrays;

/* loaded from: classes9.dex */
public class f73 extends d73 {
    public static void d(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void e(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void f(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static void g(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void h(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        System.arraycopy(iArr, 0, iArr2, i, i2);
    }

    public static void i(byte[] bArr, byte[] bArr2, int i, int i2) {
        System.arraycopy(bArr, i, bArr2, 0, i2 - i);
    }

    public static void j(float[] fArr, float[] fArr2, int i) {
        System.arraycopy(fArr, 0, fArr2, 0, (i & 8) != 0 ? fArr.length : 6);
    }

    public static void k(long[] jArr, int i, long[] jArr2) {
        System.arraycopy(jArr, 0, jArr2, i, jArr.length);
    }

    public static void l(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        System.arraycopy(objArr, i, objArr2, 0, i2 - i);
    }

    public static byte[] m(int i, int i2, byte[] bArr) {
        c73.a(i2, bArr.length);
        return Arrays.copyOfRange(bArr, i, i2);
    }

    public static Object[] n(int i, int i2, Object[] objArr) {
        c73.a(i2, objArr.length);
        return Arrays.copyOfRange(objArr, i, i2);
    }

    public static void o(int i, int[] iArr) {
        Arrays.fill(iArr, 0, iArr.length, i);
    }

    public static void p(long j, long[] jArr) {
        Arrays.fill(jArr, 0, jArr.length, j);
    }

    public static void q(Object[] objArr, jb20 jb20Var) {
        Arrays.fill(objArr, 0, objArr.length, jb20Var);
    }

    public static byte[] r(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        return copyOf;
    }

    public static Object[] s(Object[] objArr, Object obj) {
        int length = objArr.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + 1);
        copyOf[length] = obj;
        return copyOf;
    }

    public static Object[] t(Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        return copyOf;
    }
}
