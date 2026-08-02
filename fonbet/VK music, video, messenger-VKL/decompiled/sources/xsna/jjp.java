package xsna;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: EncryptThenAuthenticate.java */
/* loaded from: classes13.dex */
public final class jjp implements b51 {
    public final jtw a;
    public final dc00 b;
    public final int c;

    public jjp(jtw jtwVar, dc00 dc00Var, int i) {
        this.a = jtwVar;
        this.b = dc00Var;
        this.c = i;
    }

    @Override // xsna.b51
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] encrypt = this.a.encrypt(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return yfb.e(encrypt, this.b.b(yfb.e(bArr2, encrypt, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // xsna.b51
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.c;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.b.a(copyOfRange2, yfb.e(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        return this.a.a(copyOfRange);
    }
}
