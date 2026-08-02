package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;

/* loaded from: classes8.dex */
public class EllipticCurveSigner extends EllipticCurveProvider implements Signer {
    public EllipticCurveSigner(SignatureAlgorithm signatureAlgorithm, Key key) {
        super(signatureAlgorithm, key);
        if (key instanceof PrivateKey) {
            return;
        }
        throw new InvalidKeyException("Elliptic Curve signatures must be computed using an EC PrivateKey. The specified key of type " + key.getClass().getName() + " is not an EC PrivateKey.");
    }

    public byte[] doSign(byte[] bArr) throws java.security.InvalidKeyException, SignatureException, JwtException {
        PrivateKey privateKey = (PrivateKey) this.key;
        Signature createSignatureInstance = createSignatureInstance();
        createSignatureInstance.initSign(privateKey);
        createSignatureInstance.update(bArr);
        return EllipticCurveProvider.transcodeDERToConcat(createSignatureInstance.sign(), EllipticCurveProvider.getSignatureByteArrayLength(this.alg));
    }

    @Override // io.jsonwebtoken.impl.crypto.Signer
    public byte[] sign(byte[] bArr) {
        try {
            return doSign(bArr);
        } catch (JwtException e) {
            throw new io.jsonwebtoken.security.SignatureException("Unable to convert signature to JOSE format. " + e.getMessage(), e);
        } catch (java.security.InvalidKeyException e2) {
            throw new io.jsonwebtoken.security.SignatureException("Invalid Elliptic Curve PrivateKey. " + e2.getMessage(), e2);
        } catch (SignatureException e3) {
            throw new io.jsonwebtoken.security.SignatureException("Unable to calculate signature using Elliptic Curve PrivateKey. " + e3.getMessage(), e3);
        }
    }
}
