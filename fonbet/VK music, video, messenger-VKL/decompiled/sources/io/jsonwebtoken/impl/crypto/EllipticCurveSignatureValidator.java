package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.lang.Assert;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECKey;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import xsna.cqi;

/* loaded from: classes8.dex */
public class EllipticCurveSignatureValidator extends EllipticCurveProvider implements SignatureValidator {
    private static final String DER_ENCODING_SYS_PROPERTY_NAME = "io.jsonwebtoken.impl.crypto.EllipticCurveSignatureValidator.derEncodingSupported";
    private static final String EC_PUBLIC_KEY_REQD_MSG = "Elliptic Curve signature validation requires an ECPublicKey instance.";

    public EllipticCurveSignatureValidator(SignatureAlgorithm signatureAlgorithm, Key key) {
        super(signatureAlgorithm, key);
        Assert.isTrue(key instanceof ECPublicKey, EC_PUBLIC_KEY_REQD_MSG);
    }

    public boolean doVerify(Signature signature, PublicKey publicKey, byte[] bArr, byte[] bArr2) throws InvalidKeyException, SignatureException {
        signature.initVerify(publicKey);
        signature.update(bArr);
        return signature.verify(bArr2);
    }

    @Override // io.jsonwebtoken.impl.crypto.SignatureValidator
    public boolean isValid(byte[] bArr, byte[] bArr2) {
        Signature createSignatureInstance = createSignatureInstance();
        PublicKey publicKey = (PublicKey) this.key;
        try {
            int signatureByteArrayLength = EllipticCurveProvider.getSignatureByteArrayLength(this.alg);
            if (signatureByteArrayLength == bArr2.length) {
                BigInteger order = ((ECKey) publicKey).getParams().getOrder();
                BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr2, 0, this.fieldByteLength));
                BigInteger bigInteger2 = new BigInteger(1, Arrays.copyOfRange(bArr2, this.fieldByteLength, bArr2.length));
                if (bigInteger.signum() >= 1 && bigInteger2.signum() >= 1 && bigInteger.compareTo(order) < 0 && bigInteger2.compareTo(order) < 0) {
                    bArr2 = EllipticCurveProvider.transcodeConcatToDER(bArr2);
                }
                return false;
            }
            if (bArr2[0] != 48 || !"true".equalsIgnoreCase(System.getProperty(DER_ENCODING_SYS_PROPERTY_NAME))) {
                throw new io.jsonwebtoken.security.SignatureException("Provided signature is " + EllipticCurveProvider.byteSizeString(bArr2.length) + " but " + this.alg.name() + " signatures must be exactly " + EllipticCurveProvider.byteSizeString(signatureByteArrayLength) + " per [RFC 7518, Section 3.4 (validation)](https://datatracker.ietf.org/doc/html/rfc7518#section-3.4).");
            }
            return doVerify(createSignatureInstance, publicKey, bArr, bArr2);
        } catch (Exception e) {
            throw new io.jsonwebtoken.security.SignatureException(cqi.b(e, new StringBuilder("Unable to verify Elliptic Curve signature using configured ECPublicKey. ")), e);
        }
    }
}
