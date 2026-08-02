package xsna;

import xsna.vl8;

/* compiled from: WebSocketProtocol.kt */
/* loaded from: classes8.dex */
public final class vhx0 {
    public static void a(vl8.c cVar, byte[] bArr) {
        long j;
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = cVar.f;
            int i2 = cVar.g;
            int i3 = cVar.h;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            j = cVar.e;
            if (j == cVar.b.c) {
                throw new IllegalStateException("no more bytes");
            }
        } while (cVar.i(j == -1 ? 0L : j + (cVar.h - cVar.g)) != -1);
    }
}
