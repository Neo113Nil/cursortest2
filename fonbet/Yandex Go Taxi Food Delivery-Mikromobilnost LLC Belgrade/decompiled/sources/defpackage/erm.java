package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

/* loaded from: classes4.dex */
public abstract class erm {
    public final int a;
    public final Object b;

    public erm(byte[] bArr, int i) {
        if (bArr.length != 32) {
            dy31.v("The key length in bytes must be 32.");
            throw null;
        }
        this.b = d89.c(bArr);
        this.a = i;
    }

    public ByteBuffer a(int i, byte[] bArr) {
        int[] b = b(i, d89.c(bArr));
        int[] iArr = (int[]) b.clone();
        d89.b(iArr);
        for (int i2 = 0; i2 < b.length; i2++) {
            b[i2] = b[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b, 0, 16);
        return order;
    }

    public abstract int[] b(int i, int[] iArr);

    public abstract int c();

    public void d(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length != c()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + c());
        }
        int remaining = byteBuffer2.remaining();
        int i = remaining / 64;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer a = a(this.a + i3, bArr);
            if (i3 == i) {
                ffx.i0(byteBuffer, byteBuffer2, a, remaining % 64);
            } else {
                ffx.i0(byteBuffer, byteBuffer2, a, 64);
            }
        }
    }

    public erm(kk2 kk2Var, int i) {
        this.b = kk2Var;
        this.a = i;
    }
}
