package xsna;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.AEADBadTagException;

/* compiled from: ChaCha20Poly1305Base.java */
/* loaded from: classes13.dex */
public abstract class uqa implements b51 {
    public final sqa a;
    public final sqa b;

    public uqa(byte[] bArr) throws InvalidKeyException {
        this.a = d(1, bArr);
        this.b = d(0, bArr);
    }

    public static byte[] c(ByteBuffer byteBuffer, byte[] bArr) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int remaining = byteBuffer.remaining();
        int i = remaining % 16;
        int i2 = (i == 0 ? remaining : (remaining + 16) - i) + length;
        ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i2);
        order.putLong(bArr.length);
        order.putLong(remaining);
        return order.array();
    }

    @Override // xsna.b51
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        sqa sqaVar = this.a;
        if (length > 2147483631 - sqaVar.f()) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer allocate = ByteBuffer.allocate(sqaVar.f() + bArr.length + 16);
        if (allocate.remaining() < sqaVar.f() + bArr.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int position = allocate.position();
        sqaVar.e(allocate, bArr);
        allocate.position(position);
        byte[] bArr3 = new byte[sqaVar.f()];
        allocate.get(bArr3);
        allocate.limit(allocate.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr4 = new byte[32];
        this.b.b(0, bArr3).get(bArr4);
        byte[] k = sdy.k(bArr4, c(allocate, bArr2));
        allocate.limit(allocate.limit() + 16);
        allocate.put(k);
        return allocate.array();
    }

    @Override // xsna.b51
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int remaining = wrap.remaining();
        sqa sqaVar = this.a;
        if (remaining < sqaVar.f() + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int position = wrap.position();
        byte[] bArr3 = new byte[16];
        wrap.position(wrap.limit() - 16);
        wrap.get(bArr3);
        wrap.position(position);
        wrap.limit(wrap.limit() - 16);
        byte[] bArr4 = new byte[sqaVar.f()];
        wrap.get(bArr4);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr5 = new byte[32];
            this.b.b(0, bArr4).get(bArr5);
            if (!yfb.f(sdy.k(bArr5, c(wrap, bArr2)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            wrap.position(position);
            return sqaVar.d(wrap);
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    public abstract sqa d(int i, byte[] bArr) throws InvalidKeyException;
}
