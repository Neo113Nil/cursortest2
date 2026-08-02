package xsna;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import one.video.calls.sdk_private.bG;

/* compiled from: Aes128Gcm.java */
/* loaded from: classes8.dex */
public class oby0 extends qby0 {
    @Override // xsna.nby0
    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws one.video.calls.sdk_private.bt {
        if (bArr2.length <= 16) {
            throw new one.video.calls.sdk_private.bt("ciphertext must be longer than 16 bytes");
        }
        SecretKeySpec k = k();
        Cipher l = l();
        try {
            l.init(2, k, new GCMParameterSpec(128, bArr3));
            l.updateAAD(bArr);
            return l.doFinal(bArr2);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException unused) {
            throw new RuntimeException();
        } catch (AEADBadTagException unused2) {
            throw new one.video.calls.sdk_private.bt();
        }
    }

    @Override // xsna.nby0
    public final byte[] b(byte[] bArr) {
        if (this.j == null) {
            try {
                this.j = Cipher.getInstance("AES/ECB/NoPadding");
                this.j.init(1, new SecretKeySpec(this.i, "AES"));
            } catch (InvalidKeyException unused) {
                throw new RuntimeException();
            } catch (NoSuchAlgorithmException e) {
                e = e;
                throw new bG(e);
            } catch (NoSuchPaddingException e2) {
                e = e2;
                throw new bG(e);
            }
        }
        try {
            return this.j.doFinal(bArr);
        } catch (BadPaddingException | IllegalBlockSizeException unused2) {
            throw new RuntimeException();
        }
    }

    @Override // xsna.qby0
    public short h() {
        return (short) 16;
    }

    @Override // xsna.qby0
    public short i() {
        return (short) 32;
    }

    @Override // xsna.qby0
    public m6o0 j() {
        return m6o0.e();
    }

    public final SecretKeySpec k() {
        if (this.o) {
            if (this.l == null) {
                this.l = new SecretKeySpec(this.f, "AES");
            }
            return this.l;
        }
        if (this.k == null) {
            this.k = new SecretKeySpec(this.e, "AES");
        }
        return this.k;
    }

    public final Cipher l() {
        if (this.m == null) {
            try {
                this.m = Cipher.getInstance("AES/GCM/NoPadding");
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new bG(e);
            }
        }
        return this.m;
    }

    @Override // xsna.nby0
    public final byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Cipher l = l();
        try {
            l.init(1, k(), new GCMParameterSpec(128, bArr3));
            l.updateAAD(bArr);
            return l.doFinal(bArr2);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException unused) {
            throw new RuntimeException();
        }
    }
}
