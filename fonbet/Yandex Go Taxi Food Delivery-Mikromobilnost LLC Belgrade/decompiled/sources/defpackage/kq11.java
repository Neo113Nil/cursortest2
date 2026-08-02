package defpackage;

import java.util.Arrays;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public class kq11 extends jq11 {
    public static boolean a(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    public static boolean b(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    public static boolean c(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    public static boolean d(long[] jArr, long[] jArr2) {
        return Arrays.equals(jArr, jArr2);
    }

    public static String e(byte[] bArr) {
        return a.X(new nq11(bArr), Extension.FIX_SPACE, "[", "]", null, 56);
    }

    public static String f(int[] iArr) {
        return a.X(new uq11(iArr), Extension.FIX_SPACE, "[", "]", null, 56);
    }

    public static String g(short[] sArr) {
        return a.X(new qr11(sArr), Extension.FIX_SPACE, "[", "]", null, 56);
    }

    public static String h(long[] jArr) {
        return a.X(new zq11(jArr), Extension.FIX_SPACE, "[", "]", null, 56);
    }
}
