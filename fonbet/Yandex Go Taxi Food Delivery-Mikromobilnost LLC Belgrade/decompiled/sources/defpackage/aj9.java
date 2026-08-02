package defpackage;

import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCSP.KeyStore.CSPStore;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes9.dex */
public final class aj9 {
    public static final char[] a = new char[HProv.PP_NK_SYNC];
    public static final byte[] b = new byte[HProv.PP_DELETE_SAVED_PASSWD];

    static {
        for (int i = 0; i < 32; i++) {
        }
        a('b', 8);
        a('t', 9);
        a('n', 10);
        a('f', 12);
        a('r', 13);
        a('/', 47);
        a(OpenList.CHAR_QUOTE, 34);
        a(CSPStore.UNIQUE_SEPARATOR, 92);
        byte[] bArr = b;
        for (int i2 = 0; i2 < 33; i2++) {
            bArr[i2] = Byte.MAX_VALUE;
        }
        bArr[9] = 3;
        bArr[10] = 3;
        bArr[13] = 3;
        bArr[32] = 3;
        bArr[44] = 4;
        bArr[58] = 5;
        bArr[123] = 6;
        bArr[125] = 7;
        bArr[91] = 8;
        bArr[93] = 9;
        bArr[34] = 1;
        bArr[92] = 2;
    }

    public static void a(char c, int i) {
        if (c != 'u') {
            a[c] = (char) i;
        }
    }
}
