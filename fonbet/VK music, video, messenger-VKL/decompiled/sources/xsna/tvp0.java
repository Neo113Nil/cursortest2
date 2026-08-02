package xsna;

import com.ironsource.X3;
import java.util.Arrays;

/* compiled from: _UArrays.kt */
/* loaded from: classes8.dex */
public class tvp0 extends svp0 {
    public static boolean a(short[] sArr, short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    public static boolean b(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    public static boolean c(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    public static boolean d(long[] jArr, long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }

    public static String e(byte[] bArr) {
        String g0;
        return (bArr == null || (g0 = j5g.g0(new vvp0(bArr), ", ", X3.j.d, X3.j.e, 0, null, 56)) == null) ? "null" : g0;
    }

    public static String f(int[] iArr) {
        String g0;
        return (iArr == null || (g0 = j5g.g0(new kxp0(iArr), ", ", X3.j.d, X3.j.e, 0, null, 56)) == null) ? "null" : g0;
    }

    public static String g(short[] sArr) {
        String g0;
        return (sArr == null || (g0 = j5g.g0(new wxp0(sArr), ", ", X3.j.d, X3.j.e, 0, null, 56)) == null) ? "null" : g0;
    }

    public static String h(long[] jArr) {
        String g0;
        return (jArr == null || (g0 = j5g.g0(new pxp0(jArr), ", ", X3.j.d, X3.j.e, 0, null, 56)) == null) ? "null" : g0;
    }
}
