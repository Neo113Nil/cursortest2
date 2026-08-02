package defpackage;

import java.io.InputStream;

/* loaded from: classes9.dex */
public final class asu0 {
    public static int a(int i, byte[] bArr, InputStream inputStream) {
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                break;
            }
            i2 += read;
        }
        return i2;
    }
}
