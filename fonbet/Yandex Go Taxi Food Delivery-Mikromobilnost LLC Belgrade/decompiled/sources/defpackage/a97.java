package defpackage;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;

/* loaded from: classes4.dex */
public final class a97 extends FilterInputStream {
    public a97(BufferedInputStream bufferedInputStream) {
        super(bufferedInputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int a = zru0.a(((FilterInputStream) this).in, bArr, i, i2);
        if (a > 0) {
            return a;
        }
        return -1;
    }
}
