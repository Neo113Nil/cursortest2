package xsna;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import one.video.calls.sdk_private.bG;

/* compiled from: ChaCha20.java */
/* loaded from: classes8.dex */
public final class rby0 extends qby0 {
    @Override // xsna.nby0
    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws one.video.calls.sdk_private.bt {
        try {
            Cipher l = l();
            l.init(2, k(), new IvParameterSpec(bArr3));
            l.updateAAD(bArr);
            return l.doFinal(bArr2);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException unused) {
            throw new RuntimeException();
        } catch (AEADBadTagException unused2) {
            throw new one.video.calls.sdk_private.bt();
        }
    }

    @Override // xsna.nby0
    public final byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            Cipher l = l();
            l.init(1, k(), new IvParameterSpec(bArr3));
            l.updateAAD(bArr);
            return l.doFinal(bArr2);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException unused) {
            throw new RuntimeException();
        }
    }

    @Override // xsna.qby0
    public final short h() {
        return (short) 32;
    }

    @Override // xsna.qby0
    public final short i() {
        return (short) 32;
    }

    @Override // xsna.qby0
    public final m6o0 j() {
        return m6o0.e();
    }

    public final SecretKeySpec k() {
        if (this.o) {
            if (this.l == null) {
                this.l = new SecretKeySpec(this.f, "ChaCha20-Poly1305");
            }
            return this.l;
        }
        if (this.k == null) {
            this.k = new SecretKeySpec(this.e, "ChaCha20-Poly1305");
        }
        return this.k;
    }

    public final Cipher l() {
        if (this.m == null) {
            try {
                this.m = Cipher.getInstance("ChaCha20-Poly1305");
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new bG(e);
            }
        }
        return this.m;
    }

    @Override // xsna.nby0
    public final byte[] b(byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance("ChaCha20");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 4, 16);
            int i = ByteBuffer.wrap(new byte[]{bArr[3], bArr[2], bArr[1], bArr[0]}).getInt();
            e2p.b();
            cipher.init(1, (Key) new SecretKeySpec(this.i, "ChaCha20"), (AlgorithmParameterSpec) d2p.b(i, copyOfRange));
            return cipher.doFinal(new byte[]{0, 0, 0, 0, 0});
        } catch (InvalidAlgorithmParameterException unused) {
            throw new RuntimeException();
        } catch (InvalidKeyException unused2) {
            throw new RuntimeException();
        } catch (NoSuchAlgorithmException e) {
            e = e;
            throw new bG(e);
        } catch (BadPaddingException unused3) {
            throw new RuntimeException();
        } catch (IllegalBlockSizeException unused4) {
            throw new RuntimeException();
        } catch (NoSuchPaddingException e2) {
            e = e2;
            throw new bG(e);
        }
    }
}
