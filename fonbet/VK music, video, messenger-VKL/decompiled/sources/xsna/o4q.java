package xsna;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: ExifAttribute.java */
/* loaded from: classes11.dex */
public final class o4q {
    public static final Charset d = StandardCharsets.US_ASCII;
    public static final String[] e = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] f = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public final int a;
    public final int b;
    public final byte[] c;

    public o4q(int i, int i2, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    @NonNull
    public static o4q a(long j, @NonNull ByteOrder byteOrder) {
        return b(new long[]{j}, byteOrder);
    }

    @NonNull
    public static o4q b(@NonNull long[] jArr, @NonNull ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new o4q(4, jArr.length, wrap.array());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(e[this.a]);
        sb.append(", data length:");
        return h5s.c(this.c.length, ")", sb);
    }
}
