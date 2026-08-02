package defpackage;

import com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
public final class hh1 implements ve1 {
    public static final TinkFipsUtil$AlgorithmFipsCompatibility b = TinkFipsUtil$AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    public final q1w a;

    public hh1(byte[] bArr) {
        if (b.a()) {
            this.a = new q1w(bArr);
        } else {
            kbs.v("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
    }

    @Override // defpackage.ve1
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a = i6i0.a(12);
        q1w q1wVar = this.a;
        boolean z = q1wVar.b;
        if (a.length != 12) {
            kbs.v("iv is wrong size");
            return null;
        }
        if (bArr.length > 2147483619) {
            kbs.v("plaintext too long");
            return null;
        }
        byte[] bArr3 = new byte[z ? bArr.length + 28 : bArr.length + 16];
        if (z) {
            System.arraycopy(a, 0, bArr3, 0, 12);
        }
        AlgorithmParameterSpec a2 = q1w.a(a);
        wc2 wc2Var = q1w.d;
        ((Cipher) wc2Var.get()).init(1, q1wVar.a, a2);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) wc2Var.get()).updateAAD(bArr2);
        }
        int doFinal = ((Cipher) wc2Var.get()).doFinal(bArr, 0, bArr.length, bArr3, z ? 12 : 0);
        if (doFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(oyr.j(doFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
    }

    @Override // defpackage.ve1
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] copyOf = Arrays.copyOf(bArr, 12);
        q1w q1wVar = this.a;
        boolean z = q1wVar.b;
        if (copyOf.length != 12) {
            kbs.v("iv is wrong size");
            return null;
        }
        if (bArr.length < (z ? 28 : 16)) {
            kbs.v("ciphertext too short");
            return null;
        }
        if (z && !ByteBuffer.wrap(copyOf).equals(ByteBuffer.wrap(bArr, 0, 12))) {
            kbs.v("iv does not match prepended iv");
            return null;
        }
        AlgorithmParameterSpec a = q1w.a(copyOf);
        wc2 wc2Var = q1w.d;
        ((Cipher) wc2Var.get()).init(2, q1wVar.a, a);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) wc2Var.get()).updateAAD(bArr2);
        }
        int i = z ? 12 : 0;
        int length = bArr.length;
        if (z) {
            length -= 12;
        }
        return ((Cipher) wc2Var.get()).doFinal(bArr, i, length);
    }
}
