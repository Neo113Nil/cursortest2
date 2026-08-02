package defpackage;

import defpackage.yp6;

/* loaded from: classes4.dex */
public abstract class hk41 {
    public static void a(yp6.a aVar, byte[] bArr) {
        long j;
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = aVar.x;
            int i2 = aVar.y;
            int i3 = aVar.z;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            j = aVar.w;
            if (j == aVar.a.b) {
                ny61.r("no more bytes");
                return;
            }
        } while (aVar.c(j == -1 ? 0L : j + (aVar.z - aVar.y)) != -1);
    }
}
