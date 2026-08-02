package xsna;

import java.io.EOFException;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* compiled from: DecoderImpl.java */
/* loaded from: classes8.dex */
public final class hqy0 {
    public final pqy0 b = new pqy0();
    public final oqy0 a = new oqy0();
    public final ArrayList c = new ArrayList();

    public static long a(int i, PushbackInputStream pushbackInputStream) throws IOException {
        int pow = (int) (Math.pow(2.0d, i) - 1.0d);
        int d = d(pushbackInputStream) & pow;
        if (d < pow) {
            return d;
        }
        long j = d;
        int i2 = 0;
        do {
            j += (r2 & Byte.MAX_VALUE) << i2;
            i2 += 7;
        } while ((d(pushbackInputStream) & 128) == 128);
        return j;
    }

    public static void c(PushbackInputStream pushbackInputStream, byte[] bArr) throws IOException {
        int length = bArr.length;
        if (length < 0 || length > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i = 0;
        while (i < length) {
            int read = pushbackInputStream.read(bArr, i, length - i);
            if (read < 0) {
                break;
            } else {
                i += read;
            }
        }
        if (i != bArr.length) {
            throw new EOFException();
        }
    }

    public static byte d(PushbackInputStream pushbackInputStream) throws IOException {
        int read = pushbackInputStream.read();
        if (read != -1) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public final String b(PushbackInputStream pushbackInputStream) throws IOException {
        byte d = d(pushbackInputStream);
        pushbackInputStream.unread(d);
        boolean z = (d & 128) == 128;
        byte[] bArr = new byte[(int) a(7, pushbackInputStream)];
        c(pushbackInputStream, bArr);
        if (!z) {
            return new String(bArr, StandardCharsets.ISO_8859_1);
        }
        this.a.getClass();
        return oqy0.a(bArr);
    }
}
