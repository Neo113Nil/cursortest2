package defpackage;

import com.google.crypto.tink.subtle.EllipticCurves$CurveType;
import com.google.crypto.tink.subtle.EllipticCurves$PointFormatType;
import com.yandex.messaging.securepush.KeyNotFoundException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCSP.JCSP;

/* loaded from: classes11.dex */
public final class b1g0 {
    public final w1g0 a;

    public b1g0(w1g0 w1g0Var) {
        this.a = w1g0Var;
    }

    public final byte[] a(String str) {
        byte[] a;
        ECPoint eCPoint;
        ECPoint eCPoint2;
        BigInteger bigInteger;
        byte[] a2 = ew4.a(11, str);
        nj41 nj41Var = new nj41();
        nj41Var.b = (byte[]) this.a.a().clone();
        nj41Var.a = (byte[]) this.a.b().clone();
        w1g0 w1g0Var = this.a;
        synchronized (w1g0Var) {
            if (!w1g0Var.c()) {
                throw new KeyNotFoundException("Push encryption key not initialized");
            }
            a = ew4.a(11, w1g0Var.a.getString("push_private_key", null));
        }
        EllipticCurves$CurveType ellipticCurves$CurveType = mj41.e;
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(new BigInteger(1, a), c5a1.c(ellipticCurves$CurveType));
        s1o s1oVar = s1o.f;
        ECPrivateKey eCPrivateKey = (ECPrivateKey) ((KeyFactory) s1oVar.a.n("EC")).generatePrivate(eCPrivateKeySpec);
        if (eCPrivateKey == null) {
            ny61.g("must set recipient's private key with Builder.withRecipientPrivateKey");
            return null;
        }
        byte[] bArr = nj41Var.a;
        if (bArr == null || bArr.length != 65) {
            ny61.g("recipient public key must have 65 bytes");
            return null;
        }
        byte[] bArr2 = nj41Var.b;
        if (bArr2 == null) {
            ny61.g("must set auth secret with Builder.withAuthSecret");
            return null;
        }
        if (bArr2.length != 16) {
            ny61.g("auth secret must have 16 bytes");
            return null;
        }
        if (a2.length < 103) {
            kbs.v("ciphertext too short");
            return null;
        }
        if (a2.length > 4096) {
            kbs.v("ciphertext too long");
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(a2);
        byte[] bArr3 = new byte[16];
        wrap.get(bArr3);
        int i = wrap.getInt();
        if (i != 4096 || i < a2.length || i > 4096) {
            throw new GeneralSecurityException(oyr.i(i, "invalid record size: "));
        }
        byte b = wrap.get();
        if (b != 65) {
            throw new GeneralSecurityException(oyr.i(b, "invalid ephemeral public key size: "));
        }
        byte[] bArr4 = new byte[65];
        wrap.get(bArr4);
        EllipticCurves$PointFormatType ellipticCurves$PointFormatType = mj41.d;
        EllipticCurve curve = c5a1.c(ellipticCurves$CurveType).getCurve();
        int bitLength = (prn.b(curve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
        int i2 = orn.a[ellipticCurves$PointFormatType.ordinal()];
        boolean z = false;
        try {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        yhl.g(ellipticCurves$PointFormatType, "invalid format:");
                        return null;
                    }
                    BigInteger b2 = prn.b(curve);
                    if (65 != bitLength + 1) {
                        kbs.v("compressed point has wrong length");
                        return null;
                    }
                    byte b3 = bArr4[0];
                    if (b3 != 2) {
                        if (b3 != 3) {
                            kbs.v("invalid format");
                            return null;
                        }
                        z = true;
                    }
                    BigInteger bigInteger2 = new BigInteger(1, Arrays.copyOfRange(bArr4, 1, 65));
                    if (bigInteger2.signum() == -1 || bigInteger2.compareTo(b2) >= 0) {
                        kbs.v("x is out of range");
                        return null;
                    }
                    eCPoint2 = new ECPoint(bigInteger2, c5a1.d(bigInteger2, z, curve));
                    byte[] bArr5 = new byte[a2.length - 86];
                    wrap.get(bArr5);
                    prn.a(eCPoint2, eCPrivateKey.getParams().getCurve());
                    PublicKey generatePublic = ((KeyFactory) s1oVar.a.n("EC")).generatePublic(new ECPublicKeySpec(eCPoint2, eCPrivateKey.getParams()));
                    KeyAgreement keyAgreement = (KeyAgreement) s1o.d.a.n(JCP.ECDH_NAME);
                    keyAgreement.init(eCPrivateKey);
                    keyAgreement.doPhase(generatePublic, true);
                    byte[] generateSecret = keyAgreement.generateSecret();
                    EllipticCurve curve2 = eCPrivateKey.getParams().getCurve();
                    bigInteger = new BigInteger(1, generateSecret);
                    if (bigInteger.signum() != -1 || bigInteger.compareTo(prn.b(curve2)) >= 0) {
                        throw new GeneralSecurityException("shared secret is out of range");
                    }
                    c5a1.d(bigInteger, true, curve2);
                    byte[] b4 = q1b1.b(32, generateSecret, bArr2, ffx.x(mj41.a, bArr, bArr4));
                    byte[] b5 = q1b1.b(16, b4, bArr3, mj41.b);
                    byte[] b6 = q1b1.b(12, b4, bArr3, mj41.c);
                    Cipher cipher = (Cipher) s1o.b.a.n("AES/GCM/NoPadding");
                    cipher.init(2, new SecretKeySpec(b5, JCSP.AES_NAME), new GCMParameterSpec(128, b6));
                    byte[] doFinal = cipher.doFinal(bArr5);
                    if (doFinal.length == 0) {
                        kbs.v("decryption failed");
                        return null;
                    }
                    int length = doFinal.length - 1;
                    while (length > 0 && doFinal[length] == 0) {
                        length--;
                    }
                    if (doFinal[length] == 2) {
                        return Arrays.copyOf(doFinal, length);
                    }
                    kbs.v("decryption failed");
                    return null;
                }
                if (65 != bitLength * 2) {
                    kbs.v("invalid point size");
                    return null;
                }
                eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr4, 0, bitLength)), new BigInteger(1, Arrays.copyOfRange(bArr4, bitLength, 65)));
                prn.a(eCPoint, curve);
            } else {
                if (65 != (bitLength * 2) + 1) {
                    kbs.v("invalid point size");
                    return null;
                }
                if (bArr4[0] != 4) {
                    kbs.v("invalid point format");
                    return null;
                }
                int i3 = bitLength + 1;
                eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr4, 1, i3)), new BigInteger(1, Arrays.copyOfRange(bArr4, i3, 65)));
                prn.a(eCPoint, curve);
            }
            keyAgreement.doPhase(generatePublic, true);
            byte[] generateSecret2 = keyAgreement.generateSecret();
            EllipticCurve curve22 = eCPrivateKey.getParams().getCurve();
            bigInteger = new BigInteger(1, generateSecret2);
            if (bigInteger.signum() != -1) {
            }
            throw new GeneralSecurityException("shared secret is out of range");
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException(e);
        }
        eCPoint2 = eCPoint;
        byte[] bArr52 = new byte[a2.length - 86];
        wrap.get(bArr52);
        prn.a(eCPoint2, eCPrivateKey.getParams().getCurve());
        PublicKey generatePublic2 = ((KeyFactory) s1oVar.a.n("EC")).generatePublic(new ECPublicKeySpec(eCPoint2, eCPrivateKey.getParams()));
        KeyAgreement keyAgreement2 = (KeyAgreement) s1o.d.a.n(JCP.ECDH_NAME);
        keyAgreement2.init(eCPrivateKey);
    }
}
